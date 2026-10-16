package defpackage;

import j$.time.Duration;

/* loaded from: classes3.dex */
public final class tgk {
    public final Duration a;
    public final int b;

    public tgk(Duration duration) {
        duration.getClass();
        this.b = 2;
        this.a = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgk)) {
            return false;
        }
        tgk tgkVar = (tgk) obj;
        int i = tgkVar.b;
        return affa.f(this.a, tgkVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 62;
    }

    public final String toString() {
        return "TimeoutConfig(timeoutResult=ERROR, timeoutDuration=" + this.a + ")";
    }
}
