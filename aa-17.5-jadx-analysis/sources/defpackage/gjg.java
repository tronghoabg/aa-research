package defpackage;

/* loaded from: classes2.dex */
public final class gjg extends cxt<gjh> {
    private final afec a;

    public gjg(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new gjh(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((gjh) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjg) && affa.f(this.a, ((gjg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TouchpadClickEventElement(callback=" + this.a + ")";
    }
}
