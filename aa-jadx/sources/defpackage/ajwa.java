package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajwa implements defpackage.ajqb {
    protected final defpackage.ajqb c;

    public ajwa(defpackage.ajqb ajqbVar) {
        defpackage.aguw.e(ajqbVar, "Wrapped entity");
        this.c = ajqbVar;
    }

    @Override // defpackage.ajqb
    public long a() {
        return this.c.a();
    }

    @Override // defpackage.ajqb
    public java.io.InputStream b() throws java.io.IOException {
        return this.c.b();
    }

    @Override // defpackage.ajqb
    public final defpackage.ajpy c() {
        return this.c.c();
    }

    @Override // defpackage.ajqb
    public final defpackage.ajpy d() {
        return this.c.d();
    }

    @Override // defpackage.ajqb
    @java.lang.Deprecated
    public void e() throws java.io.IOException {
        this.c.e();
    }

    @Override // defpackage.ajqb
    public void f(java.io.OutputStream outputStream) throws java.io.IOException {
        this.c.f(outputStream);
    }

    @Override // defpackage.ajqb
    public boolean g() {
        return this.c.g();
    }

    @Override // defpackage.ajqb
    public boolean h() {
        return this.c.h();
    }

    @Override // defpackage.ajqb
    public boolean i() {
        return this.c.i();
    }
}
