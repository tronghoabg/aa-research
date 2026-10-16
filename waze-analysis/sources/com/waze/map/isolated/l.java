package com.waze.map.isolated;

import com.waze.map.b.ed;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final ed f29233a;

    /* renamed from: b, reason: collision with root package name */
    private final List f29234b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f29235c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f29236d;

    public l(ed edVar) {
        h.g.b.x.f(edVar, "default");
        this.f29233a = edVar;
        this.f29234b = h.a.i.l(new WeakReference(edVar));
        bn bnVarB = ck.b(edVar);
        this.f29235c = bnVarB;
        this.f29236d = ai.U(bnVarB);
    }

    static final void c(l lVar, WeakReference weakReference) {
        ed edVar;
        List list = lVar.f29234b;
        list.remove(weakReference);
        while (true) {
            if (!list.isEmpty()) {
                WeakReference weakReference2 = (WeakReference) h.a.i.U(list);
                edVar = weakReference2 != null ? (ed) weakReference2.get() : null;
                if (edVar != null) {
                    break;
                } else {
                    list.remove(h.a.i.e(list));
                }
            } else {
                edVar = lVar.f29233a;
                break;
            }
        }
        lVar.f29235c.e(edVar);
    }

    public final com.waze.shared_infra.s.d a(ed edVar) {
        h.g.b.x.f(edVar, "mapViewController");
        final WeakReference weakReference = new WeakReference(edVar);
        this.f29234b.add(weakReference);
        this.f29235c.e(edVar);
        return new com.waze.shared_infra.s.d() { // from class: com.waze.map.isolated.j
            @Override // com.waze.shared_infra.s.d
            public final void a() {
                l.c(this.f29231a, weakReference);
            }
        };
    }

    public final ch b() {
        return this.f29236d;
    }
}
