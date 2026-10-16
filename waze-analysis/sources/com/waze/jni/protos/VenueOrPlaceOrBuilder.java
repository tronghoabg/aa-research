package com.waze.jni.protos;

import com.google.v.fj;
import com.waze.jni.protos.VenueOrPlace;
import com.waze.jni.protos.favorites.Favorite;
import com.waze.jni.protos.places.Place;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface VenueOrPlaceOrBuilder extends fj {
    VenueOrPlace.EndpointCase getEndpointCase();

    Favorite getFavorite();

    Place getPlace();

    VenueData getVenue();

    boolean hasFavorite();

    boolean hasPlace();

    boolean hasVenue();
}
