package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class hmb {
    public static final defpackage.hmb a;
    public final android.graphics.Rect b;
    public final int c;
    public final int d;
    public final defpackage.gib f;
    public final boolean g;
    public final int i;
    public final boolean j;
    public final int h = 0;
    public final boolean e = false;

    static {
        defpackage.hmb hmbVar = new defpackage.hmb(defpackage.gib.c, false, null, 0, 0, 2, false);
        a = hmbVar;
        defpackage.hma hmaVarA = a(hmbVar);
        hmaVarA.d = 10;
        hmaVarA.c = new android.graphics.Rect();
        hmaVarA.a();
    }

    public hmb(defpackage.gib gibVar, boolean z, android.graphics.Rect rect, int i, int i2, int i3, boolean z2) {
        this.f = gibVar;
        this.g = z;
        this.b = rect;
        this.c = i;
        this.d = i2;
        this.i = i3;
        this.j = z2;
    }

    public static defpackage.hma a(defpackage.hmb hmbVar) {
        defpackage.hma hmaVar = new defpackage.hma();
        hmaVar.a = hmbVar.f;
        hmaVar.b = hmbVar.g;
        hmaVar.c = hmbVar.b;
        hmaVar.d = hmbVar.c;
        hmaVar.e = hmbVar.d;
        int i = hmbVar.h;
        boolean z = hmbVar.e;
        hmaVar.f = hmbVar.i;
        hmaVar.g = hmbVar.j;
        return hmaVar;
    }
}
