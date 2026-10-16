package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class msx {
    public final defpackage.msw a;
    public final defpackage.cgf b;
    public final boolean c;
    public final defpackage.affc d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ msx(defpackage.msw mswVar, defpackage.cgf cgfVar, boolean z, defpackage.affc affcVar, boolean z2, boolean z3, int i) {
        affcVar = (i & 8) != 0 ? new defpackage.mcz(13) : affcVar;
        boolean z4 = z & ((i & 4) == 0);
        boolean z5 = z2 & ((i & 16) == 0);
        boolean z6 = (i & 32) == 0;
        cgfVar.getClass();
        affcVar.getClass();
        this.a = mswVar;
        this.b = cgfVar;
        this.c = z4;
        this.d = affcVar;
        this.e = z5;
        this.f = z3 & z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.msx)) {
            return false;
        }
        defpackage.msx msxVar = (defpackage.msx) obj;
        return defpackage.afga.f(this.a, msxVar.a) && defpackage.afga.f(this.b, msxVar.b) && this.c == msxVar.c && defpackage.afga.f(this.d, msxVar.d) && this.e == msxVar.e && this.f == msxVar.f;
    }

    public final int hashCode() {
        defpackage.msw mswVar = this.a;
        return ((((((((((mswVar == null ? 0 : mswVar.hashCode()) * 31) + this.b.hashCode()) * 31) + defpackage.a.e(this.c)) * 31) + this.d.hashCode()) * 31) + defpackage.a.e(this.e)) * 31) + defpackage.a.e(this.f);
    }

    public final java.lang.String toString() {
        return "CardContentParams(cardContent=" + this.a + ", modifier=" + this.b + ", isHorizontal=" + this.c + ", onSwipeProgressChanged=" + this.d + ", isMultiCardLayout=" + this.e + ", minimized=" + this.f + ")";
    }
}
