package defpackage;

/* loaded from: classes.dex */
public final class cif extends cxt<cij> {
    private final cih a;

    public cif(cih cihVar) {
        this.a = cihVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new cij(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((cij) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cif) && affa.f(this.a, ((cif) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.a + ")";
    }
}
