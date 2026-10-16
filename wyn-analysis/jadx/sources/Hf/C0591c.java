package Hf;

import jf.InterfaceC3108h;
import lf.AbstractC3471j;

/* renamed from: Hf.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0591c extends C0598h {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC3471j f5117e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0591c(tf.p pVar, InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        super(pVar, interfaceC3108h, i5, aVar);
        this.f5117e = (AbstractC3471j) pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Hf.C0598h, If.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(Gf.t r5, jf.InterfaceC3103c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Hf.C0589b
            if (r0 == 0) goto L13
            r0 = r6
            Hf.b r0 = (Hf.C0589b) r0
            int r1 = r0.f5116d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5116d = r1
            goto L1a
        L13:
            Hf.b r0 = new Hf.b
            lf.c r6 = (lf.AbstractC3464c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f5114b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5116d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Gf.t r5 = r0.f5113a
            Fe.e.U(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            Fe.e.U(r6)
            r0.f5113a = r5
            r0.f5116d = r3
            java.lang.Object r6 = super.d(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            Gf.s r5 = (Gf.s) r5
            Gf.e r5 = r5.f4839d
            boolean r5 = r5.w()
            if (r5 == 0) goto L4e
            ef.C r5 = ef.C2515C.f34653a
            return r5
        L4e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.C0591c.d(Gf.t, jf.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [lf.j, tf.p] */
    @Override // Hf.C0598h, If.g
    public final If.g e(InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        return new C0591c(this.f5117e, interfaceC3108h, i5, aVar);
    }
}
