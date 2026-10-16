package defpackage;

import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.StreetViewPanoramaLink;
import com.google.android.libraries.maps.model.StreetViewPanoramaLocation;
import com.google.maps.api.android.lib6.streetview.model.StreetViewNavigationArrow;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aagi {
    public static final aagi a = new aagi();
    public final String b;
    public final aagk c;
    public final LatLng d;
    public final Boolean e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final yfq j;
    public final Float k;
    public final Float l;
    public final yfq m;
    public final yfq n;
    private final String o;
    private final Boolean p;
    private final Boolean q;
    private final Integer r;
    private final Integer s;
    private final aags t;
    private final aagt u;

    /* JADX WARN: Multi-variable type inference failed */
    public aagi(String str, acih acihVar, aagt aagtVar) {
        int i;
        int i2;
        zkt.n(aagtVar, "DepthMap");
        acia aciaVar = acihVar.c;
        aciaVar = aciaVar == null ? acia.a : aciaVar;
        acie acieVar = acihVar.d;
        acieVar = acieVar == null ? acie.a : acieVar;
        achz achzVar = acihVar.e;
        achzVar = achzVar == null ? achz.a : achzVar;
        this.b = str == null ? aciaVar.j : str;
        this.o = aciaVar.j;
        this.p = Boolean.valueOf(aciaVar.c);
        acig acigVarB = acig.b(aciaVar.s);
        this.q = Boolean.valueOf(a.C(acigVarB == null ? acig.OUTDOOR : acigVarB, acig.INDOOR));
        acht achtVar = aciaVar.l;
        achtVar = achtVar == null ? acht.a : achtVar;
        double d = aahr.a;
        zkt.n(achtVar, "MapPointProto");
        this.d = new LatLng(aahr.b(achtVar.c), aahr.b(achtVar.d));
        this.e = Boolean.valueOf((aciaVar.b & 1024) != 0);
        this.f = aciaVar.m;
        Integer numValueOf = Integer.valueOf(aciaVar.f);
        this.g = numValueOf;
        Integer numValueOf2 = Integer.valueOf(aciaVar.g);
        this.r = numValueOf2;
        Integer numValueOf3 = Integer.valueOf(aciaVar.h);
        this.h = numValueOf3;
        Integer numValueOf4 = Integer.valueOf(aciaVar.i);
        this.i = numValueOf4;
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        int iIntValue3 = numValueOf3.intValue();
        int iIntValue4 = numValueOf4.intValue();
        aclh.o(iIntValue > 0, "panoramaWidthPx = %s", new Object[]{numValueOf});
        aclh.o(iIntValue2 > 0, "panoramaHeightPx = %s", new Object[]{numValueOf2});
        aclh.o(iIntValue3 > 0, "tileWidthPx = %s", new Object[]{numValueOf3});
        aclh.o(iIntValue4 > 0, "tileHeightPx = %s", new Object[]{numValueOf4});
        this.s = Integer.valueOf((iIntValue3 < iIntValue || iIntValue4 < iIntValue2) ? Math.max(0, (int) Math.ceil(aahr.f(Math.max(iIntValue / iIntValue3, iIntValue2 / iIntValue4)))) : 0);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 <= this.s.intValue(); i3++) {
            int iIntValue5 = this.s.intValue() - i3;
            arrayList.add(new zro(Integer.valueOf(this.g.intValue() >> iIntValue5), Integer.valueOf(this.r.intValue() >> iIntValue5)));
        }
        yfq yfqVarO = yfq.o(arrayList);
        this.j = yfqVarO;
        zro zroVar = (zro) yfqVarO.get(0);
        this.c = new aagk(this.b, 0, 0, 0, ((Integer) zroVar.a).intValue(), ((Integer) zroVar.b).intValue());
        int i4 = acieVar.b;
        float fB = -90.0f;
        if ((i4 & 64) != 0 && (i2 = acieVar.i) != 0) {
            fB = (float) aahr.b(i2);
        }
        float fB2 = 90.0f;
        if ((i4 & 128) != 0 && (i = acieVar.j) != 0) {
            fB2 = (float) aahr.b(i);
        }
        this.k = Float.valueOf(aahr.e(Math.min(fB, fB2)));
        this.l = Float.valueOf(aahr.e(Math.max(fB, fB2)));
        this.t = new aags(this.b, (float) aahr.b(acieVar.c), (float) aahr.a(acieVar.d), aahr.e((float) aahr.b(acieVar.e)));
        aboh abohVar = achzVar.e;
        StreetViewNavigationArrow[] streetViewNavigationArrowArr = new StreetViewNavigationArrow[abohVar.size()];
        aago[] aagoVarArr = new aago[abohVar.size()];
        for (int i5 = 0; i5 < abohVar.size(); i5++) {
            achy achyVar = (achy) abohVar.get(i5);
            String str2 = achyVar.d;
            float fA = (float) aahr.a(achyVar.c);
            streetViewNavigationArrowArr[i5] = new StreetViewNavigationArrow(str2, fA, achyVar.e);
            aagoVarArr[i5] = new aago(achyVar.f, fA);
        }
        this.m = yfq.p(streetViewNavigationArrowArr);
        this.n = yfq.p(aagoVarArr);
        this.u = aagtVar;
    }

    public final int a() {
        zkt.g(!i(), "NULL_TARGET");
        return this.r.intValue();
    }

    public final int b() {
        zkt.g(!i(), "NULL_TARGET");
        return this.s.intValue();
    }

    public final int c() {
        zkt.g(!i(), "NULL_TARGET");
        return this.i.intValue();
    }

    public final int d() {
        zkt.g(!i(), "NULL_TARGET");
        return this.h.intValue();
    }

    public final StreetViewPanoramaLocation e() {
        zkt.g(!i(), "NULL_TARGET");
        return new StreetViewPanoramaLocation((StreetViewPanoramaLink[]) this.m.toArray(new StreetViewPanoramaLink[0]), this.d, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aagi) {
            return a.C(this.b, ((aagi) obj).b);
        }
        return false;
    }

    public final aags f() {
        zkt.g(!i(), "NULL_TARGET");
        return this.t;
    }

    public final aagt g() {
        zkt.g(!i(), "NULL_TARGET");
        return this.u;
    }

    public final boolean h() {
        zkt.g(!i(), "NULL_TARGET");
        return this.q.booleanValue();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final boolean i() {
        return this == a;
    }

    public final String toString() {
        if (i()) {
            return "StreetViewPanoTarget[NULL]";
        }
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("imageKey", null);
        zsaVarA.b("panoId", this.b);
        zsaVarA.b("protoPanoId", this.o);
        zsaVarA.b("isDisabled", this.p);
        zsaVarA.b("isIndoor", this.q);
        zsaVarA.b("latLng", this.d);
        zsaVarA.b("copyrightStr", this.f);
        zsaVarA.b("originalImageWidthPx", this.g);
        zsaVarA.b("originalImageHeightPx", this.r);
        zsaVarA.b("tileWidthPx", this.h);
        zsaVarA.b("tileHeightPx", this.i);
        zsaVarA.b("originalImageMaxTileZoom", this.s);
        zsaVarA.b("minTiltVisibleDeg", this.k);
        zsaVarA.b("maxTiltVisibleDeg", this.l);
        zsaVarA.b("worldSceneOrientation", this.t);
        zsaVarA.b("links", this.m);
        zsaVarA.b("roadLabels", this.n);
        zsaVarA.b("zoomedImageWidthHeightPx", this.j);
        zsaVarA.b("depthMap", this.u);
        return zsaVarA.toString();
    }

    private aagi() {
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
