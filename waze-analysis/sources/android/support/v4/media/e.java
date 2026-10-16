package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.a.u;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.media.MediaBrowserProtocol;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class e implements c {

    /* renamed from: a, reason: collision with root package name */
    final Context f448a;

    /* renamed from: b, reason: collision with root package name */
    protected final MediaBrowser f449b;

    /* renamed from: c, reason: collision with root package name */
    protected final Bundle f450c;

    /* renamed from: e, reason: collision with root package name */
    protected int f452e;

    /* renamed from: f, reason: collision with root package name */
    protected Messenger f453f;

    /* renamed from: g, reason: collision with root package name */
    protected h f454g;

    /* renamed from: i, reason: collision with root package name */
    private u f456i;

    /* renamed from: d, reason: collision with root package name */
    protected final a f451d = new a(this);

    /* renamed from: h, reason: collision with root package name */
    private final ArrayMap f455h = new ArrayMap();

    e(Context context, ComponentName componentName, d dVar, Bundle bundle) {
        this.f448a = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.f450c = bundle2;
        bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
        bundle2.putInt(MediaBrowserProtocol.EXTRA_CALLING_PID, Process.myPid());
        dVar.setInternalConnectionCallback(this);
        this.f449b = new MediaBrowser(context, componentName, dVar.mConnectionCallbackFwk, bundle2);
    }

    @Override // android.support.v4.media.c
    public final void a() {
        try {
            Bundle extras = this.f449b.getExtras();
            if (extras == null) {
                return;
            }
            this.f452e = extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
            IBinder binder = extras.getBinder(MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
            if (binder != null) {
                this.f454g = new h(binder, this.f450c);
                a aVar = this.f451d;
                Messenger messenger = new Messenger(aVar);
                this.f453f = messenger;
                aVar.a(messenger);
                try {
                    this.f454g.f(this.f448a, this.f453f);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                }
            }
            android.support.v4.media.a.e eVarD = android.support.v4.media.a.d.d(extras.getBinder(MediaBrowserProtocol.EXTRA_SESSION_BINDER));
            if (eVarD != null) {
                this.f456i = u.c(this.f449b.getSessionToken(), eVarD);
            }
        } catch (IllegalStateException e2) {
            Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e2);
        }
    }

    @Override // android.support.v4.media.c
    public final void b() {
        this.f454g = null;
        this.f453f = null;
        this.f456i = null;
        this.f451d.a(null);
    }

    public final u c() {
        u uVar = this.f456i;
        if (uVar != null) {
            return uVar;
        }
        u uVarB = u.b(this.f449b.getSessionToken());
        this.f456i = uVarB;
        return uVarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Messenger messenger, String str, List list, Bundle bundle) {
        if (this.f453f != messenger) {
            return;
        }
        h hVar = (h) this.f455h.get(str);
        if (hVar == null) {
            if (l.f463a) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=".concat(String.valueOf(str)));
                return;
            }
            return;
        }
        k kVarA = hVar.a(bundle);
        if (kVarA == null || bundle != null) {
            return;
        }
        if (list == null) {
            kVarA.a(str);
        } else {
            kVarA.b(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(String str, k kVar) {
        ArrayMap arrayMap = this.f455h;
        h hVar = (h) arrayMap.get(str);
        if (hVar == null) {
            hVar = new h();
            arrayMap.put(str, hVar);
        }
        kVar.f462c = new WeakReference(hVar);
        hVar.e(kVar);
        h hVar2 = this.f454g;
        if (hVar2 == null) {
            this.f449b.subscribe(str, kVar.f460a);
            return;
        }
        try {
            hVar2.h(str, kVar.f461b, this.f453f);
        } catch (RemoteException unused) {
            Log.i("MediaBrowserCompat", "Remote error subscribing media item: ".concat(String.valueOf(str)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(String str) {
        h hVar = (h) this.f455h.get(str);
        if (hVar == null) {
            return;
        }
        h hVar2 = this.f454g;
        if (hVar2 == null) {
            this.f449b.unsubscribe(str);
        } else {
            try {
                hVar2.i(str, this.f453f);
            } catch (RemoteException unused) {
                Log.d("MediaBrowserCompat", "removeSubscription failed with RemoteException parentId=".concat(String.valueOf(str)));
            }
        }
        hVar.d();
        this.f455h.remove(str);
    }
}
