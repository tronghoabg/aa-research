package com.waze.jni.protos;

import com.waze.jni.protos.Car3DInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Car3DInfoKt {
    public static final Car3DInfoKt INSTANCE = new Car3DInfoKt();

    private Car3DInfoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Car3DInfo.Builder _builder;

        private Dsl(Car3DInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Car3DInfo _build() {
            Car3DInfo car3DInfoBuild = this._builder.build();
            x.e(car3DInfoBuild, "build(...)");
            return car3DInfoBuild;
        }

        public final void clearHasNormalTexture() {
            this._builder.clearHasNormalTexture();
        }

        public final void clearHasShareTexture() {
            this._builder.clearHasShareTexture();
        }

        public final void clearHasTaxiTexture() {
            this._builder.clearHasTaxiTexture();
        }

        public final void clearLightingInfo() {
            this._builder.clearLightingInfo();
        }

        public final void clearScale() {
            this._builder.clearScale();
        }

        public final boolean getHasNormalTexture() {
            return this._builder.getHasNormalTexture();
        }

        public final boolean getHasShareTexture() {
            return this._builder.getHasShareTexture();
        }

        public final boolean getHasTaxiTexture() {
            return this._builder.getHasTaxiTexture();
        }

        public final LightingInfo getLightingInfo() {
            LightingInfo lightingInfo = this._builder.getLightingInfo();
            x.e(lightingInfo, "getLightingInfo(...)");
            return lightingInfo;
        }

        public final LightingInfo getLightingInfoOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return Car3DInfoKtKt.getLightingInfoOrNull(dsl._builder);
        }

        public final float getScale() {
            return this._builder.getScale();
        }

        public final boolean hasLightingInfo() {
            return this._builder.hasLightingInfo();
        }

        public final void setHasNormalTexture(boolean z) {
            this._builder.setHasNormalTexture(z);
        }

        public final void setHasShareTexture(boolean z) {
            this._builder.setHasShareTexture(z);
        }

        public final void setHasTaxiTexture(boolean z) {
            this._builder.setHasTaxiTexture(z);
        }

        public final void setLightingInfo(LightingInfo lightingInfo) {
            x.f(lightingInfo, "value");
            this._builder.setLightingInfo(lightingInfo);
        }

        public final void setScale(float f2) {
            this._builder.setScale(f2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Car3DInfo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Car3DInfo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
