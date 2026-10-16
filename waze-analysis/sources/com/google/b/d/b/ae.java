package com.google.b.d.b;

import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f7081a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f7082b;

    ae(x xVar, Callable callable) {
        this.f7081a = xVar;
        this.f7082b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        x xVarC = j.c(j.a(), this.f7081a);
        try {
            return this.f7082b.call();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.f7082b + "]";
    }
}
