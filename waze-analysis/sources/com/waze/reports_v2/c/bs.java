package com.waze.reports_v2.c;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bs implements af {

    /* renamed from: a, reason: collision with root package name */
    public static final bs f34281a = new bs();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.coroutines.b.bn f34282b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f34283c;

    /* renamed from: d, reason: collision with root package name */
    private static final kotlinx.coroutines.b.ch f34284d;

    /* renamed from: e, reason: collision with root package name */
    private static String f34285e;

    /* renamed from: f, reason: collision with root package name */
    private static com.waze.reports_v2.b.ac f34286f;

    static {
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        f34282b = bnVarB;
        f34283c = h.a.r.k(new h.k("en", "en-US"), new h.k("en-GB", "en-UK"), new h.k("es", "es-ES"), new h.k("fr", "fr-FR"), new h.k("pt", "pt-BR"));
        f34284d = kotlinx.coroutines.b.ai.U(bnVarB);
        f34286f = com.waze.reports_v2.b.ac.f34014a;
    }

    private bs() {
    }

    public static final kotlinx.coroutines.b.ch f() {
        return f34284d;
    }

    @Override // com.waze.reports_v2.c.af
    public final boolean a() {
        return f34285e != null;
    }

    public final com.waze.reports_v2.b.ac b() {
        return f34286f;
    }

    public final String c() {
        return f34285e;
    }

    public final void d(com.waze.reports_v2.b.ac acVar) {
        h.g.b.x.f(acVar, "<set-?>");
        f34286f = acVar;
    }

    public final void e(String str) {
        String str2 = (String) f34283c.get(str);
        if (str2 != null) {
            str = str2;
        }
        f34285e = str;
        f34282b.e(str);
    }
}
