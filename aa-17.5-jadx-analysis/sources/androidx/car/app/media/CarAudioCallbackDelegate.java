package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.media.ICarAudioCallback;
import defpackage.rb;
import defpackage.sj;

@rb
/* loaded from: classes2.dex */
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(sj sjVar) {
        this.mCallback = new CarAudioCallbackStub(sjVar);
    }

    public static CarAudioCallbackDelegate create(sj sjVar) {
        return new CarAudioCallbackDelegate(sjVar);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            iCarAudioCallback.getClass();
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @rb
    private static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final sj mCarAudioCallback;

        CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            sj sjVar = this.mCarAudioCallback;
            sjVar.getClass();
            sjVar.a();
        }

        public CarAudioCallbackStub(sj sjVar) {
            this.mCarAudioCallback = sjVar;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
