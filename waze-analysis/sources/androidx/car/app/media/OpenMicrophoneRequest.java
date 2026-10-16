package androidx.car.app.media;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class OpenMicrophoneRequest {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

    /* compiled from: WazeSource */
    public final class Builder {
        final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

        public Builder(CarAudioCallback carAudioCallback) {
            this.mCarAudioCallbackDelegate = CarAudioCallbackDelegate.create((CarAudioCallback) Objects.requireNonNull(carAudioCallback));
        }

        public OpenMicrophoneRequest build() {
            return new OpenMicrophoneRequest(this);
        }
    }

    OpenMicrophoneRequest(Builder builder) {
        this.mCarAudioCallbackDelegate = builder.mCarAudioCallbackDelegate;
    }

    public CarAudioCallbackDelegate getCarAudioCallbackDelegate() {
        return (CarAudioCallbackDelegate) Objects.requireNonNull(this.mCarAudioCallbackDelegate);
    }

    private OpenMicrophoneRequest() {
        this.mCarAudioCallbackDelegate = null;
    }
}
