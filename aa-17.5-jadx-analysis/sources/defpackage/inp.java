package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class inp implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ inp(Fragment fragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i) {
        this.e = i;
        this.a = fragment;
        this.d = layoutInflater;
        this.c = viewGroup;
        this.b = bundle;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Semaphore semaphore;
        int i = this.e;
        if (i == 0) {
            Object obj = this.a;
            inq inqVar = (inq) this.d;
            CarRegionId carRegionId = inqVar.d;
            iob iobVar = inqVar.g.m;
            if (obj != null) {
                carRegionId = ((ing) obj).z;
            }
            try {
                synchronized (iobVar) {
                    semaphore = iobVar.g(carRegionId).m;
                }
                if (!rbr.i(semaphore, acoq.a.gu().b())) {
                    ((ype) ((ype) iob.b.h()).ai(655)).y("Timeout waiting for previous client to stop on region %s!", carRegionId);
                }
            } catch (InterruptedException unused) {
            }
            new sss(Looper.getMainLooper()).post(new imp(this, this.b, this.c, 3, (char[]) null));
            return;
        }
        if (i == 1) {
            Object obj2 = this.b;
            Object obj3 = this.c;
            ((Fragment) this.a).m110lambda$performCreateView$6$androidsupportv4appFragment((LayoutInflater) this.d, (ViewGroup) obj3, (Bundle) obj2);
            return;
        }
        Object obj4 = this.a;
        try {
            ((sat) obj4).h.close();
        } catch (IOException unused2) {
        }
        Object obj5 = this.b;
        Object obj6 = this.d;
        CarSetupServiceImpl.a.f().ai(8610).w("Handoff success with %d", this.c.size());
        ((sat) obj4).d.d((CarInfoInternal) obj5, ((xob) obj6).p);
    }

    public inp(inq inqVar, ing ingVar, ing ingVar2, inu inuVar, int i) {
        this.e = i;
        this.a = ingVar;
        this.b = ingVar2;
        this.c = inuVar;
        this.d = inqVar;
    }

    public /* synthetic */ inp(sat satVar, List list, xob xobVar, CarInfoInternal carInfoInternal, int i) {
        this.e = i;
        this.a = satVar;
        this.c = list;
        this.d = xobVar;
        this.b = carInfoInternal;
    }
}
