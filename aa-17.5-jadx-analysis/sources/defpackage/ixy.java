package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
final class ixy implements ServiceConnection {
    public boolean a;
    final /* synthetic */ iya b;
    public qdu c;

    public ixy(iya iyaVar) {
        this.b = iyaVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qdu qduVar;
        ((ype) iya.a.l().ai((char) 1553)).u("PlayStoreServiceConnection onServiceConnected");
        this.a = false;
        if (iBinder == null) {
            qduVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.services.IPlayGearheadService");
            qduVar = iInterfaceQueryLocalInterface instanceof qdu ? (qdu) iInterfaceQueryLocalInterface : new qdu(iBinder);
        }
        this.c = qduVar;
        HandlerThread handlerThread = new HandlerThread("CpvPreCacheThread");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new ire(this.b, 7));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ype) iya.a.l().ai((char) 1554)).u("PlayStoreServiceConnection onServiceConnected");
        this.a = false;
        this.c = null;
    }
}
