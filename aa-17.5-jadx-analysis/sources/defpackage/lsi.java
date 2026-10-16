package defpackage;

import android.content.ComponentName;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class lsi {
    public final ComponentName a;
    public final Optional b;

    public lsi(ComponentName componentName, Optional optional) {
        if (componentName == null) {
            throw new NullPointerException("Null appName");
        }
        this.a = componentName;
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsi) {
            lsi lsiVar = (lsi) obj;
            if (this.a.equals(lsiVar.a) && this.b.equals(lsiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.b;
        return "AppNameWithValue{appName=" + this.a.toString() + ", value=" + optional.toString() + "}";
    }

    public lsi() {
        throw null;
    }
}
