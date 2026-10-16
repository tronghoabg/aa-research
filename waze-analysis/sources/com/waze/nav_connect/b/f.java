package com.waze.nav_connect.b;

import com.waze.config.ConfigValues;
import com.waze.navigate.en;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.nav_connect.a f30794a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f30795b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f30796c;

    public f(en enVar, com.waze.nav_connect.a aVar) {
        ch chVarU;
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(aVar, "config");
        this.f30794a = aVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "NavConnectButtonFteTooltipStateHolder");
        this.f30795b = afVarP;
        if (com.waze.nav_connect.a.e()) {
            kotlinx.coroutines.b.k kVarS = ai.s(enVar.ag(), ai.G(false), aVar.a(), aVar.b(), new e(this, null));
            int i2 = bz.f51630a;
            chVarU = ai.V(kVarS, afVarP, by.b(), new c((byte[]) null));
        } else {
            chVarU = ai.U(ck.b(new c(false)));
        }
        this.f30796c = chVarU;
    }

    @Override // com.waze.nav_connect.b.d
    public final ch a() {
        return this.f30796c;
    }

    @Override // com.waze.nav_connect.b.d
    public final void b() {
        com.waze.nav_connect.a aVar = this.f30794a;
        if (aVar.d()) {
            return;
        }
        aVar.c();
        Long lB = ConfigValues.CONFIG_VALUE_NAV_CONNECT_TOOLTIP_SHOWN_SESSIONS.b();
        h.g.b.x.e(lB, "getValue(...)");
        ConfigValues.CONFIG_VALUE_NAV_CONNECT_TOOLTIP_SHOWN_SESSIONS.d(Long.valueOf(lB.longValue() + 1));
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f30795b, null);
    }
}
