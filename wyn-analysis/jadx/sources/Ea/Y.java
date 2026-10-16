package ea;

/* loaded from: classes4.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f34509a = new Y();

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(P9.d r9, lf.AbstractC3464c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ea.C2502q
            if (r0 == 0) goto L13
            r0 = r10
            ea.q r0 = (ea.C2502q) r0
            int r1 = r0.f34573d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34573d = r1
            goto L18
        L13:
            ea.q r0 = new ea.q
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f34571b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f34573d
            java.lang.String r3 = ""
            java.lang.String r4 = "InstallationId"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r9 = r0.f34570a
            java.lang.String r9 = (java.lang.String) r9
            Fe.e.U(r10)     // Catch: java.lang.Exception -> L33
            goto L95
        L33:
            r10 = move-exception
            goto L9e
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f34570a
            P9.d r9 = (P9.d) r9
            Fe.e.U(r10)     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r10 = move-exception
            goto L78
        L48:
            Fe.e.U(r10)
            r10 = r9
            P9.c r10 = (P9.c) r10     // Catch: java.lang.Exception -> L46
            com.google.android.gms.tasks.Task r9 = r10.e()     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "firebaseInstallations.getToken(false)"
            kotlin.jvm.internal.AbstractC3340k.d(r9, r2)     // Catch: java.lang.Exception -> L76
            r0.f34570a = r10     // Catch: java.lang.Exception -> L76
            r0.f34573d = r6     // Catch: java.lang.Exception -> L76
            java.lang.Object r9 = Fe.e.k(r9, r0)     // Catch: java.lang.Exception -> L76
            if (r9 != r1) goto L62
            goto L94
        L62:
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            P9.a r10 = (P9.a) r10     // Catch: java.lang.Exception -> L46
            java.lang.String r10 = r10.f9265a     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
            kotlin.jvm.internal.AbstractC3340k.d(r10, r2)     // Catch: java.lang.Exception -> L46
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7f
        L72:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L78
        L76:
            r9 = move-exception
            goto L72
        L78:
            java.lang.String r2 = "Error getting authentication token."
            android.util.Log.w(r4, r2, r10)
            r10 = r9
            r9 = r3
        L7f:
            P9.c r10 = (P9.c) r10     // Catch: java.lang.Exception -> L33
            com.google.android.gms.tasks.Task r10 = r10.d()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "firebaseInstallations.id"
            kotlin.jvm.internal.AbstractC3340k.d(r10, r2)     // Catch: java.lang.Exception -> L33
            r0.f34570a = r9     // Catch: java.lang.Exception -> L33
            r0.f34573d = r5     // Catch: java.lang.Exception -> L33
            java.lang.Object r10 = Fe.e.k(r10, r0)     // Catch: java.lang.Exception -> L33
            if (r10 != r1) goto L95
        L94:
            return r1
        L95:
            java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
            kotlin.jvm.internal.AbstractC3340k.d(r10, r0)     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L33
            r3 = r10
            goto La3
        L9e:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r4, r0, r10)
        La3:
            ea.r r10 = new ea.r
            r10.<init>(r3, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.Y.a(P9.d, lf.c):java.lang.Object");
    }
}
