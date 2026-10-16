package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class lqe {
    public final lqd a;
    public final ComponentName b;

    public lqe(lqd lqdVar, ComponentName componentName) {
        this.a = lqdVar;
        this.b = componentName;
    }

    public final boolean equals(Object obj) {
        ComponentName componentName;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqe) {
            lqe lqeVar = (lqe) obj;
            if (this.a.equals(lqeVar.a) && ((componentName = this.b) != null ? componentName.equals(lqeVar.b) : lqeVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        ComponentName componentName = this.b;
        return (componentName == null ? 0 : componentName.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        ComponentName componentName = this.b;
        return "AutoplayTriggerParameters{decision=" + this.a.toString() + ", target=" + String.valueOf(componentName) + "}";
    }

    public lqe() {
        throw null;
    }
}
