package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class gez {
    public final deu a;
    public final Map b;

    public gez(deu deuVar, Map map) {
        this.a = deuVar;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gez)) {
            return false;
        }
        gez gezVar = (gez) obj;
        return affa.f(this.a, gezVar.a) && affa.f(this.b, gezVar.b);
    }

    public final int hashCode() {
        deu deuVar = this.a;
        return ((deuVar == null ? 0 : deuVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Result(string=" + ((Object) this.a) + ", inlineTextContentMap=" + this.b + ")";
    }

    public /* synthetic */ gez(deu deuVar) {
        this(deuVar, afbf.a);
    }
}
