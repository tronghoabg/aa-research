package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.waze.jni.protos.alerters.AlerterType;
import com.waze.jni.protos.navigate.TrafficJamSection;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface TrafficJamSectionOrBuilder extends fj {
    int getAlertSubType();

    AlerterType getAlertType();

    int getAlertTypeValue();

    int getLengthMeters();

    TrafficJamSection.Severity getLevel();

    int getLevelValue();

    boolean hasAlertSubType();

    boolean hasAlertType();

    boolean hasLengthMeters();

    boolean hasLevel();
}
