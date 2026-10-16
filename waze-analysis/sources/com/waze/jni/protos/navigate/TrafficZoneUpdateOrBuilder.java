package com.waze.jni.protos.navigate;

import com.google.v.fj;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface TrafficZoneUpdateOrBuilder extends fj {
    TrafficJamSection getJams(int i2);

    int getJamsCount();

    List<TrafficJamSection> getJamsList();

    int getPercentInTraffic();

    int getTotalTimeSec();

    boolean hasPercentInTraffic();

    boolean hasTotalTimeSec();
}
