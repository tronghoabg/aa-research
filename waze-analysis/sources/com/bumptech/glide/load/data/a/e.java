package com.bumptech.glide.load.data.a;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.a.a.j;
import com.bumptech.glide.load.n;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f3462a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f3463b;

    /* renamed from: c, reason: collision with root package name */
    private final List f3464c;

    /* renamed from: d, reason: collision with root package name */
    private final j f3465d;

    e(List list, d dVar, j jVar, ContentResolver contentResolver) {
        this.f3462a = dVar;
        this.f3465d = jVar;
        this.f3463b = contentResolver;
        this.f3464c = list;
    }

    final int a(Uri uri) throws IOException {
        int iC;
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f3463b.openInputStream(uri);
                iC = n.c(this.f3464c, inputStreamOpenInputStream, this.f3465d);
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + String.valueOf(uri), e2);
            }
            iC = -1;
        }
        if (inputStreamOpenInputStream != null) {
            try {
                inputStreamOpenInputStream.close();
            } catch (IOException unused2) {
            }
        }
        return iC;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:156), block:B:38:0x009b */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[PHI: r3
  0x0020: PHI (r3v6 android.database.Cursor) = (r3v3 android.database.Cursor), (r3v8 android.database.Cursor) binds: [B:22:0x0045, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream b(android.net.Uri r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            java.lang.String r1 = "Failed to query for thumbnail for Uri: "
            r2 = 0
            com.bumptech.glide.load.data.a.d r3 = r7.f3462a     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L28
            android.database.Cursor r3 = r3.a(r8)     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L28
            if (r3 == 0) goto L1e
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.SecurityException -> L1c java.lang.Throwable -> L9a
            if (r4 == 0) goto L1e
            r4 = 0
            java.lang.String r0 = r3.getString(r4)     // Catch: java.lang.SecurityException -> L1c java.lang.Throwable -> L9a
            r3.close()
            goto L48
        L1c:
            r4 = move-exception
            goto L2b
        L1e:
            if (r3 == 0) goto L23
        L20:
            r3.close()
        L23:
            r0 = r2
            goto L48
        L25:
            r7 = move-exception
            goto L9c
        L28:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L2b:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L45
            java.lang.String r5 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L9a
            r6.append(r5)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L9a
            android.util.Log.d(r0, r1, r4)     // Catch: java.lang.Throwable -> L9a
        L45:
            if (r3 == 0) goto L23
            goto L20
        L48:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L99
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L99
            long r3 = r1.length()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L99
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            android.content.ContentResolver r7 = r7.f3463b     // Catch: java.lang.NullPointerException -> L6e
            java.io.InputStream r7 = r7.openInputStream(r0)     // Catch: java.lang.NullPointerException -> L6e
            return r7
        L6e:
            r7 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "NPE opening uri: "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r8 = " -> "
            r2.append(r8)
            r2.append(r0)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8)
            java.lang.Throwable r7 = r1.initCause(r7)
            java.io.FileNotFoundException r7 = (java.io.FileNotFoundException) r7
            throw r7
        L99:
            return r2
        L9a:
            r7 = move-exception
            r2 = r3
        L9c:
            if (r2 == 0) goto La1
            r2.close()
        La1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.a.e.b(android.net.Uri):java.io.InputStream");
    }
}
