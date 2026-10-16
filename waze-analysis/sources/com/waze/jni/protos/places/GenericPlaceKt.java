package com.waze.jni.protos.places;

import com.waze.jni.protos.places.GenericPlace;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenericPlaceKt {
    public static final GenericPlaceKt INSTANCE = new GenericPlaceKt();

    private GenericPlaceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GenericPlace.Builder _builder;

        private Dsl(GenericPlace.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ GenericPlace _build() {
            GenericPlace genericPlaceBuild = this._builder.build();
            x.e(genericPlaceBuild, "build(...)");
            return genericPlaceBuild;
        }

        public final void clearEventPlace() {
            this._builder.clearEventPlace();
        }

        public final void clearFavoritePlace() {
            this._builder.clearFavoritePlace();
        }

        public final void clearPlace() {
            this._builder.clearPlace();
        }

        public final void clearRecentPlace() {
            this._builder.clearRecentPlace();
        }

        public final void clearWazeAddress() {
            this._builder.clearWazeAddress();
        }

        public final EventPlace getEventPlace() {
            EventPlace eventPlace = this._builder.getEventPlace();
            x.e(eventPlace, "getEventPlace(...)");
            return eventPlace;
        }

        public final FavoritePlace getFavoritePlace() {
            FavoritePlace favoritePlace = this._builder.getFavoritePlace();
            x.e(favoritePlace, "getFavoritePlace(...)");
            return favoritePlace;
        }

        public final GenericPlace.PlaceCase getPlaceCase() {
            GenericPlace.PlaceCase placeCase = this._builder.getPlaceCase();
            x.e(placeCase, "getPlaceCase(...)");
            return placeCase;
        }

        public final RecentPlace getRecentPlace() {
            RecentPlace recentPlace = this._builder.getRecentPlace();
            x.e(recentPlace, "getRecentPlace(...)");
            return recentPlace;
        }

        public final Place getWazeAddress() {
            Place wazeAddress = this._builder.getWazeAddress();
            x.e(wazeAddress, "getWazeAddress(...)");
            return wazeAddress;
        }

        public final Place getWazeAddressOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return GenericPlaceKtKt.getWazeAddressOrNull(dsl._builder);
        }

        public final boolean hasEventPlace() {
            return this._builder.hasEventPlace();
        }

        public final boolean hasFavoritePlace() {
            return this._builder.hasFavoritePlace();
        }

        public final boolean hasRecentPlace() {
            return this._builder.hasRecentPlace();
        }

        public final boolean hasWazeAddress() {
            return this._builder.hasWazeAddress();
        }

        public final void setEventPlace(EventPlace eventPlace) {
            x.f(eventPlace, "value");
            this._builder.setEventPlace(eventPlace);
        }

        public final void setFavoritePlace(FavoritePlace favoritePlace) {
            x.f(favoritePlace, "value");
            this._builder.setFavoritePlace(favoritePlace);
        }

        public final void setRecentPlace(RecentPlace recentPlace) {
            x.f(recentPlace, "value");
            this._builder.setRecentPlace(recentPlace);
        }

        public final void setWazeAddress(Place place) {
            x.f(place, "value");
            this._builder.setWazeAddress(place);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(GenericPlace.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(GenericPlace.Builder builder, o oVar) {
            this(builder);
        }
    }
}
