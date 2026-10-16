package androidx.camera.viewfinder.core;

import androidx.camera.viewfinder.core.impl.ImplementationModeCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ViewfinderDefaults {
    public static final ViewfinderDefaults INSTANCE = new ViewfinderDefaults();

    private ViewfinderDefaults() {
    }

    public static final ImplementationMode getImplementationMode() {
        return ImplementationModeCompat.Companion.chooseCompatibleMode();
    }

    public static /* synthetic */ void getImplementationMode$annotations() {
    }
}
