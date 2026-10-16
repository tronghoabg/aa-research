package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class ijj implements Drawable.Callback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ijj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (this.b != 0) {
            ((fhl) this.a).invalidateSelf();
            return;
        }
        drawable.getClass();
        ijk ijkVar = (ijk) this.a;
        ijkVar.b.b(Integer.valueOf(ijkVar.g() + 1));
        ijkVar.c.b(new cjd(ijl.a(ijkVar.a)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (this.b != 0) {
            ((fhl) this.a).scheduleSelf(runnable, j);
            return;
        }
        drawable.getClass();
        runnable.getClass();
        ijl.b().postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.b != 0) {
            ((fhl) this.a).unscheduleSelf(runnable);
            return;
        }
        drawable.getClass();
        runnable.getClass();
        ijl.b().removeCallbacks(runnable);
    }
}
