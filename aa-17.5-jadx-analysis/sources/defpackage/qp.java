package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class qp implements xz {
    public final /* synthetic */ qr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qo d;
    private final /* synthetic */ int e;

    public /* synthetic */ qp(qr qrVar, String str, String str2, qo qoVar, int i) {
        this.e = i;
        this.a = qrVar;
        this.b = str;
        this.c = str2;
        this.d = qoVar;
    }

    @Override // defpackage.xz
    public final Object a() throws RemoteException {
        int i = this.e;
        String str = this.b;
        if (i != 0) {
            IInterface iInterfaceA = this.a.a(str);
            if (iInterfaceA == null) {
                Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call ".concat(this.c));
            } else {
                this.d.a(iInterfaceA);
            }
            return null;
        }
        IInterface iInterfaceA2 = this.a.a(str);
        if (iInterfaceA2 != null) {
            return this.d.a(iInterfaceA2);
        }
        Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call ".concat(this.c));
        return null;
    }
}
