package ru.karvozavr.plugin.anticopypaste

import com.intellij.psi.PsiElement

data class ASTInfoData(val declarations: Int, val usages: Int, val exceptions: Int) {

    fun toArray(): Array<String> {
        return arrayOf("Declarations: $declarations", "Usages: $usages", "Exceptions: $exceptions")
    }
}

data class ASTInfoModel(val psiElements: List<PsiElement>, val infoData: ASTInfoData)