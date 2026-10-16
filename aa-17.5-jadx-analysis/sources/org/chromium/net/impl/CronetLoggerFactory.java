package org.chromium.net.impl;

/* loaded from: classes2.dex */
public final class CronetLoggerFactory {
    private static final String a = "CronetLoggerFactory";
    private static CronetLogger b;

    public static final class SwapLoggerForTesting implements AutoCloseable {
        public SwapLoggerForTesting(CronetLogger cronetLogger) {
            CronetLoggerFactory.b(cronetLogger);
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            CronetLoggerFactory.b(null);
        }
    }

    private CronetLoggerFactory() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:10:0x0013, B:13:0x001c, B:14:0x0023, B:16:0x0027, B:17:0x002e, B:18:0x0030), top: B:23:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.chromium.net.impl.CronetLogger a(android.content.Context r3, org.chromium.net.impl.CronetLogger.CronetSource r4) {
        /*
            java.lang.Class<org.chromium.net.impl.CronetLoggerFactory> r0 = org.chromium.net.impl.CronetLoggerFactory.class
            monitor-enter(r0)
            org.chromium.net.impl.CronetLogger r1 = org.chromium.net.impl.CronetLoggerFactory.b     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L23
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r2 = 30
            if (r1 < r2) goto L23
            boolean r3 = org.chromium.net.impl.CronetManifest.b(r3, r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L23
            akby r3 = new akby     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L32
            r3.<init>()     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L32
            org.chromium.net.impl.CronetLoggerFactory.b = r3     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L32
            goto L23
        L1b:
            r3 = move-exception
            java.lang.String r4 = org.chromium.net.impl.CronetLoggerFactory.a     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Exception creating an instance of CronetLoggerImpl"
            defpackage.ahkw.d(r4, r1, r3)     // Catch: java.lang.Throwable -> L32
        L23:
            org.chromium.net.impl.CronetLogger r3 = org.chromium.net.impl.CronetLoggerFactory.b     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L2e
            org.chromium.net.impl.NoOpLogger r3 = new org.chromium.net.impl.NoOpLogger     // Catch: java.lang.Throwable -> L32
            r3.<init>()     // Catch: java.lang.Throwable -> L32
            org.chromium.net.impl.CronetLoggerFactory.b = r3     // Catch: java.lang.Throwable -> L32
        L2e:
            org.chromium.net.impl.CronetLogger r3 = org.chromium.net.impl.CronetLoggerFactory.b     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r3
        L32:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetLoggerFactory.a(android.content.Context, org.chromium.net.impl.CronetLogger$CronetSource):org.chromium.net.impl.CronetLogger");
    }

    public static void b(CronetLogger cronetLogger) {
        synchronized (CronetLoggerFactory.class) {
            b = cronetLogger;
        }
    }
}
