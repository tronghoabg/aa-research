package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes.dex */
public class llu<C> {
    public Object b;

    public llu(lmc lmcVar, int i) {
        this.b = new MediaBrowserCompat.MediaItem((MediaDescriptionCompat) lmcVar.b, i);
    }

    protected static yfq g(List list, Function function) {
        if (list == null) {
            int i = yfq.d;
            return yls.a;
        }
        Stream map = Collection.EL.stream(list).filter(new kxo(6)).map(function);
        int i2 = yfq.d;
        return (yfq) map.collect(ycm.a);
    }

    public final void A() {
        lmb.S(new kyl(this, 10), "stop");
    }

    public final lmc B() {
        lmc lmcVar = new lmc(((dc) this.b).a());
        woy.aa(!TextUtils.isEmpty(lmcVar.i()), "media ID must be set to a non-empty value");
        return lmcVar;
    }

    public final void C(CharSequence charSequence) {
        ((dc) this.b).d = charSequence;
    }

    public final void D(Bundle bundle) {
        ((dc) this.b).g = bundle;
    }

    public final void E(Bitmap bitmap) {
        ((dc) this.b).e = bitmap;
    }

    public final void F(Uri uri) {
        ((dc) this.b).f = uri;
    }

    public final void G(String str) {
        ((dc) this.b).a = str;
    }

    public final void H(CharSequence charSequence) {
        ((dc) this.b).c = charSequence;
    }

    public final void I(CharSequence charSequence) {
        ((dc) this.b).b = charSequence;
    }

    public final long J() {
        return ((MediaSessionCompat.QueueItem) this.b).b;
    }

    public final AaPlaybackState K() {
        return new AaPlaybackState(((eb) this.b).a());
    }

    public llu L() {
        cw cwVar = ((MediaBrowserCompat) this.b).b;
        if (cwVar.h == null) {
            cwVar.h = MediaSessionCompat.Token.b(cwVar.b.getSessionToken(), null);
        }
        return new llu(cwVar.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final void M(String str, llu lluVar) {
        MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) this.b;
        db dbVar = (db) lluVar.b;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (dbVar == null) {
            throw new IllegalArgumentException("callback is null");
        }
        cw cwVar = mediaBrowserCompat.b;
        cx cxVar = (cx) cwVar;
        if (cxVar.i == null || cxVar.f < 2) {
            cxVar.b.subscribe(str, dbVar.a);
            return;
        }
        yw ywVar = cwVar.e;
        rz rzVar = (rz) ywVar.get(str);
        if (rzVar == null) {
            rzVar = new rz((char[]) null);
            ywVar.put(str, rzVar);
        }
        dbVar.c = new WeakReference(rzVar);
        int i = 0;
        while (true) {
            ?? r3 = rzVar.b;
            if (i >= r3.size()) {
                rzVar.a.add(dbVar);
                r3.add(null);
                break;
            } else {
                if (ebc.c((Bundle) r3.get(i), null)) {
                    rzVar.a.set(i, dbVar);
                    break;
                }
                i++;
            }
        }
        rz rzVar2 = cwVar.i;
        if (rzVar2 == null) {
            cwVar.b.subscribe(str, dbVar.a);
            return;
        }
        try {
            IBinder iBinder = dbVar.b;
            Messenger messenger = cwVar.g;
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putBinder("data_callback_token", iBinder);
            bundle.putBundle("data_options", null);
            rzVar2.h(3, bundle, messenger);
        } catch (RemoteException unused) {
            Log.i("MediaBrowserCompat", "Remote error subscribing media item: ".concat(String.valueOf(str)));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof llu) {
            return Objects.equals(this.b, ((llu) obj).b);
        }
        return false;
    }

    public lmc h() {
        return new lmc(((MediaBrowserCompat.MediaItem) this.b).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public String i() {
        return ((MediaBrowserCompat.MediaItem) this.b).a();
    }

    public final boolean j() {
        return (((MediaBrowserCompat.MediaItem) this.b).a & 1) != 0;
    }

    public final boolean k() {
        return (((MediaBrowserCompat.MediaItem) this.b).a & 2) != 0;
    }

    public Bundle n() {
        return (Bundle) new ntn(((MediaBrowserCompat) this.b).b.b.getExtras()).i(Bundle.EMPTY);
    }

    public final String o() {
        return ((MediaBrowserCompat) this.b).b.b.getRoot();
    }

    public final void p() {
        MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) this.b;
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        mediaBrowserCompat.b.b.connect();
    }

    public final void q() {
        Messenger messenger;
        cw cwVar = ((MediaBrowserCompat) this.b).b;
        rz rzVar = cwVar.i;
        if (rzVar != null && (messenger = cwVar.g) != null) {
            try {
                rzVar.h(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        cwVar.b.disconnect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public final void r(String str) {
        MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) this.b;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        cw cwVar = mediaBrowserCompat.b;
        cx cxVar = (cx) cwVar;
        if (cxVar.i == null || cxVar.f < 2) {
            cxVar.b.unsubscribe(str);
            return;
        }
        rz rzVar = (rz) cwVar.e.get(str);
        if (rzVar == null) {
            return;
        }
        rz rzVar2 = cwVar.i;
        if (rzVar2 == null) {
            cwVar.b.unsubscribe(str);
        } else {
            try {
                Messenger messenger = cwVar.g;
                Bundle bundle = new Bundle();
                bundle.putString("data_media_item_id", str);
                bundle.putBinder("data_callback_token", null);
                rzVar2.h(4, bundle, messenger);
            } catch (RemoteException unused) {
                Log.d("MediaBrowserCompat", "removeSubscription failed with RemoteException parentId=".concat(String.valueOf(str)));
            }
        }
        rzVar.a.isEmpty();
        cwVar.e.remove(str);
    }

    public final boolean s() {
        return ((MediaBrowserCompat) this.b).b.a();
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    public final int x() {
        return ((dn) this.b).a;
    }

    public final void y() {
        lmb.S(new kyl(this, 13), "pause");
    }

    public final void z(String str, Bundle bundle) {
        lmb.S(new jda((Object) this, (Object) str, (Object) bundle, 13, (short[]) null), "playFromSearch");
    }

    public llu(Object obj) {
        this.b = obj;
    }

    public llu(char[] cArr) {
        this.b = new lls(this);
    }

    public llu(short[] sArr) {
        this.b = new dc();
    }

    public llu() {
    }

    public llu(byte[] bArr) {
        this.b = new llr(this);
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void w() {
    }

    public llu(float[] fArr) {
        this.b = new llt(this);
    }

    public llu(int[] iArr) {
        this.b = new llz(this);
    }

    public llu(boolean[] zArr) {
        this.b = new kmu();
    }

    public llu(Context context, ComponentName componentName, llu lluVar, Bundle bundle) {
        this.b = new MediaBrowserCompat(context, componentName, (cv) lluVar.b, bundle);
    }

    public llu(byte[][] bArr) {
        this.b = new eb();
    }

    public void N(llu lluVar) {
    }

    public void d(AaPlaybackState aaPlaybackState) {
    }

    public void f(String str) {
    }

    public void t(Bundle bundle) {
    }

    public void u(lmd lmdVar) {
    }

    public void v(yfq yfqVar) {
    }

    public void e(String str, yfq yfqVar) {
    }

    public void l(String str, Bundle bundle) {
    }

    public void m(String str, Bundle bundle, yfq yfqVar) {
    }
}
