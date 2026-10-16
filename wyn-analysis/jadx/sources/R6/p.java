package r6;

import E5.InterfaceC0453h;
import f6.Z;
import java.util.Collections;
import java.util.List;
import l8.AbstractC3409K;

/* loaded from: classes3.dex */
public final class p implements InterfaceC0453h {

    /* renamed from: a, reason: collision with root package name */
    public final Z f44466a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3409K f44467b;

    public p(Z z2, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= z2.f35017a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f44466a = z2;
        this.f44467b = AbstractC3409K.j(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f44466a.equals(pVar.f44466a) && this.f44467b.equals(pVar.f44467b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f44467b.hashCode() * 31) + this.f44466a.hashCode();
    }
}
