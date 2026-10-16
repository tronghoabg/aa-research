package defpackage;

/* loaded from: classes2.dex */
public final class pdq implements pdt {
    public final phq a;

    public pdq(phq phqVar) {
        this.a = phqVar;
    }

    @Override // defpackage.pdt
    public final /* synthetic */ boolean a() {
        return lvl.au(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdq) && affa.f(this.a, ((pdq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StartedWithConnection(startedConnection=" + this.a + ")";
    }
}
