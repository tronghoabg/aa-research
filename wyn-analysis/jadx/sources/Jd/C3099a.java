package jd;

import N1.C0765n;
import N1.Y;
import U1.C0850u;
import hd.AbstractC2817a;
import j$.util.Objects;

/* renamed from: jd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3099a extends AbstractC2817a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f38754e;

    @Override // hd.AbstractC2817a
    public final void q() {
        C0850u c0850u = (C0850u) this.f36393c;
        c0850u.S0();
        Y y10 = c0850u.f12148b0;
        int i5 = y10.f8126a;
        int iB = 1;
        int i10 = y10.f8127b;
        if (i5 != 0 && i10 != 0 && !this.f38754e) {
            c0850u.S0();
            C0765n c0765n = c0850u.f12132M;
            Objects.requireNonNull(c0765n);
            try {
                iB = com.google.android.gms.internal.consent_sdk.a.b(c0765n.f8242x);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.f36394d.s(i5, i10, c0850u.q0(), com.google.android.gms.internal.consent_sdk.a.i(iB));
    }
}
