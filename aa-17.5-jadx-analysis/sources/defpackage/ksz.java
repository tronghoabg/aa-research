package defpackage;

import android.content.pm.PackageManager;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes.dex */
public final /* synthetic */ class ksz implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ ksz(int i) {
        this.a = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.a) {
            case 0:
                aezr aezrVar = ktf.a;
                return new ktb();
            case 1:
                aezr aezrVar2 = ktf.a;
                return new kta();
            case 2:
                aezr aezrVar3 = ktf.a;
                return new ktc();
            case 3:
                aezr aezrVar4 = ktf.a;
                return new mko((byte[]) null);
            case 4:
                aezr aezrVar5 = ktf.a;
                return new ktd();
            case 5:
                aezr aezrVar6 = ktf.a;
                return new kte();
            case 6:
                yph yphVar = kvc.a;
                return kuy.a;
            case 7:
                lak lakVar = lal.a;
                try {
                } catch (PackageManager.NameNotFoundException unused) {
                    ((ype) lal.b.h()).u("No GSA package found, VP2 disabled");
                }
                boolean z = mki.a.c.getPackageManager().getPackageInfo(RemoteApiConstants.NOW_PACKAGE, 0).versionCode >= 301313649;
                return Boolean.valueOf(z);
            case 8:
                return new lal();
            case 9:
                return new ldz();
            case 10:
                ldy ldyVar = ldz.a;
                return Boolean.valueOf(acon.a.gu().f());
            case 11:
                return new lef();
            case 12:
                leg legVar = leh.a;
                acpc acpcVar = acpc.a;
                return new nrf(Boolean.valueOf(acpcVar.gu().z()), Boolean.valueOf(acpcVar.gu().z() && acpcVar.gu().A()), Boolean.valueOf(acpcVar.gu().z()), false);
            case 13:
                return new leh();
            case 14:
                return new lej();
            case 15:
                return new lfr();
            case 16:
                return new lhj();
            case 17:
                return new ljp();
            case 18:
                return new lmi();
            case 19:
                return new mcu();
            default:
                aezr aezrVar7 = mie.a;
                return (mie) mki.a.i(mie.class);
        }
    }
}
