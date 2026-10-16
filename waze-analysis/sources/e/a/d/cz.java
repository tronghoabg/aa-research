package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
class cz extends e.a.dd {

    /* renamed from: b, reason: collision with root package name */
    private final e.a.dd f46775b;

    cz(e.a.dd ddVar) {
        this.f46775b = ddVar;
    }

    @Override // e.a.dd
    public final String a() {
        return this.f46775b.a();
    }

    @Override // e.a.dd
    public final void b() {
        this.f46775b.b();
    }

    @Override // e.a.dd
    public void c() {
        this.f46775b.c();
    }

    @Override // e.a.dd
    public void d(e.a.dt dtVar) {
        this.f46775b.d(dtVar);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("delegate", this.f46775b);
        return zVarH.toString();
    }
}
