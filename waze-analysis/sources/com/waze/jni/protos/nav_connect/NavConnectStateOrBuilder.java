package com.waze.jni.protos.nav_connect;

import com.google.v.fj;
import com.waze.jni.protos.nav_connect.NavConnectState;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NavConnectStateOrBuilder extends fj {
    NavConnectState.Active getActive();

    NavConnectState.Inactive getInactive();

    NavConnectState.Paused getPaused();

    NavConnectState.PendingTokenValidation getPendingTokenValidation();

    NavConnectState.PendingUserConsent getPendingUserConsent();

    NavConnectState.StateCase getStateCase();

    boolean hasActive();

    boolean hasInactive();

    boolean hasPaused();

    boolean hasPendingTokenValidation();

    boolean hasPendingUserConsent();
}
