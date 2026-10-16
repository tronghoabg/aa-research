package com.waze.jni.protos.asks;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.asks.WazeAsksTrigger;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface WazeAsksTriggerOrBuilder extends fj {
    String getInsightId();

    v getInsightIdBytes();

    int getStatsAlertId();

    WazeAsksTrigger.TriggerType getType();

    int getTypeValue();
}
