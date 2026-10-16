package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HandwritingRecognizer {
    protected com.google.android.libraries.handwriting.base.HandwritingRecognizer secondaryRecognizer = null;

    public interface CancelStruct {
        public static final com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct UNCANCELABLE = new com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct() { // from class: com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct.1
            @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct
            public boolean isCanceled() {
                return false;
            }
        };

        boolean isCanceled();
    }

    public static class HandwritingRecognizerSettings {
        public int clientVersion;
        public java.lang.String deviceName;
        public int deviceVersion;
        public com.google.android.libraries.handwriting.base.HandwritingRecognizer.HandwritingRecognizerSettings.GBoardHandwritingRecognizerSettings gBoardHandwritingRecognizerSettings;
        public int maxRequestsInParallel;
        public int timeoutBeforeNextRequest;
        public boolean useSpaces;
        public int verbosity;
        public java.lang.String language = "en";
        public java.lang.String clientName = "unset";

        public static class GBoardHandwritingRecognizerSettings {
            private final boolean useNextWordPredictionSpellingCorrection;

            public GBoardHandwritingRecognizerSettings(boolean z) {
                this.useNextWordPredictionSpellingCorrection = z;
            }

            public boolean getUseNextWordPredictionSpellingCorrection() {
                return this.useNextWordPredictionSpellingCorrection;
            }
        }

        public java.lang.String toString() {
            return java.lang.String.format(java.util.Locale.ROOT, "lang:%s client:%s:%d device:%s:%d v:%d space:%b maxParallel:%d timeout:%d", this.language, this.clientName, java.lang.Integer.valueOf(this.clientVersion), this.deviceName, java.lang.Integer.valueOf(this.deviceVersion), java.lang.Integer.valueOf(this.verbosity), java.lang.Boolean.valueOf(this.useSpaces), java.lang.Integer.valueOf(this.maxRequestsInParallel), java.lang.Integer.valueOf(this.timeoutBeforeNextRequest));
        }
    }

    public static class RecognitionFailedException extends java.lang.Exception {
        public RecognitionFailedException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }

    public static class SendingFeedbackFailedException extends java.lang.Exception {
        public SendingFeedbackFailedException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }

    public com.google.android.libraries.handwriting.base.RecognitionResult decode(long j) {
        return null;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public java.lang.String feedback(java.lang.String str, com.google.android.libraries.handwriting.base.StrokeList strokeList, java.lang.String str2, java.lang.String str3) throws com.google.android.libraries.handwriting.base.HandwritingRecognizer.SendingFeedbackFailedException {
        return (hasSecondaryRecognizer() && isSendingFeedback()) ? this.secondaryRecognizer.feedback(str, strokeList, "datacollector_".concat(java.lang.String.valueOf(str2)), str3) : "";
    }

    public long getLattice(long j) {
        return 0L;
    }

    public long getLatticeInterface(long j) {
        return 0L;
    }

    public com.google.android.libraries.handwriting.base.HandwritingRecognizer getSecondaryRecognizer() {
        return this.secondaryRecognizer;
    }

    public abstract com.google.android.libraries.handwriting.base.HandwritingRecognizer.HandwritingRecognizerSettings getSettings();

    public boolean hasSecondaryRecognizer() {
        return this.secondaryRecognizer != null;
    }

    public abstract boolean isCloudRecognizer();

    public abstract boolean isSendingFeedback();

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public abstract com.google.android.libraries.handwriting.base.RecognitionResult recognize(com.google.android.libraries.handwriting.base.StrokeList strokeList, com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct cancelStruct) throws com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException;

    public void setSecondaryRecognizer(com.google.android.libraries.handwriting.base.HandwritingRecognizer handwritingRecognizer) {
        this.secondaryRecognizer = handwritingRecognizer;
    }

    public abstract void setSendingFeedback(boolean z);

    public long startRecognition(int i, int i2, java.lang.String str) {
        return 0L;
    }

    public void destroy() {
    }

    public void finalizeRecognition(long j) {
    }

    public java.lang.String feedback(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws com.google.android.libraries.handwriting.base.HandwritingRecognizer.SendingFeedbackFailedException {
        return (hasSecondaryRecognizer() && isSendingFeedback()) ? this.secondaryRecognizer.feedback(str, str2, str3, str4) : "";
    }

    public void addStroke(long j, com.google.android.libraries.handwriting.base.Stroke stroke) {
    }
}
