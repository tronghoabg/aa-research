package v4;

import X0.C1289q;
import X0.G;
import X0.N;
import Y1.t;
import android.app.Activity;
import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import pd.f;
import t6.q;
import u0.C4163a0;
import uc.C4271h;
import uc.C4273j;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import w4.C4360b;
import x4.e;
import x4.h;
import y4.C4562a;

/* loaded from: classes.dex */
public final class d implements InterfaceC4272i {

    /* renamed from: a, reason: collision with root package name */
    public final C4562a f46824a;

    /* renamed from: b, reason: collision with root package name */
    public C4273j f46825b;

    /* renamed from: c, reason: collision with root package name */
    public Context f46826c;

    /* renamed from: d, reason: collision with root package name */
    public Activity f46827d;

    /* renamed from: e, reason: collision with root package name */
    public GeolocatorLocationService f46828e;

    /* renamed from: f, reason: collision with root package name */
    public final x4.c f46829f;

    /* renamed from: g, reason: collision with root package name */
    public e f46830g;

    public d(C4562a c4562a, x4.c cVar) {
        this.f46824a = c4562a;
        this.f46829f = cVar;
    }

    public final void a(boolean z2) {
        x4.c cVar;
        x4.c cVar2;
        Log.e("FlutterGeolocator", "Geolocator position updates stopped");
        GeolocatorLocationService geolocatorLocationService = this.f46828e;
        if (geolocatorLocationService == null || (!z2 ? geolocatorLocationService.f24199c == 0 : geolocatorLocationService.f24200d == 1)) {
            Log.e("FlutterGeolocator", "There is still another flutter engine connected, not stopping location service");
        } else {
            geolocatorLocationService.f24200d--;
            Log.d("FlutterGeolocator", "Stopping location service.");
            e eVar = geolocatorLocationService.f24203g;
            if (eVar != null && (cVar2 = geolocatorLocationService.f24202f) != null) {
                cVar2.f47691a.remove(eVar);
                eVar.e();
            }
            this.f46828e.a();
        }
        e eVar2 = this.f46830g;
        if (eVar2 == null || (cVar = this.f46829f) == null) {
            return;
        }
        cVar.f47691a.remove(eVar2);
        eVar2.e();
        this.f46830g = null;
    }

    public final void b() {
        if (this.f46825b == null) {
            Log.d("FlutterGeolocator", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        a(false);
        this.f46825b.a(null);
        this.f46825b = null;
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        a(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        Map map;
        C4163a0 c4163a0 = null;
        c4163a0 = null;
        try {
            C4562a c4562a = this.f46824a;
            Context context = this.f46826c;
            c4562a.getClass();
            int iA = C4562a.a(context);
            boolean zBooleanValue = false;
            if ((iA == 3 || iA == 4) != true) {
                ((C4271h) interfaceC4270g).c(f.h(5), f.g(5), null);
                return;
            }
            if (this.f46828e == null) {
                Log.e("FlutterGeolocator", "Location background service has not started correctly");
                return;
            }
            Map map2 = (Map) obj;
            if (map2 != null && map2.get("forceLocationManager") != null) {
                zBooleanValue = ((Boolean) map2.get("forceLocationManager")).booleanValue();
            }
            h hVarA = h.a(map2);
            if (map2 != null && (map = (Map) map2.get("foregroundNotificationConfig")) != null) {
                Map map3 = (Map) map.get("notificationIcon");
                t tVar = map3 == null ? null : new t(3, (String) map3.get(MediationMetaData.KEY_NAME), (String) map3.get("defType"));
                String str = (String) map.get("notificationTitle");
                String str2 = (String) map.get("notificationChannelName");
                String str3 = (String) map.get("notificationText");
                Boolean bool = (Boolean) map.get("enableWifiLock");
                Boolean bool2 = (Boolean) map.get("enableWakeLock");
                Boolean bool3 = (Boolean) map.get("setOngoing");
                Object obj2 = map.get("color");
                c4163a0 = new C4163a0(str, str3, str2, tVar, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), obj2 != null ? Integer.valueOf(((Number) obj2).intValue()) : null);
            }
            if (c4163a0 == null) {
                Log.e("FlutterGeolocator", "Geolocator position updates started");
                Context context2 = this.f46826c;
                boolean zEquals = Boolean.TRUE.equals(Boolean.valueOf(zBooleanValue));
                x4.c cVar = this.f46829f;
                cVar.getClass();
                e eVarA = x4.c.a(context2, zEquals, hVarA);
                this.f46830g = eVarA;
                Activity activity = this.f46827d;
                C4271h c4271h = (C4271h) interfaceC4270g;
                Vc.c cVar2 = new Vc.c(c4271h, 3);
                Vc.c cVar3 = new Vc.c(c4271h, 4);
                cVar.f47691a.add(eVarA);
                eVarA.a(activity, cVar2, cVar3);
                return;
            }
            Log.e("FlutterGeolocator", "Geolocator position updates started using Android foreground service");
            GeolocatorLocationService geolocatorLocationService = this.f46828e;
            geolocatorLocationService.f24200d++;
            if (geolocatorLocationService.f24202f != null) {
                e eVarA2 = x4.c.a(geolocatorLocationService.getApplicationContext(), Boolean.TRUE.equals(Boolean.valueOf(zBooleanValue)), hVarA);
                geolocatorLocationService.f24203g = eVarA2;
                x4.c cVar4 = geolocatorLocationService.f24202f;
                Activity activity2 = geolocatorLocationService.f24201e;
                C4271h c4271h2 = (C4271h) interfaceC4270g;
                Vc.c cVar5 = new Vc.c(c4271h2, 1);
                Vc.c cVar6 = new Vc.c(c4271h2, 2);
                cVar4.f47691a.add(eVarA2);
                eVarA2.a(activity2, cVar5, cVar6);
            }
            GeolocatorLocationService geolocatorLocationService2 = this.f46828e;
            if (geolocatorLocationService2.f24206j != null) {
                Log.d("FlutterGeolocator", "Service already in foreground mode.");
                q qVar = geolocatorLocationService2.f24206j;
                if (qVar != null) {
                    qVar.h(c4163a0, geolocatorLocationService2.f24198b);
                    geolocatorLocationService2.b(c4163a0);
                }
            } else {
                Log.d("FlutterGeolocator", "Start service in foreground mode.");
                Context applicationContext = geolocatorLocationService2.getApplicationContext();
                geolocatorLocationService2.f24206j = new q(applicationContext, c4163a0);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 26) {
                    N n10 = new N(applicationContext);
                    org.apache.tika.utils.a.C();
                    NotificationChannel notificationChannelA = org.apache.tika.utils.a.a((String) c4163a0.f46191f);
                    notificationChannelA.setLockscreenVisibility(0);
                    if (i5 >= 26) {
                        G.b(n10.f15812b, notificationChannelA);
                    }
                }
                geolocatorLocationService2.startForeground(75415, ((C1289q) geolocatorLocationService2.f24206j.f45907b).a());
                geolocatorLocationService2.f24198b = true;
            }
            geolocatorLocationService2.b(c4163a0);
        } catch (C4360b unused) {
            ((C4271h) interfaceC4270g).c(f.h(4), f.g(4), null);
        }
    }
}
