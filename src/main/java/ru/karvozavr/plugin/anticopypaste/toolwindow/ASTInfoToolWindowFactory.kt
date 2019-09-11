package ru.karvozavr.plugin.anticopypaste.toolwindow

import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory
import ru.karvozavr.plugin.anticopypaste.services.AstInfoService

class ASTInfoToolWindowFactory : ToolWindowFactory {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val astInfoToolWindow = ASTInfoToolWindow(toolWindow)
        val contextExtractorService = ServiceManager.getService(project, AstInfoService::class.java)
        contextExtractorService?.registerASTInfoToolWindow(astInfoToolWindow)

        val contentFactory = ContentFactory.SERVICE.getInstance()
        val content = contentFactory.createContent(astInfoToolWindow.getToolWindowContent(), "", false)
        toolWindow.contentManager.addContent(content)
    }
}