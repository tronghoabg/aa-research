package com.waze.jni.protos;

import com.waze.jni.protos.LightingInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LightingInfoKt {
    public static final LightingInfoKt INSTANCE = new LightingInfoKt();

    private LightingInfoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final LightingInfo.Builder _builder;

        private Dsl(LightingInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ LightingInfo _build() {
            LightingInfo lightingInfoBuild = this._builder.build();
            x.e(lightingInfoBuild, "build(...)");
            return lightingInfoBuild;
        }

        public final void clearAmbientIntensity() {
            this._builder.clearAmbientIntensity();
        }

        public final void clearDiffuseIntensity() {
            this._builder.clearDiffuseIntensity();
        }

        public final float getAmbientIntensity() {
            return this._builder.getAmbientIntensity();
        }

        public final float getDiffuseIntensity() {
            return this._builder.getDiffuseIntensity();
        }

        public final void setAmbientIntensity(float f2) {
            this._builder.setAmbientIntensity(f2);
        }

        public final void setDiffuseIntensity(float f2) {
            this._builder.setDiffuseIntensity(f2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(LightingInfo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(LightingInfo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
