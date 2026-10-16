package com.google.android.libraries.handwriting.gui;

/* JADX INFO: loaded from: classes3.dex */
public final class HandwritingAnalytics {
    public static final int STARTUP_TYPE_COLD = 0;
    public static final int STARTUP_TYPE_HOT = 1;
    private static com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface impl;

    public interface HandwritingAnalyticsImplInterface {
        void backspaceGesture();

        void enableAnalyticsLogging(android.content.Context context, boolean z);

        void flingLeftGesture();

        void initialize(android.content.Context context, int i);

        void migrationCancelClicked(java.lang.String str);

        void migrationDialogShown(java.lang.String str);

        void migrationUpgradeClicked(java.lang.String str);

        void pressedBackspace();

        void pressedCloudButton();

        void pressedEnter(java.lang.String str);

        void pressedGlobeKey();

        void pressedMoreCandidatesButton();

        void pressedSpace(java.lang.String str);

        void pressedUndo();

        void pressedVoiceButton();

        void selectedCandidate(int i);

        void shutDown();

        void startNewSession(java.lang.String str, boolean z, java.lang.String str2, int i, int i2, int i3, java.lang.String str3);

        void subtypeSelected(java.lang.String str);

        void trackImeInitialization(int i, long j);

        void trackInkSize(float f, float f2, float f3, float f4);

        void trackRecognition(java.lang.String str, int i, int i2, int i3, boolean z);

        void trackRecognizerInitialization(java.lang.String str, long j);

        void welcomeFlow(java.lang.String str);
    }

    private HandwritingAnalytics() {
    }

    public static void backspaceGesture() {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.backspaceGesture();
    }

    public static void enableAnalyticsLogging(android.content.Context context, boolean z) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.enableAnalyticsLogging(context, z);
    }

    public static void flingLeftGesture() {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.flingLeftGesture();
    }

    public static synchronized boolean hasImplementation() {
        return impl != null;
    }

    public static synchronized void initialize(android.content.Context context, int i) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.initialize(context, i);
    }

    public static void migrationCancelClicked(java.lang.String str) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.migrationCancelClicked(str);
    }

    public static void migrationDialogShown(java.lang.String str) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.migrationDialogShown(str);
    }

    public static void migrationUpgradeClicked(java.lang.String str) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.migrationUpgradeClicked(str);
    }

    public static void pressedBackspace() {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedBackspace();
    }

    public static void pressedCloudButton() {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedCloudButton();
    }

    public static void pressedEnter(java.lang.String str) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedEnter(str);
    }

    public static void pressedGlobeKey() {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedGlobeKey();
    }

    public static void pressedMoreCandidatesButton() {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedMoreCandidatesButton();
    }

    public static void pressedSpace(java.lang.String str) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedSpace(str);
    }

    public static void pressedUndo() {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedUndo();
    }

    public static void pressedVoice() {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.pressedVoiceButton();
    }

    public static void selectedCandidate(int i) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.selectedCandidate(i);
    }

    public static synchronized void setImplementation(com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface) {
        impl = handwritingAnalyticsImplInterface;
    }

    public static void shutDown() {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.shutDown();
    }

    public static void startNewSession(java.lang.String str, boolean z, java.lang.String str2, int i, int i2, int i3, java.lang.String str3) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.startNewSession(str, z, str2, i, i2, i3, str3);
    }

    public static void subtypeSelected(java.lang.String str) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.subtypeSelected(str);
    }

    public static void trackImeInitialization(int i, long j) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.trackImeInitialization(i, j);
    }

    public static void trackInkSize(float f, float f2, float f3, float f4) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.trackInkSize(f, f2, f3, f4);
    }

    public static void trackRecognition(java.lang.String str, int i, int i2, int i3, boolean z) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.trackRecognition(str, i, i2, i3, z);
    }

    public static void trackRecognizerInitialization(java.lang.String str, long j) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.trackRecognizerInitialization(str, j);
    }

    public static void welcomeFlow(java.lang.String str) {
        com.google.android.libraries.handwriting.gui.HandwritingAnalytics.HandwritingAnalyticsImplInterface handwritingAnalyticsImplInterface = impl;
        if (handwritingAnalyticsImplInterface == null) {
            return;
        }
        handwritingAnalyticsImplInterface.welcomeFlow(str);
    }
}
