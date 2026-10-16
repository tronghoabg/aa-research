package Kd;

import java.io.IOException;
import kotlin.jvm.internal.E;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Qf.a f6782a;

    /* renamed from: b, reason: collision with root package name */
    public static final Qf.a f6783b;

    static {
        byte[] bArrF = Fe.c.F("\r\n", Bf.a.f1670a);
        f6782a = new Qf.a(bArrF, 0, bArrF.length);
        f6783b = new Qf.a(new byte[]{45, 45});
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ac, code lost:
    
        if (r3.e(r7) != r8) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(Qf.a r27, io.ktor.utils.io.X r28, io.ktor.utils.io.C2880m r29, Kd.d r30, long r31, lf.AbstractC3464c r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kd.o.a(Qf.a, io.ktor.utils.io.X, io.ktor.utils.io.m, Kd.d, long, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.utils.io.X r9, lf.AbstractC3464c r10) throws java.lang.Throwable {
        /*
            r0 = 1
            boolean r1 = r10 instanceof Kd.m
            if (r1 == 0) goto L14
            r1 = r10
            Kd.m r1 = (Kd.m) r1
            int r2 = r1.f6778c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f6778c = r2
            goto L19
        L14:
            Kd.m r1 = new Kd.m
            r1.<init>(r10)
        L19:
            java.lang.Object r10 = r1.f6777b
            kf.a r2 = kf.a.f39711a
            int r3 = r1.f6778c
            r4 = 0
            if (r3 == 0) goto L34
            if (r3 != r0) goto L2c
            Ld.c r9 = r1.f6776a
            Fe.e.U(r10)     // Catch: java.lang.Throwable -> L2a
            goto L56
        L2a:
            r10 = move-exception
            goto L69
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            Fe.e.U(r10)
            Ld.c r10 = new Ld.c
            r10.<init>()
            r1.f6776a = r10     // Catch: java.lang.Throwable -> L67
            r1.f6778c = r0     // Catch: java.lang.Throwable -> L67
            java.util.Set r3 = Kd.h.f6754a     // Catch: java.lang.Throwable -> L67
            D9.n r3 = new D9.n     // Catch: java.lang.Throwable -> L67
            r5 = 2
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L67
            r3.f2592b = r4     // Catch: java.lang.Throwable -> L67
            r3.f2593c = r4     // Catch: java.lang.Throwable -> L67
            java.lang.Object r9 = Kd.h.c(r9, r10, r3, r1)     // Catch: java.lang.Throwable -> L67
            if (r9 != r2) goto L53
            return r2
        L53:
            r8 = r10
            r10 = r9
            r9 = r8
        L56:
            Kd.d r10 = (Kd.d) r10     // Catch: java.lang.Throwable -> L2a
            if (r10 == 0) goto L5b
            return r10
        L5b:
            java.io.EOFException r10 = new java.io.EOFException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "Failed to parse multipart headers: unexpected end of stream"
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            throw r10     // Catch: java.lang.Throwable -> L2a
        L63:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L69
        L67:
            r9 = move-exception
            goto L63
        L69:
            java.util.ArrayList r1 = r9.f7087b
            r2 = 0
            Wd.d r3 = r9.f7086a
            if (r1 == 0) goto L82
            r9.f7088c = r2
            int r5 = r1.size()
            r6 = r4
        L77:
            if (r6 >= r5) goto L8b
            java.lang.Object r7 = r1.get(r6)
            r3.S(r7)
            int r6 = r6 + r0
            goto L77
        L82:
            char[] r1 = r9.f7088c
            if (r1 == 0) goto L89
            r3.S(r1)
        L89:
            r9.f7088c = r2
        L8b:
            r9.f7090e = r0
            r9.f7087b = r2
            r9.f7089d = r2
            r9.f7092g = r4
            r9.f7091f = r4
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Kd.o.b(io.ktor.utils.io.X, lf.c):java.lang.Object");
    }

    public static final void c(E e7, byte[] bArr, byte b5) {
        int i5 = e7.f39738a;
        if (i5 >= bArr.length) {
            throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
        e7.f39738a = i5 + 1;
        bArr[i5] = b5;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(io.ktor.utils.io.InterfaceC2886t r4, Qf.a r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof Kd.n
            if (r0 == 0) goto L13
            r0 = r6
            Kd.n r0 = (Kd.n) r0
            int r1 = r0.f6781c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6781c = r1
            goto L18
        L13:
            Kd.n r0 = new Kd.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6780b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f6781c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Qf.a r5 = r0.f6779a
            Fe.e.U(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            Fe.e.U(r6)
            r0.f6779a = r5
            r0.f6781c = r3
            java.lang.Object r6 = io.ktor.utils.io.N.p(r4, r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4c
            byte[] r4 = r5.f10005a
            int r4 = r4.length
            long r4 = (long) r4
            goto L4e
        L4c:
            r4 = 0
        L4e:
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Kd.o.d(io.ktor.utils.io.t, Qf.a, lf.c):java.lang.Object");
    }
}
