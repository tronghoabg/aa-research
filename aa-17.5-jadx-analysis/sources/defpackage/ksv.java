package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ksv implements ckv {
    final /* synthetic */ ksx a;
    private final bwq b = new ParcelableSnapshotMutableState(new afgw(BitmapDescriptorFactory.HUE_RED, 1.0f), bxp.c);

    public ksv(ksx ksxVar) {
        this.a = ksxVar;
    }

    @Override // defpackage.ckv
    public final ckm a(long j, dlr dlrVar, dlg dlgVar) {
        dlrVar.getClass();
        dlgVar.getClass();
        ksx ksxVar = this.a;
        ksxVar.b = j;
        this.b.b(new afgw(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f));
        long j2 = ksxVar.b;
        dlg dlgVar2 = ksxVar.c;
        dlgVar2.getClass();
        adu aduVarA = ksxVar.d;
        if (aduVarA == null) {
            aduVarA = adv.a(ksxVar.h.a.a(j2, dlgVar2));
            ksxVar.d = aduVarA;
        }
        float fFloatValue = ((Number) afpt.n(Float.valueOf(((Number) aduVarA.d()).floatValue()), b())).floatValue();
        long j3 = ksxVar.b;
        dlg dlgVar3 = ksxVar.c;
        dlgVar3.getClass();
        adu aduVarA2 = ksxVar.e;
        if (aduVarA2 == null) {
            aduVarA2 = adv.a(ksxVar.h.b.a(j3, dlgVar3));
            ksxVar.e = aduVarA2;
        }
        float fFloatValue2 = ((Number) afpt.n(Float.valueOf(((Number) aduVarA2.d()).floatValue()), b())).floatValue();
        long j4 = ksxVar.b;
        dlg dlgVar4 = ksxVar.c;
        dlgVar4.getClass();
        adu aduVarA3 = ksxVar.f;
        if (aduVarA3 == null) {
            aduVarA3 = adv.a(ksxVar.h.d.a(j4, dlgVar4));
            ksxVar.f = aduVarA3;
        }
        float fFloatValue3 = ((Number) afpt.n(Float.valueOf(((Number) aduVarA3.d()).floatValue()), b())).floatValue();
        long j5 = ksxVar.b;
        dlg dlgVar5 = ksxVar.c;
        dlgVar5.getClass();
        adu aduVarA4 = ksxVar.g;
        if (aduVarA4 == null) {
            aduVarA4 = adv.a(ksxVar.h.c.a(j5, dlgVar5));
            ksxVar.g = aduVarA4;
        }
        return bcr.a(fFloatValue, fFloatValue2, ((Number) afpt.n(Float.valueOf(((Number) aduVarA4.d()).floatValue()), b())).floatValue(), fFloatValue3).a(j, dlrVar, dlgVar);
    }

    public final afgw b() {
        return (afgw) this.b.a();
    }
}
