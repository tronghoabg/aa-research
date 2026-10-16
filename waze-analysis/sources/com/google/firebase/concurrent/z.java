package com.google.firebase.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final z f9048a;

    /* renamed from: b, reason: collision with root package name */
    private static final Handler f9049b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ z[] f9050c;

    static {
        z zVar = new z();
        f9048a = zVar;
        f9050c = new z[]{zVar};
        f9049b = new Handler(Looper.getMainLooper());
    }

    private z() {
    }

    public static z[] values() {
        return (z[]) f9050c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f9049b.post(runnable);
    }
}
