package defpackage;

import android.graphics.Rect;
import com.google.android.gms.car.DropShadowParams;

/* loaded from: classes.dex */
public final class nsm {
    public final Rect a;
    public final Rect b;
    public final int c;
    public final boolean d;
    public final Rect e;
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final DropShadowParams j;

    public nsm(Rect rect, Rect rect2, int i, boolean z, Rect rect3, int i2, String str, int i3, int i4, DropShadowParams dropShadowParams) {
        this.a = rect;
        this.b = rect2;
        this.c = i;
        this.d = z;
        this.e = rect3;
        this.f = i2;
        this.g = str;
        this.h = i3;
        this.i = i4;
        this.j = dropShadowParams;
    }

    public final boolean equals(Object obj) {
        String str;
        DropShadowParams dropShadowParams;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nsm) {
            nsm nsmVar = (nsm) obj;
            Rect rect = this.a;
            if (rect != null ? rect.equals(nsmVar.a) : nsmVar.a == null) {
                if (this.b.equals(nsmVar.b) && this.c == nsmVar.c && this.d == nsmVar.d && this.e.equals(nsmVar.e) && this.f == nsmVar.f && ((str = this.g) != null ? str.equals(nsmVar.g) : nsmVar.g == null) && this.h == nsmVar.h && this.i == nsmVar.i && ((dropShadowParams = this.j) != null ? dropShadowParams.equals(nsmVar.j) : nsmVar.j == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Rect rect = this.a;
        int iHashCode = (((rect == null ? 0 : rect.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        int iHashCode2 = ((((((((iHashCode * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003;
        String str = this.g;
        int iHashCode3 = (((((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003;
        DropShadowParams dropShadowParams = this.j;
        return iHashCode3 ^ (dropShadowParams != null ? dropShadowParams.hashCode() : 0);
    }

    public final String toString() {
        DropShadowParams dropShadowParams = this.j;
        Rect rect = this.e;
        Rect rect2 = this.b;
        return "RegionInfo{bounds=" + String.valueOf(this.a) + ", padding=" + String.valueOf(rect2) + ", roundedCorners=" + this.c + ", onlyShowOutlinesWhenInset=" + this.d + ", insets=" + String.valueOf(rect) + ", z=" + this.f + ", arguments=" + this.g + ", insetBehavior=" + this.h + ", insetDirection=" + this.i + ", dropShadowParams=" + String.valueOf(dropShadowParams) + "}";
    }

    public nsm() {
        throw null;
    }
}
