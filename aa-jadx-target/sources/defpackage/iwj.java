package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iwj {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.InputEventLogger");
    public static final defpackage.yhe b;
    public static final defpackage.yhx c;
    public final int d;
    public final defpackage.jfo e;
    public final defpackage.dmh f;
    private final java.text.DateFormat g;
    private final defpackage.yfd h;
    private int i;

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(defpackage.xle.KEYCODE_SOFT_LEFT, defpackage.zbd.jM);
        yhaVar.f(defpackage.xle.KEYCODE_SOFT_RIGHT, defpackage.zbd.jN);
        yhaVar.f(defpackage.xle.KEYCODE_HOME, defpackage.zbd.jA);
        yhaVar.f(defpackage.xle.KEYCODE_BACK, defpackage.zbd.jL);
        yhaVar.f(defpackage.xle.KEYCODE_CALL, defpackage.zbd.jE);
        yhaVar.f(defpackage.xle.KEYCODE_ENDCALL, defpackage.zbd.jF);
        yhaVar.f(defpackage.xle.KEYCODE_DPAD_UP, defpackage.zbd.jO);
        yhaVar.f(defpackage.xle.KEYCODE_DPAD_DOWN, defpackage.zbd.jP);
        yhaVar.f(defpackage.xle.KEYCODE_DPAD_LEFT, defpackage.zbd.jQ);
        yhaVar.f(defpackage.xle.KEYCODE_DPAD_RIGHT, defpackage.zbd.jR);
        yhaVar.f(defpackage.xle.KEYCODE_DPAD_CENTER, defpackage.zbd.jS);
        yhaVar.f(defpackage.xle.KEYCODE_VOLUME_UP, defpackage.zbd.jT);
        yhaVar.f(defpackage.xle.KEYCODE_VOLUME_DOWN, defpackage.zbd.jU);
        yhaVar.f(defpackage.xle.KEYCODE_POWER, defpackage.zbd.jV);
        yhaVar.f(defpackage.xle.KEYCODE_CAMERA, defpackage.zbd.jW);
        yhaVar.f(defpackage.xle.KEYCODE_CLEAR, defpackage.zbd.jX);
        yhaVar.f(defpackage.xle.KEYCODE_MENU, defpackage.zbd.jY);
        yhaVar.f(defpackage.xle.KEYCODE_NOTIFICATION, defpackage.zbd.jZ);
        yhaVar.f(defpackage.xle.KEYCODE_SEARCH, defpackage.zbd.jB);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_PLAY_PAUSE, defpackage.zbd.jK);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_STOP, defpackage.zbd.ka);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_NEXT, defpackage.zbd.jG);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_PREVIOUS, defpackage.zbd.jH);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_REWIND, defpackage.zbd.kb);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_FAST_FORWARD, defpackage.zbd.kc);
        yhaVar.f(defpackage.xle.KEYCODE_MUTE, defpackage.zbd.kd);
        yhaVar.f(defpackage.xle.KEYCODE_PAGE_UP, defpackage.zbd.ke);
        yhaVar.f(defpackage.xle.KEYCODE_PAGE_DOWN, defpackage.zbd.kf);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_PLAY, defpackage.zbd.jI);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_PAUSE, defpackage.zbd.jJ);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_CLOSE, defpackage.zbd.kg);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_EJECT, defpackage.zbd.kh);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_RECORD, defpackage.zbd.ki);
        yhaVar.f(defpackage.xle.KEYCODE_VOLUME_MUTE, defpackage.zbd.kj);
        yhaVar.f(defpackage.xle.KEYCODE_APP_SWITCH, defpackage.zbd.kk);
        yhaVar.f(defpackage.xle.KEYCODE_LANGUAGE_SWITCH, defpackage.zbd.kl);
        yhaVar.f(defpackage.xle.KEYCODE_MANNER_MODE, defpackage.zbd.km);
        yhaVar.f(defpackage.xle.KEYCODE_3D_MODE, defpackage.zbd.kn);
        yhaVar.f(defpackage.xle.KEYCODE_CONTACTS, defpackage.zbd.ko);
        yhaVar.f(defpackage.xle.KEYCODE_CALENDAR, defpackage.zbd.kp);
        yhaVar.f(defpackage.xle.KEYCODE_MUSIC, defpackage.zbd.jx);
        yhaVar.f(defpackage.xle.KEYCODE_ASSIST, defpackage.zbd.kq);
        yhaVar.f(defpackage.xle.KEYCODE_BRIGHTNESS_DOWN, defpackage.zbd.kr);
        yhaVar.f(defpackage.xle.KEYCODE_BRIGHTNESS_UP, defpackage.zbd.ks);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_AUDIO_TRACK, defpackage.zbd.kt);
        yhaVar.f(defpackage.xle.KEYCODE_SLEEP, defpackage.zbd.ku);
        yhaVar.f(defpackage.xle.KEYCODE_WAKEUP, defpackage.zbd.kv);
        yhaVar.f(defpackage.xle.KEYCODE_PAIRING, defpackage.zbd.kw);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA_TOP_MENU, defpackage.zbd.kx);
        yhaVar.f(defpackage.xle.KEYCODE_VOICE_ASSIST, defpackage.zbd.ky);
        yhaVar.f(defpackage.xle.KEYCODE_HELP, defpackage.zbd.kz);
        yhaVar.f(defpackage.xle.KEYCODE_NAVIGATE_PREVIOUS, defpackage.zbd.kA);
        yhaVar.f(defpackage.xle.KEYCODE_NAVIGATE_NEXT, defpackage.zbd.kB);
        yhaVar.f(defpackage.xle.KEYCODE_NAVIGATE_IN, defpackage.zbd.kC);
        yhaVar.f(defpackage.xle.KEYCODE_NAVIGATE_OUT, defpackage.zbd.kD);
        yhaVar.f(defpackage.xle.KEYCODE_DPAD_UP_LEFT, defpackage.zbd.kE);
        yhaVar.f(defpackage.xle.KEYCODE_DPAD_DOWN_LEFT, defpackage.zbd.kF);
        yhaVar.f(defpackage.xle.KEYCODE_DPAD_UP_RIGHT, defpackage.zbd.kG);
        yhaVar.f(defpackage.xle.KEYCODE_DPAD_DOWN_RIGHT, defpackage.zbd.kH);
        yhaVar.f(defpackage.xle.KEYCODE_SENTINEL, defpackage.zbd.kI);
        yhaVar.f(defpackage.xle.KEYCODE_ROTARY_CONTROLLER, defpackage.zbd.kJ);
        yhaVar.f(defpackage.xle.KEYCODE_MEDIA, defpackage.zbd.jw);
        yhaVar.f(defpackage.xle.KEYCODE_NAVIGATION, defpackage.zbd.jy);
        yhaVar.f(defpackage.xle.KEYCODE_RADIO, defpackage.zbd.kK);
        yhaVar.f(defpackage.xle.KEYCODE_TEL, defpackage.zbd.jz);
        yhaVar.f(defpackage.xle.KEYCODE_PRIMARY_BUTTON, defpackage.zbd.kL);
        yhaVar.f(defpackage.xle.KEYCODE_SECONDARY_BUTTON, defpackage.zbd.kM);
        yhaVar.f(defpackage.xle.KEYCODE_TERTIARY_BUTTON, defpackage.zbd.kN);
        yhaVar.f(defpackage.xle.KEYCODE_TURN_CARD, defpackage.zbd.kO);
        defpackage.yhe yheVarF = defpackage.ysr.F(yhaVar.d(true));
        b = yheVarF;
        c = yheVarF.keySet();
    }

    public iwj(int i, defpackage.jfo jfoVar, int i2) {
        defpackage.dmh dmhVar = new defpackage.dmh();
        this.g = new java.text.SimpleDateFormat("MM-dd' 'HH:mm:ss.SS", java.util.Locale.US);
        this.d = i;
        this.e = jfoVar;
        this.h = new defpackage.yfd(i2);
        this.f = dmhVar;
    }

    public final void a(defpackage.saf safVar) {
        try {
            defpackage.yfd yfdVar = this.h;
            safVar.h("Recorded %d events (dropped %d):", java.lang.Integer.valueOf(yfdVar.size()), java.lang.Integer.valueOf(this.i));
            java.util.Iterator<E> it = yfdVar.iterator();
            while (it.hasNext()) {
                safVar.m((java.lang.String) it.next());
            }
        } catch (java.util.ConcurrentModificationException unused) {
            safVar.i("aborting: inputEvents modified while dumping");
        }
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        defpackage.yfd yfdVar = this.h;
        if (yfdVar.a - yfdVar.size() == 0) {
            this.i++;
        }
        yfdVar.add(java.lang.String.format(java.util.Locale.US, "%s %s(%s)", this.g.format(java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli())), str, str2));
    }
}
