package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class nvd {
    public final ComponentName a;
    public final int b;

    public nvd(int i, mqc mqcVar) {
        this(i, mqcVar != null ? mqcVar.a() : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvd)) {
            return false;
        }
        nvd nvdVar = (nvd) obj;
        return this.b == nvdVar.b && affa.f(this.a, nvdVar.a);
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        return (this.b * 31) + (componentName == null ? 0 : componentName.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuppressedNotificationData(type=");
        int i = this.b;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? "MEDIA" : "NAVIGATION" : "PHONE" : "ALL"));
        sb.append(", componentName=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }

    public nvd(int i, ComponentName componentName) {
        this.b = i;
        this.a = componentName;
    }
}
