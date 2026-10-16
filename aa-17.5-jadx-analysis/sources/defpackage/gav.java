package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gav implements gbg {
    public final Bitmap a;
    private final Resources b;
    private final CarColor c;

    public gav(Bitmap bitmap, Resources resources, CarColor carColor) {
        this.a = bitmap;
        this.b = resources;
        this.c = carColor;
    }

    @Override // defpackage.gbg
    public final CarColor a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gav)) {
            return false;
        }
        gav gavVar = (gav) obj;
        return affa.f(this.a, gavVar.a) && affa.f(this.b, gavVar.b) && affa.f(this.c, gavVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        CarColor carColor = this.c;
        return (iHashCode * 31) + (carColor == null ? 0 : carColor.hashCode());
    }

    public final String toString() {
        return "LazyBitmapIconUiModel(bitmap=" + this.a + ", appResources=" + this.b + ", tint=" + this.c + ")";
    }
}
