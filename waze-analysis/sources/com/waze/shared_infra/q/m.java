package com.waze.shared_infra.q;

import h.g.b.x;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.MissingFormatWidthException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class m {
    public /* synthetic */ m(byte[] bArr) {
    }

    public static n a(boolean z) {
        o oVar = new o();
        if (z) {
            oVar.c();
        }
        return oVar;
    }

    public static com.waze.shared_infra.i.e b() {
        Object value = com.waze.shared_infra.r.n.f37980b.getValue();
        x.e(value, "getValue(...)");
        return (com.waze.shared_infra.i.e) value;
    }

    public static String c(String str, float f2) {
        MissingFormatWidthException e2;
        String str2;
        try {
            str2 = String.format("%" + h(str) + "." + g(str) + "f", Float.valueOf(f2));
            try {
                return str.indexOf(44) != -1 ? str2.replace('.', ',') : str2;
            } catch (MissingFormatWidthException e3) {
                e2 = e3;
                com.waze.shared_infra.i.h.c(String.format("Failed toFormatPrice format=%s, e=%s", str, e2.getMessage()));
                return str2;
            }
        } catch (MissingFormatWidthException e4) {
            e2 = e4;
            str2 = null;
        }
    }

    public static String d(double d2, String str) {
        if (str == null) {
            com.waze.shared_infra.i.h.k("CurrencyUtils", "null currency code");
            return "";
        }
        try {
            Currency currency = Currency.getInstance(str);
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            currencyInstance.setCurrency(currency);
            return currencyInstance.format(d2);
        } catch (IllegalArgumentException unused) {
            com.waze.shared_infra.i.h.d("CurrencyUtils", String.format("Failed to get currency instance, currencyCode=%s", str));
            return "";
        }
    }

    public static String e(String str, float f2) {
        String str2 = String.format("%." + g(str) + "f", Float.valueOf(f2));
        return str.indexOf(44) != -1 ? str2.replace('.', ',') : str2;
    }

    public static String f(String str, float f2) {
        MissingFormatWidthException e2;
        String str2;
        try {
            str2 = String.format("%" + h(str) + "." + g(str) + "f", Float.valueOf(f2));
            try {
                return str.indexOf(44) != -1 ? str2.replace('.', ',') : str2;
            } catch (MissingFormatWidthException e3) {
                e2 = e3;
                com.waze.shared_infra.i.h.c(String.format("failed to padWithZeroes %s %s", str, e2.getMessage()));
                return str2;
            }
        } catch (MissingFormatWidthException e4) {
            e2 = e4;
            str2 = null;
        }
    }

    private static int g(String str) {
        int iIndexOf = str.indexOf(46);
        if (iIndexOf == -1 && (iIndexOf = str.indexOf(44)) == -1) {
            return 0;
        }
        int length = str.length();
        return (length - iIndexOf) - 1;
    }

    private static int h(String str) {
        int iIndexOf = str.indexOf(46);
        return (iIndexOf == -1 && (iIndexOf = str.indexOf(44)) == -1) ? str.length() : iIndexOf;
    }

    private m() {
        throw null;
    }
}
