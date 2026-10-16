package defpackage;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class gik implements gim {
    private final MotionEvent a;
    private final long b;

    public gik(MotionEvent motionEvent, long j) {
        this.a = motionEvent;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gik)) {
            return false;
        }
        gik gikVar = (gik) obj;
        return affa.f(this.a, gikVar.a) && this.b == gikVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.g(this.b);
    }

    public final String toString() {
        return "Touchpad(event=" + this.a + ", timeMillis=" + this.b + ")";
    }
}
