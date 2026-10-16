package com.waze.jni.protos;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.ClosureCandidateJni;
import com.waze.jni.protos.Position;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ClosureCandidateJniKt {
    public static final ClosureCandidateJniKt INSTANCE = new ClosureCandidateJniKt();

    private ClosureCandidateJniKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ClosureCandidateJni.Builder _builder;

        /* compiled from: WazeSource */
        public final class PolylineProxy extends c {
            private PolylineProxy() {
            }
        }

        private Dsl(ClosureCandidateJni.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ClosureCandidateJni _build() {
            ClosureCandidateJni closureCandidateJniBuild = this._builder.build();
            x.e(closureCandidateJniBuild, "build(...)");
            return closureCandidateJniBuild;
        }

        public final /* synthetic */ void addAllPolyline(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllPolyline(iterable);
        }

        public final /* synthetic */ void addPolyline(a aVar, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            this._builder.addPolyline(intPosition);
        }

        public final void clearFromCoordinate() {
            this._builder.clearFromCoordinate();
        }

        public final void clearFromNode() {
            this._builder.clearFromNode();
        }

        public final void clearIsOnRoute() {
            this._builder.clearIsOnRoute();
        }

        public final void clearLineId() {
            this._builder.clearLineId();
        }

        public final /* synthetic */ void clearPolyline(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearPolyline();
        }

        public final void clearStreetName() {
            this._builder.clearStreetName();
        }

        public final void clearTileId() {
            this._builder.clearTileId();
        }

        public final void clearToCoordinate() {
            this._builder.clearToCoordinate();
        }

        public final void clearToNode() {
            this._builder.clearToNode();
        }

        public final Position.IntPosition getFromCoordinate() {
            Position.IntPosition fromCoordinate = this._builder.getFromCoordinate();
            x.e(fromCoordinate, "getFromCoordinate(...)");
            return fromCoordinate;
        }

        public final Position.IntPosition getFromCoordinateOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ClosureCandidateJniKtKt.getFromCoordinateOrNull(dsl._builder);
        }

        public final int getFromNode() {
            return this._builder.getFromNode();
        }

        public final boolean getIsOnRoute() {
            return this._builder.getIsOnRoute();
        }

        public final int getLineId() {
            return this._builder.getLineId();
        }

        public final /* synthetic */ a getPolyline() {
            List<Position.IntPosition> polylineList = this._builder.getPolylineList();
            x.e(polylineList, "getPolylineList(...)");
            return new a(polylineList);
        }

        public final String getStreetName() {
            String streetName = this._builder.getStreetName();
            x.e(streetName, "getStreetName(...)");
            return streetName;
        }

        public final int getTileId() {
            return this._builder.getTileId();
        }

        public final Position.IntPosition getToCoordinate() {
            Position.IntPosition toCoordinate = this._builder.getToCoordinate();
            x.e(toCoordinate, "getToCoordinate(...)");
            return toCoordinate;
        }

        public final Position.IntPosition getToCoordinateOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ClosureCandidateJniKtKt.getToCoordinateOrNull(dsl._builder);
        }

        public final int getToNode() {
            return this._builder.getToNode();
        }

        public final boolean hasFromCoordinate() {
            return this._builder.hasFromCoordinate();
        }

        public final boolean hasFromNode() {
            return this._builder.hasFromNode();
        }

        public final boolean hasIsOnRoute() {
            return this._builder.hasIsOnRoute();
        }

        public final boolean hasLineId() {
            return this._builder.hasLineId();
        }

        public final boolean hasStreetName() {
            return this._builder.hasStreetName();
        }

        public final boolean hasTileId() {
            return this._builder.hasTileId();
        }

        public final boolean hasToCoordinate() {
            return this._builder.hasToCoordinate();
        }

        public final boolean hasToNode() {
            return this._builder.hasToNode();
        }

        public final /* synthetic */ void plusAssignAllPolyline(a<Position.IntPosition, PolylineProxy> aVar, Iterable<Position.IntPosition> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllPolyline(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignPolyline(a<Position.IntPosition, PolylineProxy> aVar, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            addPolyline(aVar, intPosition);
        }

        public final void setFromCoordinate(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setFromCoordinate(intPosition);
        }

        public final void setFromNode(int i2) {
            this._builder.setFromNode(i2);
        }

        public final void setIsOnRoute(boolean z) {
            this._builder.setIsOnRoute(z);
        }

        public final void setLineId(int i2) {
            this._builder.setLineId(i2);
        }

        public final /* synthetic */ void setPolyline(a aVar, int i2, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            this._builder.setPolyline(i2, intPosition);
        }

        public final void setStreetName(String str) {
            x.f(str, "value");
            this._builder.setStreetName(str);
        }

        public final void setTileId(int i2) {
            this._builder.setTileId(i2);
        }

        public final void setToCoordinate(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setToCoordinate(intPosition);
        }

        public final void setToNode(int i2) {
            this._builder.setToNode(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ClosureCandidateJni.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ClosureCandidateJni.Builder builder, o oVar) {
            this(builder);
        }
    }
}
