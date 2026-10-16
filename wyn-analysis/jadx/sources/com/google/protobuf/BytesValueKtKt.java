package com.google.protobuf;

import com.google.protobuf.BytesValue;
import com.google.protobuf.BytesValueKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/BytesValueKt$Dsl;", "Lef/C;", "block", "Lcom/google/protobuf/BytesValue;", "-initializebytesValue", "(Ltf/l;)Lcom/google/protobuf/BytesValue;", "bytesValue", "copy", "(Lcom/google/protobuf/BytesValue;Ltf/l;)Lcom/google/protobuf/BytesValue;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BytesValueKtKt {
    @NotNull
    /* renamed from: -initializebytesValue, reason: not valid java name */
    public static final BytesValue m176initializebytesValue(@NotNull tf.l block) {
        AbstractC3340k.e(block, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.INSTANCE;
        BytesValue.Builder builderNewBuilder = BytesValue.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final BytesValue copy(@NotNull BytesValue bytesValue, @NotNull tf.l block) {
        AbstractC3340k.e(bytesValue, "<this>");
        AbstractC3340k.e(block, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.INSTANCE;
        BytesValue.Builder builder = bytesValue.toBuilder();
        AbstractC3340k.d(builder, "this.toBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
