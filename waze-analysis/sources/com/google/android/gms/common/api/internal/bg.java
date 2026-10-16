package com.google.android.gms.common.api.internal;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bj f4793a;

    bg(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.f4793a = bjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4793a.f4803g.e(new com.google.android.gms.common.d(4));
    }
}
