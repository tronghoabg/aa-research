package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TestTagKt {
    public static final Modifier testTag(Modifier modifier, String str) {
        return modifier.then(new TestTagElement(str));
    }
}
