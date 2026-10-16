package com.waze.map.isolated;

import java.util.Objects;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f29210a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WazeMapWidgetNativeRenderer f29211b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.bk.a.c f29212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(WazeMapWidgetNativeRenderer wazeMapWidgetNativeRenderer, com.waze.bk.a.c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f29211b = wazeMapWidgetNativeRenderer;
        this.f29212c = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new aa(this.f29211b, this.f29212c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f29210a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            WazeMapWidgetNativeRenderer wazeMapWidgetNativeRenderer = this.f29211b;
            com.waze.bk.a.c cVar = this.f29212c;
            com.waze.shared_infra.i.e eVar = wazeMapWidgetNativeRenderer.f29203e;
            Objects.toString(cVar);
            eVar.a("render ".concat(String.valueOf(cVar)));
            this.f29210a = 1;
            if (ai.e(wazeMapWidgetNativeRenderer.f29201c, new z(wazeMapWidgetNativeRenderer, cVar, null), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
