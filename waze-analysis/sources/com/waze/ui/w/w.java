package com.waze.ui.w;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import com.waze.ui.w.b.bd;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class w extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f43794a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f43795b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f43796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(c cVar, DraggableAnchors draggableAnchors, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f43796c = i2;
        this.f43794a = cVar;
        this.f43795b = draggableAnchors;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.foundation.gestures.DraggableAnchors, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f43796c;
        if (i2 == 0) {
            return new w((c) this.f43794a, (DraggableAnchors) this.f43795b, eVar, 0);
        }
        if (i2 != 1) {
            return new w((h.g.a.l) this.f43794a, (c) this.f43795b, eVar, 2);
        }
        return new w((c) this.f43795b, (h.g.a.l) this.f43794a, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f43796c;
        return i2 != 0 ? i2 != 1 ? ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.foundation.gestures.DraggableAnchors, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f43796c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            AnchoredDraggableState.updateAnchors$default(((c) this.f43794a).b(), this.f43795b, null, 2, null);
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            this.f43794a.invoke(new com.waze.ui.w.b.f(com.waze.ui.w.b.b.f43626a, ((c) this.f43795b).d()));
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        c cVar = (c) this.f43795b;
        if (cVar.d() == bd.f43643c) {
            this.f43794a.invoke(new com.waze.ui.w.b.f(com.waze.ui.w.b.b.f43629d, cVar.d()));
        } else if (cVar.d() == bd.f43641a) {
            this.f43794a.invoke(com.waze.ui.w.b.g.f43696a);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(c cVar, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f43796c = i2;
        this.f43795b = cVar;
        this.f43794a = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(h.g.a.l lVar, c cVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f43796c = i2;
        this.f43794a = lVar;
        this.f43795b = cVar;
    }
}
