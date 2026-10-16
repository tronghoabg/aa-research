package androidx.camera.camera2.pipe;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TorchState {
    public static final Companion Companion = new Companion(null);
    private static final TorchState ON = new TorchState();
    private static final TorchState OFF = new TorchState();

    private TorchState() {
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TorchState getOFF() {
            return TorchState.OFF;
        }

        public final TorchState getON() {
            return TorchState.ON;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
