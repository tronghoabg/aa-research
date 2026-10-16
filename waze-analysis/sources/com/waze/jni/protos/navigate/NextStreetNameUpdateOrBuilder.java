package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NextStreetNameUpdateOrBuilder extends fj {
    boolean getDisplayArrowBeforeText();

    NavigationRoadSign getRoadSign();

    int getSegmentIdx();

    String getStreetName();

    v getStreetNameBytes();

    boolean hasRoadSign();
}
