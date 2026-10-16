package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class aezv implements Serializable {
    public final Throwable a;

    public aezv(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aezv) && affa.f(this.a, ((aezv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ")";
    }
}
