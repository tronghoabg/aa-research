package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final /* synthetic */ class upk implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ upk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v69, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                upl uplVar = (upl) this.a;
                upm upmVar = uplVar.c;
                if (upmVar.m != null) {
                    upmVar.m.a(uplVar.b);
                    return;
                }
                return;
            case 1:
                vaq.d();
                Object obj = this.a;
                psb.BACKGROUND_THREADPOOL.h();
                ((pkx) ((upm) obj).e.a()).d(((upm) obj).n, "ResourceManager");
                uoj uojVarA = ((uoi) ((upm) obj).k.a()).a(((upm) obj).d);
                if (uojVarA != null) {
                    ((upm) obj).m = uojVarA;
                    return;
                }
                return;
            case 2:
                hrt.b((Context) ((aacq) this.a).b).f();
                return;
            case 3:
                vkd vkdVar = (vkd) this.a;
                vkdVar.b();
                vkdVar.d = BitmapDescriptorFactory.HUE_RED;
                vkdVar.c = (vkdVar.c + 216.0f) % 360.0f;
                vkdVar.d();
                int[] iArr = vkdVar.f;
                int i2 = iArr[0];
                vkdVar.e = i2;
                vkdVar.d();
                vkdVar.b.setIntValues(i2, iArr[0]);
                return;
            case 4:
                ((vkh) this.a).a.p(new pwv(pwu.c));
                return;
            case 5:
                ((vkh) this.a).a.cancel(false);
                return;
            case 6:
                Object obj2 = this.a;
                try {
                    abse abseVar = abse.a;
                    ((vkh) obj2).a.o(abnv.L(abse.class).f(((vkh) obj2).c.w()));
                    return;
                } catch (Exception e) {
                    ((vkh) obj2).a.p(e);
                    return;
                }
            case 7:
                try {
                    ((vkm) this.a).a.o(abng.a);
                    return;
                } catch (Exception e2) {
                    ((ynz) ((ynz) vkn.a.f()).ai((char) 9737)).u("Failed to read the response!");
                    ((vkm) this.a).a.p(e2);
                    return;
                }
            case 8:
                ((vkm) this.a).a.cancel(true);
                return;
            case 9:
                ((ynz) ((ynz) vkn.a.g()).ai((char) 9738)).u("Unexpected redirect received from Navigation SDK usage server!");
                ((vkm) this.a).a.p(new pwv(pwu.c));
                return;
            case 10:
                vlw vlwVar = (vlw) this.a;
                vlwVar.d.i(true, false);
                vlwVar.d();
                return;
            case 11:
                vsq vsqVar = (vsq) ((rdx) this.a).e;
                ((voy) vsqVar.b).a(new vpf(vsqVar));
                return;
            case 12:
                ((vsi) this.a).a();
                return;
            case 13:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 14:
                ((wcq) this.a).b();
                return;
            case 15:
                Object obj3 = this.a;
                wcq wcqVar = (wcq) obj3;
                wae waeVar = wcqVar.d;
                zgp zgpVarA = wcy.b(waeVar).a(new pgv(wcqVar.e, 6), waeVar.b());
                zgpVarA.c(new unj(obj3, zgpVarA, 14), waeVar.b());
                return;
            case 16:
                wcn wcnVar = new wcn(i);
                Object obj4 = this.a;
                Iterator it = ((wcp) obj4).b.values().iterator();
                while (it.hasNext()) {
                    ((kgx) it.next()).k(wcnVar);
                }
                synchronized (obj4) {
                    ((wcp) obj4).a = null;
                }
                return;
            case 17:
                throw new RuntimeException(((ExecutionException) this.a).getCause());
            case 18:
                try {
                    wub.af(this.a);
                    return;
                } catch (Exception e3) {
                    Log.i("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e3);
                    return;
                }
            case 19:
                if (((Boolean) ((wdc) this.a).a.gu()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            default:
                try {
                    wub.af(this.a);
                    return;
                } catch (Exception e4) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e4);
                        return;
                    }
                    return;
                }
        }
    }

    public upk(vkm vkmVar, int i) {
        this.b = i;
        this.a = vkmVar;
    }
}
