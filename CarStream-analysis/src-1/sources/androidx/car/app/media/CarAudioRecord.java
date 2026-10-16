package androidx.car.app.media;

import androidx.car.app.AppManager;
import androidx.car.app.CarContext;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.utils.CommonUtils;
import defpackage.c2;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@RequiresCarApi(5)
/* loaded from: classes.dex */
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

    public CarAudioRecord(CarContext carContext) {
        this.mCarContext = carContext;
    }

    public static CarAudioRecord create(CarContext carContext) {
        Objects.requireNonNull(carContext);
        return createCarAudioRecord(carContext, CommonUtils.isAutomotiveOS(carContext) ? "androidx.car.app.media.AutomotiveCarAudioRecord" : "androidx.car.app.media.ProjectedCarAudioRecord");
    }

    private static CarAudioRecord createCarAudioRecord(CarContext carContext, String str) {
        try {
            return (CarAudioRecord) Class.forName(str).getConstructor(CarContext.class).newInstance(carContext);
        } catch (ReflectiveOperationException unused) {
            throw new IllegalStateException("CarAudioRecord not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecording$0() {
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

    public abstract int readInternal(byte[] bArr, int i, int i2);

    public void startRecording() {
        synchronized (this.mRecordingStateLock) {
            try {
                if (this.mRecordingState != 0) {
                    throw new IllegalStateException("Cannot start recording if it has started and not been stopped");
                }
                OpenMicrophoneResponse openMicrophoneResponseOpenMicrophone = ((AppManager) this.mCarContext.getCarService(AppManager.class)).openMicrophone(new OpenMicrophoneRequest.Builder(new CarAudioCallback() { // from class: b2
                    @Override // androidx.car.app.media.CarAudioCallback
                    public final void onStopRecording() {
                        this.a.lambda$startRecording$0();
                    }
                }).build());
                this.mOpenMicrophoneResponse = openMicrophoneResponseOpenMicrophone;
                if (openMicrophoneResponseOpenMicrophone == null) {
                    this.mOpenMicrophoneResponse = new OpenMicrophoneResponse.Builder(new c2()).build();
                }
                startRecordingInternal(this.mOpenMicrophoneResponse);
                this.mRecordingState = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse);

    public void stopRecording() {
        synchronized (this.mRecordingStateLock) {
            try {
                OpenMicrophoneResponse openMicrophoneResponse = this.mOpenMicrophoneResponse;
                if (openMicrophoneResponse != null) {
                    if (this.mRecordingState != 2) {
                        openMicrophoneResponse.getCarAudioCallback().onStopRecording();
                    }
                    this.mOpenMicrophoneResponse = null;
                }
                stopRecordingInternal();
                this.mRecordingState = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void stopRecordingInternal();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startRecording$1() {
    }
}
