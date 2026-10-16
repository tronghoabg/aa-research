package defpackage;

import android.media.AudioAttributes;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.car.AudioFocusInfo;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class isr implements itc {
    public static final yph a = yph.c("CAR.AUDIO.AFM");
    private static final ygr h = ygr.p(6, 2);
    public final ism b;
    public volatile Handler c;
    public final HashMap d = new HashMap();
    public final Object e = new Object();
    public final AtomicInteger f = new AtomicInteger(0);
    public volatile String g;
    private volatile boolean i;
    private final jfg j;

    public isr(ism ismVar, jfg jfgVar) {
        this.b = ismVar;
        this.j = jfgVar;
    }

    public static final boolean e(AudioFocusInfo audioFocusInfo) {
        AudioAttributes audioAttributes = audioFocusInfo.a;
        if (audioAttributes != null) {
            if (h.contains(Integer.valueOf(audioAttributes.getUsage()))) {
                ((ype) ((ype) a.f()).ai((char) 1311)).y("Not handling focus event for phone calls. attributes: %s", new zjd(zjc.a, audioAttributes));
            } else if (audioAttributes.getUsage() == 5 && audioAttributes.getContentType() == 4) {
                ((ype) ((ype) a.f()).ai((char) 1310)).u("Not handling focus event for notifications.");
            }
            return false;
        }
        if (audioFocusInfo.b == Process.myUid()) {
            if (audioAttributes.getUsage() == 0 && audioAttributes.getContentType() == 0 && audioFocusInfo.g == 1) {
                ((ype) ((ype) a.f()).ai((char) 1326)).u("Not handling focus event from Gearhead AFM client.");
                return false;
            }
            ((ype) ((ype) a.f()).ai(1325)).S("Handling focus event from a Gearhead client: %s, Usage: %d, Content: %d, Flags: %d", audioFocusInfo.c, Integer.valueOf(audioAttributes.getUsage()), Integer.valueOf(audioAttributes.getContentType()), Integer.valueOf(audioFocusInfo.g));
        }
        return true;
    }

    private final void f(int i, boolean z, AudioAttributes audioAttributes, Optional optional) {
        Handler handler = this.c;
        if (handler == null) {
            ((ype) ((ype) a.h()).ai((char) 1313)).u("maybeNotifyFocusStackChangeAfterDelay: handler is null, so returning.");
        } else {
            handler.postDelayed(new isq(this, z, audioAttributes, optional, 0), i);
        }
    }

    public final int a() {
        synchronized (this.e) {
            Iterator it = this.d.values().iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (iIntValue == 1) {
                    return 1;
                }
                if (iIntValue == 2) {
                    z = true;
                } else if (iIntValue == 3) {
                    z2 = true;
                } else if (iIntValue != 4) {
                    ((ype) ((ype) a.g()).ai(1308)).w("Unrecognized focus grant in map: %d", iIntValue);
                } else {
                    z3 = true;
                }
            }
            if (z) {
                return 2;
            }
            if (z2) {
                return 3;
            }
            return z3 ? 4 : 0;
        }
    }

    public final void b() {
        ((ype) ((ype) a.f()).ai((char) 1309)).u("Invalidate audio focus stack monitor due to car audio focus change");
        this.i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.itc
    public final void c(AudioFocusInfo audioFocusInfo, int i) {
        boolean z;
        boolean z2;
        int i2;
        yph yphVar = a;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(1315);
        int i3 = audioFocusInfo.e;
        String strK = epq.k(i3);
        zjc zjcVar = zjc.a;
        zjd zjdVar = new zjd(zjcVar, strK);
        zjd zjdVar2 = new zjd(zjcVar, epq.j(i));
        Integer numValueOf = Integer.valueOf(audioFocusInfo.b);
        String str = audioFocusInfo.d;
        String str2 = audioFocusInfo.c;
        ypeVar.T("Received onAudioFocusGrant. gainRequest: %s, requestResult: %s, clientId: %s, packageName: %s, clientUid: %s", zjdVar, zjdVar2, str2, str, numValueOf);
        int i4 = i;
        if (i4 == 1) {
            if (!TextUtils.equals(str, "com.google.android.projection.gearhead")) {
                this.j.b(rrc.h(yxy.CAR_SERVICE, yzz.MOBILE_DEVICE_AUDIO_FOCUS_CHANGE, i3 != 1 ? (i3 == 2 || i3 == 3 || i3 == 4) ? yzy.zx : yzy.zy : yzy.zw).l());
            }
            i4 = 1;
        }
        if (i3 == 0) {
            ((ype) ((ype) yphVar.g()).ai((char) 1318)).u("Unexpected AudioManager.AUDIOFOCUS_NONE");
            return;
        }
        if (e(audioFocusInfo)) {
            if (i4 == 2) {
                ((ype) ((ype) yphVar.f()).ai((char) 1317)).u("Ignoring onAudioFocusGrant for delayed request");
                return;
            }
            if (i4 != 1) {
                ((ype) ((ype) yphVar.g()).ai((char) 1316)).y("Expected AudioManager.AUDIOFOCUS_REQUEST_GRANTED, but got %s", new zjd(zjcVar, epq.j(i4)));
            }
            String str3 = this.g;
            this.g = str;
            if (i3 == 1) {
                boolean z3 = this.i;
                this.i = false;
                z = z3;
                i3 = 1;
            } else {
                z = false;
            }
            synchronized (this.e) {
                if (i3 == 1) {
                    try {
                        yfl yflVar = new yfl(4);
                        HashMap map = this.d;
                        for (Map.Entry entry : map.entrySet()) {
                            if (((Integer) entry.getValue()).intValue() == 1) {
                                yflVar.i((String) entry.getKey());
                            }
                        }
                        yfq yfqVarG = yflVar.g();
                        int i5 = ((yls) yfqVarG).c;
                        z2 = false;
                        for (int i6 = 0; i6 < i5; i6++) {
                            String str4 = (String) yfqVarG.get(i6);
                            if (!str4.equals(str2)) {
                                ((ype) ((ype) yphVar.h()).ai((char) 1307)).y("Removing obsolete client: %s", str4);
                                map.remove(str4);
                                z2 = true;
                            }
                        }
                        i2 = 1;
                        i3 = 1;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    i2 = i3;
                    z2 = false;
                }
                this.d.put(str2, Integer.valueOf(i3));
            }
            boolean z4 = (a.O() && (kmo.c(acna.c(), str) || (str3 != null && kmo.c(acna.c(), str3)))) ? true : z2 | z;
            Optional optionalEmpty = Optional.empty();
            if (z4) {
                optionalEmpty = Optional.of(Integer.valueOf(i2));
            }
            f(0, z4, audioFocusInfo.a, optionalEmpty);
        }
    }

    @Override // defpackage.itc
    public final void d(AudioFocusInfo audioFocusInfo, boolean z) {
        Integer num;
        String str;
        yph yphVar = a;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(1319);
        int i = audioFocusInfo.f;
        String strK = epq.k(i);
        zjc zjcVar = zjc.a;
        zjd zjdVar = new zjd(zjcVar, strK);
        Boolean boolValueOf = Boolean.valueOf(z);
        zjd zjdVar2 = new zjd(zjcVar, boolValueOf);
        Integer numValueOf = Integer.valueOf(audioFocusInfo.b);
        String str2 = audioFocusInfo.c;
        String str3 = audioFocusInfo.d;
        ypeVar.T("Received onAudioFocusLoss. lossReceived: %s, wasNotified: %s, clientId: %s, packageName: %s, clientUid: %s", zjdVar, zjdVar2, str2, str3, numValueOf);
        if (e(audioFocusInfo)) {
            synchronized (this.e) {
                num = (Integer) this.d.get(str2);
            }
            if (num == null) {
                ((ype) ((ype) yphVar.h()).ai(1324)).R("Unrecognized client receiving loss. lossReceived: %s, wasNotified: %b, clientId: %s", new zjd(zjc.a, epq.k(i)), boolValueOf, str2);
                return;
            }
            ype ypeVar2 = (ype) ((ype) yphVar.f()).ai(1320);
            String strK2 = epq.k(num.intValue());
            zjc zjcVar2 = zjc.a;
            ypeVar2.S("Processing onAudioFocusLoss. currentGrant: %s, invalidateByCarAudioFocusChange: %b, lossReceived: %s, packageName: %s", new zjd(zjcVar2, strK2), Boolean.valueOf(this.i), new zjd(zjcVar2, epq.k(i)), str3);
            Handler handler = this.c;
            if (handler == null) {
                ((ype) ((ype) yphVar.h()).ai((char) 1323)).u("onExternalAppLoseAudioFocus: handler is null, not triggering callback.");
                str = str3;
            } else {
                str = str3;
                handler.post(new isp(this, i, str, audioFocusInfo, 0));
            }
            if (i == -3 || i == -2) {
                if (num.intValue() == 1) {
                    ((ype) ((ype) yphVar.f()).ai(1322)).M("Received transient loss for client with gain. Not removing client from focus stack and not sending focus change notification. clientId: %s, packageName: %s", str2, str);
                    return;
                }
            } else if (i != -1 && i != 0) {
                ((ype) ((ype) yphVar.g()).ai((char) 1321)).y("Received unexpected loss: %s", epq.k(i));
            }
            synchronized (this.e) {
                this.d.remove(str2);
            }
            f(20, false, audioFocusInfo.a, Optional.empty());
        }
    }
}
