package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class lra {
    public final ComponentName a;
    public final lmd b;

    public lra(ComponentName componentName, lmd lmdVar) {
        this.a = componentName;
        this.b = lmdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lra) {
            lra lraVar = (lra) obj;
            ComponentName componentName = this.a;
            if (componentName != null ? componentName.equals(lraVar.a) : lraVar.a == null) {
                lmd lmdVar = this.b;
                if (lmdVar != null ? lmdVar.equals(lraVar.b) : lraVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        int iHashCode = componentName == null ? 0 : componentName.hashCode();
        lmd lmdVar = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (lmdVar != null ? lmdVar.hashCode() : 0);
    }

    public final String toString() {
        lmd lmdVar = this.b;
        return "AppAndMetadata{appName=" + String.valueOf(this.a) + ", metadata=" + String.valueOf(lmdVar) + "}";
    }

    public lra() {
        throw null;
    }
}
