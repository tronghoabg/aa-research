package com.waze.jni.protos;

import com.waze.jni.protos.VenueOrPlace;
import com.waze.jni.protos.favorites.Favorite;
import com.waze.jni.protos.places.Place;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueOrPlaceKt {
    public static final VenueOrPlaceKt INSTANCE = new VenueOrPlaceKt();

    private VenueOrPlaceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final VenueOrPlace.Builder _builder;

        private Dsl(VenueOrPlace.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ VenueOrPlace _build() {
            VenueOrPlace venueOrPlaceBuild = this._builder.build();
            x.e(venueOrPlaceBuild, "build(...)");
            return venueOrPlaceBuild;
        }

        public final void clearEndpoint() {
            this._builder.clearEndpoint();
        }

        public final void clearFavorite() {
            this._builder.clearFavorite();
        }

        public final void clearPlace() {
            this._builder.clearPlace();
        }

        public final void clearVenue() {
            this._builder.clearVenue();
        }

        public final VenueOrPlace.EndpointCase getEndpointCase() {
            VenueOrPlace.EndpointCase endpointCase = this._builder.getEndpointCase();
            x.e(endpointCase, "getEndpointCase(...)");
            return endpointCase;
        }

        public final Favorite getFavorite() {
            Favorite favorite = this._builder.getFavorite();
            x.e(favorite, "getFavorite(...)");
            return favorite;
        }

        public final Place getPlace() {
            Place place = this._builder.getPlace();
            x.e(place, "getPlace(...)");
            return place;
        }

        public final VenueData getVenue() {
            VenueData venue = this._builder.getVenue();
            x.e(venue, "getVenue(...)");
            return venue;
        }

        public final boolean hasFavorite() {
            return this._builder.hasFavorite();
        }

        public final boolean hasPlace() {
            return this._builder.hasPlace();
        }

        public final boolean hasVenue() {
            return this._builder.hasVenue();
        }

        public final void setFavorite(Favorite favorite) {
            x.f(favorite, "value");
            this._builder.setFavorite(favorite);
        }

        public final void setPlace(Place place) {
            x.f(place, "value");
            this._builder.setPlace(place);
        }

        public final void setVenue(VenueData venueData) {
            x.f(venueData, "value");
            this._builder.setVenue(venueData);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(VenueOrPlace.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(VenueOrPlace.Builder builder, o oVar) {
            this(builder);
        }
    }
}
