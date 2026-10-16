package t0;

import A7.AbstractC0279p0;
import android.graphics.Paint;
import c7.C1576l;
import e0.C2465q;
import e0.InterfaceC2463o;
import kotlin.jvm.internal.AbstractC3340k;
import r0.C3905j;
import u0.C4188n;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4061i extends y implements L0.b {

    /* renamed from: A, reason: collision with root package name */
    public static final C1576l f45480A;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C4070r f45481z;

    static {
        C1576l c1576lD = e0.z.d();
        c1576lD.e(C2465q.f34376e);
        Paint paint = (Paint) c1576lD.f19706b;
        AbstractC3340k.e(paint, "<this>");
        paint.setStrokeWidth(1.0f);
        c1576lD.g(1);
        f45480A = c1576lD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4061i(t layoutNode) {
        super(layoutNode);
        AbstractC3340k.e(layoutNode, "layoutNode");
        this.f45481z = layoutNode.f45524o;
    }

    @Override // t0.y
    public final C4070r J() {
        return this.f45561e.f45524o;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0 A[LOOP:0: B:38:0x0082->B:54:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3 A[SYNTHETIC] */
    @Override // t0.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(t0.C4062j r17, long r18, t0.C4060h r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C4061i.Q(t0.j, long, t0.h, boolean, boolean):void");
    }

    @Override // t0.y
    public final void Z(InterfaceC2463o canvas) {
        AbstractC3340k.e(canvas, "canvas");
        t tVar = this.f45561e;
        InterfaceC4044I interfaceC4044IE = S3.f.E(tVar);
        P.d dVarK = tVar.k();
        int i5 = dVarK.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVarK.f8970a;
            int i10 = 0;
            do {
                t tVar2 = (t) objArr[i10];
                if (tVar2.f45528s) {
                    tVar2.h(canvas);
                }
                i10++;
            } while (i10 < i5);
        }
        if (((C4188n) interfaceC4044IE).getShowLayoutBounds()) {
            E(canvas, f45480A);
        }
    }

    @Override // L0.b
    public final float b() {
        return this.f45481z.b();
    }

    @Override // r0.InterfaceC3908m
    public final r0.t e(long j8) {
        p(j8);
        t tVar = this.f45561e;
        P.d dVarL = tVar.l();
        int i5 = dVarL.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVarL.f8970a;
            int i10 = 0;
            do {
                t tVar2 = (t) objArr[i10];
                tVar2.getClass();
                tVar2.f45508O = 3;
                i10++;
            } while (i10 < i5);
        }
        D0.b measureResult = tVar.f45521l.a(tVar.f45524o, tVar.i(), j8);
        AbstractC3340k.e(measureResult, "measureResult");
        tVar.f45533x.b0(measureResult);
        Y();
        return this;
    }

    @Override // L0.b
    public final float getFontScale() {
        return this.f45481z.getFontScale();
    }

    @Override // L0.b
    public final int j(float f10) {
        C4070r c4070r = this.f45481z;
        c4070r.getClass();
        return AbstractC0279p0.a(c4070r, f10);
    }

    @Override // L0.b
    public final float l(long j8) {
        C4070r c4070r = this.f45481z;
        c4070r.getClass();
        return AbstractC0279p0.b(j8, c4070r);
    }

    @Override // t0.y, r0.t
    public final void m(long j8, float f10, tf.l lVar) {
        super.m(j8, f10, lVar);
        y yVar = this.f45562f;
        if (yVar == null || !yVar.f45572q) {
            for (X0.E e7 = this.f45574s[4]; e7 != null; e7 = (X0.E) e7.f15790d) {
                ((r0.q) ((Z.j) ((C4050O) e7).f15789c)).r(this);
            }
            t tVar = this.f45561e;
            t tVarJ = tVar.j();
            C4061i c4061i = tVar.f45533x;
            float f11 = c4061i.f45571p;
            y yVar2 = tVar.f45534y.f45436f;
            while (!AbstractC3340k.a(yVar2, c4061i)) {
                C4036A c4036a = (C4036A) yVar2;
                f11 += c4036a.f45571p;
                yVar2 = c4036a.f45418z;
            }
            if (f11 != tVar.f45535z) {
                tVar.f45535z = f11;
                if (tVarJ != null) {
                    tVarJ.x();
                }
                if (tVarJ != null) {
                    tVarJ.o();
                }
            }
            if (!tVar.f45528s) {
                if (tVarJ != null) {
                    tVarJ.o();
                }
                tVar.t();
            }
            if (tVarJ == null) {
                tVar.f45529t = 0;
            } else if (!tVar.f45504J && tVarJ.f45507N == 2) {
                if (tVar.f45529t != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Place was called on a node which was placed already");
                }
                int i5 = tVarJ.f45531v;
                tVar.f45529t = i5;
                tVarJ.f45531v = i5 + 1;
            }
            tVar.s();
        }
    }

    @Override // L0.b
    public final float t(float f10) {
        return this.f45481z.b() * f10;
    }

    @Override // t0.y
    public final int v(C3905j alignmentLine) {
        AbstractC3340k.e(alignmentLine, "alignmentLine");
        t tVar = this.f45561e;
        tVar.f45534y.getClass();
        int i5 = tVar.f45507N;
        u uVar = tVar.f45527r;
        if (i5 == 1) {
            uVar.f45539d = true;
            if (uVar.f45537b) {
                tVar.L = true;
            }
        } else {
            uVar.f45540e = true;
        }
        tVar.s();
        Integer num = (Integer) uVar.f45542g.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // L0.b
    public final long y(long j8) {
        C4070r c4070r = this.f45481z;
        c4070r.getClass();
        return AbstractC0279p0.c(j8, c4070r);
    }
}
