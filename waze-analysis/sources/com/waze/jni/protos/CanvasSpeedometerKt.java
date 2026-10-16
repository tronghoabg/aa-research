package com.waze.jni.protos;

import com.waze.jni.protos.CanvasSpeedometer;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CanvasSpeedometerKt {
    public static final CanvasSpeedometerKt INSTANCE = new CanvasSpeedometerKt();

    private CanvasSpeedometerKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CanvasSpeedometer.Builder _builder;

        private Dsl(CanvasSpeedometer.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CanvasSpeedometer _build() {
            CanvasSpeedometer canvasSpeedometerBuild = this._builder.build();
            x.e(canvasSpeedometerBuild, "build(...)");
            return canvasSpeedometerBuild;
        }

        public final void clearShouldAdjustBottomOffset() {
            this._builder.clearShouldAdjustBottomOffset();
        }

        public final void clearSpeed() {
            this._builder.clearSpeed();
        }

        public final void clearSpeedLimit() {
            this._builder.clearSpeedLimit();
        }

        public final void clearSpeedLimitEnabled() {
            this._builder.clearSpeedLimitEnabled();
        }

        public final void clearSpeedLimitUsStyle() {
            this._builder.clearSpeedLimitUsStyle();
        }

        public final void clearSpeedUnits() {
            this._builder.clearSpeedUnits();
        }

        public final void clearVisible() {
            this._builder.clearVisible();
        }

        public final boolean getShouldAdjustBottomOffset() {
            return this._builder.getShouldAdjustBottomOffset();
        }

        public final int getSpeed() {
            return this._builder.getSpeed();
        }

        public final int getSpeedLimit() {
            return this._builder.getSpeedLimit();
        }

        public final boolean getSpeedLimitEnabled() {
            return this._builder.getSpeedLimitEnabled();
        }

        public final boolean getSpeedLimitUsStyle() {
            return this._builder.getSpeedLimitUsStyle();
        }

        public final String getSpeedUnits() {
            String speedUnits = this._builder.getSpeedUnits();
            x.e(speedUnits, "getSpeedUnits(...)");
            return speedUnits;
        }

        public final boolean getVisible() {
            return this._builder.getVisible();
        }

        public final boolean hasShouldAdjustBottomOffset() {
            return this._builder.hasShouldAdjustBottomOffset();
        }

        public final boolean hasSpeed() {
            return this._builder.hasSpeed();
        }

        public final boolean hasSpeedLimit() {
            return this._builder.hasSpeedLimit();
        }

        public final boolean hasSpeedLimitEnabled() {
            return this._builder.hasSpeedLimitEnabled();
        }

        public final boolean hasSpeedLimitUsStyle() {
            return this._builder.hasSpeedLimitUsStyle();
        }

        public final boolean hasSpeedUnits() {
            return this._builder.hasSpeedUnits();
        }

        public final boolean hasVisible() {
            return this._builder.hasVisible();
        }

        public final void setShouldAdjustBottomOffset(boolean z) {
            this._builder.setShouldAdjustBottomOffset(z);
        }

        public final void setSpeed(int i2) {
            this._builder.setSpeed(i2);
        }

        public final void setSpeedLimit(int i2) {
            this._builder.setSpeedLimit(i2);
        }

        public final void setSpeedLimitEnabled(boolean z) {
            this._builder.setSpeedLimitEnabled(z);
        }

        public final void setSpeedLimitUsStyle(boolean z) {
            this._builder.setSpeedLimitUsStyle(z);
        }

        public final void setSpeedUnits(String str) {
            x.f(str, "value");
            this._builder.setSpeedUnits(str);
        }

        public final void setVisible(boolean z) {
            this._builder.setVisible(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CanvasSpeedometer.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CanvasSpeedometer.Builder builder, o oVar) {
            this(builder);
        }
    }
}
