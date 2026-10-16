package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.Instruction;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InstructionKt {
    public static final InstructionKt INSTANCE = new InstructionKt();

    private InstructionKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Instruction.Builder _builder;

        private Dsl(Instruction.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Instruction _build() {
            Instruction instructionBuild = this._builder.build();
            x.e(instructionBuild, "build(...)");
            return instructionBuild;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Instruction.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Instruction.Builder builder, o oVar) {
            this(builder);
        }
    }
}
