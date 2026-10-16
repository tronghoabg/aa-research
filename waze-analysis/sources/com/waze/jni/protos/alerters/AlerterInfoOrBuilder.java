package com.waze.jni.protos.alerters;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface AlerterInfoOrBuilder extends fj {
    AlerterId getAlertId();

    boolean getCloseDistanceSameAlertsCappingEnabled();

    String getDescription();

    v getDescriptionBytes();

    String getDistanceString();

    v getDistanceStringBytes();

    boolean getHideActionsWhenInvalid();

    String getIconName();

    v getIconNameBytes();

    boolean getIsApproachingWithValidation();

    boolean getIsCancellable();

    boolean getIsCloseOnly();

    boolean getIsEtaClickable();

    boolean getIsWarningMode();

    int getNumThumbsUp();

    Position.IntPosition getPosition();

    String getPrimaryButtonText();

    v getPrimaryButtonTextBytes();

    int getReportId();

    String getSecondaryButtonText();

    v getSecondaryButtonTextBytes();

    boolean getShouldShowStillThere();

    boolean getShowDistance();

    boolean getShowThumbsUp();

    boolean getShowWithEta();

    SilentActivation getSilentActivation();

    int getSilentActivationValue();

    int getSubType();

    int getTimeoutSeconds();

    AlerterTimerType getTimerType();

    int getTimerTypeValue();

    String getTitle();

    v getTitleBytes();

    String getTitleWithDistance();

    v getTitleWithDistanceBytes();

    AlerterType getType();

    int getTypeValue();

    AlertValidationResult getValidationResult();

    boolean hasAlertId();

    boolean hasCloseDistanceSameAlertsCappingEnabled();

    boolean hasDescription();

    boolean hasDistanceString();

    boolean hasHideActionsWhenInvalid();

    boolean hasIconName();

    boolean hasIsApproachingWithValidation();

    boolean hasIsCancellable();

    boolean hasIsCloseOnly();

    boolean hasIsEtaClickable();

    boolean hasIsWarningMode();

    boolean hasNumThumbsUp();

    boolean hasPosition();

    boolean hasPrimaryButtonText();

    boolean hasReportId();

    boolean hasSecondaryButtonText();

    boolean hasShouldShowStillThere();

    boolean hasShowDistance();

    boolean hasShowThumbsUp();

    boolean hasShowWithEta();

    boolean hasSilentActivation();

    boolean hasSubType();

    boolean hasTimeoutSeconds();

    boolean hasTimerType();

    boolean hasTitle();

    boolean hasTitleWithDistance();

    boolean hasType();

    boolean hasValidationResult();
}
