package androidx.compose.ui.text.platform;

import kotlinx.coroutines.ab;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DispatcherKt {
    private static final ab FontCacheManagementDispatcher;

    static {
        int i2 = av.f51370a;
        FontCacheManagementDispatcher = ac.f51860a;
    }

    public static final ab getFontCacheManagementDispatcher() {
        return FontCacheManagementDispatcher;
    }
}
