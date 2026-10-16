package com.waze.sharedui.web;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.v.dm;
import com.google.v.du;
import i.b.l.ih;
import i.b.l.ii;
import i.b.l.il;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import l.a.abe;
import l.a.abf;
import l.a.abh;
import l.a.abn;
import l.a.abp;
import l.a.acn;
import l.a.acp;
import l.a.acr;
import l.a.act;
import l.a.adj;
import l.a.ads;
import l.a.aen;
import l.a.aep;
import l.a.afw;
import l.a.afx;
import l.a.axs;
import l.a.bpu;
import l.a.bpx;
import l.a.eo;
import l.a.ep;
import l.a.ez;
import l.a.fb;
import l.a.ti;
import l.a.tl;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private static as f39337a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f39338b;

    as() {
        this.f39338b = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    private final EnumSet K(String str) {
        ?? r2 = this.f39338b;
        String strE = at.e(str);
        for (Map.Entry entry : r2.entrySet()) {
            if (((Pattern) entry.getKey()).matcher(strE).matches()) {
                return ((ar) entry.getValue()).f39335a;
            }
        }
        return EnumSet.noneOf(ih.class);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static synchronized as a() {
        Map<String, ?> map;
        Map<String, ?> map2;
        if (f39337a == null) {
            as asVar = new as();
            f39337a = asVar;
            if (!com.waze.sharedui.h.m()) {
                com.waze.shared_infra.i.h.d("WebPermissionsManager", "CUIInterface is not set");
            }
            ?? r2 = asVar.f39338b;
            r2.clear();
            Context contextA = com.waze.sharedui.h.k().a();
            if (contextA != null) {
                int i2 = 0;
                Map<String, ?> all = contextA.getSharedPreferences("waze.WebUrlPermissions", 0).getAll();
                Map<String, ?> all2 = contextA.getSharedPreferences("waze.WebUrlUsages", 0).getAll();
                for (String str : all.keySet()) {
                    Object obj = all.get(str);
                    Object obj2 = all2.get(str);
                    if ((obj instanceof Integer) && (obj2 instanceof String)) {
                        Pattern patternCompile = Pattern.compile(str);
                        int iIntValue = ((Integer) obj).intValue();
                        EnumSet enumSetNoneOf = EnumSet.noneOf(ih.class);
                        ih[] ihVarArrValues = ih.values();
                        int length = ihVarArrValues.length;
                        int i3 = i2;
                        while (i3 < length) {
                            ih ihVar = ihVarArrValues[i3];
                            if (ihVar != ih.UNKNOWN) {
                                map2 = all2;
                                if ((ihVar.getNumber() & iIntValue) == ihVar.getNumber()) {
                                    enumSetNoneOf.add(ihVar);
                                }
                            } else {
                                map2 = all2;
                            }
                            i3++;
                            all2 = map2;
                        }
                        map = all2;
                        r2.put(patternCompile, new ar(enumSetNoneOf, (String) obj2));
                    } else {
                        map = all2;
                        com.waze.shared_infra.i.h.d("WebPermissionsManager", "Invalid cached url permission: " + String.valueOf(obj) + ", key: " + str);
                    }
                    all2 = map;
                    i2 = 0;
                }
            }
            com.waze.sharedui.h.k().j(new com.waze.settings.q(asVar));
        }
        return f39337a;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    public static /* synthetic */ void c(as asVar, il ilVar) {
        if (ilVar.getWebUrlsCount() == 0) {
            com.waze.shared_infra.i.h.b("WebPermissionsManager", "Didn't get Web URL white-list! Use cached one...");
            return;
        }
        ?? r7 = asVar.f39338b;
        r7.clear();
        for (ii iiVar : ilVar.getWebUrlsList()) {
            EnumSet enumSetNoneOf = EnumSet.noneOf(ih.class);
            enumSetNoneOf.addAll(iiVar.getPermissionsList());
            r7.put(Pattern.compile(iiVar.getUrlWithHostPattern()), new ar(enumSetNoneOf, iiVar.getDescription()));
        }
        Context contextA = com.waze.sharedui.h.k().a();
        SharedPreferences.Editor editorEdit = contextA.getSharedPreferences("waze.WebUrlPermissions", 0).edit();
        editorEdit.clear();
        SharedPreferences.Editor editorEdit2 = contextA.getSharedPreferences("waze.WebUrlUsages", 0).edit();
        editorEdit2.clear();
        for (Pattern pattern : r7.keySet()) {
            Iterator it = ((ar) r7.get(pattern)).f39335a.iterator();
            int number = 0;
            while (it.hasNext()) {
                number |= ((ih) it.next()).getNumber();
            }
            editorEdit.putInt(pattern.pattern(), number);
            editorEdit2.putString(pattern.pattern(), ((ar) r7.get(pattern)).f39336b);
        }
        editorEdit.apply();
        editorEdit2.apply();
    }

    public final /* synthetic */ act A() {
        du duVarBuild = ((dm) this.f39338b).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (act) duVarBuild;
    }

    public final void B(acn acnVar) {
        h.g.b.x.f(acnVar, "value");
        ((acr) this.f39338b).a(acnVar);
    }

    public final void C(acp acpVar) {
        h.g.b.x.f(acpVar, "value");
        ((acr) this.f39338b).b(acpVar);
    }

    public final /* synthetic */ abh D() {
        du duVarBuild = ((dm) this.f39338b).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (abh) duVarBuild;
    }

    public final void E(abe abeVar) {
        h.g.b.x.f(abeVar, "value");
        ((abf) this.f39338b).a(abeVar);
    }

    public final void F(bpu bpuVar) {
        h.g.b.x.f(bpuVar, "value");
        ((abf) this.f39338b).b(bpuVar);
    }

    public final void G(bpx bpxVar) {
        h.g.b.x.f(bpxVar, "value");
        ((abf) this.f39338b).c(bpxVar);
    }

    public final /* synthetic */ l.b.r H() {
        du duVarBuild = ((dm) this.f39338b).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (l.b.r) duVarBuild;
    }

    public final void I(l.b.o oVar) {
        h.g.b.x.f(oVar, "value");
        ((l.b.j) this.f39338b).a(oVar);
    }

    public final void J(l.b.q qVar) {
        h.g.b.x.f(qVar, "value");
        ((l.b.j) this.f39338b).b(qVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    final String b(String str) {
        ?? r2 = this.f39338b;
        String strE = at.e(str);
        for (Map.Entry entry : r2.entrySet()) {
            if (((Pattern) entry.getKey()).matcher(strE).matches()) {
                return ((ar) entry.getValue()).f39336b;
            }
        }
        return null;
    }

    final boolean d(String str) {
        return K(str).contains(ih.ADVIL_API_ENABLED);
    }

    final boolean e(String str) {
        return K(str).contains(ih.FEEDBACK_API_ENABLED);
    }

    final boolean f(String str) {
        return K(str).contains(ih.FILE_UPLOADING_ENABLED);
    }

    final boolean g(String str) {
        return !K(str).isEmpty();
    }

    final boolean h(String str) {
        return K(str).contains(ih.JAVASCRIPT_ENABLED);
    }

    final boolean i(String str) {
        return K(str).contains(ih.REQUIRE_RT_SESSION_INFO);
    }

    public final Object j(e.a.k kVar) {
        kVar.d(this.f39338b);
        return h.ab.f48028a;
    }

    public final /* synthetic */ fb k() {
        du duVarBuild = ((dm) this.f39338b).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (fb) duVarBuild;
    }

    public final void l(ti tiVar) {
        h.g.b.x.f(tiVar, "value");
        ((ez) this.f39338b).e(tiVar);
    }

    public final void m(tl tlVar) {
        h.g.b.x.f(tlVar, "value");
        ((ez) this.f39338b).f(tlVar);
    }

    public final void n(abn abnVar) {
        h.g.b.x.f(abnVar, "value");
        ((ez) this.f39338b).g(abnVar);
    }

    public final void o(abp abpVar) {
        h.g.b.x.f(abpVar, "value");
        ((ez) this.f39338b).h(abpVar);
    }

    public final void p(axs axsVar) {
        h.g.b.x.f(axsVar, "value");
        ((ez) this.f39338b).i(axsVar);
    }

    public final /* synthetic */ ep q() {
        du duVarBuild = ((dm) this.f39338b).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (ep) duVarBuild;
    }

    public final void r(String str) {
        h.g.b.x.f(str, "value");
        ((eo) this.f39338b).a(str);
    }

    public final void s(String str) {
        h.g.b.x.f(str, "value");
        ((eo) this.f39338b).b(str);
    }

    public final void t(String str) {
        h.g.b.x.f(str, "value");
        ((eo) this.f39338b).c(str);
    }

    public final /* synthetic */ afx u() {
        du duVarBuild = ((dm) this.f39338b).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (afx) duVarBuild;
    }

    public final void v(double d2) {
        ((afw) this.f39338b).a(d2);
    }

    public final void w(double d2) {
        ((afw) this.f39338b).b(d2);
    }

    public final /* synthetic */ aep x() {
        du duVarBuild = ((dm) this.f39338b).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (aep) duVarBuild;
    }

    public final void y(adj adjVar) {
        h.g.b.x.f(adjVar, "value");
        ((aen) this.f39338b).a(adjVar);
    }

    public final void z(ads adsVar) {
        h.g.b.x.f(adsVar, "value");
        ((aen) this.f39338b).b(adsVar);
    }

    public as(Object obj) {
        this.f39338b = obj;
    }
}
