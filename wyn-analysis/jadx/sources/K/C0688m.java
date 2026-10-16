package K;

import A.C0212e;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: K.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688m extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f6273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212e f6274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f6275c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f6276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D.h f6277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0688m(C0212e c0212e, n nVar, float f10, D.h hVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f6274b = c0212e;
        this.f6275c = nVar;
        this.f6276d = f10;
        this.f6277e = hVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C0688m(this.f6274b, this.f6275c, this.f6276d, this.f6277e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0688m) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[PHI: r4
  0x0064: PHI (r4v3 A.Z) = (r4v2 A.Z), (r4v2 A.Z), (r4v4 A.Z), (r4v4 A.Z), (r4v4 A.Z) binds: [B:32:0x0076, B:38:0x0082, B:22:0x0062, B:25:0x0068, B:28:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r7.f6273a
            ef.C r2 = ef.C2515C.f34653a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            Fe.e.U(r8)
            return r2
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            Fe.e.U(r8)
            A.e r8 = r7.f6274b
            N.Y r1 = r8.f145e
            java.lang.Object r1 = r1.getValue()
            L0.d r1 = (L0.d) r1
            float r1 = r1.f6795a
            K.n r4 = r7.f6275c
            float r5 = r4.f6279b
            boolean r5 = L0.d.a(r1, r5)
            r6 = 0
            if (r5 == 0) goto L39
            D.k r1 = new D.k
            long r4 = d0.C2384c.f33931b
            r1.<init>(r4)
            goto L56
        L39:
            float r5 = r4.f6281d
            boolean r5 = L0.d.a(r1, r5)
            if (r5 == 0) goto L47
            D.e r1 = new D.e
            r1.<init>()
            goto L56
        L47:
            float r4 = r4.f6282e
            boolean r1 = L0.d.a(r1, r4)
            if (r1 == 0) goto L55
            D.a r1 = new D.a
            r1.<init>()
            goto L56
        L55:
            r1 = r6
        L56:
            r7.f6273a = r3
            A.Z r3 = K.p.f6284a
            D.h r3 = r7.f6277e
            if (r3 == 0) goto L70
            boolean r1 = r3 instanceof D.k
            A.Z r4 = K.p.f6284a
            if (r1 == 0) goto L66
        L64:
            r6 = r4
            goto L85
        L66:
            boolean r1 = r3 instanceof D.e
            if (r1 == 0) goto L6b
            goto L64
        L6b:
            boolean r1 = r3 instanceof D.a
            if (r1 == 0) goto L85
            goto L64
        L70:
            if (r1 == 0) goto L85
            boolean r3 = r1 instanceof D.k
            A.Z r4 = K.p.f6285b
            if (r3 == 0) goto L79
            goto L64
        L79:
            boolean r3 = r1 instanceof D.e
            if (r3 == 0) goto L80
            A.Z r6 = K.p.f6286c
            goto L85
        L80:
            boolean r1 = r1 instanceof D.a
            if (r1 == 0) goto L85
            goto L64
        L85:
            float r1 = r7.f6276d
            if (r6 == 0) goto L97
            L0.d r3 = new L0.d
            r3.<init>(r1)
            java.lang.Object r8 = A.C0212e.c(r8, r3, r6, r7)
            if (r8 != r0) goto L95
            goto La2
        L95:
            r8 = r2
            goto La2
        L97:
            L0.d r3 = new L0.d
            r3.<init>(r1)
            java.lang.Object r8 = r8.e(r3, r7)
            if (r8 != r0) goto L95
        La2:
            if (r8 != r0) goto La5
            return r0
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: K.C0688m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
