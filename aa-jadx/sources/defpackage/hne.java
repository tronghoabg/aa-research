package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hne implements defpackage.hkd {
    public final java.lang.String a;
    public final java.util.List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final defpackage.affc f;
    public final defpackage.afer g;
    public final defpackage.afer h;
    public final defpackage.afer i;

    public hne(java.lang.String str, java.util.List list, boolean z, boolean z2, boolean z3, defpackage.affc affcVar, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.afer aferVar3) {
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = affcVar;
        this.g = aferVar;
        this.h = aferVar2;
        this.i = aferVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hne)) {
            return false;
        }
        defpackage.hne hneVar = (defpackage.hne) obj;
        return defpackage.afga.f(this.a, hneVar.a) && defpackage.afga.f(this.b, hneVar.b) && this.c == hneVar.c && this.d == hneVar.d && this.e == hneVar.e && defpackage.afga.f(this.f, hneVar.f) && defpackage.afga.f(this.g, hneVar.g) && defpackage.afga.f(this.h, hneVar.h) && defpackage.afga.f(this.i, hneVar.i);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return ((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + defpackage.a.e(this.c)) * 31) + defpackage.a.e(this.d)) * 31) + defpackage.a.e(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final java.lang.String toString() {
        return "WebViewUiModel(url=" + this.a + ", headerStartActions=" + this.b + ", isDomStorageEnabled=" + this.c + ", shouldBlockNetworkLoads=" + this.d + ", isJavascriptEnabled=" + this.e + ", onUrlLoadingOverridden=" + this.f + ", onLoadError=" + this.g + ", onRequestAudioFocus=" + this.h + ", onReleaseAudioFocus=" + this.i + ")";
    }
}
