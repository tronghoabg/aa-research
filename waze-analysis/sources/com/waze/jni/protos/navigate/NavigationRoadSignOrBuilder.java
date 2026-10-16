package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.google.v.v;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NavigationRoadSignOrBuilder extends fj {
    NavigationExitSign getExitSign(int i2);

    int getExitSignCount();

    List<NavigationExitSign> getExitSignList();

    String getPrimaryMarkup();

    v getPrimaryMarkupBytes();

    NavigationRoadShield getRoadShield(int i2);

    int getRoadShieldCount();

    List<NavigationRoadShield> getRoadShieldList();

    String getSecondaryMarkup();

    v getSecondaryMarkupBytes();

    String getTextRepresentation();

    v getTextRepresentationBytes();
}
