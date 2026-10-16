package P2;

import Pc.C0786b;
import c2.C1547b;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends T1.e implements d {

    /* renamed from: e, reason: collision with root package name */
    public d f9062e;

    /* renamed from: f, reason: collision with root package name */
    public long f9063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9064g = 1;

    /* renamed from: h, reason: collision with root package name */
    public Object f9065h;

    public /* synthetic */ c() {
        super(3);
    }

    @Override // P2.d, h6.InterfaceC2787f
    public final int a(long j8) {
        d dVar = this.f9062e;
        dVar.getClass();
        return dVar.a(j8 - this.f9063f);
    }

    @Override // P2.d, h6.InterfaceC2787f
    public final List g(long j8) {
        d dVar = this.f9062e;
        dVar.getClass();
        return dVar.g(j8 - this.f9063f);
    }

    @Override // P2.d, h6.InterfaceC2787f
    public final long k(int i5) {
        d dVar = this.f9062e;
        dVar.getClass();
        return dVar.k(i5) + this.f9063f;
    }

    @Override // T1.e
    public final void o() {
        this.f4893b = 0;
        this.f11363c = 0L;
        this.f11364d = false;
        this.f9062e = null;
    }

    @Override // P2.d, h6.InterfaceC2787f
    public final int p() {
        d dVar = this.f9062e;
        dVar.getClass();
        return dVar.p();
    }

    @Override // T1.e
    public final void q() {
        switch (this.f9064g) {
            case 0:
                ((C1547b) this.f9065h).l(this);
                break;
            default:
                C0786b c0786b = (C0786b) this.f9065h;
                c0786b.getClass();
                Q2.h hVar = (Q2.h) c0786b.f9390b;
                hVar.getClass();
                o();
                hVar.f9818b.add(this);
                break;
        }
    }

    public c(C1547b c1547b) {
        super(3);
        this.f9065h = c1547b;
    }
}
