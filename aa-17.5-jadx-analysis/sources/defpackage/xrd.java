package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class xrd {
    public final List a;
    public final boolean b;
    public final wpq c;

    public xrd(List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrd)) {
            return false;
        }
        xrd xrdVar = (xrd) obj;
        if (!affa.f(this.a, xrdVar.a) || this.b != xrdVar.b) {
            return false;
        }
        wpq wpqVar = xrdVar.c;
        return affa.f(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + a.f(this.b)) * 31;
    }

    public final String toString() {
        return "KeyframeSequence(transitions=" + this.a + ", isRepeatable=" + this.b + ", shaderUpdater=null)";
    }

    public xrd() {
        this(afbe.a, false);
    }
}
