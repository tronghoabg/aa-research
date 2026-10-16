package com.google.android.gms.m;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.m.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends com.google.android.gms.common.api.a {
    @Override // com.google.android.gms.common.api.a
    public final /* bridge */ /* synthetic */ h a(Context context, Looper looper, p pVar, Object obj, r rVar, s sVar) {
        pVar.c();
        Integer numD = pVar.d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", pVar.a());
        if (numD != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numD.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new e(context, looper, pVar, bundle, rVar, sVar);
    }
}
