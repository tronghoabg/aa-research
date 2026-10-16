package defpackage;

import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class gih implements gim {
    private final KeyEvent a;
    private final long b;

    public gih(KeyEvent keyEvent, long j) {
        this.a = keyEvent;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gih)) {
            return false;
        }
        gih gihVar = (gih) obj;
        return affa.f(this.a, gihVar.a) && this.b == gihVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.g(this.b);
    }

    public final String toString() {
        return "RotaryClick(event=" + cpo.a(this.a) + ", timeMillis=" + this.b + ")";
    }
}
