package com.waze.main_screen.h.a;

import com.waze.ui.a.l;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements a, com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.g.a.a f26448a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f26449b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f26450c;

    /* renamed from: d, reason: collision with root package name */
    private final af f26451d;

    public f(com.waze.main_screen.g.a.a aVar) {
        x.f(aVar, "floatingNotificationDataRepository");
        this.f26448a = aVar;
        bn bnVarB = ck.b(null);
        this.f26449b = bnVarB;
        this.f26450c = bnVarB;
        af afVarP = l.p(this, "FloatingNotificationStateHolderImpl");
        this.f26451d = afVarP;
        aj.z(afVarP, null, null, new e(this, null), 3);
    }

    @Override // com.waze.main_screen.h.a.a
    public final ch a() {
        return this.f26450c;
    }

    @Override // com.waze.main_screen.h.a.a
    public final void b() {
        this.f26449b.e(null);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f26451d, null);
    }
}
