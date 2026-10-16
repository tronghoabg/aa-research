package com.waze.jni.protos.network;

import com.waze.jni.protos.network.ResultStructMessage;
import com.waze.jni.protos.network.ResultStructMessageKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ResultStructMessageKtKt {
    /* renamed from: -initializeresultStructMessage, reason: not valid java name */
    public static final ResultStructMessage m27856initializeresultStructMessage(l<? super ResultStructMessageKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ResultStructMessageKt.Dsl.Companion companion = ResultStructMessageKt.Dsl.Companion;
        ResultStructMessage.Builder builderNewBuilder = ResultStructMessage.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ResultStructMessageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ResultStructMessage copy(ResultStructMessage resultStructMessage, l<? super ResultStructMessageKt.Dsl, ab> lVar) {
        x.f(resultStructMessage, "<this>");
        x.f(lVar, "block");
        ResultStructMessageKt.Dsl.Companion companion = ResultStructMessageKt.Dsl.Companion;
        ResultStructMessage.Builder builder = resultStructMessage.toBuilder();
        x.e(builder, "toBuilder(...)");
        ResultStructMessageKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TransactionStatsMessage getStatsOrNull(ResultStructMessageOrBuilder resultStructMessageOrBuilder) {
        x.f(resultStructMessageOrBuilder, "<this>");
        if (resultStructMessageOrBuilder.hasStats()) {
            return resultStructMessageOrBuilder.getStats();
        }
        return null;
    }

    public static /* synthetic */ void getStatsOrNull$annotations(ResultStructMessageOrBuilder resultStructMessageOrBuilder) {
    }
}
