package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lke {
    public final android.content.ComponentName a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final int e;
    public final int f;
    public final android.content.res.Resources g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    private final int l;

    public lke(android.content.ComponentName componentName, java.lang.String str, java.lang.String str2, int i, int i2, int i3, android.content.res.Resources resources, int i4, int i5, int i6, boolean z, boolean z2) {
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

    public static defpackage.lkd a() {
        defpackage.lkd lkdVar = new defpackage.lkd();
        lkdVar.f(new android.content.ComponentName("", ""));
        lkdVar.h("");
        lkdVar.d("");
        lkdVar.a = null;
        lkdVar.c(0);
        lkdVar.k(0);
        lkdVar.e(0);
        lkdVar.b(0);
        lkdVar.i(0);
        lkdVar.j(0);
        lkdVar.g(false);
        lkdVar.l(false);
        return lkdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        android.content.res.Resources resources;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lke) {
            defpackage.lke lkeVar = (defpackage.lke) obj;
            if (this.a.equals(lkeVar.a) && this.b.equals(lkeVar.b) && this.c.equals(lkeVar.c) && this.d == lkeVar.d && this.e == lkeVar.e && this.f == lkeVar.f && ((resources = this.g) != null ? resources.equals(lkeVar.g) : lkeVar.g == null) && this.h == lkeVar.h && this.l == lkeVar.l && this.i == lkeVar.i && this.j == lkeVar.j && this.k == lkeVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        android.content.res.Resources resources = this.g;
        return (((((((((((((((((iHashCode * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (resources == null ? 0 : resources.hashCode())) * 1000003) ^ this.h) * 1000003) ^ this.l) * 1000003) ^ this.i) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true == this.k ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        android.content.res.Resources resources = this.g;
        return "MediaPackageInfo{componentName=" + java.lang.String.valueOf(this.a) + ", packageName=" + this.b + ", appName=" + this.c + ", appIconResourceId=" + this.d + ", smallAppIconResourceId=" + this.e + ", attributionIconResourceId=" + this.f + ", packageResources=" + java.lang.String.valueOf(resources) + ", accentColor=" + this.h + ", primaryColor=" + this.l + ", primaryColorDark=" + this.i + ", isCarLocalMedia=" + this.j + ", usesFallbackData=" + this.k + "}";
    }

    public lke() {
        throw null;
    }
}
