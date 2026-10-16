package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.v.de;
import com.google.v.ds;
import com.google.v.du;
import com.google.v.gm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AssistantConversationStateChangedEvent {
    public static final int ASSISTANT_CONVERSATION_STATE_CHANGED_EVENT_DATA_FIELD_NUMBER = 274929758;
    public static final ds<AppIntegrationService.AppIntegrationCallbackEvent, AssistantConversationStateChangedEventData> assistantConversationStateChangedEventData = du.newSingularGeneratedExtension(AppIntegrationService.AppIntegrationCallbackEvent.getDefaultInstance(), AssistantConversationStateChangedEventData.getDefaultInstance(), AssistantConversationStateChangedEventData.getDefaultInstance(), null, ASSISTANT_CONVERSATION_STATE_CHANGED_EVENT_DATA_FIELD_NUMBER, gm.MESSAGE, AssistantConversationStateChangedEventData.class);

    private AssistantConversationStateChangedEvent() {
    }

    public static void registerAllExtensions(de deVar) {
        deVar.e(assistantConversationStateChangedEventData);
    }
}
