package defpackage;

import android.os.Bundle;
import android.telecom.PhoneAccountHandle;

/* loaded from: classes2.dex */
public final class dxl {
    public final boolean a;
    public final boolean b;
    public final PhoneAccountHandle c;
    public final Bundle d;

    public dxl(boolean z, boolean z2, PhoneAccountHandle phoneAccountHandle, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = phoneAccountHandle;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxl)) {
            return false;
        }
        dxl dxlVar = (dxl) obj;
        return this.a == dxlVar.a && this.b == dxlVar.b && affa.f(this.c, dxlVar.c) && affa.f(this.d, dxlVar.d);
    }

    public final int hashCode() {
        PhoneAccountHandle phoneAccountHandle = this.c;
        int iHashCode = phoneAccountHandle == null ? 0 : phoneAccountHandle.hashCode();
        boolean z = this.b;
        boolean z2 = this.a;
        Bundle bundle = this.d;
        return (((((a.f(z2) * 31) + a.f(z)) * 31) + iHashCode) * 31) + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        return "ExtensionCallDetails(hasTransactionalProperty=" + this.a + ", isSelfManagedProperty=" + this.b + ", accountHandle=" + this.c + ", extras=" + this.d + ")";
    }
}
