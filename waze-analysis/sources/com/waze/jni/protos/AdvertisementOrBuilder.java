package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface AdvertisementOrBuilder extends fj {
    AdvilRequest getAdvilRequest();

    String getBrandId();

    v getBrandIdBytes();

    String getChannel();

    v getChannelBytes();

    String getMenuIconName();

    v getMenuIconNameBytes();

    boolean getNavigable();

    int getPinId();

    String getPreviewIconName();

    v getPreviewIconNameBytes();

    String getPromotionId();

    v getPromotionIdBytes();

    VenueData getVenueData();

    boolean hasAdvilRequest();

    boolean hasBrandId();

    boolean hasChannel();

    boolean hasMenuIconName();

    boolean hasNavigable();

    boolean hasPinId();

    boolean hasPreviewIconName();

    boolean hasPromotionId();

    boolean hasVenueData();
}
