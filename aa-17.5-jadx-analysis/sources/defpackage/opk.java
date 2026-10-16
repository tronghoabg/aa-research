package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class opk extends mva {
    public final Drawable a;

    public opk(Drawable drawable) {
        this.a = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opk) && affa.f(this.a, ((opk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StaticDrawable(drawable=" + this.a + ")";
    }
}
