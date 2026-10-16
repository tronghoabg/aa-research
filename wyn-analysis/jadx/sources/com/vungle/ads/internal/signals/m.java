package com.vungle.ads.internal.signals;

import A.AbstractC0213f;
import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.q0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* renamed from: a, reason: collision with root package name */
    public final Long f33669a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33670b;

    /* renamed from: c, reason: collision with root package name */
    public String f33671c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33672d;

    /* renamed from: e, reason: collision with root package name */
    public String f33673e;

    /* renamed from: f, reason: collision with root package name */
    public long f33674f;

    /* renamed from: g, reason: collision with root package name */
    public int f33675g;

    /* renamed from: h, reason: collision with root package name */
    public long f33676h;

    /* renamed from: i, reason: collision with root package name */
    public long f33677i;

    public /* synthetic */ m(int i5, String str, long j8, String str2, long j10, int i10) {
        if (2 != (i5 & 2)) {
            AbstractC1240b0.k(i5, 2, k.f33667a.getDescriptor());
            throw null;
        }
        this.f33669a = 0L;
        this.f33670b = 0L;
        if ((i5 & 1) == 0) {
            this.f33671c = null;
        } else {
            this.f33671c = str;
        }
        this.f33672d = j8;
        if ((i5 & 4) == 0) {
            this.f33673e = null;
        } else {
            this.f33673e = str2;
        }
        if ((i5 & 8) == 0) {
            this.f33674f = 0L;
        } else {
            this.f33674f = j10;
        }
        if ((i5 & 16) == 0) {
            this.f33675g = 0;
        } else {
            this.f33675g = i10;
        }
        this.f33676h = 0L;
        this.f33677i = 0L;
        this.f33672d = a(0L, 0L);
    }

    public static final void a(m self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33671c != null) {
            output.i(serialDesc, 0, q0.f15625a, self.f33671c);
        }
        output.E(serialDesc, 1, self.f33672d);
        if (output.A(serialDesc, 2) || self.f33673e != null) {
            output.i(serialDesc, 2, q0.f15625a, self.f33673e);
        }
        if (output.A(serialDesc, 3) || self.f33674f != 0) {
            output.E(serialDesc, 3, self.f33674f);
        }
        if (!output.A(serialDesc, 4) && self.f33675g == 0) {
            return;
        }
        output.t(4, self.f33675g, serialDesc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC3340k.a(this.f33669a, mVar.f33669a) && this.f33670b == mVar.f33670b;
    }

    public final int hashCode() {
        Long l10 = this.f33669a;
        int iHashCode = l10 == null ? 0 : l10.hashCode();
        long j8 = this.f33670b;
        return ((int) (j8 ^ (j8 >>> 32))) + (iHashCode * 31);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("SignaledAd(lastAdLoadTime=");
        sbA.append(this.f33669a);
        sbA.append(", loadAdTime=");
        return AbstractC0213f.e(sbA, this.f33670b, ')');
    }

    public final void a(String str) {
        this.f33673e = str;
    }

    public final void a(int i5) {
        this.f33675g = i5;
    }

    public final void a(long j8) {
        this.f33676h = j8;
    }

    public static long a(Long l10, long j8) {
        if (l10 == null) {
            return -1L;
        }
        long jLongValue = j8 - l10.longValue();
        if (jLongValue < 0) {
            return -1L;
        }
        return jLongValue;
    }

    public m(Long l10, long j8) {
        this.f33669a = l10;
        this.f33670b = j8;
        this.f33672d = a(l10, j8);
    }
}
