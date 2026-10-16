package defpackage;

import com.carstream.tech.phone.ActivateActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivateActivity b;

    public /* synthetic */ j(ActivateActivity activateActivity, int i) {
        this.a = i;
        this.b = activateActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.showWelcome();
                break;
            case 1:
                this.b.openApp();
                break;
            case 2:
                this.b.startBreathing();
                break;
            case 3:
                this.b.glyph.animate().translationY(0.0f).setDuration(2750L).withEndAction(new f(this, 3)).start();
                break;
            default:
                ActivateActivity activateActivity = this.b;
                if (activateActivity.driveClock != null) {
                    activateActivity.driveClock.cancel();
                    activateActivity.driveClock = null;
                }
                activateActivity.glyph.l = 0.0f;
                activateActivity.glyph.p = 0.0f;
                activateActivity.glyph.m = 0.0f;
                activateActivity.glyph.n = 0.0f;
                activateActivity.glyph.invalidate();
                break;
        }
    }
}
