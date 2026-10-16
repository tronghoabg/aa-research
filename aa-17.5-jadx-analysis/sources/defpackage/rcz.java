package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class rcz implements rdn {
    public final /* synthetic */ rdj a;
    private final /* synthetic */ int b;

    public /* synthetic */ rcz(rdj rdjVar, int i) {
        this.b = i;
        this.a = rdjVar;
    }

    @Override // defpackage.rdn
    public final Object a() throws RemoteException {
        switch (this.b) {
            case 0:
                rdj rdjVar = this.a;
                return new rjg(rdjVar.C().P(), rdjVar.c);
            case 1:
                rdj rdjVar2 = this.a;
                return new rog(rdjVar2.C().F(), rdjVar2.c);
            case 2:
                rdj rdjVar3 = this.a;
                roe roeVar = new roe(rdjVar3.C().E(), rdjVar3.c);
                roeVar.a.c(roeVar.d);
                return roeVar;
            case 3:
                return new rhj(this.a.C().N());
            case 4:
                rdj rdjVar4 = this.a;
                return new qrh(rdjVar4.C().B(), (qxp) rox.f(new rcl(rdjVar4, 11)));
            case 5:
                rdj rdjVar5 = this.a;
                qvr qvrVarA = rdjVar5.C().A();
                qvrVarA.getClass();
                return new roa(qvrVarA, rdjVar5.c);
            case 6:
                rdj rdjVar6 = this.a;
                return new qrx((qwq) rox.f(new rcl(rdjVar6, 12)), rdjVar6.C().D(), rdjVar6.c);
            case 7:
                return new rfe(this.a.C().z());
            case 8:
                rdj rdjVar7 = this.a;
                return new qsb(rdjVar7.C().I(), rdjVar7.c);
            case 9:
                return new rnx(this.a.C().z());
            default:
                rka rkaVarR = this.a.C().R();
                rkaVarR.getClass();
                return new rjs(rkaVarR);
        }
    }
}
