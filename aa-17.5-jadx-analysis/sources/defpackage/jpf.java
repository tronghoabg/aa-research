package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class jpf implements jpv {
    public final /* synthetic */ jpw a;
    private final /* synthetic */ int b;

    public /* synthetic */ jpf(jpw jpwVar, int i) {
        this.b = i;
        this.a = jpwVar;
    }

    @Override // defpackage.jpv
    public final void a() throws RemoteException {
        int i = this.b;
        jpw jpwVar = this.a;
        if (i != 0) {
            jpwVar.m().bf();
        } else {
            jpwVar.m().av();
        }
    }
}
