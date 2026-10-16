package M;

import A.AbstractC0226t;
import A.C0212e;
import Ef.C0514u;
import N.C0718d;
import N.P;
import N.Y;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public C2384c f7189a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7190b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7191c;

    /* renamed from: d, reason: collision with root package name */
    public Float f7192d;

    /* renamed from: e, reason: collision with root package name */
    public Float f7193e;

    /* renamed from: f, reason: collision with root package name */
    public C2384c f7194f;

    /* renamed from: g, reason: collision with root package name */
    public final C0212e f7195g = AbstractC0226t.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: h, reason: collision with root package name */
    public final C0212e f7196h = AbstractC0226t.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: i, reason: collision with root package name */
    public final C0212e f7197i = AbstractC0226t.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: j, reason: collision with root package name */
    public final C0514u f7198j;
    public final Y k;

    /* renamed from: l, reason: collision with root package name */
    public final Y f7199l;

    public o(C2384c c2384c, float f10, boolean z2) {
        this.f7189a = c2384c;
        this.f7190b = f10;
        this.f7191c = z2;
        C0514u c0514u = new C0514u(true);
        c0514u.G(null);
        this.f7198j = c0514u;
        Boolean bool = Boolean.FALSE;
        P p10 = P.f7730f;
        this.k = C0718d.G(bool, p10);
        this.f7199l = C0718d.G(bool, p10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(lf.AbstractC3464c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof M.h
            if (r0 == 0) goto L13
            r0 = r9
            M.h r0 = (M.h) r0
            int r1 = r0.f7176d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7176d = r1
            goto L18
        L13:
            M.h r0 = new M.h
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f7174b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f7176d
            ef.C r3 = ef.C2515C.f34653a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            Fe.e.U(r9)
            return r3
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            M.o r2 = r0.f7173a
            Fe.e.U(r9)
            goto L70
        L3e:
            M.o r2 = r0.f7173a
            Fe.e.U(r9)
            goto L5c
        L44:
            Fe.e.U(r9)
            r0.f7173a = r8
            r0.f7176d = r6
            M.l r9 = new M.l
            r9.<init>(r8, r7)
            java.lang.Object r9 = Ef.H.l(r9, r0)
            if (r9 != r1) goto L57
            goto L58
        L57:
            r9 = r3
        L58:
            if (r9 != r1) goto L5b
            goto L86
        L5b:
            r2 = r8
        L5c:
            N.Y r9 = r2.k
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r9.setValue(r6)
            r0.f7173a = r2
            r0.f7176d = r5
            Ef.u r9 = r2.f7198j
            java.lang.Object r9 = r9.p(r0)
            if (r9 != r1) goto L70
            goto L86
        L70:
            r0.f7173a = r7
            r0.f7176d = r4
            r2.getClass()
            M.n r9 = new M.n
            r9.<init>(r2, r7)
            java.lang.Object r9 = Ef.H.l(r9, r0)
            if (r9 != r1) goto L83
            goto L84
        L83:
            r9 = r3
        L84:
            if (r9 != r1) goto L87
        L86:
            return r1
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: M.o.a(lf.c):java.lang.Object");
    }
}
