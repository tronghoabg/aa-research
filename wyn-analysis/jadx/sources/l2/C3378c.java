package l2;

import N1.C0765n;
import N1.InterfaceC0758g;
import Q1.o;
import Q1.x;
import s2.B;
import s2.C;

/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3378c implements C {

    /* renamed from: a, reason: collision with root package name */
    public final int f39873a;

    /* renamed from: b, reason: collision with root package name */
    public final C0765n f39874b;

    /* renamed from: c, reason: collision with root package name */
    public final s2.l f39875c = new s2.l();

    /* renamed from: d, reason: collision with root package name */
    public C0765n f39876d;

    /* renamed from: e, reason: collision with root package name */
    public C f39877e;

    /* renamed from: f, reason: collision with root package name */
    public long f39878f;

    public C3378c(int i5, int i10, C0765n c0765n) {
        this.f39873a = i10;
        this.f39874b = c0765n;
    }

    @Override // s2.C
    public final void a(long j8, int i5, int i10, int i11, B b5) {
        long j10 = this.f39878f;
        if (j10 != -9223372036854775807L && j8 >= j10) {
            this.f39877e = this.f39875c;
        }
        C c10 = this.f39877e;
        int i12 = x.f9724a;
        c10.a(j8, i5, i10, i11, b5);
    }

    @Override // s2.C
    public final int b(InterfaceC0758g interfaceC0758g, int i5, boolean z2) {
        C c10 = this.f39877e;
        int i10 = x.f9724a;
        return c10.d(interfaceC0758g, i5, z2);
    }

    @Override // s2.C
    public final void c(C0765n c0765n) {
        C0765n c0765n2 = this.f39874b;
        if (c0765n2 != null) {
            c0765n = c0765n.d(c0765n2);
        }
        this.f39876d = c0765n;
        C c10 = this.f39877e;
        int i5 = x.f9724a;
        c10.c(c0765n);
    }

    @Override // s2.C
    public final int d(InterfaceC0758g interfaceC0758g, int i5, boolean z2) {
        return b(interfaceC0758g, i5, z2);
    }

    @Override // s2.C
    public final /* synthetic */ void e(int i5, o oVar) {
        pd.f.b(this, oVar, i5);
    }

    @Override // s2.C
    public final void f(o oVar, int i5, int i10) {
        C c10 = this.f39877e;
        int i11 = x.f9724a;
        c10.e(i5, oVar);
    }
}
