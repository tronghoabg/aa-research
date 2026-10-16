package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class umu {
    public final defpackage.uxx a;
    public final defpackage.ukf b;
    public final boolean c;
    public final defpackage.umt d;
    public final int e;

    public umu(int i, defpackage.uxx uxxVar, defpackage.ukf ukfVar, boolean z, defpackage.umt umtVar) {
        this.e = i;
        uxxVar.getClass();
        this.a = uxxVar;
        this.b = ukfVar;
        this.c = z;
        this.d = umtVar;
    }

    public final defpackage.umu a() {
        return this.d != null ? new defpackage.umu(this.e, this.a, this.b, this.c, null) : this;
    }

    public final defpackage.umu b(boolean z) {
        defpackage.umt umtVar = this.d;
        return umtVar != null ? umtVar.a(z) : new defpackage.umu(this.e, this.a, this.b, z, null);
    }

    public final boolean c(defpackage.umu umuVar) {
        return this.b.equals(umuVar.b) && this.e == umuVar.e && this.a.equals(umuVar.a) && this.d == umuVar.d;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.umt umtVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.umu) {
            defpackage.umu umuVar = (defpackage.umu) obj;
            if (this.e == umuVar.e && this.a.equals(umuVar.a) && this.b.equals(umuVar.b) && this.c == umuVar.c && ((umtVar = this.d) != null ? umtVar.equals(umuVar.d) : umuVar.d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.e ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
        defpackage.umt umtVar = this.d;
        return (((true != this.c ? 1237 : 1231) ^ (iHashCode * 1000003)) * 1000003) ^ (umtVar == null ? 0 : umtVar.hashCode());
    }

    public final java.lang.String toString() {
        defpackage.umt umtVar = this.d;
        return umtVar != null ? umtVar.name() : "CUSTOM_DRAW_MODE";
    }

    public umu() {
        throw null;
    }
}
