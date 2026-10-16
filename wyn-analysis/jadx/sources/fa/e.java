package fa;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f35279a;

    public e(String str) {
        this.f35279a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && AbstractC3340k.a(this.f35279a, ((e) obj).f35279a);
    }

    public final int hashCode() {
        return this.f35279a.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("SessionDetails(sessionId="), this.f35279a, ')');
    }
}
