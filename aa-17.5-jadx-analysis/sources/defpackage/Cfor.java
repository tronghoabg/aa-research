package defpackage;

/* renamed from: for, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cfor {
    public static final String a = fjo.b("NetworkRequestCompat");
    public final Object b;

    public Cfor(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cfor) && affa.f(this.b, ((Cfor) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.b + ")";
    }

    public Cfor() {
        this(null);
    }
}
