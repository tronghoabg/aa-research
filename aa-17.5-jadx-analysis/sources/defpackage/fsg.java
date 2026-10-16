package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fsg {
    public final Bitmap a;
    public final Map b;

    public fsg(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsg)) {
            return false;
        }
        fsg fsgVar = (fsg) obj;
        return affa.f(this.a, fsgVar.a) && affa.f(this.b, fsgVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Value(bitmap=" + this.a + ", extras=" + this.b + ")";
    }
}
