package defpackage;

@afdo
/* loaded from: classes2.dex */
public final class kln implements kll {
    public final int a;

    public static boolean c(int i, Object obj) {
        return (obj instanceof kln) && i == ((kln) obj).a;
    }

    @Override // defpackage.kll
    public final int a() {
        return this.a;
    }

    @Override // defpackage.kll
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "CarAreaSeatValueSet(ids=" + this.a + ")";
    }
}
