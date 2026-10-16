package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nth {
    public final int a;
    public final float b;
    public final float c;
    public final boolean d;
    public final defpackage.ygw e;
    public final defpackage.ygw f;
    private final boolean g;
    private final boolean h;
    private final float i;
    private final int j;

    static {
        defpackage.yqm.c("GH.ShadeState");
    }

    public nth(int i, boolean z, boolean z2, android.graphics.Rect rect, android.graphics.Rect rect2, float f) {
        float fWidth;
        int iWidth;
        float f2;
        this.j = i;
        this.g = z;
        this.h = z2;
        this.i = f;
        if (rect.width() <= 0 || rect.height() <= 0) {
            throw new java.lang.IllegalArgumentException("shadeBounds must have positive dimensions");
        }
        if (rect2.width() <= 0 || rect2.height() <= 0) {
            throw new java.lang.IllegalArgumentException("dashboardBounds must have positive dimensions");
        }
        int i2 = i - 1;
        int i3 = (i2 == 4 || i2 == 5) ? 2 : 1;
        this.a = i3;
        if (i3 > 1) {
            f2 = 0.33333334f;
        } else {
            if (a()) {
                fWidth = rect2.height();
                iWidth = rect.height();
            } else {
                fWidth = rect2.width();
                iWidth = rect.width();
            }
            f2 = fWidth / iWidth;
        }
        this.b = f2;
        float f3 = 1.0f - f2;
        this.c = f3;
        this.d = z == z2 && !a();
        float fHeight = a() ? rect.height() : rect.width();
        float f4 = f * 48.0f;
        float f5 = fHeight - f4;
        float f6 = f2 * f5;
        float f7 = f5 * f3;
        float f8 = i3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Float.valueOf(f4));
        float f9 = f4 + f6;
        arrayList.add(java.lang.Float.valueOf(f9));
        for (int i4 = 1; i4 < i3; i4 = 2) {
            arrayList.add(java.lang.Float.valueOf((f7 / f8) + f9));
        }
        arrayList.add(java.lang.Float.valueOf(fHeight));
        int i5 = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        java.util.Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            next.getClass();
            float fFloatValue = ((java.lang.Number) next).floatValue();
            if (!a()) {
                fFloatValue = this.d ? fHeight - fFloatValue : fFloatValue - fHeight;
            }
            ygrVar.i(java.lang.Integer.valueOf(defpackage.afhi.k(fFloatValue)));
        }
        defpackage.ygw ygwVarG = ygrVar.g();
        ygwVarG.getClass();
        this.e = ygwVarG;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i6 = ((defpackage.ymx) ygwVarG).c;
        int i7 = 0;
        while (i7 < i6) {
            arrayList2.add(new com.google.android.gms.car.FlingStepRange(i7 >= 2 ? 1 : 0, ((defpackage.ymx) this.e).c - 1));
            i7++;
        }
        defpackage.ygw ygwVarO = defpackage.ygw.o(arrayList2);
        ygwVarO.getClass();
        this.f = ygwVarO;
    }

    public final boolean a() {
        int i = this.j;
        return i == 11 || i == 12 || i == 17;
    }
}
