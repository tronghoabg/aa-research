package com.waze.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ar extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        au appConfig;
        if (intent.getData() == null || (appConfig = SdkConfiguration.getAppConfig(intent.getData().getEncodedSchemeSpecificPart())) == null) {
            return;
        }
        appConfig.f35262e = null;
        if (SdkConfiguration.isAudioSupported(appConfig.f35260c, appConfig.f35258a)) {
            bd.d().A();
        }
    }
}
