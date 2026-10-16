package com.bytedance.sdk.component.bcc.oa;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class oa<V> extends FutureTask<V> implements Comparable<oa<V>> {

    /* renamed from: oa, reason: collision with root package name */
    private int f24956oa;
    private int uef;

    public oa(Callable<V> callable, int i5, int i10) {
        super(callable);
        this.uef = i5 == -1 ? 5 : i5;
        this.f24956oa = i10;
    }

    @Override // java.lang.Comparable
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public int compareTo(oa oaVar) {
        if (uef() < oaVar.uef()) {
            return 1;
        }
        return uef() > oaVar.uef() ? -1 : 0;
    }

    public int uef() {
        return this.uef;
    }
}
