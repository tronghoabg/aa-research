package androidx.core.app;

import androidx.core.util.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface OnPictureInPictureUiStateChangedProvider {
    void addOnPictureInPictureUiStateChangedListener(Consumer<PictureInPictureUiStateCompat> consumer);

    void removeOnPictureInPictureUiStateChangedListener(Consumer<PictureInPictureUiStateCompat> consumer);
}
