package K3;

import A7.RunnableC0299w0;
import A7.V0;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: m, reason: collision with root package name */
    public static final String f6470m = J3.r.f("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f6472b;

    /* renamed from: c, reason: collision with root package name */
    public final J3.b f6473c;

    /* renamed from: d, reason: collision with root package name */
    public final b7.k f6474d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f6475e;

    /* renamed from: i, reason: collision with root package name */
    public final List f6479i;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f6477g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f6476f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f6480j = new HashSet();
    public final ArrayList k = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f6471a = null;

    /* renamed from: l, reason: collision with root package name */
    public final Object f6481l = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f6478h = new HashMap();

    public f(Context context, J3.b bVar, b7.k kVar, WorkDatabase workDatabase, List list) {
        this.f6472b = context;
        this.f6473c = bVar;
        this.f6474d = kVar;
        this.f6475e = workDatabase;
        this.f6479i = list;
    }

    public static boolean c(String str, s sVar) {
        if (sVar == null) {
            J3.r.d().a(f6470m, "WorkerWrapper could not be found for " + str);
            return false;
        }
        sVar.f6537r = true;
        sVar.h();
        sVar.f6536q.cancel(true);
        if (sVar.f6526f == null || !(sVar.f6536q.f12264a instanceof U3.a)) {
            J3.r.d().a(s.f6520s, "WorkSpec " + sVar.f6525e + " is already done. Not interrupting.");
        } else {
            sVar.f6526f.stop();
        }
        J3.r.d().a(f6470m, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f6481l) {
            this.k.add(cVar);
        }
    }

    public final S3.p b(String str) {
        synchronized (this.f6481l) {
            try {
                s sVar = (s) this.f6476f.get(str);
                if (sVar == null) {
                    sVar = (s) this.f6477g.get(str);
                }
                if (sVar == null) {
                    return null;
                }
                return sVar.f6525e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K3.c
    public final void d(S3.j jVar, boolean z2) {
        synchronized (this.f6481l) {
            try {
                s sVar = (s) this.f6477g.get(jVar.f10965a);
                if (sVar != null && jVar.equals(Fe.c.s(sVar.f6525e))) {
                    this.f6477g.remove(jVar.f10965a);
                }
                J3.r.d().a(f6470m, f.class.getSimpleName() + StringUtils.SPACE + jVar.f10965a + " executed; reschedule = " + z2);
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).d(jVar, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(String str) {
        boolean zContains;
        synchronized (this.f6481l) {
            zContains = this.f6480j.contains(str);
        }
        return zContains;
    }

    public final boolean f(String str) {
        boolean z2;
        synchronized (this.f6481l) {
            try {
                z2 = this.f6477g.containsKey(str) || this.f6476f.containsKey(str);
            } finally {
            }
        }
        return z2;
    }

    public final void g(c cVar) {
        synchronized (this.f6481l) {
            this.k.remove(cVar);
        }
    }

    public final void h(S3.j jVar) {
        b7.k kVar = this.f6474d;
        ((V0) kVar.f19398d).execute(new C8.d(15, this, jVar));
    }

    public final void i(String str, J3.j jVar) {
        synchronized (this.f6481l) {
            try {
                J3.r.d().e(f6470m, "Moving WorkSpec (" + str + ") to the foreground");
                s sVar = (s) this.f6477g.remove(str);
                if (sVar != null) {
                    if (this.f6471a == null) {
                        PowerManager.WakeLock wakeLockA = T3.p.a(this.f6472b, "ProcessorForegroundLck");
                        this.f6471a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f6476f.put(str, sVar);
                    Y0.e.startForegroundService(this.f6472b, R3.a.c(this.f6472b, Fe.c.s(sVar.f6525e), jVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(j jVar, b7.k kVar) throws Throwable {
        Throwable th;
        S3.j jVar2 = jVar.f6485a;
        String str = jVar2.f10965a;
        ArrayList arrayList = new ArrayList();
        S3.p pVar = (S3.p) this.f6475e.m(new e(this, arrayList, str, 0));
        if (pVar == null) {
            J3.r.d().g(f6470m, "Didn't find WorkSpec for id " + jVar2);
            h(jVar2);
            return false;
        }
        synchronized (this.f6481l) {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
                try {
                    if (f(str)) {
                        Set set = (Set) this.f6478h.get(str);
                        if (((j) set.iterator().next()).f6485a.f10966b == jVar2.f10966b) {
                            set.add(jVar);
                            J3.r.d().a(f6470m, "Work " + jVar2 + " is already enqueued for processing");
                        } else {
                            h(jVar2);
                        }
                        return false;
                    }
                    if (pVar.f10995t != jVar2.f10966b) {
                        h(jVar2);
                        return false;
                    }
                    Context context = this.f6472b;
                    J3.b bVar = this.f6473c;
                    b7.k kVar2 = this.f6474d;
                    WorkDatabase workDatabase = this.f6475e;
                    r rVar = new r();
                    rVar.f6519i = new b7.k(6);
                    rVar.f6511a = context.getApplicationContext();
                    rVar.f6513c = kVar2;
                    rVar.f6512b = this;
                    rVar.f6514d = bVar;
                    rVar.f6515e = workDatabase;
                    rVar.f6516f = pVar;
                    rVar.f6518h = arrayList;
                    rVar.f6517g = this.f6479i;
                    if (kVar != null) {
                        rVar.f6519i = kVar;
                    }
                    s sVar = new s(rVar);
                    U3.j jVar3 = sVar.f6535p;
                    jVar3.addListener(new RunnableC0299w0(12, this, jVar.f6485a, jVar3, false), (V0) this.f6474d.f19398d);
                    this.f6477g.put(str, sVar);
                    HashSet hashSet = new HashSet();
                    hashSet.add(jVar);
                    this.f6478h.put(str, hashSet);
                    ((T3.m) this.f6474d.f19396b).execute(sVar);
                    J3.r.d().a(f6470m, f.class.getSimpleName() + ": processing " + jVar2);
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void k(String str) {
        synchronized (this.f6481l) {
            this.f6476f.remove(str);
            l();
        }
    }

    public final void l() {
        synchronized (this.f6481l) {
            try {
                if (this.f6476f.isEmpty()) {
                    Context context = this.f6472b;
                    String str = R3.a.k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f6472b.startService(intent);
                    } catch (Throwable th) {
                        J3.r.d().c(f6470m, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f6471a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f6471a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean m(j jVar) {
        String str = jVar.f6485a.f10965a;
        synchronized (this.f6481l) {
            try {
                s sVar = (s) this.f6477g.remove(str);
                if (sVar == null) {
                    J3.r.d().a(f6470m, "WorkerWrapper could not be found for " + str);
                    return false;
                }
                Set set = (Set) this.f6478h.get(str);
                if (set != null && set.contains(jVar)) {
                    J3.r.d().a(f6470m, "Processor stopping background work " + str);
                    this.f6478h.remove(str);
                    return c(str, sVar);
                }
                return false;
            } finally {
            }
        }
    }
}
