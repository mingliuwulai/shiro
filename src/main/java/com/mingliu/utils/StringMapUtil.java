package com.mingliu.utils;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.utils
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 15:13
 * @UpdateUser: mingliu
 */
public class StringMapUtil {
    /** 下划线转驼峰
     *       user_name  ---->  userName
     * house.user_name  ---->  userName
     *        userName   --->  userName
     * @param underlineName 带有下划线的名字
     * @return 驼峰字符串
     */
    public static String underlineToHump(String underlineName) {
        //截取下划线分成数组
        char[] charArray = underlineName.toCharArray();
        //判断上次循环的字符是否是"_"
        boolean underlineBefore = false;
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < charArray.length; i++) {
            //判断当前字符是否是"_",如果跳出本次循环
            if (charArray[i] == 95) {
                underlineBefore = true;
            } else if (underlineBefore) {
                //如果为true，代表上次的字符是"_",当前字符需要转成大写
                buffer.append(charArray[i] -= 32);
                underlineBefore = false;
            } else { //不是"_"后的字符就直接追加
                buffer.append(charArray[i]);
            }
        }
        return buffer.toString();
    }
}
