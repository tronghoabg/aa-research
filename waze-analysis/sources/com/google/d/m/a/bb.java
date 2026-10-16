package com.google.d.m.a;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8018a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.d.d.bn f8019b;

    /* synthetic */ bb(boolean z, com.google.d.d.bn bnVar) {
        this.f8018a = z;
        this.f8019b = bnVar;
    }

    public final bm a(Callable callable, Executor executor) {
        return new ak(this.f8019b, this.f8018a, executor, callable);
    }

    public final bm b(af afVar, Executor executor) {
        return new ak(this.f8019b, this.f8018a, executor, afVar);
    }
}
