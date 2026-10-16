package ea;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ea.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2500o {

    /* renamed from: a, reason: collision with root package name */
    public final String f34569a;

    public C2500o(String str) {
        this.f34569a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2500o) && AbstractC3340k.a(this.f34569a, ((C2500o) obj).f34569a);
    }

    public final int hashCode() {
        String str = this.f34569a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("FirebaseSessionsData(sessionId="), this.f34569a, ')');
    }
}
