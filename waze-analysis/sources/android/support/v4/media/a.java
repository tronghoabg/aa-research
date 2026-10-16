package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.a.v;
import android.util.Log;
import androidx.media.MediaBrowserProtocol;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f391a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f392b;

    a(e eVar) {
        this.f391a = new WeakReference(eVar);
    }

    final void a(Messenger messenger) {
        this.f392b = new WeakReference(messenger);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f392b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f391a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        v.b(data);
        e eVar = (e) weakReference2.get();
        Messenger messenger = (Messenger) this.f392b.get();
        try {
            int i2 = message.what;
            if (i2 == 1) {
                v.b(data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS));
                data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                    v.b(bundle);
                    v.b(data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS));
                    eVar.d(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle);
                    return;
                }
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            int i3 = message.what;
        }
    }
}
