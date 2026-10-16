package com.waze.sdk;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class av extends ClickableSpan {
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        SdkConfiguration.openAudioSdkSettingsScreen();
    }
}
