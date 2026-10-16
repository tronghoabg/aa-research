package defpackage;

/* loaded from: classes3.dex */
abstract class uwr {
    protected final int a;
    public final int b;
    public final int c;

    public uwr(int i, int i2, int i3, int i4) {
        woy.T(i4 % i2 == 0, "Misaligned data; vertices are %s bytes but data is %s-byte aligned", i4, i2);
        woy.Q(i4 % 4 == 0, "Vertex size must be a multiple of integer size; got %s", i4);
        int i5 = i * i2;
        int i6 = i3 * i4;
        if (i5 < i6) {
            throw new IllegalArgumentException(a.br(i4, i3, i5, "Byte capacity ", ", count ", ", size in bytes "));
        }
        this.b = i3;
        this.c = i4;
        this.a = i6 / i2;
    }

    public abstract uue a(uud uudVar, String str);

    public abstract uue b(uud uudVar, String str, utz utzVar, int i);
}
