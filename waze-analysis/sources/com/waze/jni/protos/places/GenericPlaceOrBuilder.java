package com.waze.jni.protos.places;

import com.google.v.fj;
import com.waze.jni.protos.places.GenericPlace;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface GenericPlaceOrBuilder extends fj {
    EventPlace getEventPlace();

    FavoritePlace getFavoritePlace();

    GenericPlace.PlaceCase getPlaceCase();

    RecentPlace getRecentPlace();

    Place getWazeAddress();

    boolean hasEventPlace();

    boolean hasFavoritePlace();

    boolean hasRecentPlace();

    boolean hasWazeAddress();
}
