package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajie {
    public boolean a;
    public boolean b;
    public int c;
    public boolean d;

    public ajie(byte[] bArr) {
        this.c = 0;
        this.b = false;
        this.a = false;
        this.d = false;
    }

    public final void a() {
        this.a = true;
    }

    public final void b() {
        this.d = true;
    }

    public final defpackage.hlx c() {
        return new defpackage.hlx(this.c, this.b, this.a, this.d);
    }

    public final void d() {
        this.a = true;
    }

    public final void e() {
        this.d = true;
    }

    public ajie() {
        this.c = -1;
    }
}
