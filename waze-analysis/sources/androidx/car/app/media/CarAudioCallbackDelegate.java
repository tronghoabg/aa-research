package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.media.ICarAudioCallback;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(CarAudioCallback carAudioCallback) {
        this.mCallback = new CarAudioCallbackStub(carAudioCallback);
    }

    static CarAudioCallbackDelegate create(CarAudioCallback carAudioCallback) {
        return new CarAudioCallbackDelegate(carAudioCallback);
    }

    public void onStopRecording() {
        try {
            ((ICarAudioCallback) Objects.requireNonNull(this.mCallback)).onStopRecording();
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* compiled from: WazeSource */
    @CarProtocol
    class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final CarAudioCallback mCarAudioCallback;

        CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            ((CarAudioCallback) Objects.requireNonNull(this.mCarAudioCallback)).onStopRecording();
        }

        CarAudioCallbackStub(CarAudioCallback carAudioCallback) {
            this.mCarAudioCallback = carAudioCallback;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
