package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.v.de;
import com.google.v.ds;
import com.google.v.du;
import com.google.v.gm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavigationStateChangedEvent {
    public static final int NAVIGATION_STATE_CHANGED_EVENT_DATA_FIELD_NUMBER = 236878880;
    public static final ds<AppIntegrationService.AppIntegrationClientEvent, NavigationStateChangedEventData> navigationStateChangedEventData = du.newSingularGeneratedExtension(AppIntegrationService.AppIntegrationClientEvent.getDefaultInstance(), NavigationStateChangedEventData.getDefaultInstance(), NavigationStateChangedEventData.getDefaultInstance(), null, NAVIGATION_STATE_CHANGED_EVENT_DATA_FIELD_NUMBER, gm.MESSAGE, NavigationStateChangedEventData.class);

    private NavigationStateChangedEvent() {
    }

    public static void registerAllExtensions(de deVar) {
        deVar.e(navigationStateChangedEventData);
    }
}
