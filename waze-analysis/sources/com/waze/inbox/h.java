package com.waze.inbox;

import android.support.v7.widget.ed;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends ed {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f24644a;

    h(i iVar) {
        Objects.requireNonNull(iVar);
        this.f24644a = iVar;
    }

    @Override // android.support.v7.widget.ed
    public final void onChanged() {
        this.f24644a.o();
    }
}
