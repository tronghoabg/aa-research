package defpackage;

/* loaded from: classes3.dex */
public final class ukm {
    public int a;
    public int b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public byte g = -1;
    private int h;
    private int i;

    public ukm(ukn uknVar) {
        this.a = uknVar.b;
        this.b = uknVar.c;
        this.h = uknVar.d;
        this.c = uknVar.e;
        this.d = uknVar.f;
        this.e = uknVar.g;
        this.i = uknVar.h;
        this.f = uknVar.i;
    }

    public final ukn a() {
        if (this.g == -1) {
            return new ukn(this.a, this.b, this.h, this.c, this.d, this.e, this.i, this.f);
        }
        throw new IllegalStateException();
    }

    public final void b(int i) {
        this.i = i;
        this.g = (byte) (this.g | 64);
    }

    public final void c(int i) {
        this.h = i;
        this.g = (byte) (this.g | 4);
    }
}
