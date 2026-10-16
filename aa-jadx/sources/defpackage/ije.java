package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ije implements java.lang.Cloneable {
    public defpackage.ihx a;
    public boolean b;
    public boolean c;
    public android.graphics.Paint d;
    public android.graphics.Paint e;
    public defpackage.igw f;
    public defpackage.igw g;
    public boolean h;
    public boolean i;

    public ije() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.d = paint;
        paint.setFlags(385);
        this.d.setStyle(android.graphics.Paint.Style.FILL);
        this.d.setTypeface(android.graphics.Typeface.DEFAULT);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.e = paint2;
        paint2.setFlags(385);
        this.e.setStyle(android.graphics.Paint.Style.STROKE);
        this.e.setTypeface(android.graphics.Typeface.DEFAULT);
        this.a = defpackage.ihx.a();
    }

    protected final java.lang.Object clone() {
        try {
            defpackage.ije ijeVar = (defpackage.ije) super.clone();
            ijeVar.a = (defpackage.ihx) this.a.clone();
            ijeVar.d = new android.graphics.Paint(this.d);
            ijeVar.e = new android.graphics.Paint(this.e);
            return ijeVar;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.InternalError(e.toString());
        }
    }
}
