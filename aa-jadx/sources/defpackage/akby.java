package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class akby implements defpackage.akca {
    private final defpackage.akca a;
    private final defpackage.akca b;

    public akby(defpackage.akca akcaVar, defpackage.akca akcaVar2) {
        this.a = akcaVar;
        this.b = akcaVar2;
    }

    public final java.lang.String toString() {
        return "[local: " + this.a + "defaults: " + this.b + "]";
    }

    @Override // defpackage.akca
    public final java.lang.Object v(java.lang.String str) {
        java.lang.Object objV = this.a.v(str);
        return objV == null ? this.b.v(str) : objV;
    }

    @Override // defpackage.akca
    public final void x(java.lang.String str, java.lang.Object obj) {
        this.a.x(str, obj);
    }
}
