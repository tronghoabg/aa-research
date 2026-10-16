package com.bumptech.glide.manager;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    final b f3528a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3529b;

    d(Context context, b bVar) {
        this.f3529b = context.getApplicationContext();
        this.f3528a = bVar;
    }

    @Override // com.bumptech.glide.manager.g
    public final void g() {
    }

    @Override // com.bumptech.glide.manager.g
    public final void h() {
        v.a(this.f3529b).b(this.f3528a);
    }

    @Override // com.bumptech.glide.manager.g
    public final void i() {
        v.a(this.f3529b).c(this.f3528a);
    }
}
