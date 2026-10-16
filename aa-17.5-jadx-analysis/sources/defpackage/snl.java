package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class snl implements ServiceConnection {
    final /* synthetic */ snp a;
    private final int b;

    public snl(snp snpVar, int i) {
        this.a = snpVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        snp snpVar = this.a;
        if (iBinder != null) {
            synchronized (snpVar.e) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                snpVar.q = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof som)) ? new som(iBinder) : (som) iInterfaceQueryLocalInterface;
            }
            this.a.A(0, null, this.b);
            return;
        }
        synchronized (snpVar.d) {
            i = snpVar.h;
        }
        if (i == 3) {
            snpVar.m = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = snpVar.c;
        handler.sendMessage(handler.obtainMessage(i2, snpVar.o.get(), 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        snp snpVar = this.a;
        synchronized (snpVar.e) {
            snpVar.q = null;
        }
        snp snpVar2 = this.a;
        int i = this.b;
        Handler handler = snpVar2.c;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
