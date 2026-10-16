package com.google.android.play.core.a;

import android.content.Context;
import com.waze.navigate.di;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.e f6950a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.e f6951b;

    /* renamed from: c, reason: collision with root package name */
    private final c.b.e f6952c;

    private o(c.b.e eVar, c.b.e eVar2, c.b.e eVar3) {
        this.f6950a = eVar;
        this.f6951b = eVar2;
        this.f6952c = eVar3;
    }

    public static o a(c.b.e eVar, c.b.e eVar2, c.b.e eVar3) {
        return new o(eVar, eVar2, eVar3);
    }

    @Override // g.a.a, f.a.a
    public final /* bridge */ /* synthetic */ Object get() {
        Context context = (Context) this.f6950a.get();
        di diVar = (di) this.f6951b.get();
        ((u) this.f6952c).get();
        new t(null);
        return new l(context, diVar);
    }
}
