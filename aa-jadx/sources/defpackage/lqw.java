package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lqw {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public lqw(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lqw) {
            defpackage.lqw lqwVar = (defpackage.lqw) obj;
            if (this.a == lqwVar.a && this.b == lqwVar.b && this.c == lqwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "ElapsedIntervalInfo{hasRetryResumeIntervalElapsed=" + this.a + ", hasPausedAfterBufferingIntervalElapsed=" + this.b + ", hasStateMachineTimeoutIntervalElapsed=" + this.c + "}";
    }

    public lqw() {
        throw null;
    }
}
