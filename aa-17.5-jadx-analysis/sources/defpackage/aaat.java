package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
public final class aaat implements tqu, zwe {
    private static final String c = "aaat";
    public final tqv a;
    public final aacq b;
    private final String d;
    private final Integer e;
    private final tnq f;
    private final zys g;
    private abgx h = abgx.ROADMAP;
    private final qsb i;

    public aaat(String str, Integer num, tnq tnqVar, qsb qsbVar, aacq aacqVar, tqv tqvVar, zys zysVar) {
        this.d = str;
        this.e = num;
        this.f = tnqVar;
        this.i = qsbVar;
        this.b = aacqVar;
        this.a = tqvVar;
        this.g = zysVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    private final boolean c(abgx abgxVar) {
        ackh ackhVar = (ackh) this.b.a.get(this.d);
        Integer numD = ackhVar == null ? null : ackhVar.d(abgxVar);
        if (numD == null) {
            return false;
        }
        this.f.c().e(numD);
        this.g.b(aahu.MAP_SET_BACKGROUND_COLOR_POST_INIT);
        return true;
    }

    @Override // defpackage.zwe
    public final void b() {
        c(this.h);
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.tqu
    public final void gq(abgx abgxVar, int i) {
        String str = c;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("Map style changed from %s to %s", Integer.valueOf(this.h.aj), Integer.valueOf(abgxVar.aj)));
        }
        this.h = abgxVar;
        if (!c(abgxVar)) {
            this.f.c().e(this.e);
        }
        qsb qsbVar = this.i;
        String str2 = this.d;
        ?? r7 = qsbVar.d;
        if (r7.containsKey(str2) && ((rjs) r7.get(str2)).a.containsKey(abgxVar)) {
            zys zysVar = this.g;
            aahu aahuVar = aahu.MAP_USE_CLOUD_STYLING;
            abnp abnpVarN = yvv.a.n();
            abnp abnpVarN2 = yvp.a.n();
            int iOrdinal = abgxVar.ordinal();
            yvo yvoVar = iOrdinal != 16 ? iOrdinal != 35 ? iOrdinal != 40 ? iOrdinal != 43 ? iOrdinal != 46 ? iOrdinal != 55 ? iOrdinal != 56 ? yvo.UNKNOWN_SDK_MAP_VARIANT : yvo.VARIANT_TERRAIN_DARK : yvo.VARIANT_TERRAIN : yvo.VARIANT_HYBRID : yvo.VARIANT_ROADMAP_DARK : yvo.VARIANT_ROADMAP : yvo.VARIANT_NAVIGATION_LOW_LIGHT : yvo.VARIANT_NAVIGATION;
            abnpVarN2.t();
            yvp yvpVar = (yvp) abnpVarN2.b;
            yvpVar.d = yvoVar.k;
            yvpVar.b |= 2;
            yvp yvpVar2 = (yvp) abnpVarN2.q();
            abnpVarN.t();
            yvv yvvVar = (yvv) abnpVarN.b;
            yvpVar2.getClass();
            yvvVar.c = yvpVar2;
            yvvVar.b = 5;
            zysVar.c(aahuVar, (yvv) abnpVarN.q());
        }
    }
}
