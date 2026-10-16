package com.waze.network;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bk extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32152a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bl f32153b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f32154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bl blVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f32154c = i2;
        this.f32153b = blVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f32154c != 0) {
            bk bkVar = new bk(this.f32153b, eVar, 1, null);
            bkVar.f32152a = obj;
            return bkVar;
        }
        bk bkVar2 = new bk(this.f32153b, eVar, 0);
        bkVar2.f32152a = obj;
        return bkVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f32154c != 0 ? ((bk) create((com.waze.navigate.location_preview.ba) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bk) create((com.waze.navigate.location_preview.ba) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f32154c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.navigate.location_preview.ba baVar = (com.waze.navigate.location_preview.ba) this.f32152a;
            com.waze.shared_infra.i.e eVarD = this.f32153b.d();
            Objects.toString(baVar);
            eVarD.g("network status updated: ".concat(String.valueOf(baVar)));
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.navigate.location_preview.ba baVar2 = (com.waze.navigate.location_preview.ba) this.f32152a;
        bl blVar = this.f32153b;
        blVar.a().a(baVar2);
        blVar.e().invoke(Boolean.valueOf(baVar2 instanceof ah));
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bl blVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f32154c = i2;
        this.f32153b = blVar;
    }
}
