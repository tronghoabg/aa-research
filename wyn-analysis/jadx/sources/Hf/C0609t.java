package Hf;

/* renamed from: Hf.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0609t implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0611v f5199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.q f5200b;

    public C0609t(C0611v c0611v, tf.q qVar) {
        this.f5199a = c0611v;
        this.f5200b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Hf.InterfaceC0602l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(Hf.InterfaceC0603m r9, jf.InterfaceC3103c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Hf.C0608s
            if (r0 == 0) goto L13
            r0 = r10
            Hf.s r0 = (Hf.C0608s) r0
            int r1 = r0.f5191b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5191b = r1
            goto L18
        L13:
            Hf.s r0 = new Hf.s
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f5190a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5191b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f5193d
            If.z r9 = (If.z) r9
            Fe.e.U(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f5193d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            Fe.e.U(r10)
            goto La0
        L44:
            Hf.m r9 = r0.f5194e
            java.lang.Object r2 = r0.f5193d
            Hf.t r2 = (Hf.C0609t) r2
            Fe.e.U(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            Fe.e.U(r10)
            Hf.v r10 = r8.f5199a     // Catch: java.lang.Throwable -> L8a
            r0.f5193d = r8     // Catch: java.lang.Throwable -> L8a
            r0.f5194e = r9     // Catch: java.lang.Throwable -> L8a
            r0.f5191b = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            goto L9f
        L62:
            r2 = r8
        L63:
            If.z r10 = new If.z
            jf.h r4 = r0.getContext()
            r10.<init>(r9, r4)
            tf.q r9 = r2.f5200b     // Catch: java.lang.Throwable -> L82
            r0.f5193d = r10     // Catch: java.lang.Throwable -> L82
            r0.f5194e = r6     // Catch: java.lang.Throwable -> L82
            r0.f5191b = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            ef.C r9 = ef.C2515C.f34653a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            Hf.D0 r10 = new Hf.D0
            r10.<init>(r9)
            tf.q r2 = r2.f5200b
            r0.f5193d = r9
            r0.f5194e = r6
            r0.f5191b = r4
            java.lang.Object r10 = Hf.k0.e(r10, r2, r9, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.C0609t.collect(Hf.m, jf.c):java.lang.Object");
    }
}
