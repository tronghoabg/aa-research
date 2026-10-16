package com.waze.main_screen.w.a;

import com.waze.an.a.a.z;
import com.waze.config.ConfigValues;
import com.waze.settings.hb;
import com.waze.settings.hc;
import com.waze.settings.hd;
import com.waze.ui.a.l;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final bn f27858a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f27859b;

    /* renamed from: c, reason: collision with root package name */
    private final af f27860c;

    public c(hd hdVar, z zVar) {
        x.f(hdVar, "settings");
        x.f(zVar, "config");
        bn bnVarB = ck.b(f((hc) hd.b().d()));
        this.f27858a = bnVarB;
        this.f27859b = bnVarB;
        af afVarP = l.p(this, null);
        this.f27860c = afVarP;
        ai.m(ai.K(hd.b(), new b(this, null)), afVarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(hc hcVar) {
        if (hcVar instanceof hb) {
            return ((hb) hcVar).a();
        }
        return null;
    }

    @Override // com.waze.main_screen.w.a.a
    public final ch a() {
        return this.f27859b;
    }

    @Override // com.waze.main_screen.w.a.a
    public final void b() {
        hd.a();
    }

    @Override // com.waze.main_screen.w.a.a
    public final void c(String str) {
        x.f(str, "page");
        ConfigValues.CONFIG_VALUE_FTE_QUICK_NAVIGATION_CLICKED.d(true);
        hd.c(str, null);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f27860c, bo.g("Closed", null));
    }
}
