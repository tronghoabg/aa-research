package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tna {
    private static volatile defpackage.ret a;

    public static /* synthetic */ java.lang.String A(int i) {
        if (i != 3) {
            return i != 5 ? defpackage.a.bo(i, "unsupported-") : "tts";
        }
        return "media";
    }

    public static /* synthetic */ java.lang.String B(defpackage.xij xijVar) {
        if (xijVar == null) {
            return "null AudioFocusRequestType";
        }
        int iOrdinal = xijVar.ordinal();
        if (iOrdinal == 0) {
            return "AUDIO_FOCUS_GAIN";
        }
        if (iOrdinal == 1) {
            return "AUDIO_FOCUS_GAIN_TRANSIENT";
        }
        if (iOrdinal == 2) {
            return "AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK";
        }
        if (iOrdinal == 3) {
            return "AUDIO_FOCUS_RELEASE";
        }
        throw new java.lang.RuntimeException(null, null);
    }

    public static /* synthetic */ java.lang.String C(defpackage.xik xikVar) {
        switch (xikVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                return "AUDIO_FOCUS_STATE_INVALID";
            case 1:
                return "AUDIO_FOCUS_STATE_GAIN";
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return "AUDIO_FOCUS_STATE_GAIN_TRANSIENT";
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return "AUDIO_FOCUS_STATE_LOSS";
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return "AUDIO_FOCUS_STATE_LOSS_TRANSIENT_CAN_DUCK";
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return "AUDIO_FOCUS_STATE_LOSS_TRANSIENT";
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return "AUDIO_FOCUS_STATE_GAIN_MEDIA_ONLY";
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return "AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY";
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent D(xhz xhzVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(14, android.os.SystemClock.elapsedRealtimeNanos(), 3, 0);
        float[] fArr = carSensorEvent.d;
        int i = xhzVar.b;
        fArr[0] = (i & 1) != 0 ? xhzVar.c * 0.001f : Float.NaN;
        fArr[1] = (i & 2) != 0 ? xhzVar.d * 0.001f : Float.NaN;
        fArr[2] = (i & 4) != 0 ? xhzVar.e * 0.001f : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent E(xju xjuVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(1, android.os.SystemClock.elapsedRealtimeNanos(), 3, 0);
        float[] fArr = carSensorEvent.d;
        fArr[0] = xjuVar.c * 1.0E-6f;
        int i = xjuVar.b;
        fArr[1] = (i & 2) != 0 ? xjuVar.d * 1.0E-6f : Float.NaN;
        fArr[2] = (i & 4) != 0 ? xjuVar.e * 1.0E-6f : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent F(xkb xkbVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(15, android.os.SystemClock.elapsedRealtimeNanos(), xkbVar.d.size() + 1, 1);
        float[] fArr = carSensorEvent.d;
        int i = 0;
        fArr[0] = (xkbVar.b & 1) != 0 ? xkbVar.c * 0.1f : Float.NaN;
        carSensorEvent.e[0] = (byte) xkbVar.d.size();
        while (i < xkbVar.d.size()) {
            int i2 = i + 1;
            fArr[i2] = xkbVar.d.e(i) * 0.001f;
            i = i2;
        }
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent G(xkc xkcVar) {
        int iD = (xkcVar.b & 1) != 0 ? xkcVar.c.d() : -1;
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(8, android.os.SystemClock.elapsedRealtimeNanos(), 0, java.lang.Math.max(1, iD + 1));
        byte[] bArr = carSensorEvent.e;
        bArr[0] = (byte) iD;
        if ((xkcVar.b & 1) != 0) {
            java.lang.System.arraycopy(xkcVar.c.D(), 0, bArr, 1, xkcVar.c.d());
        }
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent H(xke xkeVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(16, android.os.SystemClock.elapsedRealtimeNanos(), 0, xkeVar.e.size() + 3);
        byte[] bArr = carSensorEvent.e;
        int i = xkeVar.b;
        bArr[0] = (i & 1) != 0 ? xkeVar.c ? (byte) 1 : (byte) 0 : (byte) -1;
        bArr[1] = (i & 2) != 0 ? xkeVar.d ? (byte) 1 : (byte) 0 : (byte) -1;
        bArr[2] = (byte) xkeVar.e.size();
        for (int i2 = 0; i2 < xkeVar.e.size(); i2++) {
            bArr[i2 + 3] = xkeVar.e.f(i2);
        }
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent I(xkh xkhVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(12, android.os.SystemClock.elapsedRealtimeNanos(), 2, 1);
        float[] fArr = carSensorEvent.d;
        int i = xkhVar.b;
        fArr[0] = (i & 1) != 0 ? xkhVar.c * 0.001f : Float.NaN;
        fArr[1] = (i & 2) != 0 ? xkhVar.d * 0.001f : Float.NaN;
        carSensorEvent.e[0] = (byte) ((i & 4) != 0 ? xkhVar.e : -1);
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent J(xkk xkkVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(5, android.os.SystemClock.elapsedRealtimeNanos(), 2, 1);
        float[] fArr = carSensorEvent.d;
        int i = xkkVar.b;
        fArr[0] = (i & 1) != 0 ? xkkVar.c : Float.NaN;
        byte b = 1;
        fArr[1] = (i & 2) != 0 ? xkkVar.d : Float.NaN;
        byte[] bArr = carSensorEvent.e;
        if ((i & 4) == 0) {
            b = -1;
        } else if (!xkkVar.e) {
            b = 0;
        }
        bArr[0] = b;
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent K(xkp xkpVar) {
        int iMin = java.lang.Math.min(xkpVar.d, xkpVar.e.size());
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(17, android.os.SystemClock.elapsedRealtimeNanos(), iMin * 4, iMin + 2);
        byte[] bArr = carSensorEvent.e;
        bArr[0] = (byte) xkpVar.c;
        bArr[1] = (byte) ((xkpVar.b & 2) != 0 ? xkpVar.d : 255);
        for (int i = 0; i < iMin; i++) {
            int i2 = i * 4;
            xko xkoVar = (xko) xkpVar.e.get(i);
            bArr[i + 2] = xkoVar.e;
            float[] fArr = carSensorEvent.d;
            fArr[i2] = xkoVar.c;
            fArr[i2 + 1] = xkoVar.d * 0.001f;
            int i3 = i2 + 2;
            int i4 = xkoVar.b;
            float f = Float.NaN;
            fArr[i3] = (i4 & 8) != 0 ? xkoVar.f * 0.001f : Float.NaN;
            int i5 = i2 + 3;
            if ((i4 & 16) != 0) {
                f = xkoVar.g * 0.001f;
            }
            fArr[i5] = f;
        }
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent L(xkq xkqVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(18, android.os.SystemClock.elapsedRealtimeNanos(), 3, 0);
        float[] fArr = carSensorEvent.d;
        int i = xkqVar.b;
        fArr[0] = (i & 1) != 0 ? xkqVar.c * 0.001f : Float.NaN;
        fArr[1] = (i & 2) != 0 ? xkqVar.d * 0.001f : Float.NaN;
        fArr[2] = (i & 4) != 0 ? xkqVar.e * 0.001f : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent M(xks xksVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(13, android.os.SystemClock.elapsedRealtimeNanos(), 2, 0);
        float[] fArr = carSensorEvent.d;
        int i = xksVar.b;
        fArr[0] = (i & 1) != 0 ? xksVar.c * 0.001f : Float.NaN;
        fArr[1] = (i & 2) != 0 ? xksVar.d * 0.001f : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent N(xlh xlhVar) {
        int iAq;
        int iAq2;
        byte b = 0;
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(19, android.os.SystemClock.elapsedRealtimeNanos(), 0, 3);
        byte[] bArr = carSensorEvent.e;
        int i = xlhVar.b;
        if ((i & 1) != 0) {
            iAq = defpackage.a.aq(xlhVar.c);
            if (iAq == 0) {
                iAq = 1;
            }
        } else {
            iAq = 0;
        }
        bArr[0] = (byte) iAq;
        if ((i & 2) != 0) {
            iAq2 = defpackage.a.aq(xlhVar.d);
            if (iAq2 == 0) {
                iAq2 = 1;
            }
        } else {
            iAq2 = 0;
        }
        bArr[1] = (byte) iAq2;
        if ((i & 4) == 0) {
            b = -1;
        } else if (xlhVar.e) {
            b = 1;
        }
        bArr[2] = b;
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent O(xli xliVar) {
        int i;
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(10, android.os.SystemClock.elapsedRealtimeNanos(), 6, 9);
        float[] fArr = carSensorEvent.d;
        int i2 = xliVar.c;
        fArr[0] = i2 * 1.0E-7f;
        fArr[1] = xliVar.d * 1.0E-7f;
        int i3 = xliVar.b;
        if ((i3 & 8) != 0) {
            fArr[2] = xliVar.e * 0.001f;
            i = 7;
        } else {
            i = 3;
        }
        if ((i3 & 16) != 0) {
            fArr[3] = xliVar.f * 0.01f;
            i |= 8;
        }
        if ((i3 & 32) != 0) {
            fArr[4] = xliVar.g * 0.001f;
            i |= 16;
        }
        if ((i3 & 64) != 0) {
            fArr[5] = xliVar.h * 1.0E-6f;
            i |= 32;
        }
        byte[] bArr = carSensorEvent.e;
        bArr[0] = (byte) i;
        com.google.android.gms.car.CarSensorEvent.d(bArr, 1, i2);
        com.google.android.gms.car.CarSensorEvent.d(bArr, 5, xliVar.d);
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent P(xmu xmuVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(9, android.os.SystemClock.elapsedRealtimeNanos(), 0, 1);
        byte[] bArr = carSensorEvent.e;
        byte b = 1;
        if ((xmuVar.b & 1) == 0) {
            b = -1;
        } else if (!xmuVar.c) {
            b = 0;
        }
        bArr[0] = b;
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent Q(xmv xmvVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(4, android.os.SystemClock.elapsedRealtimeNanos(), 2, 0);
        float[] fArr = carSensorEvent.d;
        fArr[0] = xmvVar.c * 0.1f;
        fArr[1] = (xmvVar.b & 2) != 0 ? xmvVar.d * 0.1f : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent R(xna xnaVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(20, android.os.SystemClock.elapsedRealtimeNanos(), 0, 1);
        byte[] bArr = carSensorEvent.e;
        byte b = 1;
        if ((xnaVar.b & 1) == 0) {
            b = -1;
        } else if (!xnaVar.c) {
            b = 0;
        }
        bArr[0] = b;
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent S(xph xphVar) {
        byte b;
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(2, android.os.SystemClock.elapsedRealtimeNanos(), 2, 1);
        float[] fArr = carSensorEvent.d;
        fArr[0] = xphVar.c * 0.001f;
        byte[] bArr = carSensorEvent.e;
        int i = xphVar.b;
        if ((i & 2) != 0) {
            b = xphVar.d ? (byte) 1 : (byte) 0;
        } else {
            b = -1;
        }
        bArr[0] = b;
        fArr[1] = (i & 4) != 0 ? xphVar.e : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ com.google.android.gms.car.CarSensorEvent T(xpk xpkVar) {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(21, android.os.SystemClock.elapsedRealtimeNanos(), xpkVar.b.size(), 1);
        carSensorEvent.e[0] = (byte) xpkVar.b.size();
        for (int i = 0; i < xpkVar.b.size(); i++) {
            carSensorEvent.d[i] = xpkVar.b.e(i) * 0.01f;
        }
        return carSensorEvent;
    }

    public static /* synthetic */ int U(int i, int i2, com.google.android.gms.car.CarAudioConfiguration[] carAudioConfigurationArr) {
        for (int i3 = 0; i3 < carAudioConfigurationArr.length; i3++) {
            com.google.android.gms.car.CarAudioConfiguration carAudioConfiguration = carAudioConfigurationArr[i3];
            if (carAudioConfiguration.a == i && carAudioConfiguration.b == i2 && carAudioConfiguration.c == 2) {
                return i3;
            }
        }
        return -1;
    }

    public static /* synthetic */ defpackage.ous V(defpackage.xlk xlkVar) {
        int iOrdinal = xlkVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.ous.PCM;
        }
        if (iOrdinal == 1) {
            return defpackage.ous.AAC_LC;
        }
        if (iOrdinal == 3) {
            return defpackage.ous.AAC_LC_ADTS;
        }
        throw new java.lang.IllegalArgumentException("Invalid mediaCodecType: ".concat(java.lang.String.valueOf(xlkVar.name())));
    }

    public static /* synthetic */ defpackage.ove W(int i) {
        if (i == 0) {
            return defpackage.ove.TELEPHONY;
        }
        if (i == 1) {
            return defpackage.ove.SYSTEM_AUDIO;
        }
        if (i == 3) {
            return defpackage.ove.MEDIA;
        }
        if (i == 5) {
            return defpackage.ove.GUIDANCE;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Invalid streamType: "));
    }

    public static /* synthetic */ defpackage.zbe X(defpackage.ove oveVar) {
        int iOrdinal = oveVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.zbe.AUDIO_STREAM_DIAGNOSTICS_AUDIO_STREAM_TYPE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return defpackage.zbe.AUDIO_STREAM_DIAGNOSTICS_GUIDANCE;
        }
        if (iOrdinal == 2) {
            return defpackage.zbe.AUDIO_STREAM_DIAGNOSTICS_SYSTEM_AUDIO;
        }
        if (iOrdinal == 3) {
            return defpackage.zbe.AUDIO_STREAM_DIAGNOSTICS_MEDIA;
        }
        if (iOrdinal == 4) {
            return defpackage.zbe.AUDIO_STREAM_DIAGNOSTICS_TELEPHONY;
        }
        throw new java.lang.RuntimeException(null, null);
    }

    public static /* synthetic */ java.lang.String Y(int i) {
        if (i == 0) {
            return "VOICE";
        }
        if (i == 1) {
            return "SYSTEM";
        }
        if (i != 3) {
            return i != 5 ? "UNKNOWN" : "TTS";
        }
        return "MEDIA";
    }

    public static /* synthetic */ java.lang.String Z(defpackage.xig xigVar) {
        int i;
        int i2;
        int i3 = xigVar.b;
        if ((i3 & 1) == 0 || !((i = xigVar.c) == 48000 || i == 16000)) {
            return "wrong sampling rate " + xigVar.c;
        }
        if ((i3 & 2) == 0 || xigVar.d != 16) {
            return "wrong number of bits " + xigVar.d;
        }
        if ((i3 & 4) != 0 && ((i2 = xigVar.e) == 2 || i2 == 1)) {
            return null;
        }
        return "wrong number of channels " + xigVar.e;
    }

    public static long a(defpackage.tmy tmyVar, long j) {
        return (j - tmyVar.a()) + tmyVar.f().toEpochMilli();
    }

    public static /* synthetic */ java.lang.CharSequence aA(defpackage.bys bysVar) {
        return (java.lang.CharSequence) bysVar.a();
    }

    public static /* synthetic */ void aB(defpackage.bve bveVar, int i) {
        if (bveVar.I((i & 17) != 16, i & 1)) {
            return;
        }
        bveVar.s();
    }

    public static /* synthetic */ lok aC(los losVar) {
        if (losVar instanceof lok) {
            return (lok) losVar;
        }
        return null;
    }

    public static /* synthetic */ boolean aE(defpackage.mqj mqjVar) {
        return mqjVar.b == defpackage.mqg.NAVIGATION;
    }

    public static /* synthetic */ defpackage.afbk aF(defpackage.affg affgVar, defpackage.acb acbVar, defpackage.bve bveVar, int i) {
        acbVar.getClass();
        if (bveVar.I((i & 17) != 16, i & 1)) {
            affgVar.invoke(bveVar, 0);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public static /* synthetic */ boolean aG(defpackage.mqj mqjVar) {
        return mqjVar.b == defpackage.mqg.MEDIA;
    }

    public static /* synthetic */ void aH(java.io.PrintWriter printWriter, java.lang.String str, int i, boolean z) {
        if (i > str.length()) {
            java.lang.String str2 = true != z ? "%1$-" : "%1$";
            str = java.lang.String.format(java.util.Locale.US, str2 + i + "s", str);
        }
        printWriter.print(str);
    }

    public static /* synthetic */ void aI(android.telephony.SmsMessage[] smsMessageArr, java.util.List list) {
        try {
            for (android.telephony.SmsMessage smsMessage : smsMessageArr) {
                list.add(smsMessage.getPdu());
            }
        } catch (java.lang.NullPointerException e) {
            throw new java.lang.RuntimeException("NPE when trying to extract PDUs to list. If this error is appearing in tests, please double check that the 'sender address' is a valid phone number when creating SmsMessages. An example valid phone number is '16501231234'.", e);
        }
    }

    public static /* synthetic */ lok aJ(los losVar) {
        return (lok) defpackage.lot.b(losVar, lok.class);
    }

    public static /* synthetic */ long aK(float f, float f2) {
        return (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public static /* synthetic */ boolean aL(defpackage.aqk aqkVar) {
        if (aqkVar instanceof defpackage.all) {
            return ((defpackage.all) aqkVar).b() != Integer.MAX_VALUE;
        }
        return ((aqkVar instanceof defpackage.axx) && ((defpackage.axx) aqkVar).l().m == 0) ? false : true;
    }

    public static /* synthetic */ defpackage.afbk aM(defpackage.atr atrVar, defpackage.bve bveVar, int i) {
        atrVar.getClass();
        if (!bveVar.I((i & 17) != 16, i & 1)) {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public static /* synthetic */ defpackage.afbk aN(defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        if (bveVar.I((i & 3) != 2, i & 1)) {
            affgVar.invoke(bveVar, 0);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public static /* synthetic */ boolean aO(androidx.car.app.messaging.model.CarMessage carMessage) {
        return !carMessage.isRead();
    }

    public static /* synthetic */ boolean aP(defpackage.cit citVar, gjg gjgVar) {
        gjgVar.getClass();
        if (gjgVar == gjg.c) {
            return citVar.a(7);
        }
        return false;
    }

    public static /* synthetic */ android.content.Context aQ(android.content.Context context, java.lang.String str) {
        try {
            return context.createPackageContext(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Failed to find package: %s", str), e);
        }
    }

    public static /* synthetic */ defpackage.jdc aR() {
        throw new java.lang.UnsupportedOperationException("Filters are not enabled in lite");
    }

    public static /* synthetic */ java.lang.IllegalStateException aS(android.os.RemoteException remoteException) {
        return new java.lang.IllegalStateException("Unexpected RemoteException of type " + java.lang.String.valueOf(remoteException.getClass()) + " with message: " + remoteException.getMessage(), remoteException);
    }

    public static /* synthetic */ defpackage.afbk aT(defpackage.cux cuxVar, defpackage.cuw cuwVar) {
        cuwVar.getClass();
        cuwVar.r(cuxVar, 0, 0, 0.0f);
        return defpackage.afbk.a;
    }

    public static /* synthetic */ boolean aU(defpackage.cit citVar, gjg gjgVar) {
        gjgVar.getClass();
        if (gjgVar != gjg.b) {
            return false;
        }
        citVar.a(7);
        return true;
    }

    public static /* synthetic */ boolean aV(defpackage.cit citVar, gjg gjgVar) {
        gjgVar.getClass();
        if (gjgVar == gjg.b) {
            return citVar.a(7);
        }
        return false;
    }

    public static /* synthetic */ boolean aW(defpackage.cit citVar, gjg gjgVar) {
        gjgVar.getClass();
        if (gjgVar == gjg.a) {
            return citVar.a(7);
        }
        return false;
    }

    public static /* synthetic */ void aX(hlu hluVar) {
        if (hluVar.getLifecycle().a() == defpackage.epx.e) {
            hluVar.A();
        }
        if (hluVar.getLifecycle().a() == defpackage.epx.d) {
            hluVar.n();
        }
        if (hluVar.getLifecycle().a() == defpackage.epx.c) {
            hluVar.b();
        }
    }

    public static /* synthetic */ boolean aY(ggq ggqVar) {
        ggqVar.getClass();
        return ggqVar.f();
    }

    public static /* synthetic */ defpackage.afbk aZ(defpackage.cit citVar, defpackage.chw chwVar) {
        chwVar.getClass();
        int i = chwVar.a;
        if (defpackage.a.X(i, 5) || defpackage.a.X(i, 3)) {
            citVar.a(7);
        }
        return defpackage.afbk.a;
    }

    public static /* synthetic */ byte[] aa(defpackage.abpy abpyVar) {
        byte[] bArrH = abpyVar.h();
        defpackage.ysr.aX(bArrH.length <= (android.os.Build.VERSION.SDK_INT >= 30 ? bgp$.ExternalSyntheticApiModelOutline0.m$9() : 65536));
        return bArrH;
    }

    public static /* synthetic */ boolean ab(defpackage.xik xikVar, defpackage.xij xijVar) {
        int iOrdinal = xijVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                if (xikVar == defpackage.xik.AUDIO_FOCUS_STATE_GAIN_TRANSIENT || xikVar == defpackage.xik.AUDIO_FOCUS_STATE_GAIN || xikVar == defpackage.xik.AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY) {
                    return false;
                }
            } else if (iOrdinal == 3 && (xikVar == defpackage.xik.AUDIO_FOCUS_STATE_LOSS || xikVar == defpackage.xik.AUDIO_FOCUS_STATE_LOSS_TRANSIENT)) {
                return false;
            }
        } else if (xikVar == defpackage.xik.AUDIO_FOCUS_STATE_GAIN) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ int ac(int i, int i2) {
        return (i2 == -99999 || i < i2) ? i : i2;
    }

    public static /* synthetic */ int ad(int i, int i2) {
        return (i2 == -99999 || i > i2) ? i : i2;
    }

    public static /* synthetic */ defpackage.ovi ae(int i) {
        if (i == 0) {
            return defpackage.ovi.NONE;
        }
        if (i == 1) {
            return defpackage.ovi.FOCUS_GAIN;
        }
        if (i == 2) {
            return defpackage.ovi.FOCUS_LOSS;
        }
        if (i == 3) {
            return defpackage.ovi.BOTTOM_HALF_SWITCH;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bo(i, "Invalid focusChangeCommand "));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static /* synthetic */ nvf af(nvf nvfVar, boolean z) {
        if (defpackage.acul.r()) {
            if (!z || nvfVar.f <= nvf.c.f) {
                z = false;
            } else {
                z = true;
            }
        } else if (defpackage.acul.s()) {
            if (!z || nvfVar.f <= nvf.b.f) {
                z = false;
            } else {
                z = true;
            }
        }
        return z ? nvf.d : nvf.c;
    }

    public static /* synthetic */ boolean ah() {
        com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition;
        return java.lang.Boolean.TRUE.equals(defpackage.mak.e().b().e()) && (navigationCurrentPosition = (com.google.android.gms.car.navigation.NavigationCurrentPosition) defpackage.mak.e().b.e()) != null && !navigationCurrentPosition.a().isEmpty() && ((com.google.android.gms.car.navigation.DestinationDistance) navigationCurrentPosition.a().get(0)).c > 0;
    }

    public static /* synthetic */ boolean ai(java.lang.String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!java.lang.Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt);
        }
        return true;
    }

    public static /* synthetic */ boolean aj(java.lang.String str) {
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!java.lang.Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt);
        }
        return true;
    }

    public static /* synthetic */ boolean al(int i, int i2, int i3) {
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static /* synthetic */ java.util.List aq(defpackage.bys bysVar) {
        return (java.util.List) bysVar.a();
    }

    public static /* synthetic */ android.content.ComponentName av(android.content.pm.ResolveInfo resolveInfo) {
        if (resolveInfo.serviceInfo != null) {
            android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            return new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (resolveInfo.activityInfo == null) {
            return null;
        }
        android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
        return new android.content.ComponentName(activityInfo.packageName, activityInfo.name);
    }

    public static /* synthetic */ defpackage.afbk aw(com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) throws defpackage.qst {
        defpackage.mkp.a.g();
        defpackage.oml.f(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a, projectionWindowAnimationChoreography);
        return defpackage.afbk.a;
    }

    public static /* synthetic */ defpackage.afbk ax(defpackage.bve bveVar, int i) {
        if (!bveVar.I((i & 3) != 2, i & 1)) {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public static /* synthetic */ kkl ay(defpackage.bys bysVar) {
        return (kkl) bysVar.a();
    }

    public static /* synthetic */ defpackage.afbk az(defpackage.cim cimVar) {
        cimVar.getClass();
        cimVar.a(false);
        return defpackage.afbk.a;
    }

    public static final defpackage.abnv b(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        if (!bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
            throw new java.lang.IllegalStateException("Could not encode Bitmap");
        }
        defpackage.abnv abnvVarV = defpackage.abnv.v(byteArrayOutputStream.toByteArray());
        abnvVarV.getClass();
        return abnvVarV;
    }

    public static /* synthetic */ void ba(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (byte b : bArr) {
            for (int i = 0; i < 48; i++) {
                int i2 = bArr2[i] & 255;
                bArr2[i] = (byte) (((((i2 >> 7) | (i2 + i2)) + 33) ^ bArr3[i % bArr3.length]) ^ b);
            }
        }
    }

    public static /* synthetic */ defpackage.zbe bb(int i) {
        if (i == 3) {
            return defpackage.zbe.AUDIO_GLITCH_MEDIA;
        }
        if (i == 1) {
            return defpackage.zbe.AUDIO_GLITCH_GUIDANCE;
        }
        if (i == 2 || i == 4) {
            return null;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("streamType %s is not a known stream type", "AUDIO_STREAM_MEDIA"));
    }

    public static /* synthetic */ int bc(int i) {
        int i2 = 1;
        if (i == 1) {
            return 5;
        }
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                return 0;
            }
        }
        return i2;
    }

    public static /* synthetic */ defpackage.ove bd(int i) {
        if (i == 1) {
            return defpackage.ove.GUIDANCE;
        }
        if (i != 2) {
            return i != 3 ? defpackage.ove.TELEPHONY : defpackage.ove.MEDIA;
        }
        return defpackage.ove.SYSTEM_AUDIO;
    }

    public static /* synthetic */ int be(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Unsupported stream type "));
    }

    public static void bf(java.lang.RuntimeException runtimeException, syw sywVar, java.lang.String str) {
        defpackage.qof qofVar = sywVar.a;
        if (qofVar != defpackage.qof.STARTUP && qofVar != defpackage.qof.TELEDOCTOR) {
            throw runtimeException;
        }
        try {
            android.util.Log.e("ExceptionUtil", defpackage.a.bA(str, "RuntimeException while safely performing function: "), runtimeException);
        } catch (java.lang.RuntimeException unused) {
        }
    }

    public static defpackage.zhs bg(java.util.concurrent.Callable callable) {
        zht zhtVar = new zht(callable);
        new java.lang.Thread((java.lang.Runnable) zhtVar).start();
        return zhtVar;
    }

    public static ywl bh(android.content.Context context) {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> arrayList;
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> arrayList2;
        defpackage.abor aborVarN = ywl.a.n();
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            arrayList = accessibilityManager.getInstalledAccessibilityServiceList();
        } catch (java.lang.NullPointerException unused) {
            arrayList = new java.util.ArrayList<>();
        }
        if (arrayList != null) {
            for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : arrayList) {
                if (accessibilityServiceInfo != null) {
                    bm(accessibilityServiceInfo.getId(), aborVarN, 3);
                }
            }
        }
        try {
            arrayList2 = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } catch (java.lang.NullPointerException unused2) {
            arrayList2 = new java.util.ArrayList<>();
        }
        if (arrayList2 != null) {
            for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo2 : arrayList2) {
                if (accessibilityServiceInfo2 != null) {
                    bm(accessibilityServiceInfo2.getId(), aborVarN, 2);
                }
            }
        }
        try {
            int iBl = bl(android.provider.Settings.System.getFloat(contentResolver, "font_scale") > 1.0f);
            aborVarN.t();
            ywl ywlVar = aborVarN.b;
            ywlVar.g = iBl - 1;
            ywlVar.b |= 16;
        } catch (android.provider.Settings.SettingNotFoundException unused3) {
        }
        try {
            int iBl2 = bl(android.provider.Settings.Secure.getInt(contentResolver, "accessibility_display_magnification_enabled") == 1);
            aborVarN.t();
            ywl ywlVar2 = aborVarN.b;
            ywlVar2.h = iBl2 - 1;
            ywlVar2.b |= 32;
        } catch (android.provider.Settings.SettingNotFoundException unused4) {
        }
        try {
            int iBl3 = bl(android.provider.Settings.Secure.getInt(contentResolver, "high_text_contrast_enabled") == 1);
            aborVarN.t();
            ywl ywlVar3 = aborVarN.b;
            ywlVar3.i = iBl3 - 1;
            ywlVar3.b |= 64;
        } catch (android.provider.Settings.SettingNotFoundException unused5) {
        }
        return aborVarN.q();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: syb */
    public static final java.lang.String bi(android.content.ContentResolver contentResolver, android.net.Uri uri) throws syb {
        android.net.Uri uri2;
        java.lang.String string;
        android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new syb("Unable to acquire ContentProviderClient from ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
            }
            try {
                uri2 = uri;
                try {
                    android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri2, new java.lang.String[]{"value"}, "name=?", new java.lang.String[]{"maps_client_id"}, null);
                    try {
                        if (cursorQuery == null) {
                            throw new syb("ContentProvider query returned null cursor for key maps_client_id from " + java.lang.String.valueOf(uri2));
                        }
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(0);
                            cursorQuery.close();
                        } else {
                            cursorQuery.close();
                            string = null;
                        }
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return string;
                    } catch (java.lang.Throwable th) {
                        if (cursorQuery == null) {
                            throw th;
                        }
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (android.database.SQLException e) {
                    e = e;
                    throw new syb("ContentProvider query failed for key maps_client_id from " + java.lang.String.valueOf(uri2), e);
                } catch (android.os.RemoteException e2) {
                    e = e2;
                    throw new syb("ContentProvider query failed for key maps_client_id from " + java.lang.String.valueOf(uri2), e);
                }
            } catch (android.database.SQLException | android.os.RemoteException e3) {
                e = e3;
                uri2 = uri;
            }
        } catch (java.lang.Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    public static synchronized defpackage.ret bj(android.content.Context context) {
        defpackage.ngb ngbVar;
        ngbVar = new defpackage.ngb(java.util.Collections.singletonList(new defpackage.wfv(new defpackage.rkq(context))));
        defpackage.sqs sqsVar = defpackage.stp.a;
        return bk(ngbVar, defpackage.sqs.h(4));
    }

    public static synchronized defpackage.ret bk(defpackage.ngb ngbVar, java.util.concurrent.Executor executor) {
        if (a == null) {
            defpackage.whz whzVar = defpackage.whz.a;
            java.util.HashMap map = new java.util.HashMap();
            defpackage.sqs.bF(defpackage.whq.a, map);
            a = new defpackage.ret(executor, ngbVar, whzVar, map);
        }
        return a;
    }

    private static int bl(boolean z) {
        return z ? 2 : 3;
    }

    private static void bm(java.lang.String str, defpackage.abor aborVar, int i) {
        if (str.startsWith("com.google.") || str.startsWith("com.googlecode.")) {
            if (str.endsWith("TalkBackService")) {
                aborVar.t();
                ywl ywlVar = aborVar.b;
                ywl ywlVar2 = ywl.a;
                ywlVar.c = i - 1;
                ywlVar.b |= 1;
                return;
            }
            if (str.endsWith("BrailleBackService")) {
                aborVar.t();
                ywl ywlVar3 = aborVar.b;
                ywl ywlVar4 = ywl.a;
                ywlVar3.d = i - 1;
                ywlVar3.b |= 2;
                return;
            }
            if (str.endsWith("SwitchAccessService") || str.endsWith("SwitchControlService")) {
                aborVar.t();
                ywl ywlVar5 = aborVar.b;
                ywl ywlVar6 = ywl.a;
                ywlVar5.e = i - 1;
                ywlVar5.b |= 4;
                return;
            }
            if (str.endsWith("JustSpeakService") || str.endsWith("VoiceAccessService")) {
                aborVar.t();
                ywl ywlVar7 = aborVar.b;
                ywl ywlVar8 = ywl.a;
                ywlVar7.f = i - 1;
                ywlVar7.b |= 8;
            }
        }
    }

    public static final defpackage.abnv c(android.graphics.drawable.Drawable drawable, int i) {
        return b(dtp.e(drawable, i, i, 4));
    }

    public static final tmw d(tmu tmuVar) {
        defpackage.abor aborVarN = tmw.a.n();
        aborVarN.getClass();
        aborVarN.t();
        tmw tmwVar = aborVarN.b;
        tmwVar.b |= 1;
        tmwVar.c = tmuVar.a;
        android.graphics.drawable.Drawable drawable = tmuVar.b;
        defpackage.abnv abnvVarC = drawable != null ? c(drawable, 64) : null;
        if (abnvVarC != null) {
            aborVarN.t();
            tmw tmwVar2 = aborVarN.b;
            tmwVar2.b |= 2;
            tmwVar2.d = abnvVarC;
        }
        tmw tmwVarN = aborVarN.q();
        tmwVarN.getClass();
        return tmwVarN;
    }

    public static final androidx.car.app.model.CarIcon e(android.graphics.Bitmap bitmap) {
        return new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.k(bitmap)));
    }

    public static final uo f(tme tmeVar) {
        uo uoVar = new uo();
        uoVar.g(tmeVar.c);
        tb tbVar = new tb();
        android.graphics.drawable.Drawable drawable = tmeVar.d;
        if (drawable.getIntrinsicHeight() <= 0 || drawable.getIntrinsicWidth() <= 0) {
            throw new java.lang.IllegalStateException("Can only use drawables with defined intrinsic height and width");
        }
        tbVar.c(e(dtp.e(drawable, 0, 0, 7)));
        uoVar.e(tbVar.a());
        return uoVar;
    }

    public static final /* synthetic */ tmg g(defpackage.abor aborVar) {
        tmg tmgVarN = aborVar.q();
        tmgVarN.getClass();
        return tmgVarN;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.Object h(android.os.Looper looper, defpackage.xzi xziVar) {
        if (android.os.Looper.myLooper() == looper) {
            return xziVar.fF();
        }
        android.os.Handler handler = new android.os.Handler(looper);
        tlm tlmVar = new tlm(xziVar);
        handler.post(tlmVar);
        synchronized (tlmVar) {
            while (!tlmVar.a) {
                try {
                    tlmVar.wait();
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
        defpackage.ysr.bk(tlmVar.a, "SyncRunnable not complete");
        return tlmVar.b;
    }

    public static void i(java.lang.Runnable runnable) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(runnable);
    }

    public static void j(java.lang.Runnable runnable) {
        h(android.os.Looper.getMainLooper(), new qfz(runnable, 4));
    }

    public static final boolean k(android.net.Uri uri) {
        uri.getClass();
        return defpackage.afga.f(uri.getScheme(), "android.resource");
    }

    public static final boolean l(android.net.Uri uri) {
        java.lang.String path;
        return (uri == null || !k(uri) || (path = uri.getPath()) == null || afzh.u(path, "station_icon_fallback", false)) ? false : true;
    }

    public static androidx.core.graphics.drawable.IconCompat m(defpackage.tkv tkvVar, android.net.Uri uri) {
        return tkvVar.b(tkvVar.d(uri));
    }

    public static final /* synthetic */ tak n(defpackage.abor aborVar) {
        tak takVarN = aborVar.q();
        takVarN.getClass();
        return takVarN;
    }

    public static final void o(tca tcaVar, defpackage.abor aborVar) {
        aborVar.t();
        tak takVar = aborVar.b;
        tak takVar2 = tak.a;
        takVar.e = tcaVar;
        takVar.b |= 4;
    }

    public static final void p(tbi tbiVar, defpackage.abor aborVar) {
        aborVar.t();
        tak takVar = aborVar.b;
        tak takVar2 = tak.a;
        takVar.d = tbiVar;
        takVar.b |= 2;
    }

    public static final void q(defpackage.abor aborVar) {
        aborVar.t();
        tak takVar = aborVar.b;
        tak takVar2 = tak.a;
        takVar.b |= 1;
        takVar.c = true;
    }

    public static final void r(defpackage.abor aborVar) {
        aborVar.t();
        tak takVar = aborVar.b;
        tak takVar2 = tak.a;
        takVar.b |= 8;
        takVar.f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static /* synthetic */ void s(android.content.Intent intent, qon qonVar) {
        int i;
        switch (qonVar.e) {
            case defpackage.abnt.b /* 0 */:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                i = 4;
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                i = 5;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                i = 6;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                i = 7;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                i = 8;
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                i = 9;
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            i = 1;
        }
        switch (i - 2) {
            case defpackage.abnt.b /* 0 */:
                throw new java.lang.IllegalArgumentException("Can't assign unknown extra");
            case 1:
                intent.putExtra(qonVar.d, qonVar.b == 3 ? (java.lang.String) qonVar.c : "");
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                intent.putExtra(qonVar.d, (byte) (qonVar.b == 4 ? ((java.lang.Integer) qonVar.c).intValue() : 0));
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                intent.putExtra(qonVar.d, (short) (qonVar.b == 5 ? ((java.lang.Integer) qonVar.c).intValue() : 0));
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                intent.putExtra(qonVar.d, qonVar.b == 6 ? ((java.lang.Integer) qonVar.c).intValue() : 0);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                intent.putExtra(qonVar.d, qonVar.b == 7 ? ((java.lang.Long) qonVar.c).longValue() : 0L);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                intent.putExtra(qonVar.d, qonVar.b == 8 ? ((java.lang.Float) qonVar.c).floatValue() : 0.0f);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                intent.putExtra(qonVar.d, qonVar.b == 9 ? ((java.lang.Double) qonVar.c).doubleValue() : 0.0d);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                intent.putExtra(qonVar.d, qonVar.b == 10 ? ((java.lang.Boolean) qonVar.c).booleanValue() : false);
                return;
            case 9:
                java.lang.String[] strArr = new java.lang.String[qonVar.f.size()];
                for (int i2 = 0; i2 < qonVar.f.size(); i2++) {
                    strArr[i2] = (java.lang.String) qonVar.f.get(i2);
                }
                intent.putExtra(qonVar.d, strArr);
                return;
            case 10:
                byte[] bArr = new byte[qonVar.g.size()];
                for (int i3 = 0; i3 < qonVar.g.size(); i3++) {
                    bArr[i3] = (byte) qonVar.g.e(i3);
                }
                intent.putExtra(qonVar.d, bArr);
                return;
            case 11:
                short[] sArr = new short[qonVar.h.size()];
                for (int i4 = 0; i4 < qonVar.h.size(); i4++) {
                    sArr[i4] = (short) qonVar.h.e(i4);
                }
                intent.putExtra(qonVar.d, sArr);
                return;
            case 12:
                int[] iArr = new int[qonVar.i.size()];
                for (int i5 = 0; i5 < qonVar.i.size(); i5++) {
                    iArr[i5] = qonVar.i.e(i5);
                }
                intent.putExtra(qonVar.d, iArr);
                return;
            case 13:
                long[] jArr = new long[qonVar.j.size()];
                for (int i6 = 0; i6 < qonVar.j.size(); i6++) {
                    jArr[i6] = qonVar.j.a(i6);
                }
                intent.putExtra(qonVar.d, jArr);
                return;
            case 14:
                float[] fArr = new float[qonVar.k.size()];
                for (int i7 = 0; i7 < qonVar.k.size(); i7++) {
                    fArr[i7] = qonVar.k.e(i7);
                }
                intent.putExtra(qonVar.d, fArr);
                return;
            case 15:
                double[] dArr = new double[qonVar.l.size()];
                for (int i8 = 0; i8 < qonVar.l.size(); i8++) {
                    dArr[i8] = qonVar.l.e(i8);
                }
                intent.putExtra(qonVar.d, dArr);
                return;
            case 16:
                boolean[] zArr = new boolean[qonVar.m.size()];
                for (int i9 = 0; i9 < qonVar.m.size(); i9++) {
                    zArr[i9] = qonVar.m.f(i9);
                }
                intent.putExtra(qonVar.d, zArr);
                return;
            default:
                throw new java.lang.IllegalArgumentException("Unrecognized extra type");
        }
    }

    public static /* synthetic */ void t(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static /* synthetic */ java.lang.String u(java.lang.String str) {
        if (str == null) {
            return "";
        }
        return (str.startsWith("\"") && str.endsWith("\"") && str.length() > 1) ? str.substring(1, str.length() - 1) : str;
    }

    public static /* synthetic */ boolean v(android.content.Context context, android.content.ComponentName componentName, long j) {
        try {
            long jM = hh$.ExternalSyntheticApiModelOutline0.m(context.getPackageManager().getPackageInfo(componentName.getPackageName(), 0));
            if ("com.google.android.projection.gearhead".equals(componentName.getPackageName())) {
                return defpackage.rzy.INSTANCE.compare(java.lang.Long.valueOf(jM), java.lang.Long.valueOf(j)) >= 0;
            }
            if (jM >= j) {
                return true;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static /* synthetic */ void w(android.content.DialogInterface dialogInterface) {
        android.view.View viewFindViewById = ((defpackage.wnb) dialogInterface).findViewById(2131427998);
        viewFindViewById.getClass();
        com.google.android.material.bottomsheet.BottomSheetBehavior.B(viewFindViewById).J(3);
    }

    public static /* synthetic */ java.security.PrivateKey x(byte[] bArr) {
        int length = bArr.length - 54;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 28, bArr2, 0, length);
        return java.security.KeyFactory.getInstance("RSA").generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(android.util.Base64.decode(bArr2, 2)));
    }

    public static /* synthetic */ java.lang.String y(defpackage.xlk xlkVar) {
        if (xlkVar == null) {
            return "UNKNOWN";
        }
        switch (xlkVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                return "PCM";
            case 1:
                return "AAC";
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return "H264";
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return "AAC-ADTS";
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return "VP9";
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return "AV1";
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return "H265";
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }

    public static /* synthetic */ defpackage.rmh z(defpackage.rsi rsiVar) {
        int iOrdinal = rsiVar.ordinal();
        if (iOrdinal == 1) {
            if (defpackage.rmf.a == null) {
                defpackage.rmf.a = new defpackage.rmf();
            }
            return defpackage.rmf.a;
        }
        if (iOrdinal == 2) {
            if (defpackage.rml.a == null) {
                defpackage.rml.a = new defpackage.rml();
            }
            return defpackage.rml.a;
        }
        if (iOrdinal == 3) {
            return defpackage.rme.a(defpackage.rsi.AUDIO_SINK_GUIDANCE);
        }
        if (iOrdinal == 5) {
            return defpackage.rme.a(defpackage.rsi.AUDIO_SINK_MEDIA);
        }
        if (iOrdinal == 7) {
            if (defpackage.rmk.a == null) {
                defpackage.rmk.a = new defpackage.rmk();
            }
            return defpackage.rmk.a;
        }
        if (iOrdinal != 8) {
            if (defpackage.rmg.a == null) {
                defpackage.rmg.a = new defpackage.rmg(rsiVar);
            }
            return defpackage.rmg.a;
        }
        if (defpackage.rmi.a == null) {
            defpackage.rmi.a = new defpackage.rmi();
        }
        return defpackage.rmi.a;
    }
}
