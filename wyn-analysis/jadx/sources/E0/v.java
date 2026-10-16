package e0;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class v extends z {

    /* renamed from: e, reason: collision with root package name */
    public final d0.d f34390e;

    public v(d0.d dVar) {
        this.f34390e = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return AbstractC3340k.a(this.f34390e, ((v) obj).f34390e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34390e.hashCode();
    }
}
