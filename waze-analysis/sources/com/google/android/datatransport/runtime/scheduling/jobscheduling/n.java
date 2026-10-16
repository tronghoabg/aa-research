package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.a.r;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.e f4349a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.e f4350b;

    /* renamed from: c, reason: collision with root package name */
    private final c.b.e f4351c;

    /* renamed from: d, reason: collision with root package name */
    private final c.b.e f4352d;

    private n(c.b.e eVar, c.b.e eVar2, c.b.e eVar3, c.b.e eVar4) {
        this.f4349a = eVar;
        this.f4350b = eVar2;
        this.f4351c = eVar3;
        this.f4352d = eVar4;
    }

    public static n b(c.b.e eVar, c.b.e eVar2, c.b.e eVar3, c.b.e eVar4) {
        return new n(eVar, eVar2, eVar3, eVar4);
    }

    @Override // g.a.a, f.a.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m get() {
        return new m((Executor) this.f4349a.get(), (r) this.f4350b.get(), ((com.google.android.datatransport.runtime.scheduling.d) this.f4351c).get(), (r) this.f4352d.get());
    }
}
