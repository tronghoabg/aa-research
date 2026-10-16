package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class ooc extends mva {
    public final Drawable a;

    public ooc(Drawable drawable) {
        this.a = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ooc) && affa.f(this.a, ((ooc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AppIcon(icon=" + this.a + ")";
    }
}
