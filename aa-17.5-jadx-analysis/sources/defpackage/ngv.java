package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.gms.car.display.CarRegionId;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class ngv implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ ngv(int i) {
        this.a = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() throws qrz {
        boolean z = false;
        switch (this.a) {
            case 0:
                yph yphVar = nhm.a;
                return afak.a;
            case 1:
                mwc.a(yzy.Hq, null);
                return afak.a;
            case 2:
                yph yphVar2 = nih.a;
                List list = nii.j;
                LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(list, 10)), 16));
                afao afaoVar = new afao((afar) list);
                while (afaoVar.hasNext()) {
                    Object next = afaoVar.next();
                    linkedHashMap.put(next, new cil());
                }
                return linkedHashMap;
            case 3:
                yph yphVar3 = nih.a;
                return new ParcelableSnapshotMutableState(nii.a, bxp.c);
            case 4:
                yph yphVar4 = nih.a;
                return new ParcelableSnapshotMutableState(false, bxp.c);
            case 5:
                afia[] afiaVarArr = niy.a;
                return Boolean.valueOf(lzf.c());
            case 6:
                njj njjVar = njp.a;
                if (mpl.f().a().g("key_settings_show_rail_widget", false) && nsr.c().b().L()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                njj njjVar2 = njp.a;
                mki.a.g();
                ols.E(kio.b().e(), CarRegionId.a);
                return afak.a;
            case 8:
                njz njzVar = njz.a;
                nfr.a.a().b();
                return afak.a;
            case 9:
                njz njzVar2 = njz.a;
                nfr nfrVarA = nfr.a.a();
                qrn qrnVarE = kio.b().e();
                qrnVarE.getClass();
                nfrVarA.f(qrnVarE);
                return afak.a;
            case 10:
                njz njzVar3 = njz.a;
                nfr nfrVarA2 = nfr.a.a();
                qrn qrnVarE2 = kio.b().e();
                qrnVarE2.getClass();
                nfrVarA2.e(qrnVarE2);
                return afak.a;
            case 11:
                yph yphVar5 = nkl.a;
                return afak.a;
            case 12:
                return afak.a;
            case 13:
                return afak.a;
            case 14:
                return Boolean.valueOf(mpl.f().a().g("key_settings_show_rail_widget", false));
            case 15:
                yph yphVar6 = nnu.a;
                return afak.a;
            case 16:
                yph yphVar7 = nnu.a;
                return afak.a;
            case 17:
                return new npc();
            case 18:
                return new nqd();
            case 19:
                return afak.a;
            default:
                yph yphVar8 = nqu.c;
                return a.Q();
        }
    }
}
