package defpackage;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class rgm implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public rgm(View view, int i, int i2) {
        this.c = i2;
        this.b = view;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, sdf] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.c) {
            case 0:
                rgs rgsVar = (rgs) this.b;
                if (rgsVar.g == rgp.STATE_UNPAIRING && this.a == rgsVar.n) {
                    rgsVar.c(rgo.EVENT_STATE_TIMEOUT);
                    return;
                }
                return;
            case 1:
                rgs rgsVar2 = (rgs) this.b;
                if (rgsVar2.g != rgp.STATE_UNPAIRING || (i = this.a) != rgsVar2.n) {
                    rgs.a.f().ai(8032).K("Dropping delayed unpair %s %d", rgsVar2.g.name(), this.a);
                    return;
                } else {
                    rgs.a.f().ai(8033).u("Executing delayed unpair");
                    rgsVar2.b(i);
                    return;
                }
            case 2:
                ((ype) lgu.b.f()).w("Integrated overlay started for contentType=%d.", this.a);
                mpe mpeVarA = mpe.a();
                Intent component = new Intent().setComponent(mkn.E);
                qql qqlVar = new qql();
                qqlVar.e = (CarRegionId) ((pxp) this.b).a;
                mpeVarA.k(component, qqlVar);
                return;
            case 3:
                ((rps) this.b).b(this.a, true);
                return;
            case 4:
                ((rvx) this.b).d.e(this.a);
                return;
            case 5:
                ((rvx) this.b).d.u(this.a);
                return;
            case 6:
                ((scr) ((ykd) this.b).a).l(this.a);
                return;
            case 7:
                this.b.i(this.a);
                return;
            case 8:
                ypf ypfVar = sfb.a;
                ((dnw) this.b).d(new TimeoutException("Timed out waiting for profile proxy: " + this.a));
                return;
            case 9:
                ((sme) this.b).k(this.a);
                return;
            case 10:
                ((AtomicInteger) ((ncp) this.b).c).set(this.a);
                return;
            case 11:
                wjk wjkVar = (wjk) this.b;
                wjj wjjVar = wjkVar.a;
                if (wjjVar != null) {
                    wjjVar.a(this.a);
                    wjkVar.a = null;
                    return;
                }
                return;
            case 12:
                wjk wjkVar2 = (wjk) this.b;
                wjj wjjVar2 = wjkVar2.a;
                if (wjjVar2 != null) {
                    wjjVar2.a(this.a);
                    wjkVar2.a = null;
                    return;
                }
                return;
            case 13:
                wjk wjkVar3 = (wjk) this.b;
                wjj wjjVar3 = wjkVar3.a;
                if (wjjVar3 != null) {
                    wjjVar3.a(this.a);
                    wjkVar3.a = null;
                    return;
                }
                return;
            case 14:
                ((woa) this.b).f.ad(this.a);
                return;
            case 15:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                WeakReference weakReference = sideSheetBehavior.j;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.N(view, this.a, false);
                    return;
                }
                return;
            case 16:
                ((View) this.b).setVisibility(this.a);
                return;
            case 17:
                zis zisVar = (zis) this.b;
                if (zisVar.h) {
                    return;
                }
                int i2 = this.a;
                if (zisVar.e.e == 4) {
                    zisVar.i.m(i2);
                    return;
                } else {
                    zisVar.d += i2;
                    return;
                }
            case 18:
                Object obj = this.b;
                ztv ztvVar = (ztv) obj;
                ztvVar.c.a();
                int i3 = this.a;
                synchronized (obj) {
                    if (i3 < ((ztv) obj).g) {
                        return;
                    }
                    if (ztvVar.d) {
                        ztvVar.d = false;
                        ztvVar.a();
                        return;
                    } else {
                        String str = ztv.a;
                        if (zrn.e(str, 3)) {
                            Log.d(str, "onCameraChangeFinished called when camera is not in motion.");
                            return;
                        }
                        return;
                    }
                }
            case 19:
                aacp aacpVar = (aacp) this.b;
                aacpVar.c.c(aacpVar.g, this.a);
                return;
            default:
                try {
                    int i4 = aeeb.a;
                    adsv adsvVar = ((adrj) this.b).j;
                    int i5 = this.a;
                    if (((adwm) adsvVar).b()) {
                        return;
                    }
                    ((adwm) adsvVar).e += i5;
                    ((adwm) adsvVar).a();
                    return;
                } catch (Throwable th) {
                    ((adrj) this.b).b(th);
                    return;
                }
        }
    }

    public rgm(Object obj, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ rgm(Object obj, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
