package com.waze.z.a.b;

import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.unit.Velocity;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f45782a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FlingBehavior f45783b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableState f45784c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f45785d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f45786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(FlingBehavior flingBehavior, AnchoredDraggableState anchoredDraggableState, long j2, h.c.e eVar) {
        super(3, eVar);
        this.f45783b = flingBehavior;
        this.f45784c = anchoredDraggableState;
        this.f45785d = j2;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        v vVar = new v(this.f45783b, this.f45784c, this.f45785d, (h.c.e) obj3);
        vVar.f45786e = (AnchoredDragScope) obj;
        return vVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f45782a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            u uVar = new u((AnchoredDragScope) this.f45786e, this.f45784c);
            FlingBehavior flingBehavior = this.f45783b;
            if (flingBehavior != null) {
                float fM11407getYimpl = Velocity.m11407getYimpl(this.f45785d);
                this.f45782a = 1;
                if (flingBehavior.performFling(uVar, fM11407getYimpl, this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
