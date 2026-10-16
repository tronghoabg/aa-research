package com.waze.google_assistant;

import com.waze.NativeManager;
import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ag {
    public static final int $stable = 0;

    static final void connectToGoogleAssistantSdkJNI$lambda$0(ag agVar) {
        h.g.b.x.d(agVar, "null cannot be cast to non-null type com.waze.google_assistant.GoogleAssistantNativeManager");
        ((GoogleAssistantNativeManager) agVar).connectToGoogleAssistantSdk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void generateAppContextBaseEncoded$default(ag agVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateAppContextBaseEncoded");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        agVar.generateAppContextBaseEncoded(z, lVar);
    }

    static final String generateAppContextBaseEncoded$lambda$0(ag agVar, boolean z) {
        h.g.b.x.d(agVar, "null cannot be cast to non-null type com.waze.google_assistant.GoogleAssistantNativeManager");
        return ((GoogleAssistantNativeManager) agVar).generateAppContextBaseEncodedNTV(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getBaseEncodedPlaceIdFromBaseEncodedResultSet$default(ag agVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBaseEncodedPlaceIdFromBaseEncodedResultSet");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        agVar.getBaseEncodedPlaceIdFromBaseEncodedResultSet(str, lVar);
    }

    static final String getBaseEncodedPlaceIdFromBaseEncodedResultSet$lambda$0(ag agVar, String str) {
        h.g.b.x.d(agVar, "null cannot be cast to non-null type com.waze.google_assistant.GoogleAssistantNativeManager");
        return ((GoogleAssistantNativeManager) agVar).getBaseEncodedPlaceIdFromBaseEncodedResultSetNTV(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getBaseEncodedPlaceIdFromJsProtoEncodedSessionState$default(ag agVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBaseEncodedPlaceIdFromJsProtoEncodedSessionState");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        agVar.getBaseEncodedPlaceIdFromJsProtoEncodedSessionState(str, lVar);
    }

    static final String getBaseEncodedPlaceIdFromJsProtoEncodedSessionState$lambda$0(ag agVar, String str) {
        h.g.b.x.d(agVar, "null cannot be cast to non-null type com.waze.google_assistant.GoogleAssistantNativeManager");
        return ((GoogleAssistantNativeManager) agVar).getBaseEncodedPlaceIdFromJsProtoEncodedSessionStateNTV(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logAriConsent$default(ag agVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logAriConsent");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        agVar.logAriConsent(lVar);
    }

    static final h.ab logAriConsent$lambda$0(ag agVar) {
        h.g.b.x.d(agVar, "null cannot be cast to non-null type com.waze.google_assistant.GoogleAssistantNativeManager");
        ((GoogleAssistantNativeManager) agVar).logAriConsentNTV();
        return null;
    }

    protected final void connectToGoogleAssistantSdkJNI() {
        NativeManager.runMainThreadTask(new p(this, 4));
    }

    public void generateAppContextBaseEncoded(final boolean z, h.g.a.l<? super String, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.google_assistant.ae
            @Override // com.waze.hw
            public final Object a() {
                return ag.generateAppContextBaseEncoded$lambda$0(this.f24086a, z);
            }
        }, lVar != null ? new ad(lVar, 2) : null);
    }

    public void getBaseEncodedPlaceIdFromBaseEncodedResultSet(String str, h.g.a.l<? super String, h.ab> lVar) {
        NativeManager.runNativeTask(new af(this, str, 1), lVar != null ? new ad(lVar, 0) : null);
    }

    public void getBaseEncodedPlaceIdFromJsProtoEncodedSessionState(String str, h.g.a.l<? super String, h.ab> lVar) {
        NativeManager.runNativeTask(new af(this, str, 0), lVar != null ? new ad(lVar, 3) : null);
    }

    public void logAriConsent(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.google_assistant.ac
            @Override // com.waze.hw
            public final Object a() {
                ag.logAriConsent$lambda$0(this.f24083a);
                return null;
            }
        }, lVar != null ? new ad(lVar, 1) : null);
    }

    public final void generateAppContextBaseEncoded(boolean z) {
        generateAppContextBaseEncoded$default(this, z, null, 2, null);
    }

    public final void logAriConsent() {
        logAriConsent$default(this, null, 1, null);
    }

    public final void getBaseEncodedPlaceIdFromBaseEncodedResultSet(String str) {
        getBaseEncodedPlaceIdFromBaseEncodedResultSet$default(this, str, null, 2, null);
    }

    public final void getBaseEncodedPlaceIdFromJsProtoEncodedSessionState(String str) {
        getBaseEncodedPlaceIdFromJsProtoEncodedSessionState$default(this, str, null, 2, null);
    }
}
