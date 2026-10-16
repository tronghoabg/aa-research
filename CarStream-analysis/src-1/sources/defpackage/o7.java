package defpackage;

import android.content.ComponentName;
import com.carstream.tech.mirror.MirrorServer;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ o7(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, IOException {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                int i = this.b;
                int i2 = MirrorServer.a;
                MirrorServer.v("wm" + y2.WM_WINDOWING_MODE.a() + i + " 1");
                MirrorServer.Q(i);
                MirrorServer.v(y2.AM_START_DISPLAY.a() + i + " --activity-multiple-task" + MirrorServer.j() + " -n " + MirrorServer.h);
                break;
            case 1:
                MirrorServer.Q(this.b);
                break;
            case 2:
                int i3 = this.b;
                int i4 = MirrorServer.a;
                try {
                    Thread.sleep(2500L);
                    String strP0 = MirrorServer.p0(i3);
                    if (strP0 != null && strP0.contains("com.carstream.tech")) {
                        MirrorServer.m("soi " + i3 + ": ok");
                        break;
                    } else if (strP0 != null && MirrorServer.F0 != null && strP0.contains(MirrorServer.F0)) {
                        MirrorServer.m("soi " + i3 + ": ok (app khoi phuc)");
                        break;
                    } else {
                        if (strP0 == null) {
                            MirrorServer.m("soi " + i3 + ": ? r");
                        } else {
                            MirrorServer.m("soi " + i3 + ": x " + strP0.replaceAll("[{}].*", "").trim() + " r");
                        }
                        MirrorServer.v(y2.AM_START_DISPLAY.a() + i3 + " --activity-multiple-task" + MirrorServer.j() + " -n com.carstream.tech/com.carstream.tech.launcher.CarLauncherActivity");
                        Thread.sleep(1200L);
                        String strP02 = MirrorServer.p0(i3);
                        MirrorServer.m("soi " + i3 + ": r-> " + ((strP02 == null || !strP02.contains("com.carstream.tech")) ? strP02 == null ? "?" : strP02.replaceAll("[{}].*", "").trim() : "ok"));
                        break;
                    }
                } catch (Throwable th) {
                    MirrorServer.m("soi " + i3 + ": loi " + th.getClass().getSimpleName());
                    return;
                }
                break;
            case 3:
                int i5 = this.b;
                int i6 = MirrorServer.a;
                MirrorServer.v("wm" + y2.WM_WINDOWING_MODE.a() + i5 + " 1");
                MirrorServer.Q(i5);
                break;
            case 4:
                MirrorServer.Q(this.b);
                break;
            case 5:
                int i7 = this.b;
                ConcurrentHashMap concurrentHashMap = MirrorServer.g0;
                try {
                    ComponentName componentNameQ0 = MirrorServer.q0(i7);
                    if (componentNameQ0 != null) {
                        str = componentNameQ0.getPackageName() + "/" + componentNameQ0.getClassName();
                    } else {
                        str = (String) concurrentHashMap.get(Integer.valueOf(i7));
                    }
                    concurrentHashMap.remove(Integer.valueOf(i7));
                    if (str != null) {
                        if (!MirrorServer.Y(str).equals("com.carstream.tech")) {
                            MirrorServer.J("bo o " + i7 + ": mo launcher truoc, roi dong " + str);
                            MirrorServer.v(y2.AM_START_DISPLAY.a() + i7 + " --activity-multiple-task" + MirrorServer.j() + " -n com.carstream.tech/com.carstream.tech.launcher.CarLauncherActivity");
                            try {
                                Thread.sleep(250L);
                            } catch (InterruptedException unused) {
                            }
                            MirrorServer.v("am force-stop " + MirrorServer.Y(str));
                            MirrorServer.B0.put(Integer.valueOf(i7), Long.valueOf(System.currentTimeMillis()));
                            break;
                        } else {
                            MirrorServer.J("bo o " + i7 + ": la launcher cua ta, khong dong");
                            break;
                        }
                    } else {
                        MirrorServer.J("bo o " + i7 + ": khong co app nao");
                        break;
                    }
                } catch (Throwable th2) {
                    ad.f("dong app tren man loi: ", th2);
                    return;
                }
            case 6:
                int i8 = this.b;
                int i9 = MirrorServer.a;
                MirrorServer.v("wm" + y2.WM_WINDOWING_MODE.a() + i8 + " 1");
                MirrorServer.Q(i8);
                MirrorServer.v(y2.AM_START_DISPLAY.a() + i8 + " --activity-multiple-task" + MirrorServer.j() + " -n com.carstream.tech/com.carstream.tech.launcher.CarLauncherActivity");
                break;
            case 7:
                int i10 = this.b;
                int i11 = MirrorServer.a;
                MirrorServer.v("wm" + y2.WM_WINDOWING_MODE.a() + i10 + " 1");
                MirrorServer.Q(i10);
                MirrorServer.v(y2.AM_START_DISPLAY.a() + i10 + " --activity-multiple-task" + MirrorServer.j() + " -n com.carstream.tech/com.carstream.tech.launcher.CarLauncherActivity");
                break;
            case 8:
                int i12 = this.b;
                int i13 = MirrorServer.a;
                MirrorServer.v(y2.AM_START_DISPLAY.a() + i12 + " --activity-multiple-task -n com.carstream.tech/com.carstream.tech.launcher.QsActivity");
                break;
            default:
                int i14 = this.b;
                int i15 = MirrorServer.a;
                try {
                    MirrorServer.n = System.currentTimeMillis() + 2500;
                    ComponentName componentNameQ02 = MirrorServer.q0(i14);
                    if (componentNameQ02 != null) {
                        str2 = componentNameQ02.getPackageName() + "/" + componentNameQ02.getClassName();
                    } else {
                        str2 = (String) MirrorServer.g0.get(Integer.valueOf(i14));
                    }
                    MirrorServer.g0.remove(Integer.valueOf(i14));
                    boolean z = i14 == MirrorServer.I || i14 == MirrorServer.J || (i14 == MirrorServer.b && MirrorServer.W >= 0) || (i14 == MirrorServer.i && MirrorServer.X >= 0);
                    MirrorServer.J("dong o " + i14 + ": app = " + (str2 == null ? "khong co" : str2) + (z ? " [hang]" : ""));
                    if (str2 != null && !MirrorServer.Y(str2).equals("com.carstream.tech")) {
                        if (!z && (MirrorServer.j <= 0 || MirrorServer.i <= 0)) {
                            MirrorServer.v(y2.AM_START_DISPLAY.a() + i14 + MirrorServer.j() + " -n com.carstream.tech/com.carstream.tech.launcher.CarLauncherActivity");
                            try {
                                Thread.sleep(250L);
                            } catch (InterruptedException unused2) {
                            }
                            MirrorServer.B0.put(Integer.valueOf(i14), Long.valueOf(System.currentTimeMillis()));
                        }
                        MirrorServer.v("am force-stop " + MirrorServer.Y(str2));
                    }
                    if (i14 != MirrorServer.I) {
                        if (i14 != MirrorServer.J) {
                            if (i14 == MirrorServer.b && MirrorServer.W >= 0) {
                                MirrorServer.a0 = 2;
                                break;
                            } else if (i14 == MirrorServer.i && MirrorServer.X >= 0) {
                                MirrorServer.b0 = 2;
                                break;
                            } else if (MirrorServer.j > 0 && MirrorServer.i > 0) {
                                if (i14 != MirrorServer.i) {
                                    MirrorServer.U = 2;
                                    break;
                                } else {
                                    MirrorServer.U = 1;
                                    break;
                                }
                            }
                        } else {
                            MirrorServer.b0 = 1;
                            break;
                        }
                    } else {
                        MirrorServer.a0 = 1;
                        break;
                    }
                } catch (Throwable th3) {
                    ad.f("dong o loi: ", th3);
                }
                break;
        }
    }
}
