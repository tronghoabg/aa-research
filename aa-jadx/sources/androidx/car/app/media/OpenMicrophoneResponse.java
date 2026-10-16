package androidx.car.app.media;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class OpenMicrophoneResponse {
    private final androidx.car.app.media.CarAudioCallbackDelegate mCarAudioCallbackDelegate;
    private final android.os.ParcelFileDescriptor mCarMicrophoneDescriptor;

    public OpenMicrophoneResponse(defpackage.ss ssVar) {
        this.mCarAudioCallbackDelegate = (androidx.car.app.media.CarAudioCallbackDelegate) ssVar.a;
        this.mCarMicrophoneDescriptor = (android.os.ParcelFileDescriptor) ssVar.b;
    }

    public androidx.car.app.media.CarAudioCallbackDelegate getCarAudioCallback() {
        androidx.car.app.media.CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        carAudioCallbackDelegate.getClass();
        return carAudioCallbackDelegate;
    }

    public java.io.InputStream getCarMicrophoneInputStream() {
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.mCarMicrophoneDescriptor;
        if (parcelFileDescriptor == null) {
            try {
                android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = android.os.ParcelFileDescriptor.createReliablePipe();
                parcelFileDescriptorArrCreateReliablePipe[1].close();
                parcelFileDescriptor = parcelFileDescriptorArrCreateReliablePipe[0];
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
        return new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
    }

    private OpenMicrophoneResponse() {
        this.mCarMicrophoneDescriptor = null;
        this.mCarAudioCallbackDelegate = null;
    }
}
