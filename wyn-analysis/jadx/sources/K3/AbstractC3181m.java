package k3;

import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import ff.v;
import ff.w;
import ff.x;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC3340k;
import o3.InterfaceC3644a;
import org.jetbrains.annotations.NotNull;

/* renamed from: k3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3181m {

    @NotNull
    public static final C3180l Companion = new C3180l();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC3644a f39223a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f39224b;

    /* renamed from: c, reason: collision with root package name */
    public T3.m f39225c;

    /* renamed from: d, reason: collision with root package name */
    public o3.d f39226d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39228f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f39229g;
    public final Map k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f39233l;

    /* renamed from: e, reason: collision with root package name */
    public final C3176h f39227e = d();

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f39230h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final ReentrantReadWriteLock f39231i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    public final ThreadLocal f39232j = new ThreadLocal();

    public AbstractC3181m() {
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        AbstractC3340k.d(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.k = mapSynchronizedMap;
        this.f39233l = new LinkedHashMap();
    }

    public static Object o(Class cls, o3.d dVar) {
        if (cls.isInstance(dVar)) {
            return dVar;
        }
        if (dVar instanceof InterfaceC3172d) {
            return o(cls, ((InterfaceC3172d) dVar).getDelegate());
        }
        return null;
    }

    public final void a() {
        if (!this.f39228f && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!g().I().O() && this.f39232j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        InterfaceC3644a interfaceC3644aI = g().I();
        this.f39227e.c(interfaceC3644aI);
        if (interfaceC3644aI.R()) {
            interfaceC3644aI.n();
        } else {
            interfaceC3644aI.c();
        }
    }

    public abstract C3176h d();

    public abstract o3.d e(C3171c c3171c);

    public List f(LinkedHashMap autoMigrationSpecs) {
        AbstractC3340k.e(autoMigrationSpecs, "autoMigrationSpecs");
        return v.f35432a;
    }

    public final o3.d g() {
        o3.d dVar = this.f39226d;
        if (dVar != null) {
            return dVar;
        }
        AbstractC3340k.m("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return x.f35434a;
    }

    public Map i() {
        return w.f35433a;
    }

    public final void j() {
        g().I().p();
        if (g().I().O()) {
            return;
        }
        C3176h c3176h = this.f39227e;
        if (c3176h.f39198e.compareAndSet(false, true)) {
            Executor executor = c3176h.f39194a.f39224b;
            if (executor != null) {
                executor.execute(c3176h.f39204l);
            } else {
                AbstractC3340k.m("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final void k(InterfaceC3644a interfaceC3644a) {
        C3176h c3176h = this.f39227e;
        c3176h.getClass();
        synchronized (c3176h.k) {
            if (c3176h.f39199f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            interfaceC3644a.f("PRAGMA temp_store = MEMORY;");
            interfaceC3644a.f("PRAGMA recursive_triggers='ON';");
            interfaceC3644a.f("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            c3176h.c(interfaceC3644a);
            c3176h.f39200g = interfaceC3644a.A("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            c3176h.f39199f = true;
        }
    }

    public final Cursor l(o3.f fVar) {
        a();
        b();
        return g().I().t(fVar);
    }

    public final Object m(Callable callable) {
        c();
        try {
            Object objCall = callable.call();
            n();
            return objCall;
        } finally {
            j();
        }
    }

    public final void n() {
        g().I().k();
    }
}
