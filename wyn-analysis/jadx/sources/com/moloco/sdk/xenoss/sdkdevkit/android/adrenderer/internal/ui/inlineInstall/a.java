package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import Hf.k0;
import Hf.x0;
import Va.M6;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1457v;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class a implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30877a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f30878b = k0.c(Boolean.TRUE);

    /* renamed from: c, reason: collision with root package name */
    public static boolean f30879c;

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
    public final void onStart(InterfaceC1457v owner) {
        AbstractC3340k.e(owner, "owner");
        Boolean bool = Boolean.TRUE;
        x0 x0Var = f30878b;
        x0Var.getClass();
        x0Var.k(null, bool);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1457v interfaceC1457v) {
        Boolean bool = Boolean.FALSE;
        x0 x0Var = f30878b;
        x0Var.getClass();
        x0Var.k(null, bool);
    }
}
