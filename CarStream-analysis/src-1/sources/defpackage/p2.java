package defpackage;

import com.carstream.tech.launcher.CarLauncherActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CarLauncherActivity b;

    public /* synthetic */ p2(CarLauncherActivity carLauncherActivity, int i) {
        this.a = i;
        this.b = carLauncherActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.buildGanDay();
                break;
            case 1:
                this.b.lambda$new$1();
                break;
            default:
                this.b.lambda$new$4();
                break;
        }
    }
}
