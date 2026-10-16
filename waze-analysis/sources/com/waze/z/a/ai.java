package com.waze.z.a;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ai extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ al f45633a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f45634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(al alVar, float f2, h.c.e eVar) {
        super(2, eVar);
        this.f45633a = alVar;
        this.f45634b = f2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ai(this.f45633a, this.f45634b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ai) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        AnchoredDraggableState.updateAnchors$default(this.f45633a.a(), AnchoredDraggableKt.DraggableAnchors(new ah(this.f45634b, 0)), null, 2, null);
        return h.ab.f48028a;
    }
}
