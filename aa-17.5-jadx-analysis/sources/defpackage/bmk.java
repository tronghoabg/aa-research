package defpackage;

import android.content.res.Resources;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class bmk implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ bmk(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.a;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        int i2 = 0;
        switch (i) {
            case 0:
                cxi cxiVar = (cxi) obj;
                cxiVar.o(bmm.b, (int) (cxiVar.n().h() >> 32));
                cxiVar.o(bmm.a, BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            case 1:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 2:
                float f = bnf.a;
                daq.g((dec) obj, 1);
                return afak.a;
            case 3:
                daq.g((dec) obj, 0);
                return afak.a;
            case 4:
                boo booVar = (boo) obj;
                bsz[] bszVarArr = new bsz[3];
                bszVarArr[0] = btb.a;
                bszVarArr[1] = btb.b;
                dlp dlpVar = booVar.a;
                int iA = dlo.a(dlpVar.c());
                long j = booVar.b;
                bszVarArr[2] = iA < ((int) (j >> 32)) / 2 ? btb.c : btb.d;
                List listBi = woy.bi(bszVarArr);
                long j2 = booVar.c >> 32;
                dlr dlrVar = booVar.d;
                zf zfVar = new zf(listBi.size());
                int size = listBi.size();
                while (i2 < size) {
                    dlr dlrVar2 = dlrVar;
                    zfVar.e(((bsz) listBi.get(i2)).a(dlpVar, j, (int) j2, dlrVar2));
                    i2++;
                    dlrVar = dlrVar2;
                }
                return zfVar;
            case 5:
                boo booVar2 = (boo) obj;
                bta[] btaVarArr = new bta[4];
                btaVarArr[0] = btb.e;
                btaVarArr[1] = btb.f;
                btaVarArr[2] = btb.g;
                dlp dlpVar2 = booVar2.a;
                int iB = dlo.b(dlpVar2.c());
                long j3 = booVar2.b;
                btaVarArr[3] = iB < ((int) (j3 & 4294967295L)) / 2 ? btb.h : btb.i;
                List listBi2 = woy.bi(btaVarArr);
                long j4 = booVar2.c & 4294967295L;
                zf zfVar2 = new zf(listBi2.size());
                int size2 = listBi2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    zfVar2.e(((bta) listBi2.get(i3)).a(dlpVar2, j3, (int) j4));
                }
                return zfVar2;
            case 6:
                sjg sjgVar = (sjg) obj;
                aen aenVar = boz.a;
                sjgVar.a = 1750;
                sjgVar.g(fValueOf2, 0).b = boz.a;
                sjgVar.g(fValueOf, 1000);
                return afak.a;
            case 7:
                sjg sjgVar2 = (sjg) obj;
                aen aenVar2 = boz.a;
                sjgVar2.a = 1750;
                sjgVar2.g(fValueOf2, 250).b = boz.a;
                sjgVar2.g(fValueOf, 1250);
                return afak.a;
            case 8:
                sjg sjgVar3 = (sjg) obj;
                aen aenVar3 = boz.a;
                sjgVar3.a = 6000;
                sjgVar3.g(Float.valueOf(0.87f), 3000).b = boz.b;
                sjgVar3.g(Float.valueOf(0.1f), 6000);
                return afak.a;
            case 9:
                sjg sjgVar4 = (sjg) obj;
                aen aenVar4 = boz.a;
                sjgVar4.a = 6000;
                Float fValueOf3 = Float.valueOf(90.0f);
                afj afjVarG = sjgVar4.g(fValueOf3, 300);
                aen aenVar5 = bub.a;
                afjVarG.b = bub.b;
                sjgVar4.g(fValueOf3, 1500);
                Float fValueOf4 = Float.valueOf(180.0f);
                sjgVar4.g(fValueOf4, 1800);
                sjgVar4.g(fValueOf4, 3000);
                Float fValueOf5 = Float.valueOf(270.0f);
                sjgVar4.g(fValueOf5, 3300);
                sjgVar4.g(fValueOf5, 4500);
                Float fValueOf6 = Float.valueOf(360.0f);
                sjgVar4.g(fValueOf6, 4800);
                sjgVar4.g(fValueOf6, 6000);
                return afak.a;
            case 10:
                sjg sjgVar5 = (sjg) obj;
                aen aenVar6 = boz.a;
                sjgVar5.a = 1750;
                sjgVar5.g(fValueOf2, 650).b = boz.a;
                sjgVar5.g(fValueOf, 1500);
                return afak.a;
            case 11:
                sjg sjgVar6 = (sjg) obj;
                aen aenVar7 = boz.a;
                sjgVar6.a = 1750;
                sjgVar6.g(fValueOf2, 900).b = boz.a;
                sjgVar6.g(fValueOf, 1750);
                return afak.a;
            case 12:
                ((dec) obj).a(ddx.m, true);
                return afak.a;
            case 13:
                return afak.a;
            case 14:
                daq.g((dec) obj, 1);
                return afak.a;
            case 15:
                cfy cfyVar = bsd.a;
                return afak.a;
            case 16:
                cfy cfyVar2 = bsd.a;
                return afak.a;
            case 17:
                cyz cyzVar = (cyz) obj;
                cyzVar.getClass();
                throw null;
            case 18:
                int i4 = cgq.h;
                return Boolean.valueOf(vs.k((ddu) obj));
            case 19:
                cgu cguVar = (cgu) obj;
                if (!cguVar.q.A) {
                    return cyy.b;
                }
                cgu cguVar2 = cguVar.d;
                cguVar.d = null;
                cguVar.b = null;
                return cyy.a;
            default:
                return afak.a;
        }
    }
}
