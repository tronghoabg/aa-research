package Gf;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4825a;

    public j(Throwable th) {
        this.f4825a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return AbstractC3340k.a(this.f4825a, ((j) obj).f4825a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f4825a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // Gf.k
    public final String toString() {
        return "Closed(" + this.f4825a + ')';
    }
}
