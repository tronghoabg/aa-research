package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ad implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f9089a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f9090b;

    ad(n nVar, Runnable runnable, int i2) {
        this.f9090b = i2;
        this.f9089a = runnable;
        Objects.requireNonNull(nVar);
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i2 = this.f9090b;
        if (i2 != 0) {
            ?? r2 = this.f9089a;
            if (i2 != 1) {
                return Boolean.valueOf(((ae) r2).f9098h.t());
            }
            r2.run();
            return null;
        }
        try {
            boolean zB = ((ae) this.f9089a).f9095e.b();
            if (!zB) {
                com.google.firebase.crashlytics.a.i.a().h("Initialization marker file was not properly removed.");
            }
            return Boolean.valueOf(zB);
        } catch (Exception e2) {
            com.google.firebase.crashlytics.a.i.a().e("Problem encountered deleting Crashlytics initialization marker.", e2);
            return false;
        }
    }

    ad(ae aeVar, int i2) {
        this.f9090b = i2;
        Objects.requireNonNull(aeVar);
        this.f9089a = aeVar;
    }

    ad(ae aeVar, int i2, byte[] bArr) {
        this.f9090b = i2;
        Objects.requireNonNull(aeVar);
        this.f9089a = aeVar;
    }
}
