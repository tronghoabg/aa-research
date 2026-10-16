package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes5.dex */
public interface e {
    void dispose();

    View getView();

    void onFlutterViewAttached(View view);

    void onFlutterViewDetached();

    void onInputConnectionLocked();

    void onInputConnectionUnlocked();
}
