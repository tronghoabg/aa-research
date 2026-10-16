package com.waze.car_lib.r;

import android.text.TextUtils;
import com.waze.R;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.f.co f20954a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.settings.g.a.a f20955b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.settings.g.b.a f20956c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f20957d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f20958e;

    /* renamed from: f, reason: collision with root package name */
    private String f20959f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.p.p f20960g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f20961h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f20962i;

    /* renamed from: j, reason: collision with root package name */
    private String f20963j;

    public an(com.waze.car_lib.f.co coVar, com.waze.settings.g.a.a aVar, com.waze.settings.g.b.a aVar2, com.waze.shared_infra.o.a aVar3) {
        h.g.b.x.f(coVar, "controller");
        h.g.b.x.f(aVar, "dataSource");
        h.g.b.x.f(aVar2, "statsSender");
        h.g.b.x.f(aVar3, "stringProvider");
        this.f20954a = coVar;
        this.f20955b = aVar;
        this.f20956c = aVar2;
        this.f20957d = aVar3;
        kotlinx.coroutines.b.k kVarB = aVar.b();
        kotlinx.coroutines.af afVarG = coVar.G();
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        kotlinx.coroutines.b.ch chVarV = kotlinx.coroutines.b.ai.V(kVarB, afVarG, kotlinx.coroutines.b.by.a(5000L, 2), aVar.a());
        this.f20958e = chVarV;
        this.f20959f = "";
        String str = "";
        int i3 = 0;
        com.waze.car_lib.p.p pVar = new com.waze.car_lib.p.p(str, aVar3.c(R.string.SETTINGS_LICENCE_PLATE_TITLE, new Object[0]), i3, 4, (String) chVarV.d(), aVar3.c(R.string.AAOS_LICENSE_SETTING_DESCRIPTION, new Object[0]), aVar3.c(R.string.AAOS_LICENSE_SETTING_INSTRUCTIONS, new Object[0]), new com.waze.car_lib.p.co(aVar3.c(R.string.SAVE, new Object[0]), true, f((String) chVarV.d()), new h.g.a.a() { // from class: com.waze.car_lib.r.al
            @Override // h.g.a.a
            public final Object invoke() {
                return an.a(this.f20951a);
            }
        }), DisplayStrings.DS_TRIP_OVERVIEW_GENERAL_ERROR_MESSAGE);
        this.f20960g = pVar;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(pVar);
        this.f20961h = bnVarB;
        this.f20962i = kotlinx.coroutines.b.ai.U(bnVarB);
        kotlinx.coroutines.aj.z(coVar.G(), null, null, new j(this, (h.c.e) null, 3), 3);
    }

    static final h.ab a(an anVar) {
        String str = anVar.f20963j;
        if (str != null && f(str)) {
            anVar.f20955b.c(str);
            anVar.f20956c.b();
            anVar.f20954a.H(com.waze.car_lib.f.ct.f19466a);
        }
        return h.ab.f48028a;
    }

    private static final boolean f(String str) {
        String str2 = str;
        if (str2.length() == 0) {
            return true;
        }
        return str.length() == 2 && TextUtils.isDigitsOnly(str2);
    }

    public final kotlinx.coroutines.b.ch c() {
        return this.f20962i;
    }

    public final void d(String str, boolean z) {
        Object objD;
        com.waze.car_lib.p.p pVar;
        String strC;
        String str2;
        com.waze.car_lib.p.co coVarC;
        h.g.b.x.f(str, "licensePlate");
        boolean zF = f(str);
        if (zF) {
            if (!z && !h.g.b.x.n(this.f20959f, str)) {
                this.f20956c.a(com.waze.settings.dz.x, str, this.f20959f);
            }
            this.f20959f = str;
        }
        kotlinx.coroutines.b.bn bnVar = this.f20961h;
        do {
            objD = bnVar.d();
            pVar = (com.waze.car_lib.p.p) objD;
            strC = this.f20957d.c(R.string.SETTINGS_LICENCE_PLATE_LENGTH_ERROR, new Object[0]);
            if (true == zF) {
                strC = null;
            }
            str2 = true != z ? null : str;
            coVarC = pVar.c();
        } while (!bnVar.f(objD, com.waze.car_lib.p.p.j(pVar, str2, coVarC != null ? com.waze.car_lib.p.co.e(coVarC, zF) : null, strC)));
        this.f20963j = str;
    }
}
