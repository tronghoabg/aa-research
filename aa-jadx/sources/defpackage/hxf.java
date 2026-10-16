package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hxf implements defpackage.hxg, defpackage.igl {
    private static final defpackage.dzr a = defpackage.ign.a(20, new defpackage.hyi(1));
    private defpackage.hxg b;
    private boolean c;
    private boolean d;
    private final defpackage.ssm e = new defpackage.ssm();

    static defpackage.hxf d(defpackage.hxg hxgVar) {
        defpackage.hxf hxfVar = (defpackage.hxf) a.a();
        hxfVar.d = false;
        hxfVar.c = true;
        hxfVar.b = hxgVar;
        return hxfVar;
    }

    @Override // defpackage.hxg
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.hxg
    public final java.lang.Class b() {
        return this.b.b();
    }

    @Override // defpackage.hxg
    public final java.lang.Object c() {
        return this.b.c();
    }

    @Override // defpackage.hxg
    public final synchronized void e() {
        this.e.a();
        this.d = true;
        if (this.c) {
            return;
        }
        this.b.e();
        this.b = null;
        a.b(this);
    }

    @Override // defpackage.igl
    public final defpackage.ssm f() {
        return this.e;
    }

    final synchronized void g() {
        this.e.a();
        if (!this.c) {
            throw new java.lang.IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            e();
        }
    }
}
