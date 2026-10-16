package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.SQLException;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.car.app.messaging.model.CarMessage;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.gms.car.CarAudioConfiguration;
import com.google.android.gms.car.CarSensorEvent;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.navigation.DestinationDistance;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class roc {
    static Boolean a;
    private static Boolean b;
    private static volatile Object c;

    public roc(byte[] bArr, byte[] bArr2) {
        new AtomicReference();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarSensorEvent A(xjo xjoVar) {
        int iMin = Math.min(xjoVar.d, xjoVar.e.size());
        CarSensorEvent carSensorEvent = new CarSensorEvent(17, SystemClock.elapsedRealtimeNanos(), iMin * 4, iMin + 2);
        byte[] bArr = carSensorEvent.e;
        bArr[0] = (byte) xjoVar.c;
        bArr[1] = (byte) ((xjoVar.b & 2) != 0 ? xjoVar.d : 255);
        for (int i = 0; i < iMin; i++) {
            int i2 = i * 4;
            xjn xjnVar = (xjn) xjoVar.e.get(i);
            bArr[i + 2] = xjnVar.e;
            float[] fArr = carSensorEvent.d;
            fArr[i2] = xjnVar.c;
            fArr[i2 + 1] = xjnVar.d * 0.001f;
            int i3 = i2 + 2;
            int i4 = xjnVar.b;
            float f = Float.NaN;
            fArr[i3] = (i4 & 8) != 0 ? xjnVar.f * 0.001f : Float.NaN;
            int i5 = i2 + 3;
            if ((i4 & 16) != 0) {
                f = xjnVar.g * 0.001f;
            }
            fArr[i5] = f;
        }
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent B(xjp xjpVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(18, SystemClock.elapsedRealtimeNanos(), 3, 0);
        float[] fArr = carSensorEvent.d;
        int i = xjpVar.b;
        fArr[0] = (i & 1) != 0 ? xjpVar.c * 0.001f : Float.NaN;
        fArr[1] = (i & 2) != 0 ? xjpVar.d * 0.001f : Float.NaN;
        fArr[2] = (i & 4) != 0 ? xjpVar.e * 0.001f : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent C(xjr xjrVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(13, SystemClock.elapsedRealtimeNanos(), 2, 0);
        float[] fArr = carSensorEvent.d;
        int i = xjrVar.b;
        fArr[0] = (i & 1) != 0 ? xjrVar.c * 0.001f : Float.NaN;
        fArr[1] = (i & 2) != 0 ? xjrVar.d * 0.001f : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent D(xkg xkgVar) {
        int iAr;
        int iAr2;
        byte b2 = 0;
        CarSensorEvent carSensorEvent = new CarSensorEvent(19, SystemClock.elapsedRealtimeNanos(), 0, 3);
        byte[] bArr = carSensorEvent.e;
        int i = xkgVar.b;
        if ((i & 1) != 0) {
            iAr = a.ar(xkgVar.c);
            if (iAr == 0) {
                iAr = 1;
            }
        } else {
            iAr = 0;
        }
        bArr[0] = (byte) iAr;
        if ((i & 2) != 0) {
            iAr2 = a.ar(xkgVar.d);
            if (iAr2 == 0) {
                iAr2 = 1;
            }
        } else {
            iAr2 = 0;
        }
        bArr[1] = (byte) iAr2;
        if ((i & 4) == 0) {
            b2 = -1;
        } else if (xkgVar.e) {
            b2 = 1;
        }
        bArr[2] = b2;
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent E(xkh xkhVar) {
        int i;
        CarSensorEvent carSensorEvent = new CarSensorEvent(10, SystemClock.elapsedRealtimeNanos(), 6, 9);
        float[] fArr = carSensorEvent.d;
        int i2 = xkhVar.c;
        fArr[0] = i2 * 1.0E-7f;
        fArr[1] = xkhVar.d * 1.0E-7f;
        int i3 = xkhVar.b;
        if ((i3 & 8) != 0) {
            fArr[2] = xkhVar.e * 0.001f;
            i = 7;
        } else {
            i = 3;
        }
        if ((i3 & 16) != 0) {
            fArr[3] = xkhVar.f * 0.01f;
            i |= 8;
        }
        if ((i3 & 32) != 0) {
            fArr[4] = xkhVar.g * 0.001f;
            i |= 16;
        }
        if ((i3 & 64) != 0) {
            fArr[5] = xkhVar.h * 1.0E-6f;
            i |= 32;
        }
        byte[] bArr = carSensorEvent.e;
        bArr[0] = (byte) i;
        CarSensorEvent.d(bArr, 1, i2);
        CarSensorEvent.d(bArr, 5, xkhVar.d);
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent F(xlt xltVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(9, SystemClock.elapsedRealtimeNanos(), 0, 1);
        byte[] bArr = carSensorEvent.e;
        byte b2 = 1;
        if ((xltVar.b & 1) == 0) {
            b2 = -1;
        } else if (!xltVar.c) {
            b2 = 0;
        }
        bArr[0] = b2;
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent G(xlu xluVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(4, SystemClock.elapsedRealtimeNanos(), 2, 0);
        float[] fArr = carSensorEvent.d;
        fArr[0] = xluVar.c * 0.1f;
        fArr[1] = (xluVar.b & 2) != 0 ? xluVar.d * 0.1f : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent H(xlz xlzVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(20, SystemClock.elapsedRealtimeNanos(), 0, 1);
        byte[] bArr = carSensorEvent.e;
        byte b2 = 1;
        if ((xlzVar.b & 1) == 0) {
            b2 = -1;
        } else if (!xlzVar.c) {
            b2 = 0;
        }
        bArr[0] = b2;
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent I(xog xogVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(2, SystemClock.elapsedRealtimeNanos(), 2, 1);
        float[] fArr = carSensorEvent.d;
        fArr[0] = xogVar.c * 0.001f;
        byte[] bArr = carSensorEvent.e;
        int i = xogVar.b;
        bArr[0] = (i & 2) != 0 ? xogVar.d ? (byte) 1 : (byte) 0 : (byte) -1;
        fArr[1] = (i & 4) != 0 ? xogVar.e : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent J(xoj xojVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(21, SystemClock.elapsedRealtimeNanos(), xojVar.b.size(), 1);
        carSensorEvent.e[0] = (byte) xojVar.b.size();
        for (int i = 0; i < xojVar.b.size(); i++) {
            carSensorEvent.d[i] = xojVar.b.e(i) * 0.01f;
        }
        return carSensorEvent;
    }

    public static /* synthetic */ int K(int i, int i2, CarAudioConfiguration[] carAudioConfigurationArr) {
        for (int i3 = 0; i3 < carAudioConfigurationArr.length; i3++) {
            CarAudioConfiguration carAudioConfiguration = carAudioConfigurationArr[i3];
            if (carAudioConfiguration.a == i && carAudioConfiguration.b == i2 && carAudioConfiguration.c == 2) {
                return i3;
            }
        }
        return -1;
    }

    public static /* synthetic */ otv L(xkj xkjVar) {
        int iOrdinal = xkjVar.ordinal();
        if (iOrdinal == 0) {
            return otv.PCM;
        }
        if (iOrdinal == 1) {
            return otv.AAC_LC;
        }
        if (iOrdinal == 3) {
            return otv.AAC_LC_ADTS;
        }
        throw new IllegalArgumentException("Invalid mediaCodecType: ".concat(String.valueOf(xkjVar.name())));
    }

    public static /* synthetic */ ouh M(int i) {
        if (i == 0) {
            return ouh.TELEPHONY;
        }
        if (i == 1) {
            return ouh.SYSTEM_AUDIO;
        }
        if (i == 3) {
            return ouh.MEDIA;
        }
        if (i == 5) {
            return ouh.GUIDANCE;
        }
        throw new IllegalArgumentException(a.bp(i, "Invalid streamType: "));
    }

    public static /* synthetic */ yzz N(ouh ouhVar) {
        int iOrdinal = ouhVar.ordinal();
        if (iOrdinal == 0) {
            return yzz.AUDIO_STREAM_DIAGNOSTICS_AUDIO_STREAM_TYPE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return yzz.AUDIO_STREAM_DIAGNOSTICS_GUIDANCE;
        }
        if (iOrdinal == 2) {
            return yzz.AUDIO_STREAM_DIAGNOSTICS_SYSTEM_AUDIO;
        }
        if (iOrdinal == 3) {
            return yzz.AUDIO_STREAM_DIAGNOSTICS_MEDIA;
        }
        if (iOrdinal == 4) {
            return yzz.AUDIO_STREAM_DIAGNOSTICS_TELEPHONY;
        }
        throw new RuntimeException(null, null);
    }

    public static /* synthetic */ String O(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 5 ? "UNKNOWN" : "TTS" : "MEDIA" : "SYSTEM" : "VOICE";
    }

    public static /* synthetic */ String P(xhf xhfVar) {
        int i;
        int i2;
        int i3 = xhfVar.b;
        if ((i3 & 1) == 0 || !((i = xhfVar.c) == 48000 || i == 16000)) {
            return "wrong sampling rate " + xhfVar.c;
        }
        if ((i3 & 2) == 0 || xhfVar.d != 16) {
            return "wrong number of bits " + xhfVar.d;
        }
        if ((i3 & 4) != 0 && ((i2 = xhfVar.e) == 2 || i2 == 1)) {
            return null;
        }
        return "wrong number of channels " + xhfVar.e;
    }

    public static /* synthetic */ byte[] Q(abow abowVar) {
        byte[] bArrH = abowVar.h();
        woy.N(bArrH.length <= (Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536));
        return bArrH;
    }

    public static /* synthetic */ boolean R(xhj xhjVar, xhi xhiVar) {
        int iOrdinal = xhiVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                if (xhjVar == xhj.AUDIO_FOCUS_STATE_GAIN_TRANSIENT || xhjVar == xhj.AUDIO_FOCUS_STATE_GAIN || xhjVar == xhj.AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY) {
                    return false;
                }
            } else if (iOrdinal == 3 && (xhjVar == xhj.AUDIO_FOCUS_STATE_LOSS || xhjVar == xhj.AUDIO_FOCUS_STATE_LOSS_TRANSIENT)) {
                return false;
            }
        } else if (xhjVar == xhj.AUDIO_FOCUS_STATE_GAIN) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ int S(int i, int i2) {
        return (i2 == -99999 || i < i2) ? i : i2;
    }

    public static /* synthetic */ int T(int i, int i2) {
        return (i2 == -99999 || i > i2) ? i : i2;
    }

    public static /* synthetic */ oul U(int i) {
        if (i == 0) {
            return oul.NONE;
        }
        if (i == 1) {
            return oul.FOCUS_GAIN;
        }
        if (i == 2) {
            return oul.FOCUS_LOSS;
        }
        if (i == 3) {
            return oul.BOTTOM_HALF_SWITCH;
        }
        throw new IllegalStateException(a.bp(i, "Invalid focusChangeCommand "));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ defpackage.nup V(defpackage.nup r3, boolean r4) {
        /*
            boolean r0 = defpackage.actj.r()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            if (r4 == 0) goto L14
            int r3 = r3.f
            nup r4 = defpackage.nup.DEFAULT
            int r4 = r4.f
            if (r3 <= r4) goto L14
        L12:
            r4 = r1
            goto L27
        L14:
            r4 = r2
            goto L27
        L16:
            boolean r0 = defpackage.actj.s()
            if (r0 == 0) goto L27
            if (r4 == 0) goto L14
            int r3 = r3.f
            nup r4 = defpackage.nup.LOW
            int r4 = r4.f
            if (r3 <= r4) goto L14
            goto L12
        L27:
            if (r4 == 0) goto L2c
            nup r3 = defpackage.nup.HIGH
            return r3
        L2c:
            nup r3 = defpackage.nup.DEFAULT
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.roc.V(nup, boolean):nup");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean X() {
        NavigationCurrentPosition navigationCurrentPosition;
        return Boolean.TRUE.equals(mad.e().b().e()) && (navigationCurrentPosition = (NavigationCurrentPosition) mad.e().b.e()) != null && !navigationCurrentPosition.a().isEmpty() && ((DestinationDistance) navigationCurrentPosition.a().get(0)).c > 0;
    }

    public static /* synthetic */ boolean Y(String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    public static /* synthetic */ boolean Z(String str) {
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    public static final rge a(int i, int i2, int i3, int i4, int i5) {
        return new rge(new AudioRecord(i, i2, i3, i4, i5));
    }

    public static /* synthetic */ long aA(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static /* synthetic */ boolean aB(aqf aqfVar) {
        return aqfVar instanceof alh ? ((alh) aqfVar).b() != Integer.MAX_VALUE : ((aqfVar instanceof axr) && ((axr) aqfVar).l().m == 0) ? false : true;
    }

    public static /* synthetic */ afak aC(atm atmVar, bux buxVar, int i) {
        atmVar.getClass();
        if (!buxVar.I((i & 17) != 16, i & 1)) {
            buxVar.s();
        }
        return afak.a;
    }

    public static /* synthetic */ afak aD(afeg afegVar, bux buxVar, int i) {
        if (buxVar.I((i & 3) != 2, i & 1)) {
            afegVar.invoke(buxVar, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static /* synthetic */ boolean aE(CarMessage carMessage) {
        return !carMessage.isRead();
    }

    public static /* synthetic */ boolean aF(cil cilVar, giz gizVar) {
        gizVar.getClass();
        if (gizVar == giz.c) {
            return cilVar.a(7);
        }
        return false;
    }

    public static /* synthetic */ Context aG(Context context, String str) {
        try {
            return context.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(String.format("Failed to find package: %s", str), e);
        }
    }

    public static /* synthetic */ jcv aH() {
        throw new UnsupportedOperationException("Filters are not enabled in lite");
    }

    public static /* synthetic */ IllegalStateException aI(RemoteException remoteException) {
        return new IllegalStateException("Unexpected RemoteException of type " + String.valueOf(remoteException.getClass()) + " with message: " + remoteException.getMessage(), remoteException);
    }

    public static /* synthetic */ afak aJ(cuo cuoVar, cun cunVar) {
        cunVar.getClass();
        cunVar.r(cuoVar, 0, 0, BitmapDescriptorFactory.HUE_RED);
        return afak.a;
    }

    public static /* synthetic */ boolean aK(cil cilVar, giz gizVar) {
        gizVar.getClass();
        if (gizVar != giz.b) {
            return false;
        }
        cilVar.a(7);
        return true;
    }

    public static /* synthetic */ boolean aL(cil cilVar, giz gizVar) {
        gizVar.getClass();
        if (gizVar == giz.b) {
            return cilVar.a(7);
        }
        return false;
    }

    public static /* synthetic */ boolean aM(cil cilVar, giz gizVar) {
        gizVar.getClass();
        if (gizVar == giz.a) {
            return cilVar.a(7);
        }
        return false;
    }

    public static /* synthetic */ void aN(hlo hloVar) {
        if (hloVar.getLifecycle().a() == eps.e) {
            hloVar.A();
        }
        if (hloVar.getLifecycle().a() == eps.d) {
            hloVar.n();
        }
        if (hloVar.getLifecycle().a() == eps.c) {
            hloVar.b();
        }
    }

    public static /* synthetic */ boolean aO(ggk ggkVar) {
        ggkVar.getClass();
        return ggkVar.f();
    }

    public static /* synthetic */ afak aP(cil cilVar, cho choVar) {
        choVar.getClass();
        int i = choVar.a;
        if (a.Y(i, 5) || a.Y(i, 3)) {
            cilVar.a(7);
        }
        return afak.a;
    }

    public static /* synthetic */ void aQ(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (byte b2 : bArr) {
            for (int i = 0; i < 48; i++) {
                int i2 = bArr2[i] & 255;
                bArr2[i] = (byte) (((((i2 >> 7) | (i2 + i2)) + 33) ^ bArr3[i % bArr3.length]) ^ b2);
            }
        }
    }

    public static /* synthetic */ yzz aR(int i) {
        if (i == 3) {
            return yzz.AUDIO_GLITCH_MEDIA;
        }
        if (i == 1) {
            return yzz.AUDIO_GLITCH_GUIDANCE;
        }
        if (i == 2 || i == 4) {
            return null;
        }
        throw new IllegalArgumentException(String.format("streamType %s is not a known stream type", "AUDIO_STREAM_MEDIA"));
    }

    public static /* synthetic */ int aS(int i) {
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

    public static /* synthetic */ ouh aT(int i) {
        return i != 1 ? i != 2 ? i != 3 ? ouh.TELEPHONY : ouh.MEDIA : ouh.SYSTEM_AUDIO : ouh.GUIDANCE;
    }

    public static /* synthetic */ int aU(int i) {
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
        throw new IllegalArgumentException(a.bp(i, "Unsupported stream type "));
    }

    public static void aV(RuntimeException runtimeException, sxy sxyVar, String str) {
        qnj qnjVar = sxyVar.a;
        if (qnjVar != qnj.STARTUP && qnjVar != qnj.TELEDOCTOR) {
            throw runtimeException;
        }
        try {
            Log.e("ExceptionUtil", a.bz(str, "RuntimeException while safely performing function: "), runtimeException);
        } catch (RuntimeException unused) {
        }
    }

    public static zgp aW(Callable callable) {
        zgq zgqVar = new zgq(callable);
        new Thread(zgqVar).start();
        return zgqVar;
    }

    public static yvg aX(Context context) {
        List<AccessibilityServiceInfo> arrayList;
        List<AccessibilityServiceInfo> arrayList2;
        abnp abnpVarN = yvg.a.n();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        ContentResolver contentResolver = context.getContentResolver();
        try {
            arrayList = accessibilityManager.getInstalledAccessibilityServiceList();
        } catch (NullPointerException unused) {
            arrayList = new ArrayList<>();
        }
        if (arrayList != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : arrayList) {
                if (accessibilityServiceInfo != null) {
                    by(accessibilityServiceInfo.getId(), abnpVarN, 3);
                }
            }
        }
        try {
            arrayList2 = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } catch (NullPointerException unused2) {
            arrayList2 = new ArrayList<>();
        }
        if (arrayList2 != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo2 : arrayList2) {
                if (accessibilityServiceInfo2 != null) {
                    by(accessibilityServiceInfo2.getId(), abnpVarN, 2);
                }
            }
        }
        try {
            int iBx = bx(Settings.System.getFloat(contentResolver, "font_scale") > 1.0f);
            abnpVarN.t();
            yvg yvgVar = (yvg) abnpVarN.b;
            yvgVar.g = iBx - 1;
            yvgVar.b |= 16;
        } catch (Settings.SettingNotFoundException unused3) {
        }
        try {
            int iBx2 = bx(Settings.Secure.getInt(contentResolver, "accessibility_display_magnification_enabled") == 1);
            abnpVarN.t();
            yvg yvgVar2 = (yvg) abnpVarN.b;
            yvgVar2.h = iBx2 - 1;
            yvgVar2.b |= 32;
        } catch (Settings.SettingNotFoundException unused4) {
        }
        try {
            int iBx3 = bx(Settings.Secure.getInt(contentResolver, "high_text_contrast_enabled") == 1);
            abnpVarN.t();
            yvg yvgVar3 = (yvg) abnpVarN.b;
            yvgVar3.i = iBx3 - 1;
            yvgVar3.b |= 64;
        } catch (Settings.SettingNotFoundException unused5) {
        }
        return (yvg) abnpVarN.q();
    }

    public static final String aY(ContentResolver contentResolver, Uri uri) throws sxd {
        Uri uri2;
        String string;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new sxd("Unable to acquire ContentProviderClient from ".concat(String.valueOf(String.valueOf(uri))));
            }
            try {
                uri2 = uri;
            } catch (SQLException | RemoteException e) {
                e = e;
                uri2 = uri;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri2, new String[]{"value"}, "name=?", new String[]{"maps_client_id"}, null);
                try {
                    if (cursorQuery == null) {
                        throw new sxd("ContentProvider query returned null cursor for key maps_client_id from " + String.valueOf(uri2));
                    }
                    if (cursorQuery.moveToFirst()) {
                        string = cursorQuery.getString(0);
                        cursorQuery.close();
                    } else {
                        cursorQuery.close();
                        string = null;
                    }
                    return string;
                } finally {
                }
            } catch (SQLException e2) {
                e = e2;
                throw new sxd("ContentProvider query failed for key maps_client_id from " + String.valueOf(uri2), e);
            } catch (RemoteException e3) {
                e = e3;
                throw new sxd("ContentProvider query failed for key maps_client_id from " + String.valueOf(uri2), e);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public static String aZ(int i) {
        if (i == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (i == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (i == 2) {
            return "THROTTLE_NEVER";
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ boolean ab(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
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

    public static /* synthetic */ List ag(bym bymVar) {
        return (List) bymVar.a();
    }

    public static /* synthetic */ ComponentName al(ResolveInfo resolveInfo) {
        if (resolveInfo.serviceInfo != null) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (resolveInfo.activityInfo == null) {
            return null;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    public static /* synthetic */ afak am(ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) throws qrz {
        mki.a.g();
        ols.f(kio.b().e(), CarDisplayId.a, projectionWindowAnimationChoreography);
        return afak.a;
    }

    public static /* synthetic */ afak an(bux buxVar, int i) {
        if (!buxVar.I((i & 3) != 2, i & 1)) {
            buxVar.s();
        }
        return afak.a;
    }

    public static /* synthetic */ kkf ao(bym bymVar) {
        return (kkf) bymVar.a();
    }

    public static /* synthetic */ afak ap(cie cieVar) {
        cieVar.getClass();
        cieVar.a(false);
        return afak.a;
    }

    public static /* synthetic */ CharSequence aq(bym bymVar) {
        return (CharSequence) bymVar.a();
    }

    public static /* synthetic */ void ar(bux buxVar, int i) {
        if (buxVar.I((i & 17) != 16, i & 1)) {
            return;
        }
        buxVar.s();
    }

    public static /* synthetic */ lod as(lol lolVar) {
        if (lolVar instanceof lod) {
            return (lod) lolVar;
        }
        return null;
    }

    public static /* synthetic */ boolean au(mqc mqcVar) {
        return mqcVar.b == mpz.b;
    }

    public static /* synthetic */ afak av(afeg afegVar, abu abuVar, bux buxVar, int i) {
        abuVar.getClass();
        if (buxVar.I((i & 17) != 16, i & 1)) {
            afegVar.invoke(buxVar, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static /* synthetic */ boolean aw(mqc mqcVar) {
        return mqcVar.b == mpz.d;
    }

    public static /* synthetic */ void ax(PrintWriter printWriter, String str, int i, boolean z) {
        if (i > str.length()) {
            String str2 = true != z ? "%1$-" : "%1$";
            str = String.format(Locale.US, str2 + i + "s", str);
        }
        printWriter.print(str);
    }

    public static /* synthetic */ void ay(SmsMessage[] smsMessageArr, List list) {
        try {
            for (SmsMessage smsMessage : smsMessageArr) {
                list.add(smsMessage.getPdu());
            }
        } catch (NullPointerException e) {
            throw new RuntimeException("NPE when trying to extract PDUs to list. If this error is appearing in tests, please double check that the 'sender address' is a valid phone number when creating SmsMessages. An example valid phone number is '16501231234'.", e);
        }
    }

    public static /* synthetic */ lod az(lol lolVar) {
        return (lod) lom.b(lolVar, lod.class);
    }

    public static final rge b(int i, int i2) {
        rge.a.f().ai(8001).w("Trying audio capturing with L API, sampling rate: %d", i2);
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        try {
            AudioAttributes.Builder builder2 = (AudioAttributes.Builder) builder.getClass().getMethod("setInternalCapturePreset", Integer.TYPE).invoke(builder, 8);
            builder2.getClass();
            try {
                AudioAttributes.Builder builder3 = (AudioAttributes.Builder) builder2.getClass().getMethod("addTag", String.class).invoke(builder2, "fixedVolume");
                builder3.getClass();
                return bw(builder3.build(), new AudioFormat.Builder().setEncoding(2).setChannelMask(12).setSampleRate(i2).build(), i);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                rge.a.g().p(e).ai(8002).u("addTag failed");
                return null;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            rge.a.g().p(e2).ai(8003).u("setInternalCapturePreset failed");
            return null;
        }
    }

    public static String ba(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static void bb(int i) {
        boolean z;
        if (i == 100 || i == 102 || i == 104) {
            z = true;
        } else if (i == 105) {
            i = 105;
            z = true;
        } else {
            z = false;
        }
        aclh.o(z, "priority %d must be a Priority.PRIORITY_* constant", new Object[]{Integer.valueOf(i)});
    }

    public static Intent bc(PendingIntent pendingIntent) {
        spu.ax(pendingIntent, "The target cannot be null!");
        return new Intent("com.google.android.gms.ui.UNPACKING_REDIRECT").setPackage("com.google.android.gms").setData(Uri.parse("intent://com.google.android.gms.auth.uiflows.common/".concat(String.valueOf(String.valueOf(UUID.randomUUID()))))).putExtra("target", pendingIntent);
    }

    public static qlo bd(qnd qndVar, String str) {
        spu.aw(qndVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            Map mapA = spr.a(new URI(a.bz(str, "?")));
            qlo qloVar = new qlo();
            qloVar.e = (String) mapA.get("utm_content");
            qloVar.c = (String) mapA.get("utm_medium");
            qloVar.a = (String) mapA.get("utm_campaign");
            qloVar.b = (String) mapA.get("utm_source");
            qloVar.d = (String) mapA.get("utm_term");
            qloVar.f = (String) mapA.get("utm_id");
            qloVar.g = (String) mapA.get("anid");
            qloVar.h = (String) mapA.get("gclid");
            qloVar.i = (String) mapA.get("dclid");
            qloVar.j = (String) mapA.get("aclid");
            return qloVar;
        } catch (URISyntaxException e) {
            qndVar.p(5, "No valid campaign data found", e, null, null);
            return null;
        }
    }

    public static String be(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    public static void bf(Map map, String str, String str2) {
        if (str2 == null || map.containsKey(str)) {
            return;
        }
        map.put(str, str2);
    }

    public static boolean bg(Context context, String str, boolean z) throws PackageManager.NameNotFoundException {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                if (!z) {
                    return true;
                }
                if (receiverInfo.exported) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static MessageDigest bh() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static boolean bi(Context context) throws PackageManager.NameNotFoundException {
        spu.aw(context);
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    z = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        b = Boolean.valueOf(z);
        return z;
    }

    public static boolean bj(Context context) throws PackageManager.NameNotFoundException {
        spu.aw(context);
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zBg = bg(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        a = Boolean.valueOf(zBg);
        return zBg;
    }

    public static final byte[] bk(ByteArrayOutputStream byteArrayOutputStream) {
        return byteArrayOutputStream.toByteArray();
    }

    public static String bl(String str, int i) {
        if (i <= 0) {
            qnc.a("index out of range for prefix", str);
            return "";
        }
        return str + i;
    }

    public static final void bm(String str) {
        try {
            try {
                std stdVar = ssp.a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                    std stdVar2 = ssp.a;
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                std stdVar3 = ssp.a;
            } catch (IndexOutOfBoundsException e2) {
                Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e2.getMessage(), e2);
                std stdVar4 = ssp.a;
            } catch (RuntimeException e3) {
                e = e3;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                std stdVar32 = ssp.a;
            }
        } catch (Throwable th) {
            std stdVar5 = ssp.a;
            throw th;
        }
    }

    public static qmz bn(int i, rjg rjgVar, qme qmeVar) {
        try {
            return bz(qmeVar.b.c.getResources().getXml(i), rjgVar, qmeVar);
        } catch (Resources.NotFoundException e) {
            qmeVar.p(5, "inflate() called with unknown resourceId", e, null, null);
            return null;
        }
    }

    public static PendingIntent bo(moa moaVar, Bundle bundle) {
        Intent intent = new Intent("com.google.android.gearhead.ACTION_HANDLE_NOTIFICATION_INTENT").setPackage("com.google.android.projection.gearhead");
        intent.putExtra("EXTRA_STREAMITEM_TYPE", moaVar.J());
        intent.putExtra("EXTRA_STREAMITEM_ID", moaVar.A());
        intent.putExtra("EXTRA_PAYLOAD", bundle);
        return lxr.p().a(intent);
    }

    public static SharedPreferences bp(Context context) {
        woy.aa(jrl.a() == jrl.PROJECTION, "FRX Prefs should only be accessed in the projection process!");
        return context.getSharedPreferences("com.google.android.projection.gearhead.frx.PREFERENCE_NAME", 0);
    }

    public static void bq(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(new int[]{R.attr.carFrxButtonBarLayout});
        viewGroup.addView(layoutInflater.inflate(typedArrayObtainStyledAttributes.getResourceId(0, R.layout.car_frx_buttons), viewGroup, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean br(Intent intent) {
        return intent != null && intent.hasCategory("com.google.android.gms.car.drivingMode.category.DEFAULT");
    }

    public static final boolean bs(Intent intent) {
        ComponentName componentNameA;
        String stringExtra = intent.getStringExtra("android.intent.extra.PACKAGE_NAME");
        if (intent.getComponent() != null && intent.getComponent().getPackageName().equals(stringExtra)) {
            return true;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (action == null || data == null) {
            return false;
        }
        yfq yfqVar = map.a;
        if ("android.intent.action.VIEW".equals(intent.getAction()) && (("google.navigation".equals(intent.getScheme()) || "geo".equals(intent.getScheme())) && (componentNameA = map.a(kio.b().e(), true)) != null)) {
            intent.setComponent(componentNameA);
            return true;
        }
        if (!"android.intent.action.CALL".equals(action) && !"android.intent.action.DIAL".equals(action)) {
            return false;
        }
        intent.setComponent(mkn.b);
        return true;
    }

    public static Throwable bt(Bundle bundle) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        return (Throwable) bundle.getSerializable("throwable");
    }

    public static Object bu(Class cls) {
        qcg.a();
        return aclf.e(null, cls);
    }

    public static ajmd bv() {
        return mbw.b().g;
    }

    private static rge bw(AudioAttributes audioAttributes, AudioFormat audioFormat, int i) throws NoSuchMethodException, SecurityException {
        try {
            try {
                Class cls = Integer.TYPE;
                Constructor constructor = AudioRecord.class.getConstructor(AudioAttributes.class, AudioFormat.class, cls, cls);
                constructor.setAccessible(true);
                return new rge((AudioRecord) constructor.newInstance(audioAttributes, audioFormat, Integer.valueOf(i), 0));
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                e = e;
                rge.a.g().p(e).ai(8000).u("AudioRecord construction failed");
                return null;
            }
        } catch (IllegalAccessException e2) {
            e = e2;
            rge.a.g().p(e).ai(8000).u("AudioRecord construction failed");
            return null;
        } catch (InstantiationException e3) {
            e = e3;
            rge.a.g().p(e).ai(8000).u("AudioRecord construction failed");
            return null;
        } catch (InvocationTargetException e4) {
            e = e4;
            rge.a.g().p(e).ai(8000).u("AudioRecord construction failed");
            return null;
        }
    }

    private static int bx(boolean z) {
        return z ? 2 : 3;
    }

    private static void by(String str, abnp abnpVar, int i) {
        if (str.startsWith("com.google.") || str.startsWith("com.googlecode.")) {
            if (str.endsWith("TalkBackService")) {
                abnpVar.t();
                yvg yvgVar = (yvg) abnpVar.b;
                yvg yvgVar2 = yvg.a;
                yvgVar.c = i - 1;
                yvgVar.b |= 1;
                return;
            }
            if (str.endsWith("BrailleBackService")) {
                abnpVar.t();
                yvg yvgVar3 = (yvg) abnpVar.b;
                yvg yvgVar4 = yvg.a;
                yvgVar3.d = i - 1;
                yvgVar3.b |= 2;
                return;
            }
            if (str.endsWith("SwitchAccessService") || str.endsWith("SwitchControlService")) {
                abnpVar.t();
                yvg yvgVar5 = (yvg) abnpVar.b;
                yvg yvgVar6 = yvg.a;
                yvgVar5.e = i - 1;
                yvgVar5.b |= 4;
                return;
            }
            if (str.endsWith("JustSpeakService") || str.endsWith("VoiceAccessService")) {
                abnpVar.t();
                yvg yvgVar7 = (yvg) abnpVar.b;
                yvg yvgVar8 = yvg.a;
                yvgVar7.f = i - 1;
                yvgVar7.b |= 8;
            }
        }
    }

    private static final qmz bz(XmlResourceParser xmlResourceParser, rjg rjgVar, qme qmeVar) throws NumberFormatException {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue)) {
                            TextUtils.isEmpty(strTrim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && strTrim2 != null) {
                            if ("ga_appName".equals(attributeValue2)) {
                                ((qmz) rjgVar.a).a = strTrim2;
                            } else if ("ga_appVersion".equals(attributeValue2)) {
                                ((qmz) rjgVar.a).b = strTrim2;
                            } else if ("ga_logLevel".equals(attributeValue2)) {
                                ((qmz) rjgVar.a).c = strTrim2;
                            } else {
                                ((qmh) rjgVar.b).e().p(5, "String xml configuration name not recognized", attributeValue2, null, null);
                            }
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(strTrim3)) {
                            try {
                                boolean z = Boolean.parseBoolean(strTrim3);
                                if ("ga_dryRun".equals(attributeValue3)) {
                                    ((qmz) rjgVar.a).e = z ? 1 : 0;
                                } else {
                                    ((qmh) rjgVar.b).e().p(5, "Bool xml configuration name not recognized", attributeValue3, null, null);
                                }
                            } catch (NumberFormatException e) {
                                qmeVar.p(5, "Error parsing bool configuration value", strTrim3, e, null);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(strTrim4)) {
                            try {
                                int i = Integer.parseInt(strTrim4);
                                if ("ga_dispatchPeriod".equals(attributeValue4)) {
                                    ((qmz) rjgVar.a).d = i;
                                } else {
                                    ((qmh) rjgVar.b).e().p(5, "Int xml configuration name not recognized", attributeValue4, null, null);
                                }
                            } catch (NumberFormatException e2) {
                                qmeVar.p(5, "Error parsing int configuration value", strTrim4, e2, null);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e3) {
            qmeVar.p(6, "Error parsing tracker configuration file", e3, null, null);
        } catch (XmlPullParserException e4) {
            qmeVar.p(6, "Error parsing tracker configuration file", e4, null, null);
        }
        return (qmz) rjgVar.a;
    }

    public static final int c(CarAudioConfiguration carAudioConfiguration) {
        int i = carAudioConfiguration.a;
        return (i == 44100 || i == 48000) ? 2048 : 1024;
    }

    public static final int d(CarAudioConfiguration carAudioConfiguration) {
        int iC = c(carAudioConfiguration);
        int i = iC + iC;
        int i2 = carAudioConfiguration.b;
        return (i2 == 12 || i2 == 12) ? i + i : i;
    }

    public static Class e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new rye("Error get Class:" + str + ", " + e.getMessage(), e);
        }
    }

    @ResultIgnorabilityUnspecified
    public static Object f(Class cls, String str, Object obj, Object[] objArr, Class... clsArr) {
        try {
            try {
                return cls.getDeclaredMethod(str, clsArr).invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new rye(e);
            }
        } catch (NoSuchMethodException e2) {
            throw new rye("No method " + str + " for " + cls.getName() + " " + e2.toString());
        }
    }

    public static String[] g() {
        return new String[0];
    }

    public static final int h(Context context) throws PackageManager.NameNotFoundException {
        context.getClass();
        if (!(context instanceof Service)) {
            rrd.a("CAR.PROJECTION.SCVH", null, "getTheme: context not an instance of service");
            return 0;
        }
        ComponentName componentName = new ComponentName(context, context.getClass());
        try {
            Service service = (Service) context;
            ServiceInfo serviceInfo = service.getPackageManager().getServiceInfo(componentName, 128);
            serviceInfo.getClass();
            Bundle bundle = serviceInfo.metaData;
            int i = service.getApplicationInfo().theme;
            return bundle != null ? bundle.getInt("android.app.theme", i) : i;
        } catch (PackageManager.NameNotFoundException unused) {
            rrd.d(6, "CAR.PROJECTION.SCVH", null, "Could not get theme for component %s; use the default theme", componentName);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(Intent intent, qnr qnrVar) {
        int i;
        switch (qnrVar.e) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
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
            case 0:
                throw new IllegalArgumentException("Can't assign unknown extra");
            case 1:
                intent.putExtra(qnrVar.d, qnrVar.b == 3 ? (String) qnrVar.c : "");
                return;
            case 2:
                intent.putExtra(qnrVar.d, (byte) (qnrVar.b == 4 ? ((Integer) qnrVar.c).intValue() : 0));
                return;
            case 3:
                intent.putExtra(qnrVar.d, (short) (qnrVar.b == 5 ? ((Integer) qnrVar.c).intValue() : 0));
                return;
            case 4:
                intent.putExtra(qnrVar.d, qnrVar.b == 6 ? ((Integer) qnrVar.c).intValue() : 0);
                return;
            case 5:
                intent.putExtra(qnrVar.d, qnrVar.b == 7 ? ((Long) qnrVar.c).longValue() : 0L);
                return;
            case 6:
                intent.putExtra(qnrVar.d, qnrVar.b == 8 ? ((Float) qnrVar.c).floatValue() : BitmapDescriptorFactory.HUE_RED);
                return;
            case 7:
                intent.putExtra(qnrVar.d, qnrVar.b == 9 ? ((Double) qnrVar.c).doubleValue() : 0.0d);
                return;
            case 8:
                intent.putExtra(qnrVar.d, qnrVar.b == 10 ? ((Boolean) qnrVar.c).booleanValue() : false);
                return;
            case 9:
                String[] strArr = new String[qnrVar.f.size()];
                for (int i2 = 0; i2 < qnrVar.f.size(); i2++) {
                    strArr[i2] = (String) qnrVar.f.get(i2);
                }
                intent.putExtra(qnrVar.d, strArr);
                return;
            case 10:
                byte[] bArr = new byte[qnrVar.g.size()];
                for (int i3 = 0; i3 < qnrVar.g.size(); i3++) {
                    bArr[i3] = (byte) qnrVar.g.e(i3);
                }
                intent.putExtra(qnrVar.d, bArr);
                return;
            case 11:
                short[] sArr = new short[qnrVar.h.size()];
                for (int i4 = 0; i4 < qnrVar.h.size(); i4++) {
                    sArr[i4] = (short) qnrVar.h.e(i4);
                }
                intent.putExtra(qnrVar.d, sArr);
                return;
            case 12:
                int[] iArr = new int[qnrVar.i.size()];
                for (int i5 = 0; i5 < qnrVar.i.size(); i5++) {
                    iArr[i5] = qnrVar.i.e(i5);
                }
                intent.putExtra(qnrVar.d, iArr);
                return;
            case 13:
                long[] jArr = new long[qnrVar.j.size()];
                for (int i6 = 0; i6 < qnrVar.j.size(); i6++) {
                    jArr[i6] = qnrVar.j.a(i6);
                }
                intent.putExtra(qnrVar.d, jArr);
                return;
            case 14:
                float[] fArr = new float[qnrVar.k.size()];
                for (int i7 = 0; i7 < qnrVar.k.size(); i7++) {
                    fArr[i7] = qnrVar.k.e(i7);
                }
                intent.putExtra(qnrVar.d, fArr);
                return;
            case 15:
                double[] dArr = new double[qnrVar.l.size()];
                for (int i8 = 0; i8 < qnrVar.l.size(); i8++) {
                    dArr[i8] = qnrVar.l.e(i8);
                }
                intent.putExtra(qnrVar.d, dArr);
                return;
            case 16:
                boolean[] zArr = new boolean[qnrVar.m.size()];
                for (int i9 = 0; i9 < qnrVar.m.size(); i9++) {
                    zArr[i9] = qnrVar.m.f(i9);
                }
                intent.putExtra(qnrVar.d, zArr);
                return;
            default:
                throw new IllegalArgumentException("Unrecognized extra type");
        }
    }

    public static /* synthetic */ void j(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static /* synthetic */ String k(String str) {
        return str == null ? "" : (str.startsWith("\"") && str.endsWith("\"") && str.length() > 1) ? str.substring(1, str.length() - 1) : str;
    }

    public static /* synthetic */ boolean l(Context context, ComponentName componentName, long j) {
        long longVersionCode;
        try {
            longVersionCode = context.getPackageManager().getPackageInfo(componentName.getPackageName(), 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "com.google.android.projection.gearhead".equals(componentName.getPackageName()) ? rzc.a.compare(Long.valueOf(longVersionCode), Long.valueOf(j)) >= 0 : longVersionCode >= j;
    }

    public static /* synthetic */ void m(DialogInterface dialogInterface) {
        View viewFindViewById = ((wme) dialogInterface).findViewById(R.id.design_bottom_sheet);
        viewFindViewById.getClass();
        BottomSheetBehavior.M(viewFindViewById).U(3);
    }

    public static /* synthetic */ PrivateKey n(byte[] bArr) {
        int length = bArr.length - 54;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 28, bArr2, 0, length);
        return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(bArr2, 2)));
    }

    public static /* synthetic */ String o(xkj xkjVar) {
        if (xkjVar == null) {
            return "UNKNOWN";
        }
        switch (xkjVar.ordinal()) {
            case 0:
                return "PCM";
            case 1:
                return "AAC";
            case 2:
                return "H264";
            case 3:
                return "AAC-ADTS";
            case 4:
                return "VP9";
            case 5:
                return "AV1";
            case 6:
                return "H265";
            default:
                throw new RuntimeException(null, null);
        }
    }

    public static /* synthetic */ rll p(rro rroVar) {
        int iOrdinal = rroVar.ordinal();
        if (iOrdinal == 1) {
            if (rlj.a == null) {
                rlj.a = new rlj();
            }
            return rlj.a;
        }
        if (iOrdinal == 2) {
            if (rlp.a == null) {
                rlp.a = new rlp();
            }
            return rlp.a;
        }
        if (iOrdinal == 3) {
            return rli.a(rro.AUDIO_SINK_GUIDANCE);
        }
        if (iOrdinal == 5) {
            return rli.a(rro.AUDIO_SINK_MEDIA);
        }
        if (iOrdinal == 7) {
            if (rlo.a == null) {
                rlo.a = new rlo();
            }
            return rlo.a;
        }
        if (iOrdinal != 8) {
            if (rlk.a == null) {
                rlk.a = new rlk(rroVar);
            }
            return rlk.a;
        }
        if (rlm.a == null) {
            rlm.a = new rlm();
        }
        return rlm.a;
    }

    public static /* synthetic */ String q(int i) {
        return i != 3 ? i != 5 ? a.bp(i, "unsupported-") : "tts" : "media";
    }

    public static /* synthetic */ String r(xhi xhiVar) {
        if (xhiVar == null) {
            return "null AudioFocusRequestType";
        }
        int iOrdinal = xhiVar.ordinal();
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
        throw new RuntimeException(null, null);
    }

    public static /* synthetic */ String s(xhj xhjVar) {
        switch (xhjVar.ordinal()) {
            case 0:
                return "AUDIO_FOCUS_STATE_INVALID";
            case 1:
                return "AUDIO_FOCUS_STATE_GAIN";
            case 2:
                return "AUDIO_FOCUS_STATE_GAIN_TRANSIENT";
            case 3:
                return "AUDIO_FOCUS_STATE_LOSS";
            case 4:
                return "AUDIO_FOCUS_STATE_LOSS_TRANSIENT_CAN_DUCK";
            case 5:
                return "AUDIO_FOCUS_STATE_LOSS_TRANSIENT";
            case 6:
                return "AUDIO_FOCUS_STATE_GAIN_MEDIA_ONLY";
            case 7:
                return "AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY";
            default:
                throw new RuntimeException(null, null);
        }
    }

    public static /* synthetic */ CarSensorEvent t(xgy xgyVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(14, SystemClock.elapsedRealtimeNanos(), 3, 0);
        float[] fArr = carSensorEvent.d;
        int i = xgyVar.b;
        fArr[0] = (i & 1) != 0 ? xgyVar.c * 0.001f : Float.NaN;
        fArr[1] = (i & 2) != 0 ? xgyVar.d * 0.001f : Float.NaN;
        fArr[2] = (i & 4) != 0 ? xgyVar.e * 0.001f : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent u(xit xitVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(1, SystemClock.elapsedRealtimeNanos(), 3, 0);
        float[] fArr = carSensorEvent.d;
        fArr[0] = xitVar.c * 1.0E-6f;
        int i = xitVar.b;
        fArr[1] = (i & 2) != 0 ? xitVar.d * 1.0E-6f : Float.NaN;
        fArr[2] = (i & 4) != 0 ? xitVar.e * 1.0E-6f : Float.NaN;
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent v(xja xjaVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(15, SystemClock.elapsedRealtimeNanos(), xjaVar.d.size() + 1, 1);
        float[] fArr = carSensorEvent.d;
        int i = 0;
        fArr[0] = (xjaVar.b & 1) != 0 ? xjaVar.c * 0.1f : Float.NaN;
        carSensorEvent.e[0] = (byte) xjaVar.d.size();
        while (i < xjaVar.d.size()) {
            int i2 = i + 1;
            fArr[i2] = xjaVar.d.e(i) * 0.001f;
            i = i2;
        }
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent w(xjb xjbVar) {
        int iD = (xjbVar.b & 1) != 0 ? xjbVar.c.d() : -1;
        CarSensorEvent carSensorEvent = new CarSensorEvent(8, SystemClock.elapsedRealtimeNanos(), 0, Math.max(1, iD + 1));
        byte[] bArr = carSensorEvent.e;
        bArr[0] = (byte) iD;
        if ((xjbVar.b & 1) != 0) {
            System.arraycopy(xjbVar.c.D(), 0, bArr, 1, xjbVar.c.d());
        }
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent x(xjd xjdVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(16, SystemClock.elapsedRealtimeNanos(), 0, xjdVar.e.size() + 3);
        byte[] bArr = carSensorEvent.e;
        int i = xjdVar.b;
        bArr[0] = (i & 1) != 0 ? xjdVar.c ? (byte) 1 : (byte) 0 : (byte) -1;
        bArr[1] = (i & 2) != 0 ? xjdVar.d ? (byte) 1 : (byte) 0 : (byte) -1;
        bArr[2] = (byte) xjdVar.e.size();
        for (int i2 = 0; i2 < xjdVar.e.size(); i2++) {
            bArr[i2 + 3] = xjdVar.e.f(i2);
        }
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent y(xjg xjgVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(12, SystemClock.elapsedRealtimeNanos(), 2, 1);
        float[] fArr = carSensorEvent.d;
        int i = xjgVar.b;
        fArr[0] = (i & 1) != 0 ? xjgVar.c * 0.001f : Float.NaN;
        fArr[1] = (i & 2) != 0 ? xjgVar.d * 0.001f : Float.NaN;
        carSensorEvent.e[0] = (byte) ((i & 4) != 0 ? xjgVar.e : -1);
        return carSensorEvent;
    }

    public static /* synthetic */ CarSensorEvent z(xjj xjjVar) {
        CarSensorEvent carSensorEvent = new CarSensorEvent(5, SystemClock.elapsedRealtimeNanos(), 2, 1);
        float[] fArr = carSensorEvent.d;
        int i = xjjVar.b;
        fArr[0] = (i & 1) != 0 ? xjjVar.c : Float.NaN;
        byte b2 = 1;
        fArr[1] = (i & 2) != 0 ? xjjVar.d : Float.NaN;
        byte[] bArr = carSensorEvent.e;
        if ((i & 4) == 0) {
            b2 = -1;
        } else if (!xjjVar.e) {
            b2 = 0;
        }
        bArr[0] = b2;
        return carSensorEvent;
    }

    public roc() {
    }
}
