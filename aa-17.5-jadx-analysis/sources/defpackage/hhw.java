package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import androidx.car.app.model.Alert;
import androidx.car.app.serialization.Bundleable;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class hhw implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hhw(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v20, types: [androidx.car.app.ISurfaceCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Object, rpg] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object, qus] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, quy] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, quv] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i = 3;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                ((hhy) obj2).a.n("showAlert", new hhw(obj2, obj, 4));
                return;
            case 1:
                Object obj3 = this.b;
                Object obj4 = this.a;
                ((hhy) obj4).a.n("sendLocation", new hhw(obj4, obj3, i));
                return;
            case 2:
                Object obj5 = this.a;
                hhz hhzVar = ((hhy) obj5).a;
                ComponentName componentName = hhzVar.c.a.c;
                gks.c("CarApp.H.Tem", "setSurfaceListener for %s", componentName);
                Context contextA = hhzVar.a.a();
                if (contextA == null) {
                    gks.d("CarApp.H.Tem", "App configuration context is null");
                    return;
                }
                int i2 = 5;
                try {
                    mt.j(contextA, "androidx.car.app.ACCESS_SURFACE");
                    gev.c(new hhw(obj5, this.b, i2));
                    return;
                } catch (SecurityException e) {
                    Object[] objArr = {componentName};
                    if (Log.isLoggable("CarApp.H.Tem", 5)) {
                        Log.w("CarApp.H.Tem", gks.a("App %s trying to access surface when the permission was not granted", objArr), e);
                    }
                    throw new SecurityException(e);
                }
            case 3:
                gef gefVar = (gef) ((hhy) this.a).a.a.l(gef.class);
                gefVar.getClass();
                gefVar.c((Location) this.b);
                return;
            case 4:
                gdl gdlVar = (gdl) ((hhy) this.a).a.a.l(gdl.class);
                gdlVar.getClass();
                try {
                    Alert alert = (Alert) ((Bundleable) this.b).a();
                    eqm eqmVar = gdlVar.b;
                    if (!eqmVar.n()) {
                        ta callbackDelegate = alert.getCallbackDelegate();
                        if (callbackDelegate != null) {
                            ((jwq) gdlVar.a).g.e(callbackDelegate, 3);
                            return;
                        }
                        return;
                    }
                    Alert alertB = gdlVar.b();
                    if (alertB != null && !alertB.equals(alert)) {
                        gdlVar.e(alertB);
                    }
                    if (alertB == null || !alertB.equals(alert) || alertB.getDurationMillis() != alert.getDurationMillis()) {
                        gdlVar.c = System.currentTimeMillis();
                    }
                    gdlVar.e = new esx(gdlVar, alert, 13, (char[]) null);
                    eqmVar.j(alert);
                    Handler handler = gdlVar.d;
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(gdlVar.e, alert.getDurationMillis());
                    return;
                } catch (xr e2) {
                    throw new IllegalArgumentException("Serialization failure", e2);
                }
            case 5:
                hhz hhzVar2 = ((hhy) this.a).a;
                hhzVar2.e = this.b;
                if (hhzVar2.e == null || hhzVar2.f == null) {
                    return;
                }
                hhzVar2.j.L();
                return;
            case 6:
                ((geu) this.a).t().h(this.b);
                return;
            case 7:
                try {
                    ((hqi) this.b).a.put(this.a);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 8:
                if (((hyd) this.b).a) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.a.run();
                    return;
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 9:
                ((rjz) this.a).a((CarDisplayId) this.b).l(xhc.ACTION_RESIZE_TO_LARGER);
                return;
            case 10:
                ((rjz) this.a).a((CarDisplayId) this.b).l(xhc.ACTION_RESIZE_TO_SMALLER);
                return;
            case 11:
                ((ima) this.b).at(true, (xhv) this.a);
                return;
            case 12:
                ((ima) this.b).at(false, (xhv) this.a);
                return;
            case 13:
                iob iobVarN = ((ima) this.b).n();
                if (iobVarN != 0) {
                    iobVarN.ai(this.a);
                    return;
                }
                return;
            case 14:
                iob iobVarN2 = ((ima) this.b).n();
                if (iobVarN2 != 0) {
                    iobVarN2.ag(this.a);
                    return;
                }
                return;
            case 15:
                iob iobVarN3 = ((ima) this.b).n();
                if (iobVarN3 != null) {
                    iobVarN3.ae((CarRegionId) this.a);
                    return;
                }
                return;
            case 16:
                ima imaVar = (ima) this.b;
                iob iobVarN4 = imaVar.n();
                ?? r8 = this.a;
                if (iobVarN4 != 0) {
                    iobVarN4.O(r8);
                }
                ntn ntnVar = (ntn) imaVar.B.get();
                if (ntnVar != null) {
                    r8.getClass();
                    ntnVar.a = r8;
                    return;
                }
                return;
            case 17:
                iob iobVarN5 = ((ima) this.b).n();
                if (iobVarN5 != 0) {
                    iobVarN5.N(this.a);
                    return;
                }
                return;
            case 18:
                iob iobVarN6 = ((ima) this.b).n();
                if (iobVarN6 != null) {
                    Object obj6 = this.a;
                    ilb.d();
                    iobVarN6.r.remove(obj6);
                    return;
                }
                return;
            case 19:
                ((ima) this.b).bk((CarActivityLayoutConfig) this.a, false);
                return;
            default:
                ((ing) this.b).b.e.a((yxh) this.a);
                return;
        }
    }

    public hhw(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ hhw(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
