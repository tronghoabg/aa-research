package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dzi {
    private static final byte[] e = new byte[1792];
    public final java.lang.CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = java.lang.Character.getDirectionality(i);
        }
    }

    public dzi(java.lang.CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
    }

    public static byte b(char c) {
        return c < 1792 ? e[c] : java.lang.Character.getDirectionality(c);
    }

    final byte a() {
        int i = this.c - 1;
        java.lang.CharSequence charSequence = this.a;
        char cCharAt = charSequence.charAt(i);
        this.d = cCharAt;
        boolean zIsLowSurrogate = java.lang.Character.isLowSurrogate(cCharAt);
        int i2 = this.c;
        if (!zIsLowSurrogate) {
            this.c = i2 - 1;
            return b(this.d);
        }
        int iCodePointBefore = java.lang.Character.codePointBefore(charSequence, i2);
        this.c -= java.lang.Character.charCount(iCodePointBefore);
        return java.lang.Character.getDirectionality(iCodePointBefore);
    }
}
