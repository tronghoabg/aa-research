package com.waze.jni.protos.rtalerts;

import com.waze.jni.protos.location.ProviderPosition;
import com.waze.jni.protos.rtalerts.ReportLocationProto;
import com.waze.jni.protos.rtalerts.ReportLocationProtoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ReportLocationProtoKtKt {
    /* renamed from: -initializereportLocationProto, reason: not valid java name */
    public static final ReportLocationProto m28166initializereportLocationProto(l<? super ReportLocationProtoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ReportLocationProtoKt.Dsl.Companion companion = ReportLocationProtoKt.Dsl.Companion;
        ReportLocationProto.Builder builderNewBuilder = ReportLocationProto.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ReportLocationProtoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ReportLocationProto copy(ReportLocationProto reportLocationProto, l<? super ReportLocationProtoKt.Dsl, ab> lVar) {
        x.f(reportLocationProto, "<this>");
        x.f(lVar, "block");
        ReportLocationProtoKt.Dsl.Companion companion = ReportLocationProtoKt.Dsl.Companion;
        ReportLocationProto.Builder builder = reportLocationProto.toBuilder();
        x.e(builder, "toBuilder(...)");
        ReportLocationProtoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ProviderPosition getPositionOrNull(ReportLocationProtoOrBuilder reportLocationProtoOrBuilder) {
        x.f(reportLocationProtoOrBuilder, "<this>");
        if (reportLocationProtoOrBuilder.hasPosition()) {
            return reportLocationProtoOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(ReportLocationProtoOrBuilder reportLocationProtoOrBuilder) {
    }
}
