package com.waze.jni.protos.navigate;

import com.google.v.ec;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.RouteWaypoint;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteWaypointKt {
    public static final RouteWaypointKt INSTANCE = new RouteWaypointKt();

    private RouteWaypointKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RouteWaypoint.Builder _builder;

        private Dsl(RouteWaypoint.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RouteWaypoint _build() {
            RouteWaypoint routeWaypointBuild = this._builder.build();
            x.e(routeWaypointBuild, "build(...)");
            return routeWaypointBuild;
        }

        public final void clearCoordinate() {
            this._builder.clearCoordinate();
        }

        public final void clearDistanceToWaypointMeters() {
            this._builder.clearDistanceToWaypointMeters();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearSecondsToWaypoint() {
            this._builder.clearSecondsToWaypoint();
        }

        public final Position.IntPosition getCoordinate() {
            Position.IntPosition coordinate = this._builder.getCoordinate();
            x.e(coordinate, "getCoordinate(...)");
            return coordinate;
        }

        public final Position.IntPosition getCoordinateOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return RouteWaypointKtKt.getCoordinateOrNull(dsl._builder);
        }

        public final ec getDistanceToWaypointMeters() {
            ec distanceToWaypointMeters = this._builder.getDistanceToWaypointMeters();
            x.e(distanceToWaypointMeters, "getDistanceToWaypointMeters(...)");
            return distanceToWaypointMeters;
        }

        public final ec getDistanceToWaypointMetersOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return RouteWaypointKtKt.getDistanceToWaypointMetersOrNull(dsl._builder);
        }

        public final int getId() {
            return this._builder.getId();
        }

        public final ec getSecondsToWaypoint() {
            ec secondsToWaypoint = this._builder.getSecondsToWaypoint();
            x.e(secondsToWaypoint, "getSecondsToWaypoint(...)");
            return secondsToWaypoint;
        }

        public final ec getSecondsToWaypointOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return RouteWaypointKtKt.getSecondsToWaypointOrNull(dsl._builder);
        }

        public final boolean hasCoordinate() {
            return this._builder.hasCoordinate();
        }

        public final boolean hasDistanceToWaypointMeters() {
            return this._builder.hasDistanceToWaypointMeters();
        }

        public final boolean hasSecondsToWaypoint() {
            return this._builder.hasSecondsToWaypoint();
        }

        public final void setCoordinate(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setCoordinate(intPosition);
        }

        public final void setDistanceToWaypointMeters(ec ecVar) {
            x.f(ecVar, "value");
            this._builder.setDistanceToWaypointMeters(ecVar);
        }

        public final void setId(int i2) {
            this._builder.setId(i2);
        }

        public final void setSecondsToWaypoint(ec ecVar) {
            x.f(ecVar, "value");
            this._builder.setSecondsToWaypoint(ecVar);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RouteWaypoint.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RouteWaypoint.Builder builder, o oVar) {
            this(builder);
        }
    }
}
