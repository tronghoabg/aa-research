package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    WeakReference f462c;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f461b = new Binder();

    /* renamed from: a, reason: collision with root package name */
    final MediaBrowser.SubscriptionCallback f460a = new j(this);

    public void a(String str) {
        throw null;
    }

    public void b(List list) {
    }
}
