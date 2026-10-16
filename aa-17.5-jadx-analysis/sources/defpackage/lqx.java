package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class lqx {
    public final ComponentName a;
    public final ComponentName b;

    public lqx(ComponentName componentName, ComponentName componentName2) {
        this.a = componentName;
        this.b = componentName2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqx) {
            lqx lqxVar = (lqx) obj;
            ComponentName componentName = this.a;
            if (componentName != null ? componentName.equals(lqxVar.a) : lqxVar.a == null) {
                ComponentName componentName2 = this.b;
                if (componentName2 != null ? componentName2.equals(lqxVar.b) : lqxVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        int iHashCode = componentName == null ? 0 : componentName.hashCode();
        ComponentName componentName2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (componentName2 != null ? componentName2.hashCode() : 0);
    }

    public final String toString() {
        ComponentName componentName = this.b;
        return "PlayingAppAndDefaultAppPair{playingApp=" + String.valueOf(this.a) + ", defaultApp=" + String.valueOf(componentName) + "}";
    }

    public lqx() {
        throw null;
    }
}
