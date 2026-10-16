package ea;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import i8.C2857b;
import i8.C2858c;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import jf.InterfaceC3108h;
import v4.BinderC4299a;

/* loaded from: classes4.dex */
public final class S implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34501b;

    public /* synthetic */ S(Object obj, int i5) {
        this.f34500a = i5;
        this.f34501b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj = this.f34501b;
        switch (this.f34500a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                W9.u uVar = (W9.u) obj;
                sb2.append(((LinkedBlockingDeque) uVar.f15391c).size());
                Log.d("SessionLifecycleClient", sb2.toString());
                uVar.f15390b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                ((LinkedBlockingDeque) uVar.f15391c).drainTo(arrayList);
                Ef.H.D(Ef.H.c((InterfaceC3108h) uVar.f15389a), null, new Q(uVar, arrayList, null), 3);
                break;
            case 1:
                i8.d dVar = (i8.d) obj;
                dVar.f36893b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                dVar.a().post(new C2857b(this, iBinder));
                break;
            default:
                if (iBinder instanceof BinderC4299a) {
                    GeolocatorLocationService geolocatorLocationService = ((BinderC4299a) iBinder).f46809a;
                    v4.b bVar = (v4.b) obj;
                    bVar.f46813d = geolocatorLocationService;
                    geolocatorLocationService.f24202f = bVar.f46811b;
                    geolocatorLocationService.f24199c++;
                    Log.d("FlutterGeolocator", "Flutter engine connected. Connected engine count " + geolocatorLocationService.f24199c);
                    v4.d dVar2 = bVar.f46815f;
                    if (dVar2 != null) {
                        dVar2.f46828e = geolocatorLocationService;
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i5 = 0;
        Object obj = this.f34501b;
        switch (this.f34500a) {
            case 0:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                W9.u uVar = (W9.u) obj;
                uVar.f15390b = null;
                uVar.getClass();
                break;
            case 1:
                i8.d dVar = (i8.d) obj;
                dVar.f36893b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                dVar.a().post(new C2858c(this, i5));
                break;
            default:
                v4.b bVar = (v4.b) obj;
                GeolocatorLocationService geolocatorLocationService = bVar.f46813d;
                if (geolocatorLocationService != null) {
                    geolocatorLocationService.f24201e = null;
                    bVar.f46813d = null;
                    break;
                }
                break;
        }
    }
}
