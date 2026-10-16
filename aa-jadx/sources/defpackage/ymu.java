package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ymu implements java.io.Serializable, defpackage.xyp {
    public static final defpackage.ymu a = new defpackage.ymu(defpackage.yes.a, defpackage.yeq.a);
    private static final long serialVersionUID = 0;
    public final defpackage.yet b;
    final defpackage.yet c;

    public ymu(defpackage.yet yetVar, defpackage.yet yetVar2) {
        this.b = yetVar;
        this.c = yetVar2;
        if (yetVar == defpackage.yeq.a || yetVar2 == defpackage.yes.a) {
            throw new java.lang.IllegalArgumentException("Invalid range: (-∞..+∞)");
        }
    }

    @Override // defpackage.xyp
    @java.lang.Deprecated
    public final /* synthetic */ boolean a(java.lang.Object obj) {
        ((java.lang.Comparable) obj).getClass();
        return true;
    }

    public final boolean b() {
        return this.b.equals(this.c);
    }

    @Override // defpackage.xyp
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ymu) {
            defpackage.ymu ymuVar = (defpackage.ymu) obj;
            if (this.b.equals(ymuVar.b) && this.c.equals(ymuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.b) * 31) + java.lang.System.identityHashCode(this.c);
    }

    java.lang.Object readResolve() {
        defpackage.ymu ymuVar = a;
        return equals(ymuVar) ? ymuVar : this;
    }

    public final java.lang.String toString() {
        return "(-∞..+∞)";
    }
}
