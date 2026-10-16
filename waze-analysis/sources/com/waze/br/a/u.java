package com.waze.br.a;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final u f17309a = new u();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f17310b;

    static {
        Boolean boolB = ConfigValues.CONFIG_VALUE_SEARCH_MATE_AGENT_FEATURE_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        f17310b = boolB.booleanValue();
    }

    @Override // com.waze.br.a.t
    public final boolean a() {
        return f17310b;
    }

    @Override // com.waze.t.b.c
    public final String b() {
        return null;
    }

    @Override // com.waze.t.b.c
    public final void c() {
    }

    @Override // com.waze.t.b.c
    public final boolean e() {
        return true;
    }

    @Override // com.waze.t.b.c
    public final boolean q() {
        return false;
    }
}
