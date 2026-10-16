package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* loaded from: classes2.dex */
final class sve extends omc {
    public sve() {
        super(null);
    }

    @Override // defpackage.omc
    public final /* bridge */ /* synthetic */ skv d(Context context, Looper looper, snr snrVar, Object obj, slb slbVar, slc slcVar) {
        svg svgVar = snrVar.g;
        Integer num = snrVar.h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", snrVar.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new svj(context, looper, snrVar, bundle, slbVar, slcVar);
    }
}
