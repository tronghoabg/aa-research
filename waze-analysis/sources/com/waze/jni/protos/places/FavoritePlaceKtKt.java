package com.waze.jni.protos.places;

import com.waze.jni.protos.places.FavoritePlace;
import com.waze.jni.protos.places.FavoritePlaceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FavoritePlaceKtKt {
    /* renamed from: -initializefavoritePlace, reason: not valid java name */
    public static final FavoritePlace m27954initializefavoritePlace(l<? super FavoritePlaceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        FavoritePlaceKt.Dsl.Companion companion = FavoritePlaceKt.Dsl.Companion;
        FavoritePlace.Builder builderNewBuilder = FavoritePlace.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        FavoritePlaceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FavoritePlace copy(FavoritePlace favoritePlace, l<? super FavoritePlaceKt.Dsl, ab> lVar) {
        x.f(favoritePlace, "<this>");
        x.f(lVar, "block");
        FavoritePlaceKt.Dsl.Companion companion = FavoritePlaceKt.Dsl.Companion;
        FavoritePlace.Builder builder = favoritePlace.toBuilder();
        x.e(builder, "toBuilder(...)");
        FavoritePlaceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
