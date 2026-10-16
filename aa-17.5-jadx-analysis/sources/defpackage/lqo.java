package defpackage;

import j$.time.Instant;

/* loaded from: classes2.dex */
public final class lqo {
    public final Instant a;
    public final lqp b;
    public final lqt c;

    public lqo(Instant instant, lqp lqpVar, lqt lqtVar) {
        if (instant == null) {
            throw new NullPointerException("Null eventTime");
        }
        this.a = instant;
        if (lqpVar == null) {
            throw new NullPointerException("Null triggerState");
        }
        this.b = lqpVar;
        if (lqtVar == null) {
            throw new NullPointerException("Null triggerSignal");
        }
        this.c = lqtVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqo) {
            lqo lqoVar = (lqo) obj;
            if (this.a.equals(lqoVar.a) && this.b.equals(lqoVar.b) && this.c.equals(lqoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        lqt lqtVar = this.c;
        lqp lqpVar = this.b;
        return "TriggerHistoryEntry{eventTime=" + this.a.toString() + ", triggerState=" + lqpVar.toString() + ", triggerSignal=" + lqtVar.toString() + "}";
    }

    public lqo() {
        throw null;
    }
}
