package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class rij {
    public final rox a = new rox(new rcn(6));
    public final rim b;
    public final lah c;
    public final lah d;

    public rij(rim rimVar) throws RemoteException {
        this.b = rimVar;
        final int i = 1;
        this.c = new lah(new ree() { // from class: rih
            @Override // defpackage.ree
            public final Object a() {
                return i != 0 ? new riu(null) : new rio(null);
            }
        }, new rcv(this, 4));
        final int i2 = 0;
        this.d = new lah(new ree() { // from class: rih
            @Override // defpackage.ree
            public final Object a() {
                return i2 != 0 ? new riu(null) : new rio(null);
            }
        }, new rcv(this, 5));
    }
}
