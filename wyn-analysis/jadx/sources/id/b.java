package id;

import N1.C0765n;
import U1.C0850u;
import hd.AbstractC2817a;
import j$.util.Objects;

/* loaded from: classes5.dex */
public final class b extends AbstractC2817a {
    @Override // hd.AbstractC2817a
    public final void q() {
        int i5;
        C0850u c0850u = (C0850u) this.f36393c;
        c0850u.S0();
        C0765n c0765n = c0850u.f12132M;
        Objects.requireNonNull(c0765n);
        int iB = com.google.android.gms.internal.consent_sdk.a.b(c0765n.f8242x);
        int i10 = c0765n.f8239u;
        int i11 = c0765n.f8240v;
        if (iB == 2 || iB == 4) {
            iB = com.google.android.gms.internal.consent_sdk.a.b(0);
            i5 = i10;
            i10 = i11;
        } else {
            i5 = i11;
        }
        this.f36394d.s(i10, i5, c0850u.q0(), com.google.android.gms.internal.consent_sdk.a.i(iB));
    }
}
