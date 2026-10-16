package kotlinx.coroutines.e;

import kotlinx.coroutines.dc;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    public static final ak f51872a = new ak("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final h.g.a.p f51873b = new com.waze.cf.j(10);

    /* renamed from: c, reason: collision with root package name */
    private static final h.g.a.p f51874c = new com.waze.cf.j(11);

    /* renamed from: d, reason: collision with root package name */
    private static final h.g.a.p f51875d = new ao();

    public static final Object a(h.c.j jVar) {
        Object objFold = jVar.fold(0, f51873b);
        if (objFold == null) {
            h.g.b.x.g();
        }
        return objFold;
    }

    public static final Object b(h.c.j jVar, Object obj) {
        if (obj == null) {
            obj = a(jVar);
        }
        if (obj == 0) {
            return f51872a;
        }
        if (obj instanceof Integer) {
            return jVar.fold(new au(jVar, ((Number) obj).intValue()), f51875d);
        }
        h.g.b.x.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((dc) obj).updateThreadContext(jVar);
    }

    public static final void c(h.c.j jVar, Object obj) {
        if (obj == f51872a) {
            return;
        }
        if (obj instanceof au) {
            ((au) obj).b(jVar);
            return;
        }
        Object objFold = jVar.fold(null, f51874c);
        h.g.b.x.d(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((dc) objFold).restoreThreadContext(jVar, obj);
    }
}
