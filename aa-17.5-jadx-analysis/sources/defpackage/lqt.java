package defpackage;

/* loaded from: classes2.dex */
public final class lqt {
    public final boolean a;
    public final lqs b;
    public final lqr c;

    public lqt(boolean z, lqs lqsVar, lqr lqrVar) {
        this.a = z;
        if (lqsVar == null) {
            throw new NullPointerException("Null mediaAndCallInfo");
        }
        this.b = lqsVar;
        if (lqrVar == null) {
            throw new NullPointerException("Null elapsedIntervalInfo");
        }
        this.c = lqrVar;
    }

    public final lqi a() {
        return this.b.a;
    }

    public final boolean b() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqt) {
            lqt lqtVar = (lqt) obj;
            if (this.a == lqtVar.a && this.b.equals(lqtVar.b) && this.c.equals(lqtVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        lqr lqrVar = this.c;
        return "TriggerSignal{triggerTargetDifferentFromOngoing=" + this.a + ", mediaAndCallInfo=" + this.b.toString() + ", elapsedIntervalInfo=" + lqrVar.toString() + "}";
    }

    public lqt() {
        throw null;
    }
}
