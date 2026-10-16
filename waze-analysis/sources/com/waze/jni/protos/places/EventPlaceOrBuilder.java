package com.waze.jni.protos.places;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface EventPlaceOrBuilder extends fj {
    boolean getAllDay();

    int getCount();

    long getEndTime();

    String getEventId();

    v getEventIdBytes();

    int getId();

    String getImageUrl();

    v getImageUrlBytes();

    String getName();

    v getNameBytes();

    Place getOriginPlace();

    boolean getRecurringCalendarEvent();

    String getRefEventId();

    v getRefEventIdBytes();

    long getStartTime();

    EventPlaceType getType();

    int getTypeValue();

    boolean getValidateOnly();

    boolean getValidated();

    boolean hasOriginPlace();
}
