package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
final class ncc {
    public final ComponentName a;
    public final boolean b;
    public final boolean c;

    public ncc(ComponentName componentName, boolean z, boolean z2) {
        this.a = componentName;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncc)) {
            return false;
        }
        ncc nccVar = (ncc) obj;
        return affa.f(this.a, nccVar.a) && this.b == nccVar.b && this.c == nccVar.c;
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        return ((((componentName == null ? 0 : componentName.hashCode()) * 31) + a.f(this.b)) * 31) + a.f(this.c);
    }

    public final String toString() {
        return "NavAppState(navComponentName=" + this.a + ", hasSuggestions=" + this.b + ", isNavigating=" + this.c + ")";
    }
}
