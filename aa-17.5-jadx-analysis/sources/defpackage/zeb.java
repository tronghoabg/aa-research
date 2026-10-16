package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class zeb {
    public zeb() {
    }

    @ResultIgnorabilityUnspecified
    public static Long g(String str) throws NoSuchAlgorithmException {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return Long.valueOf(ByteBuffer.wrap(messageDigest.digest()).getLong());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static /* synthetic */ long h(long j) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(1000000L) + Long.numberOfLeadingZeros(-1000001L);
        if (iNumberOfLeadingZeros > 65) {
            return j * 1000000;
        }
        if (iNumberOfLeadingZeros >= 64) {
            long j2 = j * 1000000;
            if (j == 0 || j2 / j == 1000000) {
                return j2;
            }
        }
        throw new ArithmeticException();
    }

    public static long i(String str, int i) {
        str.getClass();
        if (str.isEmpty()) {
            throw new NumberFormatException("empty string");
        }
        int i2 = zdm.c[i] - 1;
        long j = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int iDigit = Character.digit(str.charAt(i3), i);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i3 > i2) {
                if (j >= 0) {
                    long j2 = zdm.a[i];
                    if (j >= j2 && (j > j2 || iDigit > zdm.b[i])) {
                    }
                }
                throw new NumberFormatException("Too large for unsigned long: ".concat(str));
            }
            j = (j * i) + iDigit;
        }
        return j;
    }

    public static long j(int i) {
        return i & 4294967295L;
    }

    public static long k(long j, long j2, long j3) {
        woy.U(true, "min (%s) must be less than or equal to max (%s)", j2, j3);
        return Math.min(Math.max(j, j2), j3);
    }

    public static long l(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return (b8 & 255) | ((b7 & 255) << 8) | ((b & 255) << 56) | ((b2 & 255) << 48) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16);
    }

    public static long[] m(Collection collection) {
        if (collection instanceof zdk) {
            throw null;
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            jArr[i] = ((Number) obj).longValue();
        }
        return jArr;
    }

    public static zcz n(String str) {
        String str2;
        String strSubstring;
        String strSubstring2;
        Charset charset = zdb.a;
        str.getClass();
        charset.getClass();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && ":/\\?#".indexOf(str.charAt(i2)) < 0) {
            i2++;
        }
        String strSubstring3 = null;
        if (i2 <= 0 || !str.startsWith(":", i2)) {
            str2 = null;
        } else {
            String strSubstring4 = str.substring(0, i2);
            int i3 = i2 + 1;
            str2 = strSubstring4;
            i = i3;
        }
        if (str.startsWith("//", i)) {
            int i4 = i + 2;
            int i5 = i4;
            while (i5 < str.length() && "/\\?#".indexOf(str.charAt(i5)) < 0) {
                i5++;
            }
            strSubstring3 = str.substring(i4, i5);
            i = i5;
            strSubstring = null;
        } else {
            strSubstring = null;
        }
        int i6 = i;
        while (i6 < str.length() && "?#".indexOf(str.charAt(i6)) < 0) {
            i6++;
        }
        String strSubstring5 = i6 > i ? str.substring(i, i6) : strSubstring;
        if (str.startsWith("?", i6)) {
            int i7 = i6 + 1;
            while (i6 < str.length() && str.charAt(i6) != '#') {
                i6++;
            }
            strSubstring2 = str.substring(i7, i6);
        } else {
            strSubstring2 = strSubstring;
        }
        if (str.startsWith("#", i6)) {
            strSubstring = str.substring(i6 + 1);
        }
        if ((str2 == null || str2.equals(zcz.c(str2))) && charset.equals(charset)) {
            return new zcz(str2, strSubstring3, strSubstring5, strSubstring2, strSubstring, charset, str);
        }
        return new zcz(str2, strSubstring3, strSubstring5, strSubstring2, strSubstring, charset);
    }

    public static String o(zdc zdcVar, Charset charset) throws IOException {
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = zdcVar.u().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((CharSequence) zdb.a((String) entry.getKey(), charset));
                if (!((String) entry.getValue()).isEmpty()) {
                    sb.append('=').append(zdb.a((String) entry.getValue(), charset));
                }
                if (it.hasNext()) {
                    sb.append('&');
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static Collection p(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getClass();
        }
        return arrayList;
    }

    public static int q(long j, int i) {
        long j2 = i;
        long j3 = j % j2;
        if (j3 == 0) {
            j3 = 0;
        } else if ((((j ^ j2) >> 63) | 1) <= 0) {
            j3 += j2;
        }
        return (int) j3;
    }

    public static long r(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (zcj.a[roundingMode.ordinal()]) {
            case 1:
                wub.aD(false);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j3 + i;
    }

    public static long s(long j, long j2) {
        boolean z = (j ^ j2) < 0;
        long j3 = j2 + j;
        return z | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static boolean t(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static abnp u(Throwable th, boolean z) {
        StackTraceElement[] stackTrace;
        abnp abnpVarN = zca.a.n();
        abnp abnpVarN2 = zby.a.n();
        String name = th.getClass().getName();
        abnpVarN2.t();
        zby zbyVar = (zby) abnpVarN2.b;
        name.getClass();
        zbyVar.b |= 1;
        zbyVar.c = name;
        if (th.getMessage() != null) {
            String message = th.getMessage();
            abnpVarN2.t();
            zby zbyVar2 = (zby) abnpVarN2.b;
            message.getClass();
            zbyVar2.b |= 2;
            zbyVar2.d = message;
        }
        try {
            stackTrace = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                abnp abnpVarN3 = zbx.a.n();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    abnpVarN3.t();
                    zbx zbxVar = (zbx) abnpVarN3.b;
                    className.getClass();
                    zbxVar.b |= 1;
                    zbxVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    abnpVarN3.t();
                    zbx zbxVar2 = (zbx) abnpVarN3.b;
                    methodName.getClass();
                    zbxVar2.b |= 2;
                    zbxVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    abnpVarN3.t();
                    zbx zbxVar3 = (zbx) abnpVarN3.b;
                    zbxVar3.b |= 8;
                    zbxVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        abnpVarN3.t();
                        zbx zbxVar4 = (zbx) abnpVarN3.b;
                        fileName.getClass();
                        zbxVar4.b |= 4;
                        zbxVar4.e = fileName;
                    }
                }
                abnpVarN2.t();
                zby zbyVar3 = (zby) abnpVarN2.b;
                zbx zbxVar5 = (zbx) abnpVarN3.q();
                zbxVar5.getClass();
                aboh abohVar = zbyVar3.f;
                if (!abohVar.c()) {
                    zbyVar3.f = abnv.I(abohVar);
                }
                zbyVar3.f.add(zbxVar5);
            }
        }
        abnpVarN.t();
        zca zcaVar = (zca) abnpVarN.b;
        zby zbyVar4 = (zby) abnpVarN2.q();
        zbyVar4.getClass();
        zcaVar.c = zbyVar4;
        zcaVar.b |= 1;
        return abnpVarN;
    }

    public static /* synthetic */ String v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "NONE" : "CAR" : "UNTETHERED_HEADSET" : "WATCH" : "DEFAULT" : "UNKNOWN";
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return "UNKNOWN_STATE";
        }
        if (i == 2) {
            return "IDLE";
        }
        if (i == 3) {
            return "STARTING";
        }
        if (i == 1001) {
            return "WIFI_INCOMPATIBLE_STAGE";
        }
        switch (i) {
            case 102:
                return "BT_SETUP";
            case 103:
                return "AWAITING_START";
            case 104:
                return "WIFI_SETUP";
            case 105:
                return "LAUNCHING_PROJECTION";
            case 106:
                return "PROJECTING";
            case 107:
                return "SHUTDOWN";
            default:
                return "null";
        }
    }

    public static int x(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 1000) {
            return 1001;
        }
        switch (i) {
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            default:
                return 0;
        }
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "UNKNOWN_ASSISTANT_SESSION_EVENT";
        }
        if (i == 2) {
            return "GEARHEAD_INTERNAL_ERROR";
        }
        if (i == 41) {
            return "GEARHEAD_TO_ASSISTANT_START_VOICE_SESSION";
        }
        if (i == 42) {
            return "GEARHEAD_TO_ASSISTANT_STOP_VOICE_SESSION";
        }
        if (i == 101) {
            return "ASSISTANT_SESSION_FUSION";
        }
        if (i == 102) {
            return "ASSISTANT_SESSION_NON_FUSION";
        }
        switch (i) {
            case 11:
                return "ASSISTANT_TO_GEARHEAD_START_VOICE_SESSION";
            case 12:
                return "ASSISTANT_TO_GEARHEAD_END_VOICE_SESSION";
            case 13:
                return "ASSISTANT_TO_GEARHEAD_END_VOICE_SESSION_FOCUS_LOST";
            case 14:
                return "ASSISTANT_TO_GEARHEAD_PROCESS_RESULT";
            case 15:
                return "ASSISTANT_TO_GEARHEAD_PROCESS_RESULT_ERROR";
            case 16:
                return "ASSISTANT_TO_GEARHEAD_VOICE_PLATE_SET_SPEECH_LEVEL";
            case 17:
                return "ASSISTANT_TO_GEARHEAD_VOICE_PLATE_SET_STATE";
            case 18:
                return "ASSISTANT_TO_GEARHEAD_VOICE_PLATE_SET_PROVIDER_INFO";
            case 19:
                return "ASSISTANT_TO_GEARHEAD_VOICE_PLATE_SET_MESSAGE";
            case 20:
                return "ASSISTANT_TO_GEARHEAD_ACTION_PLATE_SET_TEMPLATE";
            case 21:
                return "ASSISTANT_TO_GEARHEAD_ACTION_PLATE_SET_COMPONENT";
            case 22:
                return "ASSISTANT_TO_GEARHEAD_ACTION_PLATE_NOTIFY_COMPONENT_SELECTED";
            case 23:
                return "ASSISTANT_TO_GEARHEAD_OPEN_MICROPHONE";
            default:
                switch (i) {
                    case 201:
                        return "VOICE_SESSION_RESTART_REQUESTED";
                    case 202:
                        return "VOICE_SESSION_RESTART_PERFORMED";
                    case 203:
                        return "VOICE_SESSION_END_REQUESTED";
                    case 204:
                        return "VOICE_SESSION_END_PERFORMED";
                    case 205:
                        return "VOICE_SESSION_UNNECESSARY_POST";
                    case 206:
                        return "VOICE_SESSION_MISSING_POST";
                    default:
                        switch (i) {
                            case 301:
                                return "AUDIO_RECORDER_T_START";
                            case 302:
                                return "AUDIO_RECORDER_T_NO_PERMISSION";
                            case 303:
                                return "AUDIO_RECORDER_T_MIC_NO_MORE_DATA";
                            case 304:
                                return "AUDIO_RECORDER_T_CANCELLED";
                            case 305:
                                return "AUDIO_RECORDER_T_DONE";
                            case 306:
                                return "AUDIO_RECORDER_T_OTHER_ERROR";
                            case 307:
                                return "AUDIO_RECORDER_T_CLOSING_RESOURCES_STARTED";
                            case 308:
                                return "AUDIO_RECORDER_T_CLOSING_OUTPUT_FAILED";
                            case 309:
                                return "AUDIO_RECORDER_T_CLOSING_OUTPUT_FINISHED";
                            case 310:
                                return "AUDIO_RECORDER_T_CLOSING_RECORD_NULL";
                            case 311:
                                return "AUDIO_RECORDER_T_CLOSING_RECORD_EXCEPTION";
                            case 312:
                                return "AUDIO_RECORDER_T_CLOSING_RESOURCES_FINISHED";
                            case 313:
                                return "AUDIO_RECORDER_T_CLOSED_WITHOUT_STOP";
                            case 314:
                                return "AUDIO_RECORDER_T_CAR_NOT_CONNECTED_EXCEPTION";
                            case 315:
                                return "AUDIO_RECORDER_T_HANDLER_EXCEPTION";
                            case 316:
                                return "AUDIO_RECORDER_T_PREVIOUS_OUTPUT_STREAM_ACTIVE";
                            case 317:
                                return "AUDIO_RECORDER_T_INVALID_READ_OUTPUT_STREAM_CLOSED";
                            case 318:
                                return "AUDIO_RECORDER_T_UNEXPECTED_BYTES_READ";
                            case 319:
                                return "AUDIO_RECORDER_T_CAR_NOT_CONNECTED_EXCEPTION_ON_READ";
                            case 320:
                                return "AUDIO_RECORDER_T_BYTES_SENT";
                            default:
                                switch (i) {
                                    case 401:
                                        return "AUDIO_RECORDER_START_NEW_RECORDING";
                                    case 402:
                                        return "AUDIO_RECORDER_START_NO_PERMISSION";
                                    case 403:
                                        return "AUDIO_RECORDER_START_ALREADY_RECORDING";
                                    case 404:
                                        return "AUDIO_RECORDER_START_COMPLETE";
                                    case 405:
                                        return "AUDIO_RECORDER_STOP_STARTED";
                                    case 406:
                                        return "AUDIO_RECORDER_STOP_NO_PERMISSION";
                                    case 407:
                                        return "AUDIO_RECORDER_STOP_COMPLETE";
                                    case 408:
                                        return "AUDIO_RECORDER_SECURITY_EXCEPTION";
                                    case 409:
                                        return "AUDIO_RECORDER_STOP_ALREADY_STOPPING";
                                    case 410:
                                        return "AUDIO_RECORDER_STOP_ALREADY_STOPPED";
                                    default:
                                        return "null";
                                }
                        }
                }
        }
    }

    public static int z(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 40) {
            return 41;
        }
        if (i == 41) {
            return 42;
        }
        if (i == 100) {
            return EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        }
        if (i == 101) {
            return 102;
        }
        switch (i) {
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            default:
                switch (i) {
                    case 200:
                        return 201;
                    case 201:
                        return 202;
                    case 202:
                        return 203;
                    case 203:
                        return 204;
                    case 204:
                        return 205;
                    case 205:
                        return 206;
                    default:
                        switch (i) {
                            case 300:
                                return 301;
                            case 301:
                                return 302;
                            case 302:
                                return 303;
                            case 303:
                                return 304;
                            case 304:
                                return 305;
                            case 305:
                                return 306;
                            case 306:
                                return 307;
                            case 307:
                                return 308;
                            case 308:
                                return 309;
                            case 309:
                                return 310;
                            case 310:
                                return 311;
                            case 311:
                                return 312;
                            case 312:
                                return 313;
                            case 313:
                                return 314;
                            case 314:
                                return 315;
                            case 315:
                                return 316;
                            case 316:
                                return 317;
                            case 317:
                                return 318;
                            case 318:
                                return 319;
                            case 319:
                                return 320;
                            default:
                                switch (i) {
                                    case 400:
                                        return 401;
                                    case 401:
                                        return 402;
                                    case 402:
                                        return 403;
                                    case 403:
                                        return 404;
                                    case 404:
                                        return 405;
                                    case 405:
                                        return 406;
                                    case 406:
                                        return 407;
                                    case 407:
                                        return 408;
                                    case 408:
                                        return 409;
                                    case 409:
                                        return 410;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    final Type f() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        woy.S(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }

    public zeb(byte[] bArr) {
    }
}
