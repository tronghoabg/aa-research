package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes3.dex */
public final class acjm {
    public static final Charset a;
    private static final Charset b = Charset.defaultCharset();
    private static final Charset c;

    static {
        Charset charsetForName;
        Charset charsetForName2 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        a = charsetForName;
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
        }
        try {
            charsetForName2 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        c = charsetForName2;
        Charset charset = a;
        if ((charset == null || !charset.equals(b)) && charsetForName2 != null) {
            charsetForName2.equals(b);
        }
    }
}
