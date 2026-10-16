package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class guf implements afeh {
    public final /* synthetic */ float a;
    private final /* synthetic */ int b;

    public /* synthetic */ guf(float f, int i) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.b == 0) {
            cts ctsVar = (cts) obj;
            cto ctoVar = (cto) obj2;
            ctsVar.getClass();
            ctoVar.getClass();
            long j = ((dle) obj3).a;
            int iEF = ctsVar.eF(this.a);
            cuo cuoVarV = ctoVar.v(dlf.h(j, iEF + iEF, 0));
            return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new goa(cuoVarV, 9));
        }
        cts ctsVar2 = (cts) obj;
        cto ctoVar2 = (cto) obj2;
        ctsVar2.getClass();
        ctoVar2.getClass();
        cuo cuoVarV2 = ctoVar2.v(((dle) obj3).a);
        float fA = aev.a.a(this.a);
        float fEA = ctsVar2.eA(BitmapDescriptorFactory.HUE_RED);
        return ctsVar2.eK((int) (fEA + ((cuoVarV2.a - fEA) * fA)), cuoVarV2.b, afbf.a, new fzl(cuoVarV2, 1));
    }
}
