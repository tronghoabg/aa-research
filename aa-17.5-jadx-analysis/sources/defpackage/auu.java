package defpackage;

/* loaded from: classes.dex */
public final class auu extends cxt<auw> {
    private final awo a;

    public auu(awo awoVar) {
        this.a = awoVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new auw(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((auw) cfxVar).f(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof auu) {
            return affa.f(((auu) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
