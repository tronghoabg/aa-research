package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final /* synthetic */ class rxd implements rxe {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rxd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rxe
    public final void a(ContentProviderClient contentProviderClient) throws RemoteException {
        if (this.b != 0) {
            int i = ((yxo) this.a).r;
            ypf ypfVar = rxf.a;
            contentProviderClient.delete(rxj.a, "detector_type", new String[]{String.valueOf(i)});
        } else {
            ypf ypfVar2 = rxf.a;
            contentProviderClient.update(rxj.a, (ContentValues) this.a, null, null);
        }
    }
}
