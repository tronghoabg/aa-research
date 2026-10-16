package com.waze.search.h;

import androidx.lifecycle.ViewModel;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bz extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final bx f35879a;

    public bz(bx bxVar) {
        h.g.b.x.f(bxVar, "searchEmptyStateScreenStateHolder");
        this.f35879a = bxVar;
        addCloseable((AutoCloseable) bxVar);
    }

    public final bx a() {
        return this.f35879a;
    }

    public final void b() {
        this.f35879a.x();
    }

    public final void c(String str) {
        h.g.b.x.f(str, "searchTerm");
        this.f35879a.H(str);
    }
}
