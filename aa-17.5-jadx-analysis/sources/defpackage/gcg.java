package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class gcg implements gci {
    private final long a;
    private final boolean b = true;

    public gcg(long j) {
        this.a = j;
    }

    @Override // defpackage.gci
    public final float a(aqf aqfVar, bux buxVar) {
        buxVar.v(347537848);
        if (!fyz.e(aqfVar)) {
            buxVar.o();
            return BitmapDescriptorFactory.HUE_RED;
        }
        agl aglVarF = ca.F(true != aqfVar.i() ? 500 : 150, aqfVar.i() ? 0 : (int) aisq.e(this.a), null, 4);
        Object objG = buxVar.g();
        Object obj = buw.a;
        if (objG == obj) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(true, bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objG;
        bym bymVarB = ady.b((((Boolean) bwqVar.a()).booleanValue() || aqfVar.i()) ? 1.0f : 0.0f, aglVarF, "Scrollbar alpha", null, buxVar, 3072, 20);
        boolean zAB = roc.aB(aqfVar);
        Boolean boolValueOf = Boolean.valueOf(zAB);
        boolean zD = buxVar.D(zAB);
        Object objG2 = buxVar.g();
        if (zD || objG2 == obj) {
            kvr kvrVar = new kvr(zAB, bwqVar, (afck) null, 1, (byte[]) null);
            buxVar.x(kvrVar);
            objG2 = kvrVar;
        }
        bvq.g(boolValueOf, (afeg) objG2, buxVar);
        float fFloatValue = ((Number) bymVarB.a()).floatValue();
        buxVar.o();
        return fFloatValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcg)) {
            return false;
        }
        gcg gcgVar = (gcg) obj;
        long j = this.a;
        long j2 = gcgVar.a;
        long j3 = aisq.a;
        if (!a.j(j, j2)) {
            return false;
        }
        boolean z = gcgVar.b;
        return true;
    }

    public final int hashCode() {
        long j = aisq.a;
        return (a.g(this.a) * 31) + 1231;
    }

    public final String toString() {
        return a.bq(aisq.k(this.a), "WhenNotIdle(hideDelay=", ", showAtStart=true)");
    }
}
