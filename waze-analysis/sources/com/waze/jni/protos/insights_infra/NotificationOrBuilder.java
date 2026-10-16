package com.waze.jni.protos.insights_infra;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NotificationOrBuilder extends fj {
    String getBody();

    v getBodyBytes();

    String getIconName();

    v getIconNameBytes();

    NotificationId getId();

    long getTimeoutMs();

    String getTitle();

    v getTitleBytes();

    boolean hasId();

    boolean hasTimeoutMs();
}
