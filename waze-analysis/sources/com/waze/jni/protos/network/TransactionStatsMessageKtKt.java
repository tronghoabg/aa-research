package com.waze.jni.protos.network;

import com.waze.jni.protos.network.TransactionStatsMessage;
import com.waze.jni.protos.network.TransactionStatsMessageKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TransactionStatsMessageKtKt {
    /* renamed from: -initializetransactionStatsMessage, reason: not valid java name */
    public static final TransactionStatsMessage m27878initializetransactionStatsMessage(l<? super TransactionStatsMessageKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TransactionStatsMessageKt.Dsl.Companion companion = TransactionStatsMessageKt.Dsl.Companion;
        TransactionStatsMessage.Builder builderNewBuilder = TransactionStatsMessage.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TransactionStatsMessageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TransactionStatsMessage copy(TransactionStatsMessage transactionStatsMessage, l<? super TransactionStatsMessageKt.Dsl, ab> lVar) {
        x.f(transactionStatsMessage, "<this>");
        x.f(lVar, "block");
        TransactionStatsMessageKt.Dsl.Companion companion = TransactionStatsMessageKt.Dsl.Companion;
        TransactionStatsMessage.Builder builder = transactionStatsMessage.toBuilder();
        x.e(builder, "toBuilder(...)");
        TransactionStatsMessageKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
