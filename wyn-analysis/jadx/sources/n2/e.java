package N2;

import Q1.o;
import S1.v;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import u6.AbstractC4256a;

/* loaded from: classes.dex */
public final class e implements S1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8349a;

    /* renamed from: b, reason: collision with root package name */
    public int f8350b;

    /* renamed from: c, reason: collision with root package name */
    public int f8351c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8352d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8353e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8354f;

    public e(int i5) {
        this.f8349a = i5;
        switch (i5) {
            case 1:
                this.f8353e = new v(0);
                this.f8350b = 8000;
                this.f8351c = 8000;
                break;
            case 2:
                this.f8353e = new f(1);
                this.f8354f = new Y4.b(new byte[65025], 0);
                this.f8350b = -1;
                break;
            default:
                this.f8353e = new f(0);
                this.f8354f = new o(new byte[65025], 0);
                this.f8350b = -1;
                break;
        }
    }

    public int a(int i5) {
        int i10;
        int i11;
        switch (this.f8349a) {
            case 0:
                int i12 = 0;
                this.f8351c = 0;
                do {
                    int i13 = this.f8351c;
                    int i14 = i5 + i13;
                    f fVar = (f) this.f8353e;
                    if (i14 < fVar.f8357c) {
                        int[] iArr = fVar.f8360f;
                        this.f8351c = i13 + 1;
                        i10 = iArr[i13 + i5];
                        i12 += i10;
                    }
                    return i12;
                } while (i10 == 255);
                return i12;
            default:
                int i15 = 0;
                this.f8351c = 0;
                do {
                    int i16 = this.f8351c;
                    int i17 = i5 + i16;
                    f fVar2 = (f) this.f8353e;
                    if (i17 < fVar2.f8357c) {
                        int[] iArr2 = fVar2.f8360f;
                        this.f8351c = i16 + 1;
                        i11 = iArr2[i16 + i5];
                        i15 += i11;
                    }
                    return i15;
                } while (i11 == 255);
                return i15;
        }
    }

    @Override // S1.g
    public S1.h b() {
        return new S1.o((String) this.f8354f, this.f8350b, this.f8351c, this.f8352d, (v) this.f8353e);
    }

    public boolean c(J5.h hVar) throws InterruptedIOException {
        int i5;
        AbstractC4256a.i(hVar != null);
        boolean z2 = this.f8352d;
        Y4.b bVar = (Y4.b) this.f8354f;
        if (z2) {
            this.f8352d = false;
            bVar.x(0);
        }
        while (!this.f8352d) {
            int i10 = this.f8350b;
            f fVar = (f) this.f8353e;
            if (i10 < 0) {
                if (fVar.c(hVar, -1L) && fVar.a(hVar, true)) {
                    int iA = fVar.f8358d;
                    if ((fVar.f8355a & 1) == 1 && bVar.f16681c == 0) {
                        iA += a(0);
                        i5 = this.f8351c;
                    } else {
                        i5 = 0;
                    }
                    try {
                        hVar.j(iA);
                        this.f8350b = i5;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f8350b);
            int i11 = this.f8350b + this.f8351c;
            if (iA2 > 0) {
                bVar.b(bVar.f16681c + iA2);
                hVar.f(bVar.f16679a, bVar.f16681c, iA2, false);
                bVar.z(bVar.f16681c + iA2);
                this.f8352d = fVar.f8360f[i11 + (-1)] != 255;
            }
            if (i11 == fVar.f8357c) {
                i11 = -1;
            }
            this.f8350b = i11;
        }
        return true;
    }

    public boolean d(s2.j jVar) throws InterruptedIOException {
        int i5;
        Q1.k.g(jVar != null);
        boolean z2 = this.f8352d;
        o oVar = (o) this.f8354f;
        if (z2) {
            this.f8352d = false;
            oVar.D(0);
        }
        while (!this.f8352d) {
            int i10 = this.f8350b;
            f fVar = (f) this.f8353e;
            if (i10 < 0) {
                if (fVar.d(jVar, -1L) && fVar.b(jVar, true)) {
                    int iA = fVar.f8358d;
                    if ((fVar.f8355a & 1) == 1 && oVar.f9704c == 0) {
                        iA += a(0);
                        i5 = this.f8351c;
                    } else {
                        i5 = 0;
                    }
                    try {
                        jVar.j(iA);
                        this.f8350b = i5;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f8350b);
            int i11 = this.f8350b + this.f8351c;
            if (iA2 > 0) {
                oVar.b(oVar.f9704c + iA2);
                jVar.f(oVar.f9702a, oVar.f9704c, iA2, false);
                oVar.F(oVar.f9704c + iA2);
                this.f8352d = fVar.f8360f[i11 + (-1)] != 255;
            }
            if (i11 == fVar.f8357c) {
                i11 = -1;
            }
            this.f8350b = i11;
        }
        return true;
    }

    public void e(HashMap map) {
        v vVar = (v) this.f8353e;
        synchronized (vVar) {
            vVar.f10911c = null;
            vVar.f10910b.clear();
            vVar.f10910b.putAll(map);
        }
    }
}
