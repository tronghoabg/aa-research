package com.waze.network.d;

import androidx.core.app.NotificationCompat;
import e.a.cm;
import e.a.dk;
import e.a.eb;
import e.a.ee;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f extends dk {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32189a;

    /* renamed from: b, reason: collision with root package name */
    private h.g.a.a f32190b;

    /* renamed from: c, reason: collision with root package name */
    private h.g.a.a f32191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.waze.uid.f fVar, com.waze.shared_infra.i.e eVar) {
        super(fVar);
        x.f(fVar, "delegate");
        x.f(eVar, "logger");
        this.f32189a = eVar;
        this.f32190b = new com.waze.native_managers.n(10);
        this.f32191c = new com.waze.native_managers.n(11);
    }

    @Override // e.a.dk, com.waze.uid.f
    public final void a(ee eeVar, cm cmVar) {
        x.f(eeVar, NotificationCompat.CATEGORY_STATUS);
        x.f(cmVar, "trailers");
        eb ebVarA = eeVar.a();
        Objects.toString(ebVarA);
        this.f32189a.a("onClose with status ".concat(ebVarA.toString()));
        if (eeVar.a() == ee.f47406f.a()) {
            this.f32190b.invoke();
            this.f32191c.invoke();
        }
        super.a(eeVar, cmVar);
    }

    public final void b(h.g.a.a aVar) {
        x.f(aVar, "<set-?>");
        this.f32191c = aVar;
    }

    public final void c(h.g.a.a aVar) {
        x.f(aVar, "<set-?>");
        this.f32190b = aVar;
    }
}
