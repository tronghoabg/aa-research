package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class Api33Impl {
    private Api33Impl() {
    }

    static <T> T getParcelable(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}
