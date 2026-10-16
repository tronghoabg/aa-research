package com.waze.main_screen.ab.a;

import android.content.res.Resources;
import android.view.View;
import com.waze.kj;
import h.ab;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25630a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f25631b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kj f25632c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m f25633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Set set, kj kjVar, m mVar, h.c.e eVar) {
        super(2, eVar);
        this.f25631b = set;
        this.f25632c = kjVar;
        this.f25633d = mVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(this.f25631b, this.f25632c, this.f25633d, eVar);
        dVar.f25630a = obj;
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((List) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List<com.waze.main_screen.ab.g> list = (List) this.f25630a;
        boolean zIsEmpty = list.isEmpty();
        Set set = this.f25631b;
        if (zIsEmpty) {
            set.clear();
        } else {
            boolean zIsEmpty2 = set.isEmpty();
            kj kjVar = this.f25632c;
            m mVar = this.f25633d;
            for (com.waze.main_screen.ab.g gVar : list) {
                if (!set.contains(gVar)) {
                    if (gVar instanceof com.waze.main_screen.ab.a) {
                        com.waze.main_screen.ab.a aVar2 = (com.waze.main_screen.ab.a) gVar;
                        kjVar.r(aVar2.b(), aVar2.a());
                    } else {
                        if (gVar instanceof com.waze.main_screen.ab.c) {
                            throw null;
                        }
                        if (gVar instanceof com.waze.main_screen.ab.d) {
                            com.waze.main_screen.ab.d dVar = (com.waze.main_screen.ab.d) gVar;
                            if (dVar.a() == null) {
                                kjVar.G(dVar, new e(kjVar, mVar));
                            } else {
                                kjVar.n(dVar);
                            }
                        } else if (gVar instanceof com.waze.main_screen.ab.e) {
                            com.waze.main_screen.ab.e eVar = (com.waze.main_screen.ab.e) gVar;
                            kjVar.s(eVar.b(), eVar.d(), eVar.c(), eVar.a());
                        } else if (gVar instanceof com.waze.main_screen.ab.f) {
                            com.waze.main_screen.ab.f fVar = (com.waze.main_screen.ab.f) gVar;
                            kjVar.t(fVar.b(), fVar.a(), fVar.d(), fVar.c());
                        } else {
                            if (!(gVar instanceof com.waze.main_screen.ab.b)) {
                                throw new h.i();
                            }
                            kjVar.y((com.waze.main_screen.ab.b) gVar);
                        }
                    }
                    set.add(gVar);
                }
            }
            if (zIsEmpty2) {
                View view = kjVar.getView();
                if (view == null) {
                    com.waze.shared_infra.i.h.j("OpenSwipePopups called while fragment has no View, fragmentState ");
                } else {
                    view.post(new com.google.android.material.internal.o(kjVar, 5));
                }
            }
        }
        return ab.f48028a;
    }
}
