package com.waze.car_lib.i.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ag extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20074a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f20075b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f20076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(h.c.e eVar, int i2) {
        super(3, eVar);
        this.f20076c = i2;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f20076c != 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            ag agVar = new ag((h.c.e) obj3, 1, null);
            agVar.f20075b = zBooleanValue;
            agVar.f20074a = (com.waze.realtime_report_feedback.c) obj2;
            return agVar.invokeSuspend(h.ab.f48028a);
        }
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        ag agVar2 = new ag((h.c.e) obj3, 0);
        agVar2.f20074a = (u) obj;
        agVar2.f20075b = zBooleanValue2;
        return agVar2.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f20076c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return new m((com.waze.realtime_report_feedback.c) this.f20074a, this.f20075b);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        u uVar = (u) this.f20074a;
        boolean z = this.f20075b;
        com.waze.shared_infra.i.h.b("PillWidget", "bottom pill state changed street=" + uVar.b() + ", segment=" + uVar.a() + ", isTracking=" + z);
        if (!z) {
            return null;
        }
        if (uVar.a() != null) {
            return uVar.a();
        }
        if (uVar.b() != null) {
            return uVar.b();
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(h.c.e eVar, int i2, byte[] bArr) {
        super(3, eVar);
        this.f20076c = i2;
    }
}
