package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import androidx.window.layout.WindowLayoutInfo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface ExtensionInterfaceCompat {

    /* compiled from: WazeSource */
    public interface ExtensionCallbackInterface {
        void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo);
    }

    void onWindowLayoutChangeListenerAdded(Activity activity);

    void onWindowLayoutChangeListenerRemoved(Activity activity);

    void setExtensionCallback(ExtensionCallbackInterface extensionCallbackInterface);

    boolean validateExtensionInterface();
}
