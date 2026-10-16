package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.PinAdDisplay;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface PinAdDisplayOrBuilder extends fj {
    String getAboutThisAdUrl();

    v getAboutThisAdUrlBytes();

    String getAdBody();

    v getAdBodyBytes();

    String getAdId();

    v getAdIdBytes();

    String getAdText();

    v getAdTextBytes();

    String getBusinessName();

    v getBusinessNameBytes();

    String getClickUrl();

    v getClickUrlBytes();

    String getCtaMessage();

    v getCtaMessageBytes();

    boolean getIsTest();

    String getLogoImageUrl();

    v getLogoImageUrlBytes();

    PinAdDisplay.OpenStatus getOpenStatus();

    int getOpenStatusValue();

    String getPinIconUrl();

    v getPinIconUrlBytes();

    String getPlaceId();

    v getPlaceIdBytes();

    Position.IntPosition getPosition();

    float getRating();

    String getTrackAddStopUrl();

    v getTrackAddStopUrlBytes();

    String getVisibleUrl();

    v getVisibleUrlBytes();

    boolean hasPosition();

    boolean hasRating();
}
