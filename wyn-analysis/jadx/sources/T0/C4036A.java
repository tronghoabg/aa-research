package t0;

import android.graphics.Paint;
import c7.C1576l;
import e0.C2465q;
import e0.InterfaceC2463o;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import r0.C3905j;
import r0.InterfaceC3907l;
import u0.C4188n;

/* renamed from: t0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4036A extends y {

    /* renamed from: C, reason: collision with root package name */
    public static final C1576l f45415C;

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC3907l f45416A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f45417B;

    /* renamed from: z, reason: collision with root package name */
    public y f45418z;

    static {
        C1576l c1576lD = e0.z.d();
        c1576lD.e(C2465q.f34377f);
        Paint paint = (Paint) c1576lD.f19706b;
        AbstractC3340k.e(paint, "<this>");
        paint.setStrokeWidth(1.0f);
        c1576lD.g(1);
        f45415C = c1576lD;
    }

    @Override // t0.y
    public final C4070r J() {
        return this.f45418z.J();
    }

    @Override // t0.y
    public final y N() {
        return this.f45418z;
    }

    @Override // t0.y
    public final void Z(InterfaceC2463o canvas) {
        AbstractC3340k.e(canvas, "canvas");
        this.f45418z.D(canvas);
        if (((C4188n) S3.f.E(this.f45561e)).getShowLayoutBounds()) {
            E(canvas, f45415C);
        }
    }

    @Override // r0.InterfaceC3908m
    public final r0.t e(long j8) {
        p(j8);
        b0(this.f45416A.q(this.f45418z.J(), this.f45418z, j8));
        InterfaceC4042G interfaceC4042G = this.f45577v;
        if (interfaceC4042G != null) {
            interfaceC4042G.d(this.f44309c);
        }
        Y();
        return this;
    }

    @Override // t0.y, r0.t
    public final void m(long j8, float f10, tf.l lVar) {
        super.m(j8, f10, lVar);
        y yVar = this.f45562f;
        if (yVar == null || !yVar.f45572q) {
            for (X0.E e7 = this.f45574s[4]; e7 != null; e7 = (X0.E) e7.f15790d) {
                ((r0.q) ((Z.j) ((C4050O) e7).f15789c)).r(this);
            }
            int i5 = (int) (this.f44309c >> 32);
            L0.i iVar = this.f45418z.J().f45488a.f45525p;
            int i10 = r0.s.f44306c;
            L0.i iVar2 = r0.s.f44305b;
            r0.s.f44306c = i5;
            r0.s.f44305b = iVar;
            I().c();
            r0.s.f44306c = i10;
            r0.s.f44305b = iVar2;
        }
    }

    @Override // t0.y
    public final int v(C3905j alignmentLine) {
        AbstractC3340k.e(alignmentLine, "alignmentLine");
        if (((Map) I().f2261e).containsKey(alignmentLine)) {
            Integer num = (Integer) ((Map) I().f2261e).get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iH = this.f45418z.H(alignmentLine);
        if (iH == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        this.f45572q = true;
        m(this.f45570o, this.f45571p, this.f45564h);
        this.f45572q = false;
        return alignmentLine instanceof C3905j ? iH + ((int) (this.f45418z.f45570o & 4294967295L)) : iH + ((int) (this.f45418z.f45570o >> 32));
    }
}
