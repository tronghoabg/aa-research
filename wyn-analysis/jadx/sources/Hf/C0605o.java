package Hf;

import java.util.List;

/* renamed from: Hf.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0605o implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5171b;

    public /* synthetic */ C0605o(Object obj, int i5) {
        this.f5170a = i5;
        this.f5171b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // Hf.InterfaceC0602l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(Hf.InterfaceC0603m r7, jf.InterfaceC3103c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f5170a
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L31;
                case 2: goto L1b;
                default: goto L5;
            }
        L5:
            Hf.f r0 = new Hf.f
            r1 = 5
            r0.<init>(r7, r1)
            java.lang.Object r7 = r6.f5171b
            Hf.f0 r7 = (Hf.f0) r7
            java.lang.Object r7 = r7.collect(r0, r8)
            kf.a r8 = kf.a.f39711a
            if (r7 != r8) goto L18
            goto L1a
        L18:
            ef.C r7 = ef.C2515C.f34653a
        L1a:
            return r7
        L1b:
            Hf.f r0 = new Hf.f
            r1 = 4
            r0.<init>(r7, r1)
            java.lang.Object r7 = r6.f5171b
            Hf.g0 r7 = (Hf.g0) r7
            java.lang.Object r7 = r7.collect(r0, r8)
            kf.a r8 = kf.a.f39711a
            if (r7 != r8) goto L2e
            goto L30
        L2e:
            ef.C r7 = ef.C2515C.f34653a
        L30:
            return r7
        L31:
            java.lang.Object r0 = r6.f5171b
            java.lang.Object r7 = r7.emit(r0, r8)
            kf.a r8 = kf.a.f39711a
            if (r7 != r8) goto L3c
            goto L3e
        L3c:
            ef.C r7 = ef.C2515C.f34653a
        L3e:
            return r7
        L3f:
            boolean r0 = r8 instanceof Hf.C0604n
            if (r0 == 0) goto L52
            r0 = r8
            Hf.n r0 = (Hf.C0604n) r0
            int r1 = r0.f5164b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L52
            int r1 = r1 - r2
            r0.f5164b = r1
            goto L57
        L52:
            Hf.n r0 = new Hf.n
            r0.<init>(r6, r8)
        L57:
            java.lang.Object r8 = r0.f5163a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5164b
            r3 = 1
            if (r2 == 0) goto L75
            if (r2 != r3) goto L6d
            java.util.Iterator r7 = r0.f5167e
            java.util.Iterator r7 = (java.util.Iterator) r7
            Hf.m r2 = r0.f5166d
            Fe.e.U(r8)
            r8 = r2
            goto L83
        L6d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L75:
            Fe.e.U(r8)
            java.lang.Object r8 = r6.f5171b
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r8 = r7
            r7 = r5
        L83:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L9d
            java.lang.Object r2 = r7.next()
            r0.f5166d = r8
            r4 = r7
            java.util.Iterator r4 = (java.util.Iterator) r4
            r0.f5167e = r4
            r0.f5164b = r3
            java.lang.Object r2 = r8.emit(r2, r0)
            if (r2 != r1) goto L83
            goto L9f
        L9d:
            ef.C r1 = ef.C2515C.f34653a
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.C0605o.collect(Hf.m, jf.c):java.lang.Object");
    }

    public C0605o(List list) {
        this.f5170a = 0;
        this.f5171b = list;
    }
}
