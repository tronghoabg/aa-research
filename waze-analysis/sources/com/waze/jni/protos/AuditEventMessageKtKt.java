package com.waze.jni.protos;

import com.waze.jni.protos.AuditEventMessage;
import com.waze.jni.protos.AuditEventMessageKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AuditEventMessageKtKt {
    /* renamed from: -initializeauditEventMessage, reason: not valid java name */
    public static final AuditEventMessage m24938initializeauditEventMessage(l<? super AuditEventMessageKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AuditEventMessageKt.Dsl.Companion companion = AuditEventMessageKt.Dsl.Companion;
        AuditEventMessage.Builder builderNewBuilder = AuditEventMessage.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AuditEventMessageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AuditEventMessage copy(AuditEventMessage auditEventMessage, l<? super AuditEventMessageKt.Dsl, ab> lVar) {
        x.f(auditEventMessage, "<this>");
        x.f(lVar, "block");
        AuditEventMessageKt.Dsl.Companion companion = AuditEventMessageKt.Dsl.Companion;
        AuditEventMessage.Builder builder = auditEventMessage.toBuilder();
        x.e(builder, "toBuilder(...)");
        AuditEventMessageKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
