package com.bytedance.adsdk.uef.oa.lw;

/* loaded from: classes.dex */
public class uef {
    public static boolean moa(char c10) {
        return '+' == c10 || '-' == c10 || '*' == c10 || '/' == c10 || '%' == c10 || '=' == c10 || '>' == c10 || '<' == c10 || '!' == c10 || '&' == c10 || '|' == c10 || '?' == c10 || ':' == c10;
    }

    public static boolean oa(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean uef(char c10) {
        return c10 == ' ';
    }

    public static boolean yo(char c10) {
        return c10 >= '0' && c10 <= '9';
    }
}
