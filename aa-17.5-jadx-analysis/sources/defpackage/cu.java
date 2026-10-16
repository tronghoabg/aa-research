package defpackage;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

/* loaded from: classes2.dex */
final class cu extends MediaBrowser.ConnectionCallback {
    final /* synthetic */ cv a;

    public cu(cv cvVar) {
        this.a = cvVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        di dgVar;
        cv cvVar = this.a;
        cw cwVar = cvVar.b;
        if (cwVar != null) {
            try {
                Bundle extras = cwVar.b.getExtras();
                if (extras != null) {
                    cwVar.f = extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        cwVar.i = new rz(binder, cwVar.c);
                        ct ctVar = cwVar.d;
                        cwVar.g = new Messenger(ctVar);
                        ctVar.a(cwVar.g);
                        try {
                            rz rzVar = cwVar.i;
                            Context context = cwVar.a;
                            Messenger messenger = cwVar.g;
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) rzVar.a);
                            rzVar.h(6, bundle, messenger);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    if (binder2 == null) {
                        dgVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        dgVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof di)) ? new dg(binder2) : (di) iInterfaceQueryLocalInterface;
                    }
                    if (dgVar != null) {
                        cwVar.h = MediaSessionCompat.Token.b(cwVar.b.getSessionToken(), dgVar);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
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
        cv cvVar = this.a;
        cw cwVar = cvVar.b;
        if (cwVar != null) {
            cwVar.i = null;
            cwVar.g = null;
            cwVar.h = null;
            cwVar.d.a(null);
        }
        cvVar.c();
    }
}
