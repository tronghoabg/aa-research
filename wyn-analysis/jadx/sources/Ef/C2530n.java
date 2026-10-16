package ef;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ef.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2530n implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34674a;

    public /* synthetic */ C2530n(Object obj) {
        this.f34674a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof C2529m) {
            return ((C2529m) obj).f34673a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2530n) {
            return AbstractC3340k.a(this.f34674a, ((C2530n) obj).f34674a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f34674a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f34674a;
        if (obj instanceof C2529m) {
            return ((C2529m) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
