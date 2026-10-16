package defpackage;

import android.util.Log;
import j$.util.Optional;
import java.io.IOException;
import java.util.Set;

/* loaded from: classes3.dex */
public final /* synthetic */ class txa implements xwx {
    private final /* synthetic */ int a;

    public /* synthetic */ txa(int i) {
        this.a = i;
    }

    @Override // defpackage.xwx
    public final Object a(Object obj) {
        int i = 2;
        switch (this.a) {
            case 0:
                throw null;
            case 1:
                return ((gjv) obj).a;
            case 2:
                return ((tvx) obj).d;
            case 3:
                return yeb.d((Set) obj).e(new txa(i)).f();
            case 4:
                return yfq.o((Set) obj);
            case 5:
                return yeb.d((Set) obj).e(new txa(0)).f();
            case 6:
                udx udxVar = (udx) obj;
                udxVar.n();
                return new gjv(udxVar.P(), (char[]) null);
            case 7:
                tzy tzyVarA = tzy.a((aazt) obj);
                return tzyVarA != null ? tzyVarA : tzy.a;
            case 8:
                return ((udu) obj).b;
            case 9:
                return new uva((utf) obj);
            case 10:
                return new uvc((utf) obj);
            case 11:
                return Integer.valueOf(((zbf) obj).b);
            case 12:
                return ((vmc) obj).a();
            case 13:
                return (vma) ((Optional) obj).get();
            case 14:
                ajhb ajhbVar = (ajhb) obj;
                abnp abnpVarN = ajgw.a.n();
                abnpVarN.t();
                ajgw ajgwVar = (ajgw) abnpVarN.b;
                ajhbVar.getClass();
                ajgwVar.d = ajhbVar;
                ajgwVar.c = 3;
                abnp abnpVarN2 = ajgy.a.n();
                abnpVarN2.t();
                ajgy ajgyVar = (ajgy) abnpVarN2.b;
                ajgyVar.b = 2 | ajgyVar.b;
                ajgyVar.c = true;
                ajgy ajgyVar2 = (ajgy) abnpVarN2.q();
                abnpVarN.t();
                ajgw ajgwVar2 = (ajgw) abnpVarN.b;
                ajgyVar2.getClass();
                ajgwVar2.e = ajgyVar2;
                ajgwVar2.b |= 1;
                return (ajgw) abnpVarN.q();
            case 15:
                ajfr ajfrVar = (ajfr) obj;
                abnp abnpVarN3 = ajgw.a.n();
                abnpVarN3.t();
                ajgw ajgwVar3 = (ajgw) abnpVarN3.b;
                ajfrVar.getClass();
                ajgwVar3.d = ajfrVar;
                ajgwVar3.c = 1;
                abnp abnpVarN4 = ajgy.a.n();
                abnpVarN4.t();
                ajgy ajgyVar3 = (ajgy) abnpVarN4.b;
                ajgyVar3.b = 2 | ajgyVar3.b;
                ajgyVar3.c = true;
                ajgy ajgyVar4 = (ajgy) abnpVarN4.q();
                abnpVarN3.t();
                ajgw ajgwVar4 = (ajgw) abnpVarN3.b;
                ajgyVar4.getClass();
                ajgwVar4.e = ajgyVar4;
                ajgwVar4.b |= 1;
                return (ajgw) abnpVarN3.q();
            case 16:
                Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (Throwable) obj);
                return true;
            case 17:
                return zeb.g((String) obj);
            case 18:
                return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
            case 19:
                return null;
            default:
                way wayVar = (way) obj;
                if (wayVar.a != 29514) {
                    throw wayVar;
                }
                abnp abnpVarN5 = wbn.a.n();
                abnp abnpVarN6 = wbj.b.n();
                long jCurrentTimeMillis = System.currentTimeMillis();
                abnpVarN6.t();
                wbj wbjVar = (wbj) abnpVarN6.b;
                wbjVar.c |= 8;
                wbjVar.g = jCurrentTimeMillis;
                abnpVarN5.t();
                wbn wbnVar = (wbn) abnpVarN5.b;
                wbj wbjVar2 = (wbj) abnpVarN6.q();
                wbjVar2.getClass();
                wbnVar.c = wbjVar2;
                wbnVar.b |= 1;
                return (wbn) abnpVarN5.q();
        }
    }
}
