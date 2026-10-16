package M2;

import E5.o0;
import s2.AbstractC3991a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7286a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f7287b;

    /* renamed from: c, reason: collision with root package name */
    public int f7288c;

    /* renamed from: d, reason: collision with root package name */
    public int f7289d;

    /* renamed from: e, reason: collision with root package name */
    public long f7290e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7291f;

    /* renamed from: g, reason: collision with root package name */
    public int f7292g;

    /* renamed from: h, reason: collision with root package name */
    public int f7293h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7294i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f7295j;

    public a(Y4.b bVar, Y4.b bVar2, boolean z2) throws o0 {
        this.f7295j = bVar;
        this.f7294i = bVar2;
        this.f7291f = z2;
        bVar2.A(12);
        this.f7287b = bVar2.t();
        bVar.A(12);
        this.f7293h = bVar.t();
        S3.f.k("first_chunk must be 1", bVar.d() == 1);
        this.f7288c = -1;
    }

    public final boolean a() {
        switch (this.f7286a) {
            case 0:
                int i5 = this.f7288c + 1;
                this.f7288c = i5;
                if (i5 != this.f7287b) {
                    boolean z2 = this.f7291f;
                    Q1.o oVar = (Q1.o) this.f7294i;
                    this.f7290e = z2 ? oVar.z() : oVar.w();
                    if (this.f7288c == this.f7292g) {
                        Q1.o oVar2 = (Q1.o) this.f7295j;
                        this.f7289d = oVar2.y();
                        oVar2.H(4);
                        int i10 = this.f7293h - 1;
                        this.f7293h = i10;
                        this.f7292g = i10 > 0 ? oVar2.y() - 1 : -1;
                        break;
                    }
                }
                break;
            default:
                int i11 = this.f7288c + 1;
                this.f7288c = i11;
                if (i11 != this.f7287b) {
                    boolean z10 = this.f7291f;
                    Y4.b bVar = (Y4.b) this.f7294i;
                    this.f7290e = z10 ? bVar.u() : bVar.r();
                    if (this.f7288c == this.f7292g) {
                        Y4.b bVar2 = (Y4.b) this.f7295j;
                        this.f7289d = bVar2.t();
                        bVar2.B(4);
                        int i12 = this.f7293h - 1;
                        this.f7293h = i12;
                        this.f7292g = i12 > 0 ? bVar2.t() - 1 : -1;
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public a(Q1.o oVar, Q1.o oVar2, boolean z2) {
        this.f7295j = oVar;
        this.f7294i = oVar2;
        this.f7291f = z2;
        oVar2.G(12);
        this.f7287b = oVar2.y();
        oVar.G(12);
        this.f7293h = oVar.y();
        AbstractC3991a.e("first_chunk must be 1", oVar.h() == 1);
        this.f7288c = -1;
    }
}
