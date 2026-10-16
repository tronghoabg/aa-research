package com.waze.jni.protos.map;

import com.waze.jni.protos.map.AnimationParams;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AnimationParamsKt {
    public static final AnimationParamsKt INSTANCE = new AnimationParamsKt();

    private AnimationParamsKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AnimationParams.Builder _builder;

        private Dsl(AnimationParams.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AnimationParams _build() {
            AnimationParams animationParamsBuild = this._builder.build();
            x.e(animationParamsBuild, "build(...)");
            return animationParamsBuild;
        }

        public final void clearAnimationDurationMs() {
            this._builder.clearAnimationDurationMs();
        }

        public final void clearAnimationStartTimeMs() {
            this._builder.clearAnimationStartTimeMs();
        }

        public final void clearCurveType() {
            this._builder.clearCurveType();
        }

        public final long getAnimationDurationMs() {
            return this._builder.getAnimationDurationMs();
        }

        public final long getAnimationStartTimeMs() {
            return this._builder.getAnimationStartTimeMs();
        }

        public final AnimationParams.CurveType getCurveType() {
            AnimationParams.CurveType curveType = this._builder.getCurveType();
            x.e(curveType, "getCurveType(...)");
            return curveType;
        }

        public final int getCurveTypeValue() {
            return this._builder.getCurveTypeValue();
        }

        public final void setAnimationDurationMs(long j2) {
            this._builder.setAnimationDurationMs(j2);
        }

        public final void setAnimationStartTimeMs(long j2) {
            this._builder.setAnimationStartTimeMs(j2);
        }

        public final void setCurveType(AnimationParams.CurveType curveType) {
            x.f(curveType, "value");
            this._builder.setCurveType(curveType);
        }

        public final void setCurveTypeValue(int i2) {
            this._builder.setCurveTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AnimationParams.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(AnimationParams.Builder builder, o oVar) {
            this(builder);
        }
    }
}
