package com.waze.sound;

import com.waze.config.ConfigValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bt implements bs {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.eb f39566a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39567b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.af f39568c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f39569d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f39570e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f39571f;

    public bt(bq bqVar, com.waze.settings.eb ebVar, com.waze.shared_infra.i.e eVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(bqVar, "config");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(abVar, "ioDispatcher");
        this.f39566a = ebVar;
        this.f39567b = eVar;
        this.f39568c = kotlinx.coroutines.aj.e(abVar);
        String strB = ConfigValues.CONFIG_VALUE_VOICE_GUIDANCE_AVAILABLE_GUIDANCE_MODES.b();
        h.g.b.x.e(strB, "getValue(...)");
        this.f39569d = kotlinx.coroutines.b.ck.b(i(strB));
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(bp.f39558e);
        this.f39570e = bnVarB;
        this.f39571f = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(String str) {
        String str2 = str;
        if (str2.length() == 0) {
            str2 = "yes|alerts|no";
        }
        List listAf = h.n.o.af(str2, new String[]{"|"}, 0, 6);
        bp bpVar = bp.f39554a;
        ArrayList arrayList = new ArrayList();
        Iterator it = listAf.iterator();
        while (it.hasNext()) {
            bp bpVarE = com.waze.sharedui.api.i.e((String) it.next());
            if (bpVarE != null) {
                arrayList.add(bpVarE);
            }
        }
        return arrayList;
    }

    private static final com.waze.settings.dw j(bp bpVar) {
        bp bpVar2 = bp.f39554a;
        int iOrdinal = bpVar.ordinal();
        if (iOrdinal == 0) {
            return com.waze.settings.dw.f37091a;
        }
        if (iOrdinal == 1) {
            return com.waze.settings.dw.f37094d;
        }
        if (iOrdinal == 2) {
            return com.waze.settings.dw.f37095e;
        }
        if (iOrdinal == 3) {
            return com.waze.settings.dw.f37093c;
        }
        if (iOrdinal == 4) {
            return com.waze.settings.dw.f37092b;
        }
        throw new h.i();
    }

    @Override // com.waze.sound.bs
    public final kotlinx.coroutines.b.ch a() {
        return kotlinx.coroutines.b.ai.U(this.f39569d);
    }

    @Override // com.waze.sound.bs
    public final kotlinx.coroutines.b.ch b() {
        return this.f39571f;
    }

    @Override // com.waze.sound.bs
    public final void c() {
        kotlinx.coroutines.b.k kVarK = ConfigValues.CONFIG_VALUE_NAVIGATION_GUIDANCE_MODE.k();
        h.g.b.x.e(kVarK, "getFlow(...)");
        kotlinx.coroutines.b.k kVarK2 = ConfigValues.CONFIG_VALUE_VOICE_GUIDANCE_AVAILABLE_GUIDANCE_MODES.k();
        h.g.b.x.e(kVarK2, "getFlow(...)");
        kotlinx.coroutines.b.k kVarK3 = ConfigValues.CONFIG_VALUE_VOICE_GUIDANCE_GUIDANCE_DEFAULT_MODE.k();
        h.g.b.x.e(kVarK3, "getFlow(...)");
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.r(kVarK, kVarK2, kVarK3, new da(this, (h.c.e) null, 1)), new av(this, (h.c.e) null, 2)), this.f39568c);
    }

    @Override // com.waze.sound.bs
    public final void d(bp bpVar, bu buVar) {
        h.g.b.x.f(bpVar, "mode");
        h.g.b.x.f(buVar, "source");
        List list = (List) a().d();
        if (list.contains(bpVar)) {
            this.f39566a.d(j((bp) this.f39570e.d()), j(bpVar), buVar);
            String strA = bpVar.a();
            h.g.b.x.f(strA, "value");
            ConfigValues.CONFIG_VALUE_NAVIGATION_GUIDANCE_MODE.d(strA);
            return;
        }
        this.f39567b.g("Available Modes: " + list + " Trying to set invalid guidance mode: " + bpVar);
    }
}
