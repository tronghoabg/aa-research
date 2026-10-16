package defpackage;

import android.media.AudioAttributes;
import android.os.Handler;
import android.os.Process;
import com.google.android.gms.car.AudioFocusInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class rfr implements rfx {
    public static final ypf a = ols.R("CAR.AUDIO");
    private static final ygr g = ygr.p(6, 2);
    public volatile Handler b;
    public final ykd f;
    private volatile boolean h = false;
    public final HashMap c = new HashMap();
    public final Object d = new Object();
    public final AtomicInteger e = new AtomicInteger(0);

    public rfr(ykd ykdVar) {
        this.f = ykdVar;
    }

    static final boolean g(AudioFocusInfo audioFocusInfo) {
        AudioAttributes audioAttributes = audioFocusInfo.a;
        if (audioAttributes != null) {
            if (g.contains(Integer.valueOf(audioAttributes.getUsage()))) {
                yop yopVarAi = a.f().ai(7970);
                Integer numValueOf = Integer.valueOf(audioAttributes.getUsage());
                zjc zjcVar = zjc.a;
                yopVarAi.M("Not handling focus event for phone calls. usage: %s, content type: %s", new zjd(zjcVar, numValueOf), new zjd(zjcVar, Integer.valueOf(audioAttributes.getContentType())));
            } else if (audioAttributes.getUsage() == 5 && audioAttributes.getContentType() == 4) {
                a.f().ai(7969).u("Not handling focus event for notifications.");
            }
            return false;
        }
        if (audioFocusInfo.b != Process.myUid()) {
            return true;
        }
        if (!a.O()) {
            a.f().ai(7983).u("Not handling focus event.");
            return false;
        }
        if (audioAttributes.getUsage() != 0 || audioAttributes.getContentType() != 0 || audioFocusInfo.g != 1) {
            return true;
        }
        a.f().ai(7982).u("Not handling focus event from afm client.");
        return false;
    }

    private final void h(int i, boolean z) {
        Handler handler = this.b;
        if (handler == null) {
            a.h().ai(7972).u("maybeNotifyFocusStackChangeAfterDelay: handler is null, so returning.");
        } else {
            handler.postDelayed(new jgv(this, z, 12), i);
        }
    }

    public final int a() {
        synchronized (this.d) {
            Iterator it = this.c.values().iterator();
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
                    a.g().ai(7967).w("Unrecognized focus grant in map: %d", iIntValue);
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
        a.f().ai(7968).u("Invalidate audio focus stack monitor due to car audio focus change");
        this.h = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rfx
    public final void d(AudioFocusInfo audioFocusInfo, int i) {
        boolean z;
        ypf ypfVar = a;
        yop yopVarAi = ypfVar.f().ai(7973);
        int i2 = audioFocusInfo.e;
        Integer numValueOf = Integer.valueOf(i2);
        zjc zjcVar = zjc.a;
        zjd zjdVar = new zjd(zjcVar, numValueOf);
        zjd zjdVar2 = new zjd(zjcVar, Integer.valueOf(i));
        String str = audioFocusInfo.c;
        yopVarAi.S("Received onAudioFocusGrant. gainRequest: %s, requestResult: %s, clientId: %s, clientUid: %s", zjdVar, zjdVar2, new zjd(zjcVar, str), new zjd(zjcVar, Integer.valueOf(audioFocusInfo.b)));
        if (i2 == 0) {
            ypfVar.g().ai(7977).u("Unexpected AudioManager.AUDIOFOCUS_NONE");
            return;
        }
        if (g(audioFocusInfo)) {
            if (i == 2) {
                ypfVar.d().ai(7976).u("Ignoring onAudioFocusGrant for delayed request");
                return;
            }
            int i3 = 1;
            if (i != 1) {
                ypfVar.g().ai(7975).w("Expected AudioManager.AUDIOFOCUS_REQUEST_GRANTED, but got %d", i);
            }
            if (i2 == 1) {
                boolean z2 = this.h;
                this.h = false;
                z = z2;
                i2 = 1;
            } else {
                z = false;
            }
            synchronized (this.d) {
                if (i2 == 1) {
                    yfl yflVar = new yfl(4);
                    HashMap map = this.c;
                    for (Map.Entry entry : map.entrySet()) {
                        if (((Integer) entry.getValue()).intValue() == 1) {
                            yflVar.i((String) entry.getKey());
                        }
                    }
                    ynp ynpVarListIterator = yflVar.g().listIterator(0);
                    while (ynpVarListIterator.hasNext()) {
                        String str2 = (String) ynpVarListIterator.next();
                        if (!str2.equals(str)) {
                            ypfVar.h().ai(7974).y("Removing obsolete client: %s", str2);
                            map.remove(str2);
                            z = true;
                        }
                    }
                } else {
                    i3 = i2;
                }
                this.c.put(str, Integer.valueOf(i3));
            }
            h(0, z);
        }
    }

    @Override // defpackage.rfx
    public final void e(AudioFocusInfo audioFocusInfo, boolean z) {
        Integer num;
        ypf ypfVar = a;
        yop yopVarAi = ypfVar.f().ai(7978);
        int i = audioFocusInfo.f;
        Integer numValueOf = Integer.valueOf(i);
        zjc zjcVar = zjc.a;
        zjd zjdVar = new zjd(zjcVar, numValueOf);
        Boolean boolValueOf = Boolean.valueOf(z);
        zjd zjdVar2 = new zjd(zjcVar, boolValueOf);
        String str = audioFocusInfo.c;
        yopVarAi.S("Received onAudioFocusLoss. lossReceived: %s, wasNotified: %s, clientId: %s, clientUid: %s", zjdVar, zjdVar2, new zjd(zjcVar, str), new zjd(zjcVar, Integer.valueOf(audioFocusInfo.b)));
        if (g(audioFocusInfo)) {
            synchronized (this.d) {
                num = (Integer) this.c.get(str);
            }
            if (num == null) {
                ypfVar.h().ai(7981).R("Unrecognized client receiving loss. lossReceived: %d, wasNotified: %b, clientId: %s", numValueOf, boolValueOf, str);
                return;
            }
            ypfVar.f().ai(7979).E("currentGrant: %d, invalidateByCarAudioFocusChange: %b", num.intValue(), this.h);
            if (i == -3 || i == -2) {
                if (num.intValue() == 1) {
                    return;
                }
            } else if (i != -1 && i != 0) {
                ypfVar.g().ai(7980).w("Received unexpected loss: %d", i);
            }
            synchronized (this.d) {
                this.c.remove(str);
            }
            h(20, false);
        }
    }

    @Override // defpackage.rfx
    public final void c(AudioFocusInfo audioFocusInfo) {
    }

    @Override // defpackage.rfx
    public final void f(AudioFocusInfo audioFocusInfo, int i) {
    }
}
