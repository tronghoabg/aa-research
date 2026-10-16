package com.waze.jni.protos.favorites;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.favorites.Favorite;
import com.waze.jni.protos.places.Place;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface FavoriteOrBuilder extends fj {
    int getId();

    String getName();

    v getNameBytes();

    Place getPlace();

    Favorite.Type getType();

    int getTypeValue();

    boolean hasPlace();
}
