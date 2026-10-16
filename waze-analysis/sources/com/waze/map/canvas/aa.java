package com.waze.map.canvas;

import com.waze.jni.protos.map.MapOrientationModeChanged;
import com.waze.jni.protos.map.canvas.MainCanvasCameraStateProto;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28498a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainCanvasDelegatorImpl f28499b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar) {
        super(2, eVar);
        this.f28499b = mainCanvasDelegatorImpl;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aa aaVar = new aa(this.f28499b, eVar);
        aaVar.f28498a = obj;
        return aaVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aa) create((n) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        bj bjVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        n nVar = (n) this.f28498a;
        MainCanvasDelegatorImpl mainCanvasDelegatorImpl = this.f28499b;
        kotlinx.coroutines.b.bn bnVar = mainCanvasDelegatorImpl.f28490k;
        MainCanvasCameraStateProto mainCanvasCameraStateProtoB = nVar.b();
        com.waze.map.b.ag agVar = null;
        if (mainCanvasCameraStateProtoB != null) {
            bj[] bjVarArrValues = bj.values();
            int length = bjVarArrValues.length;
            for (int i2 = 0; i2 < length; i2++) {
                bjVar = bjVarArrValues[i2];
                if (bjVar.a() == mainCanvasCameraStateProtoB) {
                    break;
                }
            }
            bjVar = null;
        } else {
            bjVar = null;
        }
        bnVar.e(bjVar);
        kotlinx.coroutines.b.bn bnVar2 = mainCanvasDelegatorImpl.f28488i;
        Float fC = nVar.c();
        bnVar2.e(fC != null ? new bl(fC.floatValue(), false) : null);
        kotlinx.coroutines.b.bn bnVar3 = mainCanvasDelegatorImpl.f28489j;
        MapOrientationModeChanged.OrientationMode orientationModeA = nVar.a();
        if (orientationModeA != null) {
            int iOrdinal = orientationModeA.ordinal();
            if (iOrdinal == 0) {
                agVar = com.waze.map.b.ag.f27997b;
            } else if (iOrdinal == 1) {
                agVar = com.waze.map.b.ag.f27996a;
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                com.waze.shared_infra.i.h.c("unrecognized mode, should not happen in runtim, fallback to default (dynamic)");
                agVar = com.waze.map.b.ag.f27997b;
            }
        }
        bnVar3.e(agVar);
        return h.ab.f48028a;
    }
}
