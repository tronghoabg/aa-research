package com.waze.jni.protos.favorites;

import com.waze.jni.protos.favorites.Favorite;
import com.waze.jni.protos.places.Place;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FavoriteKt {
    public static final FavoriteKt INSTANCE = new FavoriteKt();

    private FavoriteKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Favorite.Builder _builder;

        private Dsl(Favorite.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Favorite _build() {
            Favorite favoriteBuild = this._builder.build();
            x.e(favoriteBuild, "build(...)");
            return favoriteBuild;
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearPlace() {
            this._builder.clearPlace();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final int getId() {
            return this._builder.getId();
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final Place getPlace() {
            Place place = this._builder.getPlace();
            x.e(place, "getPlace(...)");
            return place;
        }

        public final Place getPlaceOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return FavoriteKtKt.getPlaceOrNull(dsl._builder);
        }

        public final Favorite.Type getType() {
            Favorite.Type type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final boolean hasPlace() {
            return this._builder.hasPlace();
        }

        public final void setId(int i2) {
            this._builder.setId(i2);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        public final void setPlace(Place place) {
            x.f(place, "value");
            this._builder.setPlace(place);
        }

        public final void setType(Favorite.Type type) {
            x.f(type, "value");
            this._builder.setType(type);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Favorite.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Favorite.Builder builder, o oVar) {
            this(builder);
        }
    }
}
