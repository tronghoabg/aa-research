package re;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: re.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3977a {

    /* renamed from: a, reason: collision with root package name */
    public final ae.a f44801a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44802b;

    public C3977a(ae.a aVar, String str) {
        this.f44801a = aVar;
        this.f44802b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3977a)) {
            return false;
        }
        C3977a c3977a = (C3977a) obj;
        return this.f44801a == c3977a.f44801a && AbstractC3340k.a(this.f44802b, c3977a.f44802b);
    }

    public final int hashCode() {
        return this.f44802b.hashCode() + (this.f44801a.hashCode() * 31);
    }

    public final String toString() {
        return "LoggerConfig(logLevel=" + this.f44801a + ", logTag=" + this.f44802b + ")";
    }
}
