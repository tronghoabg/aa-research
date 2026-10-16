package com.google.android.apps.search.assistant.platform.appintegration.a;

import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface b {
    void onServiceConnected();

    void onServiceDisconnected();

    void onUpdate(AppIntegrationService.AppIntegrationCallbackEvent appIntegrationCallbackEvent);
}
