package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nss {
    public final int a;
    public final com.google.android.gms.car.CarWindowLayoutParams b;

    public nss(int i, com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams) {
        this.a = i;
        this.b = carWindowLayoutParams;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.nss) {
            defpackage.nss nssVar = (defpackage.nss) obj;
            if (this.a == nssVar.a && this.b.equals(nssVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "ChromeWindowInfo{layoutId=" + this.a + ", layoutParams=" + java.lang.String.valueOf(this.b) + "}";
    }

    public nss() {
        throw null;
    }
}
