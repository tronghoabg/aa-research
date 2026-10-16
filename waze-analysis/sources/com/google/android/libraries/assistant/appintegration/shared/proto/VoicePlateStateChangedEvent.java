package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParams;
import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.v.de;
import com.google.v.ds;
import com.google.v.du;
import com.google.v.gm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class VoicePlateStateChangedEvent {
    public static final int VOICE_PLATE_STATE_CHANGED_PARAMS_FIELD_NUMBER = 241004531;
    public static final ds<AppIntegrationService.AppIntegrationCallbackEvent, VoicePlateStateChangedParams> voicePlateStateChangedParams = du.newSingularGeneratedExtension(AppIntegrationService.AppIntegrationCallbackEvent.getDefaultInstance(), VoicePlateStateChangedParams.getDefaultInstance(), VoicePlateStateChangedParams.getDefaultInstance(), null, VOICE_PLATE_STATE_CHANGED_PARAMS_FIELD_NUMBER, gm.MESSAGE, VoicePlateStateChangedParams.class);

    private VoicePlateStateChangedEvent() {
    }

    public static void registerAllExtensions(de deVar) {
        deVar.e(voicePlateStateChangedParams);
    }
}
