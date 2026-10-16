package Gf;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final k f4826b = new k();

    /* renamed from: a, reason: collision with root package name */
    public final Object f4827a;

    public static final Object a(Object obj) {
        if (obj instanceof k) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return AbstractC3340k.a(this.f4827a, ((l) obj).f4827a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f4827a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f4827a;
        if (obj instanceof j) {
            return ((j) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
