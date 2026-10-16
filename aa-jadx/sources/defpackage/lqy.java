package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lqy {
    public final boolean a;
    public final defpackage.lqx b;
    public final defpackage.lqw c;

    public lqy(boolean z, defpackage.lqx lqxVar, defpackage.lqw lqwVar) {
        this.a = z;
        if (lqxVar == null) {
            throw new java.lang.NullPointerException("Null mediaAndCallInfo");
        }
        this.b = lqxVar;
        if (lqwVar == null) {
            throw new java.lang.NullPointerException("Null elapsedIntervalInfo");
        }
        this.c = lqwVar;
    }

    public final defpackage.lqo a() {
        return this.b.a;
    }

    public final boolean b() {
        return this.b.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lqy) {
            defpackage.lqy lqyVar = (defpackage.lqy) obj;
            if (this.a == lqyVar.a && this.b.equals(lqyVar.b) && this.c.equals(lqyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.lqw lqwVar = this.c;
        return "TriggerSignal{triggerTargetDifferentFromOngoing=" + this.a + ", mediaAndCallInfo=" + this.b.toString() + ", elapsedIntervalInfo=" + lqwVar.toString() + "}";
    }

    public lqy() {
        throw null;
    }
}
