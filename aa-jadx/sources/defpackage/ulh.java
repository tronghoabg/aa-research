package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ulh {
    public int a;
    public int b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public byte g = -1;
    private int h;
    private int i;

    public ulh(defpackage.uli uliVar) {
        this.a = uliVar.b;
        this.b = uliVar.c;
        this.h = uliVar.d;
        this.c = uliVar.e;
        this.d = uliVar.f;
        this.e = uliVar.g;
        this.i = uliVar.h;
        this.f = uliVar.i;
    }

    public final defpackage.uli a() {
        if (this.g == -1) {
            return new defpackage.uli(this.a, this.b, this.h, this.c, this.d, this.e, this.i, this.f);
        }
        throw new java.lang.IllegalStateException();
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
