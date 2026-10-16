package com.waze.search.v2;

import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class by extends h.g.b.u implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f36208a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    by(Object obj, int i2) {
        super(2, obj, ck.class, "onDraggingOffsetChanged", "onDraggingOffsetChanged(ZLcom/waze/design_components/bottom_sheet/RelativeDraggingOffset;)V", 0);
        this.f36208a = i2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f36208a;
        if (i2 == 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            com.waze.design_components.a.d dVar = (com.waze.design_components.a.d) obj2;
            h.g.b.x.f(dVar, "p1");
            ck.v((ck) this.receiver, zBooleanValue, dVar);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            com.waze.design_components.a.d dVar2 = (com.waze.design_components.a.d) obj2;
            h.g.b.x.f(dVar2, "p1");
            ck.v((ck) this.receiver, zBooleanValue2, dVar2);
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
            float fM11178unboximpl = ((Dp) obj2).m11178unboximpl();
            ck ckVar = (ck) this.receiver;
            ckVar.m.setValue(ckVar.O().c(zBooleanValue3, Dp.m11162boximpl(fM11178unboximpl)));
            return h.ab.f48028a;
        }
        if (i2 != 3) {
            ((h.g.a.l) this.receiver).invoke((com.waze.map.b.bi) obj);
            return h.ab.f48028a;
        }
        ((h.g.a.l) this.receiver).invoke((com.waze.map.b.bg) obj);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    by(Object obj, int i2, char[] cArr) {
        super(2, obj, ck.class, "updateOverlayHeaderHeight", "updateOverlayHeaderHeight-3ABfNKs(ZF)V", 0);
        this.f36208a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    by(Object obj, int i2, int[] iArr) {
        super(2, obj, h.g.b.w.class, "suspendConversion0", "maintainMapData$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/waze/map/controller/MapContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.f36208a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    by(Object obj, int i2, short[] sArr) {
        super(2, obj, h.g.b.w.class, "suspendConversion0", "maintainMapBounds$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/waze/map/controller/MapBoundsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.f36208a = i2;
    }
}
