package com.waze;

import android.content.Intent;
import com.waze.web.SimpleWebActivity;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dz implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ el f23606a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.q.l f23607b;

    dz(el elVar, com.waze.q.l lVar) {
        this.f23606a = elVar;
        this.f23607b = lVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        com.waze.calendar.b bVar = (com.waze.calendar.b) obj;
        if (bVar instanceof com.waze.q.i) {
            el elVar = this.f23606a;
            Intent intent = new Intent(elVar, (Class<?>) SimpleWebActivity.class);
            intent.putExtra("webViewURL", ((com.waze.q.i) bVar).a());
            elVar.startActivity(intent);
        } else if (h.g.b.x.n(bVar, com.waze.q.g.f33472a)) {
            this.f23606a.al().b().b(com.waze.ui.r.a.d.d.e(new com.airbnb.lottie.b.v(this.f23607b, 7), new android.support.v4.a.a.c(7)));
        } else {
            if (!h.g.b.x.n(bVar, com.waze.q.h.f33473a)) {
                throw new h.i();
            }
            this.f23606a.finishAffinity();
        }
        return h.ab.f48028a;
    }
}
