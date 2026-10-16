package androidx.media3.common;

import android.view.SurfaceView;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: androidx.media3.common.DebugViewProvider$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int i2, int i3) {
            return null;
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.common.DebugViewProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ SurfaceView lambda$static$0(int i2, int i3) {
            return null;
        }
    }

    SurfaceView getDebugPreviewSurfaceView(int i2, int i3);
}
