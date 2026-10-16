package od;

import md.C3551t;
import md.InterfaceC3543k;

/* renamed from: od.v1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3732v1 implements A1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42114b;

    public /* synthetic */ C3732v1(Object obj, int i5) {
        this.f42113a = i5;
        this.f42114b = obj;
    }

    @Override // od.A1
    public final void a(G1 g12) {
        switch (this.f42113a) {
            case 0:
                g12.f41564a.a((InterfaceC3543k) this.f42114b);
                break;
            case 1:
                g12.f41564a.f((md.r) this.f42114b);
                break;
            default:
                g12.f41564a.l((C3551t) this.f42114b);
                break;
        }
    }
}
