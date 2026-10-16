package defpackage;

/* loaded from: classes.dex */
public final class tdi {
    public final String a;
    public final int b;
    public final byte c;
    public final byte d;
    public final short e;

    public tdi(int i, String str, int i2) {
        this.a = str;
        this.b = i2;
        this.c = (byte) ((i >> 24) & 255);
        this.d = (byte) ((i >> 16) & 255);
        this.e = (short) ((char) i);
    }
}
