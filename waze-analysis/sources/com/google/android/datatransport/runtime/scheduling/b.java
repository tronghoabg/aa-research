package com.google.android.datatransport.runtime.scheduling;

import c.b.e;
import com.google.android.datatransport.runtime.scheduling.a.r;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final e f4298a;

    /* renamed from: b, reason: collision with root package name */
    private final e f4299b;

    /* renamed from: c, reason: collision with root package name */
    private final e f4300c;

    /* renamed from: d, reason: collision with root package name */
    private final e f4301d;

    /* renamed from: e, reason: collision with root package name */
    private final e f4302e;

    private b(e eVar, e eVar2, e eVar3, e eVar4, e eVar5) {
        this.f4298a = eVar;
        this.f4299b = eVar2;
        this.f4300c = eVar3;
        this.f4301d = eVar4;
        this.f4302e = eVar5;
    }

    public static b b(e eVar, e eVar2, e eVar3, e eVar4, e eVar5) {
        return new b(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    @Override // g.a.a, f.a.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a get() {
        return new a((Executor) this.f4298a.get(), (com.google.android.datatransport.runtime.backends.b) this.f4299b.get(), ((d) this.f4300c).get(), (r) this.f4301d.get(), (r) this.f4302e.get());
    }
}
