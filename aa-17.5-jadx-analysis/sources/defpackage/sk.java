package defpackage;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.AppManager;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* loaded from: classes2.dex */
public abstract class sk {
    public static final int AUDIO_CONTENT_BUFFER_SIZE = 512;
    public static final String AUDIO_CONTENT_MIME = "audio/l16";
    public static final int AUDIO_CONTENT_SAMPLING_RATE = 16000;
    private static final int RECORDSTATE_RECORDING = 1;
    private static final int RECORDSTATE_REMOTE_CLOSED = 2;
    private static final int RECORDSTATE_STOPPED = 0;
    private final qn mCarContext;
    private OpenMicrophoneResponse mOpenMicrophoneResponse;
    private int mRecordingState = 0;
    private final Object mRecordingStateLock = new Object();

    protected sk(qn qnVar) {
        this.mCarContext = qnVar;
    }

    public static sk create(qn qnVar) {
        qnVar.getClass();
        return createCarAudioRecord(qnVar, true != qnVar.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "androidx.car.app.media.ProjectedCarAudioRecord" : "androidx.car.app.media.AutomotiveCarAudioRecord");
    }

    private static sk createCarAudioRecord(qn qnVar, String str) {
        try {
            return (sk) Class.forName(str).getConstructor(qn.class).newInstance(qnVar);
        } catch (ReflectiveOperationException unused) {
            throw new IllegalStateException("CarAudioRecord not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }

    /* renamed from: lambda$startRecording$0$androidx-car-app-media-CarAudioRecord, reason: not valid java name */
    public /* synthetic */ void m417lambda$startRecording$0$androidxcarappmediaCarAudioRecord() {
        synchronized (this.mRecordingStateLock) {
            this.mRecordingState = 2;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        synchronized (this.mRecordingStateLock) {
            int i3 = this.mRecordingState;
            if (i3 == 0) {
                throw new IllegalStateException("Called read before calling startRecording or after calling stopRecording");
            }
            if (i3 != 2) {
                return readInternal(bArr, i, i2);
            }
            return -1;
        }
    }

    protected abstract int readInternal(byte[] bArr, int i, int i2);

    public void startRecording() {
        OpenMicrophoneResponse openMicrophoneResponse;
        synchronized (this.mRecordingStateLock) {
            if (this.mRecordingState != 0) {
                throw new IllegalStateException("Cannot start recording if it has started and not been stopped");
            }
            try {
                openMicrophoneResponse = (OpenMicrophoneResponse) ((AppManager) this.mCarContext.a(AppManager.class)).c.b(CloudRecognizerProtocolStrings.APP, "openMicrophone", new ps(new OpenMicrophoneRequest(new sm((sj) new gds(this, 1))), 1));
            } catch (RemoteException e) {
                Log.e("CarApp", "Error getting microphone bytes from host", e);
                openMicrophoneResponse = null;
            }
            this.mOpenMicrophoneResponse = openMicrophoneResponse;
            if (openMicrophoneResponse == null) {
                Log.e("CarApp", "Did not get microphone input from host");
                OpenMicrophoneResponse openMicrophoneResponse2 = new OpenMicrophoneResponse(new sn(new hhv(1)));
                this.mOpenMicrophoneResponse = openMicrophoneResponse2;
                openMicrophoneResponse = openMicrophoneResponse2;
            }
            startRecordingInternal(openMicrophoneResponse);
            this.mRecordingState = 1;
        }
    }

    protected abstract void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse);

    public void stopRecording() {
        synchronized (this.mRecordingStateLock) {
            OpenMicrophoneResponse openMicrophoneResponse = this.mOpenMicrophoneResponse;
            if (openMicrophoneResponse != null) {
                if (this.mRecordingState != 2) {
                    openMicrophoneResponse.getCarAudioCallback().onStopRecording();
                }
                this.mOpenMicrophoneResponse = null;
            }
            stopRecordingInternal();
            this.mRecordingState = 0;
        }
    }

    protected abstract void stopRecordingInternal();

    static /* synthetic */ void lambda$startRecording$1() {
    }
}
