package com.google.firebase.crashlytics.a.d;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f9264a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private final File f9265b;

    /* renamed from: c, reason: collision with root package name */
    private m f9266c;

    p(File file) {
        this.f9265b = file;
    }

    private final void f() {
        if (this.f9266c == null) {
            try {
                this.f9266c = new m(this.f9265b);
            } catch (IOException e2) {
                com.google.firebase.crashlytics.a.i.a().e("Could not open log file: ".concat(this.f9265b.toString()), e2);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.a.d.d
    public final String a() {
        byte[] bArrE = e();
        if (bArrE != null) {
            return new String(bArrE, f9264a);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.a.d.d
    public final void b() throws IOException {
        com.google.firebase.crashlytics.a.c.g.j(this.f9266c, "There was a problem closing the Crashlytics log file.");
        this.f9266c = null;
    }

    @Override // com.google.firebase.crashlytics.a.d.d
    public final void c() throws IOException {
        b();
        this.f9265b.delete();
    }

    @Override // com.google.firebase.crashlytics.a.d.d
    public final void d(long j2, String str) {
        f();
        if (this.f9266c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            byte[] bytes = String.format(Locale.US, "%d %s%n", Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f9264a);
            this.f9266c.j(bytes, bytes.length);
            while (!this.f9266c.h() && this.f9266c.b() > 65536) {
                this.f9266c.g();
            }
        } catch (IOException e2) {
            com.google.firebase.crashlytics.a.i.a().e("There was a problem writing to the Crashlytics log.", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // com.google.firebase.crashlytics.a.d.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] e() {
        /*
            r6 = this;
            java.io.File r0 = r6.f9265b
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r6 = r1
            goto L3a
        Lc:
            r6.f()
            com.google.firebase.crashlytics.a.d.m r0 = r6.f9266c
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.b()
            byte[] r0 = new byte[r0]
            com.google.firebase.crashlytics.a.d.m r4 = r6.f9266c     // Catch: java.io.IOException -> L29
            com.google.firebase.crashlytics.a.d.n r5 = new com.google.firebase.crashlytics.a.d.n     // Catch: java.io.IOException -> L29
            r5.<init>(r6, r0, r3)     // Catch: java.io.IOException -> L29
            r4.f(r5)     // Catch: java.io.IOException -> L29
            goto L33
        L29:
            r6 = move-exception
            com.google.firebase.crashlytics.a.i r4 = com.google.firebase.crashlytics.a.i.a()
            java.lang.String r5 = "A problem occurred while reading the Crashlytics log file."
            r4.e(r5, r6)
        L33:
            com.google.firebase.crashlytics.a.d.o r6 = new com.google.firebase.crashlytics.a.d.o
            r3 = r3[r2]
            r6.<init>(r0, r3)
        L3a:
            if (r6 != 0) goto L3d
            return r1
        L3d:
            int r0 = r6.f9262a
            java.lang.Object r6 = r6.f9263b
            byte[] r1 = new byte[r0]
            java.lang.System.arraycopy(r6, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.a.d.p.e():byte[]");
    }
}
