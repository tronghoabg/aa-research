package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.dsr;
import defpackage.fim;
import defpackage.fin;

/* loaded from: classes2.dex */
public final class SidecarCompat$TranslatingCallback implements SidecarInterface.SidecarCallback {
    final /* synthetic */ fin a;

    public SidecarCompat$TranslatingCallback(fin finVar) {
        this.a = finVar;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        Window window;
        WindowManager.LayoutParams attributes;
        sidecarDeviceState.getClass();
        fin finVar = this.a;
        for (Activity activity : finVar.c.values()) {
            IBinder iBinder = null;
            if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                iBinder = attributes.token;
            }
            if (iBinder != null) {
                SidecarInterface sidecarInterface = finVar.a;
            }
            dsr dsrVar = finVar.d;
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        iBinder.getClass();
        sidecarWindowLayoutInfo.getClass();
        fin finVar = this.a;
        if (((Activity) finVar.c.get(iBinder)) == null) {
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
            return;
        }
        fim fimVar = finVar.b;
        SidecarInterface sidecarInterface = finVar.a;
        new SidecarDeviceState();
        throw null;
    }
}
