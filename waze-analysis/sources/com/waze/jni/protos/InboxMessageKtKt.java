package com.waze.jni.protos;

import com.waze.jni.protos.InboxMessage;
import com.waze.jni.protos.InboxMessageKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InboxMessageKtKt {
    /* renamed from: -initializeinboxMessage, reason: not valid java name */
    public static final InboxMessage m25189initializeinboxMessage(l<? super InboxMessageKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        InboxMessageKt.Dsl.Companion companion = InboxMessageKt.Dsl.Companion;
        InboxMessage.Builder builderNewBuilder = InboxMessage.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        InboxMessageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InboxMessage copy(InboxMessage inboxMessage, l<? super InboxMessageKt.Dsl, ab> lVar) {
        x.f(inboxMessage, "<this>");
        x.f(lVar, "block");
        InboxMessageKt.Dsl.Companion companion = InboxMessageKt.Dsl.Companion;
        InboxMessage.Builder builder = inboxMessage.toBuilder();
        x.e(builder, "toBuilder(...)");
        InboxMessageKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Advertisement getAdvertisementOrNull(InboxMessageOrBuilder inboxMessageOrBuilder) {
        x.f(inboxMessageOrBuilder, "<this>");
        if (inboxMessageOrBuilder.hasAdvertisement()) {
            return inboxMessageOrBuilder.getAdvertisement();
        }
        return null;
    }

    public static /* synthetic */ void getAdvertisementOrNull$annotations(InboxMessageOrBuilder inboxMessageOrBuilder) {
    }
}
