package androidx.compose.runtime;

import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ReusableLinkRememberObserverHolder extends LinkRememberObserverHolder implements ReusableRememberObserverHolder {
    public static final int $stable = 8;

    public ReusableLinkRememberObserverHolder(RememberObserver rememberObserver, LinkAnchor linkAnchor) {
        super(rememberObserver, linkAnchor);
    }
}
