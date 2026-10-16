package defpackage;

import androidx.core.telecom.extensions.Capability;

/* loaded from: classes2.dex */
public final class dwv {
    public final Capability a;
    public final afeh b;

    public dwv(Capability capability, afeh afehVar) {
        this.a = capability;
        this.b = afehVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwv)) {
            return false;
        }
        dwv dwvVar = (dwv) obj;
        return affa.f(this.a, dwvVar.a) && affa.f(this.b, dwvVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CallExtensionCreator(extensionCapability=" + this.a + ", onExchangeComplete=" + this.b + ")";
    }
}
