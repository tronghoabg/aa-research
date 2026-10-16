package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class ff implements com.google.v.el {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f48710a;

    ff(int i2) {
        this.f48710a = i2;
    }

    @Override // com.google.v.el
    public final /* synthetic */ Object convert(int i2) {
        switch (this.f48710a) {
            case 0:
                com.waze.bg.a.bn bnVarB = com.waze.bg.a.bn.b(i2);
                return bnVarB == null ? com.waze.bg.a.bn.ANIMAL_UNSPECIFIED : bnVarB;
            case 1:
                ee eeVarA = ee.a(i2);
                return eeVarA == null ? ee.FORMAT_UNSPECIFIED : eeVarA;
            case 2:
                com.waze.bg.a.bo boVarB = com.waze.bg.a.bo.b(i2);
                return boVarB == null ? com.waze.bg.a.bo.BLOCKED_LANE_UNSPECIFIED : boVarB;
            case 3:
                com.waze.bg.a.br brVarB = com.waze.bg.a.br.b(i2);
                return brVarB == null ? com.waze.bg.a.br.CRASH_UNSPECIFIED : brVarB;
            case 4:
                com.waze.bg.a.bt btVarB = com.waze.bg.a.bt.b(i2);
                return btVarB == null ? com.waze.bg.a.bt.HAZARD_UNSPECIFIED : btVarB;
            case 5:
                hg hgVarA = hg.a(i2);
                return hgVarA == null ? hg.MAP_ISSUE_UNSPECIFIED : hgVarA;
            case 6:
                com.waze.bg.a.bv bvVarB = com.waze.bg.a.bv.b(i2);
                return bvVarB == null ? com.waze.bg.a.bv.PERSONAL_SAFETY_UNSPECIFIED : bvVarB;
            case 7:
                com.waze.bg.a.bw bwVarB = com.waze.bg.a.bw.b(i2);
                return bwVarB == null ? com.waze.bg.a.bw.POLICE_UNSPECIFIED : bwVarB;
            case 8:
                com.waze.bg.a.by byVarB = com.waze.bg.a.by.b(i2);
                return byVarB == null ? com.waze.bg.a.by.TRAFFIC_UNSPECIFIED : byVarB;
            case 9:
                com.waze.bg.a.ca caVarB = com.waze.bg.a.ca.b(i2);
                return caVarB == null ? com.waze.bg.a.ca.WEATHER_UNSPECIFIED : caVarB;
            case 10:
                ih ihVarA = ih.a(i2);
                return ihVarA == null ? ih.UNKNOWN : ihVarA;
            case 11:
                mf mfVarA = mf.a(i2);
                return mfVarA == null ? mf.UNSPECIFIED_NEGATIVE_FACTOR : mfVarA;
            case 12:
                mg mgVarA = mg.a(i2);
                return mgVarA == null ? mg.UNSPECIFIED_POSITIVE_FACTOR : mgVarA;
            case 13:
                i.c.a.a.c cVarB = i.c.a.a.c.b(i2);
                return cVarB == null ? i.c.a.a.c.UNKNOWN : cVarB;
            case 14:
                i.c.a.a.d dVarB = i.c.a.a.d.b(i2);
                return dVarB == null ? i.c.a.a.d.UNKNOWN : dVarB;
            default:
                i.c.a.a.c cVarB2 = i.c.a.a.c.b(i2);
                return cVarB2 == null ? i.c.a.a.c.UNKNOWN : cVarB2;
        }
    }
}
