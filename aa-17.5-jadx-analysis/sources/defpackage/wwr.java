package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class wwr extends wue {
    public static final /* synthetic */ int b = 0;
    public wwp a;

    public wwr(wwp wwpVar) {
        super(wwpVar);
        this.a = wwpVar;
    }

    public final void b(float f, float f2, float f3, float f4) {
        if (f == this.a.w.left && f2 == this.a.w.top && f3 == this.a.w.right && f4 == this.a.w.bottom) {
            return;
        }
        this.a.w.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new wwp(this.a);
        return this;
    }
}
