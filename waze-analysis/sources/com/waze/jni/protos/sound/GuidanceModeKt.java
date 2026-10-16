package com.waze.jni.protos.sound;

import com.waze.jni.protos.sound.GuidanceMode;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GuidanceModeKt {
    public static final GuidanceModeKt INSTANCE = new GuidanceModeKt();

    private GuidanceModeKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GuidanceMode.Builder _builder;

        private Dsl(GuidanceMode.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ GuidanceMode _build() {
            GuidanceMode guidanceModeBuild = this._builder.build();
            x.e(guidanceModeBuild, "build(...)");
            return guidanceModeBuild;
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final GuidanceMode.Type getType() {
            GuidanceMode.Type type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setType(GuidanceMode.Type type) {
            x.f(type, "value");
            this._builder.setType(type);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(GuidanceMode.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(GuidanceMode.Builder builder, o oVar) {
            this(builder);
        }
    }
}
