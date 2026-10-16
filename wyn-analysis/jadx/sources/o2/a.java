package O2;

import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.m;
import s2.n;
import s2.o;
import s2.y;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8850a;

    /* renamed from: b, reason: collision with root package name */
    public final m f8851b;

    public a(byte b5, int i5) {
        this.f8850a = i5;
        switch (i5) {
            case 1:
                this.f8851b = new y(16973, 2, "image/bmp");
                break;
            default:
                this.f8851b = new y(35152, 2, "image/png");
                break;
        }
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        switch (this.f8850a) {
            case 0:
                ((y) this.f8851b).a(j8, j10);
                break;
            case 1:
                ((y) this.f8851b).a(j8, j10);
                break;
            default:
                this.f8851b.a(j8, j10);
                break;
        }
    }

    @Override // s2.m
    public final void g(o oVar) {
        switch (this.f8850a) {
            case 0:
                ((y) this.f8851b).g(oVar);
                break;
            case 1:
                ((y) this.f8851b).g(oVar);
                break;
            default:
                this.f8851b.g(oVar);
                break;
        }
    }

    @Override // s2.m
    public final m h() {
        int i5 = this.f8850a;
        return this;
    }

    @Override // s2.m
    public final boolean i(n nVar) {
        switch (this.f8850a) {
            case 0:
                return ((y) this.f8851b).i(nVar);
            case 1:
                return ((y) this.f8851b).i(nVar);
            default:
                return this.f8851b.i(nVar);
        }
    }

    @Override // s2.m
    public final List j() {
        switch (this.f8850a) {
            case 0:
                C3407I c3407i = AbstractC3409K.f40056b;
                break;
            case 1:
                C3407I c3407i2 = AbstractC3409K.f40056b;
                break;
            default:
                C3407I c3407i3 = AbstractC3409K.f40056b;
                break;
        }
        return e0.f40101e;
    }

    @Override // s2.m
    public final int k(n nVar, J5.n nVar2) {
        switch (this.f8850a) {
            case 0:
                return ((y) this.f8851b).k(nVar, nVar2);
            case 1:
                return ((y) this.f8851b).k(nVar, nVar2);
            default:
                return this.f8851b.k(nVar, nVar2);
        }
    }

    @Override // s2.m
    public final void release() {
        switch (this.f8850a) {
            case 0:
            case 1:
                break;
            default:
                this.f8851b.release();
                break;
        }
    }

    public a(int i5) {
        this.f8850a = 2;
        if ((i5 & 1) != 0) {
            this.f8851b = new y(65496, 2, "image/jpeg");
        } else {
            this.f8851b = new A2.a();
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
