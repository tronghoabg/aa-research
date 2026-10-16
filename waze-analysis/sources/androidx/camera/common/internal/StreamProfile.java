package androidx.camera.common.internal;

import android.util.Size;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class StreamProfile {
    public static final Companion Companion = new Companion(null);

    public static final StreamProfile create(int i2, StreamSize streamSize) {
        return Companion.create(i2, streamSize);
    }

    public abstract int getFormat();

    public abstract StreamSize getSize();

    public final Size resolve(DeviceLimits deviceLimits) {
        x.f(deviceLimits, "deviceLimits");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public final boolean satisfies(StreamProfile streamProfile, DeviceLimits deviceLimits) {
        x.f(streamProfile, TypedValues.AttributesType.S_TARGET);
        x.f(deviceLimits, "deviceLimits");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final StreamProfile create(int i2, StreamSize streamSize) {
            x.f(streamSize, "size");
            return new StreamProfileImpl(i2, streamSize);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getFormat$annotations() {
    }
}
