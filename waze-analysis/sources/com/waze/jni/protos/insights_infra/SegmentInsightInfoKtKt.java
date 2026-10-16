package com.waze.jni.protos.insights_infra;

import com.waze.jni.protos.InsightPriority;
import com.waze.jni.protos.insights_infra.SegmentInsightInfo;
import com.waze.jni.protos.insights_infra.SegmentInsightInfoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SegmentInsightInfoKtKt {
    /* renamed from: -initializesegmentInsightInfo, reason: not valid java name */
    public static final SegmentInsightInfo m26264initializesegmentInsightInfo(l<? super SegmentInsightInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        SegmentInsightInfoKt.Dsl.Companion companion = SegmentInsightInfoKt.Dsl.Companion;
        SegmentInsightInfo.Builder builderNewBuilder = SegmentInsightInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        SegmentInsightInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SegmentInsightInfo.AlertInfo copy(SegmentInsightInfo.AlertInfo alertInfo, l<? super SegmentInsightInfoKt.AlertInfoKt.Dsl, ab> lVar) {
        x.f(alertInfo, "<this>");
        x.f(lVar, "block");
        SegmentInsightInfoKt.AlertInfoKt.Dsl.Companion companion = SegmentInsightInfoKt.AlertInfoKt.Dsl.Companion;
        SegmentInsightInfo.AlertInfo.Builder builder = alertInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        SegmentInsightInfoKt.AlertInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SegmentInsightInfo.Id getIdOrNull(SegmentInsightInfoOrBuilder segmentInsightInfoOrBuilder) {
        x.f(segmentInsightInfoOrBuilder, "<this>");
        if (segmentInsightInfoOrBuilder.hasId()) {
            return segmentInsightInfoOrBuilder.getId();
        }
        return null;
    }

    public static /* synthetic */ void getIdOrNull$annotations(SegmentInsightInfoOrBuilder segmentInsightInfoOrBuilder) {
    }

    public static final InsightPriority getPriorityOrNull(SegmentInsightInfoOrBuilder segmentInsightInfoOrBuilder) {
        x.f(segmentInsightInfoOrBuilder, "<this>");
        if (segmentInsightInfoOrBuilder.hasPriority()) {
            return segmentInsightInfoOrBuilder.getPriority();
        }
        return null;
    }

    public static /* synthetic */ void getPriorityOrNull$annotations(SegmentInsightInfoOrBuilder segmentInsightInfoOrBuilder) {
    }

    public static final SegmentInsightInfo.Id copy(SegmentInsightInfo.Id id, l<? super SegmentInsightInfoKt.IdKt.Dsl, ab> lVar) {
        x.f(id, "<this>");
        x.f(lVar, "block");
        SegmentInsightInfoKt.IdKt.Dsl.Companion companion = SegmentInsightInfoKt.IdKt.Dsl.Companion;
        SegmentInsightInfo.Id.Builder builder = id.toBuilder();
        x.e(builder, "toBuilder(...)");
        SegmentInsightInfoKt.IdKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SegmentInsightInfo copy(SegmentInsightInfo segmentInsightInfo, l<? super SegmentInsightInfoKt.Dsl, ab> lVar) {
        x.f(segmentInsightInfo, "<this>");
        x.f(lVar, "block");
        SegmentInsightInfoKt.Dsl.Companion companion = SegmentInsightInfoKt.Dsl.Companion;
        SegmentInsightInfo.Builder builder = segmentInsightInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        SegmentInsightInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
