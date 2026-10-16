package com.waze.jni.protos.favorites;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.favorites.Favorites;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FavoritesKt {
    public static final FavoritesKt INSTANCE = new FavoritesKt();

    private FavoritesKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Favorites.Builder _builder;

        /* compiled from: WazeSource */
        public final class FavoritesProxy extends c {
            private FavoritesProxy() {
            }
        }

        private Dsl(Favorites.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Favorites _build() {
            Favorites favoritesBuild = this._builder.build();
            x.e(favoritesBuild, "build(...)");
            return favoritesBuild;
        }

        public final /* synthetic */ void addAllFavorites(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllFavorites(iterable);
        }

        public final /* synthetic */ void addFavorites(a aVar, Favorite favorite) {
            x.f(aVar, "<this>");
            x.f(favorite, "value");
            this._builder.addFavorites(favorite);
        }

        public final /* synthetic */ void clearFavorites(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearFavorites();
        }

        public final /* synthetic */ a getFavorites() {
            List<Favorite> favoritesList = this._builder.getFavoritesList();
            x.e(favoritesList, "getFavoritesList(...)");
            return new a(favoritesList);
        }

        public final /* synthetic */ void plusAssignAllFavorites(a<Favorite, FavoritesProxy> aVar, Iterable<Favorite> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllFavorites(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignFavorites(a<Favorite, FavoritesProxy> aVar, Favorite favorite) {
            x.f(aVar, "<this>");
            x.f(favorite, "value");
            addFavorites(aVar, favorite);
        }

        public final /* synthetic */ void setFavorites(a aVar, int i2, Favorite favorite) {
            x.f(aVar, "<this>");
            x.f(favorite, "value");
            this._builder.setFavorites(i2, favorite);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Favorites.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Favorites.Builder builder, o oVar) {
            this(builder);
        }
    }
}
