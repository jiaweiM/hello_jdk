



# 格式化
包括数字、货币、日期、时间和文本的格式化问题解释。

## 数字格式化
`java.text.NumberFormat` 类使用指定的 `Locale` 格式化数字。

### 创建 NumberFormat


|字符|含义|
|---|---|
|0|数字|
|#|数字，0不显示|
|`.`|小数点占位符|
|,|分组分隔符|
|E|分隔指数计数法中的指数和尾数|
|