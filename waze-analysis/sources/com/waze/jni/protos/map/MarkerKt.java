package com.waze.jni.protos.map;

import com.waze.jni.protos.NativeBitmap;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.Marker;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MarkerKt {
    public static final MarkerKt INSTANCE = new MarkerKt();

    private MarkerKt() {
    }

    /* renamed from: -initializehitBoxInset, reason: not valid java name */
    public final Marker.HitBoxInset m26940initializehitBoxInset(l<? super HitBoxInsetKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        HitBoxInsetKt.Dsl.Companion companion = HitBoxInsetKt.Dsl.Companion;
        Marker.HitBoxInset.Builder builderNewBuilder = Marker.HitBoxInset.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        HitBoxInsetKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializemarkerHideAnimationParams, reason: not valid java name */
    public final Marker.MarkerHideAnimationParams m26941initializemarkerHideAnimationParams(l<? super MarkerHideAnimationParamsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MarkerHideAnimationParamsKt.Dsl.Companion companion = MarkerHideAnimationParamsKt.Dsl.Companion;
        Marker.MarkerHideAnimationParams.Builder builderNewBuilder = Marker.MarkerHideAnimationParams.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MarkerHideAnimationParamsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializemarkerShowAnimationParams, reason: not valid java name */
    public final Marker.MarkerShowAnimationParams m26942initializemarkerShowAnimationParams(l<? super MarkerShowAnimationParamsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MarkerShowAnimationParamsKt.Dsl.Companion companion = MarkerShowAnimationParamsKt.Dsl.Companion;
        Marker.MarkerShowAnimationParams.Builder builderNewBuilder = Marker.MarkerShowAnimationParams.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MarkerShowAnimationParamsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class HitBoxInsetKt {
        public static final HitBoxInsetKt INSTANCE = new HitBoxInsetKt();

        private HitBoxInsetKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Marker.HitBoxInset.Builder _builder;

            private Dsl(Marker.HitBoxInset.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Marker.HitBoxInset _build() {
                Marker.HitBoxInset hitBoxInsetBuild = this._builder.build();
                x.e(hitBoxInsetBuild, "build(...)");
                return hitBoxInsetBuild;
            }

            public final void clearBottom() {
                this._builder.clearBottom();
            }

            public final void clearLeft() {
                this._builder.clearLeft();
            }

            public final void clearRight() {
                this._builder.clearRight();
            }

            public final void clearTop() {
                this._builder.clearTop();
            }

            public final int getBottom() {
                return this._builder.getBottom();
            }

            public final int getLeft() {
                return this._builder.getLeft();
            }

            public final int getRight() {
                return this._builder.getRight();
            }

            public final int getTop() {
                return this._builder.getTop();
            }

            public final void setBottom(int i2) {
                this._builder.setBottom(i2);
            }

            public final void setLeft(int i2) {
                this._builder.setLeft(i2);
            }

            public final void setRight(int i2) {
                this._builder.setRight(i2);
            }

            public final void setTop(int i2) {
                this._builder.setTop(i2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Marker.HitBoxInset.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Marker.HitBoxInset.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class MarkerHideAnimationParamsKt {
        public static final MarkerHideAnimationParamsKt INSTANCE = new MarkerHideAnimationParamsKt();

        private MarkerHideAnimationParamsKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Marker.MarkerHideAnimationParams.Builder _builder;

            private Dsl(Marker.MarkerHideAnimationParams.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Marker.MarkerHideAnimationParams _build() {
                Marker.MarkerHideAnimationParams markerHideAnimationParamsBuild = this._builder.build();
                x.e(markerHideAnimationParamsBuild, "build(...)");
                return markerHideAnimationParamsBuild;
            }

            public final void clearAnimationParams() {
                this._builder.clearAnimationParams();
            }

            public final void clearAnimationType() {
                this._builder.clearAnimationType();
            }

            public final AnimationParams getAnimationParams() {
                AnimationParams animationParams = this._builder.getAnimationParams();
                x.e(animationParams, "getAnimationParams(...)");
                return animationParams;
            }

            public final AnimationParams getAnimationParamsOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MarkerKtKt.getAnimationParamsOrNull(dsl._builder);
            }

            public final Marker.MarkerHideAnimationParams.HideAnimationType getAnimationType() {
                Marker.MarkerHideAnimationParams.HideAnimationType animationType = this._builder.getAnimationType();
                x.e(animationType, "getAnimationType(...)");
                return animationType;
            }

            public final int getAnimationTypeValue() {
                return this._builder.getAnimationTypeValue();
            }

            public final boolean hasAnimationParams() {
                return this._builder.hasAnimationParams();
            }

            public final void setAnimationParams(AnimationParams animationParams) {
                x.f(animationParams, "value");
                this._builder.setAnimationParams(animationParams);
            }

            public final void setAnimationType(Marker.MarkerHideAnimationParams.HideAnimationType hideAnimationType) {
                x.f(hideAnimationType, "value");
                this._builder.setAnimationType(hideAnimationType);
            }

            public final void setAnimationTypeValue(int i2) {
                this._builder.setAnimationTypeValue(i2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Marker.MarkerHideAnimationParams.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Marker.MarkerHideAnimationParams.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class MarkerShowAnimationParamsKt {
        public static final MarkerShowAnimationParamsKt INSTANCE = new MarkerShowAnimationParamsKt();

        private MarkerShowAnimationParamsKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final Marker.MarkerShowAnimationParams.Builder _builder;

            private Dsl(Marker.MarkerShowAnimationParams.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ Marker.MarkerShowAnimationParams _build() {
                Marker.MarkerShowAnimationParams markerShowAnimationParamsBuild = this._builder.build();
                x.e(markerShowAnimationParamsBuild, "build(...)");
                return markerShowAnimationParamsBuild;
            }

            public final void clearAnimationParams() {
                this._builder.clearAnimationParams();
            }

            public final void clearAnimationType() {
                this._builder.clearAnimationType();
            }

            public final AnimationParams getAnimationParams() {
                AnimationParams animationParams = this._builder.getAnimationParams();
                x.e(animationParams, "getAnimationParams(...)");
                return animationParams;
            }

            public final AnimationParams getAnimationParamsOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MarkerKtKt.getAnimationParamsOrNull(dsl._builder);
            }

            public final Marker.MarkerShowAnimationParams.ShowAnimationType getAnimationType() {
                Marker.MarkerShowAnimationParams.ShowAnimationType animationType = this._builder.getAnimationType();
                x.e(animationType, "getAnimationType(...)");
                return animationType;
            }

            public final int getAnimationTypeValue() {
                return this._builder.getAnimationTypeValue();
            }

            public final boolean hasAnimationParams() {
                return this._builder.hasAnimationParams();
            }

            public final void setAnimationParams(AnimationParams animationParams) {
                x.f(animationParams, "value");
                this._builder.setAnimationParams(animationParams);
            }

            public final void setAnimationType(Marker.MarkerShowAnimationParams.ShowAnimationType showAnimationType) {
                x.f(showAnimationType, "value");
                this._builder.setAnimationType(showAnimationType);
            }

            public final void setAnimationTypeValue(int i2) {
                this._builder.setAnimationTypeValue(i2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Marker.MarkerShowAnimationParams.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(Marker.MarkerShowAnimationParams.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Marker.Builder _builder;

        private Dsl(Marker.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Marker _build() {
            Marker markerBuild = this._builder.build();
            x.e(markerBuild, "build(...)");
            return markerBuild;
        }

        public final void clearAlignment() {
            this._builder.clearAlignment();
        }

        public final void clearAnchorOffset() {
            this._builder.clearAnchorOffset();
        }

        public final void clearHitBoxInset() {
            this._builder.clearHitBoxInset();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearImage() {
            this._builder.clearImage();
        }

        public final void clearMarkerHideAnimationParams() {
            this._builder.clearMarkerHideAnimationParams();
        }

        public final void clearMarkerShowAnimationParams() {
            this._builder.clearMarkerShowAnimationParams();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final void clearPriority() {
            this._builder.clearPriority();
        }

        public final void clearScale() {
            this._builder.clearScale();
        }

        public final void clearZoomLevelDisplayRange() {
            this._builder.clearZoomLevelDisplayRange();
        }

        public final Marker.Alignment getAlignment() {
            Marker.Alignment alignment = this._builder.getAlignment();
            x.e(alignment, "getAlignment(...)");
            return alignment;
        }

        public final int getAlignmentValue() {
            return this._builder.getAlignmentValue();
        }

        public final ScreenPoint getAnchorOffset() {
            ScreenPoint anchorOffset = this._builder.getAnchorOffset();
            x.e(anchorOffset, "getAnchorOffset(...)");
            return anchorOffset;
        }

        public final ScreenPoint getAnchorOffsetOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MarkerKtKt.getAnchorOffsetOrNull(dsl._builder);
        }

        public final Marker.HitBoxInset getHitBoxInset() {
            Marker.HitBoxInset hitBoxInset = this._builder.getHitBoxInset();
            x.e(hitBoxInset, "getHitBoxInset(...)");
            return hitBoxInset;
        }

        public final Marker.HitBoxInset getHitBoxInsetOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MarkerKtKt.getHitBoxInsetOrNull(dsl._builder);
        }

        public final String getId() {
            String id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
        }

        public final NativeBitmap getImage() {
            NativeBitmap image = this._builder.getImage();
            x.e(image, "getImage(...)");
            return image;
        }

        public final NativeBitmap getImageOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MarkerKtKt.getImageOrNull(dsl._builder);
        }

        public final Marker.MarkerHideAnimationParams getMarkerHideAnimationParams() {
            Marker.MarkerHideAnimationParams markerHideAnimationParams = this._builder.getMarkerHideAnimationParams();
            x.e(markerHideAnimationParams, "getMarkerHideAnimationParams(...)");
            return markerHideAnimationParams;
        }

        public final Marker.MarkerHideAnimationParams getMarkerHideAnimationParamsOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MarkerKtKt.getMarkerHideAnimationParamsOrNull(dsl._builder);
        }

        public final Marker.MarkerShowAnimationParams getMarkerShowAnimationParams() {
            Marker.MarkerShowAnimationParams markerShowAnimationParams = this._builder.getMarkerShowAnimationParams();
            x.e(markerShowAnimationParams, "getMarkerShowAnimationParams(...)");
            return markerShowAnimationParams;
        }

        public final Marker.MarkerShowAnimationParams getMarkerShowAnimationParamsOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MarkerKtKt.getMarkerShowAnimationParamsOrNull(dsl._builder);
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MarkerKtKt.getPositionOrNull(dsl._builder);
        }

        public final Marker.Priority getPriority() {
            Marker.Priority priority = this._builder.getPriority();
            x.e(priority, "getPriority(...)");
            return priority;
        }

        public final int getPriorityValue() {
            return this._builder.getPriorityValue();
        }

        public final float getScale() {
            return this._builder.getScale();
        }

        public final ZoomLevelDisplayRange getZoomLevelDisplayRange() {
            ZoomLevelDisplayRange zoomLevelDisplayRange = this._builder.getZoomLevelDisplayRange();
            x.e(zoomLevelDisplayRange, "getZoomLevelDisplayRange(...)");
            return zoomLevelDisplayRange;
        }

        public final ZoomLevelDisplayRange getZoomLevelDisplayRangeOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MarkerKtKt.getZoomLevelDisplayRangeOrNull(dsl._builder);
        }

        public final boolean hasAnchorOffset() {
            return this._builder.hasAnchorOffset();
        }

        public final boolean hasHitBoxInset() {
            return this._builder.hasHitBoxInset();
        }

        public final boolean hasImage() {
            return this._builder.hasImage();
        }

        public final boolean hasMarkerHideAnimationParams() {
            return this._builder.hasMarkerHideAnimationParams();
        }

        public final boolean hasMarkerShowAnimationParams() {
            return this._builder.hasMarkerShowAnimationParams();
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final boolean hasScale() {
            return this._builder.hasScale();
        }

        public final boolean hasZoomLevelDisplayRange() {
            return this._builder.hasZoomLevelDisplayRange();
        }

        public final void setAlignment(Marker.Alignment alignment) {
            x.f(alignment, "value");
            this._builder.setAlignment(alignment);
        }

        public final void setAlignmentValue(int i2) {
            this._builder.setAlignmentValue(i2);
        }

        public final void setAnchorOffset(ScreenPoint screenPoint) {
            x.f(screenPoint, "value");
            this._builder.setAnchorOffset(screenPoint);
        }

        public final void setHitBoxInset(Marker.HitBoxInset hitBoxInset) {
            x.f(hitBoxInset, "value");
            this._builder.setHitBoxInset(hitBoxInset);
        }

        public final void setId(String str) {
            x.f(str, "value");
            this._builder.setId(str);
        }

        public final void setImage(NativeBitmap nativeBitmap) {
            x.f(nativeBitmap, "value");
            this._builder.setImage(nativeBitmap);
        }

        public final void setMarkerHideAnimationParams(Marker.MarkerHideAnimationParams markerHideAnimationParams) {
            x.f(markerHideAnimationParams, "value");
            this._builder.setMarkerHideAnimationParams(markerHideAnimationParams);
        }

        public final void setMarkerShowAnimationParams(Marker.MarkerShowAnimationParams markerShowAnimationParams) {
            x.f(markerShowAnimationParams, "value");
            this._builder.setMarkerShowAnimationParams(markerShowAnimationParams);
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        public final void setPriority(Marker.Priority priority) {
            x.f(priority, "value");
            this._builder.setPriority(priority);
        }

        public final void setPriorityValue(int i2) {
            this._builder.setPriorityValue(i2);
        }

        public final void setScale(float f2) {
            this._builder.setScale(f2);
        }

        public final void setZoomLevelDisplayRange(ZoomLevelDisplayRange zoomLevelDisplayRange) {
            x.f(zoomLevelDisplayRange, "value");
            this._builder.setZoomLevelDisplayRange(zoomLevelDisplayRange);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Marker.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Marker.Builder builder, o oVar) {
            this(builder);
        }
    }
}
