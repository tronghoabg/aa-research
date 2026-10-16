package com.waze.jni.protos.resume_drive;

import com.google.v.fj;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.places.GenericPlace;
import com.waze.jni.protos.resume_drive.GenericPlaceOrVenueData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface GenericPlaceOrVenueDataOrBuilder extends fj {
    GenericPlaceOrVenueData.DestinationCase getDestinationCase();

    GenericPlace getPlace();

    VenueData getVenue();

    boolean hasPlace();

    boolean hasVenue();
}
