##1. Lab8. - src/main/javaopt/lab8
##2. Lab7 - src/main/javaopt/lab7

Самый быстрый метод - посимвольная поверка числа isDigitCheck

Результат замеров: 

```
Benchmark                                         (src)    Mode      Cnt         Score        Error  Units
TimeMeasure.isDigitCheck                           8767   thrpt       25   9967418,368 ±  44986,766  ops/s
TimeMeasure.isDigitCheck                         65sdds   thrpt       25  13244939,785 ±  28815,576  ops/s
TimeMeasure.parseIntCheck                          8767   thrpt       25   6692207,678 ± 204902,558  ops/s
TimeMeasure.parseIntCheck                        65sdds   thrpt       25    162300,705 ±   8107,526  ops/s
TimeMeasure.regCheck                               8767   thrpt       25    561602,019 ±  82828,295  ops/s
TimeMeasure.regCheck                             65sdds   thrpt       25    579819,325 ±  23829,624  ops/s
TimeMeasure.isDigitCheck                           8767    avgt       25        ≈ 10⁻⁷                s/op
TimeMeasure.isDigitCheck                         65sdds    avgt       25        ≈ 10⁻⁷                s/op
TimeMeasure.parseIntCheck                          8767    avgt       25        ≈ 10⁻⁷                s/op
TimeMeasure.parseIntCheck                        65sdds    avgt       25        ≈ 10⁻⁵                s/op
TimeMeasure.regCheck                               8767    avgt       25        ≈ 10⁻⁶                s/op
TimeMeasure.regCheck                             65sdds    avgt       25        ≈ 10⁻⁶                s/op
TimeMeasure.isDigitCheck                           8767  sample  8521473        ≈ 10⁻⁷                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.00        8767  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.50        8767  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.90        8767  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.95        8767  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.99        8767  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.999       8767  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.9999      8767  sample                 ≈ 10⁻⁵                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p1.00        8767  sample                  0,009                s/op
TimeMeasure.isDigitCheck                         65sdds  sample  7116609        ≈ 10⁻⁷                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.00      65sdds  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.50      65sdds  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.90      65sdds  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.95      65sdds  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.99      65sdds  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.999     65sdds  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p0.9999    65sdds  sample                 ≈ 10⁻⁴                s/op
TimeMeasure.isDigitCheck:isDigitCheck·p1.00      65sdds  sample                  0,034                s/op
TimeMeasure.parseIntCheck                          8767  sample  6242476        ≈ 10⁻⁷                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.00      8767  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.50      8767  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.90      8767  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.95      8767  sample                 ≈ 10⁻⁷                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.99      8767  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.999     8767  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.9999    8767  sample                 ≈ 10⁻⁵                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p1.00      8767  sample                  0,004                s/op
TimeMeasure.parseIntCheck                        65sdds  sample  5130063        ≈ 10⁻⁵                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.00    65sdds  sample                 ≈ 10⁻⁵                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.50    65sdds  sample                 ≈ 10⁻⁵                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.90    65sdds  sample                 ≈ 10⁻⁵                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.95    65sdds  sample                 ≈ 10⁻⁵                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.99    65sdds  sample                 ≈ 10⁻⁵                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.999   65sdds  sample                 ≈ 10⁻³                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p0.9999  65sdds  sample                  0,001                s/op
TimeMeasure.parseIntCheck:parseIntCheck·p1.00    65sdds  sample                  0,026                s/op
TimeMeasure.regCheck                               8767  sample  5513259        ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.00                8767  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.50                8767  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.90                8767  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.95                8767  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.99                8767  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.999               8767  sample                 ≈ 10⁻³                s/op
TimeMeasure.regCheck:regCheck·p0.9999              8767  sample                  0,001                s/op
TimeMeasure.regCheck:regCheck·p1.00                8767  sample                  0,010                s/op
TimeMeasure.regCheck                             65sdds  sample  9386236        ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.00              65sdds  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.50              65sdds  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.90              65sdds  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.95              65sdds  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.99              65sdds  sample                 ≈ 10⁻⁶                s/op
TimeMeasure.regCheck:regCheck·p0.999             65sdds  sample                 ≈ 10⁻⁴                s/op
TimeMeasure.regCheck:regCheck·p0.9999            65sdds  sample                 ≈ 10⁻³                s/op
TimeMeasure.regCheck:regCheck·p1.00              65sdds  sample                  0,009                s/op
TimeMeasure.isDigitCheck                           8767      ss       25        ≈ 10⁻⁵                s/op
TimeMeasure.isDigitCheck                         65sdds      ss       25        ≈ 10⁻⁵                s/op
TimeMeasure.parseIntCheck                          8767      ss       25        ≈ 10⁻⁵                s/op
TimeMeasure.parseIntCheck                        65sdds      ss       25        ≈ 10⁻⁴                s/op
TimeMeasure.regCheck                               8767      ss       25        ≈ 10⁻⁴                s/op
TimeMeasure.regCheck                             65sdds      ss       25        ≈ 10⁻⁴                s/op
```