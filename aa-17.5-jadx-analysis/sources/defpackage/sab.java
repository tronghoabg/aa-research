package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.CarWindowSpec;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class sab {
    public final qzf a;
    public final Handler b;
    public final CarDisplayId c;
    public qyw e;
    public final rdx h;
    private final saa i;
    private final rpa j;
    private final rpb k;
    public final Object d = new Object();
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final Map g = new HashMap();

    public sab(rdx rdxVar, CarDisplayId carDisplayId, qzf qzfVar, Looper looper, saa saaVar, rpa rpaVar, rpb rpbVar) {
        this.h = rdxVar;
        this.c = carDisplayId;
        this.a = qzfVar;
        this.b = new sss(looper);
        this.i = saaVar;
        this.j = rpaVar;
        this.k = rpbVar;
    }

    public final int a() throws qrz {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            throw new qrz(e);
        }
    }

    public final Point b() throws qrz {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            throw new qrz(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aezk, java.lang.Object] */
    public final Rect c() throws qrz {
        rdx rdxVar = this.h;
        return (Rect) ((rox) rdxVar.f.a()).b(new rct(rdxVar, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aezk, java.lang.Object] */
    public final CarDisplay d() throws qrz {
        rdx rdxVar = this.h;
        return (CarDisplay) ((rox) rdxVar.f.a()).b(new rct(rdxVar, 9));
    }

    public final void e(rzz rzzVar) {
        synchronized (this.d) {
            this.f.addIfAbsent(rzzVar);
            if (this.e == null) {
                qyv qyvVar = new qyv(this);
                this.e = qyvVar;
                try {
                    this.a.h(qyvVar);
                } catch (RemoteException e) {
                    rrd.c("CAR.WM", e, "registerVideoFocusListener RemoteException");
                }
            }
        }
    }

    public final void f(rby rbyVar, String str, Context context, CarWindowLayoutParams carWindowLayoutParams, int i) {
        if (rrd.e("CAR.WM", 2)) {
            rrd.d(2, "CAR.WM", null, "addView inflater %s", rbyVar);
        }
        rdx rdxVar = this.h;
        boolean z = carWindowLayoutParams.m;
        Handler handler = this.b;
        saa saaVar = this.i;
        boolean zBooleanValue = ((Boolean) saaVar.a.gu()).booleanValue();
        int i2 = carWindowLayoutParams.o;
        rpa rpaVar = this.j;
        rpb rpbVar = this.k;
        boolean zBooleanValue2 = ((Boolean) saaVar.i.gu()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) saaVar.f.gu()).booleanValue();
        boolean zBooleanValue4 = ((Boolean) saaVar.g.gu()).booleanValue();
        rat ratVarA = rau.a();
        ratVarA.h(((Boolean) saaVar.c.gu()).booleanValue());
        ratVarA.g(((Boolean) saaVar.d.gu()).booleanValue());
        ratVarA.i(((Boolean) saaVar.e.gu()).booleanValue());
        ratVarA.d(((Integer) saaVar.k.gu()).intValue());
        ratVarA.f(((Integer) saaVar.l.gu()).intValue());
        ratVarA.c(((Boolean) saaVar.j.gu()).booleanValue());
        xyc xycVar = saaVar.m;
        ratVarA.b(((Boolean) xycVar.gu()).booleanValue());
        ratVarA.e(((Boolean) saaVar.q.gu()).booleanValue());
        rzx rzxVar = new rzx(rdxVar, rbyVar, str, context, z, handler, i, zBooleanValue, i2, rpaVar, rpbVar, zBooleanValue2, zBooleanValue3, zBooleanValue4, ratVarA.a(), ((Boolean) xycVar.gu()).booleanValue(), ((Boolean) saaVar.n.gu()).booleanValue(), ((Boolean) saaVar.h.gu()).booleanValue(), ((Boolean) saaVar.o.gu()).booleanValue(), ((Boolean) saaVar.p.gu()).booleanValue());
        try {
            rzxVar.i = this.a.g(new CarWindowSpec(str, context.getPackageName(), carWindowLayoutParams, saaVar.b), rzxVar.u);
            this.g.put(rbyVar, rzxVar);
        } catch (RemoteException e) {
            rrd.b("CAR.WM", e, "addView RemoteException");
        }
    }

    public final void g(CarRegionId carRegionId, KeyEvent keyEvent) throws qrz {
        try {
            this.a.i(carRegionId, keyEvent);
        } catch (RemoteException e) {
            throw new qrz(e);
        }
    }

    public final void h(rzz rzzVar) {
        qyw qywVar;
        synchronized (this.d) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f;
            copyOnWriteArrayList.remove(rzzVar);
            if (copyOnWriteArrayList.isEmpty() && (qywVar = this.e) != null) {
                try {
                    this.a.k(qywVar);
                } catch (RemoteException e) {
                    rrd.c("CAR.WM", e, "unregisterVideoFocusListener RemoteException");
                }
                this.e = null;
            }
        }
    }

    public final void i(rby rbyVar) {
        rzx rzxVar = (rzx) this.g.remove(rbyVar);
        if (rzxVar == null) {
            rrd.d(5, "CAR.WM", null, "removeView inflater not found! : %s", rbyVar);
        } else {
            rrd.d(2, "CAR.WM", null, "removeView inflater %s", rbyVar);
            rbe.j(new rnq(rzxVar, 19));
        }
    }

    public final void j() {
        try {
            this.a.l();
        } catch (Exception e) {
            rrd.c("CAR.WM", e, "Exception calling requestVideoFocus");
        }
    }

    public final boolean k() {
        try {
            return this.a.p();
        } catch (Exception e) {
            rrd.c("CAR.WM", e, "Exception calling hasVideoFocus");
            return false;
        }
    }
}
