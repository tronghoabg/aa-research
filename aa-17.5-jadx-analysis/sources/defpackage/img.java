package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import j$.time.Duration;

/* loaded from: classes.dex */
final class img extends rhu {
    final /* synthetic */ imj a;

    public img(imj imjVar) {
        this.a = imjVar;
    }

    @Override // defpackage.rhu
    public final void a(ComponentName componentName, IBinder iBinder) {
        qzs qzqVar;
        yph yphVar = imj.a;
        ((ype) yphVar.l().ai((char) 412)).y("Connected to %s", componentName.toShortString());
        if (iBinder == null) {
            qzqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.IProjectionLifecycle");
            qzqVar = iInterfaceQueryLocalInterface instanceof qzs ? (qzs) iInterfaceQueryLocalInterface : new qzq(iBinder);
        }
        imj imjVar = this.a;
        imjVar.m = qzqVar;
        imjVar.k = imi.d;
        try {
            ((ype) yphVar.l().ai(413)).u("Invoking service onProjectionStart");
            qzs qzsVar = imjVar.m;
            qzsVar.getClass();
            qzsVar.h(imjVar.j, imjVar.f);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) imj.a.h()).p(e)).ai((char) 414)).u("Error while invoking onProjectionStart");
        }
        imj imjVar2 = this.a;
        if (imjVar2.s) {
            imjVar2.r.postDelayed(imjVar2.u, Duration.ofSeconds(acso.b()).toMillis());
        }
    }

    @Override // defpackage.rhu
    public final void b(ComponentName componentName) {
        imj imjVar = this.a;
        imi imiVar = imjVar.k;
        imi imiVar2 = imi.c;
        if (imiVar != imiVar2) {
            yph yphVar = imj.a;
            ((ype) ((ype) yphVar.f()).ai((char) 415)).y("Disconnected from %s", componentName.toShortString());
            imjVar.k = imiVar2;
            imjVar.m = null;
            imh imhVar = imjVar.d;
            imhVar.d();
            if (imjVar.s) {
                imjVar.r.removeCallbacks(imjVar.u);
                imjVar.t++;
                ((ype) ((ype) yphVar.f()).ai(416)).w("Disconnect count: %s", imjVar.t);
                if (imjVar.t > acso.c()) {
                    ((ype) ((ype) yphVar.g()).ai((char) 417)).u("Exceeded max disconnects, terminating projection");
                    imhVar.fj();
                    spi.a().c(imjVar.g, this);
                    return;
                }
            }
            spi.a().c(imjVar.g, this);
            imjVar.a();
        }
    }
}
