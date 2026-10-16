package androidx.car.app.media;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class CarAudioCallbackDelegate {
    private final androidx.car.app.media.ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(defpackage.so soVar) {
        this.mCallback = new androidx.car.app.media.CarAudioCallbackDelegate.CarAudioCallbackStub(soVar);
    }

    public static androidx.car.app.media.CarAudioCallbackDelegate create(defpackage.so soVar) {
        return new androidx.car.app.media.CarAudioCallbackDelegate(soVar);
    }

    public void onStopRecording() {
        try {
            androidx.car.app.media.ICarAudioCallback iCarAudioCallback = this.mCallback;
            iCarAudioCallback.getClass();
            iCarAudioCallback.onStopRecording();
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @defpackage.rg
    private static class CarAudioCallbackStub extends androidx.car.app.media.ICarAudioCallback.Stub {
        private final defpackage.so mCarAudioCallback;

        CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            defpackage.so soVar = this.mCarAudioCallback;
            soVar.getClass();
            soVar.a();
        }

        public CarAudioCallbackStub(defpackage.so soVar) {
            this.mCarAudioCallback = soVar;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
