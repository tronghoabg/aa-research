package com.google.android.libraries.assistant.appintegration;

import android.util.Log;
import com.google.android.libraries.assistant.appintegration.proto.AssistantConversationState;
import com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParams;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class CallbackExt implements Callback {
    private static final String TAG = "AppIntegCallbackExt";
    private boolean voicePlateOpened;

    public void onAssistantConnectionLost() {
    }

    public void onAssistantConversationStateChanged(AssistantConversationState assistantConversationState) {
    }

    @Override // com.google.android.libraries.assistant.appintegration.Callback
    public void onServiceConnected() {
    }

    @Override // com.google.android.libraries.assistant.appintegration.Callback
    public void onServiceDisconnected() {
    }

    @Deprecated
    public void onVoicePlateClosed() {
    }

    @Deprecated
    public void onVoicePlateOpened() {
    }

    public void onVoicePlateStateChanged(VoicePlateStateChangedParams voicePlateStateChangedParams) {
        Log.v(TAG, "#onVoicePlateStateChanged()");
        VoicePlateStateChangedParams.VoicePlateState voicePlateState = voicePlateStateChangedParams.getVoicePlateState();
        VoicePlateStateChangedParams.VoicePlateState voicePlateState2 = VoicePlateStateChangedParams.VoicePlateState.VOICE_PLATE_STATE_OPENED;
        boolean z = this.voicePlateOpened;
        if (voicePlateState == voicePlateState2) {
            if (z) {
                return;
            }
            this.voicePlateOpened = true;
            onVoicePlateOpened();
            return;
        }
        if (z) {
            this.voicePlateOpened = false;
            onVoicePlateClosed();
        }
    }
}
