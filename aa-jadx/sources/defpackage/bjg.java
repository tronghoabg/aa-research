package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bjg implements defpackage.bkb {
    final /* synthetic */ defpackage.afer a;
    final /* synthetic */ defpackage.blh b;
    final /* synthetic */ defpackage.afer c;

    public bjg(defpackage.afer aferVar, defpackage.blh blhVar, defpackage.afer aferVar2) {
        this.a = aferVar;
        this.b = blhVar;
        this.c = aferVar2;
    }

    @Override // defpackage.bkb
    public final void a() {
        this.b.c();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ctc, java.lang.Object] */
    @Override // defpackage.bkb
    public final boolean b(long j, defpackage.bks bksVar) {
        ?? Invoke = this.c.invoke();
        if (Invoke == 0) {
            return true;
        }
        defpackage.blh blhVar = this.b;
        if (!Invoke.t() || !f()) {
            return false;
        }
        blhVar.f();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ctc, java.lang.Object] */
    @Override // defpackage.bkb
    public final boolean c(long j) {
        ?? Invoke = this.c.invoke();
        if (Invoke == 0) {
            return false;
        }
        defpackage.blh blhVar = this.b;
        if (!Invoke.t()) {
            return false;
        }
        blhVar.f();
        return f();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ctc, java.lang.Object] */
    @Override // defpackage.bkb
    public final boolean d(long j) {
        ?? Invoke = this.c.invoke();
        if (Invoke == 0) {
            return true;
        }
        defpackage.blh blhVar = this.b;
        if (!Invoke.t() || !f()) {
            return false;
        }
        blhVar.f();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ctc, java.lang.Object] */
    @Override // defpackage.bkb
    public final boolean e(long j, defpackage.bks bksVar, int i) {
        ?? Invoke = this.c.invoke();
        if (Invoke == 0) {
            return false;
        }
        defpackage.blh blhVar = this.b;
        if (!Invoke.t()) {
            return false;
        }
        blhVar.g();
        return f();
    }

    public final boolean f() {
        return defpackage.blj.a(this.b, ((java.lang.Number) this.a.invoke()).longValue());
    }
}
