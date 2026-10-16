package com.waze.jni.protos.map;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapLine;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapLineKt {
    public static final MapLineKt INSTANCE = new MapLineKt();

    private MapLineKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapLine.Builder _builder;

        /* compiled from: WazeSource */
        public final class PositionsProxy extends c {
            private PositionsProxy() {
            }
        }

        private Dsl(MapLine.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapLine _build() {
            MapLine mapLineBuild = this._builder.build();
            x.e(mapLineBuild, "build(...)");
            return mapLineBuild;
        }

        public final /* synthetic */ void addAllPositions(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllPositions(iterable);
        }

        public final /* synthetic */ void addPositions(a aVar, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            this._builder.addPositions(intPosition);
        }

        public final void clearCenterPosition() {
            this._builder.clearCenterPosition();
        }

        public final void clearLineId() {
            this._builder.clearLineId();
        }

        public final /* synthetic */ void clearPositions(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearPositions();
        }

        public final void clearReversed() {
            this._builder.clearReversed();
        }

        public final void clearTileId() {
            this._builder.clearTileId();
        }

        public final Position.IntPosition getCenterPosition() {
            Position.IntPosition centerPosition = this._builder.getCenterPosition();
            x.e(centerPosition, "getCenterPosition(...)");
            return centerPosition;
        }

        public final Position.IntPosition getCenterPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MapLineKtKt.getCenterPositionOrNull(dsl._builder);
        }

        public final int getLineId() {
            return this._builder.getLineId();
        }

        public final /* synthetic */ a getPositions() {
            List<Position.IntPosition> positionsList = this._builder.getPositionsList();
            x.e(positionsList, "getPositionsList(...)");
            return new a(positionsList);
        }

        public final boolean getReversed() {
            return this._builder.getReversed();
        }

        public final int getTileId() {
            return this._builder.getTileId();
        }

        public final boolean hasCenterPosition() {
            return this._builder.hasCenterPosition();
        }

        public final /* synthetic */ void plusAssignAllPositions(a<Position.IntPosition, PositionsProxy> aVar, Iterable<Position.IntPosition> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllPositions(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignPositions(a<Position.IntPosition, PositionsProxy> aVar, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            addPositions(aVar, intPosition);
        }

        public final void setCenterPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setCenterPosition(intPosition);
        }

        public final void setLineId(int i2) {
            this._builder.setLineId(i2);
        }

        public final /* synthetic */ void setPositions(a aVar, int i2, Position.IntPosition intPosition) {
            x.f(aVar, "<this>");
            x.f(intPosition, "value");
            this._builder.setPositions(i2, intPosition);
        }

        public final void setReversed(boolean z) {
            this._builder.setReversed(z);
        }

        public final void setTileId(int i2) {
            this._builder.setTileId(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapLine.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapLine.Builder builder, o oVar) {
            this(builder);
        }
    }
}
