package T3;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final String f11452e = J3.r.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final xa.d f11453a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11454b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11455c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f11456d = new Object();

    public x(xa.d dVar) {
        this.f11453a = dVar;
    }

    public final void a(S3.j jVar) {
        synchronized (this.f11456d) {
            try {
                if (((w) this.f11454b.remove(jVar)) != null) {
                    J3.r.d().a(f11452e, "Stopping timer for " + jVar);
                    this.f11455c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
