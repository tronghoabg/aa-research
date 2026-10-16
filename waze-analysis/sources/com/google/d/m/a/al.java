package com.google.d.m.a;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class al implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final al f7989a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ al[] f7990b;

    static {
        al alVar = new al();
        f7989a = alVar;
        f7990b = new al[]{alVar};
    }

    private al() {
    }

    public static al[] values() {
        return (al[]) f7990b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
