package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uav implements java.io.Serializable, java.lang.Comparable {
    public static final defpackage.uav a = new defpackage.uav(new defpackage.toz(0, 0), 0);
    public final defpackage.toz b;
    public final int c;
    public final java.lang.String d = "";

    public uav(defpackage.toz tozVar, int i) {
        this.b = tozVar;
        this.c = i;
    }

    public static defpackage.uav a(defpackage.abaw abawVar) {
        if (abawVar == null) {
            return null;
        }
        defpackage.toz tozVarA = defpackage.toz.a(abawVar.c);
        int i = (abawVar.b & 2) != 0 ? abawVar.d : Integer.MIN_VALUE;
        if (tozVarA != null) {
            return new defpackage.uav(tozVarA, i);
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.b.compareTo(((defpackage.uav) obj).b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.uav) {
            return this.b.equals(((defpackage.uav) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "{" + getClass().getSimpleName() + ":id=" + this.b.f() + ", levelNumberE3=" + this.c + ", levelName=" + this.d + "}";
    }
}
