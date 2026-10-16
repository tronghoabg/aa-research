package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ulm {
    public static final defpackage.ulm a = c().e();
    public final defpackage.zkl b;
    public final defpackage.abaz c;
    public final defpackage.ygw d;
    public final defpackage.ygw e;
    public final defpackage.zlj f;
    public final java.lang.Boolean g;
    public final defpackage.ygw h;
    public final defpackage.zkq i;
    public final defpackage.acki j;
    public final defpackage.ygw k;
    public final defpackage.abhm l;
    public final java.lang.String m;
    public final java.lang.String n;
    public final java.lang.String o;
    public final defpackage.abmt p;
    public final defpackage.yhx q;
    public final defpackage.absy r;
    public final defpackage.ygw s;
    public final defpackage.absz t;
    public final defpackage.aajh u;
    public final defpackage.abba v;

    public ulm(defpackage.ygw ygwVar, java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.yhx yhxVar) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        ygwVar.getClass();
        this.k = ygwVar;
        this.l = null;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = null;
        yhxVar.getClass();
        this.q = yhxVar;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
    }

    public static defpackage.xb c() {
        defpackage.xb xbVar = new defpackage.xb();
        defpackage.ynd yndVar = defpackage.ynd.a;
        yndVar.getClass();
        xbVar.d = yndVar;
        return xbVar;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.ulm a(defpackage.ulm ulmVar) {
        defpackage.xb xbVar = new defpackage.xb(this);
        xbVar.c = ulmVar.m;
        return xbVar.e();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    public final defpackage.ulm b(java.lang.String str, java.lang.String str2, int i) {
        defpackage.xb xbVar = new defpackage.xb(this);
        int i2 = i - 1;
        boolean z = true;
        if (i2 != 1 && i2 != 3 && i2 != 4) {
            z = false;
        }
        if (!z || defpackage.ysr.bw(str)) {
            xbVar.b = null;
            if (!z) {
                str2 = null;
            }
            xbVar.a = str2;
            return xbVar.e();
        }
        xbVar.b = str;
        if (defpackage.ysr.bw(str2)) {
            str2 = null;
        }
        xbVar.a = str2;
        return xbVar.e();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ulm) {
            defpackage.ulm ulmVar = (defpackage.ulm) obj;
            defpackage.zkl zklVar = ulmVar.b;
            defpackage.abaz abazVar = ulmVar.c;
            defpackage.ygw ygwVar = ulmVar.d;
            defpackage.ygw ygwVar2 = ulmVar.e;
            defpackage.zlj zljVar = ulmVar.f;
            java.lang.Boolean bool = ulmVar.g;
            defpackage.ygw ygwVar3 = ulmVar.h;
            defpackage.zkq zkqVar = ulmVar.i;
            defpackage.acki ackiVar = ulmVar.j;
            if (defpackage.ysr.W(this.k, ulmVar.k)) {
                defpackage.abhm abhmVar = ulmVar.l;
                java.lang.String str = this.m;
                if (str != null ? str.equals(ulmVar.m) : ulmVar.m == null) {
                    java.lang.String str2 = this.n;
                    if (str2 != null ? str2.equals(ulmVar.n) : ulmVar.n == null) {
                        java.lang.String str3 = this.o;
                        if (str3 != null ? str3.equals(ulmVar.o) : ulmVar.o == null) {
                            defpackage.abmt abmtVar = ulmVar.p;
                            if (this.q.equals(ulmVar.q)) {
                                defpackage.absy absyVar = ulmVar.r;
                                defpackage.ygw ygwVar4 = ulmVar.s;
                                defpackage.absz abszVar = ulmVar.t;
                                defpackage.aajh aajhVar = ulmVar.u;
                                defpackage.abba abbaVar = ulmVar.v;
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
        java.lang.String str = this.m;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = iHashCode * 583896283;
        java.lang.String str2 = this.n;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int i2 = i ^ iHashCode2;
        java.lang.String str3 = this.o;
        return (((defpackage.ynd) this.q).c ^ (((((i2 * 1000003) ^ iHashCode3) * 1000003) ^ (str3 != null ? str3.hashCode() : 0)) * (-721379959))) * (-429739981);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.c();
        xymVarBy.b("highlightIdForRAP", null);
        xymVarBy.b("mapsEngineInfo", null);
        xymVarBy.b("entityForSpotlightHighlighting", null);
        xymVarBy.b("contextForSpotlightHighlighting", null);
        xymVarBy.b("spotlightClientType", null);
        xymVarBy.b("spotlightExperiments", this.k);
        xymVarBy.b("customRestyleDescription", this.m);
        xymVarBy.b("searchPipeMetadata", null);
        xymVarBy.b("buildingSelectionPipeMetadata", null);
        xymVarBy.b("selectedPoisForLoreRecBoosting", null);
        xymVarBy.b("placeViewsForLoreRecBoosting", null);
        xymVarBy.b("majorEventPaintRequest", null);
        xymVarBy.b("paintTemplateFingerprint", this.n);
        xymVarBy.b("mapviewStyleTableId", this.o);
        xymVarBy.b("travelHighlightInfo", null);
        xymVarBy.b("featuresForRestrictedZoneHighlighting", this.q);
        xymVarBy.b("currentUserLocation", null);
        xymVarBy.b("evcsVisualizationOptions", null);
        xymVarBy.b("recentlyNavigatedPlaces", null);
        xymVarBy.b("directionsPipeParameters", null);
        xymVarBy.b("mapActionsPipeMetadata", null);
        xymVarBy.b("renderingAttributes", null);
        return xymVarBy.toString();
    }

    public ulm() {
        throw null;
    }
}
