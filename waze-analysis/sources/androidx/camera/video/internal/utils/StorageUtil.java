package androidx.camera.video.internal.utils;

import android.os.StatFs;
import androidx.camera.video.AudioStats;
import h.g.b.x;
import h.n.o;
import java.io.File;
import java.text.DecimalFormat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StorageUtil {
    public static final StorageUtil INSTANCE = new StorageUtil();
    public static final String NO_SPACE_LEFT_MESSAGE = "No space left on device";
    private static final String TAG = "StorageUtil";

    private StorageUtil() {
    }

    public static final String formatSize(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("Bytes cannot be negative");
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d2 = j2;
        double d3 = d2;
        int i2 = 0;
        while (d3 >= 1024.0d && i2 < 4) {
            d3 /= 1024.0d;
            i2++;
        }
        if (i2 == 0) {
            return decimalFormat.format(d3) + " " + strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        while (i2 >= 0) {
            double dPow = Math.pow(1024.0d, i2);
            double dFloor = Math.floor(d2 / dPow);
            if (dFloor > AudioStats.AUDIO_AMPLITUDE_NONE) {
                sb.append(decimalFormat.format(dFloor));
                sb.append(" ");
                sb.append(strArr[i2]);
                sb.append(" ");
                d2 -= dFloor * dPow;
            }
            i2--;
        }
        return o.v(sb).toString();
    }

    public static final long getAvailableBytes(File file) {
        x.f(file, "file");
        String path = file.getPath();
        x.e(path, "getPath(...)");
        return getAvailableBytes(path);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r0.equals("external") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r0.equals("external_primary") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r3 = android.os.Environment.getExternalStorageDirectory();
        h.g.b.x.e(r3, "getExternalStorageDirectory(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        return getAvailableBytes(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long getAvailableBytesForMediaStoreUri(android.net.Uri r3) {
        /*
            java.lang.String r0 = "uri"
            h.g.b.x.f(r3, r0)
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = h.g.b.x.n(r0, r1)
            if (r0 == 0) goto L7f
            java.util.List r0 = r3.getPathSegments()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L67
            int r1 = r0.hashCode()
            r2 = -1921573490(0xffffffff8d771d8e, float:-7.6148327E-31)
            if (r1 == r2) goto L51
            r2 = -1820761141(0xffffffff937963cb, float:-3.147742E-27)
            if (r1 == r2) goto L48
            r2 = 570410685(0x21ffc6bd, float:1.7332078E-18)
            if (r1 == r2) goto L32
            goto L67
        L32:
            java.lang.String r1 = "internal"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
            java.io.File r3 = android.os.Environment.getDataDirectory()
            java.lang.String r0 = "getDataDirectory(...)"
            h.g.b.x.e(r3, r0)
            long r0 = getAvailableBytes(r3)
            return r0
        L48:
            java.lang.String r1 = "external"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
            goto L59
        L51:
            java.lang.String r1 = "external_primary"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
        L59:
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = "getExternalStorageDirectory(...)"
            h.g.b.x.e(r3, r0)
            long r0 = getAvailableBytes(r3)
            return r0
        L67:
            java.util.Objects.toString(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "StorageUtil"
            java.lang.String r1 = "Unknown MediaStore URI: "
            java.lang.String r3 = r1.concat(r3)
            androidx.camera.core.Logger.w(r0, r3)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L7f:
            java.util.Objects.toString(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not a content uri: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.utils.StorageUtil.getAvailableBytesForMediaStoreUri(android.net.Uri):long");
    }

    public static final boolean isStorageFullException(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message == null || !o.F(message, NO_SPACE_LEFT_MESSAGE, false)) {
            return isStorageFullException(th.getCause());
        }
        return true;
    }

    public static final long getAvailableBytes(String str) {
        x.f(str, "path");
        return new StatFs(str).getAvailableBytes();
    }
}
