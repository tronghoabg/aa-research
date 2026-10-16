package com.waze.jni.protos.alerters;

import com.waze.jni.protos.alerters.AlerterSubType;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlerterSubTypeKt {
    public static final AlerterSubTypeKt INSTANCE = new AlerterSubTypeKt();

    private AlerterSubTypeKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AlerterSubType.Builder _builder;

        private Dsl(AlerterSubType.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AlerterSubType _build() {
            AlerterSubType alerterSubTypeBuild = this._builder.build();
            x.e(alerterSubTypeBuild, "build(...)");
            return alerterSubTypeBuild;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AlerterSubType.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(AlerterSubType.Builder builder, o oVar) {
            this(builder);
        }
    }
}
