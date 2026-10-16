package defpackage;

/* loaded from: classes3.dex */
public final class xry {
    public Float a;
    public Float b;
    public float[] c;
    public float[] d;
    public float e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;

    public xry(xqu xquVar) {
        this.a = xquVar.b;
        this.b = xquVar.c;
        this.c = xquVar.d;
        this.f = xquVar.e;
        this.g = xquVar.f;
        this.d = xquVar.g;
        this.h = xquVar.j;
        this.i = xquVar.i;
        this.j = xquVar.h;
        this.e = xquVar.k;
    }

    public final xqu a() {
        return new xqu(this.a, this.b, this.c, this.f, this.g, this.d, this.j, this.i, this.h, this.e, 259);
    }

    public final void b() {
        this.h = true;
    }

    public final void c() {
        this.j = true;
        this.i = true;
    }

    public xry() {
        this((byte[]) null);
    }

    public /* synthetic */ xry(byte[] bArr) {
        this(new xqu());
    }
}
