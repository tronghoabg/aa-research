package B;

import ef.C2515C;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.AbstractC3470i;

/* loaded from: classes.dex */
public final class M extends AbstractC3470i implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1384a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3108h f1386c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Kd.a f1387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D.i f1388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N.V f1389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(InterfaceC3108h interfaceC3108h, Kd.a aVar, D.i iVar, N.V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1386c = interfaceC3108h;
        this.f1387d = aVar;
        this.f1388e = iVar;
        this.f1389f = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        M m10 = new M(this.f1386c, this.f1387d, this.f1388e, this.f1389f, interfaceC3103c);
        m10.f1385b = obj;
        return m10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((p0.s) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r9.f1384a
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r9.f1385b
            p0.s r1 = (p0.s) r1
            Fe.e.U(r10)
            goto L36
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L19:
            Fe.e.U(r10)
            java.lang.Object r10 = r9.f1385b
            p0.s r10 = (p0.s) r10
            r1 = r10
        L21:
            jf.h r10 = r9.f1386c
            boolean r10 = Ef.H.z(r10)
            if (r10 == 0) goto L5a
            r9.f1385b = r1
            r9.f1384a = r2
            p0.g r10 = p0.g.f43137b
            java.lang.Object r10 = r1.e(r10, r9)
            if (r10 != r0) goto L36
            return r0
        L36:
            p0.f r10 = (p0.f) r10
            int r10 = r10.f43135c
            r3 = 4
            Kd.a r4 = r9.f1387d
            r5 = 3
            r6 = 0
            N.V r7 = r9.f1389f
            D.i r8 = r9.f1388e
            if (r10 != r3) goto L4e
            B.K r10 = new B.K
            r10.<init>(r8, r7, r6)
            Ef.H.D(r4, r6, r10, r5)
            goto L21
        L4e:
            r3 = 5
            if (r10 != r3) goto L21
            B.L r10 = new B.L
            r10.<init>(r8, r7, r6)
            Ef.H.D(r4, r6, r10, r5)
            goto L21
        L5a:
            ef.C r10 = ef.C2515C.f34653a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: B.M.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
