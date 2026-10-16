package e.a.d;

import j$.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class di {

    /* renamed from: a, reason: collision with root package name */
    final int f46803a;

    /* renamed from: b, reason: collision with root package name */
    final long f46804b;

    /* renamed from: c, reason: collision with root package name */
    final Set f46805c;

    di(int i2, long j2, Set set) {
        this.f46803a = i2;
        this.f46804b = j2;
        this.f46805c = com.google.d.d.ci.m(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            di diVar = (di) obj;
            if (this.f46803a == diVar.f46803a && this.f46804b == diVar.f46804b && Objects.equals(this.f46805c, diVar.f46805c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f46803a), Long.valueOf(this.f46804b), this.f46805c);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.b("maxAttempts", this.f46803a);
        zVarH.c("hedgingDelayNanos", this.f46804b);
        zVarH.d("nonFatalStatusCodes", this.f46805c);
        return zVarH.toString();
    }
}
