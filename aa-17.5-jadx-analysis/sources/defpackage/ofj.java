package defpackage;

import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
final class ofj {
    public final CarCall a;
    public final boolean b;

    public ofj(CarCall carCall, boolean z) {
        carCall.getClass();
        this.a = carCall;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofj)) {
            return false;
        }
        ofj ofjVar = (ofj) obj;
        return affa.f(this.a, ofjVar.a) && this.b == ofjVar.b;
    }

    public final int hashCode() {
        return (this.a.a * 31) + a.f(this.b);
    }

    public final String toString() {
        return "CallState(call=" + this.a + ", muted=" + this.b + ")";
    }
}
