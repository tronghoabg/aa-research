package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class adkp {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final ytq b = admc.c;

    public static adlx a(String str, adko adkoVar) {
        char cCharAt = str.charAt(0);
        int i = adlx.d;
        return new adma(str, cCharAt == ':', adkoVar);
    }
}
