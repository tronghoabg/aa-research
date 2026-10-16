package defpackage;

/* loaded from: classes2.dex */
public final class ciq extends cxt<cir> {
    private final cil a;

    public ciq(cil cilVar) {
        this.a = cilVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cir(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((cir) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ciq) && affa.f(this.a, ((ciq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRestorerElement(fallback=" + this.a + ")";
    }
}
