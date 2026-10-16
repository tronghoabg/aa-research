package defpackage;

import android.content.Context;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class may implements tgr {
    private final /* synthetic */ int a;

    public /* synthetic */ may(int i) {
        this.a = i;
    }

    @Override // defpackage.tgr
    public final Object a() {
        switch (this.a) {
            case 0:
                return new maz(mki.a.c);
            case 1:
                return new Random();
            case 2:
                return new mcb();
            case 3:
                return new mcd();
            case 4:
                return new mjf();
            case 5:
                Context context = mki.a.c;
                return new mjr();
            case 6:
                return new mjv();
            case 7:
                return new mlq();
            case 8:
                return new mme();
            case 9:
                return new mod();
            case 10:
                return new mos();
            case 11:
                return new moz();
            case 12:
                return new mpp();
            case 13:
                return new nrc();
            case 14:
                return new nri();
            case 15:
                nrq nrqVar = new nrq(lbh.d());
                nrqVar.b.fE(nrqVar.a, new mmt(nrqVar, 18));
                return nrqVar;
            case 16:
                return new nrx();
            case 17:
                return new nto(mki.a.c);
            case 18:
                return new nvn(mki.a.c);
            case 19:
                return new nvp();
            default:
                return new nyl();
        }
    }
}
