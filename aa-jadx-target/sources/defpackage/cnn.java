package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cnn {
    private final java.lang.String a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final long f;
    private final int g;
    private final boolean h;
    private final java.util.ArrayList i;
    private final defpackage.cnm j;
    private boolean k;

    public /* synthetic */ cnn(java.lang.String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        long jK;
        if ((i2 & 32) != 0) {
            float[] fArr = defpackage.clr.a;
            jK = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
        } else {
            jK = j;
        }
        int i3 = (i2 & 64) != 0 ? 5 : i;
        str = 1 == (i2 & 1) ? "" : str;
        boolean z2 = (i2 & 128) == 0;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = jK;
        this.g = i3;
        this.h = z2 & z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.i = arrayList;
        defpackage.cnm cnmVar = new defpackage.cnm(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = cnmVar;
        arrayList.add(cnmVar);
    }

    private final defpackage.cnm e() {
        java.util.ArrayList arrayList = this.i;
        return (defpackage.cnm) arrayList.get(arrayList.size() - 1);
    }

    private final void f() {
        if (this.k) {
            defpackage.csc.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
    }

    private static final defpackage.cou g(defpackage.cnm cnmVar) {
        return new defpackage.cou(cnmVar.a, cnmVar.b, cnmVar.c, cnmVar.d, cnmVar.e, cnmVar.f, cnmVar.g, cnmVar.h, cnmVar.i, cnmVar.j);
    }

    public final defpackage.cno a() {
        int i;
        f();
        while (this.i.size() > 1) {
            d();
        }
        java.lang.String str = this.a;
        float f = this.b;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.e;
        defpackage.cnm cnmVar = this.j;
        long j = this.f;
        int i2 = this.g;
        boolean z = this.h;
        defpackage.cou couVarG = g(cnmVar);
        synchronized (defpackage.cno.b) {
            i = defpackage.cno.a;
            defpackage.cno.a = i + 1;
        }
        defpackage.cno cnoVar = new defpackage.cno(str, f, f2, f3, f4, couVarG, j, i2, z, i);
        this.k = true;
        return cnoVar;
    }

    public final void b(java.lang.String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, java.util.List list) {
        f();
        this.i.add(new defpackage.cnm(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    public final void c(java.util.List list, int i, java.lang.String str, defpackage.cka ckaVar, float f, defpackage.cka ckaVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        f();
        e().j.add(new defpackage.coy(str, list, i, ckaVar, f, ckaVar2, f2, f3, i2, i3, f4, f5, f6, f7));
    }

    public final void d() {
        f();
        java.util.ArrayList arrayList = this.i;
        e().j.add(g((defpackage.cnm) arrayList.remove(arrayList.size() - 1)));
    }
}
