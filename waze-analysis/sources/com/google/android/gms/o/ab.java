package com.google.android.gms.o;

import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ab implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aa f5738a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f5739b;

    ab(aa aaVar, Callable callable) {
        this.f5738a = aaVar;
        this.f5739b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5738a.t(this.f5739b.call());
        } catch (Exception e2) {
            this.f5738a.s(e2);
        } catch (Throwable th) {
            this.f5738a.s(new RuntimeException(th));
        }
    }
}
