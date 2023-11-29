import junit.framework.Assert.assertEquals
import org.junit.Test

class NumberConversionTest {

    @Test
    fun convertNumberToRomain()
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
}