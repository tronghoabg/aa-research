package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class frk extends a {
    public final Drawable a;
    public final boolean b;
    public final int c;

    public frk(Drawable drawable, boolean z, int i) {
        super(null);
        this.a = drawable;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frk)) {
            return false;
        }
        frk frkVar = (frk) obj;
        return affa.f(this.a, frkVar.a) && this.b == frkVar.b && this.c == frkVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.f(this.b)) * 31) + this.c;
    }
}
