package k2;

import N1.C0764m;
import N1.C0765n;
import N1.C0769s;
import N1.C0770t;
import N1.C0771u;
import N1.C0773w;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;

/* loaded from: classes.dex */
public final class j0 extends AbstractC3144a {

    /* renamed from: j, reason: collision with root package name */
    public static final C0765n f39096j;
    public static final C0773w k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f39097l;

    /* renamed from: h, reason: collision with root package name */
    public final long f39098h;

    /* renamed from: i, reason: collision with root package name */
    public C0773w f39099i;

    static {
        C0764m c0764m = new C0764m();
        c0764m.f8194m = N1.C.m("audio/raw");
        c0764m.f8173B = 2;
        c0764m.f8174C = 44100;
        c0764m.f8175D = 2;
        C0765n c0765n = new C0765n(c0764m);
        f39096j = c0765n;
        J5.n nVar = new J5.n(3);
        C3407I c3407i = AbstractC3409K.f40056b;
        l8.e0 e0Var = l8.e0.f40101e;
        List list = Collections.EMPTY_LIST;
        l8.e0 e0Var2 = l8.e0.f40101e;
        E5.Y y10 = new E5.Y();
        C0771u c0771u = C0771u.f8270a;
        Uri uri = Uri.EMPTY;
        k = new C0773w("SilenceMediaSource", new N1.r(nVar), uri != null ? new C0770t(uri, c0765n.f8232n, null, list, e0Var2, null, -9223372036854775807L) : null, new C0769s(y10), N1.z.f8304B, c0771u);
        f39097l = new byte[4096];
    }

    public j0(long j8, C0773w c0773w) {
        Q1.k.c(j8 >= 0);
        this.f39098h = j8;
        this.f39099i = c0773w;
    }

    @Override // k2.AbstractC3144a
    public final F b(H h10, o2.e eVar, long j8) {
        return new h0(this.f39098h);
    }

    @Override // k2.AbstractC3144a
    public final synchronized C0773w h() {
        return this.f39099i;
    }

    @Override // k2.AbstractC3144a
    public final void l(S1.A a5) {
        m(new k0(this.f39098h, true, false, h()));
    }

    @Override // k2.AbstractC3144a
    public final synchronized void s(C0773w c0773w) {
        this.f39099i = c0773w;
    }

    @Override // k2.AbstractC3144a
    public final void j() {
    }

    @Override // k2.AbstractC3144a
    public final void p() {
    }

    @Override // k2.AbstractC3144a
    public final void n(F f10) {
    }
}
