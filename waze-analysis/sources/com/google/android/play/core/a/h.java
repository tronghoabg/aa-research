package com.google.android.play.core.a;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.e f6933a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f6934b;

    private h(c.b.e eVar, int i2) {
        this.f6934b = i2;
        this.f6933a = eVar;
    }

    public static h a(c.b.e eVar) {
        return new h(eVar, 0);
    }

    public static h b(c.b.e eVar) {
        return new h(eVar, 1);
    }

    @Override // g.a.a, f.a.a
    public final /* synthetic */ Object get() {
        int i2 = this.f6934b;
        c.b.e eVar = this.f6933a;
        if (i2 == 0) {
            return new g((l) eVar.get());
        }
        String packageName = ((Context) eVar.get()).getPackageName();
        com.waze.web.r.g(packageName);
        return packageName;
    }
}
