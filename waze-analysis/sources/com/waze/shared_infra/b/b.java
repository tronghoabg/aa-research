package com.waze.shared_infra.b;

import com.waze.shared_infra.i.h;
import h.g.b.x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final String f37795a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37796b;

    public b(String str, String str2) {
        x.f(str, "cacheDirPath");
        x.f(str2, "filename");
        this.f37795a = str;
        this.f37796b = str2;
    }

    @Override // com.waze.shared_infra.b.a
    public final void a() {
        try {
            new File(this.f37795a, this.f37796b).delete();
        } catch (IOException e2) {
            h.l("ByteStorage", "failed to delete ".concat(this.f37796b), e2);
        }
    }

    @Override // com.waze.shared_infra.b.a
    public final void b(byte[] bArr) throws Throwable {
        File file;
        String str;
        String str2;
        FileOutputStream fileOutputStream;
        x.f(bArr, "data");
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                str = this.f37795a;
                str2 = this.f37796b;
                file = new File(str, str2 + ".tmp");
                file.createNewFile();
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            FileOutputStream fileOutputStream3 = fileOutputStream;
            fileOutputStream3.write(bArr);
            fileOutputStream3.close();
            file.renameTo(new File(str, str2));
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            h.l("ByteStorage", "failed to store " + this.f37796b, e);
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // com.waze.shared_infra.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] c() throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "ByteStorage"
            java.lang.String r1 = "Reading failed, file doesn't exist at - "
            java.lang.String r2 = "failed to read "
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.lang.String r5 = r7.f37795a     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.lang.String r6 = r7.f37796b     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            if (r5 != 0) goto L26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r4.append(r6)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            com.waze.shared_infra.i.h.k(r0, r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            goto L56
        L26:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            byte[] r7 = com.google.d.h.h.b(r1)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            r1.close()
            return r7
        L35:
            r7 = move-exception
            goto L57
        L37:
            r4 = move-exception
            goto L3e
        L39:
            r7 = move-exception
            goto L58
        L3b:
            r1 = move-exception
            r4 = r1
            r1 = r3
        L3e:
            java.lang.String r7 = r7.f37796b     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L35
            r5.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L35
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L35
            com.waze.shared_infra.i.h.l(r0, r7, r4)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L56
            r1.close()
        L56:
            return r3
        L57:
            r3 = r1
        L58:
            if (r3 == 0) goto L5d
            r3.close()
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.shared_infra.b.b.c():byte[]");
    }
}
