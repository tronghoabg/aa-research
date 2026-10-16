package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.v.de;
import com.google.v.ds;
import com.google.v.du;
import com.google.v.gm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class KeyguardDismissStatusChangedEvent {
    public static final int KEYGUARD_DISMISS_STATUS_CHANGED_EVENT_DATA_FIELD_NUMBER = 286429241;
    public static final ds<AppIntegrationService.AppIntegrationClientEvent, KeyguardDismissStatusChangedEventData> keyguardDismissStatusChangedEventData = du.newSingularGeneratedExtension(AppIntegrationService.AppIntegrationClientEvent.getDefaultInstance(), KeyguardDismissStatusChangedEventData.getDefaultInstance(), KeyguardDismissStatusChangedEventData.getDefaultInstance(), null, KEYGUARD_DISMISS_STATUS_CHANGED_EVENT_DATA_FIELD_NUMBER, gm.MESSAGE, KeyguardDismissStatusChangedEventData.class);

    private KeyguardDismissStatusChangedEvent() {
    }

    public static void registerAllExtensions(de deVar) {
        deVar.e(keyguardDismissStatusChangedEventData);
    }
}
