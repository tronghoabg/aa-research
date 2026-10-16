package defpackage;

/* loaded from: classes2.dex */
public final class ewz extends ebi {
    private final ews a;

    public ewz(ews ewsVar) {
        this.a = ewsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && affa.f(this.a, ((ewz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.a + ", direction=-1)";
    }
}
