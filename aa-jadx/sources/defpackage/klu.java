package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.afeo
public final class klu implements defpackage.kls {
    public final int a;

    public static boolean c(int i, java.lang.Object obj) {
        return (obj instanceof defpackage.klu) && i == ((defpackage.klu) obj).a;
    }

    @Override // defpackage.kls
    public final int a() {
        return this.a;
    }

    @Override // defpackage.kls
    public final int b() {
        return 3;
    }

    public final boolean equals(java.lang.Object obj) {
        return c(this.a, obj);
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "CarAreaSeatValueSet(ids=" + this.a + ")";
    }
}
