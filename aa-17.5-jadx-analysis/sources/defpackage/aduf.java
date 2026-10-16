package defpackage;

import j$.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
final class aduf {
    final int a;
    final long b;
    final Set c;

    public aduf(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = ygr.n(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aduf adufVar = (aduf) obj;
            if (this.a == adufVar.a && this.b == adufVar.b && Objects.equals(this.c, adufVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), this.c);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.f("maxAttempts", this.a);
        xxgVarAo.g("hedgingDelayNanos", this.b);
        xxgVarAo.b("nonFatalStatusCodes", this.c);
        return xxgVarAo.toString();
    }
}
