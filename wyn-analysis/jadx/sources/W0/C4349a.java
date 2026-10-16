package w0;

import Va.M6;
import i0.C2826d;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4349a {

    /* renamed from: a, reason: collision with root package name */
    public final C2826d f47268a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47269b;

    public C4349a(C2826d c2826d, int i5) {
        this.f47268a = c2826d;
        this.f47269b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4349a)) {
            return false;
        }
        C4349a c4349a = (C4349a) obj;
        return AbstractC3340k.a(this.f47268a, c4349a.f47268a) && this.f47269b == c4349a.f47269b;
    }

    public final int hashCode() {
        return (this.f47268a.hashCode() * 31) + this.f47269b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f47268a);
        sb2.append(", configFlags=");
        return M6.r(sb2, this.f47269b, ')');
    }
}
