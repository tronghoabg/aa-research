package com.waze.jni.protos.network;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface ResultStructMessageOrBuilder extends fj {
    String getAction();

    v getActionBytes();

    String getAnalytics();

    v getAnalyticsBytes();

    String getBody();

    v getBodyBytes();

    int getCode();

    String getDeepLink();

    v getDeepLinkBytes();

    String getErrorCode();

    v getErrorCodeBytes();

    boolean getHideCloseButton();

    boolean getShowAsToast();

    TransactionStatsMessage getStats();

    boolean getTerminal();

    String getTitle();

    v getTitleBytes();

    boolean hasStats();
}
