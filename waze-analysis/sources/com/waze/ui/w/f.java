package com.waze.ui.w;

import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.unit.Velocity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f43725a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FlingBehavior f43726b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableState f43727c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f43728d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f43729e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(FlingBehavior flingBehavior, AnchoredDraggableState anchoredDraggableState, long j2, h.c.e eVar) {
        super(3, eVar);
        this.f43726b = flingBehavior;
        this.f43727c = anchoredDraggableState;
        this.f43728d = j2;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        f fVar = new f(this.f43726b, this.f43727c, this.f43728d, (h.c.e) obj3);
        fVar.f43729e = (AnchoredDragScope) obj;
        return fVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f43725a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            e eVar = new e((AnchoredDragScope) this.f43729e, this.f43727c);
            FlingBehavior flingBehavior = this.f43726b;
            if (flingBehavior != null) {
                float fM11407getYimpl = Velocity.m11407getYimpl(this.f43728d);
                this.f43725a = 1;
                if (flingBehavior.performFling(eVar, fM11407getYimpl, this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
