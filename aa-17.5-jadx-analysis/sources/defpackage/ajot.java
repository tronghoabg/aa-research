package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ajot {
    int a;
    byte[] b;
    public int c;
    int d;
    boolean e;
    int f;
    int g;

    public final String toString() {
        return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.b), Integer.valueOf(this.f), Boolean.valueOf(this.e), Integer.valueOf(this.a), 0L, Integer.valueOf(this.g), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
