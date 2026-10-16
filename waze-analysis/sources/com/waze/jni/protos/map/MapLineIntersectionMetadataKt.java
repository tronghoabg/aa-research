package com.waze.jni.protos.map;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapLineIntersectionMetadata;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapLineIntersectionMetadataKt {
    public static final MapLineIntersectionMetadataKt INSTANCE = new MapLineIntersectionMetadataKt();

    private MapLineIntersectionMetadataKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapLineIntersectionMetadata.Builder _builder;

        private Dsl(MapLineIntersectionMetadata.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapLineIntersectionMetadata _build() {
            MapLineIntersectionMetadata mapLineIntersectionMetadataBuild = this._builder.build();
            x.e(mapLineIntersectionMetadataBuild, "build(...)");
            return mapLineIntersectionMetadataBuild;
        }

        public final void clearAzimuth() {
            this._builder.clearAzimuth();
        }

        public final void clearCoordinate() {
            this._builder.clearCoordinate();
        }

        public final void clearDistanceMeters() {
            this._builder.clearDistanceMeters();
        }

        public final void clearMapLine() {
            this._builder.clearMapLine();
        }

        public final float getAzimuth() {
            return this._builder.getAzimuth();
        }

        public final Position.IntPosition getCoordinate() {
            Position.IntPosition coordinate = this._builder.getCoordinate();
            x.e(coordinate, "getCoordinate(...)");
            return coordinate;
        }

        public final Position.IntPosition getCoordinateOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MapLineIntersectionMetadataKtKt.getCoordinateOrNull(dsl._builder);
        }

        public final int getDistanceMeters() {
            return this._builder.getDistanceMeters();
        }

        public final MapLine getMapLine() {
            MapLine mapLine = this._builder.getMapLine();
            x.e(mapLine, "getMapLine(...)");
            return mapLine;
        }

        public final MapLine getMapLineOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MapLineIntersectionMetadataKtKt.getMapLineOrNull(dsl._builder);
        }

        public final boolean hasCoordinate() {
            return this._builder.hasCoordinate();
        }

        public final boolean hasMapLine() {
            return this._builder.hasMapLine();
        }

        public final void setAzimuth(float f2) {
            this._builder.setAzimuth(f2);
        }

        public final void setCoordinate(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setCoordinate(intPosition);
        }

        public final void setDistanceMeters(int i2) {
            this._builder.setDistanceMeters(i2);
        }

        public final void setMapLine(MapLine mapLine) {
            x.f(mapLine, "value");
            this._builder.setMapLine(mapLine);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapLineIntersectionMetadata.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapLineIntersectionMetadata.Builder builder, o oVar) {
            this(builder);
        }
    }
}
