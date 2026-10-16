package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.d.m.a.bm;
import com.google.v.de;
import com.google.v.eu;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ay {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.libraries.phenotype.client.h f6100a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.d.b.aj f6101b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6102c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6103d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6104e;

    public ay(final com.google.android.libraries.phenotype.client.h hVar, final String str, final String str2, final boolean z) {
        this.f6100a = hVar;
        this.f6102c = str;
        this.f6103d = str2;
        this.f6104e = z;
        this.f6101b = com.google.d.b.an.a(new com.google.d.b.aj() { // from class: com.google.android.libraries.phenotype.client.stable.at
            @Override // com.google.d.b.aj
            /* renamed from: get */
            public final Object get2() {
                boolean z2 = z;
                com.google.android.libraries.phenotype.client.h hVar2 = hVar;
                Context contextA = z2 ? com.google.android.libraries.a.c.a(hVar2.a()) : hVar2.a();
                String str3 = str2;
                return String.valueOf(com.google.android.libraries.phenotype.client.c.a(contextA)) + File.separator + "phenotype" + File.separator + "shared" + File.separator + (str3.isEmpty() ? "" : String.valueOf(str3).concat(String.valueOf(File.separator))) + str + ".pb";
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void f(com.google.android.libraries.phenotype.client.stable.ay r4, com.google.android.libraries.phenotype.client.stable.ba r5) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File     // Catch: java.lang.RuntimeException -> L68 java.io.IOException -> L6a
            com.google.d.b.aj r1 = r4.f6101b     // Catch: java.lang.RuntimeException -> L68 java.io.IOException -> L6a
            java.lang.Object r1 = r1.get2()     // Catch: java.lang.RuntimeException -> L68 java.io.IOException -> L6a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.RuntimeException -> L68 java.io.IOException -> L6a
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L68 java.io.IOException -> L6a
            com.google.d.f.c.a.g(r0)     // Catch: java.lang.RuntimeException -> L68 java.io.IOException -> L6a
            java.lang.String r1 = "snapshot"
            java.lang.String r2 = ".pb"
            java.io.File r3 = r0.getParentFile()     // Catch: java.lang.RuntimeException -> L68 java.io.IOException -> L6a
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)     // Catch: java.lang.RuntimeException -> L68 java.io.IOException -> L6a
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            r2.<init>(r1)     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            r5.writeTo(r2)     // Catch: java.lang.Throwable -> L5a
            r2.flush()     // Catch: java.lang.Throwable -> L5a
            java.io.FileDescriptor r5 = r2.getFD()     // Catch: java.lang.Throwable -> L5a
            r5.sync()     // Catch: java.lang.Throwable -> L5a
            r2.close()     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            boolean r5 = r1.renameTo(r0)     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            if (r5 == 0) goto L38
            return
        L38:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            java.lang.String r0 = r0.toString()     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            r3.<init>()     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            r3.append(r2)     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            java.lang.String r2 = " could not be renamed to "
            r3.append(r2)     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            r3.append(r0)     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            java.lang.String r0 = r3.toString()     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            r5.<init>(r0)     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
            throw r5     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
        L5a:
            r5 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
        L63:
            throw r5     // Catch: java.lang.RuntimeException -> L64 java.io.IOException -> L66
        L64:
            r5 = move-exception
            goto L6c
        L66:
            r5 = move-exception
            goto L6c
        L68:
            r5 = move-exception
            goto L6b
        L6a:
            r5 = move-exception
        L6b:
            r1 = 0
        L6c:
            if (r1 == 0) goto L76
            r1.delete()     // Catch: java.lang.SecurityException -> L72
            goto L76
        L72:
            r0 = move-exception
            r5.addSuppressed(r0)
        L76:
            com.google.android.libraries.phenotype.client.h r0 = r4.f6100a
            java.lang.String r4 = r4.f6102c
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            com.google.d.m.a.bo r0 = r0.j()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.String r4 = "Failed to update snapshot for %s flags may be stale."
            com.google.android.libraries.b.c.c(r1, r0, r5, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.stable.ay.f(com.google.android.libraries.phenotype.client.stable.ay, com.google.android.libraries.phenotype.client.stable.ba):void");
    }

    final ax a() throws IOException {
        String strSubstring;
        av avVar;
        av avVar2;
        String strE;
        boolean z = this.f6104e;
        if (!z && com.google.android.libraries.a.c.e(this.f6100a.a())) {
            return ax.b(ba.getDefaultInstance(), new aw(com.google.android.libraries.phenotype.client.a.d.DEFAULT_VALUES, com.google.android.libraries.phenotype.client.a.c.DIRECT_BOOT_BUT_PACKAGE_NOT_DIRECT_BOOT_AWARE));
        }
        if (com.google.android.libraries.phenotype.client.c.b()) {
            return ax.b(ba.getDefaultInstance(), new aw(com.google.android.libraries.phenotype.client.a.d.DEFAULT_VALUES, com.google.android.libraries.phenotype.client.a.c.ISOLATED_PROCESS));
        }
        com.google.android.libraries.phenotype.client.h hVar = this.f6100a;
        as asVarA = hVar.f().a(z);
        String str = this.f6102c;
        com.google.g.a.a.b bVar = com.google.g.a.a.b.FILE;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                throw new IllegalArgumentException("Invalid package name: ".concat(String.valueOf(str)));
            }
            strSubstring = str;
        }
        com.google.android.libraries.phenotype.client.a.c cVarA = asVarA.a(bVar, strSubstring);
        if (cVarA != null) {
            avVar2 = new av(null, new aw(cVarA, true));
        } else {
            try {
                strE = asVarA.e();
            } catch (Exception e2) {
                com.google.android.libraries.b.c.c(Level.WARNING, this.f6100a.j(), e2, "Failed to read shared file for %s", this.f6102c);
                avVar = new av(com.google.android.libraries.phenotype.client.b.j.c(), new aw(com.google.android.libraries.phenotype.client.a.d.DEFAULT_VALUES, com.google.android.libraries.phenotype.client.a.c.SHARED_STORAGE_UNKNOWN_EXCEPTION));
            }
            if (strE.isEmpty()) {
                com.google.d.b.aa aaVarH = hVar.h();
                if (!aaVarH.f()) {
                    com.google.android.libraries.b.c.b(Level.WARNING, hVar.j(), "Unable to get GMS application info, using defaults.", new Object[0]);
                    avVar = new av(com.google.android.libraries.phenotype.client.b.j.c(), new aw(com.google.android.libraries.phenotype.client.a.d.DEFAULT_VALUES, com.google.android.libraries.phenotype.client.a.c.SHARED_STORAGE_GMS_CORE_DATA_PATH_NOT_FOUND));
                    avVar2 = avVar;
                } else if (z) {
                    int i2 = com.google.android.libraries.a.c.f5792a;
                    strE = ((ApplicationInfo) aaVarH.b()).deviceProtectedDataDir;
                } else {
                    strE = ((ApplicationInfo) aaVarH.b()).dataDir;
                }
            }
            j jVar = new j(asVarA.c(), str, this.f6103d);
            File file = new File(strE + File.separator + asVarA.d() + File.separator + jVar.b().toString());
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        av avVar3 = new av((!asVarA.b().getEnableStreamingFlagsBlobParsing() || file.length() <= 12288) ? com.google.android.libraries.phenotype.client.b.j.d(com.google.v.z.X(fileInputStream), false) : com.google.android.libraries.phenotype.client.b.j.d(com.google.v.z.X(fileInputStream), true), new aw(com.google.android.libraries.phenotype.client.a.d.SHARED_STORAGE, com.google.android.libraries.phenotype.client.a.c.ERROR_UNSPECIFIED));
                        fileInputStream.close();
                        avVar2 = avVar3;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (eu e3) {
                    com.google.android.libraries.b.c.c(Level.SEVERE, this.f6100a.j(), e3, "Failed to parse snapshot from shared storage for %s", this.f6102c);
                    avVar2 = new av(null, new aw(com.google.android.libraries.phenotype.client.a.c.SHARED_STORAGE_INVALID_PROTO));
                }
            } catch (FileNotFoundException unused) {
                com.google.android.libraries.b.c.b(Level.INFO, this.f6100a.j(), "Shared storage file not found for %s", this.f6102c);
                avVar2 = new av(null, new aw(com.google.android.libraries.phenotype.client.a.c.SHARED_STORAGE_FILE_NOT_FOUND));
            }
        }
        if (avVar2.a() != null) {
            com.google.android.libraries.phenotype.client.b.j jVarA = avVar2.a();
            com.google.d.b.an.B(jVarA);
            return ax.c(jVarA, avVar2.b());
        }
        aw awVarB = avVar2.b();
        try {
            FileInputStream fileInputStream2 = new FileInputStream((String) this.f6101b.get2());
            try {
                ax axVarB = ax.b(ba.parseFrom(fileInputStream2, de.a()), new aw(com.google.android.libraries.phenotype.client.a.d.LOCAL_STORAGE, awVarB.a(), awVarB.d()));
                fileInputStream2.close();
                return axVarB;
            } catch (Throwable th3) {
                try {
                    fileInputStream2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | RuntimeException unused2) {
            com.google.android.libraries.b.c.b(Level.INFO, this.f6100a.j(), "Unable to retrieve flag snapshot for %s, using defaults.", this.f6102c);
            return awVarB.d() ? ax.b(ba.getDefaultInstance(), new aw(com.google.android.libraries.phenotype.client.a.d.DEFAULT_VALUES, com.google.android.libraries.phenotype.client.a.c.LOCAL_STORAGE_UNKNOWN_EXCEPTION, true)) : ax.c(com.google.android.libraries.phenotype.client.b.j.c(), new aw(com.google.android.libraries.phenotype.client.a.d.DEFAULT_VALUES, com.google.android.libraries.phenotype.client.a.c.SHARED_STORAGE_LOCAL_STORAGE_UNKNOWN_EXCEPTION, false));
        }
    }

    final bm b(String str) {
        com.google.android.libraries.phenotype.client.h hVar = this.f6100a;
        return com.google.d.m.a.bd.m(hVar.m().f(this.f6102c, str), new l(2), hVar.j());
    }

    public final bm c(ba baVar) {
        return com.google.d.m.a.bd.k(new au(this, baVar, 0), this.f6100a.j());
    }

    final boolean d() {
        return this.f6100a.f().c(this.f6104e, com.google.g.a.a.b.FILE);
    }

    final boolean e() {
        return this.f6100a.f().d(this.f6104e, com.google.g.a.a.b.FILE);
    }
}
