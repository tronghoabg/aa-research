package com.waze.inbox;

import com.waze.ConfigManager;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w implements com.waze.bi.j {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f24689a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f24690b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f24691c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f24692d;

    public w(long j2, h.g.a.l lVar, ch chVar, ConfigManager configManager) {
        h.g.b.x.f(lVar, "saveTimestamp");
        h.g.b.x.f(chVar, "inboxManagerState");
        h.g.b.x.f(configManager, "configManager");
        this.f24689a = lVar;
        this.f24690b = chVar;
        bn bnVarB = ck.b(Long.valueOf(j2));
        this.f24691c = bnVarB;
        this.f24692d = ai.y(ai.q(bnVarB, chVar, new v(null)));
    }

    @Override // com.waze.bi.j
    public final kotlinx.coroutines.b.k e() {
        return this.f24692d;
    }

    @Override // com.waze.bi.j
    public final void f() {
        Long lValueOf = Long.valueOf(((l) this.f24690b.d()).b());
        this.f24691c.e(lValueOf);
        this.f24689a.invoke(lValueOf);
    }
}
