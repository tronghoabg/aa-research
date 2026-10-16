package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.v.de;
import com.google.v.ds;
import com.google.v.du;
import com.google.v.gm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class UiSuppressionLevelChangedEvent {
    public static final int UI_SUPPRESSION_LEVEL_CHANGED_EVENT_DATA_FIELD_NUMBER = 272316457;
    public static final ds<AppIntegrationService.AppIntegrationClientEvent, UiSuppressionLevelChangedEventData> uiSuppressionLevelChangedEventData = du.newSingularGeneratedExtension(AppIntegrationService.AppIntegrationClientEvent.getDefaultInstance(), UiSuppressionLevelChangedEventData.getDefaultInstance(), UiSuppressionLevelChangedEventData.getDefaultInstance(), null, UI_SUPPRESSION_LEVEL_CHANGED_EVENT_DATA_FIELD_NUMBER, gm.MESSAGE, UiSuppressionLevelChangedEventData.class);

    private UiSuppressionLevelChangedEvent() {
    }

    public static void registerAllExtensions(de deVar) {
        deVar.e(uiSuppressionLevelChangedEventData);
    }
}
