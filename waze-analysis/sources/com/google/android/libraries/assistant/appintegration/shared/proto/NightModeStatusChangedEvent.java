package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.v.de;
import com.google.v.ds;
import com.google.v.du;
import com.google.v.gm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NightModeStatusChangedEvent {
    public static final int NIGHT_MODE_STATUS_CHANGED_EVENT_DATA_FIELD_NUMBER = 252475073;
    public static final ds<AppIntegrationService.AppIntegrationClientEvent, NightModeStatusChangedEventData> nightModeStatusChangedEventData = du.newSingularGeneratedExtension(AppIntegrationService.AppIntegrationClientEvent.getDefaultInstance(), NightModeStatusChangedEventData.getDefaultInstance(), NightModeStatusChangedEventData.getDefaultInstance(), null, NIGHT_MODE_STATUS_CHANGED_EVENT_DATA_FIELD_NUMBER, gm.MESSAGE, NightModeStatusChangedEventData.class);

    private NightModeStatusChangedEvent() {
    }

    public static void registerAllExtensions(de deVar) {
        deVar.e(nightModeStatusChangedEventData);
    }
}
