package T4;

import E4.l;
import E4.z;
import Y4.k;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import x.C4412e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final z f11459c = new z(Object.class, Object.class, Object.class, Collections.singletonList(new l(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new Q4.c(0), null)), null);

    /* renamed from: a, reason: collision with root package name */
    public final C4412e f11460a = new C4412e(0);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f11461b = new AtomicReference();

    public final void a(Class cls, Class cls2, Class cls3, z zVar) {
        synchronized (this.f11460a) {
            C4412e c4412e = this.f11460a;
            k kVar = new k(cls, cls2, cls3);
            if (zVar == null) {
                zVar = f11459c;
            }
            c4412e.put(kVar, zVar);
        }
    }
}
