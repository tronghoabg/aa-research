package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class nqb {
    public final boolean a;
    public final ComponentName b;
    public final int c;

    public nqb(boolean z, int i, ComponentName componentName) {
        if (i == 0) {
            throw null;
        }
        this.a = z;
        this.c = i;
        this.b = componentName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqb)) {
            return false;
        }
        nqb nqbVar = (nqb) obj;
        return this.a == nqbVar.a && this.c == nqbVar.c && affa.f(this.b, nqbVar.b);
    }

    public final int hashCode() {
        ComponentName componentName = this.b;
        return (((a.f(this.a) * 31) + this.c) * 31) + (componentName == null ? 0 : componentName.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmersiveState(useFullScreenImmersive=");
        sb.append(this.a);
        sb.append(", immersiveStateReason=");
        int i = this.c;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? "NONE" : "UI_STATE" : "DISPLAY_STATE" : "REQUESTED"));
        sb.append(", impactfulComponent=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ nqb(boolean z, int i, int i2) {
        this(z, (i2 & 2) != 0 ? 4 : i, (ComponentName) null);
    }
}
