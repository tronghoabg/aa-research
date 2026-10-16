package com.waze.jni.protos.resume_drive;

import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.places.GenericPlace;
import com.waze.jni.protos.resume_drive.GenericPlaceOrVenueData;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenericPlaceOrVenueDataKt {
    public static final GenericPlaceOrVenueDataKt INSTANCE = new GenericPlaceOrVenueDataKt();

    private GenericPlaceOrVenueDataKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GenericPlaceOrVenueData.Builder _builder;

        private Dsl(GenericPlaceOrVenueData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ GenericPlaceOrVenueData _build() {
            GenericPlaceOrVenueData genericPlaceOrVenueDataBuild = this._builder.build();
            x.e(genericPlaceOrVenueDataBuild, "build(...)");
            return genericPlaceOrVenueDataBuild;
        }

        public final void clearDestination() {
            this._builder.clearDestination();
        }

        public final void clearPlace() {
            this._builder.clearPlace();
        }

        public final void clearVenue() {
            this._builder.clearVenue();
        }

        public final GenericPlaceOrVenueData.DestinationCase getDestinationCase() {
            GenericPlaceOrVenueData.DestinationCase destinationCase = this._builder.getDestinationCase();
            x.e(destinationCase, "getDestinationCase(...)");
            return destinationCase;
        }

        public final GenericPlace getPlace() {
            GenericPlace place = this._builder.getPlace();
            x.e(place, "getPlace(...)");
            return place;
        }

        public final VenueData getVenue() {
            VenueData venue = this._builder.getVenue();
            x.e(venue, "getVenue(...)");
            return venue;
        }

        public final boolean hasPlace() {
            return this._builder.hasPlace();
        }

        public final boolean hasVenue() {
            return this._builder.hasVenue();
        }

        public final void setPlace(GenericPlace genericPlace) {
            x.f(genericPlace, "value");
            this._builder.setPlace(genericPlace);
        }

        public final void setVenue(VenueData venueData) {
            x.f(venueData, "value");
            this._builder.setVenue(venueData);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(GenericPlaceOrVenueData.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(GenericPlaceOrVenueData.Builder builder, o oVar) {
            this(builder);
        }
    }
}
