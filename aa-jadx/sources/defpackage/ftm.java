package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ftm {
    public final android.content.Context a;
    public final android.graphics.Bitmap.Config b;
    public final android.graphics.ColorSpace c;
    public final defpackage.ftx d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final java.lang.String h;
    public final defpackage.ajiu i;
    public final defpackage.ftr j;
    public final defpackage.fto k;
    public final defpackage.ftb l;
    public final defpackage.ftb m;
    public final defpackage.ftb n;
    public final int o;

    public ftm(android.content.Context context, android.graphics.Bitmap.Config config, defpackage.ftx ftxVar, int i, boolean z, defpackage.ajiu ajiuVar, defpackage.ftr ftrVar, defpackage.fto ftoVar, defpackage.ftb ftbVar, defpackage.ftb ftbVar2, defpackage.ftb ftbVar3) {
        config.getClass();
        if (i == 0) {
            throw null;
        }
        ajiuVar.getClass();
        this.a = context;
        this.b = config;
        this.c = null;
        this.d = ftxVar;
        this.o = i;
        this.e = z;
        this.f = false;
        this.g = true;
        this.h = null;
        this.i = ajiuVar;
        this.j = ftrVar;
        this.k = ftoVar;
        this.l = ftbVar;
        this.m = ftbVar2;
        this.n = ftbVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ftm)) {
            return false;
        }
        defpackage.ftm ftmVar = (defpackage.ftm) obj;
        if (!defpackage.afga.f(this.a, ftmVar.a) || this.b != ftmVar.b) {
            return false;
        }
        android.graphics.ColorSpace colorSpace = ftmVar.c;
        if (!defpackage.afga.f(null, null) || !defpackage.afga.f(this.d, ftmVar.d) || this.o != ftmVar.o || this.e != ftmVar.e) {
            return false;
        }
        boolean z = ftmVar.f;
        boolean z2 = ftmVar.g;
        java.lang.String str = ftmVar.h;
        return defpackage.afga.f(null, null) && defpackage.afga.f(this.i, ftmVar.i) && defpackage.afga.f(this.j, ftmVar.j) && defpackage.afga.f(this.k, ftmVar.k) && this.l == ftmVar.l && this.m == ftmVar.m && this.n == ftmVar.n;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode()) * 31) + this.o) * 31) + defpackage.a.e(this.e)) * 31) + defpackage.a.e(false)) * 31) + defpackage.a.e(true)) * 961) + defpackage.ailc.a(this.i)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }
}
