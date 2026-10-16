package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.a.u;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f463a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: b, reason: collision with root package name */
    private final e f464b;

    public l(Context context, ComponentName componentName, d dVar, Bundle bundle) {
        this.f464b = new g(context, componentName, dVar, bundle);
    }

    public final u a() {
        return this.f464b.c();
    }

    public final String b() {
        return this.f464b.f449b.getRoot();
    }

    public final void c() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f464b.f449b.connect();
    }

    public final void d() {
        Messenger messenger;
        e eVar = this.f464b;
        h hVar = eVar.f454g;
        if (hVar != null && (messenger = eVar.f453f) != null) {
            try {
                hVar.g(messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        eVar.f449b.disconnect();
    }

    public final void e(String str, k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.f464b.e(str, kVar);
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.f464b.f(str);
    }
}
