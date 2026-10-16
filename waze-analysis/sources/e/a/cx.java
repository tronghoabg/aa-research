package e.a;

import java.util.IdentityHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cx {

    /* renamed from: a, reason: collision with root package name */
    private final int f46572a;

    /* renamed from: b, reason: collision with root package name */
    private final dr f46573b;

    /* renamed from: c, reason: collision with root package name */
    private final el f46574c;

    /* renamed from: d, reason: collision with root package name */
    private final dc f46575d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f46576e;

    /* renamed from: f, reason: collision with root package name */
    private final j f46577f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f46578g;

    /* renamed from: h, reason: collision with root package name */
    private final cs f46579h;

    /* renamed from: i, reason: collision with root package name */
    private final di f46580i;

    /* renamed from: j, reason: collision with root package name */
    private final IdentityHashMap f46581j;

    /* synthetic */ cx(cv cvVar) {
        Integer num = cvVar.f46561a;
        com.google.d.b.an.C(num, "defaultPort not set");
        this.f46572a = num.intValue();
        dr drVar = cvVar.f46562b;
        com.google.d.b.an.C(drVar, "proxyDetector not set");
        this.f46573b = drVar;
        el elVar = cvVar.f46563c;
        com.google.d.b.an.C(elVar, "syncContext not set");
        this.f46574c = elVar;
        dc dcVar = cvVar.f46564d;
        com.google.d.b.an.C(dcVar, "serviceConfigParser not set");
        this.f46575d = dcVar;
        this.f46576e = cvVar.f46565e;
        this.f46577f = cvVar.f46566f;
        this.f46578g = cvVar.f46567g;
        this.f46579h = cvVar.f46568h != null ? cvVar.f46568h : new cu(this);
        this.f46580i = cvVar.f46569i;
        IdentityHashMap identityHashMap = cvVar.f46570j;
        this.f46581j = identityHashMap != null ? new IdentityHashMap(identityHashMap) : null;
    }

    public static cv b() {
        return new cv();
    }

    public final int a() {
        return this.f46572a;
    }

    public final dc c() {
        return this.f46575d;
    }

    public final dr d() {
        return this.f46573b;
    }

    public final el e() {
        return this.f46574c;
    }

    public final Object f(cw cwVar) {
        IdentityHashMap identityHashMap = this.f46581j;
        if (identityHashMap != null) {
            return identityHashMap.get(cwVar);
        }
        return null;
    }

    public final Executor g() {
        return this.f46578g;
    }

    public final ScheduledExecutorService h() {
        ScheduledExecutorService scheduledExecutorService = this.f46576e;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.b("defaultPort", this.f46572a);
        zVarH.d("proxyDetector", this.f46573b);
        zVarH.d("syncContext", this.f46574c);
        zVarH.d("serviceConfigParser", this.f46575d);
        zVarH.d("customArgs", this.f46581j);
        zVarH.d("scheduledExecutorService", this.f46576e);
        zVarH.d("channelLogger", this.f46577f);
        zVarH.d("executor", this.f46578g);
        zVarH.d("overrideAuthority", null);
        zVarH.d("metricRecorder", this.f46579h);
        zVarH.d("nameResolverRegistry", this.f46580i);
        return zVarH.toString();
    }
}
