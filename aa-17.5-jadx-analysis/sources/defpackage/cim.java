package defpackage;

/* loaded from: classes.dex */
public final class cim extends cxt<cip> {
    private final cil a;

    public cim(cil cilVar) {
        this.a = cilVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cip(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        cip cipVar = (cip) cfxVar;
        cipVar.a.d.m(cipVar);
        cipVar.a = this.a;
        cipVar.a.d.n(cipVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cim) && affa.f(this.a, ((cim) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ")";
    }
}
