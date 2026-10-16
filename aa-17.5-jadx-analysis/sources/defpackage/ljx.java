package defpackage;

import android.content.ComponentName;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class ljx {
    public final ComponentName a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final Resources g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    private final int l;

    public ljx(ComponentName componentName, String str, String str2, int i, int i2, int i3, Resources resources, int i4, int i5, int i6, boolean z, boolean z2) {
        this.a = componentName;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = resources;
        this.h = i4;
        this.l = i5;
        this.i = i6;
        this.j = z;
        this.k = z2;
    }

    public static ljw a() {
        ljw ljwVar = new ljw();
        ljwVar.f(new ComponentName("", ""));
        ljwVar.h("");
        ljwVar.d("");
        ljwVar.a = null;
        ljwVar.c(0);
        ljwVar.k(0);
        ljwVar.e(0);
        ljwVar.b(0);
        ljwVar.i(0);
        ljwVar.j(0);
        ljwVar.g(false);
        ljwVar.l(false);
        return ljwVar;
    }

    public final boolean equals(Object obj) {
        Resources resources;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ljx) {
            ljx ljxVar = (ljx) obj;
            if (this.a.equals(ljxVar.a) && this.b.equals(ljxVar.b) && this.c.equals(ljxVar.c) && this.d == ljxVar.d && this.e == ljxVar.e && this.f == ljxVar.f && ((resources = this.g) != null ? resources.equals(ljxVar.g) : ljxVar.g == null) && this.h == ljxVar.h && this.l == ljxVar.l && this.i == ljxVar.i && this.j == ljxVar.j && this.k == ljxVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        Resources resources = this.g;
        return (((((((((((((((((iHashCode * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (resources == null ? 0 : resources.hashCode())) * 1000003) ^ this.h) * 1000003) ^ this.l) * 1000003) ^ this.i) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true == this.k ? 1231 : 1237);
    }

    public final String toString() {
        Resources resources = this.g;
        return "MediaPackageInfo{componentName=" + String.valueOf(this.a) + ", packageName=" + this.b + ", appName=" + this.c + ", appIconResourceId=" + this.d + ", smallAppIconResourceId=" + this.e + ", attributionIconResourceId=" + this.f + ", packageResources=" + String.valueOf(resources) + ", accentColor=" + this.h + ", primaryColor=" + this.l + ", primaryColorDark=" + this.i + ", isCarLocalMedia=" + this.j + ", usesFallbackData=" + this.k + "}";
    }

    public ljx() {
        throw null;
    }
}
