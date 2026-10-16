package com.waze.view.bottom;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f45000a;

    a(b bVar) {
        Objects.requireNonNull(bVar);
        this.f45000a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45000a.f45001a.setVisibility(8);
    }
}
