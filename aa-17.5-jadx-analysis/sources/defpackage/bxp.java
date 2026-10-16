package defpackage;

/* loaded from: classes.dex */
public final class bxp implements byi {
    private final /* synthetic */ int d;
    public static final bxp c = new bxp(2);
    public static final bxp b = new bxp(1);
    public static final bxp a = new bxp(0);

    private bxp(int i) {
        this.d = i;
    }

    @Override // defpackage.byi
    public final boolean a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return obj == obj2;
        }
        if (i != 1) {
            return affa.f(obj, obj2);
        }
        return false;
    }

    public final String toString() {
        int i = this.d;
        return i != 0 ? i != 1 ? "StructuralEqualityPolicy" : "NeverEqualPolicy" : "ReferentialEqualityPolicy";
    }

    @Override // defpackage.byi
    public final /* synthetic */ void b() {
    }
}
