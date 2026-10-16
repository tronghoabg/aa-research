package com.waze.jni.protos.places;

import com.google.v.ec;
import com.google.v.o;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.places.Place;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PlaceKt {
    public static final PlaceKt INSTANCE = new PlaceKt();

    private PlaceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Place.Builder _builder;

        private Dsl(Place.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Place _build() {
            Place placeBuild = this._builder.build();
            x.e(placeBuild, "build(...)");
            return placeBuild;
        }

        public final void clearAddress() {
            this._builder.clearAddress();
        }

        public final void clearCreatedTimeSec() {
            this._builder.clearCreatedTimeSec();
        }

        public final void clearDbId() {
            this._builder.clearDbId();
        }

        public final void clearInternalId() {
            this._builder.clearInternalId();
        }

        public final void clearIsResidential() {
            this._builder.clearIsResidential();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final void clearRoutingContext() {
            this._builder.clearRoutingContext();
        }

        public final void clearUpdatedTimeSec() {
            this._builder.clearUpdatedTimeSec();
        }

        public final void clearVenueContext() {
            this._builder.clearVenueContext();
        }

        public final void clearVenueId() {
            this._builder.clearVenueId();
        }

        public final Address getAddress() {
            Address address = this._builder.getAddress();
            x.e(address, "getAddress(...)");
            return address;
        }

        public final Address getAddressOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return PlaceKtKt.getAddressOrNull(dsl._builder);
        }

        public final long getCreatedTimeSec() {
            return this._builder.getCreatedTimeSec();
        }

        public final ec getDbId() {
            ec dbId = this._builder.getDbId();
            x.e(dbId, "getDbId(...)");
            return dbId;
        }

        public final ec getDbIdOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return PlaceKtKt.getDbIdOrNull(dsl._builder);
        }

        public final String getInternalId() {
            String internalId = this._builder.getInternalId();
            x.e(internalId, "getInternalId(...)");
            return internalId;
        }

        public final o getIsResidential() {
            o isResidential = this._builder.getIsResidential();
            x.e(isResidential, "getIsResidential(...)");
            return isResidential;
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return PlaceKtKt.getPositionOrNull(dsl._builder);
        }

        public final String getRoutingContext() {
            String routingContext = this._builder.getRoutingContext();
            x.e(routingContext, "getRoutingContext(...)");
            return routingContext;
        }

        public final long getUpdatedTimeSec() {
            return this._builder.getUpdatedTimeSec();
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

        public final boolean hasAddress() {
            return this._builder.hasAddress();
        }

        public final boolean hasDbId() {
            return this._builder.hasDbId();
        }

        public final boolean hasIsResidential() {
            return this._builder.hasIsResidential();
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final o isResidentialOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return PlaceKtKt.isResidentialOrNull(dsl._builder);
        }

        public final void setAddress(Address address) {
            x.f(address, "value");
            this._builder.setAddress(address);
        }

        public final void setCreatedTimeSec(long j2) {
            this._builder.setCreatedTimeSec(j2);
        }

        public final void setDbId(ec ecVar) {
            x.f(ecVar, "value");
            this._builder.setDbId(ecVar);
        }

        public final void setInternalId(String str) {
            x.f(str, "value");
            this._builder.setInternalId(str);
        }

        public final void setIsResidential(o oVar) {
            x.f(oVar, "value");
            this._builder.setIsResidential(oVar);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        public final void setRoutingContext(String str) {
            x.f(str, "value");
            this._builder.setRoutingContext(str);
        }

        public final void setUpdatedTimeSec(long j2) {
            this._builder.setUpdatedTimeSec(j2);
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

            public final /* synthetic */ Dsl _create(Place.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(h.g.b.o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Place.Builder builder, h.g.b.o oVar) {
            this(builder);
        }
    }
}
