package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dxs {
    public final boolean a;
    public final boolean b;
    public final android.telecom.PhoneAccountHandle c;
    public final android.os.Bundle d;

    public dxs(boolean z, boolean z2, android.telecom.PhoneAccountHandle phoneAccountHandle, android.os.Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = phoneAccountHandle;
        this.d = bundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dxs)) {
            return false;
        }
        defpackage.dxs dxsVar = (defpackage.dxs) obj;
        return this.a == dxsVar.a && this.b == dxsVar.b && defpackage.afga.f(this.c, dxsVar.c) && defpackage.afga.f(this.d, dxsVar.d);
    }

    public final int hashCode() {
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.c;
        int iHashCode = phoneAccountHandle == null ? 0 : phoneAccountHandle.hashCode();
        boolean z = this.b;
        boolean z2 = this.a;
        android.os.Bundle bundle = this.d;
        return (((((defpackage.a.e(z2) * 31) + defpackage.a.e(z)) * 31) + iHashCode) * 31) + (bundle != null ? bundle.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ExtensionCallDetails(hasTransactionalProperty=" + this.a + ", isSelfManagedProperty=" + this.b + ", accountHandle=" + this.c + ", extras=" + this.d + ")";
    }
}
