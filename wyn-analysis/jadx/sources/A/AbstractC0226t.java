package A;

import N.C0718d;
import N.C0732k;
import N.C0740o;
import com.unity3d.services.UnityAdsConstants;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import u0.C4165b0;

/* renamed from: A.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0226t {

    /* renamed from: a, reason: collision with root package name */
    public static final C0224q f183a = new C0224q(0.2f);

    public static C0212e a(float f10) {
        return new C0212e(Float.valueOf(f10), b0.f128a, Float.valueOf(0.01f));
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(A.C0217j r23, A.L r24, long r25, A.C0208a r27, lf.AbstractC3464c r28) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.AbstractC0226t.b(A.j, A.L, long, A.a, lf.c):java.lang.Object");
    }

    public static final AbstractC0221n c(AbstractC0221n abstractC0221n) {
        AbstractC3340k.e(abstractC0221n, "<this>");
        AbstractC0221n abstractC0221nC = abstractC0221n.c();
        int iB = abstractC0221nC.b();
        for (int i5 = 0; i5 < iB; i5++) {
            abstractC0221nC.e(abstractC0221n.a(i5), i5);
        }
        return abstractC0221nC;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.internal.n, tf.l] */
    public static final M d(U u10, S3.e typeConverter, String str, C0740o c0740o) {
        S3.i iVar;
        AbstractC3340k.e(typeConverter, "typeConverter");
        c0740o.M(-1714122528);
        c0740o.M(1157296644);
        boolean zE = c0740o.e(u10);
        Object objF = c0740o.F();
        if (zE || objF == C0732k.f7800a) {
            objF = new M(u10, typeConverter, str);
            c0740o.U(objF);
        }
        c0740o.p(false);
        M m10 = (M) objF;
        C0718d.c(m10, new W(1, u10, m10), c0740o);
        if (u10.d() && (iVar = m10.f55c) != null) {
            ?? r62 = (AbstractC3343n) iVar.f10963c;
            U u11 = m10.f56d;
            ((O) iVar.f10961a).d(r62.invoke(u11.c().f57a), ((AbstractC3343n) iVar.f10963c).invoke(u11.c().f58b), (InterfaceC0227u) ((AbstractC3343n) iVar.f10962b).invoke(u11.c()));
        }
        c0740o.p(false);
        return m10;
    }

    public static final O e(U u10, Object obj, Object obj2, InterfaceC0227u animationSpec, S3.e typeConverter, String label, C0740o c0740o) {
        U u11;
        Object obj3;
        AbstractC3340k.e(animationSpec, "animationSpec");
        AbstractC3340k.e(typeConverter, "typeConverter");
        AbstractC3340k.e(label, "label");
        c0740o.M(-304821198);
        c0740o.M(1157296644);
        boolean zE = c0740o.e(u10);
        Object objF = c0740o.F();
        if (zE || objF == C0732k.f7800a) {
            u11 = u10;
            obj3 = obj;
            O o7 = new O(u11, obj3, f(typeConverter, obj2), typeConverter, label);
            c0740o.U(o7);
            objF = o7;
        } else {
            u11 = u10;
            obj3 = obj;
        }
        c0740o.p(false);
        O o10 = (O) objF;
        if (u11.d()) {
            o10.d(obj3, obj2, animationSpec);
        } else {
            o10.e(obj2, animationSpec);
        }
        C0718d.c(o10, new W(2, u11, o10), c0740o);
        c0740o.p(false);
        return o10;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.n, tf.l] */
    public static final AbstractC0221n f(S3.e eVar, Object obj) {
        AbstractC3340k.e(eVar, "<this>");
        AbstractC0221n abstractC0221n = (AbstractC0221n) ((AbstractC3343n) eVar.f10941b).invoke(obj);
        AbstractC3340k.e(abstractC0221n, "<this>");
        return abstractC0221n.c();
    }

    public static final void g(C0215h c0215h, long j8, float f10, L l10, C0217j c0217j, tf.l lVar) {
        long j10 = f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? l10.f51h : (long) ((j8 - c0215h.f158b) / f10);
        c0215h.f162f = j8;
        c0215h.f160d.setValue(l10.a(j10));
        AbstractC0221n abstractC0221nB = l10.b(j10);
        AbstractC3340k.e(abstractC0221nB, "<set-?>");
        c0215h.f161e = abstractC0221nB;
        if (j10 >= l10.f51h) {
            c0215h.f163g = c0215h.f162f;
            c0215h.f164h.setValue(Boolean.FALSE);
        }
        k(c0215h, c0217j);
        lVar.invoke(c0215h);
    }

    public static final float h(InterfaceC3108h interfaceC3108h) {
        AbstractC3340k.e(interfaceC3108h, "<this>");
        C4165b0 c4165b0 = (C4165b0) interfaceC3108h.get(Z.a.f16912n);
        float fFloatValue = c4165b0 != null ? ((Number) c4165b0.f46199a.getValue()).floatValue() : 1.0f;
        if (fFloatValue >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return fFloatValue;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static F i(int i5, Object obj) {
        float f10 = (i5 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i5 & 4) != 0) {
            obj = null;
        }
        return new F(f10, obj);
    }

    public static Z j(int i5, r rVar, int i10) {
        if ((i10 & 1) != 0) {
            i5 = 300;
        }
        if ((i10 & 4) != 0) {
            rVar = f183a;
        }
        return new Z(i5, rVar);
    }

    public static final void k(C0215h c0215h, C0217j state) {
        AbstractC3340k.e(c0215h, "<this>");
        AbstractC3340k.e(state, "state");
        ((N.Y) state.f170f).setValue(c0215h.f160d.getValue());
        AbstractC0221n abstractC0221n = (AbstractC0221n) state.f171g;
        AbstractC0221n source = c0215h.f161e;
        AbstractC3340k.e(abstractC0221n, "<this>");
        AbstractC3340k.e(source, "source");
        int iB = abstractC0221n.b();
        for (int i5 = 0; i5 < iB; i5++) {
            abstractC0221n.e(source.a(i5), i5);
        }
        state.f167c = c0215h.f163g;
        state.f166b = c0215h.f162f;
        state.f168d = ((Boolean) c0215h.f164h.getValue()).booleanValue();
    }

    public static final U l(Object obj, C0740o c0740o, int i5, int i10) {
        c0740o.M(2029166765);
        String str = (i10 & 2) != 0 ? null : "AnimatedVisibility";
        c0740o.M(-492369756);
        Object objF = c0740o.F();
        if (objF == C0732k.f7800a) {
            objF = new U(new S3.c(obj), str);
            c0740o.U(objF);
        }
        c0740o.p(false);
        U u10 = (U) objF;
        u10.a(obj, c0740o, (i5 & 14) | (i5 & 8) | 48);
        C0718d.c(u10, new Y(u10, 0), c0740o);
        c0740o.p(false);
        return u10;
    }
}
