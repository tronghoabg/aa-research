package com.waze.jni.protos.copilot.data;

import com.waze.jni.protos.copilot.data.CarRenderingInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CarRenderingInfoKt {
    public static final CarRenderingInfoKt INSTANCE = new CarRenderingInfoKt();

    private CarRenderingInfoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CarRenderingInfo.Builder _builder;

        private Dsl(CarRenderingInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CarRenderingInfo _build() {
            CarRenderingInfo carRenderingInfoBuild = this._builder.build();
            x.e(carRenderingInfoBuild, "build(...)");
            return carRenderingInfoBuild;
        }

        public final void clearCarName() {
            this._builder.clearCarName();
        }

        public final void clearIsFromServer() {
            this._builder.clearIsFromServer();
        }

        public final void clearLightingInfo() {
            this._builder.clearLightingInfo();
        }

        public final void clearModelFileName() {
            this._builder.clearModelFileName();
        }

        public final void clearNormalTextureFilePath() {
            this._builder.clearNormalTextureFilePath();
        }

        public final void clearScale() {
            this._builder.clearScale();
        }

        public final void clearShareTextureFilePath() {
            this._builder.clearShareTextureFilePath();
        }

        public final void clearTaxiTextureFilePath() {
            this._builder.clearTaxiTextureFilePath();
        }

        public final String getCarName() {
            String carName = this._builder.getCarName();
            x.e(carName, "getCarName(...)");
            return carName;
        }

        public final boolean getIsFromServer() {
            return this._builder.getIsFromServer();
        }

        public final LightingRenderingInfo getLightingInfo() {
            LightingRenderingInfo lightingInfo = this._builder.getLightingInfo();
            x.e(lightingInfo, "getLightingInfo(...)");
            return lightingInfo;
        }

        public final LightingRenderingInfo getLightingInfoOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return CarRenderingInfoKtKt.getLightingInfoOrNull(dsl._builder);
        }

        public final String getModelFileName() {
            String modelFileName = this._builder.getModelFileName();
            x.e(modelFileName, "getModelFileName(...)");
            return modelFileName;
        }

        public final String getNormalTextureFilePath() {
            String normalTextureFilePath = this._builder.getNormalTextureFilePath();
            x.e(normalTextureFilePath, "getNormalTextureFilePath(...)");
            return normalTextureFilePath;
        }

        public final float getScale() {
            return this._builder.getScale();
        }

        public final String getShareTextureFilePath() {
            String shareTextureFilePath = this._builder.getShareTextureFilePath();
            x.e(shareTextureFilePath, "getShareTextureFilePath(...)");
            return shareTextureFilePath;
        }

        public final String getTaxiTextureFilePath() {
            String taxiTextureFilePath = this._builder.getTaxiTextureFilePath();
            x.e(taxiTextureFilePath, "getTaxiTextureFilePath(...)");
            return taxiTextureFilePath;
        }

        public final boolean hasLightingInfo() {
            return this._builder.hasLightingInfo();
        }

        public final boolean hasShareTextureFilePath() {
            return this._builder.hasShareTextureFilePath();
        }

        public final boolean hasTaxiTextureFilePath() {
            return this._builder.hasTaxiTextureFilePath();
        }

        public final void setCarName(String str) {
            x.f(str, "value");
            this._builder.setCarName(str);
        }

        public final void setIsFromServer(boolean z) {
            this._builder.setIsFromServer(z);
        }

        public final void setLightingInfo(LightingRenderingInfo lightingRenderingInfo) {
            x.f(lightingRenderingInfo, "value");
            this._builder.setLightingInfo(lightingRenderingInfo);
        }

        public final void setModelFileName(String str) {
            x.f(str, "value");
            this._builder.setModelFileName(str);
        }

        public final void setNormalTextureFilePath(String str) {
            x.f(str, "value");
            this._builder.setNormalTextureFilePath(str);
        }

        public final void setScale(float f2) {
            this._builder.setScale(f2);
        }

        public final void setShareTextureFilePath(String str) {
            x.f(str, "value");
            this._builder.setShareTextureFilePath(str);
        }

        public final void setTaxiTextureFilePath(String str) {
            x.f(str, "value");
            this._builder.setTaxiTextureFilePath(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CarRenderingInfo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CarRenderingInfo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
