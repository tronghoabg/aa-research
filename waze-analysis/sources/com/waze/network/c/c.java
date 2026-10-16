package com.waze.network.c;

import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.waze.an;
import com.waze.ao;
import com.waze.cf;
import com.waze.network.f.e;
import com.waze.sharedui.e.g;
import com.waze.z;
import h.g.b.x;
import h.i;
import i.b.ai;
import i.b.am;
import i.b.l.aj;
import i.b.l.ak;
import i.b.l.al;
import i.b.l.ap;
import i.b.l.aq;
import i.b.l.ar;
import i.b.m;
import i.b.n;
import i.b.o;
import i.b.u;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements com.waze.network.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final e f32173a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f32174b;

    /* renamed from: c, reason: collision with root package name */
    private final g f32175c;

    /* renamed from: d, reason: collision with root package name */
    private final ao f32176d;

    /* renamed from: e, reason: collision with root package name */
    private final a f32177e;

    public c(e eVar, com.waze.shared_infra.q.e eVar2, g gVar, ao aoVar, a aVar) {
        x.f(eVar, "sessionConfig");
        x.f(eVar2, "clock");
        x.f(gVar, "locationService");
        x.f(aoVar, "carManager");
        x.f(aVar, "nativeDataProvider");
        this.f32173a = eVar;
        this.f32174b = eVar2;
        this.f32175c = gVar;
        this.f32176d = aoVar;
        this.f32177e = aVar;
    }

    @Override // com.waze.network.a.a
    public final i.b.l.ao a(boolean z) {
        m mVar;
        n nVar;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        com.waze.sharedui.e.c cVarA = this.f32175c.a();
        aj ajVarNewBuilder = i.b.l.ao.newBuilder();
        ajVarNewBuilder.f(this.f32174b.a());
        e eVar = this.f32173a;
        eVar.s();
        ajVarNewBuilder.e();
        eVar.r();
        ajVarNewBuilder.r();
        ajVarNewBuilder.i(u.ANDROID_DEVICE);
        ajVarNewBuilder.j(z ? eVar.i() : eVar.m());
        String strN = eVar.n();
        if (strN == null) {
            strN = "";
        }
        ajVarNewBuilder.m(strN);
        ajVarNewBuilder.p(eVar.j());
        ajVarNewBuilder.n(eVar.g());
        ajVarNewBuilder.o(eVar.h());
        ajVarNewBuilder.h(Build.BRAND);
        ajVarNewBuilder.s(eVar.l());
        ajVarNewBuilder.u(eVar.o());
        ajVarNewBuilder.q(eVar.k());
        ajVarNewBuilder.k(eVar.q());
        a aVar = this.f32177e;
        ajVarNewBuilder.t(aVar.c());
        com.waze.m.a aVarD = eVar.d();
        z zVar = z.f45553a;
        com.waze.m.a aVar2 = com.waze.m.a.f25477a;
        switch (aVarD.ordinal()) {
            case 0:
                mVar = m.RELEASE;
                break;
            case 1:
                mVar = m.ALPHA;
                break;
            case 2:
                mVar = m.BETA;
                break;
            case 3:
                mVar = m.DEV;
                break;
            case 4:
                mVar = m.PRE_BETA;
                break;
            case 5:
                mVar = m.DOGFOOD;
                break;
            case 6:
                mVar = m.FISHFOOD;
                break;
            default:
                throw new i();
        }
        ajVarNewBuilder.c(mVar);
        if (cVarA != null) {
            ajVarNewBuilder.l(com.waze.sharedui.e.e.e(cVarA.f()));
        }
        String strB = aVar.b();
        if (strB != null) {
            ak akVarNewBuilder = al.newBuilder();
            akVarNewBuilder.b(o.TRANSPORT);
            akVarNewBuilder.a(strB);
            ajVarNewBuilder.a(akVarNewBuilder);
        }
        String strA = aVar.a();
        if (strA != null) {
            ak akVarNewBuilder2 = al.newBuilder();
            akVarNewBuilder2.b(o.AUDIO);
            akVarNewBuilder2.a(strA);
            ajVarNewBuilder.a(akVarNewBuilder2);
        }
        int iOrdinal = eVar.c().ordinal();
        if (iOrdinal == 0) {
            nVar = n.WAZE;
        } else {
            if (iOrdinal != 1) {
                throw new i();
            }
            nVar = n.WAZE_ANDROID_AUTOMOTIVE_OS;
        }
        ajVarNewBuilder.d(nVar);
        i.b.al alVarNewBuilder = am.newBuilder();
        ai aiVarNewBuilder = i.b.aj.newBuilder();
        aiVarNewBuilder.a();
        aiVarNewBuilder.b();
        alVarNewBuilder.a(aiVarNewBuilder);
        ajVarNewBuilder.g(alVarNewBuilder);
        x.e(ajVarNewBuilder, "setDebugOptions(...)");
        cf cfVar = (cf) this.f32176d.a().d();
        x.c(displayMetrics);
        if ((cfVar instanceof an) || (cfVar instanceof com.waze.al)) {
            ap apVarNewBuilder = ar.newBuilder();
            apVarNewBuilder.b(aq.BUILT_IN);
            apVarNewBuilder.c(displayMetrics.widthPixels);
            apVarNewBuilder.a(displayMetrics.heightPixels);
            ajVarNewBuilder.b(apVarNewBuilder);
        } else if (cfVar instanceof com.waze.ak) {
            ap apVarNewBuilder2 = ar.newBuilder();
            apVarNewBuilder2.b(aq.BUILT_IN);
            com.waze.ak akVar = (com.waze.ak) cfVar;
            Integer numValueOf = Integer.valueOf(akVar.a().getWidth());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            apVarNewBuilder2.c(numValueOf != null ? numValueOf.intValue() : displayMetrics.widthPixels);
            Integer numValueOf2 = Integer.valueOf(akVar.a().getHeight());
            Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
            apVarNewBuilder2.a(num != null ? num.intValue() : displayMetrics.heightPixels);
            ajVarNewBuilder.b(apVarNewBuilder2);
        } else {
            if (!(cfVar instanceof com.waze.am)) {
                throw new i();
            }
            ap apVarNewBuilder3 = ar.newBuilder();
            apVarNewBuilder3.b(aq.BUILT_IN);
            apVarNewBuilder3.c(displayMetrics.widthPixels);
            apVarNewBuilder3.a(displayMetrics.heightPixels);
            ajVarNewBuilder.b(apVarNewBuilder3);
            com.waze.am amVar = (com.waze.am) cfVar;
            if (amVar.a().getWidth() > 0 && amVar.a().getHeight() > 0) {
                ap apVarNewBuilder4 = ar.newBuilder();
                apVarNewBuilder4.b(aq.ANDROID_AUTO);
                apVarNewBuilder4.c(amVar.a().getWidth());
                apVarNewBuilder4.a(amVar.a().getHeight());
                ajVarNewBuilder.b(apVarNewBuilder4);
            }
        }
        i.b.l.ao aoVarBuild = ajVarNewBuilder.build();
        x.e(aoVarBuild, "build(...)");
        return aoVarBuild;
    }
}
