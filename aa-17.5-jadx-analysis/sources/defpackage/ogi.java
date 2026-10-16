package defpackage;

import android.os.RemoteException;
import android.telecom.Call;

/* loaded from: classes2.dex */
public final /* synthetic */ class ogi implements ogo {
    public final /* synthetic */ Call a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ogi(ogj ogjVar, Call call, Call call2, int i) {
        this.d = i;
        this.b = ogjVar;
        this.a = call;
        this.c = call2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ogo
    public final void a(ogs ogsVar) throws RemoteException {
        int i = this.d;
        if (i == 0) {
            ogc ogcVar = ((ogj) this.b).a.b;
            ogsVar.n(ogcVar.c(this.a), ogcVar.c((Call) this.c));
            return;
        }
        if (i == 1) {
            ogsVar.p(((ogj) this.c).a.b.c(this.a), (String) this.b);
            return;
        }
        if (i == 2) {
            ogsVar.i(((ogj) this.c).a.b.c(this.a), this.b);
            return;
        }
        Object obj = this.c;
        if (i != 3) {
            ogc ogcVar2 = ((ogj) obj).a.b;
            ogsVar.k(ogcVar2.c(this.a), ogcVar2.d(this.b));
            return;
        }
        ogc ogcVar3 = ((ogj) obj).a.b;
        ogsVar.j(ogcVar3.c(this.a), ogcVar3.d(this.b));
    }

    public /* synthetic */ ogi(ogj ogjVar, Call call, Object obj, int i) {
        this.d = i;
        this.c = ogjVar;
        this.a = call;
        this.b = obj;
    }
}
