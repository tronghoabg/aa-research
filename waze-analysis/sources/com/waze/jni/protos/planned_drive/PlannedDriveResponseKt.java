package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.planned_drive.PlannedDriveResponse;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PlannedDriveResponseKt {
    public static final PlannedDriveResponseKt INSTANCE = new PlannedDriveResponseKt();

    private PlannedDriveResponseKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PlannedDriveResponse.Builder _builder;

        private Dsl(PlannedDriveResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ PlannedDriveResponse _build() {
            PlannedDriveResponse plannedDriveResponseBuild = this._builder.build();
            x.e(plannedDriveResponseBuild, "build(...)");
            return plannedDriveResponseBuild;
        }

        public final void clearErrorMessage() {
            this._builder.clearErrorMessage();
        }

        public final void clearErrorTitle() {
            this._builder.clearErrorTitle();
        }

        public final void clearSuccess() {
            this._builder.clearSuccess();
        }

        public final String getErrorMessage() {
            String errorMessage = this._builder.getErrorMessage();
            x.e(errorMessage, "getErrorMessage(...)");
            return errorMessage;
        }

        public final String getErrorTitle() {
            String errorTitle = this._builder.getErrorTitle();
            x.e(errorTitle, "getErrorTitle(...)");
            return errorTitle;
        }

        public final boolean getSuccess() {
            return this._builder.getSuccess();
        }

        public final boolean hasErrorMessage() {
            return this._builder.hasErrorMessage();
        }

        public final boolean hasErrorTitle() {
            return this._builder.hasErrorTitle();
        }

        public final void setErrorMessage(String str) {
            x.f(str, "value");
            this._builder.setErrorMessage(str);
        }

        public final void setErrorTitle(String str) {
            x.f(str, "value");
            this._builder.setErrorTitle(str);
        }

        public final void setSuccess(boolean z) {
            this._builder.setSuccess(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(PlannedDriveResponse.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(PlannedDriveResponse.Builder builder, o oVar) {
            this(builder);
        }
    }
}
