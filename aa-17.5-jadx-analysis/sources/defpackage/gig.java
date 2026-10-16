package defpackage;

import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class gig implements gim {
    private final KeyEvent a;
    private final long b;

    public gig(KeyEvent keyEvent, long j) {
        this.a = keyEvent;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gig)) {
            return false;
        }
        gig gigVar = (gig) obj;
        return affa.f(this.a, gigVar.a) && this.b == gigVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.g(this.b);
    }

    public final String toString() {
        return "Key(event=" + cpo.a(this.a) + ", timeMillis=" + this.b + ")";
    }
}
