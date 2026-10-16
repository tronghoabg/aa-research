package com.waze.ac;

import com.waze.stats.ax;
import h.g.b.x;
import l.a.bmp;
import l.a.bmq;
import l.a.ud;
import l.a.ue;
import l.a.ug;
import l.a.uh;
import l.a.uj;
import l.a.um;
import l.a.uo;
import l.a.up;
import l.a.uq;
import l.a.ur;
import l.a.us;
import l.a.uu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s implements r {

    /* renamed from: b, reason: collision with root package name */
    private final ax f13871b;

    public s(ax axVar) {
        x.f(axVar, "statsReporter");
        this.f13871b = axVar;
    }

    private static final bmq f(com.waze.messages.c cVar) {
        bmp bmpVarNewBuilder = bmq.newBuilder();
        String str = cVar.w;
        if (str != null) {
            bmpVarNewBuilder.b(str);
        }
        String str2 = cVar.D;
        if (str2 != null) {
            bmpVarNewBuilder.a(str2);
        }
        bmq bmqVarBuild = bmpVarNewBuilder.build();
        x.e(bmqVarBuild, "build(...)");
        return bmqVarBuild;
    }

    private static final uj g(k kVar) {
        uh uhVarNewBuilder = uj.newBuilder();
        uhVarNewBuilder.b(kVar.a().a());
        String strB = kVar.b();
        if (strB != null) {
            uhVarNewBuilder.a(strB);
        }
        uj ujVarBuild = uhVarNewBuilder.build();
        x.e(ujVarBuild, "build(...)");
        return ujVarBuild;
    }

    @Override // com.waze.ac.r
    public final void a(com.waze.messages.c cVar, ud udVar, k kVar) {
        x.f(cVar, "data");
        x.f(udVar, "action");
        x.f(kVar, "info");
        bmq bmqVarF = f(cVar);
        ue ueVarNewBuilder = ug.newBuilder();
        ueVarNewBuilder.d(bmqVarF);
        ueVarNewBuilder.a(udVar);
        ueVarNewBuilder.b(g(kVar));
        ug ugVarBuild = ueVarNewBuilder.build();
        x.e(ugVarBuild, "build(...)");
        us usVarNewBuilder = uu.newBuilder();
        usVarNewBuilder.a(ugVarBuild);
        uu uuVarBuild = usVarNewBuilder.build();
        x.e(uuVarBuild, "build(...)");
        com.waze.sharedui.utils.o.n(this.f13871b, uuVarBuild);
    }

    @Override // com.waze.ac.r
    public final void b(q qVar, i iVar, Boolean bool, k kVar) {
        x.f(qVar, "data");
        x.f(iVar, "action");
        x.f(kVar, "info");
        ud udVarA = iVar.a();
        x.f(qVar, "data");
        x.f(udVarA, "action");
        x.f(kVar, "info");
        bmp bmpVarNewBuilder = bmq.newBuilder();
        String strA = qVar.a();
        if (strA != null) {
            bmpVarNewBuilder.b(strA);
        }
        String strB = qVar.b();
        if (strB != null) {
            bmpVarNewBuilder.a(strB);
        }
        bmq bmqVarBuild = bmpVarNewBuilder.build();
        x.e(bmqVarBuild, "build(...)");
        ue ueVarNewBuilder = ug.newBuilder();
        ueVarNewBuilder.d(bmqVarBuild);
        ueVarNewBuilder.a(udVarA);
        ueVarNewBuilder.b(g(kVar));
        if (bool != null) {
            ueVarNewBuilder.c(bool.booleanValue());
        }
        ug ugVarBuild = ueVarNewBuilder.build();
        x.e(ugVarBuild, "build(...)");
        us usVarNewBuilder = uu.newBuilder();
        usVarNewBuilder.a(ugVarBuild);
        uu uuVarBuild = usVarNewBuilder.build();
        x.e(uuVarBuild, "build(...)");
        com.waze.sharedui.utils.o.n(this.f13871b, uuVarBuild);
    }

    @Override // com.waze.ac.r
    public final void c(q qVar, k kVar) {
        x.f(qVar, "data");
        x.f(kVar, "info");
        bmp bmpVarNewBuilder = bmq.newBuilder();
        x.f(bmpVarNewBuilder, "builder");
        String strA = qVar.a();
        if (strA != null) {
            x.f(strA, "value");
            bmpVarNewBuilder.b(strA);
        }
        String strB = qVar.b();
        if (strB != null) {
            x.f(strB, "value");
            bmpVarNewBuilder.a(strB);
        }
        bmq bmqVarBuild = bmpVarNewBuilder.build();
        x.e(bmqVarBuild, "build(...)");
        um umVarNewBuilder = uo.newBuilder();
        umVarNewBuilder.b(bmqVarBuild);
        umVarNewBuilder.a(g(kVar));
        uo uoVarBuild = umVarNewBuilder.build();
        x.e(uoVarBuild, "build(...)");
        us usVarNewBuilder = uu.newBuilder();
        usVarNewBuilder.b(uoVarBuild);
        uu uuVarBuild = usVarNewBuilder.build();
        x.e(uuVarBuild, "build(...)");
        com.waze.sharedui.utils.o.n(this.f13871b, uuVarBuild);
    }

    @Override // com.waze.ac.r
    public final void d(com.waze.messages.c cVar, k kVar) {
        x.f(cVar, "data");
        x.f(kVar, "info");
        bmq bmqVarF = f(cVar);
        um umVarNewBuilder = uo.newBuilder();
        umVarNewBuilder.b(bmqVarF);
        umVarNewBuilder.a(g(kVar));
        uo uoVarBuild = umVarNewBuilder.build();
        x.e(uoVarBuild, "build(...)");
        us usVarNewBuilder = uu.newBuilder();
        usVarNewBuilder.b(uoVarBuild);
        uu uuVarBuild = usVarNewBuilder.build();
        x.e(uuVarBuild, "build(...)");
        com.waze.sharedui.utils.o.n(this.f13871b, uuVarBuild);
    }

    @Override // com.waze.ac.r
    public final void e(com.waze.messages.c cVar, uq uqVar, k kVar) {
        x.f(cVar, "data");
        x.f(uqVar, "reason");
        x.f(kVar, "info");
        us usVarNewBuilder = uu.newBuilder();
        x.f(usVarNewBuilder, "builder");
        up upVarNewBuilder = ur.newBuilder();
        x.f(upVarNewBuilder, "builder");
        bmq bmqVarF = f(cVar);
        x.f(bmqVarF, "value");
        upVarNewBuilder.c(bmqVarF);
        x.f(uqVar, "value");
        upVarNewBuilder.b(uqVar);
        uj ujVarG = g(kVar);
        x.f(ujVarG, "value");
        upVarNewBuilder.a(ujVarG);
        ur urVarBuild = upVarNewBuilder.build();
        x.e(urVarBuild, "build(...)");
        ur urVar = urVarBuild;
        x.f(urVar, "value");
        usVarNewBuilder.c(urVar);
        uu uuVarBuild = usVarNewBuilder.build();
        x.e(uuVarBuild, "build(...)");
        com.waze.sharedui.utils.o.n(this.f13871b, uuVarBuild);
    }
}
