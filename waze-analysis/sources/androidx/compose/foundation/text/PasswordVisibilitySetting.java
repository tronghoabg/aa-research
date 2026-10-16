package androidx.compose.foundation.text;

import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PasswordVisibilitySetting {
    Runnable registerObserver(a<ab> aVar);

    boolean shouldShowPhysicalInput();

    boolean shouldShowTouchInput();
}
