class IntegerToRoman {
    fun main() {
        println(" intToRomanNumber ${intToRomanNumber(99)}")
    }

    fun intToRomanNumber(num: Int): String {
        var result: String = "";
        //  values in map to be given in descending order ( else it will return result from the lower roman literal)
        val intToRomanMap = listOf(
            1000 to "M",900 to "CM" ,500 to "D", 400 to "CD", 100 to "C", 90 to "XC", 50 to "L", 40 to "XL", 10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I"
        )

        var numTemp = num

        for ((value, romannumber) in intToRomanMap) {
            while (numTemp >= value) {
                result += romannumber
                numTemp -= value;
            }
        }

        return result;
    }

    fun romanToInt(s: String): Int {
        var ans = 0
        var num = 0
        for (i in s.length - 1 downTo 0) {
            when (s[i]) {
                'I' -> num = 1
                'V' -> num = 5
                'X' -> num = 10
                'L' -> num = 50
                'C' -> num = 100
                'D' -> num = 500
                'M' -> num = 1000
            }
            if (4 * num < ans) ans -= num else ans += num
        }
        return ans
    }


}


