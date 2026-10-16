package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class lma<C> {
    public java.lang.Object b;

    public lma(lmj lmjVar, int i) {
        this.b = new android.support.v4.media.MediaBrowserCompat.MediaItem((android.support.v4.media.MediaDescriptionCompat) lmjVar.b, i);
    }

    protected static defpackage.ygw g(java.util.List list, java.util.function.Function function) {
        if (list == null) {
            int i = defpackage.ygw.d;
            return defpackage.ymx.a;
        }
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(list).filter(new defpackage.kqi(7)).map(function);
        int i2 = defpackage.ygw.d;
        return (defpackage.ygw) map.collect(defpackage.yds.a);
    }

    public final void A() {
        lmi.S(new defpackage.kmp(this, 19), "stop");
    }

    public final lmj B() {
        lmj lmjVar = new lmj(((dc) this.b).a());
        defpackage.ysr.bk(!android.text.TextUtils.isEmpty(lmjVar.i()), "media ID must be set to a non-empty value");
        return lmjVar;
    }

    public final void C(java.lang.CharSequence charSequence) {
        ((dc) this.b).d = charSequence;
    }

    public final void D(android.os.Bundle bundle) {
        ((dc) this.b).g = bundle;
    }

    public final void E(android.graphics.Bitmap bitmap) {
        ((dc) this.b).e = bitmap;
    }

    public final void F(android.net.Uri uri) {
        ((dc) this.b).f = uri;
    }

    public final void G(java.lang.String str) {
        ((dc) this.b).a = str;
    }

    public final void H(java.lang.CharSequence charSequence) {
        ((dc) this.b).c = charSequence;
    }

    public final void I(java.lang.CharSequence charSequence) {
        ((dc) this.b).b = charSequence;
    }

    public final long J() {
        return ((android.support.v4.media.session.MediaSessionCompat.QueueItem) this.b).b;
    }

    public final com.google.android.apps.auto.components.media.compat.AaPlaybackState K() {
        return new com.google.android.apps.auto.components.media.compat.AaPlaybackState(((defpackage.eb) this.b).a());
    }

    public defpackage.lma L() {
        cw cwVar = ((android.support.v4.media.MediaBrowserCompat) this.b).b;
        if (cwVar.h == null) {
            cwVar.h = android.support.v4.media.session.MediaSessionCompat.Token.b(cwVar.b.getSessionToken(), (di) null);
        }
        return new defpackage.lma(cwVar.h);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final void M(java.lang.String str, defpackage.lma lmaVar) {
        android.support.v4.media.MediaBrowserCompat mediaBrowserCompat = (android.support.v4.media.MediaBrowserCompat) this.b;
        db dbVar = (db) lmaVar.b;
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("parentId is empty");
        }
        if (dbVar == null) {
            throw new java.lang.IllegalArgumentException("callback is null");
        }
        cx cxVar = mediaBrowserCompat.b;
        cx cxVar2 = cxVar;
        if (cxVar2.i == null || cxVar2.f < 2) {
            cxVar2.b.subscribe(str, dbVar.a);
            return;
        }
        defpackage.zd zdVar = ((cw) cxVar).e;
        se seVar = (se) zdVar.get(str);
        if (seVar == null) {
            seVar = new se((char[]) null);
            zdVar.put(str, seVar);
        }
        dbVar.c = new java.lang.ref.WeakReference(seVar);
        int i = 0;
        while (true) {
            ?? r3 = seVar.b;
            if (i >= r3.size()) {
                seVar.a.add(dbVar);
                r3.add(null);
                break;
            } else {
                if (defpackage.ebp.n((android.os.Bundle) r3.get(i), null)) {
                    seVar.a.set(i, dbVar);
                    break;
                }
                i++;
            }
        }
        se seVar2 = ((cw) cxVar).i;
        if (seVar2 == null) {
            ((cw) cxVar).b.subscribe(str, dbVar.a);
            return;
        }
        try {
            android.os.IBinder iBinder = dbVar.b;
            android.os.Messenger messenger = ((cw) cxVar).g;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putBinder("data_callback_token", iBinder);
            bundle.putBundle("data_options", null);
            seVar2.h(3, bundle, messenger);
        } catch (android.os.RemoteException unused) {
            android.util.Log.i("MediaBrowserCompat", "Remote error subscribing media item: ".concat(java.lang.String.valueOf(str)));
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.lma) {
            return j$.util.Objects.equals(this.b, ((defpackage.lma) obj).b);
        }
        return false;
    }

    public lmj h() {
        return new lmj(((android.support.v4.media.MediaBrowserCompat.MediaItem) this.b).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public java.lang.String i() {
        return ((android.support.v4.media.MediaBrowserCompat.MediaItem) this.b).a();
    }

    public final boolean j() {
        return (((android.support.v4.media.MediaBrowserCompat.MediaItem) this.b).a & 1) != 0;
    }

    public final boolean k() {
        return (((android.support.v4.media.MediaBrowserCompat.MediaItem) this.b).a & 2) != 0;
    }

    public android.os.Bundle n() {
        return (android.os.Bundle) new defpackage.nub(((android.support.v4.media.MediaBrowserCompat) this.b).b.b.getExtras()).i(android.os.Bundle.EMPTY);
    }

    public final java.lang.String o() {
        return ((android.support.v4.media.MediaBrowserCompat) this.b).b.b.getRoot();
    }

    public final void p() {
        android.support.v4.media.MediaBrowserCompat mediaBrowserCompat = (android.support.v4.media.MediaBrowserCompat) this.b;
        android.util.Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        mediaBrowserCompat.b.b.connect();
    }

    public final void q() {
        android.os.Messenger messenger;
        cw cwVar = ((android.support.v4.media.MediaBrowserCompat) this.b).b;
        se seVar = cwVar.i;
        if (seVar != null && (messenger = cwVar.g) != null) {
            try {
                seVar.h(7, (android.os.Bundle) null, messenger);
            } catch (android.os.RemoteException unused) {
                android.util.Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        cwVar.b.disconnect();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public final void r(java.lang.String str) {
        android.support.v4.media.MediaBrowserCompat mediaBrowserCompat = (android.support.v4.media.MediaBrowserCompat) this.b;
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("parentId is empty");
        }
        cx cxVar = mediaBrowserCompat.b;
        cx cxVar2 = cxVar;
        if (cxVar2.i == null || cxVar2.f < 2) {
            cxVar2.b.unsubscribe(str);
            return;
        }
        se seVar = (se) ((cw) cxVar).e.get(str);
        if (seVar == null) {
            return;
        }
        se seVar2 = ((cw) cxVar).i;
        if (seVar2 == null) {
            ((cw) cxVar).b.unsubscribe(str);
        } else {
            try {
                android.os.Messenger messenger = ((cw) cxVar).g;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("data_media_item_id", str);
                bundle.putBinder("data_callback_token", null);
                seVar2.h(4, bundle, messenger);
            } catch (android.os.RemoteException unused) {
                android.util.Log.d("MediaBrowserCompat", "removeSubscription failed with RemoteException parentId=".concat(java.lang.String.valueOf(str)));
            }
        }
        seVar.a.isEmpty();
        ((cw) cxVar).e.remove(str);
    }

    public final boolean s() {
        return ((android.support.v4.media.MediaBrowserCompat) this.b).b.a();
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.b);
    }

    public final int x() {
        return ((dn) this.b).a;
    }

    public final void y() {
        lmi.S(new defpackage.lmh(this, 0), "pause");
    }

    public final void z(java.lang.String str, android.os.Bundle bundle) {
        lmi.S(new defpackage.jdh(this, str, bundle, 14, (short[]) null), "playFromSearch");
    }

    public lma(java.lang.Object obj) {
        this.b = obj;
    }

    public lma(char[] cArr) {
        this.b = new lly(this);
    }

    public lma(short[] sArr) {
        this.b = new dc();
    }

    public lma() {
    }

    public lma(byte[] bArr) {
        this.b = new llx(this);
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void w() {
    }

    public lma(float[] fArr) {
        this.b = new llz(this);
    }

    public lma(int[] iArr) {
        this.b = new lmf(this);
    }

    public lma(boolean[] zArr) {
        this.b = new defpackage.knb();
    }

    public lma(android.content.Context context, android.content.ComponentName componentName, defpackage.lma lmaVar, android.os.Bundle bundle) {
        this.b = new android.support.v4.media.MediaBrowserCompat(context, componentName, (cv) lmaVar.b, bundle);
    }

    public lma(byte[][] bArr) {
        this.b = new defpackage.eb();
    }

    public void N(defpackage.lma lmaVar) {
    }

    public void d(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState) {
    }

    public void f(java.lang.String str) {
    }

    public void t(android.os.Bundle bundle) {
    }

    public void u(defpackage.lmk lmkVar) {
    }

    public void v(defpackage.ygw ygwVar) {
    }

    public void e(java.lang.String str, defpackage.ygw ygwVar) {
    }

    public void l(java.lang.String str, android.os.Bundle bundle) {
    }

    public void m(java.lang.String str, android.os.Bundle bundle, defpackage.ygw ygwVar) {
    }
}
