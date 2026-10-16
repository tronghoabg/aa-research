package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final /* synthetic */ class aabr implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aabr(adjj adjjVar, int i) {
        this.b = i;
        this.a = adjjVar;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, trk] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                this.a.h();
                return;
            case 1:
                aabh aabhVar = (aabh) this.a;
                aabhVar.e.a();
                if (!aabhVar.h || aabhVar.i) {
                    return;
                }
                zvi zviVar = aabhVar.c;
                if (zviVar.g()) {
                    zviVar.c.a();
                    zxd zxdVar = zviVar.a;
                    vfr vfrVar = zxdVar.b;
                    if (vfrVar == null) {
                        zxdVar.f.b(aahu.GROUND_OVERLAY_CLICK_WITHOUT_LISTENER);
                        return;
                    }
                    try {
                        vfrVar.e(zviVar);
                        zxdVar.f.b(aahu.GROUND_OVERLAY_CLICK_WITH_LISTENER);
                        return;
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                }
                return;
            case 2:
                ((tnq) this.a).g();
                return;
            case 3:
                aacm aacmVar = (aacm) this.a;
                zxa zxaVar = aacmVar.d;
                if (zxaVar != null) {
                    zxaVar.g();
                }
                aabp aabpVar = aacmVar.a;
                aabpVar.a.a();
                aabpVar.b.c();
                return;
            case 4:
                aacp aacpVar = (aacp) this.a;
                aacpVar.d.a();
                if (!aacpVar.e || aacpVar.f) {
                    return;
                }
                zxi zxiVar = aacpVar.b;
                if (zxiVar.k()) {
                    zxiVar.i();
                    return;
                }
                return;
            case 5:
                aacr aacrVar = (aacr) this.a;
                if (aacrVar.c) {
                    return;
                }
                zxl zxlVar = aacrVar.a;
                if (zxlVar.g()) {
                    zxlVar.f();
                    return;
                }
                return;
            case 6:
                break;
            case 7:
                aaev aaevVar = (aaev) this.a;
                aaevVar.g.a();
                View viewA = aaevVar.a.a();
                if (addm.l()) {
                    aaet aaetVar = aaevVar.e;
                    aaetVar.w(viewA.getWidth(), viewA.getHeight());
                    aaetVar.s();
                    return;
                } else {
                    aaet aaetVar2 = aaevVar.c;
                    aaetVar2.w(viewA.getWidth(), viewA.getHeight());
                    aaetVar2.s();
                    return;
                }
            case 8:
                Object obj = this.a;
                ((aaev) obj).g.a();
                synchronized (obj) {
                    if (((aaev) obj).h > ((aaev) obj).i) {
                        ((aaev) obj).d.q(((aaev) obj).c);
                    }
                }
                return;
            case 9:
                Object obj2 = this.a;
                try {
                    ((aafa) obj2).c.b();
                    if (((aafa) obj2).d) {
                        String str = aafa.a;
                        if (zrn.e(str, 5)) {
                            Log.w(str, "onDestroyOnRenderingThread() called more than once!");
                            return;
                        }
                        return;
                    }
                    ((aafa) obj2).d = true;
                    if (((aafa) obj2).e == null) {
                        String str2 = aafa.a;
                        if (zrn.e(str2, 5)) {
                            Log.w(str2, "onDestroyOnRenderingThread() called while no renderer is bound!");
                            return;
                        }
                        return;
                    }
                    String str3 = aafa.a;
                    if (zrn.e(str3, 4)) {
                        Log.i(str3, "onDestroyOnRenderingThread() dispatching");
                    }
                    ((aafa) obj2).b.b(null);
                    ((aafa) obj2).e.b();
                    ((aafa) obj2).e = null;
                    return;
                } catch (Throwable th) {
                    zus.a(th);
                    if (th instanceof RuntimeException) {
                        throw ((RuntimeException) th);
                    }
                    if (!(th instanceof Error)) {
                        throw new RuntimeException(th);
                    }
                    throw ((Error) th);
                }
            case 10:
                ((aafi) this.a).g();
                return;
            case 11:
                ((aafi) this.a).f();
                return;
            case 12:
                aage aageVar = (aage) this.a;
                aageVar.c.b();
                if (!aageVar.d) {
                    aageVar.d = true;
                    aageVar.a();
                    aageVar.f = aagi.a;
                    return;
                } else {
                    String str4 = aage.a;
                    if (zrn.e(str4, 6)) {
                        Log.e(str4, "onDestroy() called more than once!");
                        return;
                    }
                    return;
                }
            case 13:
                try {
                    ((adjj) this.a).j(new TimeoutException("context timed out"));
                    return;
                } catch (Throwable th2) {
                    adjq.c.logp(Level.SEVERE, "io.grpc.Context$CancellableContext$1CancelOnExpiration", "run", "Cancel threw an exception, which should not happen", th2);
                    return;
                }
            case 14:
                ((ador) this.a).m();
                return;
            case 15:
                ((ador) this.a).o();
                return;
            case 16:
                ((adow) this.a).b();
                return;
            case 17:
                Object obj3 = this.a;
                synchronized (obj3) {
                    if (((adoz) obj3).C(4)) {
                        ((adoz) obj3).w(((adoz) obj3).o, true);
                    }
                }
                return;
            case 18:
                adpq adpqVar = (adpq) this.a;
                woy.aa(adpqVar.i == null, "Already registered!");
                adpqVar.i = new adpp(adpqVar);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addDataScheme("package");
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                adpp adppVar = adpqVar.i;
                Context context = adpqVar.e;
                context.registerReceiver(adppVar, intentFilter);
                context.registerReceiver(adpqVar.i, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            case 19:
                adpq adpqVar2 = (adpq) this.a;
                adnw adnwVar = adpqVar2.g;
                adnwVar.c();
                woy.Z(adpqVar2.k != null);
                woy.Z(adpqVar2.k.isDone());
                adqs adqsVar = adpqVar2.l;
                adqsVar.getClass();
                wub.ah(adpqVar2.k, new adpn(adqsVar), adnwVar);
                adpqVar2.k = null;
                if (adpqVar2.j) {
                    adpqVar2.j = false;
                    adpqVar2.e();
                    return;
                }
                return;
            default:
                adpq adpqVar3 = (adpq) this.a;
                adpp adppVar2 = adpqVar3.i;
                if (adppVar2 != null) {
                    adpqVar3.e.unregisterReceiver(adppVar2);
                    adpqVar3.i = null;
                    return;
                }
                return;
        }
        while (true) {
            aacr aacrVar2 = (aacr) this.a;
            List list = aacrVar2.f;
            if (i >= list.size()) {
                return;
            }
            aacrVar2.b.c(aacrVar2.g, ((tqo) list.get(i)).a());
            i++;
        }
    }

    public /* synthetic */ aabr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
