package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class rcl implements rzd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rcl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, qup] */
    @Override // defpackage.rzd, java.util.concurrent.Callable
    public final Object call() throws RemoteException {
        int i = 1;
        switch (this.b) {
            case 0:
                rdj rdjVar = (rdj) this.a;
                return (rfe) rdjVar.g.b(rfe.class, new rcz(rdjVar, 7));
            case 1:
                return ((ima) this.a).y().z();
            case 2:
                rdj rdjVar2 = (rdj) this.a;
                return (qsb) rdjVar2.g.b(qsb.class, new rcz(rdjVar2, 8));
            case 3:
                zhc zhcVar = new zhc();
                ((rdj) this.a).C().aq(new rdh(zhcVar));
                return zhcVar;
            case 4:
                return Integer.valueOf(((rdj) this.a).C().h());
            case 5:
                return Boolean.valueOf(((rdj) this.a).C().bo());
            case 6:
                rdj rdjVar3 = (rdj) this.a;
                return (rog) rdjVar3.g.b(rog.class, new rcz(rdjVar3, i));
            case 7:
                rdj rdjVar4 = (rdj) this.a;
                return (rog) rdjVar4.g.b(rog.class, new rcz(rdjVar4, i));
            case 8:
                rdj rdjVar5 = (rdj) this.a;
                return (roe) rdjVar5.g.b(roe.class, new rcz(rdjVar5, 2));
            case 9:
                return Boolean.valueOf(this.a.bs());
            case 10:
                rdj rdjVar6 = (rdj) this.a;
                return (qrx) rdjVar6.g.b(qrx.class, new rcz(rdjVar6, 6));
            case 11:
                return ((rdj) this.a).C().G();
            case 12:
                return ((rdj) this.a).C().bC();
            case 13:
                return ((rdj) this.a).C().r();
            case 14:
                return new erb(((rdj) this.a).C().M());
            case 15:
                rdj rdjVar7 = (rdj) this.a;
                if (rdjVar7.p(raj.R)) {
                    return (rhj) rdjVar7.g.b(rhj.class, new rcz(rdjVar7, 3));
                }
                throw new IllegalStateException("This API can only be used if the hero car media feature is enabled");
            case 16:
                rdj rdjVar8 = (rdj) this.a;
                return (roa) rdjVar8.g.b(roa.class, new rcz(rdjVar8, 5));
            case 17:
                rdj rdjVar9 = (rdj) this.a;
                return (qrh) rdjVar9.g.b(qrh.class, new rcz(rdjVar9, 4));
            case 18:
                return Integer.valueOf(((rdj) this.a).C().gg());
            case 19:
                rdj rdjVar10 = (rdj) this.a;
                return (rjg) rdjVar10.g.b(rjg.class, new rcz(rdjVar10, 0));
            default:
                rdj rdjVar11 = (rdj) this.a;
                return (rnx) rdjVar11.g.b(rnx.class, new rcz(rdjVar11, 9));
        }
    }
}
