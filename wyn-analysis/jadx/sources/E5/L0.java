package E5;

import l8.AbstractC3409K;
import l8.C3407I;

/* loaded from: classes3.dex */
public final class L0 implements InterfaceC0453h {

    /* renamed from: b, reason: collision with root package name */
    public static final L0 f3138b;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3409K f3139a;

    static {
        C3407I c3407i = AbstractC3409K.f40056b;
        f3138b = new L0(l8.e0.f40101e);
    }

    public L0(AbstractC3409K abstractC3409K) {
        this.f3139a = AbstractC3409K.j(abstractC3409K);
    }

    public final boolean a(int i5) {
        int i10 = 0;
        while (true) {
            AbstractC3409K abstractC3409K = this.f3139a;
            if (i10 >= abstractC3409K.size()) {
                return false;
            }
            K0 k02 = (K0) abstractC3409K.get(i10);
            boolean[] zArr = k02.f3133e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (!zArr[i11]) {
                    i11++;
                } else if (k02.f3130b.f35019c == i5) {
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
        if (obj == null || L0.class != obj.getClass()) {
            return false;
        }
        return this.f3139a.equals(((L0) obj).f3139a);
    }

    public final int hashCode() {
        return this.f3139a.hashCode();
    }
}
