package kotlinx.coroutines.e;

import kotlinx.coroutines.dc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class au {

    /* renamed from: a, reason: collision with root package name */
    public final h.c.j f51882a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f51883b;

    /* renamed from: c, reason: collision with root package name */
    private final dc[] f51884c;

    /* renamed from: d, reason: collision with root package name */
    private int f51885d;

    public au(h.c.j jVar, int i2) {
        this.f51882a = jVar;
        this.f51883b = new Object[i2];
        this.f51884c = new dc[i2];
    }

    public final void a(dc dcVar, Object obj) {
        Object[] objArr = this.f51883b;
        int i2 = this.f51885d;
        objArr[i2] = obj;
        this.f51885d = i2 + 1;
        h.g.b.x.d(dcVar, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        this.f51884c[i2] = dcVar;
    }

    public final void b(h.c.j jVar) {
        dc[] dcVarArr = this.f51884c;
        int length = dcVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            dc dcVar = dcVarArr[length];
            h.g.b.x.c(dcVar);
            dcVar.restoreThreadContext(jVar, this.f51883b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }
}
