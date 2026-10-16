package androidx.camera.video.internal.utils;

import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class OutputUtil {
    private static final String TAG = "OutputUtil";

    private OutputUtil() {
    }

    public static boolean createParentFolder(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        return parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getAbsolutePathFromUri(android.content.ContentResolver r8, android.net.Uri r9, java.lang.String r10) throws java.lang.Throwable {
        /*
            r1 = 0
            java.lang.String[] r4 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            r6 = 0
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L23 java.lang.Throwable -> L25
            if (r8 != 0) goto L11
            goto L4f
        L11:
            int r9 = r8.getColumnIndexOrThrow(r10)     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L50
            r8.moveToFirst()     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L50
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L50
            r8.close()
            return r9
        L20:
            r0 = move-exception
            r9 = r0
            goto L2e
        L23:
            r0 = move-exception
            goto L2b
        L25:
            r0 = move-exception
            r8 = r0
            r9 = r8
            goto L53
        L29:
            r0 = move-exception
            r3 = r9
        L2b:
            r8 = r0
            r9 = r8
            r8 = r1
        L2e:
            java.lang.String r10 = "OutputUtil"
            java.lang.String r0 = "Failed in getting absolute path for Uri %s with Exception %s"
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L50
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L50
            r4 = 0
            r3[r4] = r2     // Catch: java.lang.Throwable -> L50
            r2 = 1
            r3[r2] = r9     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = java.lang.String.format(r0, r3)     // Catch: java.lang.Throwable -> L50
            androidx.camera.core.Logger.e(r10, r9)     // Catch: java.lang.Throwable -> L50
            if (r8 == 0) goto L4f
            r8.close()
        L4f:
            return r1
        L50:
            r0 = move-exception
            r9 = r0
            r1 = r8
        L53:
            if (r1 == 0) goto L58
            r1.close()
        L58:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.utils.OutputUtil.getAbsolutePathFromUri(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
    }
}
