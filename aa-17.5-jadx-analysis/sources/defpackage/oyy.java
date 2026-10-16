package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothProfile;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.RemoteException;
import android.widget.TextView;
import com.google.android.apps.auto.carservice.gmscorecompat.CarStartupServiceImpl;
import com.google.android.apps.auto.wireless.deeplink.DeepLinkResolver;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class oyy implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ oyy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, pal] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ozb ozbVar = (ozb) obj;
                Runnable runnable = (Runnable) ozbVar.n.v();
                Handler handler = ozbVar.c;
                if (handler.hasCallbacks(runnable)) {
                    return;
                }
                oyy oyyVar = new oyy(obj, i);
                gjv gjvVar = ozbVar.o;
                handler.removeCallbacks((Runnable) gjvVar.v());
                gjvVar.w(oyyVar);
                handler.postDelayed(oyyVar, aczv.s());
                return;
            case 1:
                ((ozb) this.a).e();
                return;
            case 2:
                ((ozb) this.a).e();
                return;
            case 3:
                oza ozaVar = (oza) this.a;
                ozaVar.f.w(true);
                BluetoothProfile bluetoothProfile = ozaVar.b;
                if (bluetoothProfile != null) {
                    ozaVar.a(ozaVar.c, bluetoothProfile);
                    return;
                }
                return;
            case 4:
                ((Activity) this.a).finish();
                return;
            case 5:
                Object obj2 = this.a;
                ep epVar = (ep) obj2;
                epVar.findViewById(R.id.bs_buttons).setVisibility(8);
                ((TextView) epVar.findViewById(R.id.bs_title)).setText(R.string.deep_link_connection_fail_title);
                DeepLinkResolver deepLinkResolver = (DeepLinkResolver) obj2;
                deepLinkResolver.q.postDelayed(deepLinkResolver.r, DeepLinkResolver.p.toMillis());
                return;
            case 6:
                DeepLinkResolver deepLinkResolver2 = (DeepLinkResolver) this.a;
                deepLinkResolver2.B(yxi.QR_CODE_TIMED_OUT);
                deepLinkResolver2.D();
                return;
            case 7:
                TrafficStats.setThreadStatsTag(11538176);
                Object obj3 = this.a;
                ozl ozlVar = (ozl) obj3;
                ozlVar.d();
                synchronized (ozlVar.a) {
                    ((ozl) obj3).b = false;
                }
                return;
            case 8:
                Object obj4 = this.a;
                try {
                    ((pan) obj4).h = pag.a(((pan) obj4).b.e());
                    ((ype) pan.a.l().ai(6263)).M("Registration complete: %s %s", ((pan) obj4).e, ((pan) obj4).h);
                    if (((pan) obj4).g(((pan) obj4).h)) {
                        ((pan) obj4).f();
                    }
                    ((pan) obj4).j.b(true);
                    return;
                } catch (RemoteException e) {
                    ((ype) ((ype) pan.a.g()).ai((char) 6259)).u("remote gone. Cannot start setup");
                    ((pan) obj4).j.d(e);
                    return;
                }
            case 9:
                this.a.b();
                return;
            case 10:
                try {
                    ((pan) this.a).f();
                    return;
                } catch (RemoteException unused) {
                    ((ype) ((ype) pan.a.g()).ai((char) 6260)).u("Remote failed");
                    return;
                }
            case 11:
                Object obj5 = this.a;
                try {
                    ((pap) obj5).g.h(((pap) obj5).d);
                } catch (RemoteException e2) {
                    ((ype) ((ype) ((ype) pap.a.g()).p(e2)).ai((char) 6272)).u("Remote gone");
                } catch (IllegalArgumentException e3) {
                    ((ype) ((ype) ((ype) pap.a.g()).p(e3)).ai((char) 6273)).u("Projection process crashed and restarted, no longer registered.");
                }
                ((pap) obj5).e.post(new oyy(obj5, 12));
                return;
            case 12:
                Object obj6 = this.a;
                if (((pap) obj6).i) {
                    try {
                        ((pap) obj6).b.unbindService(((pap) obj6).f);
                        return;
                    } catch (IllegalArgumentException e4) {
                        ((ype) ((ype) ((ype) pap.a.g()).p(e4)).ai((char) 6274)).u("Projection process crashed and restarted, no longer bound.");
                        return;
                    }
                }
                return;
            case 13:
                pak pakVar = ((pbi) this.a).a.h;
                yph yphVar = pan.a;
                pan panVar = (pan) pakVar;
                boolean z = panVar.d;
                ((ype) yphVar.l().ai((char) 6262)).y("Ready to start projection: %b", Boolean.valueOf(z));
                if (z) {
                    panVar.f.execute(new oyy(pakVar, 10));
                    return;
                }
                return;
            case 14:
                Object obj7 = this.a;
                try {
                    pap papVar = ((pao) obj7).b;
                    papVar.e.post(new jgv(obj7, papVar.g.f(papVar.d, papVar.c), 9));
                    return;
                } catch (RemoteException e5) {
                    ((ype) ((ype) ((ype) pap.a.g()).p(e5)).ai((char) 6267)).u("Remote gone");
                    return;
                }
            case 15:
                pbu pbuVar = (pbu) this.a;
                pbuVar.i.b(true != pbuVar.b ? 1 : 2, pbuVar.j);
                return;
            case 16:
                pbu pbuVar2 = (pbu) this.a;
                if (pbuVar2.m.compareAndSet(false, true)) {
                    yph yphVar2 = pbx.a;
                    ((ype) ((ype) yphVar2.f()).ai((char) 6281)).u("Car setup no longer needed");
                    pbuVar2.g.removeCallbacks(pbuVar2.h);
                    ((ype) ((ype) yphVar2.f()).ai((char) 6282)).u("Connection handoff complete");
                    pbuVar2.i.c();
                    Iterator it = pbuVar2.n.iterator();
                    while (it.hasNext()) {
                        Object obj8 = ((ajmd) it.next()).a;
                        CarStartupServiceImpl carStartupServiceImpl = (CarStartupServiceImpl) obj8;
                        carStartupServiceImpl.f.e();
                        sbg sbgVar = carStartupServiceImpl.b;
                        sbg.a.l().ai(8675).u("onHandoffEnded");
                        sbgVar.e = false;
                        ((sbb) obj8).d(sbgVar.c());
                    }
                    return;
                }
                return;
            case 17:
                pca pcaVar = (pca) this.a;
                pcaVar.c.clear();
                pcaVar.d.clear();
                pcaVar.b.removeCallbacksAndMessages(pcaVar.e);
                return;
            case 18:
                wer.c();
                ype ypeVar = (ype) ((ype) pca.a.f()).ai(6297);
                pca pcaVar2 = (pca) this.a;
                ypeVar.y("current car bluetooth connection is gone: %s", pcaVar2.f.c);
                zit zitVar = pcaVar2.f;
                zitVar.getClass();
                zitVar.b = 3;
                Object obj9 = zitVar.a;
                Object obj10 = zitVar.c;
                WirelessSetupSharedService wirelessSetupSharedService = (WirelessSetupSharedService) ((ajmd) obj9).a;
                wirelessSetupSharedService.q.d(yxi.WIRELESS_SETUP_CAR_BLUETOOTH_DISAPPEAR);
                if (!wirelessSetupSharedService.g) {
                    wirelessSetupSharedService.q.d(yxi.WIRELESS_SETUP_CAR_BLUETOOTH_DISAPPEAR_AFTER_WSEM);
                }
                wirelessSetupSharedService.p = null;
                wirelessSetupSharedService.d();
                return;
            case 19:
                pcs pcsVar = (pcs) this.a;
                pcsVar.e = null;
                pcsVar.f = -1;
                pcsVar.g = null;
                pcsVar.h = false;
                pcsVar.d = false;
                return;
            default:
                pcs pcsVar2 = ((pcr) this.a).a;
                if (!pcsVar2.i) {
                    ((ype) pcs.a.l().ai((char) 6305)).u("Skipping onLost because manager is stopped");
                    return;
                }
                ((ype) pcs.a.l().ai((char) 6304)).u("Lost network.");
                pcsVar2.f();
                pcsVar2.d();
                if (!pcsVar2.j) {
                    pcsVar2.k.d();
                    return;
                } else {
                    if (pcsVar2.h) {
                        pcsVar2.h = false;
                        pcsVar2.k.d();
                        return;
                    }
                    return;
                }
        }
    }
}
