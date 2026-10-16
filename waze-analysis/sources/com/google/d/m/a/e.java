package com.google.d.m.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e<V> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final k<V> f8066a;

    /* renamed from: b, reason: collision with root package name */
    final bm<? extends V> f8067b;

    e(k kVar, bm bmVar) {
        this.f8066a = kVar;
        this.f8067b = bmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8066a.valueField != this) {
            return;
        }
        if (s.w(this.f8066a, this, k.f(this.f8067b))) {
            k.y(this.f8066a, false);
        }
    }
}
