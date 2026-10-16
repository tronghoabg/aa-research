package e.a.d;

import androidx.core.app.NotificationCompat;
import androidx.media3.common.C;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends cx {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f47291a;

    /* renamed from: b, reason: collision with root package name */
    private final as f47292b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f47293c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e.a.ee f47294d;

    /* renamed from: e, reason: collision with root package name */
    private e.a.ee f47295e;

    /* renamed from: f, reason: collision with root package name */
    private final gn f47296f;

    r(s sVar, as asVar, String str) {
        Objects.requireNonNull(sVar);
        this.f47291a = sVar;
        this.f47293c = new AtomicInteger(C.RATE_UNSET_INT);
        this.f47296f = new p(this);
        this.f47292b = asVar;
        com.google.d.b.an.C(str, "authority");
    }

    static /* bridge */ /* synthetic */ void f(r rVar) {
        synchronized (rVar) {
            if (rVar.f47293c.get() != 0) {
                return;
            }
            e.a.ee eeVar = rVar.f47295e;
            rVar.f47295e = null;
            if (eeVar != null) {
                super.t(eeVar);
            }
        }
    }

    @Override // e.a.d.cx
    protected final as a() {
        return this.f47292b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [e.a.e] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // e.a.d.cx, e.a.d.aj
    public final af b(e.a.cq cqVar, e.a.cm cmVar, e.a.h hVar, e.a.p[] pVarArr) {
        e.a.e eVarA = hVar.a();
        e.a.ba baVar = eVarA;
        if (eVarA == null) {
            baVar = 0;
        }
        if (baVar == 0) {
            return this.f47293c.get() >= 0 ? new cr(this.f47294d, pVarArr) : this.f47292b.b(cqVar, cmVar, hVar, pVarArr);
        }
        as asVar = this.f47292b;
        gn gnVar = this.f47296f;
        go goVar = new go(asVar, cqVar, cmVar, hVar, gnVar, pVarArr);
        if (this.f47293c.incrementAndGet() > 0) {
            gnVar.a();
            return new cr(this.f47294d, pVarArr);
        }
        try {
            baVar.d(new q(this), ((baVar instanceof e.a.ba) && baVar.a() && hVar.s() != null) ? hVar.s() : this.f47291a.f47298b, goVar);
        } catch (Throwable th) {
            goVar.b(e.a.ee.f47406f.g("Credentials should use fail() instead of throwing exceptions").f(th));
        }
        return goVar.c();
    }

    @Override // e.a.d.cx, e.a.d.ge
    public final void t(e.a.ee eeVar) {
        com.google.d.b.an.C(eeVar, NotificationCompat.CATEGORY_STATUS);
        synchronized (this) {
            AtomicInteger atomicInteger = this.f47293c;
            if (atomicInteger.get() < 0) {
                this.f47294d = eeVar;
                atomicInteger.addAndGet(Integer.MAX_VALUE);
                if (atomicInteger.get() != 0) {
                    this.f47295e = eeVar;
                } else {
                    super.t(eeVar);
                }
            }
        }
    }
}
