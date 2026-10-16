package com.waze.nav_connect;

import com.waze.config.ConfigValues;
import com.waze.n.ac;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final bn f30708a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f30709b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f30710c;

    public a() {
        bn bnVarB = ck.b(false);
        this.f30708a = bnVarB;
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_NAV_CONNECT_TOOLTIP_SHOWN_SESSIONS;
        x.e(cVar, "CONFIG_VALUE_NAV_CONNECT_TOOLTIP_SHOWN_SESSIONS");
        this.f30709b = ac.p(cVar);
        this.f30710c = ai.U(bnVarB);
    }

    public static final boolean e() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_NAV_CONNECT_FEATURE_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    public static final long f() {
        Long lB = ConfigValues.CONFIG_VALUE_NAV_CONNECT_TOOLTIP_MAX_SESSIONS.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    public final ch a() {
        return this.f30710c;
    }

    public final ch b() {
        return this.f30709b;
    }

    public final void c() {
        this.f30708a.e(true);
    }

    public final boolean d() {
        return ((Boolean) this.f30708a.d()).booleanValue();
    }
}
