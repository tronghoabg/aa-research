package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class ncs extends ncu {
    private final ComponentName a;

    public ncs(ComponentName componentName) {
        this.a = componentName;
    }

    @Override // defpackage.ncx
    public final ComponentName a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncs) && affa.f(this.a, ((ncs) obj).a);
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        if (componentName == null) {
            return 0;
        }
        return componentName.hashCode();
    }

    public final String toString() {
        return "DismissedOrIgnoredByUser(navComponent=" + this.a + ")";
    }
}
