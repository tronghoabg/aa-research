package com.waze.jni.protos.navigate;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.EventOnRoute;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EventOnRouteKt {
    public static final EventOnRouteKt INSTANCE = new EventOnRouteKt();

    private EventOnRouteKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EventOnRoute.Builder _builder;

        private Dsl(EventOnRoute.Builder builder) {
            this._builder = builder;
        }

        public static /* synthetic */ void getPosEnd$annotations() {
        }

        public static /* synthetic */ void getPosEndOrNull$annotations(Dsl dsl) {
        }

        public static /* synthetic */ void getPosStart$annotations() {
        }

        public static /* synthetic */ void getPosStartOrNull$annotations(Dsl dsl) {
        }

        public final /* synthetic */ EventOnRoute _build() {
            EventOnRoute eventOnRouteBuild = this._builder.build();
            x.e(eventOnRouteBuild, "build(...)");
            return eventOnRouteBuild;
        }

        public final void clearAlertId() {
            this._builder.clearAlertId();
        }

        public final void clearAlertSubType() {
            this._builder.clearAlertSubType();
        }

        public final void clearAlertType() {
            this._builder.clearAlertType();
        }

        public final void clearDuration() {
            this._builder.clearDuration();
        }

        public final void clearGeometry() {
            this._builder.clearGeometry();
        }

        public final void clearIsMajorEvent() {
            this._builder.clearIsMajorEvent();
        }

        public final void clearIsPartialLaneClosure() {
            this._builder.clearIsPartialLaneClosure();
        }

        public final void clearJamId() {
            this._builder.clearJamId();
        }

        public final void clearLocation() {
            this._builder.clearLocation();
        }

        public final void clearPosEnd() {
            this._builder.clearPosEnd();
        }

        public final void clearPosStart() {
            this._builder.clearPosStart();
        }

        public final void clearRatioOnRoadEnd() {
            this._builder.clearRatioOnRoadEnd();
        }

        public final void clearRatioOnRoadStart() {
            this._builder.clearRatioOnRoadStart();
        }

        public final void clearRoadInfoSeverity() {
            this._builder.clearRoadInfoSeverity();
        }

        public final long getAlertId() {
            return this._builder.getAlertId();
        }

        public final EventOnRoute.AlertSubType getAlertSubType() {
            EventOnRoute.AlertSubType alertSubType = this._builder.getAlertSubType();
            x.e(alertSubType, "getAlertSubType(...)");
            return alertSubType;
        }

        public final int getAlertSubTypeValue() {
            return this._builder.getAlertSubTypeValue();
        }

        public final EventOnRoute.AlertType getAlertType() {
            EventOnRoute.AlertType alertType = this._builder.getAlertType();
            x.e(alertType, "getAlertType(...)");
            return alertType;
        }

        public final int getAlertTypeValue() {
            return this._builder.getAlertTypeValue();
        }

        public final int getDuration() {
            return this._builder.getDuration();
        }

        public final PolylineGeometry getGeometry() {
            PolylineGeometry geometry = this._builder.getGeometry();
            x.e(geometry, "getGeometry(...)");
            return geometry;
        }

        public final PolylineGeometry getGeometryOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return EventOnRouteKtKt.getGeometryOrNull(dsl._builder);
        }

        public final boolean getIsMajorEvent() {
            return this._builder.getIsMajorEvent();
        }

        public final boolean getIsPartialLaneClosure() {
            return this._builder.getIsPartialLaneClosure();
        }

        public final long getJamId() {
            return this._builder.getJamId();
        }

        public final Position.IntPosition getLocation() {
            Position.IntPosition location = this._builder.getLocation();
            x.e(location, "getLocation(...)");
            return location;
        }

        public final Position.IntPosition getLocationOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return EventOnRouteKtKt.getLocationOrNull(dsl._builder);
        }

        public final Position.IntPosition getPosEnd() {
            Position.IntPosition posEnd = this._builder.getPosEnd();
            x.e(posEnd, "getPosEnd(...)");
            return posEnd;
        }

        public final Position.IntPosition getPosEndOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return EventOnRouteKtKt.getPosEndOrNull(dsl._builder);
        }

        public final Position.IntPosition getPosStart() {
            Position.IntPosition posStart = this._builder.getPosStart();
            x.e(posStart, "getPosStart(...)");
            return posStart;
        }

        public final Position.IntPosition getPosStartOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return EventOnRouteKtKt.getPosStartOrNull(dsl._builder);
        }

        public final double getRatioOnRoadEnd() {
            return this._builder.getRatioOnRoadEnd();
        }

        public final double getRatioOnRoadStart() {
            return this._builder.getRatioOnRoadStart();
        }

        public final int getRoadInfoSeverity() {
            return this._builder.getRoadInfoSeverity();
        }

        public final boolean hasAlertId() {
            return this._builder.hasAlertId();
        }

        public final boolean hasDuration() {
            return this._builder.hasDuration();
        }

        public final boolean hasGeometry() {
            return this._builder.hasGeometry();
        }

        public final boolean hasIsMajorEvent() {
            return this._builder.hasIsMajorEvent();
        }

        public final boolean hasIsPartialLaneClosure() {
            return this._builder.hasIsPartialLaneClosure();
        }

        public final boolean hasJamId() {
            return this._builder.hasJamId();
        }

        public final boolean hasLocation() {
            return this._builder.hasLocation();
        }

        public final boolean hasPosEnd() {
            return this._builder.hasPosEnd();
        }

        public final boolean hasPosStart() {
            return this._builder.hasPosStart();
        }

        public final boolean hasRatioOnRoadEnd() {
            return this._builder.hasRatioOnRoadEnd();
        }

        public final boolean hasRatioOnRoadStart() {
            return this._builder.hasRatioOnRoadStart();
        }

        public final boolean hasRoadInfoSeverity() {
            return this._builder.hasRoadInfoSeverity();
        }

        public final void setAlertId(long j2) {
            this._builder.setAlertId(j2);
        }

        public final void setAlertSubType(EventOnRoute.AlertSubType alertSubType) {
            x.f(alertSubType, "value");
            this._builder.setAlertSubType(alertSubType);
        }

        public final void setAlertSubTypeValue(int i2) {
            this._builder.setAlertSubTypeValue(i2);
        }

        public final void setAlertType(EventOnRoute.AlertType alertType) {
            x.f(alertType, "value");
            this._builder.setAlertType(alertType);
        }

        public final void setAlertTypeValue(int i2) {
            this._builder.setAlertTypeValue(i2);
        }

        public final void setDuration(int i2) {
            this._builder.setDuration(i2);
        }

        public final void setGeometry(PolylineGeometry polylineGeometry) {
            x.f(polylineGeometry, "value");
            this._builder.setGeometry(polylineGeometry);
        }

        public final void setIsMajorEvent(boolean z) {
            this._builder.setIsMajorEvent(z);
        }

        public final void setIsPartialLaneClosure(boolean z) {
            this._builder.setIsPartialLaneClosure(z);
        }

        public final void setJamId(long j2) {
            this._builder.setJamId(j2);
        }

        public final void setLocation(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setLocation(intPosition);
        }

        public final void setPosEnd(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosEnd(intPosition);
        }

        public final void setPosStart(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosStart(intPosition);
        }

        public final void setRatioOnRoadEnd(double d2) {
            this._builder.setRatioOnRoadEnd(d2);
        }

        public final void setRatioOnRoadStart(double d2) {
            this._builder.setRatioOnRoadStart(d2);
        }

        public final void setRoadInfoSeverity(int i2) {
            this._builder.setRoadInfoSeverity(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(EventOnRoute.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(EventOnRoute.Builder builder, o oVar) {
            this(builder);
        }
    }
}
