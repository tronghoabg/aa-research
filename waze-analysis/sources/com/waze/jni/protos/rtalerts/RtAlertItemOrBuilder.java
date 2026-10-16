package com.waze.jni.protos.rtalerts;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.rtalerts.RtAlertItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface RtAlertItemOrBuilder extends fj {
    int getBackgroundColor();

    String getDescription();

    v getDescriptionBytes();

    int getDistance();

    String getDistanceStr();

    v getDistanceStrBytes();

    String getIcon();

    v getIconBytes();

    int getId();

    String getImageId();

    v getImageIdBytes();

    String getImageUrl();

    v getImageUrlBytes();

    boolean getIsAlertByMe();

    boolean getIsAlertOnRoute();

    boolean getIsAutoJam();

    boolean getIsCommentingAllowed();

    boolean getIsLikingAllowed();

    boolean getIsThumbsUpByMe();

    int getLatitude();

    String getLocationStr();

    v getLocationStrBytes();

    int getLongitude();

    String getMoodName();

    v getMoodNameBytes();

    int getNumComments();

    int getNumThumbsUp();

    String getReportedBy();

    v getReportedByBytes();

    int getScreenX();

    int getScreenY();

    String getTimeOnRoute();

    v getTimeOnRouteBytes();

    String getTimeRelative();

    v getTimeRelativeBytes();

    int getTimeStampSec();

    String getTitle();

    v getTitleBytes();

    RtAlertItem.Type getType();

    int getTypeValue();

    String getUnit();

    v getUnitBytes();

    boolean hasImageId();

    boolean hasImageUrl();

    boolean hasIsCommentingAllowed();

    boolean hasIsLikingAllowed();

    boolean hasLatitude();

    boolean hasLongitude();

    boolean hasReportedBy();

    boolean hasTimeRelative();

    boolean hasTimeStampSec();
}
