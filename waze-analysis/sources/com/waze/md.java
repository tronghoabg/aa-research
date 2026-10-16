package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class md extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f29621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    md(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29621a = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f29621a != 0 ? new md(eVar, 1, null) : new md(eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f29621a != 0 ? ((md) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((md) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f29621a == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.resources.i.a();
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        try {
            if (!lh.a()) {
                com.waze.shared_infra.i.h.a("AdsTrackingCannot get ads tracking data, google service not available...");
                return null;
            }
            com.google.android.gms.a.a.c cVarA = com.google.android.gms.a.a.d.a(mg.f29780a.a());
            com.waze.shared_infra.i.h.a("AdsTrackingGot ads tracking data, isLimitAdTrackingEnabled=" + cVarA.b());
            return cVarA;
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.c("AdsTrackingCannot get ads tracking data: ".concat(String.valueOf(e2.getMessage())));
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    md(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f29621a = i2;
    }
}
