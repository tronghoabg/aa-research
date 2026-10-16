package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

/* loaded from: classes2.dex */
final class etq implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ erb e;
    final /* synthetic */ ajmd f;

    public etq(ajmd ajmdVar, erb erbVar, String str, int i, int i2, Bundle bundle) {
        this.f = ajmdVar;
        this.e = erbVar;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        ett ettVar = (ett) this.f.a;
        yw ywVar = ettVar.c;
        erb erbVar = this.e;
        IBinder iBinderG = erbVar.G();
        ywVar.remove(iBinderG);
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        etg etgVar = new etg(ettVar, str, i, i2, erbVar);
        etgVar.e = ettVar.a(str, i2, this.d);
        if (etgVar.e == null) {
            Log.i("MBServiceCompat", "No root for client " + str + " from service " + getClass().getName());
            try {
                erbVar.H(2, null);
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(this.a));
                return;
            }
        }
        try {
            Object obj = this.f.a;
            ((ett) obj).c.put(iBinderG, etgVar);
            iBinderG.linkToDeath(etgVar, 0);
            MediaSessionCompat.Token token = ((ett) obj).e;
            if (token != null) {
                erb erbVar2 = this.e;
                etf etfVar = etgVar.e;
                Object obj2 = etfVar.a;
                Object bundle = etfVar.b;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                ((Bundle) bundle).putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", (String) obj2);
                bundle2.putParcelable("data_media_session_token", token);
                bundle2.putBundle("data_root_hints", (Bundle) bundle);
                erbVar2.H(1, bundle2);
            }
        } catch (RemoteException unused2) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(this.a));
            ((ett) this.f.a).c.remove(iBinderG);
        }
    }
}
