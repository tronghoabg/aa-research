package com.waze.jni.protos;

import com.waze.jni.protos.MapAdObject;
import com.waze.jni.protos.Position;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapAdObjectKt {
    public static final MapAdObjectKt INSTANCE = new MapAdObjectKt();

    private MapAdObjectKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapAdObject.Builder _builder;

        private Dsl(MapAdObject.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapAdObject _build() {
            MapAdObject mapAdObjectBuild = this._builder.build();
            x.e(mapAdObjectBuild, "build(...)");
            return mapAdObjectBuild;
        }

        public final void clearPinType() {
            this._builder.clearPinType();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final void clearVenueContext() {
            this._builder.clearVenueContext();
        }

        public final void clearVenueId() {
            this._builder.clearVenueId();
        }

        public final MapAdObject.PinType getPinType() {
            MapAdObject.PinType pinType = this._builder.getPinType();
            x.e(pinType, "getPinType(...)");
            return pinType;
        }

        public final int getPinTypeValue() {
            return this._builder.getPinTypeValue();
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MapAdObjectKtKt.getPositionOrNull(dsl._builder);
        }

        public final String getVenueContext() {
            String venueContext = this._builder.getVenueContext();
            x.e(venueContext, "getVenueContext(...)");
            return venueContext;
        }

        public final String getVenueId() {
            String venueId = this._builder.getVenueId();
            x.e(venueId, "getVenueId(...)");
            return venueId;
        }

        public final boolean hasPinType() {
            return this._builder.hasPinType();
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final boolean hasVenueContext() {
            return this._builder.hasVenueContext();
        }

        public final boolean hasVenueId() {
            return this._builder.hasVenueId();
        }

        public final void setPinType(MapAdObject.PinType pinType) {
            x.f(pinType, "value");
            this._builder.setPinType(pinType);
        }

        public final void setPinTypeValue(int i2) {
            this._builder.setPinTypeValue(i2);
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        public final void setVenueContext(String str) {
            x.f(str, "value");
            this._builder.setVenueContext(str);
        }

        public final void setVenueId(String str) {
            x.f(str, "value");
            this._builder.setVenueId(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapAdObject.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapAdObject.Builder builder, o oVar) {
            this(builder);
        }
    }
}
