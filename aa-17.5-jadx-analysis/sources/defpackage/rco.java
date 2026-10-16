package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class rco implements ree {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rco(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ree
    public final Object a() throws RemoteException {
        switch (this.b) {
            case 0:
                return new qux(((rdj) this.a).C());
            case 1:
                return new quu(((rdj) this.a).C());
            case 2:
                return new qur(((rdj) this.a).C());
            case 3:
                return new rpf(((rdj) this.a).C());
            case 4:
                qym qymVar = new qym(null);
                ((sgk) ((rdx) this.a).e).b().n(qymVar);
                return qymVar;
            case 5:
                rkc rkcVar = new rkc(null);
                ((sgk) ((rdx) this.a).e).b().k(rkcVar);
                return rkcVar;
            case 6:
                rkf rkfVar = new rkf(null);
                ((sgk) ((rdx) this.a).e).b().l(rkfVar);
                return rkfVar;
            default:
                rko rkoVar = new rko(null);
                ((sgk) ((rdx) this.a).e).b().m(rkoVar);
                return rkoVar;
        }
    }
}
