package zf;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c extends AbstractC4661a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f48493a == cVar.f48493a && this.f48494b == cVar.f48494b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f48493a * 31) + this.f48494b;
    }

    public final boolean isEmpty() {
        return AbstractC3340k.g(this.f48493a, this.f48494b) > 0;
    }

    public final String toString() {
        return this.f48493a + ".." + this.f48494b;
    }
}
