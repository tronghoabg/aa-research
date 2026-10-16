package fd;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: fd.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2636g {

    /* renamed from: a, reason: collision with root package name */
    public final String f35334a;

    public C2636g(String str) {
        this.f35334a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2636g) && AbstractC3340k.a(this.f35334a, ((C2636g) obj).f35334a);
    }

    public final int hashCode() {
        String str = this.f35334a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wg.b.c(new StringBuilder("SharedPreferencesPigeonOptions(fileKey="), this.f35334a, ")");
    }
}
