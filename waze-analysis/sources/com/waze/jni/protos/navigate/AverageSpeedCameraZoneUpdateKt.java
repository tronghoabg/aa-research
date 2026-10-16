package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdate;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AverageSpeedCameraZoneUpdateKt {
    public static final AverageSpeedCameraZoneUpdateKt INSTANCE = new AverageSpeedCameraZoneUpdateKt();

    private AverageSpeedCameraZoneUpdateKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AverageSpeedCameraZoneUpdate.Builder _builder;

        private Dsl(AverageSpeedCameraZoneUpdate.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AverageSpeedCameraZoneUpdate _build() {
            AverageSpeedCameraZoneUpdate averageSpeedCameraZoneUpdateBuild = this._builder.build();
            x.e(averageSpeedCameraZoneUpdateBuild, "build(...)");
            return averageSpeedCameraZoneUpdateBuild;
        }

        public final void clearLeftDistance() {
            this._builder.clearLeftDistance();
        }

        public final void clearPercent() {
            this._builder.clearPercent();
        }

        public final void clearRecommendedSpeed() {
            this._builder.clearRecommendedSpeed();
        }

        public final int getLeftDistance() {
            return this._builder.getLeftDistance();
        }

        public final int getPercent() {
            return this._builder.getPercent();
        }

        public final int getRecommendedSpeed() {
            return this._builder.getRecommendedSpeed();
        }

        public final boolean hasLeftDistance() {
            return this._builder.hasLeftDistance();
        }

        public final boolean hasPercent() {
            return this._builder.hasPercent();
        }

        public final boolean hasRecommendedSpeed() {
            return this._builder.hasRecommendedSpeed();
        }

        public final void setLeftDistance(int i2) {
            this._builder.setLeftDistance(i2);
        }

        public final void setPercent(int i2) {
            this._builder.setPercent(i2);
        }

        public final void setRecommendedSpeed(int i2) {
            this._builder.setRecommendedSpeed(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AverageSpeedCameraZoneUpdate.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(AverageSpeedCameraZoneUpdate.Builder builder, o oVar) {
            this(builder);
        }
    }
}
