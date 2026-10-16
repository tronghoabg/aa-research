package defpackage;

/* loaded from: classes.dex */
public final class obd extends ebf {
    public final obb a;

    public obd(obb obbVar) {
        this.a = obbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obd) && affa.f(this.a, ((obd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Attribution(wrapped=" + this.a + ")";
    }
}
