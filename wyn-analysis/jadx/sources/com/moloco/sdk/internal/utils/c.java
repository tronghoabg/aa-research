package com.moloco.sdk.internal.utils;

import jf.InterfaceC3107g;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c implements InterfaceC3107g {

    /* renamed from: a, reason: collision with root package name */
    public final Nf.d f29776a;

    public c(Nf.d mutex) {
        AbstractC3340k.e(mutex, "mutex");
        this.f29776a = mutex;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && AbstractC3340k.a(this.f29776a, ((c) obj).f29776a);
    }

    public final int hashCode() {
        return this.f29776a.hashCode();
    }

    public final String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.f29776a + ')';
    }
}
