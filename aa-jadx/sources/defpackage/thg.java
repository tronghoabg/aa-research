package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class thg {
    public final j$.time.Duration a;
    public final int b;

    public thg(j$.time.Duration duration) {
        duration.getClass();
        this.b = 2;
        this.a = duration;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.thg)) {
            return false;
        }
        defpackage.thg thgVar = (defpackage.thg) obj;
        int i = thgVar.b;
        return defpackage.afga.f(this.a, thgVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 62;
    }

    public final java.lang.String toString() {
        return "TimeoutConfig(timeoutResult=ERROR, timeoutDuration=" + this.a + ")";
    }
}
