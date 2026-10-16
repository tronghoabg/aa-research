package com.waze.jni.protos.insights_infra;

import com.waze.jni.protos.insights_infra.SegmentInsightUpdate;
import com.waze.jni.protos.insights_infra.SegmentInsightUpdateKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SegmentInsightUpdateKtKt {
    /* renamed from: -initializesegmentInsightUpdate, reason: not valid java name */
    public static final SegmentInsightUpdate m26272initializesegmentInsightUpdate(l<? super SegmentInsightUpdateKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        SegmentInsightUpdateKt.Dsl.Companion companion = SegmentInsightUpdateKt.Dsl.Companion;
        SegmentInsightUpdate.Builder builderNewBuilder = SegmentInsightUpdate.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        SegmentInsightUpdateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SegmentInsightUpdate copy(SegmentInsightUpdate segmentInsightUpdate, l<? super SegmentInsightUpdateKt.Dsl, ab> lVar) {
        x.f(segmentInsightUpdate, "<this>");
        x.f(lVar, "block");
        SegmentInsightUpdateKt.Dsl.Companion companion = SegmentInsightUpdateKt.Dsl.Companion;
        SegmentInsightUpdate.Builder builder = segmentInsightUpdate.toBuilder();
        x.e(builder, "toBuilder(...)");
        SegmentInsightUpdateKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
