package com.waze.view.popups.b;

import android.content.Context;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f45264a;

    /* renamed from: b, reason: collision with root package name */
    int f45265b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f45266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(q qVar, h.c.e eVar) {
        super(2, eVar);
        this.f45266c = qVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new o(this.f45266c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        com.waze.app_nav.hub.b.k kVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f45265b != 0) {
            kVar = (com.waze.app_nav.hub.b.k) this.f45264a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            final q qVar = this.f45266c;
            com.waze.app_nav.hub.b.k kVar2 = new com.waze.app_nav.hub.b.k("MyParkingPhotoStateHolder::createPhotoSavedPopupModel()", null, new com.waze.app_nav.hub.b.j() { // from class: com.waze.view.popups.b.n
                @Override // com.waze.app_nav.hub.b.j
                public final com.waze.app_nav.hub.b.i create(Context context) {
                    return q.e(qVar, context);
                }
            }, 6);
            qVar.f45269b.b(kVar2);
            this.f45264a = kVar2;
            this.f45265b = 1;
            if (aj.q(2000L, this) == aVar) {
                return aVar;
            }
            kVar = kVar2;
        }
        this.f45266c.f45269b.c(kVar);
        return ab.f48028a;
    }
}
