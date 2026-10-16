package defpackage;

import android.content.ComponentName;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class ncv extends ncx {
    public final Duration a = wub.am(5);
    private final ComponentName b;

    public ncv(ComponentName componentName) {
        this.b = componentName;
    }

    @Override // defpackage.ncx
    public final ComponentName a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncv) && affa.f(this.b, ((ncv) obj).b);
    }

    public final int hashCode() {
        ComponentName componentName = this.b;
        if (componentName == null) {
            return 0;
        }
        return componentName.hashCode();
    }

    public final String toString() {
        return "ShowingSuggestions(navComponent=" + this.b + ")";
    }
}
