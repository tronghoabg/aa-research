package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class ale implements afec {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ale(float f, Object obj, int i) {
        this.c = i;
        this.a = f;
        this.b = obj;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        boolean zC;
        int i = this.c;
        if (i == 0) {
            float f = this.a;
            afgw afgwVar = (afgw) this.b;
            daq.f((dec) obj, new ddn(((Number) afpt.n(Float.valueOf(f), afgwVar)).floatValue(), afgwVar));
            return afak.a;
        }
        if (i == 1) {
            long jLongValue = ((Long) obj).longValue();
            agg aggVar = (agg) this.b;
            if (!aggVar.w()) {
                if (aggVar.c() == Long.MIN_VALUE) {
                    aggVar.l(jLongValue);
                }
                float f2 = this.a;
                long jC = jLongValue - aggVar.c();
                z = f2 != BitmapDescriptorFactory.HUE_RED;
                if (f2 != BitmapDescriptorFactory.HUE_RED) {
                    jC = afgi.l(jC / f2);
                }
                aggVar.n(jC);
                aggVar.j(jC, !z);
            }
            return afak.a;
        }
        aog aogVar = (aog) obj;
        boolean zF = affa.f(aogVar.d(), "waiting");
        if (aogVar.n() == null) {
            zC = false;
        } else {
            float f3 = this.a;
            api apiVarN = aogVar.n();
            apiVarN.getClass();
            zC = aoi.c(apiVarN, f3);
        }
        affq affqVar = (affq) this.b;
        if (affqVar.a || (zF && zC)) {
            z = true;
        }
        affqVar.a = z;
        return Boolean.valueOf(!z);
    }

    public /* synthetic */ ale(agg aggVar, float f, int i) {
        this.c = i;
        this.b = aggVar;
        this.a = f;
    }
}
