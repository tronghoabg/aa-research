package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jc extends e.a.dt {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jd f47216a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.dt f47217b;

    jc(jd jdVar, e.a.dt dtVar) {
        Objects.requireNonNull(jdVar);
        this.f47216a = jdVar;
        this.f47217b = dtVar;
    }

    @Override // e.a.dt
    public final e.a.ee c(e.a.db dbVar) {
        e.a.ee eeVarC = this.f47217b.c(dbVar);
        boolean zL = eeVarC.l();
        jd jdVar = this.f47216a;
        if (zL) {
            jdVar.f47218b.b();
            return eeVarC;
        }
        jdVar.f47218b.c(new jb(jdVar));
        return eeVarC;
    }
}
