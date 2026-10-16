package defpackage;

/* loaded from: classes.dex */
public final class csv extends cxt<csw> {
    private final Object a;

    public csv(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new csw(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((csw) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csv) && affa.f(this.a, ((csv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ")";
    }
}
