package Z9;

import R8.v;
import Va.Y7;
import Va.Za;
import aa.n;
import aa.o;
import android.app.Application;
import android.content.Context;
import ba.C1521a;
import ca.InterfaceC1592a;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1690d;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import t8.C4149c;

/* loaded from: classes4.dex */
public final class k implements InterfaceC1592a {

    /* renamed from: j, reason: collision with root package name */
    public static final Random f17064j = new Random();
    public static final HashMap k = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f17066b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f17067c;

    /* renamed from: d, reason: collision with root package name */
    public final s8.g f17068d;

    /* renamed from: e, reason: collision with root package name */
    public final P9.d f17069e;

    /* renamed from: f, reason: collision with root package name */
    public final C4149c f17070f;

    /* renamed from: g, reason: collision with root package name */
    public final O9.b f17071g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17072h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17065a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f17073i = new HashMap();

    public k(Context context, ScheduledExecutorService scheduledExecutorService, s8.g gVar, P9.d dVar, C4149c c4149c, O9.b bVar) {
        this.f17066b = context;
        this.f17067c = scheduledExecutorService;
        this.f17068d = gVar;
        this.f17069e = dVar;
        this.f17070f = c4149c;
        this.f17071g = bVar;
        gVar.a();
        this.f17072h = gVar.f45330c.f45344b;
        AtomicReference atomicReference = j.f17063a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = j.f17063a;
        if (atomicReference2.get() == null) {
            j jVar = new j();
            while (true) {
                if (atomicReference2.compareAndSet(null, jVar)) {
                    ComponentCallbacks2C1690d.c(application);
                    ComponentCallbacks2C1690d.f26513e.a(jVar);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new G8.c(this, 8));
    }

    public final synchronized d a() {
        try {
            try {
                aa.c cVarC = c("fetch");
                aa.c cVarC2 = c("activate");
                aa.c cVarC3 = c("defaults");
                aa.k kVar = new aa.k(this.f17066b.getSharedPreferences("frc_" + this.f17072h + "_firebase_settings", 0));
                aa.i iVar = new aa.i(this.f17067c, cVarC2, cVarC3);
                s8.g gVar = this.f17068d;
                O9.b bVar = this.f17071g;
                gVar.a();
                X2.j jVar = gVar.f45329b.equals("[DEFAULT]") ? new X2.j(bVar) : null;
                if (jVar != null) {
                    iVar.a(new i(jVar));
                }
                C1521a c1521a = new C1521a(0);
                c1521a.f19414b = cVarC2;
                c1521a.f19415c = cVarC3;
                Za za2 = new Za();
                za2.f13918d = Collections.newSetFromMap(new ConcurrentHashMap());
                za2.f13915a = cVarC2;
                za2.f13916b = c1521a;
                ScheduledExecutorService scheduledExecutorService = this.f17067c;
                za2.f13917c = scheduledExecutorService;
                return b(this.f17068d, this.f17069e, this.f17070f, scheduledExecutorService, cVarC, cVarC2, cVarC3, d(cVarC, kVar), iVar, kVar, za2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized d b(s8.g gVar, P9.d dVar, C4149c c4149c, Executor executor, aa.c cVar, aa.c cVar2, aa.c cVar3, aa.h hVar, aa.i iVar, aa.k kVar, Za za2) {
        try {
            if (!this.f17065a.containsKey("firebase")) {
                Context context = this.f17066b;
                gVar.a();
                d dVar2 = new d(context, dVar, gVar.f45329b.equals("[DEFAULT]") ? c4149c : null, executor, cVar, cVar2, cVar3, hVar, iVar, kVar, e(gVar, dVar, hVar, cVar2, this.f17066b, kVar), za2);
                cVar2.b();
                cVar3.b();
                cVar.b();
                this.f17065a.put("firebase", dVar2);
                k.put("firebase", dVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (d) this.f17065a.get("firebase");
    }

    public final aa.c c(String str) {
        o oVar;
        String strG = v.g("frc_", this.f17072h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f17067c;
        Context context = this.f17066b;
        HashMap map = o.f17477c;
        synchronized (o.class) {
            try {
                HashMap map2 = o.f17477c;
                if (!map2.containsKey(strG)) {
                    map2.put(strG, new o(context, strG));
                }
                oVar = (o) map2.get(strG);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aa.c.d(scheduledExecutorService, oVar);
    }

    public final synchronized aa.h d(aa.c cVar, aa.k kVar) {
        P9.d dVar;
        O9.b gVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        s8.g gVar2;
        try {
            dVar = this.f17069e;
            s8.g gVar3 = this.f17068d;
            gVar3.a();
            gVar = gVar3.f45329b.equals("[DEFAULT]") ? this.f17071g : new L8.g(7);
            scheduledExecutorService = this.f17067c;
            random = f17064j;
            s8.g gVar4 = this.f17068d;
            gVar4.a();
            str = gVar4.f45330c.f45343a;
            gVar2 = this.f17068d;
            gVar2.a();
        } catch (Throwable th) {
            throw th;
        }
        return new aa.h(dVar, gVar, scheduledExecutorService, random, cVar, new ConfigFetchHttpClient(this.f17066b, gVar2.f45330c.f45344b, str, kVar.f17454a.getLong("fetch_timeout_in_seconds", 60L), kVar.f17454a.getLong("fetch_timeout_in_seconds", 60L)), kVar, this.f17073i);
    }

    public final synchronized Y7 e(s8.g gVar, P9.d dVar, aa.h hVar, aa.c cVar, Context context, aa.k kVar) {
        Y7 y72;
        ScheduledExecutorService scheduledExecutorService = this.f17067c;
        y72 = new Y7();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        y72.f13867a = linkedHashSet;
        y72.f13868b = new n(gVar, dVar, hVar, cVar, context, linkedHashSet, kVar, scheduledExecutorService);
        y72.f13869c = context;
        y72.f13870d = scheduledExecutorService;
        return y72;
    }
}
