package androidx.window.layout.adapter.sidecar;

/* JADX INFO: loaded from: classes2.dex */
public final class SidecarCompat$TranslatingCallback implements androidx.window.sidecar.SidecarInterface.SidecarCallback {
    final /* synthetic */ defpackage.fiu a;

    public SidecarCompat$TranslatingCallback(defpackage.fiu fiuVar) {
        this.a = fiuVar;
    }

    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        android.view.Window window;
        android.view.WindowManager.LayoutParams attributes;
        sidecarDeviceState.getClass();
        defpackage.fiu fiuVar = this.a;
        for (android.app.Activity activity : fiuVar.c.values()) {
            android.os.IBinder iBinder = null;
            if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                iBinder = attributes.token;
            }
            if (iBinder != null) {
                androidx.window.sidecar.SidecarInterface sidecarInterface = fiuVar.a;
            }
            defpackage.fib fibVar = fiuVar.d;
        }
    }

    public void onWindowLayoutChanged(android.os.IBinder iBinder, androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        iBinder.getClass();
        sidecarWindowLayoutInfo.getClass();
        defpackage.fiu fiuVar = this.a;
        if (((android.app.Activity) fiuVar.c.get(iBinder)) == null) {
            android.util.Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
            return;
        }
        defpackage.fit fitVar = fiuVar.b;
        androidx.window.sidecar.SidecarInterface sidecarInterface = fiuVar.a;
        new androidx.window.sidecar.SidecarDeviceState();
        throw null;
    }
}
