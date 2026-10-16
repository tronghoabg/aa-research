package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class qms extends qmf {
    public volatile String a;
    public Future c;

    public final String a() throws Throwable {
        qms qmsVar;
        qms qmsVar2;
        s();
        synchronized (this) {
            try {
                try {
                    if (this.a == null) {
                        this.c = g().a(new qmr(this, 0));
                    }
                    Future future = this.c;
                    if (future != null) {
                        try {
                            this.a = (String) future.get();
                            qmsVar2 = this;
                        } catch (InterruptedException e) {
                            qmsVar2 = this;
                            super.p(5, "ClientId loading or generation was interrupted", e, null, null);
                            qmsVar2.a = CloudRecognizerProtocolStrings.DBG_VALUE;
                        } catch (ExecutionException e2) {
                            try {
                                super.p(6, "Failed to load or generate client id", e2, null, null);
                                qmsVar2 = this;
                                qmsVar2.a = CloudRecognizerProtocolStrings.DBG_VALUE;
                            } catch (Throwable th) {
                                th = th;
                                qmsVar = this;
                                throw th;
                            }
                        }
                        if (qmsVar2.a == null) {
                            qmsVar2.a = CloudRecognizerProtocolStrings.DBG_VALUE;
                        }
                        super.p(2, "Loaded clientId", qmsVar2.a, null, null);
                        qmsVar2.c = null;
                    } else {
                        qmsVar2 = this;
                    }
                    String str = qmsVar2.a;
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    qmsVar = this;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x006d A[EXC_TOP_SPLITTER, PHI: r2 r9
  0x006d: PHI (r2v4 java.io.FileOutputStream) = (r2v3 java.io.FileOutputStream), (r2v5 java.io.FileOutputStream) binds: [B:40:0x006b, B:51:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x006d: PHI (r9v8 qms) = (r9v7 qms), (r9v9 qms) binds: [B:40:0x006b, B:51:0x0088] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qms.c():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0053 -> B:48:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0087 -> B:52:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.String d() throws java.lang.Throwable {
        /*
            r20 = this;
            java.lang.String r1 = "gaClientId"
            qlk r0 = r20.g()
            android.content.Context r2 = r0.b
            java.lang.String r0 = "ClientId should be loaded from worker thread"
            defpackage.spu.aq(r0)
            r3 = 0
            java.io.FileInputStream r4 = r2.openFileInput(r1)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L74 java.io.FileNotFoundException -> La3
            r0 = 36
            byte[] r5 = new byte[r0]     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            r6 = 0
            int r0 = r4.read(r5, r6, r0)     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            int r7 = r4.available()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            if (r7 <= 0) goto L39
            java.lang.String r10 = "clientId file seems corrupted, deleting it."
            r12 = 0
            r13 = 0
            r9 = 5
            r11 = 0
            r8 = r20
            super.p(r9, r10, r11, r12, r13)     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            r4.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            r2.deleteFile(r1)     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            if (r4 == 0) goto Lb6
        L34:
            r4.close()     // Catch: java.io.IOException -> La7
            goto Lb6
        L39:
            r7 = 14
            if (r0 >= r7) goto L54
            java.lang.String r16 = "clientId file is empty, deleting it."
            r18 = 0
            r19 = 0
            r15 = 5
            r17 = 0
            r14 = r20
            super.p(r15, r16, r17, r18, r19)     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            r4.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            r2.deleteFile(r1)     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            if (r4 == 0) goto Lb6
        L53:
            goto L34
        L54:
            r4.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            java.lang.String r7 = new java.lang.String     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            r7.<init>(r5, r6, r0)     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            java.lang.String r16 = "Read client id from disk"
            r18 = 0
            r19 = 0
            r15 = 2
            r14 = r20
            r17 = r7
            super.p(r15, r16, r17, r18, r19)     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L8a java.io.FileNotFoundException -> La4
            r3 = r17
            if (r4 == 0) goto Lb6
            goto L53
        L6f:
            r0 = move-exception
            goto L76
        L71:
            r0 = move-exception
            r1 = r0
            goto L8d
        L74:
            r0 = move-exception
            r4 = r3
        L76:
            r17 = r0
            java.lang.String r16 = "Error reading client id file, deleting it"
            r18 = 0
            r19 = 0
            r15 = 6
            r14 = r20
            super.p(r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L8a
            r2.deleteFile(r1)     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto Lb6
            goto L53
        L8a:
            r0 = move-exception
            r1 = r0
            r3 = r4
        L8d:
            if (r3 == 0) goto La2
            r3.close()     // Catch: java.io.IOException -> L93
            goto La2
        L93:
            r0 = move-exception
            r17 = r0
            r18 = 0
            r19 = 0
            r15 = 6
            java.lang.String r16 = "Failed to close client id reading stream"
            r14 = r20
            super.p(r15, r16, r17, r18, r19)
        La2:
            throw r1
        La3:
            r4 = r3
        La4:
            if (r4 == 0) goto Lb6
            goto L53
        La7:
            r0 = move-exception
            r17 = r0
            r18 = 0
            r19 = 0
            r15 = 6
            java.lang.String r16 = "Failed to close client id reading stream"
            r14 = r20
            super.p(r15, r16, r17, r18, r19)
        Lb6:
            if (r3 != 0) goto Lbd
            java.lang.String r0 = r20.c()
            return r0
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qms.d():java.lang.String");
    }

    @Override // defpackage.qmf
    protected final void b() {
    }
}
