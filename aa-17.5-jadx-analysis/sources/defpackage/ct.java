package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ct extends Handler {
    private final WeakReference a;
    private WeakReference b;

    public ct(cw cwVar) {
        this.a = new WeakReference(cwVar);
    }

    final void a(Messenger messenger) {
        this.b = new WeakReference(messenger);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        db dbVar;
        WeakReference weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        MediaSessionCompat.c(data);
        cw cwVar = (cw) weakReference2.get();
        Messenger messenger = (Messenger) this.b.get();
        try {
            int i = message.what;
            if (i == 1) {
                MediaSessionCompat.c(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                    return;
                }
                Bundle bundle = data.getBundle("data_options");
                MediaSessionCompat.c(bundle);
                MediaSessionCompat.c(data.getBundle("data_notify_children_changed_options"));
                String string = data.getString("data_media_item_id");
                ArrayList parcelableArrayList = data.getParcelableArrayList("data_media_item_list");
                if (cwVar.g == messenger) {
                    rz rzVar = (rz) cwVar.e.get(string);
                    if (rzVar == null) {
                        if (MediaBrowserCompat.a) {
                            Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=".concat(String.valueOf(string)));
                            return;
                        }
                        return;
                    }
                    int i2 = 0;
                    while (true) {
                        ?? r5 = rzVar.b;
                        if (i2 >= r5.size()) {
                            dbVar = null;
                            break;
                        } else {
                            if (ebc.c((Bundle) r5.get(i2), bundle)) {
                                dbVar = (db) rzVar.a.get(i2);
                                break;
                            }
                            i2++;
                        }
                    }
                    if (dbVar == null || bundle != null) {
                        return;
                    }
                    if (parcelableArrayList == null) {
                        dbVar.b(string);
                    } else {
                        dbVar.a(string, parcelableArrayList);
                    }
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            int i3 = message.what;
        }
    }
}
