package N1;

import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: b, reason: collision with root package name */
    public static final V f8122b;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3409K f8123a;

    static {
        C3407I c3407i = AbstractC3409K.f40056b;
        f8122b = new V(e0.f40101e);
        Q1.x.E(0);
    }

    public V(AbstractC3409K abstractC3409K) {
        this.f8123a = AbstractC3409K.j(abstractC3409K);
    }

    public final boolean a(int i5) {
        int i10 = 0;
        while (true) {
            AbstractC3409K abstractC3409K = this.f8123a;
            if (i10 >= abstractC3409K.size()) {
                return false;
            }
            U u10 = (U) abstractC3409K.get(i10);
            boolean[] zArr = u10.f8121e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (!zArr[i11]) {
                    i11++;
                } else if (u10.f8118b.f8075c == i5) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V.class != obj.getClass()) {
            return false;
        }
        return this.f8123a.equals(((V) obj).f8123a);
    }

    public final int hashCode() {
        return this.f8123a.hashCode();
    }
}
