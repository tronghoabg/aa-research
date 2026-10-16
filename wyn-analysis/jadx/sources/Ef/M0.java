package Ef;

import A.AbstractC0213f;
import Va.M6;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class M0 extends Jf.q implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f3686e;

    public M0(long j8, AbstractC3464c abstractC3464c) {
        super(abstractC3464c, abstractC3464c.getContext());
        this.f3686e = j8;
    }

    @Override // Ef.z0
    public final String M() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.M());
        sb2.append("(timeMillis=");
        return AbstractC0213f.e(sb2, this.f3686e, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        H.s(this.f3710c);
        q(new L0(M6.s(new StringBuilder("Timed out waiting for "), this.f3686e, " ms"), this));
    }
}
