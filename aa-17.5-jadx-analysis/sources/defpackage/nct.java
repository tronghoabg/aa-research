package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class nct extends ncu {
    private final ComponentName a;

    public nct(ComponentName componentName) {
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
        return (obj instanceof nct) && affa.f(this.a, ((nct) obj).a);
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        if (componentName == null) {
            return 0;
        }
        return componentName.hashCode();
    }

    public final String toString() {
        return "GuidedNavigation(navComponent=" + this.a + ")";
    }
}
