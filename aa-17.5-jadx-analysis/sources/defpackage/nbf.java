package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class nbf {
    public final loz a;
    public final ComponentName b;

    public nbf(loz lozVar, ComponentName componentName) {
        this.a = lozVar;
        this.b = componentName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbf)) {
            return false;
        }
        nbf nbfVar = (nbf) obj;
        return affa.f(this.a, nbfVar.a) && affa.f(this.b, nbfVar.b);
    }

    public final int hashCode() {
        loz lozVar = this.a;
        return ((lozVar == null ? 0 : lozVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PlayerInfo(mediaSessionIdentifier=" + this.a + ", componentName=" + this.b + ")";
    }
}
