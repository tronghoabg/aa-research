package com.waze.google_assistant;

import com.waze.sound.ih;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class GoogleAssistantNativeManager extends ag {
    private static GoogleAssistantNativeManager sInstance;

    private GoogleAssistantNativeManager() {
    }

    public static synchronized GoogleAssistantNativeManager getInstance() {
        GoogleAssistantNativeManager googleAssistantNativeManager;
        googleAssistantNativeManager = sInstance;
        if (googleAssistantNativeManager == null) {
            googleAssistantNativeManager = new GoogleAssistantNativeManager();
            sInstance = googleAssistantNativeManager;
        }
        return googleAssistantNativeManager;
    }

    void connectToGoogleAssistantSdk() {
        ih.a().d();
        aa.f24060a.a().m();
    }

    protected native String generateAppContextBaseEncodedNTV(boolean z);

    protected native String getBaseEncodedPlaceIdFromBaseEncodedResultSetNTV(String str);

    protected native String getBaseEncodedPlaceIdFromJsProtoEncodedSessionStateNTV(String str);

    public native void initNativeLayerNTV();

    protected native void logAriConsentNTV();
}
