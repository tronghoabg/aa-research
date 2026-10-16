package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sog implements android.content.ServiceConnection {
    final /* synthetic */ defpackage.sok a;
    private final int b;

    public sog(defpackage.sok sokVar, int i) {
        this.a = sokVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        int i;
        int i2;
        defpackage.sok sokVar = this.a;
        if (iBinder != null) {
            synchronized (sokVar.e) {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                sokVar.q = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof defpackage.sph)) ? new defpackage.sph(iBinder) : (defpackage.sph) iInterfaceQueryLocalInterface;
            }
            this.a.A(0, null, this.b);
            return;
        }
        synchronized (sokVar.d) {
            i = sokVar.h;
        }
        if (i == 3) {
            sokVar.m = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        android.os.Handler handler = sokVar.c;
        handler.sendMessage(handler.obtainMessage(i2, sokVar.o.get(), 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        defpackage.sok sokVar = this.a;
        synchronized (sokVar.e) {
            sokVar.q = null;
        }
        defpackage.sok sokVar2 = this.a;
        int i = this.b;
        android.os.Handler handler = sokVar2.c;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
