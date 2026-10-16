package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class jjk {
    public static final yph a = yph.c("CAR.WM.WIN.CornerMask");
    public final SurfaceView b;
    public final Rect c;
    public float d;
    public int e;
    public List f;
    private final int g;
    private final Paint h;
    private final Paint i;
    private final ili j;

    public jjk(SurfaceView surfaceView, int i, Rect rect, float f, int i2) {
        this.b = surfaceView;
        this.g = i;
        this.c = new Rect(rect);
        this.d = f;
        this.e = i2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.h = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.i = paint2;
        ili iliVar = new ili(this, 2);
        this.j = iliVar;
        surfaceView.getHolder().addCallback(iliVar);
        Surface surface = surfaceView.getHolder().getSurface();
        if (surface == null || !surface.isValid()) {
            return;
        }
        f();
    }

    public final void a() throws Surface.OutOfResourcesException, IllegalArgumentException {
        List<jji> list = this.f;
        if (list == null || this.c.isEmpty() || this.d <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((jji) it.next()).a()) {
                    return;
                }
            }
        }
        Paint paint = this.h;
        paint.setColor(this.e);
        for (jji jjiVar : list) {
            Paint paint2 = this.i;
            float f = this.d;
            Surface surface = jjiVar.c;
            if (surface.isValid()) {
                jjj jjjVar = jjiVar.a;
                float f2 = true != jjjVar.g ? 0.0f : f;
                float f3 = true != jjjVar.h ? 0.0f : f;
                try {
                    Canvas canvasLockCanvas = surface.lockCanvas(null);
                    if (canvasLockCanvas != null) {
                        try {
                            canvasLockCanvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f, paint);
                            canvasLockCanvas.drawCircle(f2, f3, f, paint2);
                            jjiVar.c.unlockCanvasAndPost(canvasLockCanvas);
                        } catch (Throwable th) {
                            jjiVar.c.unlockCanvasAndPost(canvasLockCanvas);
                            throw th;
                        }
                    } else {
                        continue;
                    }
                } catch (Exception e) {
                    ((ype) ((ype) a.h()).p(e)).u("Failed to render rounded corner mask");
                }
            }
        }
    }

    public final void b(SurfaceControl.Transaction transaction) {
        List list = this.f;
        if (list != null) {
            if (list.isEmpty()) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((jji) it.next()).a()) {
                }
            }
            return;
        }
        SurfaceControl surfaceControl = this.b.getSurfaceControl();
        if (surfaceControl == null || !surfaceControl.isValid()) {
            return;
        }
        int iMax = Math.max(1, afgi.k(this.d));
        d();
        List list2 = jjj.e;
        ArrayList arrayList = new ArrayList(woy.bp(list2, 10));
        afao afaoVar = new afao((afar) list2);
        while (afaoVar.hasNext()) {
            jjj jjjVar = (jjj) afaoVar.next();
            String str = jjjVar.f;
            SurfaceControl surfaceControlBuild = new SurfaceControl.Builder().setName("RoundedCornerMaskOverlay_" + str + "_window_" + this.g).setParent(surfaceControl).setBufferSize(iMax, iMax).setFormat(1).build();
            surfaceControlBuild.getClass();
            transaction.setLayer(surfaceControlBuild, Alert.DURATION_SHOW_INDEFINITELY).setVisibility(surfaceControlBuild, true);
            arrayList.add(new jji(jjjVar, surfaceControlBuild, new Surface(surfaceControlBuild)));
        }
        this.f = arrayList;
    }

    public final void c() {
        this.b.getHolder().removeCallback(this.j);
        d();
    }

    public final void d() {
        List<jji> list = this.f;
        if (list != null) {
            for (jji jjiVar : list) {
                jjiVar.c.release();
                jjiVar.b.release();
            }
        }
        this.f = null;
    }

    public final void e(SurfaceControl.Transaction transaction) {
        SurfaceControl surfaceControl = this.b.getSurfaceControl();
        if (surfaceControl != null && surfaceControl.isValid()) {
            Rect rect = this.c;
            if (!rect.isEmpty()) {
                transaction.setCrop(surfaceControl, rect).getClass();
            }
        }
        List<jji> list = this.f;
        if (list == null) {
            return;
        }
        if (this.c.isEmpty()) {
            return;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((jji) it.next()).a()) {
                    return;
                }
            }
        }
        int iMax = Math.max(1, afgi.k(this.d));
        for (jji jjiVar : list) {
            jjj jjjVar = jjiVar.a;
            transaction.setPosition(jjiVar.b, jjjVar.g ? r1.left : r1.right - iMax, jjjVar.h ? r1.top : r1.bottom - iMax).getClass();
        }
    }

    public final void f() {
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        try {
            b(transaction);
            e(transaction);
            transaction.apply();
            affa.n(transaction, null);
            a();
        } finally {
        }
    }
}
