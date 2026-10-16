package androidx.car.app.media;

import android.os.ParcelFileDescriptor;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class OpenMicrophoneResponse {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;
    private final ParcelFileDescriptor mCarMicrophoneDescriptor;

    /* compiled from: WazeSource */
    public final class Builder {
        final CarAudioCallbackDelegate mCarAudioCallbackDelegate;
        ParcelFileDescriptor mCarMicrophoneDescriptor;

        public Builder(CarAudioCallback carAudioCallback) {
            this.mCarAudioCallbackDelegate = CarAudioCallbackDelegate.create((CarAudioCallback) Objects.requireNonNull(carAudioCallback));
        }

        public OpenMicrophoneResponse build() {
            return new OpenMicrophoneResponse(this);
        }

        public Builder setCarMicrophoneDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
            this.mCarMicrophoneDescriptor = (ParcelFileDescriptor) Objects.requireNonNull(parcelFileDescriptor);
            return this;
        }
    }

    OpenMicrophoneResponse(Builder builder) {
        this.mCarAudioCallbackDelegate = builder.mCarAudioCallbackDelegate;
        this.mCarMicrophoneDescriptor = builder.mCarMicrophoneDescriptor;
    }

    public CarAudioCallbackDelegate getCarAudioCallback() {
        return (CarAudioCallbackDelegate) Objects.requireNonNull(this.mCarAudioCallbackDelegate);
    }

    public InputStream getCarMicrophoneInputStream() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.mCarMicrophoneDescriptor;
        if (parcelFileDescriptor == null) {
            try {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = ParcelFileDescriptor.createReliablePipe();
                parcelFileDescriptorArrCreateReliablePipe[1].close();
                parcelFileDescriptor = parcelFileDescriptorArrCreateReliablePipe[0];
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
    }

    private OpenMicrophoneResponse() {
        this.mCarMicrophoneDescriptor = null;
        this.mCarAudioCallbackDelegate = null;
    }
}
