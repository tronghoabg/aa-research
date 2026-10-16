package v4;

import D6.C0388o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import ea.S;
import java.util.HashSet;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.C4273j;
import uc.C4281r;
import uc.InterfaceC4269f;
import x4.i;
import y4.C4562a;

/* loaded from: classes.dex */
public class b implements InterfaceC3885b, InterfaceC3964a {

    /* renamed from: a, reason: collision with root package name */
    public final C4562a f46810a;

    /* renamed from: b, reason: collision with root package name */
    public final x4.c f46811b;

    /* renamed from: c, reason: collision with root package name */
    public final x4.d f46812c;

    /* renamed from: d, reason: collision with root package name */
    public GeolocatorLocationService f46813d;

    /* renamed from: e, reason: collision with root package name */
    public C0388o f46814e;

    /* renamed from: f, reason: collision with root package name */
    public d f46815f;

    /* renamed from: g, reason: collision with root package name */
    public final S f46816g = new S(this, 2);

    /* renamed from: h, reason: collision with root package name */
    public Vc.d f46817h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC3965b f46818i;

    public b() {
        C4562a c4562a;
        synchronized (C4562a.class) {
            try {
                if (C4562a.f48021d == null) {
                    C4562a.f48021d = new C4562a();
                }
                c4562a = C4562a.f48021d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f46810a = c4562a;
        this.f46811b = x4.c.b();
        this.f46812c = x4.d.y();
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        this.f46818i = interfaceC3965b;
        if (interfaceC3965b != null) {
            ((s1) interfaceC3965b).b(this.f46811b);
            ((s1) this.f46818i).d(this.f46810a);
        }
        C0388o c0388o = this.f46814e;
        if (c0388o != null) {
            c0388o.f2467f = (Activity) ((s1) interfaceC3965b).f43896a;
        }
        d dVar = this.f46815f;
        if (dVar != null) {
            Activity activity = (Activity) ((s1) interfaceC3965b).f43896a;
            if (activity == null && dVar.f46830g != null && dVar.f46825b != null) {
                dVar.b();
            }
            dVar.f46827d = activity;
        }
        GeolocatorLocationService geolocatorLocationService = this.f46813d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f24201e = (Activity) ((s1) this.f46818i).f43896a;
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        i iVar;
        C4562a c4562a = this.f46810a;
        x4.c cVar = this.f46811b;
        C0388o c0388o = new C0388o(c4562a, cVar, this.f46812c);
        this.f46814e = c0388o;
        Context context = c3884a.f44186a;
        if (((C4281r) c0388o.f2468g) != null) {
            Log.w("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            C4281r c4281r = (C4281r) c0388o.f2468g;
            if (c4281r == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                c4281r.b(null);
                c0388o.f2468g = null;
            }
        }
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        C4281r c4281r2 = new C4281r(interfaceC4269f, "flutter.baseflow.com/geolocator_android");
        c0388o.f2468g = c4281r2;
        c4281r2.b(c0388o);
        c0388o.f2466e = context;
        d dVar = new d(c4562a, cVar);
        this.f46815f = dVar;
        if (dVar.f46825b != null) {
            Log.w("FlutterGeolocator", "Setting a event call handler before the last was disposed.");
            dVar.b();
        }
        C4273j c4273j = new C4273j(interfaceC4269f, "flutter.baseflow.com/geolocator_updates_android");
        dVar.f46825b = c4273j;
        c4273j.a(dVar);
        Context context2 = c3884a.f44186a;
        dVar.f46826c = context2;
        Vc.d dVar2 = new Vc.d();
        this.f46817h = dVar2;
        dVar2.f14867c = context2;
        if (((C4273j) dVar2.f14866b) != null) {
            Log.w("LocationServiceHandler", "Setting a event call handler before the last was disposed.");
            if (((C4273j) dVar2.f14866b) != null) {
                Context context3 = (Context) dVar2.f14867c;
                if (context3 != null && (iVar = (i) dVar2.f14868d) != null) {
                    context3.unregisterReceiver(iVar);
                }
                ((C4273j) dVar2.f14866b).a(null);
                dVar2.f14866b = null;
            }
        }
        C4273j c4273j2 = new C4273j(interfaceC4269f, "flutter.baseflow.com/geolocator_service_updates_android");
        dVar2.f14866b = c4273j2;
        c4273j2.a(dVar2);
        dVar2.f14867c = context2;
        context2.bindService(new Intent(context2, (Class<?>) GeolocatorLocationService.class), this.f46816g, 1);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        InterfaceC3965b interfaceC3965b = this.f46818i;
        if (interfaceC3965b != null) {
            ((s1) interfaceC3965b).m(this.f46811b);
            ((HashSet) ((s1) this.f46818i).f43898c).remove(this.f46810a);
        }
        C0388o c0388o = this.f46814e;
        if (c0388o != null) {
            c0388o.f2467f = null;
        }
        d dVar = this.f46815f;
        if (dVar != null) {
            if (dVar.f46830g != null && dVar.f46825b != null) {
                dVar.b();
            }
            dVar.f46827d = null;
        }
        GeolocatorLocationService geolocatorLocationService = this.f46813d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f24201e = null;
        }
        if (this.f46818i != null) {
            this.f46818i = null;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        Context context = c3884a.f44186a;
        GeolocatorLocationService geolocatorLocationService = this.f46813d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f24199c--;
            Log.d("FlutterGeolocator", "Flutter engine disconnected. Connected engine count " + geolocatorLocationService.f24199c);
        }
        context.unbindService(this.f46816g);
        C0388o c0388o = this.f46814e;
        if (c0388o != null) {
            C4281r c4281r = (C4281r) c0388o.f2468g;
            if (c4281r == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                c4281r.b(null);
                c0388o.f2468g = null;
            }
            this.f46814e.f2467f = null;
            this.f46814e = null;
        }
        d dVar = this.f46815f;
        if (dVar != null) {
            dVar.b();
            this.f46815f.f46828e = null;
            this.f46815f = null;
        }
        Vc.d dVar2 = this.f46817h;
        if (dVar2 != null) {
            dVar2.f14867c = null;
            if (((C4273j) dVar2.f14866b) != null) {
                ((C4273j) dVar2.f14866b).a(null);
                dVar2.f14866b = null;
            }
            this.f46817h = null;
        }
        GeolocatorLocationService geolocatorLocationService2 = this.f46813d;
        if (geolocatorLocationService2 != null) {
            geolocatorLocationService2.f24201e = null;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        onAttachedToActivity(interfaceC3965b);
    }
}
