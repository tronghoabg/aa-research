package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class tlx {
    public final String a;
    public final Drawable b;

    public tlx(String str, Drawable drawable) {
        this.a = str;
        this.b = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlx)) {
            return false;
        }
        tlx tlxVar = (tlx) obj;
        return affa.f(this.a, tlxVar.a) && affa.f(this.b, tlxVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "Action(title=" + this.a + ", icon=" + this.b + ")";
    }
}
