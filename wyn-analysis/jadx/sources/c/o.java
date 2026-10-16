package C;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1749a = new h(3, null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(p0.s r10, p0.g r11, boolean r12, lf.AbstractC3462a r13) {
        /*
            boolean r0 = r13 instanceof C.i
            if (r0 == 0) goto L13
            r0 = r13
            C.i r0 = (C.i) r0
            int r1 = r0.f1724e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1724e = r1
            goto L18
        L13:
            C.i r0 = new C.i
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f1723d
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f1724e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r10 = r0.f1722c
            p0.g r11 = r0.f1721b
            p0.s r12 = r0.f1720a
            Fe.e.U(r13)
            r9 = r12
            r12 = r10
            r10 = r9
            goto L4a
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            Fe.e.U(r13)
        L3b:
            r0.f1720a = r10
            r0.f1721b = r11
            r0.f1722c = r12
            r0.f1724e = r3
            java.lang.Object r13 = r10.e(r11, r0)
            if (r13 != r1) goto L4a
            return r1
        L4a:
            p0.f r13 = (p0.f) r13
            java.util.List r2 = r13.f43133a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L54:
            if (r6 >= r4) goto L80
            java.lang.Object r7 = r2.get(r6)
            p0.k r7 = (p0.k) r7
            if (r12 == 0) goto L75
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.AbstractC3340k.e(r7, r8)
            boolean r8 = r7.b()
            if (r8 != 0) goto L73
            boolean r8 = r7.f43147g
            if (r8 != 0) goto L73
            boolean r7 = r7.f43144d
            if (r7 == 0) goto L73
            r7 = r3
            goto L79
        L73:
            r7 = r5
            goto L79
        L75:
            boolean r7 = android.support.v4.media.session.b.N(r7)
        L79:
            if (r7 != 0) goto L7d
            r2 = r5
            goto L81
        L7d:
            int r6 = r6 + 1
            goto L54
        L80:
            r2 = r3
        L81:
            if (r2 == 0) goto L3b
            java.util.List r10 = r13.f43133a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: C.o.a(p0.s, p0.g, boolean, lf.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r14 = r8.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r2 >= r14) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r6 = (p0.k) r8.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r6.b() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (android.support.v4.media.session.b.k0(r6, r13.f43177e.f43184i, r13.h()) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        r14 = p0.g.f43138c;
        r0.f1746a = r13;
        r0.f1748c = 2;
        r14 = r13.e(r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r14 != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[PHI: r13 r14
  0x004b: PHI (r13v1 p0.s) = (r13v5 p0.s), (r13v8 p0.s) binds: [B:18:0x0048, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r14v2 java.lang.Object) = (r14v8 java.lang.Object), (r14v1 java.lang.Object) binds: [B:18:0x0048, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0093 -> B:36:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(p0.s r13, lf.AbstractC3462a r14) {
        /*
            boolean r0 = r14 instanceof C.n
            if (r0 == 0) goto L13
            r0 = r14
            C.n r0 = (C.n) r0
            int r1 = r0.f1748c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1748c = r1
            goto L18
        L13:
            C.n r0 = new C.n
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f1747b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f1748c
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            p0.s r13 = r0.f1746a
            Fe.e.U(r14)
            goto L96
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            p0.s r13 = r0.f1746a
            Fe.e.U(r14)
            goto L4b
        L3b:
            Fe.e.U(r14)
        L3e:
            p0.g r14 = p0.g.f43137b
            r0.f1746a = r13
            r0.f1748c = r3
            java.lang.Object r14 = r13.e(r14, r0)
            if (r14 != r1) goto L4b
            goto L95
        L4b:
            p0.f r14 = (p0.f) r14
            java.util.List r2 = r14.f43133a
            int r6 = r2.size()
            r7 = r5
        L54:
            java.util.List r8 = r14.f43133a
            if (r7 >= r6) goto Lb5
            java.lang.Object r9 = r2.get(r7)
            p0.k r9 = (p0.k) r9
            boolean r9 = android.support.v4.media.session.b.O(r9)
            if (r9 != 0) goto Lb2
            int r14 = r8.size()
            r2 = r5
        L69:
            if (r2 >= r14) goto L89
            java.lang.Object r6 = r8.get(r2)
            p0.k r6 = (p0.k) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto Lad
            p0.t r7 = r13.f43177e
            long r9 = r7.f43184i
            long r11 = r13.h()
            boolean r6 = android.support.v4.media.session.b.k0(r6, r9, r11)
            if (r6 == 0) goto L86
            goto Lad
        L86:
            int r2 = r2 + 1
            goto L69
        L89:
            p0.g r14 = p0.g.f43138c
            r0.f1746a = r13
            r0.f1748c = r4
            java.lang.Object r14 = r13.e(r14, r0)
            if (r14 != r1) goto L96
        L95:
            return r1
        L96:
            p0.f r14 = (p0.f) r14
            java.util.List r14 = r14.f43133a
            int r2 = r14.size()
            r6 = r5
        L9f:
            if (r6 >= r2) goto L3e
            java.lang.Object r7 = r14.get(r6)
            p0.k r7 = (p0.k) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Laf
        Lad:
            r13 = 0
            return r13
        Laf:
            int r6 = r6 + 1
            goto L9f
        Lb2:
            int r7 = r7 + 1
            goto L54
        Lb5:
            java.lang.Object r13 = r8.get(r5)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: C.o.b(p0.s, lf.a):java.lang.Object");
    }
}
