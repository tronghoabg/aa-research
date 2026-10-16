package com.google.android.datatransport.runtime.scheduling.a;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.e f4297a;

    private w(c.b.e eVar) {
        this.f4297a = eVar;
    }

    public static w b(c.b.e eVar) {
        return new w(eVar);
    }

    @Override // g.a.a, f.a.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v get() {
        return new v((Context) this.f4297a.get(), com.google.android.datatransport.runtime.p.b(), c.b().intValue());
    }
}
