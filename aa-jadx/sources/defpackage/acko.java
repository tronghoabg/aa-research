package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acko {
    public static final java.nio.charset.Charset a;
    private static final java.nio.charset.Charset b = java.nio.charset.Charset.defaultCharset();
    private static final java.nio.charset.Charset c;

    static {
        java.nio.charset.Charset charsetForName;
        java.nio.charset.Charset charsetForName2 = null;
        try {
            charsetForName = java.nio.charset.Charset.forName("SJIS");
        } catch (java.nio.charset.UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        a = charsetForName;
        try {
            java.nio.charset.Charset.forName("GB2312");
        } catch (java.nio.charset.UnsupportedCharsetException unused2) {
        }
        try {
            charsetForName2 = java.nio.charset.Charset.forName("EUC_JP");
        } catch (java.nio.charset.UnsupportedCharsetException unused3) {
        }
        c = charsetForName2;
        java.nio.charset.Charset charset = a;
        if ((charset == null || !charset.equals(b)) && charsetForName2 != null) {
            charsetForName2.equals(b);
        }
    }
}
