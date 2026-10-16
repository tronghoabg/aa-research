package Ef;

import A7.AbstractC0279p0;
import jf.AbstractC3101a;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class D extends AbstractC3101a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0499l0 f3659b = new C0499l0();

    /* renamed from: a, reason: collision with root package name */
    public final String f3660a;

    public D(String str) {
        super(f3659b);
        this.f3660a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && AbstractC3340k.a(this.f3660a, ((D) obj).f3660a);
    }

    public final int hashCode() {
        return this.f3660a.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("CoroutineName("), this.f3660a, ')');
    }
}
