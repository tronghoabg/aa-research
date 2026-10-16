package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface TollPriceInformationOrBuilder extends fj {
    String getActionUrl();

    v getActionUrlBytes();

    String getPassBasedMissingPassName();

    v getPassBasedMissingPassNameBytes();

    double getPassBasedPriceChangeToPrice();

    String getPassBasedUserPassName();

    v getPassBasedUserPassNameBytes();

    int getPopupId();

    double getTimeBasedPriceChangeAtSeconds();

    double getTimeBasedPriceChangeToPrice();

    String getTollCurrencyCode();

    v getTollCurrencyCodeBytes();

    double getTollPrice();

    String getTollRoadName();

    v getTollRoadNameBytes();

    boolean hasActionUrl();

    boolean hasPassBasedMissingPassName();

    boolean hasPassBasedPriceChangeToPrice();

    boolean hasPassBasedUserPassName();

    boolean hasPopupId();

    boolean hasTimeBasedPriceChangeAtSeconds();

    boolean hasTimeBasedPriceChangeToPrice();

    boolean hasTollCurrencyCode();

    boolean hasTollPrice();

    boolean hasTollRoadName();
}
