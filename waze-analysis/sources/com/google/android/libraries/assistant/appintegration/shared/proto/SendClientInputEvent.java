package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.v.de;
import com.google.v.ds;
import com.google.v.du;
import com.google.v.gm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SendClientInputEvent {
    public static final int SEND_CLIENT_INPUT_EVENT_DATA_FIELD_NUMBER = 262180839;
    public static final ds<AppIntegrationService.AppIntegrationClientEvent, SendClientInputEventData> sendClientInputEventData = du.newSingularGeneratedExtension(AppIntegrationService.AppIntegrationClientEvent.getDefaultInstance(), SendClientInputEventData.getDefaultInstance(), SendClientInputEventData.getDefaultInstance(), null, SEND_CLIENT_INPUT_EVENT_DATA_FIELD_NUMBER, gm.MESSAGE, SendClientInputEventData.class);

    private SendClientInputEvent() {
    }

    public static void registerAllExtensions(de deVar) {
        deVar.e(sendClientInputEventData);
    }
}
