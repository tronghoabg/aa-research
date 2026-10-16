package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.e f4172a;

    private h(c.b.e eVar) {
        this.f4172a = eVar;
    }

    public static h b(c.b.e eVar) {
        return new h(eVar);
    }

    @Override // g.a.a, f.a.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g get() {
        return new g((Context) this.f4172a.get(), p.c(), p.d());
    }
}
