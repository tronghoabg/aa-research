package defpackage;

import android.os.SystemClock;
import android.widget.HorizontalScrollView;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.e;
import com.carstream.tech.car.t;
import com.carstream.tech.car.ui.CarEditText;
import com.carstream.tech.core.speed.SpeedBubble;
import com.carstream.tech.media.PlaybackService;
import com.carstream.tech.phone.ModeActivity;
import com.carstream.tech.surf.c;
import com.google.android.gms.car.input.InputManager;
import java.util.Iterator;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ModeActivity modeActivity = (ModeActivity) this.b;
                if (!modeActivity.daChon) {
                    long jUptimeMillis = modeActivity.hetHanAt - SystemClock.uptimeMillis();
                    if (jUptimeMillis > 0) {
                        modeActivity.dongDem.setText("Tự vào chế độ Android Auto sau " + ((jUptimeMillis + 999) / 1000) + " giây");
                        modeActivity.dongHo.postDelayed(this, 250L);
                        break;
                    } else {
                        modeActivity.vaoDienThoai();
                        break;
                    }
                }
                break;
            case 1:
                t tVar = (t) this.b;
                if (tVar.a.pageTrusted()) {
                    tVar.a.dayDanhSachMedia(null);
                    break;
                }
                break;
            case 2:
                PlaybackService playbackService = (PlaybackService) this.b;
                playbackService.watchdogTick();
                playbackService.watch.postDelayed(this, 5000L);
                break;
            case 3:
                b0.b(((qa) ((b8) this.b).c).a);
                break;
            case 4:
                ((qa) this.b).d();
                break;
            case 5:
                ((za) this.b).c.bringToFront();
                break;
            case 6:
                za zaVar = (za) ((i2) this.b).b;
                SpeedBubble speedBubble = zaVar.c;
                if (speedBubble != null) {
                    speedBubble.A(w7.g());
                }
                zaVar.f();
                zaVar.a.b.refreshCardIfLimitChanged();
                break;
            case 7:
                ((c) this.b).getCarContext().finishCarApp();
                break;
            case 8:
                Iterator it = z6.e.iterator();
                while (it.hasNext()) {
                    if (((w6) it.next()).c) {
                        break;
                    }
                }
                ((lb) this.b).b(false);
                ((lb) this.b).d();
                break;
            case 9:
                lb lbVar = (lb) ((c1) this.b).b;
                if (lbVar.d) {
                    lbVar.d = false;
                    lbVar.e = true;
                    lbVar.f = "";
                    break;
                }
                break;
            case 10:
                ((lb) ((h2) this.b).b).c();
                break;
            case 11:
                ((lb) ((i2) this.b).b).c();
                break;
            case 12:
                w0 w0Var = (w0) this.b;
                oc.a((oc) w0Var.c, (HorizontalScrollView) w0Var.b);
                break;
            default:
                fd fdVar = (fd) this.b;
                fdVar.a.b();
                fdVar.d.requestFocus();
                e eVar = fdVar.a;
                CarEditText carEditText = fdVar.d;
                CarScreen carScreen = eVar.b;
                InputManager inputManager = carScreen.host() != null ? carScreen.host().getInputManager() : null;
                if (inputManager != null && inputManager.isValid()) {
                    if (inputManager.isInputActive()) {
                        inputManager.stopInput();
                    }
                    inputManager.startInput(carEditText);
                    inputManager.isInputActive();
                    break;
                } else {
                    fdVar.a();
                    break;
                }
                break;
        }
    }
}
