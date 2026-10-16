package a2;

import N1.A;
import N1.B;
import N1.C0761j;
import N1.C0764m;
import N1.C0765n;
import java.util.Map;
import k2.c0;

/* loaded from: classes.dex */
public final class r extends c0 {

    /* renamed from: H, reason: collision with root package name */
    public final Map f17261H;

    /* renamed from: I, reason: collision with root package name */
    public C0761j f17262I;

    public r(o2.e eVar, Z1.g gVar, Z1.d dVar, Map map) {
        super(eVar, gVar, dVar);
        this.f17261H = map;
    }

    @Override // k2.c0
    public final C0765n n(C0765n c0765n) {
        C0761j c0761j;
        C0761j c0761j2 = this.f17262I;
        if (c0761j2 == null) {
            c0761j2 = c0765n.f8236r;
        }
        if (c0761j2 != null && (c0761j = (C0761j) this.f17261H.get(c0761j2.f8166c)) != null) {
            c0761j2 = c0761j;
        }
        B b5 = c0765n.f8230l;
        B b10 = null;
        if (b5 == null) {
            b5 = b10;
        } else {
            A[] aArr = b5.f8023a;
            int length = aArr.length;
            int i5 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                A a5 = aArr[i10];
                if ((a5 instanceof G2.n) && "com.apple.streaming.transportStreamTimestamp".equals(((G2.n) a5).f4195b)) {
                    break;
                }
                i10++;
            }
            if (i10 != -1) {
                if (length != 1) {
                    A[] aArr2 = new A[length - 1];
                    while (i5 < length) {
                        if (i5 != i10) {
                            aArr2[i5 < i10 ? i5 : i5 - 1] = aArr[i5];
                        }
                        i5++;
                    }
                    b10 = new B(aArr2);
                }
                b5 = b10;
            }
        }
        if (c0761j2 != c0765n.f8236r || b5 != c0765n.f8230l) {
            C0764m c0764mA = c0765n.a();
            c0764mA.f8198q = c0761j2;
            c0764mA.k = b5;
            c0765n = new C0765n(c0764mA);
        }
        return super.n(c0765n);
    }
}
