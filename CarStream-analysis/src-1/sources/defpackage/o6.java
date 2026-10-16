package defpackage;

import android.view.SurfaceHolder;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class o6 implements SurfaceHolder.Callback {
    public final /* synthetic */ r6 a;

    public o6(r6 r6Var) {
        this.a = r6Var;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.d = surfaceHolder.getSurface();
        int i4 = this.a.c.getResources().getDisplayMetrics().densityDpi;
        int i5 = b3.a;
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        if (i4 > 0) {
            b3.c = i4;
        }
        int i6 = i2 - (i2 & 1);
        int i7 = i3 - (i3 & 1);
        if (i6 == b3.g) {
            int i8 = b3.h;
        }
        b3.g = i6;
        b3.h = i7;
        b3.b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.d = surfaceHolder.getSurface();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.d = null;
        this.a.b();
    }
}
