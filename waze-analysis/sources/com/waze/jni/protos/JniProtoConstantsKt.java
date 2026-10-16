package com.waze.jni.protos;

import com.waze.jni.protos.JniProtoConstants;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class JniProtoConstantsKt {
    public static final JniProtoConstantsKt INSTANCE = new JniProtoConstantsKt();

    private JniProtoConstantsKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final JniProtoConstants.Builder _builder;

        private Dsl(JniProtoConstants.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ JniProtoConstants _build() {
            JniProtoConstants jniProtoConstantsBuild = this._builder.build();
            x.e(jniProtoConstantsBuild, "build(...)");
            return jniProtoConstantsBuild;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(JniProtoConstants.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(JniProtoConstants.Builder builder, o oVar) {
            this(builder);
        }
    }
}
