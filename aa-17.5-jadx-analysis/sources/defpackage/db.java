package defpackage;

import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class db {
    public WeakReference c;
    public final IBinder b = new Binder();
    public final MediaBrowser.SubscriptionCallback a = new da(this);

    public void a(String str, List list) {
        throw null;
    }

    public void b(String str) {
    }
}
