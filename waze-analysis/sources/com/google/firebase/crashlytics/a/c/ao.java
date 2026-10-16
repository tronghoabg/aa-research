package com.google.firebase.crashlytics.a.c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ao implements au {

    /* renamed from: a, reason: collision with root package name */
    private final File f9134a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9135b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9136c;

    ao(String str, String str2, File file) {
        this.f9135b = str;
        this.f9136c = str2;
        this.f9134a = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d A[RETURN] */
    @Override // com.google.firebase.crashlytics.a.c.au
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.crashlytics.a.e.bh a() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.InputStream r2 = r7.b()     // Catch: java.io.IOException -> L58
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L42
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L3b
        L15:
            int r5 = r2.read(r0)     // Catch: java.lang.Throwable -> L31
            if (r5 <= 0) goto L20
            r6 = 0
            r4.write(r0, r6, r5)     // Catch: java.lang.Throwable -> L31
            goto L15
        L20:
            r4.finish()     // Catch: java.lang.Throwable -> L31
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L31
            r4.close()     // Catch: java.lang.Throwable -> L42
            r3.close()     // Catch: java.lang.Throwable -> L4c
            r2.close()     // Catch: java.io.IOException -> L58
            goto L59
        L31:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.lang.Throwable -> L42
        L3a:
            throw r0     // Catch: java.lang.Throwable -> L42
        L3b:
            r4.close()     // Catch: java.lang.Throwable -> L42
            r3.close()     // Catch: java.lang.Throwable -> L4c
            goto L58
        L42:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L4c
        L4b:
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.io.IOException -> L58
        L57:
            throw r0     // Catch: java.io.IOException -> L58
        L58:
            r0 = r1
        L59:
            if (r0 == 0) goto L6d
            com.google.firebase.crashlytics.a.e.ck r1 = new com.google.firebase.crashlytics.a.e.ck
            r1.<init>()
            r1.e(r0)
            java.lang.String r7 = r7.f9135b
            r1.f(r7)
            com.google.firebase.crashlytics.a.e.bh r7 = r1.d()
            return r7
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.a.c.ao.a():com.google.firebase.crashlytics.a.e.bh");
    }

    @Override // com.google.firebase.crashlytics.a.c.au
    public final InputStream b() {
        File file = this.f9134a;
        if (file.exists() && file.isFile()) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.a.c.au
    public final String c() {
        return this.f9136c;
    }
}
