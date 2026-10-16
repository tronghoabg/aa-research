package androidx.core.app;

import android.app.PictureInPictureUiState;
import android.os.Build;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PictureInPictureUiStateCompat {
    public static final Companion Companion = new Companion(null);
    private final boolean isStashed;
    private final boolean isTransitioningToPip;

    public PictureInPictureUiStateCompat(boolean z, boolean z2) {
        this.isStashed = z;
        this.isTransitioningToPip = z2;
    }

    public static final PictureInPictureUiStateCompat fromPictureInPictureUiState(PictureInPictureUiState pictureInPictureUiState) {
        return Companion.fromPictureInPictureUiState(pictureInPictureUiState);
    }

    public final boolean isStashed() {
        return this.isStashed;
    }

    public final boolean isTransitioningToPip() {
        return this.isTransitioningToPip;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final PictureInPictureUiStateCompat fromPictureInPictureUiState(PictureInPictureUiState pictureInPictureUiState) {
            x.f(pictureInPictureUiState, "uiState");
            return Build.VERSION.SDK_INT >= 35 ? new PictureInPictureUiStateCompat(pictureInPictureUiState.isStashed(), pictureInPictureUiState.isTransitioningToPip()) : Build.VERSION.SDK_INT >= 31 ? new PictureInPictureUiStateCompat(pictureInPictureUiState.isStashed(), false) : new PictureInPictureUiStateCompat(false, false);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
