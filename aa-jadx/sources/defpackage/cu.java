package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class cu extends android.media.browse.MediaBrowser.ConnectionCallback {
    final /* synthetic */ defpackage.cv a;

    public cu(defpackage.cv cvVar) {
        this.a = cvVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        defpackage.di dgVar;
        defpackage.cv cvVar = this.a;
        defpackage.cw cwVar = cvVar.b;
        if (cwVar != null) {
            try {
                android.os.Bundle extras = cwVar.b.getExtras();
                if (extras != null) {
                    cwVar.f = extras.getInt("extra_service_version", 0);
                    android.os.IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        cwVar.i = new defpackage.se(binder, cwVar.c);
                        defpackage.ct ctVar = cwVar.d;
                        cwVar.g = new android.os.Messenger(ctVar);
                        ctVar.a(cwVar.g);
                        try {
                            defpackage.se seVar = cwVar.i;
                            android.content.Context context = cwVar.a;
                            android.os.Messenger messenger = cwVar.g;
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", android.os.Process.myPid());
                            bundle.putBundle("data_root_hints", (android.os.Bundle) seVar.a);
                            seVar.h(6, bundle, messenger);
                        } catch (android.os.RemoteException unused) {
                            android.util.Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    android.os.IBinder binder2 = extras.getBinder("extra_session_binder");
                    if (binder2 == null) {
                        dgVar = null;
                    } else {
                        android.os.IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        dgVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof defpackage.di)) ? new defpackage.dg(binder2) : (defpackage.di) iInterfaceQueryLocalInterface;
                    }
                    if (dgVar != null) {
                        cwVar.h = android.support.v4.media.session.MediaSessionCompat.Token.b(cwVar.b.getSessionToken(), dgVar);
                    }
                }
            } catch (java.lang.IllegalStateException e) {
                android.util.Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        cvVar.a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        this.a.b();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        defpackage.cv cvVar = this.a;
        defpackage.cw cwVar = cvVar.b;
        if (cwVar != null) {
            cwVar.i = null;
            cwVar.g = null;
            cwVar.h = null;
            cwVar.d.a(null);
        }
        cvVar.c();
    }
}
