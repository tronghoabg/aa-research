package If;

import Hf.InterfaceC0603m;
import kotlin.jvm.internal.G;

/* loaded from: classes5.dex */
public final class m implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5489a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f5490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5491c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5493e;

    public m(kotlin.jvm.internal.E e7, G g9, Gf.t tVar, kotlin.jvm.internal.E e10) {
        this.f5491c = e7;
        this.f5490b = g9;
        this.f5492d = tVar;
        this.f5493e = e10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // Hf.InterfaceC0603m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, jf.InterfaceC3103c r10) {
        /*
            r8 = this;
            ef.C r0 = ef.C2515C.f34653a
            r1 = 0
            int r2 = r8.f5489a
            switch(r2) {
                case 0: goto L44;
                default: goto L8;
            }
        L8:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            kotlin.jvm.internal.G r4 = r8.f5490b
            if (r9 == 0) goto L38
            java.lang.Object r9 = r8.f5493e
            r5 = r9
            kotlin.jvm.internal.E r5 = (kotlin.jvm.internal.E) r5
            java.lang.Object r9 = r8.f5491c
            r3 = r9
            kotlin.jvm.internal.E r3 = (kotlin.jvm.internal.E) r3
            int r9 = r3.f39738a
            if (r9 == 0) goto L43
            java.lang.Object r9 = r4.f39740a
            if (r9 == 0) goto L25
            goto L43
        L25:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0
            r7 = 0
            java.lang.Object r9 = r8.f5492d
            r6 = r9
            Gf.t r6 = (Gf.t) r6
            r2.<init>(r3, r4, r5, r6, r7)
            r9 = 3
            Ef.H0 r9 = Ef.H.D(r6, r1, r2, r9)
            r4.f39740a = r9
            goto L43
        L38:
            java.lang.Object r9 = r4.f39740a
            Ef.m0 r9 = (Ef.InterfaceC0501m0) r9
            if (r9 == 0) goto L41
            r9.cancel(r1)
        L41:
            r4.f39740a = r1
        L43:
            return r0
        L44:
            boolean r2 = r10 instanceof If.l
            if (r2 == 0) goto L57
            r2 = r10
            If.l r2 = (If.l) r2
            int r3 = r2.f5488e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L57
            int r3 = r3 - r4
            r2.f5488e = r3
            goto L5c
        L57:
            If.l r2 = new If.l
            r2.<init>(r8, r10)
        L5c:
            java.lang.Object r10 = r2.f5486c
            kf.a r3 = kf.a.f39711a
            int r4 = r2.f5488e
            r5 = 1
            if (r4 == 0) goto L77
            if (r4 != r5) goto L6f
            java.lang.Object r9 = r2.f5485b
            If.m r2 = r2.f5484a
            Fe.e.U(r10)
            goto L9b
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L77:
            Fe.e.U(r10)
            kotlin.jvm.internal.G r10 = r8.f5490b
            java.lang.Object r10 = r10.f39740a
            Ef.m0 r10 = (Ef.InterfaceC0501m0) r10
            if (r10 == 0) goto L9a
            If.p r4 = new If.p
            java.lang.String r6 = "Child of the scoped flow was cancelled"
            r4.<init>(r6)
            r10.cancel(r4)
            r2.f5484a = r8
            r2.f5485b = r9
            r2.f5488e = r5
            java.lang.Object r10 = r10.join(r2)
            if (r10 != r3) goto L9a
            r0 = r3
            goto Lb6
        L9a:
            r2 = r8
        L9b:
            kotlin.jvm.internal.G r10 = r2.f5490b
            Ef.F r3 = Ef.F.f3663a
            If.k r3 = new If.k
            java.lang.Object r4 = r2.f5493e
            Hf.m r4 = (Hf.InterfaceC0603m) r4
            java.lang.Object r6 = r2.f5492d
            If.o r6 = (If.o) r6
            r3.<init>(r6, r4, r9, r1)
            java.lang.Object r9 = r2.f5491c
            Ef.E r9 = (Ef.E) r9
            Ef.H0 r9 = Ef.H.D(r9, r1, r3, r5)
            r10.f39740a = r9
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: If.m.emit(java.lang.Object, jf.c):java.lang.Object");
    }

    public m(G g9, Ef.E e7, o oVar, InterfaceC0603m interfaceC0603m) {
        this.f5490b = g9;
        this.f5491c = e7;
        this.f5492d = oVar;
        this.f5493e = interfaceC0603m;
    }
}
