import junit.framework.Assert.assertEquals
import org.junit.Test

class NumberConversionTest {

    @Test
    fun convertNumberToRomainInvaldConversion()
    {
        val converter = IntegerToRoman()

        val testCases = mapOf(
            100 to "C",
            50 to "X",
        )

        for ((input, expected) in testCases) {
            val actual = converter.intToRomanNumber(input)
            assertEquals("Conversion for input: $input", expected, actual)
        }
    }

    @Test
    fun convertNumberToRomainTest2ValidConversion()
    {
        val converter = IntegerToRoman()

        val testCases = mapOf(
            100 to "C",
            50 to "L",
        )

        for ((input, expected) in testCases) {
            val actual = converter.intToRomanNumber(input)
            assertEquals("Conversion for input: $input", expected, actual)
        }
    }

    @Test
    fun convertNumberToRomain3000Fail()
    {
        val converter = IntegerToRoman()

        val testCases = mapOf(
            3000 to "M"
        )

        for ((input, expected) in testCases) {
            val actual = converter.intToRomanNumber(input)
            assertEquals("Conversion for input: $input", expected, actual)
        }
    }

    @Test
    fun convertNumberToRomain3000Pass()
    {
        val converter = IntegerToRoman()

        val testCases = mapOf(
            3000 to "MMM"
        )

        for ((input, expected) in testCases) {
            val actual = converter.intToRomanNumber(input)
            assertEquals("Conversion for input: $input", expected, actual)
        }
    }

    @Test
    fun convertRomainToNumber()
    {
        val converter = IntegerToRoman()
        val inputs = arrayOf("III", "IV", "IX", "LVII", "MMM")
        val expectedOutputs = intArrayOf(3, 4, 9, 58, 3000)

        for (i in inputs.indices) {
            val result = converter.romanToInt(inputs[i])
            println("Input: ${inputs[i]}, Expected: ${expectedOutputs[i]}, Result: $result")
            if (result == expectedOutputs[i]) {
                println("Test case ${i + 1} PASSED")
            } else {
                println("Test case ${i + 1} FAILED")
            }
            println("--------------------------------------")
        }
    }

}