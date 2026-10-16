package io.ktor.utils.io;

import Ef.C0507p0;
import ef.C2515C;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final L f37363a = new L();

    /* renamed from: b, reason: collision with root package name */
    public static final S f37364b = new S(null);

    public static a0 a(byte[] content) {
        int length = content.length;
        AbstractC3340k.e(content, "content");
        Pf.a aVar = new Pf.a();
        aVar.w(length, content);
        return new a0(aVar);
    }

    public static final void b(InterfaceC2886t interfaceC2886t) {
        AbstractC3340k.e(interfaceC2886t, "<this>");
        interfaceC2886t.a(new IOException("Channel was cancelled"));
    }

    public static final void c(J j8, Throwable th) {
        AbstractC3340k.e(j8, "<this>");
        if (th != null) {
            j8.a(th);
            return;
        }
        C0507p0 c0507p0 = new C0507p0(1, j8, J.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 12);
        L l10 = f37363a;
        try {
            Jf.b.h(C2515C.f34653a, A6.h.A(new kf.b(c0507p0)));
        } catch (Throwable th2) {
            AbstractC3935e.v(l10, th2);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:27:0x006d, B:29:0x0073, B:39:0x00a9, B:47:0x00c5), top: B:56:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[Catch: all -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:27:0x006d, B:29:0x0073, B:39:0x00a9, B:47:0x00c5), top: B:56:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r14v0, types: [io.ktor.utils.io.t] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [io.ktor.utils.io.J] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v5, types: [io.ktor.utils.io.J] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.t] */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009f -> B:20:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(io.ktor.utils.io.InterfaceC2886t r14, io.ktor.utils.io.P r15, lf.AbstractC3464c r16) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.d(io.ktor.utils.io.t, io.ktor.utils.io.P, lf.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r1.g(r4, r13) == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.J] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.J] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.J] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d4 -> B:20:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(io.ktor.utils.io.InterfaceC2886t r17, io.ktor.utils.io.J r18, long r19, lf.AbstractC3464c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.e(io.ktor.utils.io.t, io.ktor.utils.io.J, long, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c5 -> B:39:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(io.ktor.utils.io.InterfaceC2886t r9, final java.nio.channels.FileChannel r10, final long r11, lf.AbstractC3464c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.f(io.ktor.utils.io.t, java.nio.channels.FileChannel, long, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004f -> B:26:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0060 -> B:25:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(io.ktor.utils.io.InterfaceC2886t r12, long r13, lf.AbstractC3464c r15) throws java.io.EOFException {
        /*
            boolean r0 = r15 instanceof io.ktor.utils.io.C2889w
            if (r0 == 0) goto L13
            r0 = r15
            io.ktor.utils.io.w r0 = (io.ktor.utils.io.C2889w) r0
            int r1 = r0.f37453e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37453e = r1
            goto L18
        L13:
            io.ktor.utils.io.w r0 = new io.ktor.utils.io.w
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f37452d
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f37453e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r12 = r0.f37451c
            long r4 = r0.f37450b
            io.ktor.utils.io.t r14 = r0.f37449a
            Fe.e.U(r15)
            goto L63
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            Fe.e.U(r15)
            r4 = r13
        L39:
            r6 = 0
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 <= 0) goto L8b
            boolean r15 = r12.h()
            if (r15 != 0) goto L8b
            Pf.a r15 = r12.d()
            r15.getClass()
            long r6 = r15.f9456c
            int r15 = (int) r6
            if (r15 != 0) goto L66
            r0.f37449a = r12
            r0.f37450b = r4
            r0.f37451c = r13
            r0.f37453e = r3
            java.lang.Object r15 = r12.g(r3, r0)
            if (r15 != r1) goto L60
            return r1
        L60:
            r10 = r13
            r14 = r12
            r12 = r10
        L63:
            r10 = r12
            r12 = r14
            r13 = r10
        L66:
            Pf.a r15 = r12.d()
            long r6 = Fe.b.C(r15)
            long r6 = java.lang.Math.min(r13, r6)
            Pf.a r15 = r12.d()
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.AbstractC3340k.e(r15, r2)
            r15.request(r6)
            long r8 = Fe.b.C(r15)
            long r8 = java.lang.Math.min(r6, r8)
            r15.skip(r8)
            long r13 = r13 - r6
            goto L39
        L8b:
            long r4 = r4 - r13
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.g(io.ktor.utils.io.t, long, lf.c):java.lang.Object");
    }

    public static final Object h(J j8, AbstractC3464c abstractC3464c) throws Throwable {
        Object objE;
        AbstractC3340k.e(j8, "<this>");
        Throwable thB = j8.b();
        if (thB != null) {
            throw thB;
        }
        if (j8 instanceof C2880m) {
        }
        C2515C c2515c = C2515C.f34653a;
        Pf.a aVarC = j8.c();
        AbstractC3340k.e(aVarC, "<this>");
        return (((int) aVarC.f9456c) < 1048576 || (objE = j8.e(abstractC3464c)) != kf.a.f39711a) ? c2515c : objE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable i(io.ktor.utils.io.InterfaceC2886t r4, int r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.C2890x
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.x r0 = (io.ktor.utils.io.C2890x) r0
            int r1 = r0.f37457d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37457d = r1
            goto L18
        L13:
            io.ktor.utils.io.x r0 = new io.ktor.utils.io.x
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37456c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f37457d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f37455b
            io.ktor.utils.io.t r4 = r0.f37454a
            Fe.e.U(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            Fe.e.U(r6)
            boolean r6 = r4.h()
            if (r6 == 0) goto L3d
            goto L52
        L3d:
            r0.f37454a = r4
            r0.f37455b = r5
            r0.f37457d = r3
            java.lang.Object r6 = r4.g(r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L54
        L52:
            r4 = 0
            return r4
        L54:
            Pf.a r4 = r4.d()
            r4.getClass()
            Pf.c r6 = new Pf.c
            r6.<init>(r4)
            Pf.e r4 = new Pf.e
            r4.<init>(r6)
            byte[] r4 = Pf.j.e(r4, r5)
            Qf.a r5 = new Qf.a
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.i(io.ktor.utils.io.t, int, lf.c):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(io.ktor.utils.io.InterfaceC2886t r4, lf.AbstractC3464c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.C2891y
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.y r0 = (io.ktor.utils.io.C2891y) r0
            int r1 = r0.f37461d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37461d = r1
            goto L18
        L13:
            io.ktor.utils.io.y r0 = new io.ktor.utils.io.y
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f37460c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f37461d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Pf.a r4 = r0.f37459b
            io.ktor.utils.io.t r2 = r0.f37458a
            Fe.e.U(r5)
            r5 = r4
            r4 = r2
            goto L3d
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Fe.e.U(r5)
            Pf.a r5 = new Pf.a
            r5.<init>()
        L3d:
            boolean r2 = r4.h()
            if (r2 != 0) goto L57
            Pf.a r2 = r4.d()
            r5.h(r2)
            r0.f37458a = r4
            r0.f37459b = r5
            r0.f37461d = r3
            java.lang.Object r2 = r4.g(r3, r0)
            if (r2 != r1) goto L3d
            return r1
        L57:
            java.lang.Throwable r4 = r4.b()
            if (r4 != 0) goto L5e
            return r5
        L5e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.j(io.ktor.utils.io.t, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:24:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:23:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(io.ktor.utils.io.X r11, int r12, lf.AbstractC3464c r13) throws java.io.EOFException {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.C2892z
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.z r0 = (io.ktor.utils.io.C2892z) r0
            int r1 = r0.f37466e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37466e = r1
            goto L18
        L13:
            io.ktor.utils.io.z r0 = new io.ktor.utils.io.z
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f37465d
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f37466e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r11 = r0.f37464c
            Pf.a r12 = r0.f37463b
            io.ktor.utils.io.t r2 = r0.f37462a
            Fe.e.U(r13)
            goto L62
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            Fe.e.U(r13)
            Pf.a r13 = new Pf.a
            r13.<init>()
            r10 = r13
            r13 = r12
            r12 = r10
        L40:
            long r4 = r12.f9456c
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L94
            Pf.a r2 = r11.d()
            boolean r2 = r2.exhausted()
            if (r2 == 0) goto L64
            r0.f37462a = r11
            r0.f37463b = r12
            r0.f37464c = r13
            r0.f37466e = r3
            java.lang.Object r2 = r11.g(r3, r0)
            if (r2 != r1) goto L60
            return r1
        L60:
            r2 = r11
            r11 = r13
        L62:
            r13 = r11
            r11 = r2
        L64:
            boolean r2 = r11.h()
            if (r2 != 0) goto L94
            Pf.a r2 = r11.d()
            long r4 = Fe.b.C(r2)
            long r6 = (long) r13
            long r8 = r12.f9456c
            long r8 = r6 - r8
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L86
            Pf.a r2 = r11.d()
            long r4 = r12.f9456c
            long r6 = r6 - r4
            r2.b(r12, r6)
            goto L40
        L86:
            Pf.a r2 = r11.d()
            long r4 = r2.i(r12)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            goto L40
        L94:
            long r0 = r12.f9456c
            long r2 = (long) r13
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto L9c
            return r12
        L9c:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r13 = pd.f.l(r13, r0, r1)
            long r0 = r12.f9456c
            java.lang.String r12 = " available"
            java.lang.String r12 = Va.M6.s(r13, r0, r12)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.k(io.ktor.utils.io.X, int, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(io.ktor.utils.io.InterfaceC2886t r8, long r9, lf.AbstractC3464c r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.B
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.B r0 = (io.ktor.utils.io.B) r0
            int r1 = r0.f37324e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37324e = r1
            goto L18
        L13:
            io.ktor.utils.io.B r0 = new io.ktor.utils.io.B
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f37323d
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f37324e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r8 = r0.f37322c
            Pf.a r10 = r0.f37321b
            io.ktor.utils.io.t r2 = r0.f37320a
            Fe.e.U(r11)
            r11 = r10
            r9 = r8
            r8 = r2
            goto L40
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            Fe.e.U(r11)
            Pf.a r11 = new Pf.a
            r11.<init>()
        L40:
            boolean r2 = r8.h()
            if (r2 != 0) goto L88
            r4 = 0
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 <= 0) goto L88
            Pf.a r2 = r8.d()
            long r6 = Fe.b.C(r2)
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 < 0) goto L70
            Pf.a r2 = r8.d()
            long r4 = Fe.b.C(r2)
            long r4 = r9 - r4
            Pf.a r9 = r8.d()
            long r9 = r9.i(r11)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            goto L77
        L70:
            Pf.a r2 = r8.d()
            r2.b(r11, r9)
        L77:
            r0.f37320a = r8
            r0.f37321b = r11
            r0.f37322c = r4
            r0.f37324e = r3
            java.lang.Object r9 = r8.g(r3, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r9 = r4
            goto L40
        L88:
            r11.getClass()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.l(io.ktor.utils.io.t, long, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(io.ktor.utils.io.InterfaceC2886t r4, lf.AbstractC3464c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.A
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.A r0 = (io.ktor.utils.io.A) r0
            int r1 = r0.f37319d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37319d = r1
            goto L18
        L13:
            io.ktor.utils.io.A r0 = new io.ktor.utils.io.A
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f37318c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f37319d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Pf.a r4 = r0.f37317b
            io.ktor.utils.io.t r2 = r0.f37316a
            Fe.e.U(r5)
            r5 = r4
            r4 = r2
            goto L3d
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Fe.e.U(r5)
            Pf.a r5 = new Pf.a
            r5.<init>()
        L3d:
            boolean r2 = r4.h()
            if (r2 != 0) goto L57
            Pf.a r2 = r4.d()
            r5.h(r2)
            r0.f37316a = r4
            r0.f37317b = r5
            r0.f37319d = r3
            java.lang.Object r2 = r4.g(r3, r0)
            if (r2 != r1) goto L3d
            return r1
        L57:
            java.lang.Throwable r4 = r4.b()
            if (r4 != 0) goto L61
            r5.getClass()
            return r5
        L61:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.m(io.ktor.utils.io.t, lf.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r0.g(1, r5) == r6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018b, code lost:
    
        if (r14.f9456c >= r7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018d, code lost:
    
        r5.f37325a = r4;
        r5.f37326b = r3;
        r5.f37327c = r15;
        r5.f37328d = r14;
        r5.f37329e = r7;
        r5.f37330f = r0;
        r1 = 3;
        r5.f37332h = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
    
        if (r4.g(1, r5) != r6) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a5, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c7, code lost:
    
        throw new Td.a("Line exceeds limit of " + r7 + " characters");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x01e6: INVOKE (r15 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: r7.e.m(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void throws java.lang.Exception (m)] (LINE:487), block:B:84:0x01e6 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[Catch: all -> 0x0049, LOOP:0: B:37:0x00c2->B:64:0x0180, LOOP_START, TryCatch #1 {all -> 0x0049, blocks: (B:14:0x0043, B:35:0x00bc, B:37:0x00c2, B:39:0x00cc, B:41:0x00d8, B:43:0x00e2, B:48:0x00ff, B:50:0x010c, B:52:0x0117, B:54:0x013f, B:53:0x013a, B:57:0x0151, B:58:0x0165, B:60:0x0168, B:64:0x0180, B:65:0x0186, B:67:0x018d, B:71:0x01ac, B:72:0x01c7, B:73:0x01c8, B:77:0x01d1, B:79:0x01d7, B:21:0x0064), top: B:88:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c8 A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:14:0x0043, B:35:0x00bc, B:37:0x00c2, B:39:0x00cc, B:41:0x00d8, B:43:0x00e2, B:48:0x00ff, B:50:0x010c, B:52:0x0117, B:54:0x013f, B:53:0x013a, B:57:0x0151, B:58:0x0165, B:60:0x0168, B:64:0x0180, B:65:0x0186, B:67:0x018d, B:71:0x01ac, B:72:0x01c7, B:73:0x01c8, B:77:0x01d1, B:79:0x01d7, B:21:0x0064), top: B:88:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Appendable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01a3 -> B:70:0x01a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(io.ktor.utils.io.InterfaceC2886t r18, Ld.c r19, int r20, int r21, lf.AbstractC3464c r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.n(io.ktor.utils.io.t, Ld.c, int, int, lf.c):java.lang.Object");
    }

    public static final void o(int i5, int i10) throws IOException {
        List list = Y.f37379b;
        if ((i5 | i10) == i5) {
            return;
        }
        throw new IOException("Unexpected line ending " + ((Object) Y.a(i10)) + ", while expected " + ((Object) Y.a(i5)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (g(r5, r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(io.ktor.utils.io.InterfaceC2886t r5, Qf.a r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.F
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.F r0 = (io.ktor.utils.io.F) r0
            int r1 = r0.f37343d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37343d = r1
            goto L18
        L13:
            io.ktor.utils.io.F r0 = new io.ktor.utils.io.F
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f37342c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f37343d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            Fe.e.U(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            Qf.a r6 = r0.f37341b
            io.ktor.utils.io.t r5 = r0.f37340a
            Fe.e.U(r7)
            goto L4d
        L3a:
            Fe.e.U(r7)
            byte[] r7 = r6.f10005a
            int r7 = r7.length
            r0.f37340a = r5
            r0.f37341b = r6
            r0.f37343d = r4
            java.lang.Comparable r7 = i(r5, r7, r0)
            if (r7 != r1) goto L4d
            goto L64
        L4d:
            boolean r7 = kotlin.jvm.internal.AbstractC3340k.a(r7, r6)
            if (r7 == 0) goto L68
            byte[] r6 = r6.f10005a
            int r6 = r6.length
            long r6 = (long) r6
            r2 = 0
            r0.f37340a = r2
            r0.f37341b = r2
            r0.f37343d = r3
            java.lang.Object r5 = g(r5, r6, r0)
            if (r5 != r1) goto L65
        L64:
            return r1
        L65:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L68:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.p(io.ktor.utils.io.t, Qf.a, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable q(io.ktor.utils.io.InterfaceC2886t r4, lf.AbstractC3464c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.G
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.G r0 = (io.ktor.utils.io.G) r0
            int r1 = r0.f37345b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37345b = r1
            goto L18
        L13:
            io.ktor.utils.io.G r0 = new io.ktor.utils.io.G
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f37344a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f37345b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            Fe.e.U(r5)
            r0.f37345b = r3
            java.lang.Object r5 = j(r4, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            Pf.a r5 = (Pf.a) r5
            long r0 = r5.f9456c
            int r4 = (int) r0
            byte[] r4 = Pf.j.e(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N.q(io.ktor.utils.io.t, lf.c):java.io.Serializable");
    }
}
