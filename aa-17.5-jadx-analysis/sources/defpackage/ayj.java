package defpackage;

/* loaded from: classes.dex */
public final class ayj extends cxt<ayk> {
    private final azd a;

    public ayj(azd azdVar) {
        this.a = azdVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ayk(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ayk aykVar = (ayk) cfxVar;
        azd azdVar = aykVar.a;
        azd azdVar2 = this.a;
        if (affa.f(azdVar, azdVar2) || !aykVar.q.A) {
            return;
        }
        aykVar.a.c();
        azdVar2.b = aykVar;
        aykVar.a = azdVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ayj) && affa.f(this.a, ((ayj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ")";
    }
}
