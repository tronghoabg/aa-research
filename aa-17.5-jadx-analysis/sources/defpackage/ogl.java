package defpackage;

import android.net.Uri;
import android.os.RemoteException;
import android.telecom.Call;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
public final /* synthetic */ class ogl implements ogo {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ogl(CarCall carCall, String str, int i) {
        this.c = i;
        this.a = carCall;
        this.b = str;
    }

    @Override // defpackage.ogo
    public final void a(ogs ogsVar) throws RemoteException {
        int i = this.c;
        if (i == 0) {
            ogsVar.l((CarCall) this.a, (String) this.b);
        } else if (i != 1) {
            ogsVar.r((CarCall) this.b, (Uri) this.a);
        } else {
            ogsVar.g(((ogj) this.b).a.b.c((Call) this.a));
        }
    }

    public /* synthetic */ ogl(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
