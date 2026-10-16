package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes2.dex */
final class iiw implements Cloneable {
    public ihp a;
    public boolean b;
    public boolean c;
    public Paint d;
    public Paint e;
    public igo f;
    public igo g;
    public boolean h;
    public boolean i;

    public iiw() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(385);
        this.d.setStyle(Paint.Style.FILL);
        this.d.setTypeface(Typeface.DEFAULT);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(385);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setTypeface(Typeface.DEFAULT);
        this.a = ihp.a();
    }

    protected final Object clone() {
        try {
            iiw iiwVar = (iiw) super.clone();
            iiwVar.a = (ihp) this.a.clone();
            iiwVar.d = new Paint(this.d);
            iiwVar.e = new Paint(this.e);
            return iiwVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
