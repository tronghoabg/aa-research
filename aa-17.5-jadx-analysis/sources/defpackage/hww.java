package defpackage;

/* loaded from: classes2.dex */
public final class hww implements hwx, igd {
    private static final dzk a = igf.a(20, new hxz(1));
    private hwx b;
    private boolean c;
    private boolean d;
    private final sro e = new sro();

    static hww d(hwx hwxVar) {
        hww hwwVar = (hww) a.a();
        hwwVar.d = false;
        hwwVar.c = true;
        hwwVar.b = hwxVar;
        return hwwVar;
    }

    @Override // defpackage.hwx
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.hwx
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.hwx
    public final Object c() {
        return this.b.c();
    }

    @Override // defpackage.hwx
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

    @Override // defpackage.igd
    public final sro f() {
        return this.e;
    }

    final synchronized void g() {
        this.e.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            e();
        }
    }
}
