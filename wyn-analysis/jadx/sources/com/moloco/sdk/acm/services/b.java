package com.moloco.sdk.acm.services;

import Ef.H;
import Va.M6;
import Y2.B;
import android.content.Context;
import android.os.PowerManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1457v;
import ba.C1521a;
import ef.C2532p;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class b implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final B f28466a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f28467b;

    /* renamed from: c, reason: collision with root package name */
    public final C1521a f28468c;

    public b(B b5, Kd.a scope, C1521a c1521a) {
        AbstractC3340k.e(scope, "scope");
        this.f28466a = b5;
        this.f28467b = scope;
        this.f28468c = c1521a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC1457v interfaceC1457v) {
        M6.c(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1457v interfaceC1457v) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC1457v interfaceC1457v) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC1457v interfaceC1457v) {
        M6.d(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC1457v interfaceC1457v) {
        M6.e(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1457v interfaceC1457v) {
        C1521a c1521a = this.f28468c;
        if (!((PowerManager) ((C2532p) c1521a.f19415c).getValue()).isInteractive()) {
            Context context = (Context) c1521a.f19414b;
            if (context.getPackageManager().checkPermission("android.permission.USE_FULL_SCREEN_INTENT", context.getPackageName()) == 0) {
                e.c("ApplicationLifecycleObserver", "Application onStop - skipping upload (device not interactive)");
                return;
            }
        }
        e.c("ApplicationLifecycleObserver", "Application onStop");
        H.D(this.f28467b, null, new a(this, null), 3);
    }
}
