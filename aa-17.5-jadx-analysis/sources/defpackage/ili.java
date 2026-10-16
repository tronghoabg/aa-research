package defpackage;

import android.view.SurfaceHolder;
import com.android.car.libraries.apphost.view.SurfaceViewContainer;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class ili implements SurfaceHolder.Callback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ili(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 == 0) {
            ((ype) ilj.a.l().ai((char) 286)).u("Surface created");
            return;
        }
        if (i4 != 1) {
            surfaceHolder.getClass();
            ((jjk) this.a).f();
        } else {
            ajmd ajmdVar = ((SurfaceViewContainer) this.a).c;
            if (ajmdVar != null) {
                ajmdVar.L();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        int i = this.b;
        if (i == 0) {
            ((ype) ilj.a.l().ai((char) 287)).u("Surface ready");
            ((Semaphore) this.a).release();
        } else {
            if (i != 1) {
                surfaceHolder.getClass();
                ((jjk) this.a).f();
                return;
            }
            SurfaceViewContainer surfaceViewContainer = (SurfaceViewContainer) this.a;
            surfaceViewContainer.b = true;
            if (surfaceViewContainer.c != null) {
                gks.b("CarApp.H.Tem", "SurfaceProvider: Surface created");
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        int i = this.b;
        if (i == 0) {
            ((ype) ilj.a.l().ai((char) 288)).u("Surface destroyed");
            return;
        }
        if (i != 1) {
            surfaceHolder.getClass();
            ((jjk) this.a).d();
            return;
        }
        SurfaceViewContainer surfaceViewContainer = (SurfaceViewContainer) this.a;
        surfaceViewContainer.b = false;
        ajmd ajmdVar = surfaceViewContainer.c;
        if (ajmdVar != null) {
            ajmdVar.M();
        }
    }
}
