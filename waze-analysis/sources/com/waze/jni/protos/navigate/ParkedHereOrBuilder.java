package com.waze.jni.protos.navigate;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface ParkedHereOrBuilder extends fj {
    int getLatitude();

    int getLongitude();

    ParkedHereSetReason getReason();

    int getReasonValue();

    boolean getShowPopup();
}
