package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class odu {
    public final boolean a;
    private final int b;
    private final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public odu(boolean z, int i, List list) {
        list.getClass();
        Iterator it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Number) it.next()).intValue();
        }
        this(z, i, iIntValue);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odu)) {
            return false;
        }
        odu oduVar = (odu) obj;
        return this.a == oduVar.a && this.b == oduVar.b && this.c == oduVar.c;
    }

    public final int hashCode() {
        return (((a.f(this.a) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "AudioState(isMuted=" + this.a + ", route=" + this.b + ", supportedRouteMask=" + this.c + ")";
    }

    public odu(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }
}
