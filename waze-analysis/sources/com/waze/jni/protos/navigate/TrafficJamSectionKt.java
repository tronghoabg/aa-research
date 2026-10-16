package com.waze.jni.protos.navigate;

import com.waze.jni.protos.alerters.AlerterType;
import com.waze.jni.protos.navigate.TrafficJamSection;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TrafficJamSectionKt {
    public static final TrafficJamSectionKt INSTANCE = new TrafficJamSectionKt();

    private TrafficJamSectionKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TrafficJamSection.Builder _builder;

        private Dsl(TrafficJamSection.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ TrafficJamSection _build() {
            TrafficJamSection trafficJamSectionBuild = this._builder.build();
            x.e(trafficJamSectionBuild, "build(...)");
            return trafficJamSectionBuild;
        }

        public final void clearAlertSubType() {
            this._builder.clearAlertSubType();
        }

        public final void clearAlertType() {
            this._builder.clearAlertType();
        }

        public final void clearLengthMeters() {
            this._builder.clearLengthMeters();
        }

        public final void clearLevel() {
            this._builder.clearLevel();
        }

        public final int getAlertSubType() {
            return this._builder.getAlertSubType();
        }

        public final AlerterType getAlertType() {
            AlerterType alertType = this._builder.getAlertType();
            x.e(alertType, "getAlertType(...)");
            return alertType;
        }

        public final int getAlertTypeValue() {
            return this._builder.getAlertTypeValue();
        }

        public final int getLengthMeters() {
            return this._builder.getLengthMeters();
        }

        public final TrafficJamSection.Severity getLevel() {
            TrafficJamSection.Severity level = this._builder.getLevel();
            x.e(level, "getLevel(...)");
            return level;
        }

        public final int getLevelValue() {
            return this._builder.getLevelValue();
        }

        public final boolean hasAlertSubType() {
            return this._builder.hasAlertSubType();
        }

        public final boolean hasAlertType() {
            return this._builder.hasAlertType();
        }

        public final boolean hasLengthMeters() {
            return this._builder.hasLengthMeters();
        }

        public final boolean hasLevel() {
            return this._builder.hasLevel();
        }

        public final void setAlertSubType(int i2) {
            this._builder.setAlertSubType(i2);
        }

        public final void setAlertType(AlerterType alerterType) {
            x.f(alerterType, "value");
            this._builder.setAlertType(alerterType);
        }

        public final void setAlertTypeValue(int i2) {
            this._builder.setAlertTypeValue(i2);
        }

        public final void setLengthMeters(int i2) {
            this._builder.setLengthMeters(i2);
        }

        public final void setLevel(TrafficJamSection.Severity severity) {
            x.f(severity, "value");
            this._builder.setLevel(severity);
        }

        public final void setLevelValue(int i2) {
            this._builder.setLevelValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TrafficJamSection.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(TrafficJamSection.Builder builder, o oVar) {
            this(builder);
        }
    }
}
