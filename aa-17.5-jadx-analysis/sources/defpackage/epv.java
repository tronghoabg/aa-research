package defpackage;

/* loaded from: classes.dex */
public final class epv implements aitx, epy {
    public final ept a;
    public final afco b;

    public epv(ept eptVar, afco afcoVar) {
        afcoVar.getClass();
        this.a = eptVar;
        this.b = afcoVar;
        if (eptVar.a() == eps.a) {
            affx.e(afcoVar, null);
        }
    }

    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        ept eptVar = this.a;
        if (eptVar.a().compareTo(eps.a) <= 0) {
            eptVar.d(this);
            affx.e(this.b, null);
        }
    }

    @Override // defpackage.aitx
    public final afco c() {
        return this.b;
    }

    public epv() {
        throw null;
    }
}
