package ru.karvozavr.plugin.anticopypaste.services

import com.intellij.psi.PsiElement
import ru.karvozavr.plugin.anticopypaste.toolwindow.ASTInfoToolWindow

interface AstInfoService {

    fun registerASTInfoToolWindow(window: ASTInfoToolWindow)

    fun astInfoBySelection(beginElement: PsiElement, endElement: PsiElement)
}