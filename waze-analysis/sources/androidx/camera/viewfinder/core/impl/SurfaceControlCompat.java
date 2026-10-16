package androidx.camera.viewfinder.core.impl;

import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import androidx.autofill.HintConstants;
import h.a.i;
import h.g.b.x;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface SurfaceControlCompat {
    public static final Companion Companion = Companion.$$INSTANCE;

    void detach();

    Surface newSurface();

    void release();

    boolean reparent(SurfaceControlCompat surfaceControlCompat);

    void setBufferSize(int i2, int i3);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.viewfinder.core.impl.SurfaceControlCompat$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static SurfaceControlCompat create(SurfaceView surfaceView, int i2, int i3, int i4, String str) {
            return SurfaceControlCompat.Companion.create(surfaceView, i2, i3, i4, str);
        }

        public static SurfaceControlCompat wrap(SurfaceView surfaceView) {
            return SurfaceControlCompat.Companion.wrap(surfaceView);
        }

        public static SurfaceControlCompat create(SurfaceControlCompat surfaceControlCompat, int i2, int i3, String str) {
            return SurfaceControlCompat.Companion.create(surfaceControlCompat, i2, i3, str);
        }
    }

    /* compiled from: WazeSource */
    final class SurfaceControlStub implements SurfaceControlCompat {
        public static final SurfaceControlStub INSTANCE = new SurfaceControlStub();

        private SurfaceControlStub() {
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public Surface newSurface() {
            return null;
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public boolean reparent(SurfaceControlCompat surfaceControlCompat) {
            x.f(surfaceControlCompat, "newParent");
            return false;
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public void detach() {
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public void release() {
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public void setBufferSize(int i2, int i3) {
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final SurfaceControlCompat create(SurfaceView surfaceView, int i2, int i3, int i4, String str) {
            x.f(surfaceView, "parent");
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            return new SurfaceControlApi29Impl(surfaceView, i2, i3, i4, str);
        }

        public final SurfaceControlCompat wrap(SurfaceView surfaceView) {
            x.f(surfaceView, "surfaceView");
            SurfaceControl surfaceControl = surfaceView.getSurfaceControl();
            x.e(surfaceControl, "getSurfaceControl(...)");
            return new SurfaceControlApi29Impl(surfaceControl);
        }

        public final SurfaceControlCompat create(SurfaceControlCompat surfaceControlCompat, int i2, int i3, String str) {
            x.f(surfaceControlCompat, "parent");
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            return new SurfaceControlApi29Impl(surfaceControlCompat, i2, i3, str);
        }
    }

    /* compiled from: WazeSource */
    final class SurfaceControlApi29Impl implements SurfaceControlCompat {
        private final SurfaceControl surfaceControl;

        /* JADX WARN: Illegal instructions before constructor call */
        public SurfaceControlApi29Impl(SurfaceView surfaceView, int i2, int i3, int i4, String str) throws IOException {
            x.f(surfaceView, "parent");
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            SurfaceControl surfaceControlBuild = new SurfaceControl.Builder().setName(str).setFormat(i2).setBufferSize(i3, i4).setParent(surfaceView.getSurfaceControl()).build();
            x.e(surfaceControlBuild, "build(...)");
            this(surfaceControlBuild);
            initializeNewSurfaceControl();
        }

        private final void initializeNewSurfaceControl() throws IOException {
            SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
            try {
                transaction.setVisibility(this.surfaceControl, true).apply();
                i.aW(transaction, null);
            } finally {
            }
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public void detach() throws IOException {
            SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
            try {
                transaction.reparent(this.surfaceControl, null).apply();
                i.aW(transaction, null);
            } finally {
            }
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public Surface newSurface() {
            return new Surface(this.surfaceControl);
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public void release() {
            this.surfaceControl.release();
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public boolean reparent(SurfaceControlCompat surfaceControlCompat) throws IOException {
            x.f(surfaceControlCompat, "newParent");
            if (!this.surfaceControl.isValid()) {
                return false;
            }
            SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
            try {
                transaction.reparent(this.surfaceControl, ((SurfaceControlApi29Impl) surfaceControlCompat).surfaceControl).apply();
                i.aW(transaction, null);
                return true;
            } finally {
            }
        }

        @Override // androidx.camera.viewfinder.core.impl.SurfaceControlCompat
        public void setBufferSize(int i2, int i3) throws IOException {
            SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
            try {
                transaction.setBufferSize(this.surfaceControl, i2, i3).apply();
                i.aW(transaction, null);
            } finally {
            }
        }

        public SurfaceControlApi29Impl(SurfaceControl surfaceControl) {
            x.f(surfaceControl, "surfaceControl");
            this.surfaceControl = surfaceControl;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SurfaceControlApi29Impl(SurfaceControlCompat surfaceControlCompat, int i2, int i3, String str) throws IOException {
            x.f(surfaceControlCompat, "parent");
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            SurfaceControl surfaceControlBuild = new SurfaceControl.Builder().setName(str).setBufferSize(i2, i3).setParent(((SurfaceControlApi29Impl) surfaceControlCompat).surfaceControl).build();
            x.e(surfaceControlBuild, "build(...)");
            this(surfaceControlBuild);
            initializeNewSurfaceControl();
        }
    }
}
