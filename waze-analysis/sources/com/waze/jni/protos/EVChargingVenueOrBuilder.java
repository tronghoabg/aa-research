package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.EVChargingVenue;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface EVChargingVenueOrBuilder extends fj {
    String getDirections();

    v getDirectionsBytes();

    EVChargingVenue.EVConnectorOverview getEvConnectorOverviews(int i2);

    int getEvConnectorOverviewsCount();

    List<EVChargingVenue.EVConnectorOverview> getEvConnectorOverviewsList();

    String getPaymentMethods(int i2);

    v getPaymentMethodsBytes(int i2);

    int getPaymentMethodsCount();

    List<String> getPaymentMethodsList();

    boolean getRestrictedAccess();

    boolean hasDirections();

    boolean hasRestrictedAccess();
}
