package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
abstract class cw implements ah {
    cw() {
    }

    protected abstract ah a();

    @Override // e.a.d.ah
    public void c(e.a.ee eeVar, ag agVar, e.a.cm cmVar) {
        throw null;
    }

    @Override // e.a.d.ah
    public final void d(e.a.cm cmVar) {
        a().d(cmVar);
    }

    @Override // e.a.d.jw
    public final void e(jv jvVar) {
        a().e(jvVar);
    }

    @Override // e.a.d.jw
    public final void f() {
        a().f();
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("delegate", a());
        return zVarH.toString();
    }
}
