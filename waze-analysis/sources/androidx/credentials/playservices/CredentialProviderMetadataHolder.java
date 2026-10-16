package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialProviderMetadataHolder extends Service {
    private final LocalBinder binder = new LocalBinder();

    /* compiled from: WazeSource */
    public final class LocalBinder extends Binder {
        public LocalBinder() {
        }

        public final CredentialProviderMetadataHolder getService() {
            return CredentialProviderMetadataHolder.this;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        return this.binder;
    }
}
