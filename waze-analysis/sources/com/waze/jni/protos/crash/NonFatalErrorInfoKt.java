package com.waze.jni.protos.crash;

import com.waze.jni.protos.crash.NonFatalErrorInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NonFatalErrorInfoKt {
    public static final NonFatalErrorInfoKt INSTANCE = new NonFatalErrorInfoKt();

    private NonFatalErrorInfoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NonFatalErrorInfo.Builder _builder;

        private Dsl(NonFatalErrorInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NonFatalErrorInfo _build() {
            NonFatalErrorInfo nonFatalErrorInfoBuild = this._builder.build();
            x.e(nonFatalErrorInfoBuild, "build(...)");
            return nonFatalErrorInfoBuild;
        }

        public final void clearArgumentsFormatted() {
            this._builder.clearArgumentsFormatted();
        }

        public final void clearFunctionName() {
            this._builder.clearFunctionName();
        }

        public final void clearLine() {
            this._builder.clearLine();
        }

        public final void clearSourceFileName() {
            this._builder.clearSourceFileName();
        }

        public final String getArgumentsFormatted() {
            String argumentsFormatted = this._builder.getArgumentsFormatted();
            x.e(argumentsFormatted, "getArgumentsFormatted(...)");
            return argumentsFormatted;
        }

        public final String getFunctionName() {
            String functionName = this._builder.getFunctionName();
            x.e(functionName, "getFunctionName(...)");
            return functionName;
        }

        public final int getLine() {
            return this._builder.getLine();
        }

        public final String getSourceFileName() {
            String sourceFileName = this._builder.getSourceFileName();
            x.e(sourceFileName, "getSourceFileName(...)");
            return sourceFileName;
        }

        public final boolean hasArgumentsFormatted() {
            return this._builder.hasArgumentsFormatted();
        }

        public final boolean hasFunctionName() {
            return this._builder.hasFunctionName();
        }

        public final boolean hasLine() {
            return this._builder.hasLine();
        }

        public final boolean hasSourceFileName() {
            return this._builder.hasSourceFileName();
        }

        public final void setArgumentsFormatted(String str) {
            x.f(str, "value");
            this._builder.setArgumentsFormatted(str);
        }

        public final void setFunctionName(String str) {
            x.f(str, "value");
            this._builder.setFunctionName(str);
        }

        public final void setLine(int i2) {
            this._builder.setLine(i2);
        }

        public final void setSourceFileName(String str) {
            x.f(str, "value");
            this._builder.setSourceFileName(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NonFatalErrorInfo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NonFatalErrorInfo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
