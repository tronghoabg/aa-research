package com.google.android.libraries.handwriting.base;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class HandwritingRecognizer {
    protected HandwritingRecognizer secondaryRecognizer = null;

    public interface CancelStruct {
        public static final CancelStruct UNCANCELABLE = new CancelStruct() { // from class: com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct.1
            @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct
            public boolean isCanceled() {
                return false;
            }
        };

        boolean isCanceled();
    }

    public static class HandwritingRecognizerSettings {
        public int clientVersion;
        public String deviceName;
        public int deviceVersion;
        public GBoardHandwritingRecognizerSettings gBoardHandwritingRecognizerSettings;
        public int maxRequestsInParallel;
        public int timeoutBeforeNextRequest;
        public boolean useSpaces;
        public int verbosity;
        public String language = "en";
        public String clientName = "unset";

        public static class GBoardHandwritingRecognizerSettings {
            private final boolean useNextWordPredictionSpellingCorrection;

            public GBoardHandwritingRecognizerSettings(boolean z) {
                this.useNextWordPredictionSpellingCorrection = z;
            }

            public boolean getUseNextWordPredictionSpellingCorrection() {
                return this.useNextWordPredictionSpellingCorrection;
            }
        }

        public String toString() {
            return String.format(Locale.ROOT, "lang:%s client:%s:%d device:%s:%d v:%d space:%b maxParallel:%d timeout:%d", this.language, this.clientName, Integer.valueOf(this.clientVersion), this.deviceName, Integer.valueOf(this.deviceVersion), Integer.valueOf(this.verbosity), Boolean.valueOf(this.useSpaces), Integer.valueOf(this.maxRequestsInParallel), Integer.valueOf(this.timeoutBeforeNextRequest));
        }
    }

    public static class RecognitionFailedException extends Exception {
        public RecognitionFailedException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static class SendingFeedbackFailedException extends Exception {
        public SendingFeedbackFailedException(String str, Throwable th) {
            super(str, th);
        }
    }

    public RecognitionResult decode(long j) {
        return null;
    }

    @ResultIgnorabilityUnspecified
    public String feedback(String str, StrokeList strokeList, String str2, String str3) throws SendingFeedbackFailedException {
        return (hasSecondaryRecognizer() && isSendingFeedback()) ? this.secondaryRecognizer.feedback(str, strokeList, "datacollector_".concat(String.valueOf(str2)), str3) : "";
    }

    public long getLattice(long j) {
        return 0L;
    }

    public long getLatticeInterface(long j) {
        return 0L;
    }

    public HandwritingRecognizer getSecondaryRecognizer() {
        return this.secondaryRecognizer;
    }

    public abstract HandwritingRecognizerSettings getSettings();

    public boolean hasSecondaryRecognizer() {
        return this.secondaryRecognizer != null;
    }

    public abstract boolean isCloudRecognizer();

    public abstract boolean isSendingFeedback();

    @ResultIgnorabilityUnspecified
    public abstract RecognitionResult recognize(StrokeList strokeList, CancelStruct cancelStruct) throws RecognitionFailedException;

    public void setSecondaryRecognizer(HandwritingRecognizer handwritingRecognizer) {
        this.secondaryRecognizer = handwritingRecognizer;
    }

    public abstract void setSendingFeedback(boolean z);

    public long startRecognition(int i, int i2, String str) {
        return 0L;
    }

    public void destroy() {
    }

    public void finalizeRecognition(long j) {
    }

    public String feedback(String str, String str2, String str3, String str4) throws SendingFeedbackFailedException {
        return (hasSecondaryRecognizer() && isSendingFeedback()) ? this.secondaryRecognizer.feedback(str, str2, str3, str4) : "";
    }

    public void addStroke(long j, Stroke stroke) {
    }
}
