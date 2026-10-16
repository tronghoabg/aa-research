package defpackage;

import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class gil implements gim {
    private final KeyEvent a;
    private final long b;

    public gil(KeyEvent keyEvent, long j) {
        this.a = keyEvent;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gil)) {
            return false;
        }
        gil gilVar = (gil) obj;
        return affa.f(this.a, gilVar.a) && this.b == gilVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.g(this.b);
    }

    public final String toString() {
        return "TouchpadClick(event=" + this.a + ", timeMillis=" + this.b + ")";
    }
}
