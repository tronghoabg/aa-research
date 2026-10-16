package defpackage;

import android.net.Uri;
import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gal implements gag {
    public final Uri a;
    public final CarColor b;
    public final int c;
    public final String d;

    public gal(Uri uri, CarColor carColor, int i, String str) {
        this.a = uri;
        this.b = carColor;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gal)) {
            return false;
        }
        gal galVar = (gal) obj;
        return affa.f(this.a, galVar.a) && affa.f(this.b, galVar.b) && this.c == galVar.c && affa.f(this.d, galVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarColor carColor = this.b;
        int iHashCode2 = (((iHashCode + (carColor == null ? 0 : carColor.hashCode())) * 31) + this.c) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LazyUriIconInternalModel(uri=" + this.a + ", tint=" + this.b + ", themeResId=" + this.c + ", packageName=" + this.d + ")";
    }
}
