package defpackage;

import com.carstream.tech.mirror.MirrorServer;
import java.lang.Thread;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class m7 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String str;
        int i = MirrorServer.a;
        Throwable cause = th;
        while (cause.getCause() != null && cause.getCause() != cause) {
            try {
                cause = cause.getCause();
            } catch (Throwable unused) {
            }
        }
        String name = thread.getName();
        String name2 = cause.getClass().getName();
        if (cause.getMessage() != null) {
            str = " :: " + cause.getMessage();
        } else {
            str = "";
        }
        MirrorServer.m("CHET (luong '" + name + "'): " + name2 + str);
        ad.f("!! ", th);
        th.printStackTrace(System.out);
        Runtime.getRuntime().halt(1);
    }
}
