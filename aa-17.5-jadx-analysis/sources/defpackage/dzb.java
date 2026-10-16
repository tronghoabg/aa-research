package defpackage;

/* loaded from: classes2.dex */
final class dzb {
    private static final byte[] e = new byte[1792];
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public dzb(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
    }

    public static byte b(char c) {
        return c < 1792 ? e[c] : Character.getDirectionality(c);
    }

    final byte a() {
        int i = this.c - 1;
        CharSequence charSequence = this.a;
        char cCharAt = charSequence.charAt(i);
        this.d = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i2 = this.c;
        if (!zIsLowSurrogate) {
            this.c = i2 - 1;
            return b(this.d);
        }
        int iCodePointBefore = Character.codePointBefore(charSequence, i2);
        this.c -= Character.charCount(iCodePointBefore);
        return Character.getDirectionality(iCodePointBefore);
    }
}
