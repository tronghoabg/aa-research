package defpackage;

/* loaded from: classes.dex */
public final class bjc implements bjx {
    final /* synthetic */ afdr a;
    final /* synthetic */ bld b;
    final /* synthetic */ afdr c;

    public bjc(afdr afdrVar, bld bldVar, afdr afdrVar2) {
        this.a = afdrVar;
        this.b = bldVar;
        this.c = afdrVar2;
    }

    @Override // defpackage.bjx
    public final void a() {
        this.b.c();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [cst, java.lang.Object] */
    @Override // defpackage.bjx
    public final boolean b(long j, bko bkoVar) {
        ?? Invoke = this.c.invoke();
        if (Invoke == 0) {
            return true;
        }
        bld bldVar = this.b;
        if (!Invoke.t() || !f()) {
            return false;
        }
        bldVar.f();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [cst, java.lang.Object] */
    @Override // defpackage.bjx
    public final boolean c(long j) {
        ?? Invoke = this.c.invoke();
        if (Invoke == 0) {
            return false;
        }
        bld bldVar = this.b;
        if (!Invoke.t()) {
            return false;
        }
        bldVar.f();
        return f();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [cst, java.lang.Object] */
    @Override // defpackage.bjx
    public final boolean d(long j) {
        ?? Invoke = this.c.invoke();
        if (Invoke == 0) {
            return true;
        }
        bld bldVar = this.b;
        if (!Invoke.t() || !f()) {
            return false;
        }
        bldVar.f();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [cst, java.lang.Object] */
    @Override // defpackage.bjx
    public final boolean e(long j, bko bkoVar, int i) {
        ?? Invoke = this.c.invoke();
        if (Invoke == 0) {
            return false;
        }
        bld bldVar = this.b;
        if (!Invoke.t()) {
            return false;
        }
        bldVar.g();
        return f();
    }

    public final boolean f() {
        return ble.a(this.b, ((Number) this.a.invoke()).longValue());
    }
}
