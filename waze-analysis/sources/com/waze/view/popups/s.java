package com.waze.view.popups;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f45346a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f45347b;

    /* synthetic */ s(t tVar) {
        Objects.requireNonNull(tVar);
        this.f45346a = tVar;
        this.f45347b = false;
    }

    public final void a() {
        this.f45347b = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f45347b) {
            return;
        }
        this.f45346a.d();
    }
}
