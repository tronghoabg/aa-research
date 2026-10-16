package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Size;

/* loaded from: classes2.dex */
public final class oco {
    public static final ocx a = new och();
    public final noh b;
    public final ocd c;
    public final Size d;
    public final Rect e;
    public ocp f;
    public yzz g = yzz.UNKNOWN_CONTEXT;
    public ocx h = a;
    public final mcd i;

    public oco(noh nohVar, mcd mcdVar, ocd ocdVar, Size size, Rect rect) {
        this.b = nohVar;
        this.i = mcdVar;
        this.c = ocdVar;
        this.d = size;
        this.e = rect;
    }

    public final void a(yzy yzyVar) {
        ebf.j().o(this.g, yzyVar);
    }

    public final void b(CharSequence charSequence) {
        this.h = new occ(charSequence, null);
    }

    public final void c(CharSequence charSequence, Drawable drawable) {
        this.h = new occ(charSequence, drawable);
    }
}
