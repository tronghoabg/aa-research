package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public class ukr {
    public static final ukr a = c().e();
    public final zjj b;
    public final aazw c;
    public final yfq d;
    public final yfq e;
    public final zkh f;
    public final Boolean g;
    public final yfq h;
    public final zjo i;
    public final acjg j;
    public final yfq k;
    public final abgj l;
    public final String m;
    public final String n;
    public final String o;
    public final ablq p;
    public final ygr q;
    public final abrv r;
    public final yfq s;
    public final abrw t;
    public final aaie u;
    public final aazx v;

    public ukr(yfq yfqVar, String str, String str2, String str3, ygr ygrVar) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        yfqVar.getClass();
        this.k = yfqVar;
        this.l = null;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = null;
        ygrVar.getClass();
        this.q = ygrVar;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
    }

    public static wu c() {
        wu wuVar = new wu();
        yly ylyVar = yly.a;
        ylyVar.getClass();
        wuVar.d = ylyVar;
        return wuVar;
    }

    @ResultIgnorabilityUnspecified
    public final ukr a(ukr ukrVar) {
        wu wuVar = new wu(this);
        wuVar.c = ukrVar.m;
        return wuVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ukr b(java.lang.String r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            wu r0 = new wu
            r0.<init>(r2)
            int r5 = r5 + (-1)
            r2 = 1
            if (r5 == r2) goto L11
            r1 = 3
            if (r5 == r1) goto L11
            r1 = 4
            if (r5 == r1) goto L11
            r2 = 0
        L11:
            r5 = 0
            if (r2 == 0) goto L1d
            boolean r1 = defpackage.woy.am(r3)
            if (r1 != 0) goto L1d
            r0.b = r3
            goto L23
        L1d:
            r0.b = r5
            if (r2 != 0) goto L23
        L21:
            r4 = r5
            goto L2a
        L23:
            boolean r2 = defpackage.woy.am(r4)
            if (r2 == 0) goto L2a
            goto L21
        L2a:
            r0.a = r4
            ukr r2 = r0.e()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukr.b(java.lang.String, java.lang.String, int):ukr");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ukr) {
            ukr ukrVar = (ukr) obj;
            zjj zjjVar = ukrVar.b;
            aazw aazwVar = ukrVar.c;
            yfq yfqVar = ukrVar.d;
            yfq yfqVar2 = ukrVar.e;
            zkh zkhVar = ukrVar.f;
            Boolean bool = ukrVar.g;
            yfq yfqVar3 = ukrVar.h;
            zjo zjoVar = ukrVar.i;
            acjg acjgVar = ukrVar.j;
            if (yrm.W(this.k, ukrVar.k)) {
                abgj abgjVar = ukrVar.l;
                String str = this.m;
                if (str != null ? str.equals(ukrVar.m) : ukrVar.m == null) {
                    String str2 = this.n;
                    if (str2 != null ? str2.equals(ukrVar.n) : ukrVar.n == null) {
                        String str3 = this.o;
                        if (str3 != null ? str3.equals(ukrVar.o) : ukrVar.o == null) {
                            ablq ablqVar = ukrVar.p;
                            if (this.q.equals(ukrVar.q)) {
                                abrv abrvVar = ukrVar.r;
                                yfq yfqVar4 = ukrVar.s;
                                abrw abrwVar = ukrVar.t;
                                aaie aaieVar = ukrVar.u;
                                aazx aazxVar = ukrVar.v;
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.k.hashCode() ^ 474194425;
        String str = this.m;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = iHashCode * 583896283;
        String str2 = this.n;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int i2 = i ^ iHashCode2;
        String str3 = this.o;
        return (((yly) this.q).c ^ (((((i2 * 1000003) ^ iHashCode3) * 1000003) ^ (str3 != null ? str3.hashCode() : 0)) * (-721379959))) * (-429739981);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.c();
        xxgVarAo.b("highlightIdForRAP", null);
        xxgVarAo.b("mapsEngineInfo", null);
        xxgVarAo.b("entityForSpotlightHighlighting", null);
        xxgVarAo.b("contextForSpotlightHighlighting", null);
        xxgVarAo.b("spotlightClientType", null);
        xxgVarAo.b("spotlightExperiments", this.k);
        xxgVarAo.b("customRestyleDescription", this.m);
        xxgVarAo.b("searchPipeMetadata", null);
        xxgVarAo.b("buildingSelectionPipeMetadata", null);
        xxgVarAo.b("selectedPoisForLoreRecBoosting", null);
        xxgVarAo.b("placeViewsForLoreRecBoosting", null);
        xxgVarAo.b("majorEventPaintRequest", null);
        xxgVarAo.b("paintTemplateFingerprint", this.n);
        xxgVarAo.b("mapviewStyleTableId", this.o);
        xxgVarAo.b("travelHighlightInfo", null);
        xxgVarAo.b("featuresForRestrictedZoneHighlighting", this.q);
        xxgVarAo.b("currentUserLocation", null);
        xxgVarAo.b("evcsVisualizationOptions", null);
        xxgVarAo.b("recentlyNavigatedPlaces", null);
        xxgVarAo.b("directionsPipeParameters", null);
        xxgVarAo.b("mapActionsPipeMetadata", null);
        xxgVarAo.b("renderingAttributes", null);
        return xxgVarAo.toString();
    }

    public ukr() {
        throw null;
    }
}
