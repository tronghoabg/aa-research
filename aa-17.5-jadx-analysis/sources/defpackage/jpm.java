package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final /* synthetic */ class jpm implements jpv {
    public final /* synthetic */ jpw a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ jpm(jpw jpwVar, boolean z, int i) {
        this.c = i;
        this.a = jpwVar;
        this.b = z;
    }

    @Override // defpackage.jpv
    public final void a() throws RemoteException {
        int i = this.c;
        if (i == 0) {
            this.a.m().aT(this.b);
            return;
        }
        jpw jpwVar = this.a;
        if (i != 1) {
            jpwVar.m().aZ(this.b);
        } else {
            jpwVar.m().aY(this.b);
        }
    }
}
