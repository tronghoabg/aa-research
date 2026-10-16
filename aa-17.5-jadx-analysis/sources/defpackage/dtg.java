package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class dtg {
    public dtg() {
    }

    static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addMessage(message);
    }

    static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        return messagingStyle.setConversationTitle(charSequence);
    }

    public static File c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean d(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    roc.j(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            roc.j(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            roc.j(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean e(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zD = d(file, inputStreamOpenRawResource);
                roc.j(inputStreamOpenRawResource);
                return zD;
            } catch (Throwable th) {
                th = th;
                roc.j(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static Object f(eja ejaVar, eke ekeVar, int i) {
        return (dtd) ejaVar.c.get(new eiz(ekeVar, i));
    }

    public static ejc g(Object obj) {
        return ((ejg) obj).extensions;
    }

    public static ejc h(Object obj) {
        throw null;
    }

    public static void i(Object obj) {
        g(obj).d();
    }

    public static boolean j(String str) {
        return afyh.R("Content-Length", str) || afyh.R("Content-Encoding", str) || afyh.R("Content-Type", str);
    }

    public static boolean k(String str) {
        return (afyh.R("Connection", str) || afyh.R("Keep-Alive", str) || afyh.R("Proxy-Authenticate", str) || afyh.R("Proxy-Authorization", str) || afyh.R("TE", str) || afyh.R("Trailers", str) || afyh.R("Transfer-Encoding", str) || afyh.R("Upgrade", str)) ? false : true;
    }

    public static double l(int i, int i2, int i3, int i4, int i5) {
        double d = i2;
        double d2 = i3 / i;
        double d3 = i4 / d;
        return i5 + (-1) != 0 ? Math.min(d2, d3) : Math.max(d2, d3);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ieb m(defpackage.ajid r21, defpackage.fsk r22, java.util.Date r23, java.lang.String r24, java.util.Date r25, java.lang.String r26, java.util.Date r27, long r28, long r30, java.lang.String r32, int r33) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtg.m(ajid, fsk, java.util.Date, java.lang.String, java.util.Date, java.lang.String, java.util.Date, long, long, java.lang.String, int):ieb");
    }

    public dtg(byte[] bArr) {
    }
}
