package com.waze.uid.state_impl.c;

import androidx.core.app.NotificationCompat;
import com.waze.tide.s;
import com.waze.uid.b.m;
import com.waze.uid.b.n;
import com.waze.uid.b.o;
import com.waze.uid.e.f;
import com.waze.uid.e.h;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z, com.waze.uid.e.b bVar, h hVar, m mVar) {
        super("StateSetLoader", bVar, hVar, mVar);
        x.f(mVar, "controller");
        this.f44621a = z;
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        x.f(eVar, "dir");
        super.f(eVar);
        boolean z = this.f44621a;
        m mVar = this.f44485c;
        mVar.k(mVar.a().b(z ? new n(o.f44168a) : null));
        k();
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        x.f(eVar, "dir");
        return eVar == com.waze.uid.e.e.f44481a;
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(s sVar) {
        x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (x.n(sVar.getClass(), com.waze.uid.b.c.class)) {
            return;
        }
        super.o(sVar);
    }
}
