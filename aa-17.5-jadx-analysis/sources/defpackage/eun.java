package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class eun {
    public final int a;
    public eve b = null;
    public Bundle c = null;

    public eun(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eun)) {
            return false;
        }
        eun eunVar = (eun) obj;
        if (this.a != eunVar.a || !affa.f(this.b, eunVar.b)) {
            return false;
        }
        Bundle bundle = this.c;
        Bundle bundle2 = eunVar.c;
        if (affa.f(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !dan.n(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        eve eveVar = this.b;
        int iHashCode = eveVar != null ? eveVar.hashCode() : 0;
        int i = this.a;
        Bundle bundle = this.c;
        int i2 = (i * 31) + iHashCode;
        return bundle != null ? (i2 * 31) + dan.m(bundle) : i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
