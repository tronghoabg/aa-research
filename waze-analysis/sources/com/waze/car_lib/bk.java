package com.waze.car_lib;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bk implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bl f19189a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f19190b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19191c;

    bk(bl blVar, com.waze.ifs.ui.y yVar, int i2) {
        this.f19191c = i2;
        this.f19189a = blVar;
        this.f19190b = yVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        if (this.f19191c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.ifs.ui.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.waze.sound.u, java.lang.Object] */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        if (this.f19191c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
            this.f19190b.a(null);
            this.f19189a.getLifecycle().removeObserver(this);
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
            h.g.b.x.f(lifecycleOwner, "owner");
            this.f19189a.c().d(this.f19190b);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        if (this.f19191c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        if (this.f19191c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        if (this.f19191c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        if (this.f19191c != 0) {
            h.g.b.x.f(lifecycleOwner, "owner");
        } else {
            h.g.b.x.f(lifecycleOwner, "owner");
        }
    }

    bk(com.waze.sound.u uVar, bl blVar, int i2) {
        this.f19191c = i2;
        this.f19190b = uVar;
        this.f19189a = blVar;
    }
}
