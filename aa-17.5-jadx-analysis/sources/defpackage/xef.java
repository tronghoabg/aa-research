package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.car.app.model.Action;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.display.CarDisplayId;
import j$.time.Instant;

/* loaded from: classes.dex */
public final class xef extends mdd {
    public static final /* synthetic */ int c = 0;
    private static final yph d = yph.c("GH.HardwareKeyRcvr");
    public boolean a;
    public sab b;

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("HardwareKeyReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        KeyEvent keyEvent;
        Intent intent2;
        if (this.a && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
            int action = keyEvent.getAction();
            if (acxa.aA()) {
                if (action != 1) {
                    return;
                }
            } else if (action != 0) {
                return;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 187) {
                ((ype) d.l().ai((char) 10156)).u("Received KEYCODE_APP_SWITCH");
                mpe.a().j(new mqb(mkn.s));
                this.b.j();
                return;
            }
            if (keyCode != 209) {
                switch (keyCode) {
                    case 65537:
                        break;
                    case Action.TYPE_APP_ICON /* 65538 */:
                        byte[] byteArrayExtra = intent.getByteArrayExtra("car_display_id");
                        if (CarDisplayId.b((byteArrayExtra == null || byteArrayExtra.length == 0) ? CarDisplayId.a : (CarDisplayId) spu.h(byteArrayExtra, CarDisplayId.CREATOR))) {
                            ComponentName componentNameA = map.a(kio.b().e(), true);
                            if (componentNameA == null) {
                                intent2 = null;
                            } else {
                                Intent intent3 = new Intent("android.intent.action.MAIN");
                                intent3.setComponent(componentNameA);
                                intent2 = intent3;
                            }
                            if (intent2 != null) {
                                mlq.f().b(intent2);
                                this.b.j();
                                break;
                            }
                        }
                        break;
                    case Action.TYPE_BACK /* 65539 */:
                        if (acrz.s()) {
                            Intent intentC = lnm.c(mkn.G);
                            intentC.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 32);
                            mpe.a().i(intentC);
                            this.b.j();
                            break;
                        }
                        break;
                    case Action.TYPE_PAN /* 65540 */:
                        yph yphVar = d;
                        ((ype) yphVar.l().ai((char) 10159)).u("Received KEYCODE_TEL");
                        kym kymVar = new kym(10);
                        yzz yzzVar = yzz.HARDWARE_KEY_RECEIVER;
                        CarInfo carInfo = (CarInfo) kgq.c(kymVar, "GH.HardwareKeyRcvr", yzzVar, yzy.pt, true, "Couldn't get CarInfo", new Object[0]);
                        if (new jbq(carInfo.e, carInfo.f).t(4, 5)) {
                            mpe.a().j(new mqb(mkn.b));
                        } else {
                            for (CarCall carCall : ebf.A().k()) {
                                oit.a();
                                long epochMilli = Instant.now().minusMillis(carCall.f.d).toEpochMilli();
                                int i = carCall.e;
                                if (i == 2 || i == 9 || i == 1 || epochMilli < 3000) {
                                    ((ype) yphVar.l().ai(10155)).C("At the start of a call. Call State: %d, Call duration: %d", i, epochMilli);
                                    ((ype) ((ype) yphVar.f()).ai((char) 10160)).u("Not launching dialer in response to KEYCODE_TEL");
                                    ebf.j().f(rrc.h(yxy.GEARHEAD, yzzVar, yzy.ps));
                                }
                            }
                            mpe.a().j(new mqb(mkn.b));
                        }
                        this.b.j();
                        break;
                    default:
                        ((ype) ((ype) d.f()).ai((char) 10154)).w("No processor for keycode: %d", keyEvent.getKeyCode());
                        break;
                }
                return;
            }
            ((ype) d.l().ai((char) 10157)).u("Received KEYCODE_MEDIA, KEYCODE_MUSIC");
            ComponentName componentNameA2 = lgv.a().a(mpz.e);
            if (componentNameA2 == null) {
                componentNameA2 = mkn.f;
            }
            Intent intentC2 = lnm.c(componentNameA2);
            intentC2.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 32);
            mpe.a().i(intentC2);
            this.b.j();
        }
    }
}
