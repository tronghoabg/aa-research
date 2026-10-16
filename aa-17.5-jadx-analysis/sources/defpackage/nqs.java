package defpackage;

/* loaded from: classes.dex */
public final class nqs implements nqt {
    public final boolean a;

    public nqs(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqs) && this.a == ((nqs) obj).a;
    }

    public final int hashCode() {
        return a.f(this.a);
    }

    public final String toString() {
        return "ImmersiveModeEnabledState(setVerticalRail=" + this.a + ")";
    }
}
