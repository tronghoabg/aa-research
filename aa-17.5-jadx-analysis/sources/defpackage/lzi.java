package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class lzi {
    public final ComponentName a;
    private final int b;

    public lzi(ComponentName componentName, int i) {
        this.a = componentName;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lzi) {
            lzi lziVar = (lzi) obj;
            if (this.a.equals(lziVar.a)) {
                int i = this.b;
                int i2 = lziVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        a.aJ(i);
        return i ^ (iHashCode * 1000003);
    }

    public final String toString() {
        int i = this.b;
        return a.bC(i != 1 ? i != 2 ? i != 3 ? "null" : "CONNECTED" : "CONNECTING" : "NOT_CONNECTED", String.valueOf(this.a), "NavigationConnectionStatus{componentName=", ", state=", "}");
    }

    public lzi() {
        throw null;
    }
}
