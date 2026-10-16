package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class fqn {
    public final Drawable a;
    public final boolean b;

    public fqn(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqn)) {
            return false;
        }
        fqn fqnVar = (fqn) obj;
        return affa.f(this.a, fqnVar.a) && this.b == fqnVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.f(this.b);
    }
}
