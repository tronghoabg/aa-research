package com.vungle.ads.internal.task;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class j implements com.vungle.ads.internal.executor.h {
    public abstract int a();

    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        AbstractC3340k.e(other, "other");
        if (!(other instanceof j)) {
            return -1;
        }
        return AbstractC3340k.g(((j) other).a(), a());
    }
}
