package N;

import A7.C0237b0;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;

/* renamed from: N.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713a0 implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final Q f7742a;

    /* renamed from: b, reason: collision with root package name */
    public final C0237b0 f7743b = new C0237b0((byte) 0, 3);

    public C0713a0(Q q4) {
        this.f7742a = q4;
    }

    public final void a() {
        C0237b0 c0237b0 = this.f7743b;
        synchronized (c0237b0.f813c) {
            c0237b0.f812b = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // N.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(tf.l r7, lf.AbstractC3464c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof N.Z
            if (r0 == 0) goto L13
            r0 = r8
            N.Z r0 = (N.Z) r0
            int r1 = r0.f7740e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7740e = r1
            goto L18
        L13:
            N.Z r0 = new N.Z
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f7738c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f7740e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            Fe.e.U(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            tf.l r7 = r0.f7737b
            N.a0 r2 = r0.f7736a
            Fe.e.U(r8)
            goto L7c
        L3a:
            Fe.e.U(r8)
            A7.b0 r8 = r6.f7743b
            r0.f7736a = r6
            r0.f7737b = r7
            r0.f7740e = r4
            boolean r2 = r8.q()
            if (r2 == 0) goto L4e
            ef.C r8 = ef.C2515C.f34653a
            goto L78
        L4e:
            Ef.n r2 = new Ef.n
            jf.c r5 = A6.h.A(r0)
            r2.<init>(r4, r5)
            r2.t()
            java.lang.Object r4 = r8.f813c
            monitor-enter(r4)
            java.lang.Object r5 = r8.f814d     // Catch: java.lang.Throwable -> L8d
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L8d
            r5.add(r2)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r4)
            A.W r4 = new A.W
            r5 = 13
            r4.<init>(r5, r8, r2)
            r2.v(r4)
            java.lang.Object r8 = r2.s()
            if (r8 != r1) goto L76
            goto L78
        L76:
            ef.C r8 = ef.C2515C.f34653a
        L78:
            if (r8 != r1) goto L7b
            goto L8b
        L7b:
            r2 = r6
        L7c:
            N.Q r8 = r2.f7742a
            r2 = 0
            r0.f7736a = r2
            r0.f7737b = r2
            r0.f7740e = r3
            java.lang.Object r7 = r8.d(r7, r0)
            if (r7 != r1) goto L8c
        L8b:
            return r1
        L8c:
            return r7
        L8d:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0713a0.d(tf.l, lf.c):java.lang.Object");
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g interfaceC3107g) {
        return Fe.e.C(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3106f
    public final InterfaceC3107g getKey() {
        return P.f7726b;
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g interfaceC3107g) {
        return Fe.e.N(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h plus(InterfaceC3108h interfaceC3108h) {
        return Fe.e.O(this, interfaceC3108h);
    }
}
