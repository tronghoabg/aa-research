package com.waze.jni.protos.map;

import com.waze.jni.protos.map.ExtendedPolyline;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ExtendedPolylineKt {
    public static final ExtendedPolylineKt INSTANCE = new ExtendedPolylineKt();

    private ExtendedPolylineKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ExtendedPolyline.Builder _builder;

        private Dsl(ExtendedPolyline.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ExtendedPolyline _build() {
            ExtendedPolyline extendedPolylineBuild = this._builder.build();
            x.e(extendedPolylineBuild, "build(...)");
            return extendedPolylineBuild;
        }

        public final void clearAnimationParams() {
            this._builder.clearAnimationParams();
        }

        public final void clearCutTrailingBehavior() {
            this._builder.clearCutTrailingBehavior();
        }

        public final void clearPolyline() {
            this._builder.clearPolyline();
        }

        public final void clearStyle() {
            this._builder.clearStyle();
        }

        public final void clearTag() {
            this._builder.clearTag();
        }

        public final void clearZoomLevelDisplayRange() {
            this._builder.clearZoomLevelDisplayRange();
        }

        public final AnimationParams getAnimationParams() {
            AnimationParams animationParams = this._builder.getAnimationParams();
            x.e(animationParams, "getAnimationParams(...)");
            return animationParams;
        }

        public final AnimationParams getAnimationParamsOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ExtendedPolylineKtKt.getAnimationParamsOrNull(dsl._builder);
        }

        public final ExtendedPolyline.CutTrailingBehavior getCutTrailingBehavior() {
            ExtendedPolyline.CutTrailingBehavior cutTrailingBehavior = this._builder.getCutTrailingBehavior();
            x.e(cutTrailingBehavior, "getCutTrailingBehavior(...)");
            return cutTrailingBehavior;
        }

        public final int getCutTrailingBehaviorValue() {
            return this._builder.getCutTrailingBehaviorValue();
        }

        public final Polyline getPolyline() {
            Polyline polyline = this._builder.getPolyline();
            x.e(polyline, "getPolyline(...)");
            return polyline;
        }

        public final Polyline getPolylineOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ExtendedPolylineKtKt.getPolylineOrNull(dsl._builder);
        }

        public final ExtendedPolyline.Style getStyle() {
            ExtendedPolyline.Style style = this._builder.getStyle();
            x.e(style, "getStyle(...)");
            return style;
        }

        public final int getStyleValue() {
            return this._builder.getStyleValue();
        }

        public final String getTag() {
            String tag = this._builder.getTag();
            x.e(tag, "getTag(...)");
            return tag;
        }

        public final ZoomLevelDisplayRange getZoomLevelDisplayRange() {
            ZoomLevelDisplayRange zoomLevelDisplayRange = this._builder.getZoomLevelDisplayRange();
            x.e(zoomLevelDisplayRange, "getZoomLevelDisplayRange(...)");
            return zoomLevelDisplayRange;
        }

        public final ZoomLevelDisplayRange getZoomLevelDisplayRangeOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ExtendedPolylineKtKt.getZoomLevelDisplayRangeOrNull(dsl._builder);
        }

        public final boolean hasAnimationParams() {
            return this._builder.hasAnimationParams();
        }

        public final boolean hasPolyline() {
            return this._builder.hasPolyline();
        }

        public final boolean hasTag() {
            return this._builder.hasTag();
        }

        public final boolean hasZoomLevelDisplayRange() {
            return this._builder.hasZoomLevelDisplayRange();
        }

        public final void setAnimationParams(AnimationParams animationParams) {
            x.f(animationParams, "value");
            this._builder.setAnimationParams(animationParams);
        }

        public final void setCutTrailingBehavior(ExtendedPolyline.CutTrailingBehavior cutTrailingBehavior) {
            x.f(cutTrailingBehavior, "value");
            this._builder.setCutTrailingBehavior(cutTrailingBehavior);
        }

        public final void setCutTrailingBehaviorValue(int i2) {
            this._builder.setCutTrailingBehaviorValue(i2);
        }

        public final void setPolyline(Polyline polyline) {
            x.f(polyline, "value");
            this._builder.setPolyline(polyline);
        }

        public final void setStyle(ExtendedPolyline.Style style) {
            x.f(style, "value");
            this._builder.setStyle(style);
        }

        public final void setStyleValue(int i2) {
            this._builder.setStyleValue(i2);
        }

        public final void setTag(String str) {
            x.f(str, "value");
            this._builder.setTag(str);
        }

        public final void setZoomLevelDisplayRange(ZoomLevelDisplayRange zoomLevelDisplayRange) {
            x.f(zoomLevelDisplayRange, "value");
            this._builder.setZoomLevelDisplayRange(zoomLevelDisplayRange);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ExtendedPolyline.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ExtendedPolyline.Builder builder, o oVar) {
            this(builder);
        }
    }
}
