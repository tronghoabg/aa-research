package androidx.media3.exoplayer.smoothstreaming;

import E5.C0441b;
import Mf.d;
import N1.C0773w;
import S1.g;
import Y2.B;
import a9.C1342b;
import ac.C1346a;
import i2.C2843c;
import java.util.List;
import k2.AbstractC3144a;
import k2.G;
import o2.o;
import wa.C4398a;

/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements G {

    /* renamed from: a, reason: collision with root package name */
    public final C0441b f18733a;

    /* renamed from: b, reason: collision with root package name */
    public final g f18734b;

    /* renamed from: c, reason: collision with root package name */
    public final C1342b f18735c;

    /* renamed from: d, reason: collision with root package name */
    public final d f18736d;

    /* renamed from: e, reason: collision with root package name */
    public final ae.d f18737e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18738f;

    public SsMediaSource$Factory(g gVar) {
        C0441b c0441b = new C0441b(gVar);
        this.f18733a = c0441b;
        this.f18734b = gVar;
        this.f18736d = new d();
        this.f18737e = new ae.d(10);
        this.f18738f = 30000L;
        this.f18735c = new C1342b();
        c0441b.f3290b = true;
    }

    @Override // k2.G
    public final G a(C4398a c4398a) {
        this.f18733a.f3292d = c4398a;
        return this;
    }

    @Override // k2.G
    public final G b(boolean z2) {
        this.f18733a.f3290b = z2;
        return this;
    }

    @Override // k2.G
    public final AbstractC3144a c(C0773w c0773w) {
        c0773w.f8272b.getClass();
        o c1346a = new C1346a(8);
        List list = c0773w.f8272b.f8266c;
        o b5 = !list.isEmpty() ? new B(13, c1346a, list) : c1346a;
        Z1.g gVarB = this.f18736d.b(c0773w);
        ae.d dVar = this.f18737e;
        return new C2843c(c0773w, this.f18734b, b5, this.f18733a, this.f18735c, gVarB, dVar, this.f18738f);
    }
}
