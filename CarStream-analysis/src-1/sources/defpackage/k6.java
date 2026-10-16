package defpackage;

import android.os.SystemClock;
import com.carstream.tech.core.call.CallWatch;
import com.carstream.tech.phone.MainActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class k6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ k6(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.moHuongDan();
                break;
            case 1:
                MainActivity mainActivity = this.b;
                mainActivity.getWindow().setStatusBarColor(d8.e());
                mainActivity.getWindow().getDecorView().setSystemUiVisibility(k1.h ? 0 : 8192);
                break;
            case 2:
                if (this.b.currentTab == 0) {
                    this.b.controllerScreen.e();
                } else if (this.b.currentTab == 2 && this.b.settingsScreen != null) {
                    qa qaVar = this.b.settingsScreen;
                    if (qaVar.d != null) {
                        if (xc.e(qaVar.a, "launcherEnabled", false)) {
                            MainActivity mainActivity2 = qaVar.a;
                            if (b0.d(mainActivity2) && !b0.g && !k1.f()) {
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                if (jUptimeMillis - b0.f >= 5000) {
                                    b0.f = jUptimeMillis;
                                    b0.g = true;
                                    new Thread(new v(mainActivity2, 0), "adb-kiem-ghep").start();
                                }
                            }
                        }
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        if (jUptimeMillis2 - qaVar.j >= 1000) {
                            qaVar.j = jUptimeMillis2;
                            if (!qaVar.i().equals(qaVar.i)) {
                                qaVar.n();
                            }
                        }
                    }
                }
                this.b.tick.postDelayed(this, 500L);
                break;
            case 3:
                MainActivity mainActivity3 = this.b;
                if (!ec.j(mainActivity3)) {
                    mainActivity3.goToActivate();
                    break;
                } else {
                    a6.c(mainActivity3);
                    mainActivity3.tick.postDelayed(this, 60000L);
                    break;
                }
            default:
                MainActivity mainActivity4 = this.b;
                xc.m(mainActivity4, "callBar", true);
                CallWatch.moTrangCapQuyen(mainActivity4);
                break;
        }
    }
}
