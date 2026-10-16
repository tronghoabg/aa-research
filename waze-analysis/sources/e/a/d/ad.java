package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ad implements ah {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f46590a;

    /* renamed from: b, reason: collision with root package name */
    private e.a.ee f46591b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.uid.f f46592c;

    public ad(ae aeVar, com.waze.uid.f fVar) {
        Objects.requireNonNull(aeVar);
        this.f46590a = aeVar;
        com.google.d.b.an.C(fVar, "observer");
        this.f46592c = fVar;
    }

    static /* bridge */ /* synthetic */ void b(ad adVar, e.a.ee eeVar) {
        adVar.f46591b = eeVar;
        adVar.f46590a.f46603k.c(eeVar);
    }

    @Override // e.a.d.ah
    public final void c(e.a.ee eeVar, ag agVar, e.a.cm cmVar) {
        int i2 = e.b.b.f47862a;
        ae aeVar = this.f46590a;
        e.a.ad adVarT = aeVar.t();
        if (eeVar.a() == e.a.eb.CANCELLED && adVarT != null && adVarT.d()) {
            eeVar = aeVar.f46600h.b();
            cmVar = new e.a.cm();
        }
        aeVar.f46596d.execute(new ab(this, eeVar, cmVar));
    }

    @Override // e.a.d.ah
    public final void d(e.a.cm cmVar) {
        int i2 = e.b.b.f47862a;
        this.f46590a.f46596d.execute(new z(this, cmVar));
    }

    @Override // e.a.d.jw
    public final void e(jv jvVar) {
        int i2 = e.b.b.f47862a;
        this.f46590a.f46596d.execute(new aa(this, jvVar));
    }

    @Override // e.a.d.jw
    public final void f() {
        ae aeVar = this.f46590a;
        if (aeVar.f46595c.b().a()) {
            return;
        }
        int i2 = e.b.b.f47862a;
        aeVar.f46596d.execute(new ac(this));
    }
}
