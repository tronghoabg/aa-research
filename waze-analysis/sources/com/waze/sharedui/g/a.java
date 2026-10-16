package com.waze.sharedui.g;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f38940a;

    a(i iVar) {
        Objects.requireNonNull(iVar);
        this.f38940a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f38940a;
        iVar.f38961d.l().aa(iVar.f38967j);
    }
}
