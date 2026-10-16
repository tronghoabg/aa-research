package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gaf implements gag {
    public final Bitmap a;
    public final Resources b;
    public final CarColor c;

    public gaf(Bitmap bitmap, Resources resources, CarColor carColor) {
        this.a = bitmap;
        this.b = resources;
        this.c = carColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaf)) {
            return false;
        }
        gaf gafVar = (gaf) obj;
        return affa.f(this.a, gafVar.a) && affa.f(this.b, gafVar.b) && affa.f(this.c, gafVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        CarColor carColor = this.c;
        return (iHashCode * 31) + (carColor == null ? 0 : carColor.hashCode());
    }

    public final String toString() {
        return "LazyBitmapIconInternalModel(bitmap=" + this.a + ", appResources=" + this.b + ", tint=" + this.c + ")";
    }
}
