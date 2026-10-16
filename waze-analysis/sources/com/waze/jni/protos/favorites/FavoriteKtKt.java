package com.waze.jni.protos.favorites;

import com.waze.jni.protos.favorites.Favorite;
import com.waze.jni.protos.favorites.FavoriteKt;
import com.waze.jni.protos.places.Place;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FavoriteKtKt {
    /* renamed from: -initializefavorite, reason: not valid java name */
    public static final Favorite m26169initializefavorite(l<? super FavoriteKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        FavoriteKt.Dsl.Companion companion = FavoriteKt.Dsl.Companion;
        Favorite.Builder builderNewBuilder = Favorite.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        FavoriteKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Favorite copy(Favorite favorite, l<? super FavoriteKt.Dsl, ab> lVar) {
        x.f(favorite, "<this>");
        x.f(lVar, "block");
        FavoriteKt.Dsl.Companion companion = FavoriteKt.Dsl.Companion;
        Favorite.Builder builder = favorite.toBuilder();
        x.e(builder, "toBuilder(...)");
        FavoriteKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Place getPlaceOrNull(FavoriteOrBuilder favoriteOrBuilder) {
        x.f(favoriteOrBuilder, "<this>");
        if (favoriteOrBuilder.hasPlace()) {
            return favoriteOrBuilder.getPlace();
        }
        return null;
    }

    public static /* synthetic */ void getPlaceOrNull$annotations(FavoriteOrBuilder favoriteOrBuilder) {
    }
}
