package com.waze.uid.state_impl.add_id;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad extends com.waze.uid.e.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("WaitForLoginState", bVar, hVar, mVar);
        h.g.b.x.f(mVar, "controller");
    }

    static final void a(ad adVar) {
        adVar.k();
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.d.q.f44463a.a().f44467e.o(new Runnable() { // from class: com.waze.uid.state_impl.add_id.ac
            @Override // java.lang.Runnable
            public final void run() {
                ad.a(this.f44578a);
            }
        });
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return a.a.h(eVar);
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
    }
}
