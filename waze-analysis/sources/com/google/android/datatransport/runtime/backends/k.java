package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.e f4178a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.e f4179b;

    private k(c.b.e eVar, c.b.e eVar2) {
        this.f4178a = eVar;
        this.f4179b = eVar2;
    }

    public static k a(c.b.e eVar, c.b.e eVar2) {
        return new k(eVar, eVar2);
    }

    @Override // g.a.a, f.a.a
    public final /* bridge */ /* synthetic */ Object get() {
        return new j((Context) this.f4178a.get(), ((h) this.f4179b).get());
    }
}
