package defpackage;

/* loaded from: classes.dex */
public final class aur extends cxt<awn> {
    private final cfm a;

    public aur(cfm cfmVar) {
        this.a = cfmVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new awn(this.a, 1);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((awn) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        aur aurVar = obj instanceof aur ? (aur) obj : null;
        if (aurVar == null) {
            return false;
        }
        return affa.f(this.a, aurVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
