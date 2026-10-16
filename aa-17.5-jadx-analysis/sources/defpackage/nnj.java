package defpackage;

import android.os.PowerManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class nnj implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ nnj(int i) {
        this.a = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return afak.a;
            case 1:
                nnl nnlVar = nnl.a;
                return afak.a;
            case 2:
                yph yphVar = nnu.a;
                boolean z = false;
                if (((mkq) mki.a.i(mkq.class)).a().g("key_settings_show_rail_widget", false)) {
                    yph yphVar2 = nsr.a;
                    if (((nsr) mki.a.i(nsr.class)).b().L()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                return new nva(null);
            case 4:
                return new nyf();
            case 5:
                int i = nyx.a;
                return afak.a;
            case 6:
                ygr ygrVar = oal.a;
                return new oak();
            case 7:
                yph yphVar3 = obq.a;
                return (PowerManager) mki.a.c.getSystemService(PowerManager.class);
            case 8:
                int i2 = nuj.b;
                wer.c();
                return new ofs(((nuj) mki.a.i(nuj.class)).a());
            case 9:
                ofr ofrVar = ofs.a;
                ogb ogbVarA = ogb.a.a();
                qrn qrnVarE = kio.b().e();
                qrnVarE.getClass();
                yfq yfqVarB = ogbVarA.b(qrnVarE, nyj.b());
                ArrayList arrayList = new ArrayList(woy.bp(yfqVarB, 10));
                Iterator<E> it = yfqVarB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mqc) it.next()).a.a);
                }
                return arrayList;
            case 10:
                oga ogaVar = ogb.a;
                return new tgw(mki.a.c, acqd.i());
            case 11:
                return new ogb();
            case 12:
                return new oig();
            default:
                return new oij();
        }
    }
}
