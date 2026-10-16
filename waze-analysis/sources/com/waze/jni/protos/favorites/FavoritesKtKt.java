package com.waze.jni.protos.favorites;

import com.waze.jni.protos.favorites.Favorites;
import com.waze.jni.protos.favorites.FavoritesKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FavoritesKtKt {
    /* renamed from: -initializefavorites, reason: not valid java name */
    public static final Favorites m26177initializefavorites(l<? super FavoritesKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        FavoritesKt.Dsl.Companion companion = FavoritesKt.Dsl.Companion;
        Favorites.Builder builderNewBuilder = Favorites.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        FavoritesKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Favorites copy(Favorites favorites, l<? super FavoritesKt.Dsl, ab> lVar) {
        x.f(favorites, "<this>");
        x.f(lVar, "block");
        FavoritesKt.Dsl.Companion companion = FavoritesKt.Dsl.Companion;
        Favorites.Builder builder = favorites.toBuilder();
        x.e(builder, "toBuilder(...)");
        FavoritesKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
