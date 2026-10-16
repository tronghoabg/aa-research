package X;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC3340k;
import x.C4425r;

/* renamed from: X.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271d extends C1270c {

    /* renamed from: o, reason: collision with root package name */
    public final C1270c f15693o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15694p;

    public C1271d(int i5, k kVar, tf.l lVar, tf.l lVar2, C1270c c1270c) {
        super(i5, kVar, lVar, lVar2);
        this.f15693o = c1270c;
        c1270c.k();
    }

    @Override // X.C1270c, X.g
    public final void c() {
        if (this.f15701c) {
            return;
        }
        super.c();
        if (this.f15694p) {
            return;
        }
        this.f15694p = true;
        this.f15693o.l();
    }

    @Override // X.C1270c
    public final q v() {
        C1270c c1270c = this.f15693o;
        if (c1270c.f15692m || c1270c.f15701c) {
            return new h();
        }
        C4425r c4425r = this.f15688h;
        int i5 = this.f15700b;
        HashMap mapC = c4425r != null ? m.c(c1270c, this, c1270c.e()) : null;
        synchronized (m.f15718b) {
            try {
                m.d(this);
                if (c4425r == null || c4425r.f47556d == 0) {
                    a();
                } else {
                    q qVarY = y(this.f15693o.d(), mapC, this.f15693o.e());
                    if (!qVarY.equals(i.f15703c)) {
                        return qVarY;
                    }
                    C4425r c4425rW = this.f15693o.w();
                    if (c4425rW != null) {
                        c4425rW.i(c4425r);
                    } else {
                        this.f15693o.B(c4425r);
                        this.f15688h = null;
                    }
                }
                if (this.f15693o.d() < i5) {
                    this.f15693o.u();
                }
                C1270c c1270c2 = this.f15693o;
                c1270c2.r(c1270c2.e().c(i5).a(this.f15690j));
                this.f15693o.z(i5);
                C1270c c1270c3 = this.f15693o;
                int i10 = this.f15702d;
                this.f15702d = -1;
                if (i10 >= 0) {
                    int[] iArr = c1270c3.k;
                    AbstractC3340k.e(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i10;
                    c1270c3.k = iArrCopyOf;
                } else {
                    c1270c3.getClass();
                }
                this.f15693o.A(this.f15690j);
                C1270c c1270c4 = this.f15693o;
                int[] iArr2 = this.k;
                c1270c4.getClass();
                if (iArr2.length != 0) {
                    int[] iArr3 = c1270c4.k;
                    if (iArr3.length != 0) {
                        int length2 = iArr3.length;
                        int length3 = iArr2.length;
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                        System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                        AbstractC3340k.b(iArrCopyOf2);
                        iArr2 = iArrCopyOf2;
                    }
                    c1270c4.k = iArr2;
                }
                this.f15692m = true;
                if (!this.f15694p) {
                    this.f15694p = true;
                    this.f15693o.l();
                }
                return i.f15703c;
            } finally {
            }
        }
    }
}
