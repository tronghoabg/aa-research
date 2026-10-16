package kotlinx.b;

import h.g.b.x;
import java.util.List;
import kotlinx.b.c.bo;
import kotlinx.b.c.cb;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51264a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final cb f51265b;

    /* renamed from: c, reason: collision with root package name */
    private static final cb f51266c;

    /* renamed from: d, reason: collision with root package name */
    private static final bo f51267d;

    /* renamed from: e, reason: collision with root package name */
    private static final bo f51268e;

    static {
        final int i2 = 1;
        f51265b = kotlinx.b.c.n.b(new h.g.a.l() { // from class: kotlinx.b.m
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                b bVarL;
                if (i2 != 0) {
                    h.l.c cVar = (h.l.c) obj;
                    int i3 = o.f51264a;
                    x.f(cVar, "it");
                    b bVarD = q.d(cVar);
                    if (bVarD == null) {
                        return h.o.c.p(cVar) ? new f(cVar) : null;
                    }
                    return bVarD;
                }
                h.l.c cVar2 = (h.l.c) obj;
                int i4 = o.f51264a;
                x.f(cVar2, "it");
                f fVarD = q.d(cVar2);
                if (fVarD == null) {
                    fVarD = h.o.c.p(cVar2) ? new f(cVar2) : null;
                }
                if (fVarD == null || (bVarL = kotlinx.b.a.b.l(fVarD)) == null) {
                    return null;
                }
                return bVarL;
            }
        });
        final int i3 = 0;
        f51266c = kotlinx.b.c.n.b(new h.g.a.l() { // from class: kotlinx.b.m
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                b bVarL;
                if (i3 != 0) {
                    h.l.c cVar = (h.l.c) obj;
                    int i32 = o.f51264a;
                    x.f(cVar, "it");
                    b bVarD = q.d(cVar);
                    if (bVarD == null) {
                        return h.o.c.p(cVar) ? new f(cVar) : null;
                    }
                    return bVarD;
                }
                h.l.c cVar2 = (h.l.c) obj;
                int i4 = o.f51264a;
                x.f(cVar2, "it");
                f fVarD = q.d(cVar2);
                if (fVarD == null) {
                    fVarD = h.o.c.p(cVar2) ? new f(cVar2) : null;
                }
                if (fVarD == null || (bVarL = kotlinx.b.a.b.l(fVarD)) == null) {
                    return null;
                }
                return bVarL;
            }
        });
        f51267d = kotlinx.b.c.n.a(new h.g.a.p() { // from class: kotlinx.b.n
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                b bVarL;
                if (i2 != 0) {
                    h.l.c cVar = (h.l.c) obj;
                    List list = (List) obj2;
                    int i4 = o.f51264a;
                    x.f(cVar, "clazz");
                    x.f(list, "types");
                    List listA = q.a(kotlinx.b.e.i.a(), list, true);
                    x.c(listA);
                    return q.b(cVar, listA, new com.waze.uid.state_impl.email.n(list, 11));
                }
                h.l.c cVar2 = (h.l.c) obj;
                List list2 = (List) obj2;
                int i5 = o.f51264a;
                x.f(cVar2, "clazz");
                x.f(list2, "types");
                List listA2 = q.a(kotlinx.b.e.i.a(), list2, true);
                x.c(listA2);
                b bVarB = q.b(cVar2, listA2, new com.waze.uid.state_impl.email.n(list2, 12));
                if (bVarB == null || (bVarL = kotlinx.b.a.b.l(bVarB)) == null) {
                    return null;
                }
                return bVarL;
            }
        });
        f51268e = kotlinx.b.c.n.a(new h.g.a.p() { // from class: kotlinx.b.n
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                b bVarL;
                if (i3 != 0) {
                    h.l.c cVar = (h.l.c) obj;
                    List list = (List) obj2;
                    int i4 = o.f51264a;
                    x.f(cVar, "clazz");
                    x.f(list, "types");
                    List listA = q.a(kotlinx.b.e.i.a(), list, true);
                    x.c(listA);
                    return q.b(cVar, listA, new com.waze.uid.state_impl.email.n(list, 11));
                }
                h.l.c cVar2 = (h.l.c) obj;
                List list2 = (List) obj2;
                int i5 = o.f51264a;
                x.f(cVar2, "clazz");
                x.f(list2, "types");
                List listA2 = q.a(kotlinx.b.e.i.a(), list2, true);
                x.c(listA2);
                b bVarB = q.b(cVar2, listA2, new com.waze.uid.state_impl.email.n(list2, 12));
                if (bVarB == null || (bVarL = kotlinx.b.a.b.l(bVarB)) == null) {
                    return null;
                }
                return bVarL;
            }
        });
    }

    public static final Object a(h.l.c cVar, List list, boolean z) {
        x.f(cVar, "clazz");
        x.f(list, "types");
        return !z ? f51267d.a(cVar, list) : f51268e.a(cVar, list);
    }

    public static final b b(h.l.c cVar, boolean z) {
        x.f(cVar, "clazz");
        if (z) {
            return f51266c.b(cVar);
        }
        b bVarB = f51265b.b(cVar);
        if (bVarB == null) {
            return null;
        }
        return bVarB;
    }
}
