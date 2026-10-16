package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nsz {
    public final android.graphics.Rect a;
    public final android.graphics.Rect b;
    public final int c;
    public final boolean d;
    public final android.graphics.Rect e;
    public final int f;
    public final java.lang.String g;
    public final int h;
    public final int i;
    public final com.google.android.gms.car.DropShadowParams j;

    public nsz(android.graphics.Rect rect, android.graphics.Rect rect2, int i, boolean z, android.graphics.Rect rect3, int i2, java.lang.String str, int i3, int i4, com.google.android.gms.car.DropShadowParams dropShadowParams) {
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

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        com.google.android.gms.car.DropShadowParams dropShadowParams;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.nsz) {
            defpackage.nsz nszVar = (defpackage.nsz) obj;
            android.graphics.Rect rect = this.a;
            if (rect != null ? rect.equals(nszVar.a) : nszVar.a == null) {
                if (this.b.equals(nszVar.b) && this.c == nszVar.c && this.d == nszVar.d && this.e.equals(nszVar.e) && this.f == nszVar.f && ((str = this.g) != null ? str.equals(nszVar.g) : nszVar.g == null) && this.h == nszVar.h && this.i == nszVar.i && ((dropShadowParams = this.j) != null ? dropShadowParams.equals(nszVar.j) : nszVar.j == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        android.graphics.Rect rect = this.a;
        int iHashCode = (((rect == null ? 0 : rect.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        int iHashCode2 = ((((((((iHashCode * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003;
        java.lang.String str = this.g;
        int iHashCode3 = (((((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003;
        com.google.android.gms.car.DropShadowParams dropShadowParams = this.j;
        return iHashCode3 ^ (dropShadowParams != null ? dropShadowParams.hashCode() : 0);
    }

    public final java.lang.String toString() {
        com.google.android.gms.car.DropShadowParams dropShadowParams = this.j;
        android.graphics.Rect rect = this.e;
        android.graphics.Rect rect2 = this.b;
        return "RegionInfo{bounds=" + java.lang.String.valueOf(this.a) + ", padding=" + java.lang.String.valueOf(rect2) + ", roundedCorners=" + this.c + ", onlyShowOutlinesWhenInset=" + this.d + ", insets=" + java.lang.String.valueOf(rect) + ", z=" + this.f + ", arguments=" + this.g + ", insetBehavior=" + this.h + ", insetDirection=" + this.i + ", dropShadowParams=" + java.lang.String.valueOf(dropShadowParams) + "}";
    }

    public nsz() {
        throw null;
    }
}
