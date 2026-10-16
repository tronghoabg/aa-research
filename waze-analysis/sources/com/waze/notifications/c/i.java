package com.waze.notifications.c;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class i extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f32604a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.notifications.b.a f32605b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.presentation.k f32606c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f32607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(com.waze.reports_v2.presentation.k kVar, com.waze.notifications.b.a aVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f32607d = i2;
        this.f32606c = kVar;
        this.f32605b = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f32607d != 0 ? new i(this.f32606c, this.f32605b, eVar, 1, null) : new i(this.f32606c, this.f32605b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f32607d != 0 ? ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f32607d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f32604a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f32604a = 1;
                if (this.f32606c.f(this) == aVar) {
                    return aVar;
                }
            }
            this.f32605b.b(com.waze.notifications.b.c.f32551f);
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f32604a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f32604a = 1;
            if (this.f32606c.f(this) == aVar2) {
                return aVar2;
            }
        }
        this.f32605b.b(com.waze.notifications.b.c.f32550e);
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(com.waze.reports_v2.presentation.k kVar, com.waze.notifications.b.a aVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f32607d = i2;
        this.f32606c = kVar;
        this.f32605b = aVar;
    }
}
