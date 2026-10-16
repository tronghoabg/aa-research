package com.waze.jni.protos.network;

import com.waze.jni.protos.network.MessageRequestMetadata;
import com.waze.jni.protos.network.MessageRequestMetadataKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MessageRequestMetadataKtKt {
    /* renamed from: -initializemessageRequestMetadata, reason: not valid java name */
    public static final MessageRequestMetadata m27825initializemessageRequestMetadata(l<? super MessageRequestMetadataKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MessageRequestMetadataKt.Dsl.Companion companion = MessageRequestMetadataKt.Dsl.Companion;
        MessageRequestMetadata.Builder builderNewBuilder = MessageRequestMetadata.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MessageRequestMetadataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MessageRequestMetadata copy(MessageRequestMetadata messageRequestMetadata, l<? super MessageRequestMetadataKt.Dsl, ab> lVar) {
        x.f(messageRequestMetadata, "<this>");
        x.f(lVar, "block");
        MessageRequestMetadataKt.Dsl.Companion companion = MessageRequestMetadataKt.Dsl.Companion;
        MessageRequestMetadata.Builder builder = messageRequestMetadata.toBuilder();
        x.e(builder, "toBuilder(...)");
        MessageRequestMetadataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
