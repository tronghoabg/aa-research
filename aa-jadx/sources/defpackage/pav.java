package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pav {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final defpackage.xqw d;
    public final java.util.List e;

    public pav(java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.xqw xqwVar, java.util.List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        xqwVar.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xqwVar;
        this.e = list;
    }

    public final boolean a(defpackage.pav pavVar) {
        return defpackage.afga.f(this.a, pavVar != null ? pavVar.a : null) && defpackage.afga.f(this.b, pavVar.b) && defpackage.afga.f(this.c, pavVar.c) && this.d == pavVar.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.pav)) {
            return false;
        }
        defpackage.pav pavVar = (defpackage.pav) obj;
        return defpackage.afga.f(this.a, pavVar.a) && defpackage.afga.f(this.b, pavVar.b) && defpackage.afga.f(this.c, pavVar.c) && this.d == pavVar.d && defpackage.afga.f(this.e, pavVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str = java.lang.String.format("WifiConfiguration(ssid=%s, bssid=%s, securityMode=%s, mostRecentlyUsedFrequenciesMhz=%s)", java.util.Arrays.copyOf(new java.lang.Object[]{this.a, this.b, this.d.name(), defpackage.afga.aK(this.e)}, 4));
        str.getClass();
        return str;
    }
}
