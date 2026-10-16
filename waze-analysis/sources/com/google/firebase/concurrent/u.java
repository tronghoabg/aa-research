package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final u f9037a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ u[] f9038b;

    static {
        u uVar = new u();
        f9037a = uVar;
        f9038b = new u[]{uVar};
    }

    private u() {
    }

    public static u[] values() {
        return (u[]) f9038b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
