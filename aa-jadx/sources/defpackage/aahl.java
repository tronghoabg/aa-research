package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aahl {
    public static final defpackage.aahl a = new defpackage.aahl();
    public final java.lang.String b;
    public final defpackage.aahn c;
    public final com.google.android.libraries.maps.model.LatLng d;
    public final java.lang.Boolean e;
    public final java.lang.String f;
    public final java.lang.Integer g;
    public final java.lang.Integer h;
    public final java.lang.Integer i;
    public final defpackage.ygw j;
    public final java.lang.Float k;
    public final java.lang.Float l;
    public final defpackage.ygw m;
    public final defpackage.ygw n;
    private final java.lang.String o;
    private final java.lang.Boolean p;
    private final java.lang.Boolean q;
    private final java.lang.Integer r;
    private final java.lang.Integer s;
    private final defpackage.aahv t;
    private final defpackage.aahw u;

    /* JADX WARN: Multi-variable type inference failed */
    public aahl(java.lang.String str, defpackage.acjj acjjVar, defpackage.aahw aahwVar) {
        int i;
        int i2;
        defpackage.zlv.n(aahwVar, "DepthMap");
        defpackage.acjc acjcVar = acjjVar.c;
        acjcVar = acjcVar == null ? defpackage.acjc.a : acjcVar;
        defpackage.acjg acjgVar = acjjVar.d;
        acjgVar = acjgVar == null ? defpackage.acjg.a : acjgVar;
        defpackage.acjb acjbVar = acjjVar.e;
        acjbVar = acjbVar == null ? defpackage.acjb.a : acjbVar;
        this.b = str == null ? acjcVar.j : str;
        this.o = acjcVar.j;
        this.p = java.lang.Boolean.valueOf(acjcVar.c);
        defpackage.acji acjiVarB = defpackage.acji.b(acjcVar.s);
        this.q = java.lang.Boolean.valueOf(defpackage.a.B(acjiVarB == null ? defpackage.acji.OUTDOOR : acjiVarB, defpackage.acji.INDOOR));
        defpackage.aciv acivVar = acjcVar.l;
        acivVar = acivVar == null ? defpackage.aciv.a : acivVar;
        double d = defpackage.aaiu.a;
        defpackage.zlv.n(acivVar, "MapPointProto");
        this.d = new com.google.android.libraries.maps.model.LatLng(defpackage.aaiu.b(acivVar.c), defpackage.aaiu.b(acivVar.d));
        this.e = java.lang.Boolean.valueOf((acjcVar.b & 1024) != 0);
        this.f = acjcVar.m;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(acjcVar.f);
        this.g = numValueOf;
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(acjcVar.g);
        this.r = numValueOf2;
        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(acjcVar.h);
        this.h = numValueOf3;
        java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(acjcVar.i);
        this.i = numValueOf4;
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        int iIntValue3 = numValueOf3.intValue();
        int iIntValue4 = numValueOf4.intValue();
        defpackage.acmj.h(iIntValue > 0, "panoramaWidthPx = %s", new java.lang.Object[]{numValueOf});
        defpackage.acmj.h(iIntValue2 > 0, "panoramaHeightPx = %s", new java.lang.Object[]{numValueOf2});
        defpackage.acmj.h(iIntValue3 > 0, "tileWidthPx = %s", new java.lang.Object[]{numValueOf3});
        defpackage.acmj.h(iIntValue4 > 0, "tileHeightPx = %s", new java.lang.Object[]{numValueOf4});
        this.s = java.lang.Integer.valueOf((iIntValue3 < iIntValue || iIntValue4 < iIntValue2) ? java.lang.Math.max(0, (int) java.lang.Math.ceil(defpackage.aaiu.f(java.lang.Math.max(iIntValue / iIntValue3, iIntValue2 / iIntValue4)))) : 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 = 0; i3 <= this.s.intValue(); i3++) {
            int iIntValue5 = this.s.intValue() - i3;
            arrayList.add(new defpackage.zss(java.lang.Integer.valueOf(this.g.intValue() >> iIntValue5), java.lang.Integer.valueOf(this.r.intValue() >> iIntValue5)));
        }
        defpackage.ygw ygwVarO = defpackage.ygw.o(arrayList);
        this.j = ygwVarO;
        defpackage.zss zssVar = (defpackage.zss) ygwVarO.get(0);
        this.c = new defpackage.aahn(this.b, 0, 0, 0, ((java.lang.Integer) zssVar.a).intValue(), ((java.lang.Integer) zssVar.b).intValue());
        int i4 = acjgVar.b;
        float fB = -90.0f;
        if ((i4 & 64) != 0 && (i2 = acjgVar.i) != 0) {
            fB = (float) defpackage.aaiu.b(i2);
        }
        float fB2 = 90.0f;
        if ((i4 & 128) != 0 && (i = acjgVar.j) != 0) {
            fB2 = (float) defpackage.aaiu.b(i);
        }
        this.k = java.lang.Float.valueOf(defpackage.aaiu.e(java.lang.Math.min(fB, fB2)));
        this.l = java.lang.Float.valueOf(defpackage.aaiu.e(java.lang.Math.max(fB, fB2)));
        this.t = new defpackage.aahv(this.b, (float) defpackage.aaiu.b(acjgVar.c), (float) defpackage.aaiu.a(acjgVar.d), defpackage.aaiu.e((float) defpackage.aaiu.b(acjgVar.e)));
        defpackage.abpj abpjVar = acjbVar.e;
        com.google.maps.api.android.lib6.streetview.model.StreetViewNavigationArrow[] streetViewNavigationArrowArr = new com.google.maps.api.android.lib6.streetview.model.StreetViewNavigationArrow[abpjVar.size()];
        defpackage.aahr[] aahrVarArr = new defpackage.aahr[abpjVar.size()];
        for (int i5 = 0; i5 < abpjVar.size(); i5++) {
            defpackage.acja acjaVar = (defpackage.acja) abpjVar.get(i5);
            java.lang.String str2 = acjaVar.d;
            float fA = (float) defpackage.aaiu.a(acjaVar.c);
            streetViewNavigationArrowArr[i5] = new com.google.maps.api.android.lib6.streetview.model.StreetViewNavigationArrow(str2, fA, acjaVar.e);
            aahrVarArr[i5] = new defpackage.aahr(acjaVar.f, fA);
        }
        this.m = defpackage.ygw.p(streetViewNavigationArrowArr);
        this.n = defpackage.ygw.p(aahrVarArr);
        this.u = aahwVar;
    }

    public final int a() {
        defpackage.zlv.g(!i(), "NULL_TARGET");
        return this.r.intValue();
    }

    public final int b() {
        defpackage.zlv.g(!i(), "NULL_TARGET");
        return this.s.intValue();
    }

    public final int c() {
        defpackage.zlv.g(!i(), "NULL_TARGET");
        return this.i.intValue();
    }

    public final int d() {
        defpackage.zlv.g(!i(), "NULL_TARGET");
        return this.h.intValue();
    }

    public final com.google.android.libraries.maps.model.StreetViewPanoramaLocation e() {
        defpackage.zlv.g(!i(), "NULL_TARGET");
        return new com.google.android.libraries.maps.model.StreetViewPanoramaLocation((com.google.android.libraries.maps.model.StreetViewPanoramaLink[]) this.m.toArray(new com.google.android.libraries.maps.model.StreetViewPanoramaLink[0]), this.d, this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aahl) {
            return defpackage.a.B(this.b, ((defpackage.aahl) obj).b);
        }
        return false;
    }

    public final defpackage.aahv f() {
        defpackage.zlv.g(!i(), "NULL_TARGET");
        return this.t;
    }

    public final defpackage.aahw g() {
        defpackage.zlv.g(!i(), "NULL_TARGET");
        return this.u;
    }

    public final boolean h() {
        defpackage.zlv.g(!i(), "NULL_TARGET");
        return this.q.booleanValue();
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.b});
    }

    public final boolean i() {
        return this == a;
    }

    public final java.lang.String toString() {
        if (i()) {
            return "StreetViewPanoTarget[NULL]";
        }
        defpackage.zte zteVarA = defpackage.zte.a(this);
        zteVarA.b("imageKey", null);
        zteVarA.b("panoId", this.b);
        zteVarA.b("protoPanoId", this.o);
        zteVarA.b("isDisabled", this.p);
        zteVarA.b("isIndoor", this.q);
        zteVarA.b("latLng", this.d);
        zteVarA.b("copyrightStr", this.f);
        zteVarA.b("originalImageWidthPx", this.g);
        zteVarA.b("originalImageHeightPx", this.r);
        zteVarA.b("tileWidthPx", this.h);
        zteVarA.b("tileHeightPx", this.i);
        zteVarA.b("originalImageMaxTileZoom", this.s);
        zteVarA.b("minTiltVisibleDeg", this.k);
        zteVarA.b("maxTiltVisibleDeg", this.l);
        zteVarA.b("worldSceneOrientation", this.t);
        zteVarA.b("links", this.m);
        zteVarA.b("roadLabels", this.n);
        zteVarA.b("zoomedImageWidthHeightPx", this.j);
        zteVarA.b("depthMap", this.u);
        return zteVarA.toString();
    }

    private aahl() {
        this.b = null;
        this.o = null;
        this.c = null;
        this.p = null;
        this.q = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.r = null;
        this.h = null;
        this.i = null;
        this.s = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.t = null;
        this.m = null;
        this.n = null;
        this.u = null;
    }
}
