package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class rdv implements ref {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rdv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, rck] */
    @Override // defpackage.ref
    public final void a(Object obj) throws RemoteException {
        switch (this.b) {
            case 0:
                ((rkc) obj).b((sgk) this.a);
                break;
            case 1:
                ((rpf) obj).b((wyd) this.a);
                break;
            case 2:
                ((qym) obj).b(this.a);
                break;
            case 3:
                qym qymVar = (qym) obj;
                ((sgk) ((rdx) this.a).e).b().s(qymVar);
                qymVar.a();
                break;
            case 4:
                rkc rkcVar = (rkc) obj;
                ((sgk) ((rdx) this.a).e).b().p(rkcVar);
                rkcVar.a();
                break;
            case 5:
                rkf rkfVar = (rkf) obj;
                ((sgk) ((rdx) this.a).e).b().q(rkfVar);
                rkfVar.a();
                break;
            case 6:
                rko rkoVar = (rko) obj;
                ((sgk) ((rdx) this.a).e).b().r(rkoVar);
                rkoVar.a();
                break;
            default:
                ((rkf) obj).b((sgk) this.a);
                break;
        }
    }
}
