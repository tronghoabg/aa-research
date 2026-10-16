package com.waze.jni.protos.alerters;

import com.waze.jni.protos.alerters.RejectedAlert;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RejectedAlertKt {
    public static final RejectedAlertKt INSTANCE = new RejectedAlertKt();

    private RejectedAlertKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RejectedAlert.Builder _builder;

        private Dsl(RejectedAlert.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RejectedAlert _build() {
            RejectedAlert rejectedAlertBuild = this._builder.build();
            x.e(rejectedAlertBuild, "build(...)");
            return rejectedAlertBuild;
        }

        public final void clearAlertId() {
            this._builder.clearAlertId();
        }

        public final void clearReason() {
            this._builder.clearReason();
        }

        public final AlerterId getAlertId() {
            AlerterId alertId = this._builder.getAlertId();
            x.e(alertId, "getAlertId(...)");
            return alertId;
        }

        public final AlerterId getAlertIdOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return RejectedAlertKtKt.getAlertIdOrNull(dsl._builder);
        }

        public final RejectedAlert.Reason getReason() {
            RejectedAlert.Reason reason = this._builder.getReason();
            x.e(reason, "getReason(...)");
            return reason;
        }

        public final int getReasonValue() {
            return this._builder.getReasonValue();
        }

        public final boolean hasAlertId() {
            return this._builder.hasAlertId();
        }

        public final void setAlertId(AlerterId alerterId) {
            x.f(alerterId, "value");
            this._builder.setAlertId(alerterId);
        }

        public final void setReason(RejectedAlert.Reason reason) {
            x.f(reason, "value");
            this._builder.setReason(reason);
        }

        public final void setReasonValue(int i2) {
            this._builder.setReasonValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RejectedAlert.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RejectedAlert.Builder builder, o oVar) {
            this(builder);
        }
    }
}
