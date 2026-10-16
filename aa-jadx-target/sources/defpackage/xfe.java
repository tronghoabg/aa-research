package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xfe extends defpackage.mdl {
    public static final /* synthetic */ int c = 0;
    private static final defpackage.yqm d = defpackage.yqm.c("GH.HardwareKeyRcvr");
    public boolean a;
    public defpackage.sax b;

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("HardwareKeyReceiver");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        android.view.KeyEvent keyEvent;
        android.content.Intent intent2;
        if (this.a && (keyEvent = (android.view.KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
            int action = keyEvent.getAction();
            if (defpackage.acyc.aC()) {
                if (action != 1) {
                    return;
                }
            } else if (action != 0) {
                return;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 187) {
                ((defpackage.yqj) d.l().ai((char) 10184)).u("Received KEYCODE_APP_SWITCH");
                defpackage.mpk.a().j(new defpackage.mqi(defpackage.mkt.s));
                this.b.j();
                return;
            }
            if (keyCode != 209) {
                switch (keyCode) {
                    case 65537:
                        break;
                    case 65538:
                        byte[] byteArrayExtra = intent.getByteArrayExtra("car_display_id");
                        if (com.google.android.gms.car.display.CarDisplayId.b((byteArrayExtra == null || byteArrayExtra.length == 0) ? com.google.android.gms.car.display.CarDisplayId.a : (com.google.android.gms.car.display.CarDisplayId) defpackage.sqs.l(byteArrayExtra, com.google.android.gms.car.display.CarDisplayId.CREATOR))) {
                            android.content.ComponentName componentNameA = defpackage.maw.a(defpackage.kit.b().e(), true);
                            if (componentNameA == null) {
                                intent2 = null;
                            } else {
                                android.content.Intent intent3 = new android.content.Intent("android.intent.action.MAIN");
                                intent3.setComponent(componentNameA);
                                intent2 = intent3;
                            }
                            if (intent2 != null) {
                                defpackage.lxy.p().b(intent2);
                                this.b.j();
                            }
                        }
                        break;
                    case 65539:
                        android.content.Intent intentC = defpackage.lnt.c(defpackage.mkt.G);
                        intentC.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 32);
                        defpackage.mpk.a().i(intentC);
                        this.b.j();
                        break;
                    case 65540:
                        defpackage.yqm yqmVar = d;
                        ((defpackage.yqj) yqmVar.l().ai((char) 10187)).u("Received KEYCODE_TEL");
                        defpackage.kyr kyrVar = new defpackage.kyr(10);
                        defpackage.zbe zbeVar = defpackage.zbe.HARDWARE_KEY_RECEIVER;
                        com.google.android.gms.car.CarInfo carInfo = (com.google.android.gms.car.CarInfo) defpackage.kgu.c(kyrVar, "GH.HardwareKeyRcvr", zbeVar, defpackage.zbd.pv, true, "Couldn't get CarInfo", new java.lang.Object[0]);
                        if (new defpackage.jbx(carInfo.e, carInfo.f).E(4, 5)) {
                            defpackage.mpk.a().j(new defpackage.mqi(defpackage.mkt.b));
                        } else {
                            for (com.google.android.apps.auto.components.telecom.call.CarCall carCall : defpackage.omf.w().k()) {
                                defpackage.ojm.a();
                                long epochMilli = j$.time.Instant.now().minusMillis(carCall.f.d).toEpochMilli();
                                int i = carCall.e;
                                if (i == 2 || i == 9 || i == 1 || epochMilli < 3000) {
                                    ((defpackage.yqj) yqmVar.l().ai(10183)).C("At the start of a call. Call State: %d, Call duration: %d", i, epochMilli);
                                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10188)).u("Not launching dialer in response to KEYCODE_TEL");
                                    defpackage.omf.u().f(defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.pu));
                                }
                            }
                            defpackage.mpk.a().j(new defpackage.mqi(defpackage.mkt.b));
                        }
                        this.b.j();
                        break;
                    default:
                        ((defpackage.yqj) ((defpackage.yqj) d.f()).ai((char) 10182)).w("No processor for keycode: %d", keyEvent.getKeyCode());
                        break;
                }
                return;
            }
            ((defpackage.yqj) d.l().ai((char) 10185)).u("Received KEYCODE_MEDIA, KEYCODE_MUSIC");
            android.content.ComponentName componentNameA2 = defpackage.lhc.a().a(defpackage.mqg.PHONE_MEDIA);
            if (componentNameA2 == null) {
                componentNameA2 = defpackage.mkt.f;
            }
            android.content.Intent intentC2 = defpackage.lnt.c(componentNameA2);
            intentC2.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 32);
            defpackage.mpk.a().i(intentC2);
            this.b.j();
        }
    }
}
