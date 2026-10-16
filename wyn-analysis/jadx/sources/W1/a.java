package W1;

import j$.util.Objects;
import java.util.Set;
import l8.AbstractC3414P;
import l8.C3413O;
import l8.t0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14940d;

    /* renamed from: a, reason: collision with root package name */
    public final int f14941a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14942b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3414P f14943c;

    static {
        a aVar;
        if (Q1.x.f9724a >= 33) {
            C3413O c3413o = new C3413O(4);
            for (int i5 = 1; i5 <= 10; i5++) {
                c3413o.g(Integer.valueOf(Q1.x.q(i5)));
            }
            aVar = new a(2, c3413o.i());
        } else {
            aVar = new a(2, 10);
        }
        f14940d = aVar;
    }

    public a(int i5, Set set) {
        this.f14941a = i5;
        AbstractC3414P abstractC3414PJ = AbstractC3414P.j(set);
        this.f14943c = abstractC3414PJ;
        t0 it = abstractC3414PJ.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f14942b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f14941a == aVar.f14941a && this.f14942b == aVar.f14942b) {
            int i5 = Q1.x.f9724a;
            if (Objects.equals(this.f14943c, aVar.f14943c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = ((this.f14941a * 31) + this.f14942b) * 31;
        AbstractC3414P abstractC3414P = this.f14943c;
        return i5 + (abstractC3414P == null ? 0 : abstractC3414P.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f14941a + ", maxChannelCount=" + this.f14942b + ", channelMasks=" + this.f14943c + "]";
    }

    public a(int i5, int i10) {
        this.f14941a = i5;
        this.f14942b = i10;
        this.f14943c = null;
    }
}
