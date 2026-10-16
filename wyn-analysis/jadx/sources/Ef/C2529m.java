package ef;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ef.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2529m implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f34673a;

    public C2529m(Throwable exception) {
        AbstractC3340k.e(exception, "exception");
        this.f34673a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2529m) {
            return AbstractC3340k.a(this.f34673a, ((C2529m) obj).f34673a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34673a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f34673a + ')';
    }
}
