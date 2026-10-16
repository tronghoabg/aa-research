package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gac implements gmo {
    public final Drawable a;
    public final Uri b;
    public final CarColor c;

    public gac(Drawable drawable, Uri uri, CarColor carColor) {
        this.a = drawable;
        this.b = uri;
        this.c = carColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gac)) {
            return false;
        }
        gac gacVar = (gac) obj;
        return affa.f(this.a, gacVar.a) && affa.f(this.b, gacVar.b) && affa.f(this.c, gacVar.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = drawable == null ? 0 : drawable.hashCode();
        Uri uri = this.b;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        int i = iHashCode * 31;
        CarColor carColor = this.c;
        return ((i + iHashCode2) * 31) + (carColor != null ? carColor.hashCode() : 0);
    }

    public final String toString() {
        return "CarIconInternalModel(drawable=" + this.a + ", iconUri=" + this.b + ", tint=" + this.c + ")";
    }

    public gac() {
        this(null, null, null);
    }
}
