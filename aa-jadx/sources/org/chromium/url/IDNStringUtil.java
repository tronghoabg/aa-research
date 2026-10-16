package org.chromium.url;

/* JADX INFO: loaded from: classes2.dex */
@internal.org.jni_zero.JNINamespace("url::android")
public final class IDNStringUtil {
    private static final android.icu.text.IDNA a;

    static {
        android.icu.text.IDNA uTS46Instance = android.icu.text.IDNA.getUTS46Instance(48);
        if (uTS46Instance == null) {
            throw new java.lang.IllegalStateException("Failed to create IDNA instance");
        }
        a = uTS46Instance;
    }

    public static java.lang.String a(java.lang.String str) {
        android.icu.text.IDNA idna = a;
        if (idna == null) {
            return java.net.IDN.toASCII(str, 2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        android.icu.text.IDNA.Info info = new android.icu.text.IDNA.Info();
        idna.nameToASCII(str, sb, info);
        if (!info.hasErrors()) {
            java.lang.String string = sb.toString();
            java.net.IDN.toASCII(string, 2);
            return string;
        }
        j$.util.StringJoiner stringJoiner = new j$.util.StringJoiner(", ");
        java.util.Iterator it = info.getErrors().iterator();
        while (it.hasNext()) {
            stringJoiner.add(defpackage.ll$$ExternalSyntheticApiModelOutline0.m(it.next()).toString());
        }
        throw new java.lang.IllegalArgumentException("Failed to convert IDN to ASCII: ".concat(stringJoiner.toString()));
    }

    private static java.lang.String nativeIdnToASCII(java.lang.String str) {
        try {
            return a(str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
