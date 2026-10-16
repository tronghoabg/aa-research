package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai extends w {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.api.q f4747a;

    public ai(com.google.android.gms.common.api.q qVar) {
        this.f4747a = qVar;
    }

    @Override // com.google.android.gms.common.api.t
    public final Looper a() {
        return this.f4747a.g();
    }

    @Override // com.google.android.gms.common.api.t
    public final void d(l lVar) {
        this.f4747a.t(lVar);
    }
}
