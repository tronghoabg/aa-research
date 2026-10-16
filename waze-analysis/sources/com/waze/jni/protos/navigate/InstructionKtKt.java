package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.Instruction;
import com.waze.jni.protos.navigate.InstructionKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InstructionKtKt {
    /* renamed from: -initializeinstruction, reason: not valid java name */
    public static final Instruction m27223initializeinstruction(l<? super InstructionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        InstructionKt.Dsl.Companion companion = InstructionKt.Dsl.Companion;
        Instruction.Builder builderNewBuilder = Instruction.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        InstructionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Instruction copy(Instruction instruction, l<? super InstructionKt.Dsl, ab> lVar) {
        x.f(instruction, "<this>");
        x.f(lVar, "block");
        InstructionKt.Dsl.Companion companion = InstructionKt.Dsl.Companion;
        Instruction.Builder builder = instruction.toBuilder();
        x.e(builder, "toBuilder(...)");
        InstructionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
