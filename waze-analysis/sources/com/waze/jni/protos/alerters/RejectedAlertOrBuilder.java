package com.waze.jni.protos.alerters;

import com.google.v.fj;
import com.waze.jni.protos.alerters.RejectedAlert;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface RejectedAlertOrBuilder extends fj {
    AlerterId getAlertId();

    RejectedAlert.Reason getReason();

    int getReasonValue();

    boolean hasAlertId();
}
