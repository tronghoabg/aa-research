package androidx.car.app.media;

import android.content.Context;
import android.util.Log;
import androidx.car.app.AppManager;
import androidx.car.app.CarContext;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.utils.CommonUtils;
import androidx.car.app.utils.LogTags;
import j$.util.Objects;

/* compiled from: WazeSource */
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public abstract class CarAudioRecord {
    public static final int AUDIO_CONTENT_BUFFER_SIZE = 512;
    public static final String AUDIO_CONTENT_MIME = "audio/l16";
    public static final int AUDIO_CONTENT_SAMPLING_RATE = 16000;
    private static final int RECORDSTATE_RECORDING = 1;
    private static final int RECORDSTATE_REMOTE_CLOSED = 2;
    private static final int RECORDSTATE_STOPPED = 0;
    private final CarContext mCarContext;
    private OpenMicrophoneResponse mOpenMicrophoneResponse;
    private int mRecordingState = 0;
    private final Object mRecordingStateLock = new Object();

    protected CarAudioRecord(CarContext carContext) {
        this.mCarContext = carContext;
    }

    public static CarAudioRecord create(CarContext carContext) {
        return createCarAudioRecord(carContext, true != CommonUtils.isAutomotiveOS((Context) Objects.requireNonNull(carContext)) ? "androidx.car.app.media.ProjectedCarAudioRecord" : "androidx.car.app.media.AutomotiveCarAudioRecord");
    }

    private static CarAudioRecord createCarAudioRecord(CarContext carContext, String str) {
        try {
            return (CarAudioRecord) Class.forName(str).getConstructor(CarContext.class).newInstance(carContext);
        } catch (ReflectiveOperationException unused) {
            throw new IllegalStateException("CarAudioRecord not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }

    /* renamed from: lambda$startRecording$0$androidx-car-app-media-CarAudioRecord, reason: not valid java name */
    /* synthetic */ void m1622lambda$startRecording$0$androidxcarappmediaCarAudioRecord() {
        synchronized (this.mRecordingStateLock) {
            this.mRecordingState = 2;
        }
    }

    public int read(byte[] bArr, int i2, int i3) {
        synchronized (this.mRecordingStateLock) {
            int i4 = this.mRecordingState;
            if (i4 == 0) {
                throw new IllegalStateException("Called read before calling startRecording or after calling stopRecording");
            }
            if (i4 != 2) {
                return readInternal(bArr, i2, i3);
            }
            return -1;
        }
    }

    protected abstract int readInternal(byte[] bArr, int i2, int i3);

    public void startRecording() {
        synchronized (this.mRecordingStateLock) {
            if (this.mRecordingState != 0) {
                throw new IllegalStateException("Cannot start recording if it has started and not been stopped");
            }
            OpenMicrophoneResponse openMicrophoneResponseOpenMicrophone = ((AppManager) this.mCarContext.getCarService(AppManager.class)).openMicrophone(new OpenMicrophoneRequest.Builder(new CarAudioCallback() { // from class: androidx.car.app.media.CarAudioRecord$$ExternalSyntheticLambda0
                @Override // androidx.car.app.media.CarAudioCallback
                public final void onStopRecording() {
                    this.f$0.m1622lambda$startRecording$0$androidxcarappmediaCarAudioRecord();
                }
            }).build());
            this.mOpenMicrophoneResponse = openMicrophoneResponseOpenMicrophone;
            if (openMicrophoneResponseOpenMicrophone == null) {
                Log.e(LogTags.TAG, "Did not get microphone input from host");
                openMicrophoneResponseOpenMicrophone = new OpenMicrophoneResponse.Builder(new CarAudioCallback() { // from class: androidx.car.app.media.CarAudioRecord$$ExternalSyntheticLambda1
                    @Override // androidx.car.app.media.CarAudioCallback
                    public final void onStopRecording() {
                    }
                }).build();
                this.mOpenMicrophoneResponse = openMicrophoneResponseOpenMicrophone;
            }
            startRecordingInternal(openMicrophoneResponseOpenMicrophone);
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
