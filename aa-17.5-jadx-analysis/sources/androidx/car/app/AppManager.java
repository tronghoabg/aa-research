package androidx.car.app;

import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import androidx.car.app.IAppManager;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import defpackage.ept;
import defpackage.pt;
import defpackage.pv;
import defpackage.qh;
import defpackage.qn;
import defpackage.qr;
import defpackage.qx;
import defpackage.sg;
import defpackage.tr;
import defpackage.xr;
import java.util.List;

/* loaded from: classes2.dex */
public final class AppManager implements sg {
    public final qn a;
    public final IAppManager.Stub b;
    public final qr c;
    public final ept d;
    final HandlerThread e = new HandlerThread("LocationUpdateThread");
    public final pt f = new LocationListener() { // from class: pt
        @Override // android.location.LocationListener
        public final /* synthetic */ void onLocationChanged(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                onLocationChanged((Location) list.get(i));
            }
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            this.a.c.c(CloudRecognizerProtocolStrings.APP, "sendLocation", new ps(location, 0));
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onFlushComplete(int i) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final /* synthetic */ void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    /* renamed from: androidx.car.app.AppManager$1, reason: invalid class name */
    public class AnonymousClass1 extends IAppManager.Stub {
        final /* synthetic */ qn val$carContext;

        public AnonymousClass1(qn qnVar) {
            this.val$carContext = qnVar;
        }

        public static /* synthetic */ Object lambda$onBackPressed$0(qn qnVar) throws xr {
            qnVar.e.y();
            return null;
        }

        public static /* synthetic */ Object lambda$startLocationUpdates$1(qn qnVar) throws xr {
            AppManager appManager = (AppManager) qnVar.a(AppManager.class);
            appManager.b();
            ((LocationManager) appManager.a.getSystemService("location")).requestLocationUpdates("fused", 1000L, 1.0f, appManager.f, appManager.e.getLooper());
            return null;
        }

        public static /* synthetic */ Object lambda$stopLocationUpdates$2(qn qnVar) throws xr {
            ((AppManager) qnVar.a(AppManager.class)).b();
            return null;
        }

        @Override // androidx.car.app.IAppManager
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.IAppManager
        public void getTemplate(IOnDoneCallback iOnDoneCallback) {
            qx qxVar = (qx) this.val$carContext.a(qx.class);
            qxVar.getClass();
            tr.d(AppManager.this.d, iOnDoneCallback, "getTemplate", new pv(qxVar, 0));
        }

        @Override // androidx.car.app.IAppManager
        public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
            tr.d(AppManager.this.d, iOnDoneCallback, "onBackPressed", new pv(this.val$carContext, 1));
        }

        @Override // androidx.car.app.IAppManager
        public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            qn qnVar = this.val$carContext;
            PackageManager packageManager = qnVar.getPackageManager();
            int iCheckPermission = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", qnVar.getPackageName());
            int iCheckPermission2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName());
            if (iCheckPermission == -1 && iCheckPermission2 == -1) {
                tr.f(iOnDoneCallback, "startLocationUpdates", new SecurityException("Location permission(s) not granted."));
            }
            AppManager appManager = AppManager.this;
            tr.d(appManager.d, iOnDoneCallback, "startLocationUpdates", new pv(this.val$carContext, 3));
        }

        @Override // androidx.car.app.IAppManager
        public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            tr.d(AppManager.this.d, iOnDoneCallback, "stopLocationUpdates", new pv(this.val$carContext, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [pt] */
    public AppManager(qn qnVar, qr qrVar, ept eptVar) {
        this.a = qnVar;
        this.c = qrVar;
        this.d = eptVar;
        this.b = new AnonymousClass1(qnVar);
    }

    public final void a() {
        this.c.c(CloudRecognizerProtocolStrings.APP, "invalidate", new qh(1));
    }

    final void b() {
        ((LocationManager) this.a.getSystemService("location")).removeUpdates(this.f);
    }
}
