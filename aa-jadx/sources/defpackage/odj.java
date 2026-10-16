package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class odj {
    public static final defpackage.odr a = new defpackage.odc();
    public final defpackage.noz b;
    public final defpackage.ocx c;
    public final android.util.Size d;
    public final android.graphics.Rect e;
    public defpackage.odk f;
    public defpackage.zbe g = defpackage.zbe.UNKNOWN_CONTEXT;
    public defpackage.odr h = a;
    public final defpackage.mcl i;

    public odj(defpackage.noz nozVar, defpackage.mcl mclVar, defpackage.ocx ocxVar, android.util.Size size, android.graphics.Rect rect) {
        this.b = nozVar;
        this.i = mclVar;
        this.c = ocxVar;
        this.d = size;
        this.e = rect;
    }

    public final void a(defpackage.zbd zbdVar) {
        defpackage.omf.u().o(this.g, zbdVar);
    }

    public final void b(java.lang.CharSequence charSequence) {
        this.h = new defpackage.ocw(charSequence, null);
    }

    public final void c(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable) {
        this.h = new defpackage.ocw(charSequence, drawable);
    }
}
