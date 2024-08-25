package com.isranascimento.gymtwin

import org.apache.poi.ss.usermodel.WorkbookFactory
import org.junit.Test

class MainActivityTest {
    @Test
    fun openWorksheet() {
        val inputStream = this::class.java.classLoader?.getResourceAsStream("twin.xlsx")
        val workbook = WorkbookFactory.create(inputStream)

        val workSheet = workbook.getSheetAt(0)
        workSheet.getRow(0).getCell(0).stringCellValue

        assert(true)
    }
}