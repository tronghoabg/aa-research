package com.waze.jni.protos.sound;

import com.waze.jni.protos.sound.GuidanceSource;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GuidanceSourceKt {
    public static final GuidanceSourceKt INSTANCE = new GuidanceSourceKt();

    private GuidanceSourceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GuidanceSource.Builder _builder;

        private Dsl(GuidanceSource.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ GuidanceSource _build() {
            GuidanceSource guidanceSourceBuild = this._builder.build();
            x.e(guidanceSourceBuild, "build(...)");
            return guidanceSourceBuild;
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final GuidanceSource.Type getType() {
            GuidanceSource.Type type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setType(GuidanceSource.Type type) {
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

            public final /* synthetic */ Dsl _create(GuidanceSource.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(GuidanceSource.Builder builder, o oVar) {
            this(builder);
        }
    }
}
