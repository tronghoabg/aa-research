package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class euu {
    public final defpackage.evs a;
    public final boolean b;
    public final boolean c;
    private final java.lang.Object d;

    public euu(defpackage.evs evsVar, boolean z, java.lang.Object obj, boolean z2) {
        if (!evsVar.q && z) {
            throw new java.lang.IllegalArgumentException(evsVar.e().concat(" does not allow nullable values"));
        }
        if (!z && z2 && obj == null) {
            throw new java.lang.IllegalArgumentException("Argument with type " + evsVar.e() + " has null value but is not nullable.");
        }
        this.a = evsVar;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final void a(java.lang.String str, android.os.Bundle bundle) {
        java.lang.Object obj;
        str.getClass();
        if (!this.c || (obj = this.d) == null) {
            return;
        }
        this.a.f(bundle, str, obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.euu euuVar = (defpackage.euu) obj;
        if (this.b != euuVar.b || this.c != euuVar.c || !defpackage.afga.f(this.a, euuVar.a)) {
            return false;
        }
        java.lang.Object obj2 = this.d;
        if (obj2 != null) {
            return defpackage.afga.f(obj2, euuVar.d);
        }
        return euuVar.d == null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Object obj = this.d;
        return ((((iHashCode + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(defpackage.afgw.b(getClass()).getSimpleName());
        defpackage.evs evsVar = this.a;
        java.util.Objects.toString(evsVar);
        sb.append(" Type: ".concat(evsVar.toString()));
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            java.lang.Object obj = this.d;
            java.util.Objects.toString(obj);
            sb.append(" DefaultValue: ".concat(java.lang.String.valueOf(obj)));
        }
        return sb.toString();
    }
}
