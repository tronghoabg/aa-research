package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class isz implements defpackage.itk {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.AUDIO.AFM");
    private static final defpackage.yhx h = defpackage.yhx.p(6, 2);
    public final defpackage.isu b;
    public volatile android.os.Handler c;
    public final java.util.HashMap d = new java.util.HashMap();
    public final java.lang.Object e = new java.lang.Object();
    public final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger(0);
    public volatile java.lang.String g;
    private volatile boolean i;
    private final defpackage.jfo j;

    public isz(defpackage.isu isuVar, defpackage.jfo jfoVar) {
        this.b = isuVar;
        this.j = jfoVar;
    }

    public static final boolean e(com.google.android.gms.car.AudioFocusInfo audioFocusInfo) {
        android.media.AudioAttributes audioAttributes = audioFocusInfo.a;
        if (audioAttributes != null) {
            if (h.contains(java.lang.Integer.valueOf(audioAttributes.getUsage()))) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1311)).y("Not handling focus event for phone calls. attributes: %s", new defpackage.zkf(defpackage.zke.a, audioAttributes));
            } else if (audioAttributes.getUsage() == 5 && audioAttributes.getContentType() == 4) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1310)).u("Not handling focus event for notifications.");
            }
            return false;
        }
        if (audioFocusInfo.b == android.os.Process.myUid()) {
            if (audioAttributes.getUsage() == 0 && audioAttributes.getContentType() == 0 && audioFocusInfo.g == 1) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1326)).u("Not handling focus event from Gearhead AFM client.");
                return false;
            }
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1325)).S("Handling focus event from a Gearhead client: %s, Usage: %d, Content: %d, Flags: %d", audioFocusInfo.c, java.lang.Integer.valueOf(audioAttributes.getUsage()), java.lang.Integer.valueOf(audioAttributes.getContentType()), java.lang.Integer.valueOf(audioFocusInfo.g));
        }
        return true;
    }

    private final void f(int i, boolean z, android.media.AudioAttributes audioAttributes, j$.util.Optional optional) {
        android.os.Handler handler = this.c;
        if (handler == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1313)).u("maybeNotifyFocusStackChangeAfterDelay: handler is null, so returning.");
        } else {
            handler.postDelayed(new isy(this, z, audioAttributes, optional, 0), i);
        }
    }

    public final int a() {
        synchronized (this.e) {
            java.util.Iterator it = this.d.values().iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                int iIntValue = ((java.lang.Integer) it.next()).intValue();
                if (iIntValue == 1) {
                    return 1;
                }
                if (iIntValue == 2) {
                    z = true;
                } else if (iIntValue == 3) {
                    z2 = true;
                } else if (iIntValue != 4) {
                    ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(1308)).w("Unrecognized focus grant in map: %d", iIntValue);
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
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1309)).u("Invalidate audio focus stack monitor due to car audio focus change");
        this.i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.itk
    public final void c(com.google.android.gms.car.AudioFocusInfo audioFocusInfo, int i) {
        boolean z;
        boolean z2;
        int i2;
        defpackage.yqm yqmVar = a;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1315);
        int i3 = audioFocusInfo.e;
        java.lang.String strF = defpackage.ere.f(i3);
        defpackage.zke zkeVar = defpackage.zke.a;
        defpackage.zkf zkfVar = new defpackage.zkf(zkeVar, strF);
        defpackage.zkf zkfVar2 = new defpackage.zkf(zkeVar, defpackage.ere.e(i));
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(audioFocusInfo.b);
        java.lang.String str = audioFocusInfo.d;
        java.lang.String str2 = audioFocusInfo.c;
        yqjVar.T("Received onAudioFocusGrant. gainRequest: %s, requestResult: %s, clientId: %s, packageName: %s, clientUid: %s", zkfVar, zkfVar2, str2, str, numValueOf);
        int i4 = i;
        if (i4 == 1) {
            if (!android.text.TextUtils.equals(str, "com.google.android.projection.gearhead")) {
                this.j.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.MOBILE_DEVICE_AUDIO_FOCUS_CHANGE, i3 != 1 ? (i3 == 2 || i3 == 3 || i3 == 4) ? defpackage.zbd.zB : defpackage.zbd.zC : defpackage.zbd.zA).l());
            }
            i4 = 1;
        }
        if (i3 == 0) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 1318)).u("Unexpected AudioManager.AUDIOFOCUS_NONE");
            return;
        }
        if (e(audioFocusInfo)) {
            if (i4 == 2) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1317)).u("Ignoring onAudioFocusGrant for delayed request");
                return;
            }
            if (i4 != 1) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 1316)).y("Expected AudioManager.AUDIOFOCUS_REQUEST_GRANTED, but got %s", new defpackage.zkf(zkeVar, defpackage.ere.e(i4)));
            }
            java.lang.String str3 = this.g;
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
                        defpackage.ygr ygrVar = new defpackage.ygr(4);
                        java.util.HashMap map = this.d;
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            if (((java.lang.Integer) entry.getValue()).intValue() == 1) {
                                ygrVar.i((java.lang.String) entry.getKey());
                            }
                        }
                        defpackage.ygw ygwVarG = ygrVar.g();
                        int i5 = ((defpackage.ymx) ygwVarG).c;
                        z2 = false;
                        for (int i6 = 0; i6 < i5; i6++) {
                            java.lang.String str4 = (java.lang.String) ygwVarG.get(i6);
                            if (!str4.equals(str2)) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1307)).y("Removing obsolete client: %s", str4);
                                map.remove(str4);
                                z2 = true;
                            }
                        }
                        i2 = 1;
                        i3 = 1;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                } else {
                    i2 = i3;
                    z2 = false;
                }
                this.d.put(str2, java.lang.Integer.valueOf(i3));
            }
            boolean z4 = (defpackage.a.N() && (defpackage.kmv.c(acoc.c(), str) || (str3 != null && defpackage.kmv.c(acoc.c(), str3)))) ? true : z2 | z;
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            if (z4) {
                optionalEmpty = j$.util.Optional.of(java.lang.Integer.valueOf(i2));
            }
            f(0, z4, audioFocusInfo.a, optionalEmpty);
        }
    }

    @Override // defpackage.itk
    public final void d(com.google.android.gms.car.AudioFocusInfo audioFocusInfo, boolean z) {
        java.lang.Integer num;
        java.lang.String str;
        defpackage.yqm yqmVar = a;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1319);
        int i = audioFocusInfo.f;
        java.lang.String strF = defpackage.ere.f(i);
        defpackage.zke zkeVar = defpackage.zke.a;
        defpackage.zkf zkfVar = new defpackage.zkf(zkeVar, strF);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        defpackage.zkf zkfVar2 = new defpackage.zkf(zkeVar, boolValueOf);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(audioFocusInfo.b);
        java.lang.String str2 = audioFocusInfo.c;
        java.lang.String str3 = audioFocusInfo.d;
        yqjVar.T("Received onAudioFocusLoss. lossReceived: %s, wasNotified: %s, clientId: %s, packageName: %s, clientUid: %s", zkfVar, zkfVar2, str2, str3, numValueOf);
        if (e(audioFocusInfo)) {
            synchronized (this.e) {
                num = (java.lang.Integer) this.d.get(str2);
            }
            if (num == null) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(1324)).R("Unrecognized client receiving loss. lossReceived: %s, wasNotified: %b, clientId: %s", new defpackage.zkf(defpackage.zke.a, defpackage.ere.f(i)), boolValueOf, str2);
                return;
            }
            defpackage.yqj yqjVar2 = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1320);
            java.lang.String strF2 = defpackage.ere.f(num.intValue());
            defpackage.zke zkeVar2 = defpackage.zke.a;
            yqjVar2.S("Processing onAudioFocusLoss. currentGrant: %s, invalidateByCarAudioFocusChange: %b, lossReceived: %s, packageName: %s", new defpackage.zkf(zkeVar2, strF2), java.lang.Boolean.valueOf(this.i), new defpackage.zkf(zkeVar2, defpackage.ere.f(i)), str3);
            android.os.Handler handler = this.c;
            if (handler == null) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1323)).u("onExternalAppLoseAudioFocus: handler is null, not triggering callback.");
                str = str3;
            } else {
                str = str3;
                handler.post(new isx(this, i, str, audioFocusInfo, 0));
            }
            if (i == -3 || i == -2) {
                if (num.intValue() == 1) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1322)).M("Received transient loss for client with gain. Not removing client from focus stack and not sending focus change notification. clientId: %s, packageName: %s", str2, str);
                    return;
                }
            } else if (i != -1 && i != 0) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 1321)).y("Received unexpected loss: %s", defpackage.ere.f(i));
            }
            synchronized (this.e) {
                this.d.remove(str2);
            }
            f(20, false, audioFocusInfo.a, j$.util.Optional.empty());
        }
    }
}
