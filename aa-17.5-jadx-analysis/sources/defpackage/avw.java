package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class avw implements ctp, avt {
    public final cfr a;
    private final asw b;

    public avw(asw aswVar, cfr cfrVar) {
        this.b = aswVar;
        this.a = cfrVar;
    }

    @Override // defpackage.ctp
    public final int a(csq csqVar, List list, int i) {
        int iEF = csqVar.eF(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iEF, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            csp cspVar = (csp) list.get(i2);
            avu avuVarC = asl.C(cspVar);
            float f2 = avuVarC != null ? avuVarC.a : 0.0f;
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(cspVar.d(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, cspVar.c(iMin2));
            } else if (f2 > BitmapDescriptorFactory.HUE_RED) {
                f += f2;
            }
        }
        int iRound = f == BitmapDescriptorFactory.HUE_RED ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            csp cspVar2 = (csp) list.get(i3);
            avu avuVarC2 = asl.C(cspVar2);
            float f3 = avuVarC2 != null ? avuVarC2.a : 0.0f;
            if (f3 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, cspVar2.c(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.ctp
    public final int b(csq csqVar, List list, int i) {
        int iEF = csqVar.eF(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            csp cspVar = (csp) list.get(i3);
            avu avuVarC = asl.C(cspVar);
            float f2 = avuVarC != null ? avuVarC.a : 0.0f;
            int iD = cspVar.d(i);
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                i2 += iD;
            } else if (f2 > BitmapDescriptorFactory.HUE_RED) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iD / f2));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iEF);
    }

    @Override // defpackage.ctp
    public final int c(csq csqVar, List list, int i) {
        int iEF = csqVar.eF(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iEF, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            csp cspVar = (csp) list.get(i2);
            avu avuVarC = asl.C(cspVar);
            float f2 = avuVarC != null ? avuVarC.a : 0.0f;
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(cspVar.d(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, cspVar.e(iMin2));
            } else if (f2 > BitmapDescriptorFactory.HUE_RED) {
                f += f2;
            }
        }
        int iRound = f == BitmapDescriptorFactory.HUE_RED ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            csp cspVar2 = (csp) list.get(i3);
            avu avuVarC2 = asl.C(cspVar2);
            float f3 = avuVarC2 != null ? avuVarC2.a : 0.0f;
            if (f3 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, cspVar2.e(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.ctp
    public final int d(csq csqVar, List list, int i) {
        int iEF = csqVar.eF(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            csp cspVar = (csp) list.get(i3);
            avu avuVarC = asl.C(cspVar);
            float f2 = avuVarC != null ? avuVarC.a : 0.0f;
            int iF = cspVar.f(i);
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                i2 += iF;
            } else if (f2 > BitmapDescriptorFactory.HUE_RED) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iF / f2));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iEF);
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        return asl.B(this, dle.d(j), dle.c(j), dle.b(j), dle.a(j), ctsVar.eF(this.b.a()), ctsVar, list, new cuo[list.size()], 0, list.size(), null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avw)) {
            return false;
        }
        avw avwVar = (avw) obj;
        return affa.f(this.b, avwVar.b) && affa.f(this.a, avwVar.a);
    }

    @Override // defpackage.avt
    public final int f(cuo cuoVar) {
        return cuoVar.b;
    }

    @Override // defpackage.avt
    public final int g(cuo cuoVar) {
        return cuoVar.a;
    }

    @Override // defpackage.avt
    public final ctq h(cuo[] cuoVarArr, cts ctsVar, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return ctsVar.eK(i2, i3, afbf.a, new awv(cuoVarArr, this, i3, i, iArr, 1));
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.avt
    public final void i(int i, int[] iArr, int[] iArr2, cts ctsVar) {
        this.b.b(ctsVar, i, iArr, ctsVar.p(), iArr2);
    }

    @Override // defpackage.avt
    public final long j(int i, int i2, int i3, boolean z) {
        return avv.b(z, i, i2, i3);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.b + ", verticalAlignment=" + this.a + ")";
    }
}
