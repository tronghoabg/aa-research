package com.google.android.libraries.handwriting.gui;

import android.content.Context;

/* loaded from: classes3.dex */
public final class HandwritingAnalytics {
    public static final int STARTUP_TYPE_COLD = 0;
    public static final int STARTUP_TYPE_HOT = 1;
    private static HandwritingAnalyticsImplInterface impl;

    public interface HandwritingAnalyticsImplInterface {
        void backspaceGesture();

        void enableAnalyticsLogging(Context context, boolean z);

        void flingLeftGesture();

        void initialize(Context context, int i);

        void migrationCancelClicked(String str);

        void migrationDialogShown(String str);

        void migrationUpgradeClicked(String str);

        void pressedBackspace();

        void pressedCloudButton();

        void pressedEnter(String str);

        void pressedGlobeKey();

        void pressedMoreCandidatesButton();

        void pressedSpace(String str);

        void pressedUndo();

        void pressedVoiceButton();

        void selectedCandidate(int i);

        void shutDown();

        void startNewSession(String str, boolean z, String str2, int i, int i2, int i3, String str3);

        void subtypeSelected(String str);

        void trackImeInitialization(int i, long j);

        void trackInkSize(float f, float f2, float f3, float f4);

        void trackRecognition(String str, int i, int i2, int i3, boolean z);

        void trackRecognizerInitialization(String str, long j);

        void welcomeFlow(String str);
    }

    private HandwritingAnalytics() {
    }

    public static void backspaceGesture() {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.backspaceGesture();
    }

    public static void enableAnalyticsLogging(Context context, boolean z) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.enableAnalyticsLogging(context, z);
    }

    public static void flingLeftGesture() {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.flingLeftGesture();
    }

    public static synchronized boolean hasImplementation() {
        return impl != null;
    }

    public static synchronized void initialize(Context context, int i) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.initialize(context, i);
    }

    public static void migrationCancelClicked(String str) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.migrationCancelClicked(str);
    }

    public static void migrationDialogShown(String str) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.migrationDialogShown(str);
    }

    public static void migrationUpgradeClicked(String str) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.migrationUpgradeClicked(str);
    }

    public static void pressedBackspace() {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedBackspace();
    }

    public static void pressedCloudButton() {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedCloudButton();
    }

    public static void pressedEnter(String str) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedEnter(str);
    }

    public static void pressedGlobeKey() {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedGlobeKey();
    }

    public static void pressedMoreCandidatesButton() {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedMoreCandidatesButton();
    }

    public static void pressedSpace(String str) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedSpace(str);
    }

    public static void pressedUndo() {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedUndo();
    }

    public static void pressedVoice() {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedVoiceButton();
    }

    public static void selectedCandidate(int i) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.selectedCandidate(i);
    }

    public static synchronized void setImplementation(HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface) {
        impl = handwritingAnalyticsImplInterface;
    }

    public static void shutDown() {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.shutDown();
    }

    public static void startNewSession(String str, boolean z, String str2, int i, int i2, int i3, String str3) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.startNewSession(str, z, str2, i, i2, i3, str3);
    }

    public static void subtypeSelected(String str) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.subtypeSelected(str);
    }

    public static void trackImeInitialization(int i, long j) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.trackImeInitialization(i, j);
    }

    public static void trackInkSize(float f, float f2, float f3, float f4) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.trackInkSize(f, f2, f3, f4);
    }

    public static void trackRecognition(String str, int i, int i2, int i3, boolean z) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.trackRecognition(str, i, i2, i3, z);
    }

    public static void trackRecognizerInitialization(String str, long j) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.trackRecognizerInitialization(str, j);
    }

    public static void welcomeFlow(String str) {
        HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.welcomeFlow(str);
    }
}
