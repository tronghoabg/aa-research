package defpackage;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final /* synthetic */ class ral implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ral(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object, rcf] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        File file;
        List<rje> list;
        ParcelFileDescriptor parcelFileDescriptorOpen;
        int i = 0;
        int i2 = 1;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                raw rawVar = (raw) obj;
                if (rawVar.W) {
                    woy.aa(Looper.myLooper() != Looper.getMainLooper(), "checkConfiguration must happen on worker thread");
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                rawVar.P.getRealMetrics(displayMetrics);
                Configuration configuration = rawVar.getResources().getConfiguration();
                int iA = raw.a(displayMetrics.widthPixels, displayMetrics.xdpi);
                int iA2 = raw.a(displayMetrics.heightPixels, displayMetrics.ydpi);
                if (configuration.densityDpi == displayMetrics.densityDpi && configuration.screenWidthDp == iA && configuration.screenHeightDp == iA2) {
                    if (omc.c("CAR.PROJECTION.PRES", 4)) {
                        rrd.d(4, "CAR.PROJECTION.PRES", null, "Dimensions matching -- display: %s, config: %s. Completing presentation start", displayMetrics, rawVar.getResources().getConfiguration());
                    }
                    rawVar.k();
                    return;
                }
                int i3 = rawVar.U;
                rau rauVar = rawVar.Q;
                if (i3 < rauVar.f) {
                    rawVar.U = i3 + 1;
                    if (omc.c("CAR.PROJECTION.PRES", 5)) {
                        rrd.d(5, "CAR.PROJECTION.PRES", null, "Dimensions not matching -- display: %s, config: %s. Waiting.", displayMetrics, rawVar.getResources().getConfiguration());
                    }
                    Handler handler = rawVar.T;
                    handler.getClass();
                    handler.postDelayed(new ral(obj, i), rauVar.e);
                    return;
                }
                if (omc.c("CAR.PROJECTION.PRES", 5)) {
                    rrd.d(5, "CAR.PROJECTION.PRES", null, "Too many failed config checks -- display: %s, config: %s", displayMetrics, rawVar.getResources().getConfiguration());
                }
                if (rauVar.d) {
                    throw new IllegalStateException("Unable to configure presentation for ".concat(String.valueOf(rawVar.m)));
                }
                if (omc.c("CAR.PROJECTION.PRES", 5)) {
                    rrd.d(5, "CAR.PROJECTION.PRES", null, "Completing presentation construction with un-updated context", new Object[0]);
                }
                rawVar.k();
                return;
            case 1:
                qsu.d();
                qsq qsqVar = (qsq) this.a;
                if (qsqVar.a) {
                    return;
                }
                qsqVar.a = true;
                if (qsqVar.b) {
                    qsqVar.a();
                    return;
                }
                return;
            case 2:
                Object obj2 = this.a;
                synchronized (rbr.class) {
                    rbr rbrVar = ((rbq) obj2).c;
                    rbo rboVarA = rbrVar.a(((rbq) obj2).b, ((rbq) obj2).a);
                    if (rboVarA != null) {
                        rbrVar.h.remove(rboVarA);
                    }
                }
                return;
            case 3:
                rrd.d(5, "CAR.TOKEN", null, "CarClient connection lost.", new Object[0]);
                Object obj3 = ((rdq) this.a).e.a;
                synchronized (((qsz) obj3).f) {
                    ((qsz) obj3).b.b(rbs.b);
                    ((qsz) obj3).g();
                    ((qsz) obj3).e();
                }
                return;
            case 4:
                ((qsz) this.a).f();
                return;
            case 5:
                this.a.b();
                return;
            case 6:
                ((rex) this.a).m();
                return;
            case 7:
                ((rfa) this.a).b();
                return;
            case 8:
                ypf ypfVar = rfq.a;
                ypfVar.f().ai(7961).u("requestInitialAndroidFocus");
                rfq rfqVar = (rfq) this.a;
                Handler handler2 = rfqVar.c;
                if (handler2 == null) {
                    ypfVar.h().ai(7964).u("Skipping initial focus because focus manager has stopped");
                    return;
                }
                int iD = rfqVar.d(1, rfq.b);
                if (iD == 0) {
                    ypfVar.g().ai(7963).u("Got unexpected AUDIOFOCUS_REQUEST_FAILED");
                } else if (iD == 1) {
                    rfqVar.e.z();
                } else if (iD != 2) {
                    ypfVar.g().ai(7962).w("Unrecognized focus hint in doRequestInitialAndroidFocus: %d", iD);
                }
                rfqVar.d.b = handler2;
                return;
            case 9:
                ((rfq) this.a).b(1);
                return;
            case 10:
                rfq rfqVar2 = (rfq) this.a;
                int iA3 = rfqVar2.d.a();
                rfq.a.f().ai(7966).w("Most exclusive focus grant: %d", iA3);
                if (iA3 == 0) {
                    rfqVar2.e.z();
                    return;
                }
                qqt qqtVar = (qqt) rfqVar2.e.a;
                qqtVar.i(iA3);
                qqtVar.c("onExternalAppGainAudioFocus ".concat(uqw.N(iA3)));
                return;
            case 11:
                Object obj4 = this.a;
                ((rgd) obj4).b.c();
                try {
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = ((rgd) obj4).e;
                    autoCloseOutputStream.getClass();
                    autoCloseOutputStream.close();
                    return;
                } catch (IOException e) {
                    rgd.a.h().p(e).ai(7991).u("Failure closing output stream. Ignoring since this is cleanup.");
                    return;
                }
            case 12:
                ((rgd) this.a).a();
                return;
            case 13:
                ((rhg) this.a).a();
                return;
            case 14:
                ((rhg) this.a).a();
                return;
            case 15:
                ((rhi) this.a).a();
                return;
            case 16:
                try {
                    Object obj5 = this.a;
                    file = (File) ((riy) obj5).c.call();
                    if (file == null) {
                        synchronized (((riy) obj5).b) {
                            ((riy) obj5).d = null;
                        }
                        return;
                    }
                } catch (Exception e2) {
                    riy.a.h().p(e2).ai(8169).u("Couldn't fetch data.");
                    file = null;
                }
                Object obj6 = this.a;
                riy.a.l().ai(8170).u("notifyCallbacks");
                synchronized (((riy) obj6).b) {
                    list = ((riy) obj6).d;
                    ((riy) obj6).d = null;
                }
                list.getClass();
                for (rje rjeVar : list) {
                    if (file != null) {
                        try {
                            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                        } catch (RemoteException unused) {
                            riy.a.l().ai(8173).u("client died, not notifying");
                        } catch (FileNotFoundException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        parcelFileDescriptorOpen = null;
                    }
                    riy.a.l().ai(8171).y("notifying client: %s", rjeVar);
                    rjeVar.e(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        try {
                            parcelFileDescriptorOpen.close();
                        } catch (IOException unused2) {
                            riy.a.h().ai(8172).u("Error closing fd");
                        }
                    }
                }
                if (file != null) {
                    file.delete();
                    return;
                }
                return;
            case 17:
                Object obj7 = this.a;
                if (((lgu) ((pxp) obj7).b).d) {
                    ((ype) lgu.b.f()).u("Integrated overlay stopped.");
                    khc.t(new wci("GH.ProjIntegOverlayMgr", yzz.INTEGRATED_OVERLAY, yzy.Mo, "Car not connected when stopping integrated overlay activity.", new Object[0]), new lkd(obj7, i2));
                    return;
                }
                return;
            case 18:
                break;
            case 19:
                ((rlz) this.a).a();
                return;
            default:
                View view = ((rnw) this.a).s;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
        while (true) {
            try {
                Object obj8 = this.a;
                LinkedBlockingDeque linkedBlockingDeque = ((rld) obj8).c;
                if (linkedBlockingDeque.remainingCapacity() == 0) {
                    rld.a.h().ai(8182).u("Request buffer reaches full capacity, flush to dumpMessageBuffer");
                    synchronized (((rld) obj8).b) {
                        ydx ydxVar = ((rld) obj8).d;
                        ydxVar.clear();
                        linkedBlockingDeque.drainTo(ydxVar);
                    }
                }
                rlf rlfVar = (rlf) linkedBlockingDeque.take();
                synchronized (((rld) obj8).b) {
                    ((rld) obj8).d.add(rlfVar);
                }
            } catch (InterruptedException unused3) {
                rld.a.h().ai(8181).u("GAL Snoop worker thread has been interrupted");
                return;
            }
        }
    }

    public ral(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
