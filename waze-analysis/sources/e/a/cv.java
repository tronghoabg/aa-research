package e.a;

import com.waze.strings.DisplayStrings;
import java.util.IdentityHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cv {

    /* renamed from: a, reason: collision with root package name */
    private Integer f46561a;

    /* renamed from: b, reason: collision with root package name */
    private dr f46562b;

    /* renamed from: c, reason: collision with root package name */
    private el f46563c;

    /* renamed from: d, reason: collision with root package name */
    private dc f46564d;

    /* renamed from: e, reason: collision with root package name */
    private ScheduledExecutorService f46565e;

    /* renamed from: f, reason: collision with root package name */
    private j f46566f;

    /* renamed from: g, reason: collision with root package name */
    private Executor f46567g;

    /* renamed from: h, reason: collision with root package name */
    private cs f46568h;

    /* renamed from: i, reason: collision with root package name */
    private di f46569i;

    /* renamed from: j, reason: collision with root package name */
    private IdentityHashMap f46570j;

    public final cx c() {
        return new cx(this);
    }

    public final void l(cw cwVar, Object obj) {
        com.google.d.b.an.C(cwVar, "key");
        com.google.d.b.an.C(obj, "value");
        IdentityHashMap identityHashMap = this.f46570j;
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            this.f46570j = identityHashMap;
        }
        identityHashMap.put(cwVar, obj);
    }

    public final void m(j jVar) {
        com.google.d.b.an.B(jVar);
        this.f46566f = jVar;
    }

    public final void n(cs csVar) {
        com.google.d.b.an.C(csVar, "metricRecorder");
        this.f46568h = csVar;
    }

    public final void o(di diVar) {
        this.f46569i = diVar;
    }

    public final void p(Executor executor) {
        this.f46567g = executor;
    }

    public final void q(dr drVar) {
        com.google.d.b.an.B(drVar);
        this.f46562b = drVar;
    }

    public final void r(ScheduledExecutorService scheduledExecutorService) {
        com.google.d.b.an.B(scheduledExecutorService);
        this.f46565e = scheduledExecutorService;
    }

    public final void s(dc dcVar) {
        this.f46564d = dcVar;
    }

    public final void t(el elVar) {
        com.google.d.b.an.B(elVar);
        this.f46563c = elVar;
    }

    public final void u() {
        this.f46561a = Integer.valueOf(DisplayStrings.DS_HEAVY);
    }
}
