package com.google.d.m.a;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class av<V> extends com.google.d.d.be implements Future<V> {
    protected av() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.d.d.be
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract Future delegate();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return delegate().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return (V) delegate().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return delegate().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return delegate().isDone();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        return (V) delegate().get(j2, timeUnit);
    }
}
