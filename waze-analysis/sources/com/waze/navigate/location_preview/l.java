package com.waze.navigate.location_preview;

import android.content.Context;
import com.waze.map.b.ed;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ed f31739a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f31740b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.h.c f31741c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f31742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(ed edVar, Context context, com.waze.shared_infra.h.c cVar, int i2, h.c.e eVar) {
        super(2, eVar);
        this.f31739a = edVar;
        this.f31740b = context;
        this.f31741c = cVar;
        this.f31742d = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new l(this.f31739a, this.f31740b, this.f31741c, this.f31742d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ba.k(this.f31739a, this.f31740b, this.f31741c, this.f31742d);
        return h.ab.f48028a;
    }
}
