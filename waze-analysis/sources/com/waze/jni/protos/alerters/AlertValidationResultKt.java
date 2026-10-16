package com.waze.jni.protos.alerters;

import com.waze.jni.protos.alerters.AlertValidationResult;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlertValidationResultKt {
    public static final AlertValidationResultKt INSTANCE = new AlertValidationResultKt();

    private AlertValidationResultKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AlertValidationResult.Builder _builder;

        private Dsl(AlertValidationResult.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AlertValidationResult _build() {
            AlertValidationResult alertValidationResultBuild = this._builder.build();
            x.e(alertValidationResultBuild, "build(...)");
            return alertValidationResultBuild;
        }

        public final void clearDistanceMeters() {
            this._builder.clearDistanceMeters();
        }

        public final void clearIsValid() {
            this._builder.clearIsValid();
        }

        public final void clearTimeToAlertSec() {
            this._builder.clearTimeToAlertSec();
        }

        public final int getDistanceMeters() {
            return this._builder.getDistanceMeters();
        }

        public final boolean getIsValid() {
            return this._builder.getIsValid();
        }

        public final int getTimeToAlertSec() {
            return this._builder.getTimeToAlertSec();
        }

        public final boolean hasDistanceMeters() {
            return this._builder.hasDistanceMeters();
        }

        public final boolean hasTimeToAlertSec() {
            return this._builder.hasTimeToAlertSec();
        }

        public final void setDistanceMeters(int i2) {
            this._builder.setDistanceMeters(i2);
        }

        public final void setIsValid(boolean z) {
            this._builder.setIsValid(z);
        }

        public final void setTimeToAlertSec(int i2) {
            this._builder.setTimeToAlertSec(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AlertValidationResult.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(AlertValidationResult.Builder builder, o oVar) {
            this(builder);
        }
    }
}
