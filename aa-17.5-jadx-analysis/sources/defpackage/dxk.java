package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class dxk {
    public final Set a;
    public final dyv b;

    public dxk(Set set, dyv dyvVar) {
        set.getClass();
        this.a = set;
        this.b = dyvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxk)) {
            return false;
        }
        dxk dxkVar = (dxk) obj;
        return affa.f(this.a, dxkVar.a) && affa.f(this.b, dxkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CapabilityExchangeResult(voipCapabilities=" + this.a + ", extensionInitializationBinder=" + this.b + ")";
    }
}
