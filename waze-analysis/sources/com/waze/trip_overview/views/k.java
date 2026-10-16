package com.waze.trip_overview.views;

import com.waze.z.a.g.aa;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f41540a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f41541b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aa f41542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(boolean z, aa aaVar, h.c.e eVar) {
        super(2, eVar);
        this.f41541b = z;
        this.f41542c = aaVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f41541b, this.f41542c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f41540a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            boolean z = this.f41541b;
            aa aaVar = this.f41542c;
            if (z) {
                this.f41540a = 1;
                if (aaVar.b(this) == aVar) {
                    return aVar;
                }
            } else {
                aaVar.c();
            }
        }
        return ab.f48028a;
    }
}
