package com.waze.jni.protos.inbox;

import com.waze.jni.protos.inbox.InboxMessageList;
import com.waze.jni.protos.inbox.InboxMessageListKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InboxMessageListKtKt {
    /* renamed from: -initializeinboxMessageList, reason: not valid java name */
    public static final InboxMessageList m26197initializeinboxMessageList(l<? super InboxMessageListKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        InboxMessageListKt.Dsl.Companion companion = InboxMessageListKt.Dsl.Companion;
        InboxMessageList.Builder builderNewBuilder = InboxMessageList.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        InboxMessageListKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InboxMessageList copy(InboxMessageList inboxMessageList, l<? super InboxMessageListKt.Dsl, ab> lVar) {
        x.f(inboxMessageList, "<this>");
        x.f(lVar, "block");
        InboxMessageListKt.Dsl.Companion companion = InboxMessageListKt.Dsl.Companion;
        InboxMessageList.Builder builder = inboxMessageList.toBuilder();
        x.e(builder, "toBuilder(...)");
        InboxMessageListKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
