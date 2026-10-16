package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.camera2.internal.IntrinsicZoomCalculator;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.FrameMetadata;
import h.c.e;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface UseTorchAsFlash {
    boolean shouldDisableAePrecapture();

    Object shouldUseTorchAsFlash(l<? super e<? super FrameMetadata>, ? extends Object> lVar, e<? super Boolean> eVar);

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public static final Companion Companion = new Companion(null);

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final UseTorchAsFlash provideUseTorchAsFlash(CameraQuirks cameraQuirks, CameraDevices cameraDevices, IntrinsicZoomCalculator intrinsicZoomCalculator) {
                x.f(cameraQuirks, "cameraQuirks");
                x.f(cameraDevices, "cameraDevices");
                x.f(intrinsicZoomCalculator, "intrinsicZoomCalculator");
                return cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class) ? new UseTorchAsFlashImpl(cameraQuirks, cameraDevices, intrinsicZoomCalculator) : NotUseTorchAsFlash.INSTANCE;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }
}
