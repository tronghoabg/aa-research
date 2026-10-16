package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.media.ICarAudioCallback;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(CarAudioCallback carAudioCallback) {
        this.mCallback = new CarAudioCallbackStub(carAudioCallback);
    }

    public static CarAudioCallbackDelegate create(CarAudioCallback carAudioCallback) {
        return new CarAudioCallbackDelegate(carAudioCallback);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            Objects.requireNonNull(iCarAudioCallback);
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @CarProtocol
    public static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final CarAudioCallback mCarAudioCallback;

        public CarAudioCallbackStub(CarAudioCallback carAudioCallback) {
            this.mCarAudioCallback = carAudioCallback;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            CarAudioCallback carAudioCallback = this.mCarAudioCallback;
            Objects.requireNonNull(carAudioCallback);
            carAudioCallback.onStopRecording();
        }

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
