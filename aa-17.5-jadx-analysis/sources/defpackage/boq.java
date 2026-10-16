package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class boq extends cfx implements cwc, cwu {
    private Map a;

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        float f = ((dlj) bzi.x(this, bof.c)).a;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        cuo cuoVarV = ctoVar.v(j);
        boolean z = this.A && !Float.isNaN(f) && dlj.a(f, BitmapDescriptorFactory.HUE_RED) > 0;
        int iEF = !Float.isNaN(f) ? ctsVar.eF(f) : 0;
        int iMax = z ? Math.max(cuoVarV.a, iEF) : cuoVarV.a;
        int iMax2 = z ? Math.max(cuoVarV.b, iEF) : cuoVarV.b;
        if (z) {
            Map linkedHashMap = this.a;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.a = linkedHashMap;
            }
            cvg cvgVar = bof.b;
            int iRound = Math.round((iEF - cuoVarV.a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(cvgVar, Integer.valueOf(iRound));
            csl cslVar = bof.a;
            int iRound2 = Math.round((iEF - cuoVarV.b) / 2.0f);
            linkedHashMap.put(cslVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.a;
        if (map == null) {
            map = afbf.a;
        }
        return ctsVar.eK(iMax, iMax2, map, new auv(iMax, cuoVarV, iMax2, 3));
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int h(csq csqVar, csp cspVar, int i) {
        return tv.c(this, csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int i(csq csqVar, csp cspVar, int i) {
        return tv.d(this, csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int j(csq csqVar, csp cspVar, int i) {
        return tv.e(this, csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int k(csq csqVar, csp cspVar, int i) {
        return tv.f(this, csqVar, cspVar, i);
    }
}
