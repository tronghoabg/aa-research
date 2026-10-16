package com.waze.nav_connect;

import com.waze.an.a.a.bd;
import com.waze.jni.protos.nav_connect.NavConnectState;
import com.waze.map.isolated.k;
import com.waze.nav_connect.a.m;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavConnectNativeManager extends f {
    public static final int $stable = 8;
    private final bn<k> _sessionState;
    private final ch<k> sessionState;

    public NavConnectNativeManager() {
        bn<k> bnVarB = ck.b(m.f30742a);
        this._sessionState = bnVarB;
        this.sessionState = ai.U(bnVarB);
    }

    public final ch<k> getSessionState() {
        return this.sessionState;
    }

    public final native void initNativeLayerNTV();

    public final void onStateChange$third_party_waze_client_android_project_waze_src_main_waze(NavConnectState navConnectState) {
        x.f(navConnectState, "newStateProto");
        this._sessionState.e(bd.j(navConnectState));
    }

    public final native void setUserConsentNTV(boolean z, String str);
}
