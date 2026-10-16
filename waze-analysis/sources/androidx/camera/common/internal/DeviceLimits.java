package androidx.camera.common.internal;

import android.util.Size;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class DeviceLimits {
    public static final Companion Companion = new Companion(null);

    public abstract Map<Integer, Size> getMaxOutputSizes();

    public abstract Map<Integer, Size> getMaxOutputSizes16by9();

    public abstract Map<Integer, Size> getMaxOutputSizes4by3();

    public abstract Size getMaxPreviewSize();

    public abstract Size getMaxRecordSize();

    public abstract Map<Integer, Size> getMaxUltraOutputSizes();

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final /* synthetic */ DeviceLimits build(l<? super MutableDeviceLimits, ab> lVar) {
            x.f(lVar, "block");
            MutableDeviceLimits mutableDeviceLimitsCreate = MutableDeviceLimits.Companion.create();
            lVar.invoke(mutableDeviceLimitsCreate);
            return mutableDeviceLimitsCreate.build();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
