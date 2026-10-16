package N;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final String f7733a;

    public W(String str) {
        this.f7733a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W) && AbstractC3340k.a(this.f7733a, ((W) obj).f7733a);
    }

    public final int hashCode() {
        return this.f7733a.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("OpaqueKey(key="), this.f7733a, ')');
    }
}
