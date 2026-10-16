package defpackage;

/* loaded from: classes2.dex */
public final class pvx implements pwd {
    private static final yob a = yob.c("com/google/android/apps/gmm/systems/network/requirements/CachedQuantizedLocationRequirement");
    private final tmb b;
    private final pyh c;

    public pvx(tmb tmbVar, pyh pyhVar) {
        this.b = tmbVar;
        this.c = pyhVar;
    }

    @Override // defpackage.pwd
    public final pwe a() {
        return pwe.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0023, B:19:0x009e, B:20:0x00af, B:22:0x00b1, B:7:0x0030, B:9:0x0043, B:15:0x0079, B:10:0x004f, B:12:0x0057, B:14:0x006d, B:17:0x0090, B:16:0x0085), top: B:27:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1 A[Catch: all -> 0x00b3, DONT_GENERATE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0023, B:19:0x009e, B:20:0x00af, B:22:0x00b1, B:7:0x0030, B:9:0x0043, B:15:0x0079, B:10:0x004f, B:12:0x0057, B:14:0x006d, B:17:0x0090, B:16:0x0085), top: B:27:0x0001 }] */
    @Override // defpackage.pwd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pwn c() {
        /*
            r7 = this;
            monitor-enter(r7)
            yob r0 = defpackage.pvx.a     // Catch: java.lang.Throwable -> Lb3
            yop r1 = r0.d()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "Attempting to retrieve cached quantized location..."
            r3 = 6913(0x1b01, float:9.687E-42)
            defpackage.a.bU(r1, r2, r3)     // Catch: java.lang.Throwable -> Lb3
            pyh r1 = r7.c     // Catch: java.lang.Throwable -> Lb3
            pyk r2 = defpackage.pyk.ao     // Catch: java.lang.Throwable -> Lb3
            absi r3 = defpackage.absi.a     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class<absi> r3 = defpackage.absi.class
            abpc r3 = defpackage.abnv.L(r3)     // Catch: java.lang.Throwable -> Lb3
            abow r2 = r1.r(r2, r3)     // Catch: java.lang.Throwable -> Lb3
            absi r2 = (defpackage.absi) r2     // Catch: java.lang.Throwable -> Lb3
            r3 = 0
            if (r2 != 0) goto L30
            yop r0 = r0.d()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = "... no cached location available."
            r2 = 6916(0x1b04, float:9.691E-42)
            defpackage.a.bU(r0, r1, r2)     // Catch: java.lang.Throwable -> Lb3
        L2e:
            r4 = r3
            goto L9c
        L30:
            pwx r4 = new pwx     // Catch: java.lang.Throwable -> Lb3
            r4.<init>(r2)     // Catch: java.lang.Throwable -> Lb3
            pyk r2 = defpackage.pyk.ap     // Catch: java.lang.Throwable -> Lb3
            r5 = -1
            long r1 = r1.h(r2, r5)     // Catch: java.lang.Throwable -> Lb3
            r5 = 0
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4f
            yop r1 = r0.d()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "No expiration set for cached quantized device location."
            r5 = 6919(0x1b07, float:9.696E-42)
            defpackage.a.bU(r1, r2, r5)     // Catch: java.lang.Throwable -> Lb3
            goto L79
        L4f:
            absi r5 = r4.b     // Catch: java.lang.Throwable -> Lb3
            int r5 = r5.b     // Catch: java.lang.Throwable -> Lb3
            r5 = r5 & 4
            if (r5 == 0) goto L85
            j$.time.Instant r5 = r4.c     // Catch: java.lang.Throwable -> Lb3
            tmb r6 = r7.b     // Catch: java.lang.Throwable -> Lb3
            j$.time.Instant r6 = r6.f()     // Catch: java.lang.Throwable -> Lb3
            j$.time.Duration r5 = j$.time.Duration.between(r5, r6)     // Catch: java.lang.Throwable -> Lb3
            j$.time.Duration r1 = j$.time.Duration.ofMinutes(r1)     // Catch: java.lang.Throwable -> Lb3
            int r1 = r5.compareTo(r1)     // Catch: java.lang.Throwable -> Lb3
            if (r1 < 0) goto L79
            yop r1 = r0.d()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "Cached quantized device location is expired."
            r4 = 6917(0x1b05, float:9.693E-42)
            defpackage.a.bU(r1, r2, r4)     // Catch: java.lang.Throwable -> Lb3
            goto L90
        L79:
            yop r0 = r0.d()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = "Cached quantized device location is available."
            r2 = 6914(0x1b02, float:9.689E-42)
            defpackage.a.bU(r0, r1, r2)     // Catch: java.lang.Throwable -> Lb3
            goto L9c
        L85:
            yop r1 = r0.d()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "Cached quantized device location has no timestamp."
            r4 = 6918(0x1b06, float:9.694E-42)
            defpackage.a.bU(r1, r2, r4)     // Catch: java.lang.Throwable -> Lb3
        L90:
            yop r0 = r0.d()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = "Cached quantized device location is available but expired."
            r2 = 6915(0x1b03, float:9.69E-42)
            defpackage.a.bU(r0, r1, r2)     // Catch: java.lang.Throwable -> Lb3
            goto L2e
        L9c:
            if (r4 == 0) goto Lb1
            java.lang.String r0 = "X-Geo"
            r1 = 1
            pww[] r1 = new defpackage.pww[r1]     // Catch: java.lang.Throwable -> Lb3
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> Lb3
            java.util.ArrayList r1 = defpackage.yrm.R(r1)     // Catch: java.lang.Throwable -> Lb3
            pwn r2 = new pwn     // Catch: java.lang.Throwable -> Lb3
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb3
            return r2
        Lb1:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb3
            return r3
        Lb3:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvx.c():pwn");
    }

    @Override // defpackage.pwd
    public final zgp d() {
        throw new UnsupportedOperationException("Cached values are either immediately available or not at all. Use getNonBlocking().");
    }

    @Override // defpackage.pwd
    public final /* synthetic */ void e() {
    }
}
