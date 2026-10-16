package defpackage;

import j$.time.Duration;

/* loaded from: classes2.dex */
public final class nef {
    public final Duration a;
    public final aitx b;

    public nef(Duration duration, aitx aitxVar) {
        this.a = duration;
        this.b = aitxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nef)) {
            return false;
        }
        nef nefVar = (nef) obj;
        return affa.f(this.a, nefVar.a) && affa.f(this.b, nefVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "KeepAround(duration=" + this.a + ", scope=" + this.b + ")";
    }
}
