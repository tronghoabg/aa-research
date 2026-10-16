package Gd;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Sd.a f4721a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4722b;

    public c(Sd.a expectedType, Object response) {
        AbstractC3340k.e(expectedType, "expectedType");
        AbstractC3340k.e(response, "response");
        this.f4721a = expectedType;
        this.f4722b = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC3340k.a(this.f4721a, cVar.f4721a) && AbstractC3340k.a(this.f4722b, cVar.f4722b);
    }

    public final int hashCode() {
        return this.f4722b.hashCode() + (this.f4721a.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.f4721a + ", response=" + this.f4722b + ')';
    }
}
