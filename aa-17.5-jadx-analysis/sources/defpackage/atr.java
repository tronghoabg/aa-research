package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class atr implements ctp, avt {
    public final cfm a;
    private final atc b;

    public atr(atc atcVar, cfm cfmVar) {
        this.b = atcVar;
        this.a = cfmVar;
    }

    @Override // defpackage.ctp
    public final int a(csq csqVar, List list, int i) {
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
            int iC = cspVar.c(i);
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                i2 += iC;
            } else if (f2 > BitmapDescriptorFactory.HUE_RED) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iC / f2));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iEF);
    }

    @Override // defpackage.ctp
    public final int b(csq csqVar, List list, int i) {
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
                int iMin2 = Math.min(cspVar.c(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, cspVar.d(iMin2));
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
                iMax = Math.max(iMax, cspVar2.d(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.ctp
    public final int c(csq csqVar, List list, int i) {
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
            int iE = cspVar.e(i);
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                i2 += iE;
            } else if (f2 > BitmapDescriptorFactory.HUE_RED) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iE / f2));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iEF);
    }

    @Override // defpackage.ctp
    public final int d(csq csqVar, List list, int i) {
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
                int iMin2 = Math.min(cspVar.c(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, cspVar.f(iMin2));
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
                iMax = Math.max(iMax, cspVar2.f(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        return asl.B(this, dle.c(j), dle.d(j), dle.a(j), dle.b(j), ctsVar.eF(this.b.a()), ctsVar, list, new cuo[list.size()], 0, list.size(), null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atr)) {
            return false;
        }
        atr atrVar = (atr) obj;
        return affa.f(this.b, atrVar.b) && affa.f(this.a, atrVar.a);
    }

    @Override // defpackage.avt
    public final int f(cuo cuoVar) {
        return cuoVar.a;
    }

    @Override // defpackage.avt
    public final int g(cuo cuoVar) {
        return cuoVar.b;
    }

    @Override // defpackage.avt
    public final ctq h(cuo[] cuoVarArr, cts ctsVar, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return ctsVar.eK(i3, i2, afbf.a, new atq(cuoVarArr, this, i3, i, ctsVar, iArr, 0));
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.avt
    public final void i(int i, int[] iArr, int[] iArr2, cts ctsVar) {
        this.b.c(ctsVar, i, iArr, iArr2);
    }

    @Override // defpackage.avt
    public final long j(int i, int i2, int i3, boolean z) {
        return !z ? dlf.d(0, i3, i, i2) : dlf.t(0, i3, i, i2);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.b + ", horizontalAlignment=" + this.a + ")";
    }
}
