package com.waze.settings.tree.c;

import android.view.View;
import com.waze.search.v2.o;
import com.waze.settings.tree.d.s;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {
    public static final void a(com.waze.settings.tree.f fVar, com.waze.config.b bVar) {
        x.f(fVar, "<this>");
        x.f(bVar, "booleanConfig");
        fVar.A(new d(bVar));
    }

    public static final void b(com.waze.settings.tree.f fVar, boolean z) {
        x.f(fVar, "<this>");
        fVar.A(new e(z, 0));
    }

    public static final void c(s sVar, boolean z, String str, View view) {
        x.f(sVar, "<this>");
        sVar.B().R(view, z);
        String strValueOf = String.valueOf(!z);
        Locale locale = Locale.US;
        x.e(locale, "US");
        String upperCase = strValueOf.toUpperCase(locale);
        x.e(upperCase, "toUpperCase(...)");
        String strValueOf2 = String.valueOf(z);
        Locale locale2 = Locale.US;
        x.e(locale2, "US");
        String upperCase2 = strValueOf2.toUpperCase(locale2);
        x.e(upperCase2, "toUpperCase(...)");
        o.h(sVar, str, upperCase, upperCase2);
    }

    public static void e(com.waze.shared_infra.i.e eVar, String str, Throwable th) {
        com.waze.shared_infra.i.f fVar = new com.waze.shared_infra.i.f(str);
        fVar.a(th);
        eVar.b(fVar);
    }

    public static void f(com.waze.shared_infra.i.e eVar, String str, Throwable th) {
        com.waze.shared_infra.i.f fVar = new com.waze.shared_infra.i.f(str);
        fVar.a(th);
        eVar.g(fVar);
    }

    public static final com.waze.shared_infra.i.e g(org.a.d.k.b bVar, String str) {
        x.f(bVar, "<this>");
        x.f(str, "tag");
        int i2 = ar.f48106a;
        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVar.a(new m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c(str));
        x.e(eVarA, "provide(...)");
        return eVarA;
    }
}
