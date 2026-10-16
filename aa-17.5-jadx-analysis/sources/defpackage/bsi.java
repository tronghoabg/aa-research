package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bsi implements ckv {
    final /* synthetic */ Object a;
    private final bwq b = new ParcelableSnapshotMutableState(new afgw(BitmapDescriptorFactory.HUE_RED, 1.0f), bxp.c);
    private final /* synthetic */ int c;

    public bsi(ksx ksxVar, int i) {
        this.c = i;
        this.a = ksxVar;
    }

    @Override // defpackage.ckv
    public final ckm a(long j, dlr dlrVar, dlg dlgVar) {
        int i = this.c;
        Object obj = this.a;
        if (i == 0) {
            ksx ksxVar = (ksx) obj;
            ksxVar.b = j;
            this.b.b(new afgw(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f));
            long j2 = ksxVar.b;
            dlg dlgVar2 = ksxVar.c;
            adu aduVarA = ksxVar.d;
            if (aduVarA == null) {
                aduVarA = adv.a(ksxVar.h.a.a(j2, dlgVar2));
                ksxVar.d = aduVarA;
            }
            float fFloatValue = ((Number) afpt.n(Float.valueOf(((Number) aduVarA.d()).floatValue()), b())).floatValue();
            long j3 = ksxVar.b;
            dlg dlgVar3 = ksxVar.c;
            adu aduVarA2 = ksxVar.e;
            if (aduVarA2 == null) {
                aduVarA2 = adv.a(ksxVar.h.b.a(j3, dlgVar3));
                ksxVar.e = aduVarA2;
            }
            float fFloatValue2 = ((Number) afpt.n(Float.valueOf(((Number) aduVarA2.d()).floatValue()), b())).floatValue();
            long j4 = ksxVar.b;
            dlg dlgVar4 = ksxVar.c;
            adu aduVarA3 = ksxVar.f;
            if (aduVarA3 == null) {
                aduVarA3 = adv.a(ksxVar.h.d.a(j4, dlgVar4));
                ksxVar.f = aduVarA3;
            }
            float fFloatValue3 = ((Number) afpt.n(Float.valueOf(((Number) aduVarA3.d()).floatValue()), b())).floatValue();
            long j5 = ksxVar.b;
            dlg dlgVar5 = ksxVar.c;
            adu aduVarA4 = ksxVar.g;
            if (aduVarA4 == null) {
                aduVarA4 = adv.a(ksxVar.h.c.a(j5, dlgVar5));
                ksxVar.g = aduVarA4;
            }
            return bcr.a(fFloatValue, fFloatValue2, ((Number) afpt.n(Float.valueOf(((Number) aduVarA4.d()).floatValue()), b())).floatValue(), fFloatValue3).a(j, dlrVar, dlgVar);
        }
        ksx ksxVar2 = (ksx) obj;
        ksxVar2.b = j;
        this.b.b(new afgw(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f));
        bcm bcmVar = ksxVar2.h;
        long j6 = ksxVar2.b;
        dlg dlgVar6 = ksxVar2.c;
        adu aduVarA5 = ksxVar2.d;
        if (aduVarA5 == null) {
            aduVarA5 = adv.a(bcmVar.a.a(j6, dlgVar6));
            ksxVar2.d = aduVarA5;
        }
        bcq bcqVar = new bcq(((Number) afpt.n(Float.valueOf(((Number) aduVarA5.d()).floatValue()), b())).floatValue());
        long j7 = ksxVar2.b;
        dlg dlgVar7 = ksxVar2.c;
        adu aduVarA6 = ksxVar2.e;
        if (aduVarA6 == null) {
            aduVarA6 = adv.a(bcmVar.b.a(j7, dlgVar7));
            ksxVar2.e = aduVarA6;
        }
        bcq bcqVar2 = new bcq(((Number) afpt.n(Float.valueOf(((Number) aduVarA6.d()).floatValue()), b())).floatValue());
        long j8 = ksxVar2.b;
        dlg dlgVar8 = ksxVar2.c;
        adu aduVarA7 = ksxVar2.f;
        if (aduVarA7 == null) {
            aduVarA7 = adv.a(bcmVar.d.a(j8, dlgVar8));
            ksxVar2.f = aduVarA7;
        }
        bcq bcqVar3 = new bcq(((Number) afpt.n(Float.valueOf(((Number) aduVarA7.d()).floatValue()), b())).floatValue());
        long j9 = ksxVar2.b;
        dlg dlgVar9 = ksxVar2.c;
        adu aduVarA8 = ksxVar2.g;
        if (aduVarA8 == null) {
            aduVarA8 = adv.a(bcmVar.c.a(j9, dlgVar9));
            ksxVar2.g = aduVarA8;
        }
        return new bcm(bcqVar, bcqVar2, new bcq(((Number) afpt.n(Float.valueOf(((Number) aduVarA8.d()).floatValue()), b())).floatValue()), bcqVar3).a(j, dlrVar, dlgVar);
    }

    public final afgw b() {
        int i = this.c;
        bwq bwqVar = this.b;
        return i != 0 ? (afgw) bwqVar.a() : (afgw) bwqVar.a();
    }

    public bsi(ksx ksxVar, int i, byte[] bArr) {
        this.c = i;
        this.a = ksxVar;
    }
}
