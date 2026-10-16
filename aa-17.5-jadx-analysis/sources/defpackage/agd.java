package defpackage;

/* loaded from: classes.dex */
public final class agd implements agc {
    private final Object a;
    private final Object b;

    public agd(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agc)) {
            return false;
        }
        agc agcVar = (agc) obj;
        return affa.f(this.a, agcVar.f()) && affa.f(this.b, agcVar.g());
    }

    @Override // defpackage.agc
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.agc
    public final Object g() {
        return this.b;
    }

    @Override // defpackage.agc
    public final /* synthetic */ boolean h(Object obj, Object obj2) {
        return afp.s(this, obj, obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}
