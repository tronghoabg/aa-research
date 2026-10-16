package com.google.android.libraries.handwriting.gui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.handwriting.base.BoundingBox;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.handwriting.gui.GestureRecognizer;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.a;
import defpackage.ajpq;
import defpackage.ajqu;
import defpackage.ajra;
import defpackage.ajsr;
import defpackage.ajst;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class ImeHandwritingRecognizer {
    private static final String TAG = "HWRImeReco";
    protected Stroke currentStroke;
    private int currentStrokeId;
    private boolean editingPreviouslyEnteredText;
    protected final ExecutorService feedbackExecutor;
    private final GestureRecognizer gestureRecognizer;
    private final Handler handler;
    protected RecognizerClient imeEventHandler;
    private int inputType;
    public int latestReceivedResponse;
    private boolean passwordMode;
    private int percentFeedback;
    ExecutorService recognitionExecutor;
    private final RecognitionRequestQueueHandler recognitionQueue;
    protected HandwritingRecognizer recognizer;
    private final Set<RecognitionRunnable> runningRecognitionTasks;
    protected final RecognizerUISettings settings;
    private StrokeList strokes;
    private int writingGuideHeight;
    private int writingGuideWidth;

    /* renamed from: com.google.android.libraries.handwriting.gui.ImeHandwritingRecognizer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$libraries$handwriting$gui$GestureRecognizer$Gesture;

        static {
            int[] iArr = new int[GestureRecognizer.Gesture.values().length];
            $SwitchMap$com$google$android$libraries$handwriting$gui$GestureRecognizer$Gesture = iArr;
            try {
                iArr[GestureRecognizer.Gesture.NOT_A_GESTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$libraries$handwriting$gui$GestureRecognizer$Gesture[GestureRecognizer.Gesture.GEST_IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$libraries$handwriting$gui$GestureRecognizer$Gesture[GestureRecognizer.Gesture.GEST_BACKSPACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$libraries$handwriting$gui$GestureRecognizer$Gesture[GestureRecognizer.Gesture.GEST_SPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$android$libraries$handwriting$gui$GestureRecognizer$Gesture[GestureRecognizer.Gesture.GEST_NEW_WORD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$android$libraries$handwriting$gui$GestureRecognizer$Gesture[GestureRecognizer.Gesture.GEST_FLING_FROM_LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private class RecognitionCallback implements RecognitionRunnable.Callback {
        private static final String TAG = "HWRRecoCallback";
        final /* synthetic */ ImeHandwritingRecognizer this$0;
        private final boolean withAutoSelect;

        public RecognitionCallback(ImeHandwritingRecognizer imeHandwritingRecognizer, boolean z) {
            imeHandwritingRecognizer.getClass();
            this.this$0 = imeHandwritingRecognizer;
            this.withAutoSelect = z;
        }

        @Override // com.google.android.libraries.handwriting.gui.ImeHandwritingRecognizer.RecognitionRunnable.Callback
        public void recognitionEnded(RecognitionRunnable recognitionRunnable, StrokeList strokeList, RecognitionResult recognitionResult) {
            Log.i(TAG, "recognitionEnded: " + String.valueOf(recognitionRunnable) + " " + String.valueOf(strokeList) + " " + String.valueOf(recognitionResult));
            synchronized (this.this$0.runningRecognitionTasks) {
                this.this$0.runningRecognitionTasks.remove(recognitionRunnable);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (recognitionResult == null) {
                this.this$0.logVi(1, TAG, "No or empty response.");
                return;
            }
            int requestId = recognitionResult.getRequestId();
            if (recognitionRunnable.isCancelled()) {
                this.this$0.logVi(1, TAG, "Task was cancelled.");
                return;
            }
            recognitionResult.setRecognitionEndedTime(jCurrentTimeMillis);
            int i = this.this$0.currentStrokeId;
            ImeHandwritingRecognizer imeHandwritingRecognizer = this.this$0;
            if (requestId < i) {
                imeHandwritingRecognizer.logVi(2, TAG, "Obsolete request: " + requestId + " < " + recognitionResult.getRequestId());
                return;
            }
            if (requestId > imeHandwritingRecognizer.latestReceivedResponse) {
                imeHandwritingRecognizer.imeEventHandler.onRecognitionEnd(recognitionResult, imeHandwritingRecognizer.pendingRequests(requestId), this.withAutoSelect);
                this.this$0.latestReceivedResponse = requestId;
            }
            if (this.this$0.imeEventHandler.isShowDebugInfo()) {
                ImeHandwritingRecognizer imeHandwritingRecognizer2 = this.this$0;
                imeHandwritingRecognizer2.imeEventHandler.setStatusText("Pending requests: " + imeHandwritingRecognizer2.pendingRequests(requestId) + "\n" + recognitionResult.getDebugInfo());
            }
            this.this$0.logVi(2, TAG, "runFinished: finished");
        }

        @Override // com.google.android.libraries.handwriting.gui.ImeHandwritingRecognizer.RecognitionRunnable.Callback
        public void recognitionFailed(RecognitionRunnable recognitionRunnable, StrokeList strokeList, HandwritingRecognizer.RecognitionFailedException recognitionFailedException) throws Exception {
            Log.i(TAG, "recognitionFailed");
            synchronized (this.this$0.runningRecognitionTasks) {
                this.this$0.runningRecognitionTasks.remove(recognitionRunnable);
            }
            this.this$0.handleException(recognitionRunnable.requestId, recognitionFailedException, "recognizing");
        }
    }

    private class RecognitionRequestQueueHandler extends Handler {
        private static final String LOG_TAG = "HWRRecoQueueHandler";
        private static final int MSG_START_RECOGNITION_REQUEST = 1;
        private static final int MSG_START_RECOGNITION_REQUEST_NO_AUTO_SELECT = 2;
        final /* synthetic */ ImeHandwritingRecognizer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecognitionRequestQueueHandler(ImeHandwritingRecognizer imeHandwritingRecognizer, Looper looper) {
            super(looper);
            imeHandwritingRecognizer.getClass();
            this.this$0 = imeHandwritingRecognizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cancelRecognitionRequests() {
            this.this$0.logVi(2, LOG_TAG, "clearing Queue");
            removeMessages(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void scheduleDelayedRecognition(boolean z) {
            this.this$0.logVi(2, LOG_TAG, "scheduling with delay " + this.this$0.recognizer.getSettings().timeoutBeforeNextRequest);
            sendMessageDelayed(obtainMessage(true == z ? 1 : 2), this.this$0.recognizer.getSettings().timeoutBeforeNextRequest);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1 && i != 2) {
                this.this$0.logVi(3, LOG_TAG, "Unknown message received. Passing to super.");
                super.handleMessage(message);
                return;
            }
            this.this$0.logVi(2, LOG_TAG, "starting: ".concat(String.valueOf(String.valueOf(message))));
            boolean zIsEmpty = this.this$0.strokes.isEmpty();
            ImeHandwritingRecognizer imeHandwritingRecognizer = this.this$0;
            if (zIsEmpty) {
                imeHandwritingRecognizer.logVi(3, LOG_TAG, "No strokes, no recognition started.");
            } else {
                imeHandwritingRecognizer.startRecognitionTask(imeHandwritingRecognizer.currentStrokeId, imeHandwritingRecognizer.strokes, message.what == 1);
            }
        }
    }

    public static class RecognitionRunnable implements Runnable {
        private final Callback callback;
        private boolean canceled;
        private final Handler handler;
        private final HandwritingRecognizer recognizer;
        private final int requestId;
        final StrokeList strokes;

        public interface Callback {
            void recognitionEnded(RecognitionRunnable recognitionRunnable, StrokeList strokeList, RecognitionResult recognitionResult);

            void recognitionFailed(RecognitionRunnable recognitionRunnable, StrokeList strokeList, HandwritingRecognizer.RecognitionFailedException recognitionFailedException);
        }

        private class RecognitionCancelStruct implements HandwritingRecognizer.CancelStruct {
            final /* synthetic */ RecognitionRunnable this$0;

            private RecognitionCancelStruct(RecognitionRunnable recognitionRunnable) {
                recognitionRunnable.getClass();
                this.this$0 = recognitionRunnable;
            }

            @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct
            public boolean isCanceled() {
                return this.this$0.isCancelled();
            }
        }

        private class RecognitionEndedRunnable implements Runnable {
            private final RecognitionResult result;
            private final RecognitionRunnable runnable;
            private final StrokeList strokes;
            final /* synthetic */ RecognitionRunnable this$0;

            public RecognitionEndedRunnable(RecognitionRunnable recognitionRunnable, RecognitionRunnable recognitionRunnable2, StrokeList strokeList, RecognitionResult recognitionResult) {
                recognitionRunnable.getClass();
                this.this$0 = recognitionRunnable;
                this.runnable = recognitionRunnable2;
                this.strokes = strokeList;
                this.result = recognitionResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.callback.recognitionEnded(this.runnable, this.strokes, this.result);
            }
        }

        private class RecognitionFailedRunnable implements Runnable {
            private final HandwritingRecognizer.RecognitionFailedException e;
            private final RecognitionRunnable runnable;
            private final StrokeList strokes;
            final /* synthetic */ RecognitionRunnable this$0;

            public RecognitionFailedRunnable(RecognitionRunnable recognitionRunnable, RecognitionRunnable recognitionRunnable2, StrokeList strokeList, HandwritingRecognizer.RecognitionFailedException recognitionFailedException) {
                recognitionRunnable.getClass();
                this.this$0 = recognitionRunnable;
                this.runnable = recognitionRunnable2;
                this.strokes = strokeList;
                this.e = recognitionFailedException;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.callback.recognitionFailed(this.runnable, this.strokes, this.e);
            }
        }

        public RecognitionRunnable(int i, HandwritingRecognizer handwritingRecognizer, StrokeList strokeList, Callback callback, Handler handler) {
            this.requestId = i;
            this.strokes = strokeList;
            this.callback = callback;
            this.recognizer = handwritingRecognizer;
            this.handler = handler;
        }

        private void trackRelativeInkSizeInAnalytics() {
            BoundingBox boundingBox = new BoundingBox(this.strokes);
            float writingGuideHeight = this.strokes.getWritingGuideHeight();
            float writingGuideWidth = this.strokes.getWritingGuideWidth();
            float pVar = boundingBox.top();
            if (writingGuideHeight == BitmapDescriptorFactory.HUE_RED) {
                writingGuideHeight = 1.0f;
            }
            float f = pVar / writingGuideHeight;
            float fBottom = boundingBox.bottom() / writingGuideHeight;
            float fLeft = boundingBox.left();
            if (writingGuideWidth == BitmapDescriptorFactory.HUE_RED) {
                writingGuideWidth = 1.0f;
            }
            HandwritingAnalytics.trackInkSize(f, fLeft / writingGuideWidth, fBottom, boundingBox.right() / writingGuideWidth);
        }

        public void cancel() {
            this.canceled = true;
        }

        public boolean isCancelled() {
            return this.canceled;
        }

        @Override // java.lang.Runnable
        public void run() throws NumberFormatException {
            Log.i(ImeHandwritingRecognizer.TAG, "run() with requestID: " + this.requestId);
            if (this.strokes.isEmpty()) {
                Log.i(ImeHandwritingRecognizer.TAG, "Empty strokes");
                this.handler.post(new RecognitionEndedRunnable(this, this, this.strokes, null));
                return;
            }
            if (isCancelled()) {
                Log.i(ImeHandwritingRecognizer.TAG, "Recognition was canceled");
                this.handler.post(new RecognitionEndedRunnable(this, this, this.strokes, null));
                return;
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                RecognitionResult recognitionResultRecognize = this.recognizer.recognize(this.strokes, new RecognitionCancelStruct());
                recognitionResultRecognize.setRequestId(this.requestId);
                recognitionResultRecognize.setStrokes(this.strokes);
                recognitionResultRecognize.setFirstStrokeId(this.strokes.getFirstStrokeId());
                recognitionResultRecognize.setLastStrokeId(this.strokes.getLastStrokeId());
                recognitionResultRecognize.setRecognitionStartedTime(jCurrentTimeMillis);
                recognitionResultRecognize.setRecognitionEndedTime(System.currentTimeMillis());
                ImeUiUtils.filterResultForInputType(recognitionResultRecognize, this.strokes.getInputType());
                boolean z = false;
                int length = recognitionResultRecognize.numResult() > 0 ? recognitionResultRecognize.get(0).word.length() : 0;
                long recognitionEndedTime = recognitionResultRecognize.getRecognitionEndedTime() - recognitionResultRecognize.getRecognitionStartedTime();
                if (recognitionResultRecognize.numResult() > 0 && recognitionResultRecognize.get(0).word.startsWith(" ")) {
                    z = true;
                }
                HandwritingAnalytics.trackRecognition(this.recognizer.getSettings().language, this.strokes.size(), length, (int) recognitionEndedTime, z);
                trackRelativeInkSizeInAnalytics();
                this.handler.post(new RecognitionEndedRunnable(this, this, this.strokes, recognitionResultRecognize));
            } catch (HandwritingRecognizer.RecognitionFailedException e) {
                this.handler.post(new RecognitionFailedRunnable(this, this, this.strokes, e));
            }
        }
    }

    public static class RecognizerUISettings {
        public boolean useBackGesture = false;
        public boolean useSpaceGesture = false;
        public boolean useNewWordGesture = false;
        public float backspaceButtonTapAreaWidth = 0.15f;
        public float backspaceButtonTapAreaHeight = 0.2f;
        public float undoButtonTapAreaWidth = 0.15f;
        public float undoButtonTapAreaHeight = 0.2f;
        public boolean useFlingFromTheLeftGesture = false;
    }

    class SendingFeedbackException extends Exception {
        private static final long serialVersionUID = -6029788982638602275L;
        final Exception e;

        public SendingFeedbackException(ImeHandwritingRecognizer imeHandwritingRecognizer, Exception exc) {
            imeHandwritingRecognizer.getClass();
            this.e = exc;
        }
    }

    public ImeHandwritingRecognizer(RecognizerClient recognizerClient, RecognizerUISettings recognizerUISettings) {
        this.recognitionQueue = new RecognitionRequestQueueHandler(this, Looper.getMainLooper());
        this.runningRecognitionTasks = new HashSet();
        this.strokes = new StrokeList();
        this.writingGuideWidth = 0;
        this.writingGuideHeight = 0;
        this.inputType = 0;
        this.currentStroke = new Stroke();
        this.currentStrokeId = 0;
        this.latestReceivedResponse = -1;
        this.gestureRecognizer = new GestureRecognizer();
        this.feedbackExecutor = Executors.newFixedThreadPool(1);
        this.recognitionExecutor = Executors.newFixedThreadPool(1);
        this.percentFeedback = 10;
        this.passwordMode = false;
        this.imeEventHandler = recognizerClient;
        this.settings = recognizerUISettings;
        this.handler = new Handler();
    }

    private void ensureGestureRecognizerIsSetup() {
        this.gestureRecognizer.setBackspaceGestureEnabled(this.settings.useBackGesture);
        this.gestureRecognizer.setSpaceGestureEnabled(this.settings.useSpaceGesture);
        RecognizerUISettings recognizerUISettings = this.settings;
        String language = getLanguage();
        boolean z = false;
        if (recognizerUISettings.useNewWordGesture && !ImeUiUtils.isRTLLanguage(language) && !ImeUiUtils.isCJKLanguage(language) && !ImeUiUtils.isIndicLanguage(language) && !ImeUiUtils.disableNewWordJustInCase(language) && !this.editingPreviouslyEnteredText) {
            z = true;
        }
        this.gestureRecognizer.setNewWordGestureEnabled(z);
        this.gestureRecognizer.setFlingFromTheLeftGestureEnabled(this.settings.useFlingFromTheLeftGesture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logVi(int i, String str, String str2) {
        HandwritingRecognizer handwritingRecognizer = this.recognizer;
        if (handwritingRecognizer == null || handwritingRecognizer.getSettings() == null || this.recognizer.getSettings().verbosity < i) {
            return;
        }
        Log.i(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int pendingRequests(int i) {
        return this.currentStrokeId - i;
    }

    private void startRecognitionOrSchedule(boolean z) {
        int i = this.currentStrokeId;
        int i2 = this.latestReceivedResponse;
        logVi(2, "HWRImeReco.startRecognitionOrSchedule", "recognition_request_id: " + i + " latestReceivedResponse: " + i2 + " pending: " + (i - i2) + " withAutoSelect: " + z);
        if (this.recognizer == null) {
            this.imeEventHandler.errorMessage(this.currentStrokeId, null, "No recognizer configured. Please go to the settings.");
            return;
        }
        if (this.passwordMode) {
            this.strokes.setPreContext("");
            this.strokes.setPostContext("");
        }
        logVi(2, TAG, "precontext: " + this.strokes.getPreContext() + " postcontext: " + this.strokes.getPostContext());
        logVi(2, TAG, "currentStrokeId: " + this.currentStrokeId + " latestReceivedResponse: " + this.latestReceivedResponse + " maxRequestsInParallel:" + this.recognizer.getSettings().maxRequestsInParallel + " runningRecognitionTasks.size(): " + this.runningRecognitionTasks.size());
        int i3 = this.recognizer.getSettings().maxRequestsInParallel;
        int size = this.runningRecognitionTasks.size();
        StringBuilder sb = new StringBuilder("maxRequestsInParallel: ");
        sb.append(i3);
        sb.append(" runningTasks: ");
        sb.append(size);
        logVi(2, TAG, sb.toString());
        if (this.recognizer.getSettings().maxRequestsInParallel > this.runningRecognitionTasks.size()) {
            logVi(2, TAG, "Only few pending requests: starting");
            startRecognitionTask(this.currentStrokeId, this.strokes, z);
        } else {
            logVi(3, TAG, "More than enough pending requests, scheduling");
            this.recognitionQueue.scheduleDelayedRecognition(z);
        }
    }

    public void askTheRecognizerAgain(boolean z) {
        int i = this.currentStrokeId + 1;
        this.currentStrokeId = i;
        startRecognitionTask(i, this.strokes, z);
    }

    public void cancelAllRunningRecognitionTasks() {
        this.recognitionQueue.cancelRecognitionRequests();
        synchronized (this.runningRecognitionTasks) {
            Iterator<RecognitionRunnable> it = this.runningRecognitionTasks.iterator();
            while (it.hasNext()) {
                logVi(3, TAG, "canceling recognition");
                it.next().cancel();
            }
            this.runningRecognitionTasks.clear();
        }
    }

    public void clear() {
        int i = this.currentStrokeId + 1;
        this.currentStrokeId = i;
        this.latestReceivedResponse = i;
        StrokeList strokeList = new StrokeList();
        this.strokes = strokeList;
        strokeList.setInputType(this.inputType);
        this.strokes.setWritingGuide(this.writingGuideWidth, this.writingGuideHeight);
        this.strokes.setPreContext(this.imeEventHandler.getPreContext());
        this.strokes.setPostContext(this.imeEventHandler.getPostContext());
        this.strokes.setFirstStrokeId(this.currentStrokeId);
        this.strokes.setLastStrokeId(this.currentStrokeId);
        this.currentStroke = new Stroke();
        cancelAllRunningRecognitionTasks();
    }

    public RecognitionRunnable createRecognitionRunnable(StrokeList strokeList, RecognitionRunnable.Callback callback) {
        return new RecognitionRunnable(this.currentStrokeId, this.recognizer, strokeList, callback, this.handler);
    }

    public int getCurrentRequestId() {
        return this.currentStrokeId;
    }

    public Stroke getCurrentStroke() {
        return this.currentStroke;
    }

    public String getLanguage() {
        HandwritingRecognizer handwritingRecognizer = this.recognizer;
        return handwritingRecognizer != null ? handwritingRecognizer.getSettings().language : "not set";
    }

    public int getWritingGuideHeight() {
        return this.writingGuideHeight;
    }

    public int getWritingGuideWidth() {
        return this.writingGuideWidth;
    }

    public void handleException(int i, Exception exc, String str) throws Exception {
        logVi(1, TAG, "Exception while request(" + i + ") " + str);
        try {
            throw exc;
        } catch (ajpq e) {
            this.imeEventHandler.errorMessage(i, e, "No response from server while ".concat(String.valueOf(str)));
        } catch (ajra e2) {
            this.imeEventHandler.errorMessage(i, e2, "");
        } catch (ajqu e3) {
            this.imeEventHandler.errorMessage(i, e3, "Http Client Protocol Exception while ".concat(String.valueOf(str)));
        } catch (ajst e4) {
            this.imeEventHandler.errorMessage(i, e4, "Connection timed out while ".concat(String.valueOf(str)));
        } catch (ajsr e5) {
            this.imeEventHandler.errorMessage(i, e5, "Connection timeout while ".concat(String.valueOf(str)));
        } catch (InterruptedIOException e6) {
            this.imeEventHandler.errorMessage(i, e6, "InterruptedIOException while ".concat(String.valueOf(str)));
        } catch (UnsupportedEncodingException e7) {
            this.imeEventHandler.errorMessage(i, e7, "Unsupported encoding while ".concat(String.valueOf(str)));
        } catch (ClassCastException e8) {
            this.imeEventHandler.errorMessage(i, e8, "Lost authentication while ".concat(String.valueOf(str)));
        } catch (IllegalArgumentException e9) {
            this.imeEventHandler.errorMessage(i, e9, "Illegal argument while ".concat(String.valueOf(str)));
        } catch (SocketException e10) {
            this.imeEventHandler.errorMessage(i, e10, "Socket exception while ".concat(String.valueOf(str)));
        } catch (SocketTimeoutException e11) {
            this.imeEventHandler.errorMessage(i, e11, "Socket timeout while ".concat(String.valueOf(str)));
        } catch (UnknownHostException e12) {
            this.imeEventHandler.errorMessage(i, e12, "Unknown host while ".concat(String.valueOf(str)));
        } catch (JSONException e13) {
            this.imeEventHandler.errorMessage(i, e13, "JSON exception while ".concat(String.valueOf(str)));
        } catch (Exception e14) {
            this.imeEventHandler.errorMessage(i, e14, "Unidentified error while ".concat(String.valueOf(str)));
        }
    }

    public boolean hasPendingRequests() {
        return (this.runningRecognitionTasks.isEmpty() && this.currentStroke.isEmpty()) ? false : true;
    }

    public boolean hasSecondaryRecognizer() {
        HandwritingRecognizer handwritingRecognizer = this.recognizer;
        return handwritingRecognizer != null && handwritingRecognizer.hasSecondaryRecognizer();
    }

    public void initialize() {
        logVi(1, TAG, "INITIALIZE");
        this.imeEventHandler.initializing();
        clear();
        this.imeEventHandler.onInitialized(true);
    }

    public void logFeedback(String str, String str2, RecognitionResult recognitionResult, String str3) {
        HandwritingRecognizer handwritingRecognizer = this.recognizer;
        if (handwritingRecognizer != null) {
            if (handwritingRecognizer.isCloudRecognizer() || Math.random() * 100.0d <= this.percentFeedback) {
                this.feedbackExecutor.submit(new LogFeedbackRunnable(this, str, str2, recognitionResult, str3));
            }
        }
    }

    public void onPenDown(float f, float f2, long j, float f3) {
        this.recognitionQueue.cancelRecognitionRequests();
        this.currentStrokeId++;
        this.currentStroke.addPoint(f, f2, j, f3);
    }

    public void onPenMove(float f, float f2, long j, float f3) {
        this.currentStroke.addPoint(f, f2, j, f3);
    }

    public void onPenUp(float f, float f2, long j, float f3) {
        this.currentStroke.addPoint(f, f2, j, f3);
        this.strokes.add(this.currentStroke);
        this.currentStrokeId++;
        this.currentStroke = new Stroke();
        this.strokes.setLastStrokeId(this.currentStrokeId);
        ensureGestureRecognizerIsSetup();
        GestureRecognizer.Gesture gesture = GestureRecognizer.Gesture.NOT_A_GESTURE;
        int iOrdinal = this.gestureRecognizer.recognizeLastStrokeGesture(this.strokes).ordinal();
        if (iOrdinal == 0) {
            startRecognitionOrSchedule(true);
            return;
        }
        if (iOrdinal == 1) {
            HandwritingAnalytics.backspaceGesture();
            this.imeEventHandler.delete();
            return;
        }
        if (iOrdinal == 2) {
            this.imeEventHandler.space();
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                removeLastStroke();
                return;
            } else {
                if (iOrdinal != 5) {
                    return;
                }
                HandwritingAnalytics.flingLeftGesture();
                this.imeEventHandler.onGoBacktoPreviousRecognition();
                return;
            }
        }
        Stroke stroke = new Stroke(this.strokes.get(r9.size() - 1));
        this.strokes.remove(r9.size() - 1);
        this.imeEventHandler.confirmFirstCandidate();
        this.strokes.add(stroke);
        startRecognitionOrSchedule(true);
    }

    public HandwritingRecognizer recognizer() {
        return this.recognizer;
    }

    public void removeLastStroke() {
        if (this.strokes.isEmpty()) {
            Log.i(TAG, "removeLastStroke() called with empty strokes");
            return;
        }
        this.strokes.remove(r0.size() - 1);
        this.currentStroke = new Stroke();
        this.imeEventHandler.onLastStrokeWasRemoved();
        this.currentStrokeId++;
    }

    public void resetCurrentStroke() {
        this.currentStroke = new Stroke();
    }

    public void setClientName(String str) {
        HandwritingRecognizer handwritingRecognizer = this.recognizer;
        if (handwritingRecognizer == null) {
            return;
        }
        handwritingRecognizer.getSettings().clientName = str;
        if (this.recognizer.hasSecondaryRecognizer()) {
            this.recognizer.getSecondaryRecognizer().getSettings().clientName = String.valueOf(str).concat("_secondary");
        }
    }

    public void setClientVersion(int i) {
        HandwritingRecognizer handwritingRecognizer = this.recognizer;
        if (handwritingRecognizer == null) {
            return;
        }
        handwritingRecognizer.getSettings().clientVersion = i;
        if (this.recognizer.hasSecondaryRecognizer()) {
            this.recognizer.getSecondaryRecognizer().getSettings().clientVersion = i;
        }
    }

    public void setEditingPreviouslyEnteredText(boolean z) {
        this.editingPreviouslyEnteredText = z;
    }

    public void setFeedbackPercent(int i) {
        this.percentFeedback = i;
    }

    public void setInputType(int i) {
        this.inputType = i;
    }

    public void setPasswordMode(boolean z) {
        this.passwordMode = z;
    }

    public void setPostContext(String str) {
        StrokeList strokeList = this.strokes;
        if (strokeList == null || str == null) {
            return;
        }
        strokeList.setPostContext(str);
    }

    public void setPreContext(String str) {
        StrokeList strokeList = this.strokes;
        if (strokeList == null || str == null) {
            return;
        }
        strokeList.setPreContext(str);
    }

    public void setRecognizer(HandwritingRecognizer handwritingRecognizer) {
        this.recognizer = handwritingRecognizer;
        if (handwritingRecognizer == null) {
            return;
        }
        this.recognitionExecutor = Executors.newFixedThreadPool(Math.max(1, handwritingRecognizer.getSettings().maxRequestsInParallel));
    }

    public void setStrokes(StrokeList strokeList) {
        if (strokeList != null) {
            this.strokes = strokeList;
        } else {
            Log.i(TAG, "Ignoring request to set strokes to null");
        }
    }

    public void setVerbosity(int i) {
        HandwritingRecognizer handwritingRecognizer = this.recognizer;
        if (handwritingRecognizer != null) {
            handwritingRecognizer.getSettings().verbosity = i;
            if (this.recognizer.hasSecondaryRecognizer()) {
                this.recognizer.getSecondaryRecognizer().getSettings().verbosity = i;
            }
        }
    }

    public void setWritingGuide(int i, int i2) {
        Log.i(TAG, a.bo(i2, i, "setWritingGuide: ", " "));
        this.writingGuideWidth = i;
        this.writingGuideHeight = i2;
        this.strokes.setWritingGuide(i, i2);
        this.gestureRecognizer.setWritingAreaSize(this.writingGuideWidth, this.writingGuideHeight);
        float f = this.writingGuideWidth;
        RecognizerUISettings recognizerUISettings = this.settings;
        float f2 = 1.0f - recognizerUISettings.undoButtonTapAreaWidth;
        this.gestureRecognizer.setUndoButtonTapArea(BitmapDescriptorFactory.HUE_RED, f2 * f, this.writingGuideHeight * recognizerUISettings.undoButtonTapAreaHeight, f);
        float f3 = this.writingGuideHeight;
        RecognizerUISettings recognizerUISettings2 = this.settings;
        float f4 = 1.0f - recognizerUISettings2.backspaceButtonTapAreaWidth;
        float f5 = this.writingGuideWidth;
        this.gestureRecognizer.setBackspaceButtonTapArea(f4 * f3, (1.0f - recognizerUISettings2.backspaceButtonTapAreaHeight) * f5, f3, f5);
    }

    public void startRecognitionTask(int i, StrokeList strokeList, boolean z) {
        RecognitionRunnable recognitionRunnable = new RecognitionRunnable(i, this.recognizer, strokeList, new RecognitionCallback(this, z), this.handler);
        synchronized (this.runningRecognitionTasks) {
            this.runningRecognitionTasks.add(recognitionRunnable);
        }
        this.recognitionExecutor.submit(recognitionRunnable);
    }

    public StrokeList strokes() {
        return this.strokes;
    }

    public boolean undoLastStrokes() {
        if (this.strokes.isEmpty()) {
            return this.imeEventHandler.onGoBacktoPreviousRecognition();
        }
        removeLastStroke();
        if (this.strokes.isEmpty()) {
            return false;
        }
        startRecognitionOrSchedule(false);
        return true;
    }

    public void askTheRecognizerAgain() {
        askTheRecognizerAgain(true);
    }

    protected class LogFeedbackRunnable implements Runnable {
        private final String additionalDebugInfo;
        private final RecognitionResult recoResult;
        private final String selectedText;
        private final String selectionMode;
        final /* synthetic */ ImeHandwritingRecognizer this$0;

        protected LogFeedbackRunnable(ImeHandwritingRecognizer imeHandwritingRecognizer, String str, String str2, RecognitionResult recognitionResult, String str3) {
            imeHandwritingRecognizer.getClass();
            this.this$0 = imeHandwritingRecognizer;
            this.selectedText = str;
            this.selectionMode = str2;
            this.recoResult = recognitionResult;
            this.additionalDebugInfo = str3;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            LogFeedbackRunnable logFeedbackRunnable;
            String strFeedback;
            RecognitionResult recognitionResult = this.recoResult;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (recognitionResult.getDebugInfo() == null) {
                this.recoResult.setDebugInfo("");
            }
            RecognitionResult recognitionResult2 = this.recoResult;
            recognitionResult2.setDebugInfo(recognitionResult2.getDebugInfo() + " IME:" + (recognitionResult2.getRecognitionEndedTime() - recognitionResult2.getRecognitionStartedTime()));
            RecognitionResult recognitionResult3 = this.recoResult;
            recognitionResult3.setDebugInfo(recognitionResult3.getDebugInfo() + " FB:" + (jCurrentTimeMillis - recognitionResult3.getRecognitionEndedTime()));
            this.this$0.logVi(1, "HWRImeReco.logFeedback", "Starting logging task: src=".concat(String.valueOf(this.selectionMode)));
            this.this$0.logVi(1, "HWRImeReco.logFeedback", "text=".concat(String.valueOf(this.selectedText)));
            this.this$0.logVi(1, "HWRImeReco.logFeedback", "inkHash=".concat(String.valueOf(this.recoResult.getInkHash())));
            if (this.recoResult.getStrokes() != null) {
                this.this$0.logVi(1, "HWRImeReco.logFeedback", "nStrokes=" + this.recoResult.getStrokes().size());
                this.this$0.logVi(1, "HWRImeReco.logFeedback", "preContext=".concat(String.valueOf(this.recoResult.getStrokes().getPreContext())));
                this.this$0.logVi(1, "HWRImeReco.logFeedback", "postContext= ".concat(String.valueOf(this.recoResult.getStrokes().getPostContext())));
            }
            if (!TextUtils.isEmpty(this.additionalDebugInfo)) {
                RecognitionResult recognitionResult4 = this.recoResult;
                String str = this.additionalDebugInfo;
                recognitionResult4.setDebugInfo(recognitionResult4.getDebugInfo() + " " + str);
            }
            if (!TextUtils.isEmpty(this.recoResult.getInkHash())) {
                logFeedbackRunnable = this;
                logFeedbackRunnable.this$0.logVi(1, "HWRImeReco.logFeedback", "logging with hash: ".concat(String.valueOf(logFeedbackRunnable.recoResult.getInkHash())));
                try {
                    strFeedback = logFeedbackRunnable.this$0.recognizer.feedback(logFeedbackRunnable.selectedText, logFeedbackRunnable.recoResult.getInkHash(), logFeedbackRunnable.selectionMode, logFeedbackRunnable.recoResult.getDebugInfo());
                } catch (HandwritingRecognizer.SendingFeedbackFailedException e) {
                    logFeedbackRunnable.this$0.logVi(3, ImeHandwritingRecognizer.TAG, "Feedback sending failed with exception", e);
                    logFeedbackRunnable.afterRunning(false, logFeedbackRunnable.selectedText, logFeedbackRunnable.selectionMode, logFeedbackRunnable.recoResult, logFeedbackRunnable.additionalDebugInfo);
                    return;
                }
            } else {
                if (this.recoResult.getStrokes() == null || this.recoResult.getStrokes().isEmpty()) {
                    this.this$0.logVi(1, "HWRImeReco.logFeedback", "No ink and no hash.");
                    afterRunning(false, this.selectedText, this.selectionMode, this.recoResult, this.additionalDebugInfo);
                    return;
                }
                this.this$0.logVi(1, "HWRImeReco.logFeedback", "logging with ink: " + this.recoResult.getStrokes().size());
                try {
                    strFeedback = this.this$0.recognizer.feedback(this.selectedText, this.recoResult.getStrokes(), this.selectionMode, this.recoResult.getDebugInfo());
                    logFeedbackRunnable = this;
                } catch (HandwritingRecognizer.SendingFeedbackFailedException e2) {
                    this.this$0.logVi(3, ImeHandwritingRecognizer.TAG, "Feedback sending failed with exception", e2);
                    afterRunning(false, this.selectedText, this.selectionMode, this.recoResult, this.additionalDebugInfo);
                    return;
                }
            }
            if (strFeedback == null) {
                logFeedbackRunnable.this$0.logVi(3, ImeHandwritingRecognizer.TAG, "Feedback sending failed with result == null");
                LogFeedbackRunnable logFeedbackRunnable2 = logFeedbackRunnable;
                logFeedbackRunnable2.afterRunning(false, logFeedbackRunnable.selectedText, logFeedbackRunnable.selectionMode, logFeedbackRunnable.recoResult, logFeedbackRunnable2.additionalDebugInfo);
            } else {
                LogFeedbackRunnable logFeedbackRunnable3 = logFeedbackRunnable;
                logFeedbackRunnable3.logResult(strFeedback);
                try {
                    new JSONArray(strFeedback).getJSONArray(1).getJSONArray(0).getString(0);
                } catch (JSONException unused) {
                    logFeedbackRunnable3.this$0.logVi(3, ImeHandwritingRecognizer.TAG, "Error parsing feedback response");
                }
                logFeedbackRunnable3.afterRunning(true, logFeedbackRunnable3.selectedText, logFeedbackRunnable3.selectionMode, logFeedbackRunnable3.recoResult, logFeedbackRunnable3.additionalDebugInfo);
            }
        }

        protected void logResult(String str) {
        }

        public void afterRunning(boolean z, String str, String str2, RecognitionResult recognitionResult, String str3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logVi(int i, String str, String str2, Exception exc) {
        HandwritingRecognizer handwritingRecognizer = this.recognizer;
        if (handwritingRecognizer == null || handwritingRecognizer.getSettings().verbosity < i) {
            return;
        }
        Log.i(str, str2, exc);
    }

    public ImeHandwritingRecognizer(RecognizerClient recognizerClient) {
        this(recognizerClient, new RecognizerUISettings());
    }
}
