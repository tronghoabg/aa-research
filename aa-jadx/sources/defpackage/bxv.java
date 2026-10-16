package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bxv implements defpackage.byo {
    private final /* synthetic */ int d;
    public static final defpackage.bxv c = new defpackage.bxv(2);
    public static final defpackage.bxv b = new defpackage.bxv(1);
    public static final defpackage.bxv a = new defpackage.bxv(0);

    private bxv(int i) {
        this.d = i;
    }

    @Override // defpackage.byo
    public final boolean a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.d;
        if (i == 0) {
            return obj == obj2;
        }
        if (i != 1) {
            return defpackage.afga.f(obj, obj2);
        }
        return false;
    }

    public final java.lang.String toString() {
        int i = this.d;
        if (i != 0) {
            return i != 1 ? "StructuralEqualityPolicy" : "NeverEqualPolicy";
        }
        return "ReferentialEqualityPolicy";
    }

    @Override // defpackage.byo
    public final /* synthetic */ void b() {
    }
}
