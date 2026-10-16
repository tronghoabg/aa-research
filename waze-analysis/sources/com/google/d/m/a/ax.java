package com.google.d.m.a;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class ax<V> extends av<V> implements bm<V> {
    protected ax() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.d.m.a.av
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Future delegate() {
        throw null;
    }

    @Override // com.google.d.m.a.bm
    public final void addListener(Runnable runnable, Executor executor) {
        delegate().addListener(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.d.m.a.av, com.google.d.d.be
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract bm delegate();
}
