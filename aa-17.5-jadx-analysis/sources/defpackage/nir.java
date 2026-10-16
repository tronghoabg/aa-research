package defpackage;

import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class nir implements afeh {
    private final /* synthetic */ int a;

    public /* synthetic */ nir(int i) {
        this.a = i;
    }

    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        if (i == 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Boolean bool = (Boolean) obj2;
            Map map = (Map) obj3;
            bool.getClass();
            map.getClass();
            mqc mqcVar = (mqc) map.get(CarRegionId.a);
            return bool.booleanValue() ? nij.c : zBooleanValue ? nij.a : affa.f(mqcVar != null ? mqcVar.a() : null, mkn.s) ? nij.b : nij.d;
        }
        if (i != 1) {
            cts ctsVar = (cts) obj;
            cto ctoVar = (cto) obj2;
            ctsVar.getClass();
            ctoVar.getClass();
            long j = ((dle) obj3).a;
            cuo cuoVarV = ctoVar.v(j);
            int iA = dle.a(j);
            obi obiVar = oay.a;
            float f = iA / 13.0f;
            int iK = afgi.k(Float.intBitsToFloat((int) (oay.a.b(f) >> 32)) + afgi.k(f) + Float.intBitsToFloat((int) (oay.b.b(f) >> 32)));
            return ctsVar.eK(iK, cuoVarV.b, afbf.a, new bfo(ctsVar, cuoVarV, iK, 3));
        }
        alp alpVar = (alp) obj;
        bux buxVar = (bux) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != buxVar.C(alpVar) ? 2 : 4;
        }
        if (buxVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
            cfv cfvVar = cfy.e;
            long j2 = als.a;
            cfy cfyVarD = awd.d(awd.r(asl.I(cfvVar, BitmapDescriptorFactory.HUE_RED, 8.0f)), 1.0f);
            long j3 = alpVar.c;
            atk.c(cfyVarD.a(new aix(-72057594037927936L, ckq.a)), buxVar, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
