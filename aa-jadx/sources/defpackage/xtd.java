package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xtd {
    public java.lang.Float a;
    public java.lang.Float b;
    public float[] c;
    public float[] d;
    public float e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;
    private java.lang.String k;

    public xtd(defpackage.xry xryVar) {
        this.a = xryVar.b;
        this.b = xryVar.c;
        this.c = xryVar.d;
        this.f = xryVar.e;
        this.g = xryVar.f;
        this.d = xryVar.g;
        this.h = xryVar.j;
        this.i = xryVar.i;
        this.j = xryVar.h;
        this.e = xryVar.k;
        this.k = xryVar.l;
    }

    public final defpackage.xry a() {
        return new defpackage.xry(this.a, this.b, this.c, this.f, this.g, this.d, this.j, this.i, this.h, this.e, this.k, 259);
    }

    public final void b() {
        this.h = true;
    }

    public final void c() {
        this.j = true;
        this.i = true;
    }

    public xtd() {
        this((byte[]) null);
    }

    public /* synthetic */ xtd(byte[] bArr) {
        this(new defpackage.xry());
    }
}
