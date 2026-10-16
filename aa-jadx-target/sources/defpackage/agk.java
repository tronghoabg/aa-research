package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class agk implements defpackage.agj {
    private final java.lang.Object a;
    private final java.lang.Object b;

    public agk(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.agj)) {
            return false;
        }
        defpackage.agj agjVar = (defpackage.agj) obj;
        return defpackage.afga.f(this.a, agjVar.f()) && defpackage.afga.f(this.b, agjVar.g());
    }

    @Override // defpackage.agj
    public final java.lang.Object f() {
        return this.a;
    }

    @Override // defpackage.agj
    public final java.lang.Object g() {
        return this.b;
    }

    @Override // defpackage.agj
    public final /* synthetic */ boolean h(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.afw.s(this, obj, obj2);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        java.lang.Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}
