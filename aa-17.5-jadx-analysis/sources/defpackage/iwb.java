package defpackage;

import j$.time.Instant;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class iwb {
    public static final yph a = yph.c("CAR.InputEventLogger");
    public static final yfy b;
    public static final ygr c;
    public final int d;
    public final jfg e;
    public final eqy f;
    private final DateFormat g;
    private final ydx h;
    private int i;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(xkd.KEYCODE_SOFT_LEFT, yzy.jM);
        yfuVar.e(xkd.KEYCODE_SOFT_RIGHT, yzy.jN);
        yfuVar.e(xkd.KEYCODE_HOME, yzy.jA);
        yfuVar.e(xkd.KEYCODE_BACK, yzy.jL);
        yfuVar.e(xkd.KEYCODE_CALL, yzy.jE);
        yfuVar.e(xkd.KEYCODE_ENDCALL, yzy.jF);
        yfuVar.e(xkd.KEYCODE_DPAD_UP, yzy.jO);
        yfuVar.e(xkd.KEYCODE_DPAD_DOWN, yzy.jP);
        yfuVar.e(xkd.KEYCODE_DPAD_LEFT, yzy.jQ);
        yfuVar.e(xkd.KEYCODE_DPAD_RIGHT, yzy.jR);
        yfuVar.e(xkd.KEYCODE_DPAD_CENTER, yzy.jS);
        yfuVar.e(xkd.KEYCODE_VOLUME_UP, yzy.jT);
        yfuVar.e(xkd.KEYCODE_VOLUME_DOWN, yzy.jU);
        yfuVar.e(xkd.KEYCODE_POWER, yzy.jV);
        yfuVar.e(xkd.KEYCODE_CAMERA, yzy.jW);
        yfuVar.e(xkd.KEYCODE_CLEAR, yzy.jX);
        yfuVar.e(xkd.KEYCODE_MENU, yzy.jY);
        yfuVar.e(xkd.KEYCODE_NOTIFICATION, yzy.jZ);
        yfuVar.e(xkd.KEYCODE_SEARCH, yzy.jB);
        yfuVar.e(xkd.KEYCODE_MEDIA_PLAY_PAUSE, yzy.jK);
        yfuVar.e(xkd.KEYCODE_MEDIA_STOP, yzy.ka);
        yfuVar.e(xkd.KEYCODE_MEDIA_NEXT, yzy.jG);
        yfuVar.e(xkd.KEYCODE_MEDIA_PREVIOUS, yzy.jH);
        yfuVar.e(xkd.KEYCODE_MEDIA_REWIND, yzy.kb);
        yfuVar.e(xkd.KEYCODE_MEDIA_FAST_FORWARD, yzy.kc);
        yfuVar.e(xkd.KEYCODE_MUTE, yzy.kd);
        yfuVar.e(xkd.KEYCODE_PAGE_UP, yzy.ke);
        yfuVar.e(xkd.KEYCODE_PAGE_DOWN, yzy.kf);
        yfuVar.e(xkd.KEYCODE_MEDIA_PLAY, yzy.jI);
        yfuVar.e(xkd.KEYCODE_MEDIA_PAUSE, yzy.jJ);
        yfuVar.e(xkd.KEYCODE_MEDIA_CLOSE, yzy.kg);
        yfuVar.e(xkd.KEYCODE_MEDIA_EJECT, yzy.kh);
        yfuVar.e(xkd.KEYCODE_MEDIA_RECORD, yzy.ki);
        yfuVar.e(xkd.KEYCODE_VOLUME_MUTE, yzy.kj);
        yfuVar.e(xkd.KEYCODE_APP_SWITCH, yzy.kk);
        yfuVar.e(xkd.KEYCODE_LANGUAGE_SWITCH, yzy.kl);
        yfuVar.e(xkd.KEYCODE_MANNER_MODE, yzy.km);
        yfuVar.e(xkd.KEYCODE_3D_MODE, yzy.kn);
        yfuVar.e(xkd.KEYCODE_CONTACTS, yzy.ko);
        yfuVar.e(xkd.KEYCODE_CALENDAR, yzy.kp);
        yfuVar.e(xkd.KEYCODE_MUSIC, yzy.jx);
        yfuVar.e(xkd.KEYCODE_ASSIST, yzy.kq);
        yfuVar.e(xkd.KEYCODE_BRIGHTNESS_DOWN, yzy.kr);
        yfuVar.e(xkd.KEYCODE_BRIGHTNESS_UP, yzy.ks);
        yfuVar.e(xkd.KEYCODE_MEDIA_AUDIO_TRACK, yzy.kt);
        yfuVar.e(xkd.KEYCODE_SLEEP, yzy.ku);
        yfuVar.e(xkd.KEYCODE_WAKEUP, yzy.kv);
        yfuVar.e(xkd.KEYCODE_PAIRING, yzy.kw);
        yfuVar.e(xkd.KEYCODE_MEDIA_TOP_MENU, yzy.kx);
        yfuVar.e(xkd.KEYCODE_VOICE_ASSIST, yzy.ky);
        yfuVar.e(xkd.KEYCODE_HELP, yzy.kz);
        yfuVar.e(xkd.KEYCODE_NAVIGATE_PREVIOUS, yzy.kA);
        yfuVar.e(xkd.KEYCODE_NAVIGATE_NEXT, yzy.kB);
        yfuVar.e(xkd.KEYCODE_NAVIGATE_IN, yzy.kC);
        yfuVar.e(xkd.KEYCODE_NAVIGATE_OUT, yzy.kD);
        yfuVar.e(xkd.KEYCODE_DPAD_UP_LEFT, yzy.kE);
        yfuVar.e(xkd.KEYCODE_DPAD_DOWN_LEFT, yzy.kF);
        yfuVar.e(xkd.KEYCODE_DPAD_UP_RIGHT, yzy.kG);
        yfuVar.e(xkd.KEYCODE_DPAD_DOWN_RIGHT, yzy.kH);
        yfuVar.e(xkd.KEYCODE_SENTINEL, yzy.kI);
        yfuVar.e(xkd.KEYCODE_ROTARY_CONTROLLER, yzy.kJ);
        yfuVar.e(xkd.KEYCODE_MEDIA, yzy.jw);
        yfuVar.e(xkd.KEYCODE_NAVIGATION, yzy.jy);
        yfuVar.e(xkd.KEYCODE_RADIO, yzy.kK);
        yfuVar.e(xkd.KEYCODE_TEL, yzy.jz);
        yfuVar.e(xkd.KEYCODE_PRIMARY_BUTTON, yzy.kL);
        yfuVar.e(xkd.KEYCODE_SECONDARY_BUTTON, yzy.kM);
        yfuVar.e(xkd.KEYCODE_TERTIARY_BUTTON, yzy.kN);
        yfuVar.e(xkd.KEYCODE_TURN_CARD, yzy.kO);
        yfy yfyVarF = yrm.F(yfuVar.d(true));
        b = yfyVarF;
        c = yfyVarF.keySet();
    }

    public iwb(int i, jfg jfgVar, int i2) {
        eqy eqyVar = new eqy();
        this.g = new SimpleDateFormat("MM-dd' 'HH:mm:ss.SS", Locale.US);
        this.d = i;
        this.e = jfgVar;
        this.h = new ydx(i2);
        this.f = eqyVar;
    }

    public final void a(rzj rzjVar) {
        try {
            ydx ydxVar = this.h;
            rzjVar.h("Recorded %d events (dropped %d):", Integer.valueOf(ydxVar.size()), Integer.valueOf(this.i));
            Iterator<E> it = ydxVar.iterator();
            while (it.hasNext()) {
                rzjVar.m((String) it.next());
            }
        } catch (ConcurrentModificationException unused) {
            rzjVar.i("aborting: inputEvents modified while dumping");
        }
    }

    public final void b(String str, String str2) {
        ydx ydxVar = this.h;
        if (ydxVar.a - ydxVar.size() == 0) {
            this.i++;
        }
        ydxVar.add(String.format(Locale.US, "%s %s(%s)", this.g.format(Long.valueOf(Instant.now().toEpochMilli())), str, str2));
    }
}
