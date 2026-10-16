package com.waze.tide;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import h.ab;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40941a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f40942b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BluetoothDevice f40943c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f40944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(q qVar, BluetoothDevice bluetoothDevice, h.c.e eVar) {
        super(2, eVar);
        this.f40942b = qVar;
        this.f40943c = bluetoothDevice;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        p pVar = new p(this.f40942b, this.f40943c, eVar);
        pVar.f40944d = obj;
        return pVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Location lastKnownLocation;
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40941a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            af afVar = (af) this.f40944d;
            Context context = this.f40942b.f40951g;
            p pVar = this;
            this.f40944d = afVar;
            this.f40941a = 1;
            Object systemService = context.getSystemService("location");
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            CompletableDeferred completableDeferredJ = bo.j();
            if (locationManager == null || t.a(context) != u.f40960b) {
                completableDeferredJ.a(null);
            } else {
                try {
                    List<String> providers = locationManager.getProviders(true);
                    h.g.b.x.e(providers, "getProviders(...)");
                    for (String str : providers) {
                        if (!h.g.b.x.n(str, "fused") && (lastKnownLocation = locationManager.getLastKnownLocation(str)) != null) {
                            com.waze.shared_infra.i.h.h("getLastKnownLocation from provider " + str + ": " + lastKnownLocation);
                            completableDeferredJ.a(lastKnownLocation);
                        }
                    }
                } catch (RuntimeException e2) {
                    com.waze.shared_infra.i.h.c("couldn't getLastKnownLocation due to ".concat(String.valueOf(e2.getMessage())));
                    completableDeferredJ.a(null);
                }
            }
            obj = completableDeferredJ.c(pVar);
            if (obj == aVar) {
                return aVar;
            }
        }
        q qVar = this.f40942b;
        Location location = (Location) obj;
        com.waze.bz.a aVarJ = q.j(this.f40943c);
        if (aVarJ != null) {
            qVar.f40949e.f(aVarJ);
            try {
                qVar.f40948d.a(new e(aVarJ, location != null ? com.waze.shared_infra.l.b.g(location) : null));
                objA = ab.f48028a;
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            Throwable thC = h.m.c(objA);
            if (thC != null) {
                com.waze.shared_infra.i.e eVar = qVar.f40952h;
                Objects.toString(thC);
                eVar.b("Tide controller failed to send request : ".concat(thC.toString()));
            }
        }
        return ab.f48028a;
    }
}
