package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;

/* loaded from: classes2.dex */
public final class opm {
    public final String a;
    public final Drawable b;
    public final List c;

    public opm(String str, Drawable drawable, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = drawable;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opm)) {
            return false;
        }
        opm opmVar = (opm) obj;
        return affa.f(this.a, opmVar.a) && affa.f(this.b, opmVar.b) && affa.f(this.c, opmVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        return ((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "WidgetApp(appName=" + this.a + ", appIcon=" + this.b + ", widgets=" + this.c + ")";
    }
}
