package com.waze.jni.protos;

import com.waze.jni.protos.QuestionProto;
import com.waze.jni.protos.QuestionProtoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class QuestionProtoKtKt {
    /* renamed from: -initializequestionProto, reason: not valid java name */
    public static final QuestionProto m25547initializequestionProto(l<? super QuestionProtoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        QuestionProtoKt.Dsl.Companion companion = QuestionProtoKt.Dsl.Companion;
        QuestionProto.Builder builderNewBuilder = QuestionProto.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        QuestionProtoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final QuestionProto.CallToAction copy(QuestionProto.CallToAction callToAction, l<? super QuestionProtoKt.CallToActionKt.Dsl, ab> lVar) {
        x.f(callToAction, "<this>");
        x.f(lVar, "block");
        QuestionProtoKt.CallToActionKt.Dsl.Companion companion = QuestionProtoKt.CallToActionKt.Dsl.Companion;
        QuestionProto.CallToAction.Builder builder = callToAction.toBuilder();
        x.e(builder, "toBuilder(...)");
        QuestionProtoKt.CallToActionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final QuestionProto.Link copy(QuestionProto.Link link, l<? super QuestionProtoKt.LinkKt.Dsl, ab> lVar) {
        x.f(link, "<this>");
        x.f(lVar, "block");
        QuestionProtoKt.LinkKt.Dsl.Companion companion = QuestionProtoKt.LinkKt.Dsl.Companion;
        QuestionProto.Link.Builder builder = link.toBuilder();
        x.e(builder, "toBuilder(...)");
        QuestionProtoKt.LinkKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final QuestionProto copy(QuestionProto questionProto, l<? super QuestionProtoKt.Dsl, ab> lVar) {
        x.f(questionProto, "<this>");
        x.f(lVar, "block");
        QuestionProtoKt.Dsl.Companion companion = QuestionProtoKt.Dsl.Companion;
        QuestionProto.Builder builder = questionProto.toBuilder();
        x.e(builder, "toBuilder(...)");
        QuestionProtoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
