package defpackage;

/* loaded from: classes.dex */
public final class awm extends cxt<awn> {
    private final cfr a;

    public awm(cfr cfrVar) {
        this.a = cfrVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new awn(this.a, 0);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((awn) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        awm awmVar = obj instanceof awm ? (awm) obj : null;
        if (awmVar == null) {
            return false;
        }
        return affa.f(this.a, awmVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
