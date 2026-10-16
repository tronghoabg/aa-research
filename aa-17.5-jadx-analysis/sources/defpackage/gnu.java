package defpackage;

import android.content.ContentValues;
import android.os.Process;
import androidx.car.app.media.CarAudioCallbackDelegate;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class gnu implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gnu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v51, types: [idh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v54, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        maj majVar;
        xmw xmwVarH;
        int i = 4;
        int i2 = 3;
        switch (this.b) {
            case 0:
                ((hld) this.a).fb();
                return;
            case 1:
                glf glfVar = (glf) this.a;
                fug fugVar = (fug) glfVar.b;
                if (fugVar.g) {
                    fugVar.h = true;
                    fugVar.e.D().a = fugVar.h;
                    Iterator it = fugVar.d.values().iterator();
                    while (it.hasNext()) {
                        ((fuh) it.next()).j();
                    }
                    eps epsVar = fugVar.a.e;
                    if (epsVar.a(eps.d)) {
                        gmg gmgVar = fugVar.b;
                        gmgVar.c(epr.ON_START);
                        if (epsVar.a(eps.e)) {
                            gmgVar.c(epr.ON_RESUME);
                        }
                    }
                }
                ((geu) glfVar.a).B().a(9);
                return;
            case 2:
                ((hld) this.a).fb();
                return;
            case 3:
                ((gnv) this.a).d();
                return;
            case 4:
                Object obj = this.a;
                gsr gsrVar = ((gsp) obj).a;
                gsrVar.b(1);
                gnu gnuVar = new gnu(obj, 6);
                jyj jyjVar = gsrVar.d;
                jyjVar.e = gnuVar;
                wer.c();
                mal malVar = jyjVar.d;
                if (!malVar.c) {
                    ((ype) ((ype) mal.a.g()).ai((char) 4637)).u("RequestFocus invoked when NavigationFocusManager was never started.");
                    return;
                }
                if (!malVar.b) {
                    ((ype) ((ype) mal.a.h()).ai((char) 4636)).u("RequestFocus invoked after stop(). Dropping request.");
                    return;
                }
                ajmd ajmdVar = jyjVar.f;
                ajmd ajmdVar2 = malVar.g;
                if (ajmdVar2 == ajmdVar) {
                    ((ype) ((ype) mal.a.f()).ai((char) 4635)).u("The app already has the navigation focus");
                    return;
                }
                if (ajmdVar2 != null) {
                    ajmdVar2.E();
                }
                malVar.g = ajmdVar;
                ((ype) ((ype) mal.a.f()).ai((char) 4634)).u("OwnershipCallback takes the navigation focus");
                maj majVar2 = malVar.e;
                if (majVar2 == maj.e || majVar2 == (majVar = maj.d)) {
                    ((ype) mal.a.l().ai(4638)).y("No need to request focus, state(%s)", malVar.e);
                    return;
                }
                malVar.e(majVar);
                try {
                    kgq.d(new kyi(malVar, i2), "GH.GhNavFocusManager", yzz.APP_HOST_CONTEXT, yzy.qm, "Non-recoverable error during request focus. Bailing.", new Object[0]);
                    return;
                } catch (IllegalStateException e) {
                    ((ype) ((ype) ((ype) mal.a.h()).p(e)).ai((char) 4639)).u("Car Connection failed.");
                    malVar.e(maj.a);
                    return;
                }
            case 5:
                gsr gsrVar2 = ((gsp) this.a).a;
                gsrVar2.b(3);
                gsrVar2.d.a();
                return;
            case 6:
                gsr gsrVar3 = ((gsp) this.a).a;
                gsrVar3.b(4);
                gsrVar3.c.b(gsrVar3.a);
                return;
            case 7:
                Object obj2 = this.a;
                gsr gsrVar4 = ((gsp) obj2).a;
                gks.h("CarApp.H.Nav", "%s started navigation", gsrVar4.a());
                gev.c(new gnu(obj2, i));
                gsrVar4.a.k().d(gnr.b(13, ((gmh) gsrVar4.a.d()).a));
                return;
            case 8:
                ((hld) this.a).fb();
                return;
            case 9:
                ((hhz) this.a).w();
                return;
            case 10:
                ((hhz) this.a).v();
                return;
            case 11:
                ((CarAudioCallbackDelegate) this.a).onStopRecording();
                return;
            case 12:
                ((hhz) this.a).u();
                return;
            case 13:
                ?? r10 = this.a;
                ((hss) r10).c.a(r10);
                return;
            case 14:
                ((iei) this.a).cancel(true);
                return;
            case 15:
                Process.setThreadPriority(10);
                this.a.run();
                return;
            case 16:
                break;
            case 17:
                Object obj3 = this.a;
                ikp ikpVar = (ikp) obj3;
                synchronized (ikpVar.e) {
                    ((ikp) obj3).r = true;
                    xmwVarH = ((ikp) obj3).h();
                }
                if (xmwVarH != null) {
                    ikpVar.l(xmwVarH);
                    return;
                }
                return;
            case 18:
                Object obj4 = this.a;
                jlo jloVar = new jlo(((ile) obj4).e);
                try {
                    CarInfoInternal carInfoInternal = ((ile) obj4).f;
                    CarInfo carInfo = carInfoInternal.a;
                    if (carInfo.d == null) {
                        ((ype) ((ype) jlo.a.h()).ai((char) 2347)).u("vehicleId for client is null!");
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("bluetoothaddress", carInfoInternal.f);
                        jlo.n(carInfoInternal, contentValues);
                        jloVar.k(carInfo.d, carInfo.a, "allowedcars", contentValues);
                    }
                    jloVar.close();
                    return;
                } finally {
                }
            case 19:
                ima imaVar = (ima) this.a;
                imaVar.O.e(yzz.VIDEO_FOCUS, yzy.Cn);
                ((ype) ((ype) ima.b.f()).ai((char) 331)).u("Requested focus on primary display without delay");
                imaVar.p().o.k();
                return;
            default:
                iob iobVarN = ((ima) this.a).n();
                if (iobVarN != null) {
                    iobVarN.ah();
                    return;
                }
                return;
        }
        while (true) {
            Object obj5 = this.a;
            boolean z = ((hvr) obj5).c;
            try {
                ((hvr) obj5).c((hvq) ((hvr) obj5).b.remove());
                hvp hvpVar = ((hvr) obj5).d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public gnu(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
