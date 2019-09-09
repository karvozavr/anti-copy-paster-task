package ru.karvozavr.plugin.anticopypaste.services

import com.intellij.codeInsight.editorActions.CopyPastePreProcessor
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.RawText
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.intellij.psi.PsiFile

class AlertOnCopyPaste : CopyPastePreProcessor {

    override fun preprocessOnPaste(project: Project?, file: PsiFile?, editor: Editor?, text: String?, rawText: RawText?): String {
        Messages.showMessageDialog("Копипаста — зло!", "Копипаста — зло!", Messages.getWarningIcon())
        return text ?: ""
    }

    override fun preprocessOnCopy(file: PsiFile?, startOffsets: IntArray?, endOffsets: IntArray?, text: String?): String? {
        return null
    }
}