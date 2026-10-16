package com.waze.jni.protos;

import com.waze.jni.protos.RtAlertsThumbsUpDataProto;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RtAlertsThumbsUpDataProtoKt {
    public static final RtAlertsThumbsUpDataProtoKt INSTANCE = new RtAlertsThumbsUpDataProtoKt();

    private RtAlertsThumbsUpDataProtoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RtAlertsThumbsUpDataProto.Builder _builder;

        private Dsl(RtAlertsThumbsUpDataProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RtAlertsThumbsUpDataProto _build() {
            RtAlertsThumbsUpDataProto rtAlertsThumbsUpDataProtoBuild = this._builder.build();
            x.e(rtAlertsThumbsUpDataProtoBuild, "build(...)");
            return rtAlertsThumbsUpDataProtoBuild;
        }

        public final void clearAlertId() {
            this._builder.clearAlertId();
        }

        public final void clearFrom() {
            this._builder.clearFrom();
        }

        public final void clearIconName() {
            this._builder.clearIconName();
        }

        public final void clearMood() {
            this._builder.clearMood();
        }

        public final void clearOriginalAlertDescription() {
            this._builder.clearOriginalAlertDescription();
        }

        public final void clearReportedElapsedTime() {
            this._builder.clearReportedElapsedTime();
        }

        public final int getAlertId() {
            return this._builder.getAlertId();
        }

        public final String getFrom() {
            String from = this._builder.getFrom();
            x.e(from, "getFrom(...)");
            return from;
        }

        public final String getIconName() {
            String iconName = this._builder.getIconName();
            x.e(iconName, "getIconName(...)");
            return iconName;
        }

        public final String getMood() {
            String mood = this._builder.getMood();
            x.e(mood, "getMood(...)");
            return mood;
        }

        public final String getOriginalAlertDescription() {
            String originalAlertDescription = this._builder.getOriginalAlertDescription();
            x.e(originalAlertDescription, "getOriginalAlertDescription(...)");
            return originalAlertDescription;
        }

        public final int getReportedElapsedTime() {
            return this._builder.getReportedElapsedTime();
        }

        public final boolean hasAlertId() {
            return this._builder.hasAlertId();
        }

        public final boolean hasFrom() {
            return this._builder.hasFrom();
        }

        public final boolean hasIconName() {
            return this._builder.hasIconName();
        }

        public final boolean hasMood() {
            return this._builder.hasMood();
        }

        public final boolean hasOriginalAlertDescription() {
            return this._builder.hasOriginalAlertDescription();
        }

        public final boolean hasReportedElapsedTime() {
            return this._builder.hasReportedElapsedTime();
        }

        public final void setAlertId(int i2) {
            this._builder.setAlertId(i2);
        }

        public final void setFrom(String str) {
            x.f(str, "value");
            this._builder.setFrom(str);
        }

        public final void setIconName(String str) {
            x.f(str, "value");
            this._builder.setIconName(str);
        }

        public final void setMood(String str) {
            x.f(str, "value");
            this._builder.setMood(str);
        }

        public final void setOriginalAlertDescription(String str) {
            x.f(str, "value");
            this._builder.setOriginalAlertDescription(str);
        }

        public final void setReportedElapsedTime(int i2) {
            this._builder.setReportedElapsedTime(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RtAlertsThumbsUpDataProto.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RtAlertsThumbsUpDataProto.Builder builder, o oVar) {
            this(builder);
        }
    }
}
