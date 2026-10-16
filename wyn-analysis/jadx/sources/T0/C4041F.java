package t0;

import A.AbstractC0213f;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3908m;
import u0.C4188n;

/* renamed from: t0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4041F extends r0.t implements InterfaceC3908m {

    /* renamed from: e, reason: collision with root package name */
    public final t f45435e;

    /* renamed from: f, reason: collision with root package name */
    public y f45436f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45437g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45438h;

    /* renamed from: i, reason: collision with root package name */
    public long f45439i;

    /* renamed from: j, reason: collision with root package name */
    public tf.l f45440j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public Object f45441l;

    public C4041F(t layoutNode, C4061i c4061i) {
        AbstractC3340k.e(layoutNode, "layoutNode");
        this.f45435e = layoutNode;
        this.f45436f = c4061i;
        this.f45439i = L0.g.f6802b;
    }

    @Override // r0.InterfaceC3908m
    public final Object a() {
        return this.f45441l;
    }

    @Override // r0.InterfaceC3908m
    public final r0.t e(long j8) {
        t tVar = this.f45435e;
        t tVarJ = tVar.j();
        if (tVarJ == null) {
            tVar.f45508O = 3;
        } else {
            if (tVar.f45508O != 3 && !tVar.f45532w) {
                StringBuilder sb2 = new StringBuilder("measure() may not be called multiple times on the same Measurable. Current state ");
                int i5 = tVar.f45508O;
                sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "NotUsed" : "InLayoutBlock" : "InMeasureBlock");
                sb2.append(". Parent state ");
                sb2.append(pd.f.t(tVarJ.f45507N));
                sb2.append('.');
                throw new IllegalStateException(sb2.toString().toString());
            }
            int iF = AbstractC0213f.f(tVarJ.f45507N);
            int i10 = 1;
            if (iF != 0) {
                if (iF != 1) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block.Parents state is ".concat(pd.f.t(tVarJ.f45507N)));
                }
                i10 = 2;
            }
            tVar.f45508O = i10;
        }
        q(j8);
        return this;
    }

    @Override // r0.t
    public final int h() {
        throw null;
    }

    @Override // r0.t
    public final void m(long j8, float f10, tf.l lVar) {
        this.f45439i = j8;
        this.k = f10;
        this.f45440j = lVar;
        y yVar = this.f45436f;
        y yVar2 = yVar.f45562f;
        if (yVar2 != null && yVar2.f45572q) {
            if (lVar == null) {
                r0.s.b(yVar, j8, f10);
                return;
            } else {
                r0.s.f(yVar, j8, f10, lVar);
                return;
            }
        }
        this.f45438h = true;
        t tVar = this.f45435e;
        tVar.f45527r.f45540e = false;
        C4046K snapshotObserver = ((C4188n) S3.f.E(tVar)).getSnapshotObserver();
        C4040E c4040e = new C4040E(this, j8, f10, lVar);
        snapshotObserver.getClass();
        snapshotObserver.a(tVar, snapshotObserver.f45445d, c4040e);
    }

    public final boolean q(long j8) {
        t tVar = this.f45435e;
        InterfaceC4044I interfaceC4044IE = S3.f.E(tVar);
        t tVarJ = tVar.j();
        boolean z2 = true;
        tVar.f45532w = tVar.f45532w || (tVarJ != null && tVarJ.f45532w);
        if (!tVar.f45505K && this.f44310d == j8) {
            ((C4188n) interfaceC4044IE).f46265D.b(tVar);
            tVar.A();
            return false;
        }
        tVar.f45527r.f45539d = false;
        P.d dVarL = tVar.l();
        int i5 = dVarL.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVarL.f8970a;
            int i10 = 0;
            do {
                ((t) objArr[i10]).f45527r.getClass();
                i10++;
            } while (i10 < i5);
        }
        this.f45437g = true;
        long j10 = this.f45436f.f44309c;
        p(j8);
        tVar.f45507N = 1;
        tVar.f45505K = false;
        C4046K snapshotObserver = ((C4188n) S3.f.E(tVar)).getSnapshotObserver();
        C4071s c4071s = new C4071s(tVar, j8);
        snapshotObserver.getClass();
        snapshotObserver.a(tVar, snapshotObserver.f45443b, c4071s);
        if (tVar.f45507N == 1) {
            tVar.L = true;
            tVar.f45507N = 3;
        }
        if (L0.h.a(this.f45436f.f44309c, j10)) {
            y yVar = this.f45436f;
            if (yVar.f44307a == this.f44307a && yVar.f44308b == this.f44308b) {
                z2 = false;
            }
        }
        y yVar2 = this.f45436f;
        long jA = Ba.c.a(yVar2.f44307a, yVar2.f44308b);
        if (!L0.h.a(this.f44309c, jA)) {
            this.f44309c = jA;
            o();
        }
        return z2;
    }
}
