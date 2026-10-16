package com.waze.view.text;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InstantAutoComplete f45374a;

    a(InstantAutoComplete instantAutoComplete) {
        Objects.requireNonNull(instantAutoComplete);
        this.f45374a = instantAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45374a.f45371e = true;
    }
}
