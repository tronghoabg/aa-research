package defpackage;

import android.app.PendingIntent;
import com.carstream.tech.mirror.MirrorServer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class o1 implements Runnable {
    public final /* synthetic */ int a;

    @Override // java.lang.Runnable
    public final void run() {
        PendingIntent pendingIntent;
        switch (this.a) {
            case 0:
                o5 o5Var = u1.e;
                if (u1.c == 3 && o5Var != null && (pendingIntent = o5Var.h) != null) {
                    u1.d(pendingIntent, "cup may");
                    u1.c(1);
                    break;
                }
                break;
            case 1:
                u1.f++;
                if (u1.c == 2 && u1.f >= 45) {
                    u1.c(4);
                    break;
                } else if (u1.c == 4 && u1.f >= 4) {
                    u1.c(1);
                    break;
                } else {
                    u1.b();
                    if (u1.c != 1) {
                        u1.a.postDelayed(this, 1000L);
                        break;
                    }
                }
                break;
            case 2:
                new Thread(new a3(b3.a, b3.b, b3.c), "co-man-xe").start();
                b3.a();
                break;
            default:
                try {
                    Pattern patternCompile = Pattern.compile(Pattern.quote(y2.MK_IMEDISP.a()) + "(\\d+)");
                    int i = 0;
                    int i2 = -999;
                    int i3 = 0;
                    while (i < 40 && i3 < 6) {
                        Thread.sleep(i == 0 ? 900L : 2000L);
                        String strW = MirrorServer.w(y2.DUMPSYS_IME.a());
                        if (strW != null) {
                            Matcher matcher = patternCompile.matcher(strW);
                            int i4 = matcher.find() ? Integer.parseInt(matcher.group(1)) : -1;
                            if (i4 != i2) {
                                i3++;
                                MirrorServer.m("ban phim: IME o man " + i4 + " (man ao cua ta=" + MirrorServer.b + (i4 == MirrorServer.b ? " -> VE XE OK" : "") + ")");
                                if (i4 == MirrorServer.b) {
                                    break;
                                } else {
                                    i2 = i4;
                                }
                            }
                        }
                        i++;
                    }
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
