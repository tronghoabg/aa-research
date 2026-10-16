package defpackage;

import android.net.Uri;
import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gbi implements gbg {
    public final Uri a;
    public final int b;
    public final String c;
    private final CarColor d;

    public gbi(Uri uri, CarColor carColor, int i, String str) {
        this.a = uri;
        this.d = carColor;
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.gbg
    public final CarColor a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbi)) {
            return false;
        }
        gbi gbiVar = (gbi) obj;
        return affa.f(this.a, gbiVar.a) && affa.f(this.d, gbiVar.d) && this.b == gbiVar.b && affa.f(this.c, gbiVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CarColor carColor = this.d;
        int iHashCode2 = (((iHashCode + (carColor == null ? 0 : carColor.hashCode())) * 31) + this.b) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LazyUriIconUiModel(uri=" + this.a + ", tint=" + this.d + ", themeResId=" + this.b + ", packageName=" + this.c + ")";
    }
}
