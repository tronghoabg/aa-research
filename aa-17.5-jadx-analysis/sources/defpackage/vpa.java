package defpackage;

import android.os.Build;
import android.os.Process;

/* loaded from: classes3.dex */
final class vpa implements vow {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public vpa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.vow
    public final boolean a(abnp abnpVar) {
        int i = this.b;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            abnp abnpVarN = von.a.n();
            abnp abnpVarN2 = voo.a.n();
            Object obj = this.a;
            long startElapsedRealtime = Process.getStartElapsedRealtime();
            voz vozVar = (voz) obj;
            tmb tmbVar = vozVar.a;
            abpt abptVarB = abqu.b(tmbVar.f().toEpochMilli() - (tmbVar.a() - startElapsedRealtime));
            abnpVarN2.t();
            voo vooVar = (voo) abnpVarN2.b;
            abptVarB.getClass();
            vooVar.c = abptVarB;
            vooVar.b |= 1;
            abnpVarN.t();
            von vonVar = (von) abnpVarN.b;
            voo vooVar2 = (voo) abnpVarN2.q();
            vooVar2.getClass();
            vonVar.c = vooVar2;
            vonVar.b = 2;
            abnpVar.aR(abnpVarN);
            if (!((Boolean) vozVar.b.a()).booleanValue()) {
                long jMyPid = Process.myPid();
                abnpVar.t();
                vor vorVar = (vor) abnpVar.b;
                vor vorVar2 = vor.a;
                vorVar.b |= 1;
                vorVar.c = jMyPid;
                abpt abptVarB2 = abqu.b(tmbVar.f().toEpochMilli());
                abnpVar.t();
                vor vorVar3 = (vor) abnpVar.b;
                abptVarB2.getClass();
                vorVar3.d = abptVarB2;
                vorVar3.b |= 2;
            }
            return true;
        }
        abnp abnpVarN3 = voq.a.n();
        vpd vpdVar = (vpd) this.a;
        vsd vsdVar = (vsd) vpdVar.a;
        if (vsdVar.a() != null) {
            String strA = vsdVar.a();
            abnpVarN3.t();
            voq voqVar = (voq) abnpVarN3.b;
            strA.getClass();
            voqVar.b |= 1;
            voqVar.c = strA;
        }
        vsc vscVar = (vsc) vpdVar.b;
        if (vscVar.a().intValue() > 0) {
            int iIntValue = vscVar.a().intValue();
            abnpVarN3.t();
            voq voqVar2 = (voq) abnpVarN3.b;
            voqVar2.b = 2 | voqVar2.b;
            voqVar2.d = iIntValue;
        }
        aezk aezkVar = vpdVar.c;
        if (((Integer) aezkVar.a()).intValue() > 0) {
            int iIntValue2 = ((Integer) aezkVar.a()).intValue();
            abnpVarN3.t();
            voq voqVar3 = (voq) abnpVarN3.b;
            voqVar3.b |= 4;
            voqVar3.e = iIntValue2;
        }
        int i2 = Build.VERSION.SDK_INT;
        abnpVarN3.t();
        voq voqVar4 = (voq) abnpVarN3.b;
        voqVar4.b |= 8;
        voqVar4.f = i2;
        abnp abnpVarN4 = von.a.n();
        abnpVarN4.t();
        von vonVar2 = (von) abnpVarN4.b;
        voq voqVar5 = (voq) abnpVarN3.q();
        voqVar5.getClass();
        vonVar2.c = voqVar5;
        vonVar2.b = 4;
        von vonVar3 = (von) abnpVarN4.q();
        abnpVar.t();
        vor vorVar4 = (vor) abnpVar.b;
        vor vorVar5 = vor.a;
        vonVar3.getClass();
        vorVar4.b();
        vorVar4.e.add(vonVar3);
        return true;
    }
}
