package com.waze.an.a.a;

import com.waze.jni.protos.insights_infra.SegmentInsightInfo;
import com.waze.jni.protos.insights_infra.SegmentInsightUpdate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class az extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14417a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f14418b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bb f14419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    az(bb bbVar, h.c.e eVar) {
        super(3, eVar);
        this.f14419c = bbVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        az azVar = new az(this.f14419c, (h.c.e) obj3);
        azVar.f14417a = (SegmentInsightUpdate) obj;
        azVar.f14418b = (Set) obj2;
        return azVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        SegmentInsightUpdate segmentInsightUpdate = (SegmentInsightUpdate) this.f14417a;
        Set set = (Set) this.f14418b;
        List<SegmentInsightInfo> infoList = segmentInsightUpdate.getInfoList();
        h.g.b.x.e(infoList, "getInfoList(...)");
        ArrayList arrayList = new ArrayList();
        for (SegmentInsightInfo segmentInsightInfo : infoList) {
            bb bbVar = this.f14419c;
            h.g.b.x.c(segmentInsightInfo);
            com.waze.an.a.r rVarB = bb.b(bbVar, segmentInsightInfo);
            if (rVarB != null) {
                arrayList.add(rVarB);
            }
        }
        return new h.k(arrayList, set);
    }
}
