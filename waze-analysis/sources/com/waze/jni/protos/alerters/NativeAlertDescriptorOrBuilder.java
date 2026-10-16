package com.waze.jni.protos.alerters;

import com.google.v.fj;
import com.waze.jni.protos.InsightPriority;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NativeAlertDescriptorOrBuilder extends fj {
    boolean getAbortImmediatelyOnRemoval();

    AlerterId getAlertId();

    AlerterInfo getInfo();

    InsightPriority getInsightPriority();

    int getTriggerDistanceMeters();

    ZoneAlertData getZoneAlertData();

    boolean hasAlertId();

    boolean hasInfo();

    boolean hasInsightPriority();

    boolean hasZoneAlertData();
}
