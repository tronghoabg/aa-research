package com.waze.app_nav.hub;

import com.waze.mo;
import java.io.IOException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15400a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f15401b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f15402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(af afVar, kotlinx.coroutines.af afVar2, h.c.e eVar) {
        super(2, eVar);
        this.f15401b = afVar;
        this.f15402c = afVar2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        u uVar = new u(this.f15401b, this.f15402c, eVar);
        uVar.f15400a = obj;
        return uVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((u) create((List) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws IOException {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f15400a;
        this.f15401b.al().c().a("WazePopupModels in the queue: " + this.f15402c + " - " + h.a.i.aM(list, ",", null, null, 0, new mo(3), 30));
        return h.ab.f48028a;
    }
}
