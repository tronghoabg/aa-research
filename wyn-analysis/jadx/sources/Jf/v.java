package Jf;

import jf.InterfaceC3107g;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class v implements InterfaceC3107g {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f6142a;

    public v(ThreadLocal threadLocal) {
        this.f6142a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && AbstractC3340k.a(this.f6142a, ((v) obj).f6142a);
    }

    public final int hashCode() {
        return this.f6142a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f6142a + ')';
    }
}
