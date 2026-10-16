package com.waze.jni.protos.copilot.data;

import com.waze.jni.protos.copilot.data.LightingRenderingInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LightingRenderingInfoKt {
    public static final LightingRenderingInfoKt INSTANCE = new LightingRenderingInfoKt();

    private LightingRenderingInfoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final LightingRenderingInfo.Builder _builder;

        private Dsl(LightingRenderingInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ LightingRenderingInfo _build() {
            LightingRenderingInfo lightingRenderingInfoBuild = this._builder.build();
            x.e(lightingRenderingInfoBuild, "build(...)");
            return lightingRenderingInfoBuild;
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

            public final /* synthetic */ Dsl _create(LightingRenderingInfo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(LightingRenderingInfo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
