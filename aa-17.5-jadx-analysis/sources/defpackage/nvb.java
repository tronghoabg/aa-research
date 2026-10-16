package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class nvb {
    public final nuh a;
    public final List b;

    public nvb(nuh nuhVar, List list) {
        this.a = nuhVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvb)) {
            return false;
        }
        nvb nvbVar = (nvb) obj;
        return affa.f(this.a, nvbVar.a) && affa.f(this.b, nvbVar.b);
    }

    public final int hashCode() {
        nuh nuhVar = this.a;
        return ((nuhVar == null ? 0 : nuhVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OngoingNotificationInfo(highestPriorityOngoing=" + this.a + ", suppressedEntries=" + this.b + ")";
    }
}
