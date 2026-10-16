package com.google.protobuf;

import com.google.protobuf.Struct;
import com.google.protobuf.StructKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/StructKt$Dsl;", "Lef/C;", "block", "Lcom/google/protobuf/Struct;", "-initializestruct", "(Ltf/l;)Lcom/google/protobuf/Struct;", "struct", "copy", "(Lcom/google/protobuf/Struct;Ltf/l;)Lcom/google/protobuf/Struct;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StructKtKt {
    @NotNull
    /* renamed from: -initializestruct, reason: not valid java name */
    public static final Struct m193initializestruct(@NotNull tf.l block) {
        AbstractC3340k.e(block, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.INSTANCE;
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        StructKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Struct copy(@NotNull Struct struct, @NotNull tf.l block) {
        AbstractC3340k.e(struct, "<this>");
        AbstractC3340k.e(block, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.INSTANCE;
        Struct.Builder builder = struct.toBuilder();
        AbstractC3340k.d(builder, "this.toBuilder()");
        StructKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
