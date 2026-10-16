package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class ncw extends ncu {
    private final ComponentName a;

    public ncw(ComponentName componentName) {
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
        return (obj instanceof ncw) && affa.f(this.a, ((ncw) obj).a);
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        if (componentName == null) {
            return 0;
        }
        return componentName.hashCode();
    }

    public final String toString() {
        return "WaitingForSuggestionsBackground(navComponent=" + this.a + ")";
    }
}
