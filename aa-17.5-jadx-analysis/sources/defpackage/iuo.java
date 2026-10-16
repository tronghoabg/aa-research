package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Size;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class iuo extends rjw {
    public static final yph a = yph.c("CAR.SERVICE");
    public final iuu b;
    public final Object c = new Object();
    public CarDisplay d;
    public Rect e;
    public List f;
    public CarDisplayUiFeatures g;
    public final jdc h;
    public final jdc i;
    public final jdc j;
    private final jdc k;

    public iuo(iuu iuuVar) {
        final int i = 1;
        this.k = new jdc(this, "CarUiInfo", new iun() { // from class: iuj
            @Override // defpackage.iun
            public final void a(Object obj, Object obj2) throws RemoteException {
                if (i != 0) {
                    ((qyn) obj).e((CarUiInfo) obj2);
                } else {
                    ((rkd) obj).e((CarDisplay) obj2);
                }
            }
        });
        final int i2 = 0;
        this.h = new jdc(this, "CarDisplay", new iun() { // from class: iuj
            @Override // defpackage.iun
            public final void a(Object obj, Object obj2) throws RemoteException {
                if (i2 != 0) {
                    ((qyn) obj).e((CarUiInfo) obj2);
                } else {
                    ((rkd) obj).e((CarDisplay) obj2);
                }
            }
        });
        this.i = new jdc(this, "contentInsets", new iul() { // from class: iuk
            @Override // defpackage.iul
            public final void a(Object obj, CarDisplayId carDisplayId, Object obj2) throws RemoteException {
                if (i != 0) {
                    ((rkg) obj).e(carDisplayId, (Rect) obj2);
                } else {
                    ((rkp) obj).e(carDisplayId, (CarDisplayUiFeatures) obj2);
                }
            }
        });
        this.j = new jdc(this, "displayUiFeatures", new iul() { // from class: iuk
            @Override // defpackage.iul
            public final void a(Object obj, CarDisplayId carDisplayId, Object obj2) throws RemoteException {
                if (i2 != 0) {
                    ((rkg) obj).e(carDisplayId, (Rect) obj2);
                } else {
                    ((rkp) obj).e(carDisplayId, (CarDisplayUiFeatures) obj2);
                }
            }
        });
        this.b = iuuVar;
    }

    public static iuw b(iuu iuuVar) {
        iuw iuwVarA = iuuVar.o.a();
        if (iuwVarA != null) {
            return iuwVarA;
        }
        throw new IllegalStateException("Display not configured.");
    }

    @Override // defpackage.rjx
    public final Rect a() {
        Rect rect;
        synchronized (this.c) {
            rect = this.e;
            if (rect == null) {
                rect = b(this.b).o;
                this.e = rect;
            }
        }
        return rect;
    }

    @Override // defpackage.rjx
    public final CarUiInfo c() {
        iuu iuuVar = this.b;
        iuuVar.f.ak();
        ikb ikbVar = iuuVar.q;
        CarUiInfo carUiInfo = ikbVar != null ? ikbVar.m : null;
        if (carUiInfo != null) {
            return carUiInfo;
        }
        throw new IllegalStateException("No CarUiInfo found for display: ".concat(String.valueOf(String.valueOf(iuuVar.j))));
    }

    @Override // defpackage.rjx
    public final qzf d() {
        if (acrh.a.gu().b()) {
            this.b.f.al();
        }
        return ((ina) this.b.p).ar;
    }

    public final CarDisplay f(iuw iuwVar, iuu iuuVar) {
        rjj rjjVar;
        int i = iuuVar.k.d;
        Size size = iuwVar.m;
        Point point = new Point(size.getWidth(), size.getHeight());
        Rect rect = new Rect(iuwVar.n);
        Rect rect2 = new Rect(iuwVar.o);
        yfq yfqVarO = yfq.o(iuwVar.p);
        xkd xkdVar = iuuVar.l;
        int iOrdinal = xkdVar.ordinal();
        if (iOrdinal == 0) {
            rjjVar = rjj.a;
        } else if (iOrdinal == 271) {
            rjjVar = rjj.b;
        } else {
            if (iOrdinal != 277) {
                throw new IllegalArgumentException("No valid content type for key code: " + xkdVar.es);
            }
            rjjVar = rjj.c;
        }
        return new CarDisplay(iuuVar.j, i, iuwVar.i, point, rect, rect2, yfqVarO, rjjVar.ordinal(), UUID.randomUUID().toString(), iuwVar.r);
    }

    @Override // defpackage.rjx
    public final CarDisplay g() {
        CarDisplay carDisplayF;
        synchronized (this.c) {
            carDisplayF = this.d;
            if (carDisplayF == null) {
                iuu iuuVar = this.b;
                carDisplayF = f(b(iuuVar), iuuVar);
                this.d = carDisplayF;
            }
        }
        return carDisplayF;
    }

    @Override // defpackage.rjx
    public final CarDisplayUiFeatures h() {
        CarDisplayUiFeatures carDisplayUiFeatures;
        synchronized (this.c) {
            carDisplayUiFeatures = this.g;
            if (carDisplayUiFeatures == null) {
                iuw iuwVarA = this.b.o.a();
                if (iuwVarA == null) {
                    throw new IllegalStateException("Display not configured.");
                }
                carDisplayUiFeatures = iuwVarA.q;
                this.g = carDisplayUiFeatures;
            }
        }
        return carDisplayUiFeatures;
    }

    @Override // defpackage.rjx
    public final List i() {
        List list;
        synchronized (this.c) {
            list = this.f;
            if (list == null) {
                list = b(this.b).p;
                this.f = list;
            }
        }
        return list;
    }

    public final void j(CarUiInfo carUiInfo) {
        this.k.e(carUiInfo);
    }

    @Override // defpackage.rjx
    public final void k(rkd rkdVar) throws RemoteException {
        this.h.d(rkdVar);
        rkdVar.e(g());
    }

    @Override // defpackage.rjx
    public final void l(rkg rkgVar) {
        this.i.d(rkgVar);
    }

    @Override // defpackage.rjx
    public final void m(rkp rkpVar) {
        this.j.d(rkpVar);
    }

    @Override // defpackage.rjx
    public final void n(qyn qynVar) {
        this.k.d(qynVar);
    }

    @Override // defpackage.rjx
    public final void o() {
        rbe.h(new ire(this, 5));
    }

    @Override // defpackage.rjx
    public final void p(rkd rkdVar) {
        this.h.f(rkdVar);
    }

    @Override // defpackage.rjx
    public final void q(rkg rkgVar) {
        this.i.f(rkgVar);
    }

    @Override // defpackage.rjx
    public final void r(rkp rkpVar) {
        this.j.f(rkpVar);
    }

    @Override // defpackage.rjx
    public final void s(qyn qynVar) {
        this.k.f(qynVar);
    }
}
