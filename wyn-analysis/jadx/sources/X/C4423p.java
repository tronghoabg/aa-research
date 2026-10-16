package x;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3470i;

/* renamed from: x.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4423p extends AbstractC3470i implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Af.i f47540a;

    /* renamed from: b, reason: collision with root package name */
    public C4425r f47541b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f47542c;

    /* renamed from: d, reason: collision with root package name */
    public int f47543d;

    /* renamed from: e, reason: collision with root package name */
    public int f47544e;

    /* renamed from: f, reason: collision with root package name */
    public int f47545f;

    /* renamed from: g, reason: collision with root package name */
    public int f47546g;

    /* renamed from: h, reason: collision with root package name */
    public long f47547h;

    /* renamed from: i, reason: collision with root package name */
    public int f47548i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f47549j;
    public final /* synthetic */ C4425r k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Af.i f47550l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4423p(C4425r c4425r, Af.i iVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.k = c4425r;
        this.f47550l = iVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C4423p c4423p = new C4423p(this.k, this.f47550l, interfaceC3103c);
        c4423p.f47549j = obj;
        return c4423p;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4423p) create((Af.m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0093). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            kf.a r2 = kf.a.f39711a
            int r3 = r0.f47548i
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2f
            if (r3 != r1) goto L27
            int r3 = r0.f47546g
            int r6 = r0.f47545f
            long r7 = r0.f47547h
            int r9 = r0.f47544e
            int r10 = r0.f47543d
            long[] r11 = r0.f47542c
            x.r r12 = r0.f47541b
            Af.i r13 = r0.f47540a
            java.lang.Object r14 = r0.f47549j
            Af.m r14 = (Af.m) r14
            Fe.e.U(r22)
            goto L93
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            Fe.e.U(r22)
            java.lang.Object r3 = r0.f47549j
            Af.m r3 = (Af.m) r3
            x.r r6 = r0.k
            long[] r7 = r6.f47553a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La2
            Af.i r9 = r0.f47550l
            r10 = r4
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L9e
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r3
            r3 = r4
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r3 >= r6) goto L96
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L93
            int r4 = r9 << 3
            int r4 = r4 + r3
            r13.f1307b = r4
            java.lang.Object[] r5 = r12.f47554b
            r4 = r5[r4]
            r0.f47549j = r14
            r0.f47540a = r13
            r0.f47541b = r12
            r0.f47542c = r11
            r0.f47543d = r10
            r0.f47544e = r9
            r0.f47547h = r7
            r0.f47545f = r6
            r0.f47546g = r3
            r0.f47548i = r1
            r14.c(r4, r0)
            kf.a r1 = kf.a.f39711a
            return r2
        L93:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L65
        L96:
            if (r6 != r5) goto La2
            r8 = r10
            r7 = r11
            r6 = r12
            r3 = r14
            r10 = r9
            r9 = r13
        L9e:
            if (r10 == r8) goto La2
            int r10 = r10 + r1
            goto L42
        La2:
            ef.C r1 = ef.C2515C.f34653a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4423p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
