package defpackage;

/* loaded from: classes.dex */
public final class csu extends cxt<csz> {
    private final afeh a;

    public csu(afeh afehVar) {
        this.a = afehVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new csz(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((csz) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csu) && this.a == ((csu) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
