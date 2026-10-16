package D3;

import k1.v0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final A3.b f2317a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f2318b;

    public l(A3.b bVar, v0 _windowInsetsCompat) {
        AbstractC3340k.e(_windowInsetsCompat, "_windowInsetsCompat");
        this.f2317a = bVar;
        this.f2318b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC3340k.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return AbstractC3340k.a(this.f2317a, lVar.f2317a) && AbstractC3340k.a(this.f2318b, lVar.f2318b);
    }

    public final int hashCode() {
        return this.f2318b.hashCode() + (this.f2317a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f2317a + ", windowInsetsCompat=" + this.f2318b + ')';
    }
}
