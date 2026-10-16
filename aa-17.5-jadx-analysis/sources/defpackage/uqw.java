package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.usb.UsbAccessory;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import com.google.android.apps.auto.carservice.gmscorecompat.CarStartupServiceImpl;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class uqw {
    public uqw(aezk aezkVar) {
    }

    public static float A(ujf ujfVar) {
        ukn uknVar = ujfVar.r;
        return Color.alpha(C(ujfVar)) == 0 ? BitmapDescriptorFactory.HUE_RED : uknVar != null ? uknVar.e : 2.8f;
    }

    public static float B(int i, ueu ueuVar, float f) {
        float f2 = i * ueuVar.e;
        float f3 = ueuVar.c;
        int i2 = ueuVar.d;
        return Math.max(f3, Math.min(32.0f, f2)) * f;
    }

    public static int C(ujf ujfVar) {
        if (ujfVar.q()) {
            return ujfVar.r.c;
        }
        int iD = D(ujfVar);
        int i = (((iD >>> 24) * 160) / 255) << 24;
        return ((((((iD >>> 16) & 255) * 77) + (((iD >>> 8) & 255) * 151)) + ((iD & 255) * 28)) >> 8) >= 192 ? 8421504 | i : 16777215 | i;
    }

    public static int D(ujf ujfVar) {
        int i = ujfVar.q() ? ujfVar.r.b : -9541545;
        if (i == 0) {
            return -9541545;
        }
        return i;
    }

    public static int E(int i, boolean z) {
        int i2 = i - 1;
        int i3 = 1;
        if (i2 == 1) {
            ukn uknVar = ukn.a;
            i3 = 16;
        } else if (i2 == 2) {
            ukn uknVar2 = ukn.a;
            i3 = 8;
        } else if (i2 != 3) {
            i3 = 0;
        } else {
            ukn uknVar3 = ukn.a;
        }
        if (!z) {
            return i3;
        }
        ukn uknVar4 = ukn.a;
        return i3 | 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface F(int i) {
        int i2;
        Typeface typefaceCreate = null;
        if (i > 0) {
            boolean zX = x(2, i);
            ukn uknVar = ukn.a;
            boolean zX2 = x(1, i);
            i2 = zX2;
            if (zX) {
                i2 = (zX2 ? 1 : 0) | 2;
            }
            if (x(16, i)) {
                typefaceCreate = Typeface.create("sans-serif-light", i2 == true ? 1 : 0);
            } else if (x(8, i)) {
                try {
                    typefaceCreate = Typeface.create("sans-serif-medium", i2 == true ? 1 : 0);
                } catch (Exception unused) {
                }
            }
        } else {
            i2 = 0;
        }
        return typefaceCreate == null ? Typeface.defaultFromStyle(i2) : typefaceCreate;
    }

    public static smp G(Object obj, String str) {
        spu.ax(obj, "Listener must not be null");
        spu.ax(str, "Listener type must not be null");
        spu.au(str, "Listener type must not be empty");
        return new smp(obj, str);
    }

    public static smr H(Object obj, Looper looper, String str) {
        spu.ax(obj, "Listener must not be null");
        spu.ax(looper, "Looper must not be null");
        spu.ax(str, "Listener type must not be null");
        return new smr(looper, obj, str);
    }

    public static String I(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return CloudRecognizerProtocolStrings.SUCCESS;
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return a.bp(i, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
            case 23:
                return "RATE_LIMIT_EXCEEDED";
        }
    }

    public static final ApiMetadata J(ComplianceOptions complianceOptions, boolean z) {
        ApiMetadata apiMetadata = new ApiMetadata(complianceOptions, false);
        apiMetadata.d = z;
        return apiMetadata;
    }

    public static boolean K(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }

    public static long L(byte[] bArr) {
        long j;
        long j2;
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        long j3 = -5435081209227447693L;
        boolean z = false;
        if (length <= 32) {
            if (length > 16) {
                long jAk = ak(bArr2, 0) * (-5435081209227447693L);
                long jAk2 = ak(bArr2, 8);
                long j4 = (length + length) - 7286425919675154353L;
                long jAk3 = ak(bArr2, length - 8) * j4;
                long jAk4 = ak(bArr2, length - 16) * (-7286425919675154353L);
                long jRotateRight = Long.rotateRight(jAk + jAk2, 43) + Long.rotateRight(jAk3, 30);
                long jRotateRight2 = jAk + Long.rotateRight(jAk2 - 7286425919675154353L, 18) + jAk3;
                long j5 = ((jRotateRight + jAk4) ^ jRotateRight2) * j4;
                long j6 = ((j5 ^ (j5 >>> 47)) ^ jRotateRight2) * j4;
                return (j6 ^ (j6 >>> 47)) * j4;
            }
            if (length >= 8) {
                j = (length + length) - 7286425919675154353L;
                long jAk5 = ak(bArr2, 0) - 7286425919675154353L;
                long jAk6 = ak(bArr2, length - 8);
                long jRotateRight3 = Long.rotateRight(jAk6, 37) * j;
                long jRotateRight4 = (Long.rotateRight(jAk5, 25) + jAk6) * j;
                long j7 = ((jRotateRight3 + jAk5) ^ jRotateRight4) * j;
                j2 = (j7 ^ (j7 >>> 47)) ^ jRotateRight4;
            } else {
                if (length < 4) {
                    if (length <= 0) {
                        return -7286425919675154353L;
                    }
                    long j8 = (((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L));
                    return (j8 ^ (j8 >>> 47)) * (-7286425919675154353L);
                }
                j = (length + length) - 7286425919675154353L;
                long jAj = aj(bArr2, 0);
                long jAj2 = aj(bArr2, length - 4);
                long j9 = length + ((jAj & 4294967295L) << 3);
                long j10 = 4294967295L & jAj2;
                long j11 = (j9 ^ j10) * j;
                j2 = j10 ^ (j11 ^ (j11 >>> 47));
            }
            long j12 = j2 * j;
            return (j12 ^ (j12 >>> 47)) * j;
        }
        char c = '@';
        if (length <= 64) {
            long jAk7 = ak(bArr2, 0) * (-7286425919675154353L);
            long jAk8 = ak(bArr2, 8);
            long j13 = (length + length) - 7286425919675154353L;
            long jAk9 = ak(bArr2, length - 8) * j13;
            long jAk10 = ak(bArr2, length - 16) * (-7286425919675154353L);
            long jRotateRight5 = Long.rotateRight(jAk7 + jAk8, 43) + Long.rotateRight(jAk9, 30);
            long jRotateRight6 = Long.rotateRight(jAk8 - 7286425919675154353L, 18) + jAk7;
            long jAk11 = ak(bArr2, 16) * j13;
            long jAk12 = ak(bArr2, 24);
            long j14 = jRotateRight5 + jAk10;
            long jAk13 = j14 + ak(bArr2, length - 32);
            long j15 = jRotateRight6 + jAk9;
            long j16 = (j14 ^ j15) * j13;
            long j17 = ((j16 ^ (j16 >>> 47)) ^ j15) * j13;
            long jAk14 = ((j17 ^ (j17 >>> 47)) * j13) + ak(bArr2, length - 24);
            long j18 = jAk13 * j13;
            long jRotateRight7 = Long.rotateRight(jAk11 + jAk12, 43) + Long.rotateRight(j18, 30);
            long jRotateRight8 = jAk11 + Long.rotateRight(jAk12 + jAk7, 18) + j18;
            long j19 = ((jRotateRight7 + (jAk14 * j13)) ^ jRotateRight8) * j13;
            long j20 = (jRotateRight8 ^ (j19 ^ (j19 >>> 47))) * j13;
            return (j20 ^ (j20 >>> 47)) * j13;
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jAk15 = ak(bArr2, 0) + 95310865018149119L;
        long j21 = 1390051526045402406L;
        long j22 = 2480279821605975764L;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            boolean z2 = z;
            int i3 = (i2 >> 6) * 64;
            char c2 = c;
            long jRotateRight9 = Long.rotateRight(jAk15 + j22 + jArr[z2 ? 1 : 0] + ak(bArr2, i + 8), 37) * j3;
            long jRotateRight10 = Long.rotateRight(j22 + jArr[1] + ak(bArr2, i + 48), 42) * j3;
            long j23 = jRotateRight9 ^ jArr2[1];
            long j24 = j3;
            long jAk16 = ak(bArr2, i + 40) + jArr[z2 ? 1 : 0];
            long jRotateRight11 = Long.rotateRight(j21 + jArr2[z2 ? 1 : 0], 33) * j24;
            int i4 = i;
            al(bArr2, i4, jArr[1] * j24, j23 + jArr2[z2 ? 1 : 0], jArr);
            long[] jArr3 = jArr;
            j22 = jRotateRight10 + jAk16;
            al(bArr2, i4 + 32, jRotateRight11 + jArr2[1], ak(bArr2, i4 + 16) + j22, jArr2);
            i = i4 + 64;
            if (i == i3) {
                int i5 = i2 & 63;
                int i6 = i3 + i5;
                long j25 = j23 & 255;
                long j26 = j25 + j25 + j24;
                long j27 = jArr2[z2 ? 1 : 0] + i5;
                long j28 = jArr3[z2 ? 1 : 0] + j27;
                jArr3[z2 ? 1 : 0] = j28;
                jArr2[z2 ? 1 : 0] = j27 + j28;
                long jRotateRight12 = Long.rotateRight(jRotateRight11 + j22 + j28 + ak(bArr2, i6 - 55), 37) * j26;
                long jRotateRight13 = Long.rotateRight(j22 + jArr3[1] + ak(bArr2, i6 - 15), 42) * j26;
                long j29 = jArr2[1] * 9;
                long jAk17 = (jArr3[z2 ? 1 : 0] * 9) + ak(bArr2, i6 - 23);
                long jRotateRight14 = Long.rotateRight(j23 + jArr2[z2 ? 1 : 0], 33) * j26;
                long j30 = jRotateRight12 ^ j29;
                al(bArr2, i6 - 63, jArr3[1] * j26, j30 + jArr2[z2 ? 1 : 0], jArr3);
                long j31 = jRotateRight13 + jAk17;
                al(bArr2, i6 - 31, jArr2[1] + jRotateRight14, ak(bArr2, i6 - 47) + j31, jArr2);
                long j32 = jArr3[z2 ? 1 : 0];
                long j33 = jArr2[z2 ? 1 : 0];
                long j34 = (j32 ^ j33) * j26;
                long j35 = jArr3[1];
                long j36 = jArr2[1];
                long j37 = (j35 ^ j36) * j26;
                long j38 = ((j37 ^ (j37 >>> 47)) ^ j36) * j26;
                long j39 = ((j34 ^ (j34 >>> 47)) ^ j33) * j26;
                long j40 = ((j38 ^ (j38 >>> 47)) * j26) + jRotateRight14;
                long j41 = (((((j39 ^ (j39 >>> 47)) * j26) + (((j31 >>> 47) ^ j31) * (-4348849565147123417L))) + j30) ^ j40) * j26;
                long j42 = ((j41 ^ (j41 >>> 47)) ^ j40) * j26;
                return (j42 ^ (j42 >>> 47)) * j26;
            }
            bArr2 = bArr;
            c = c2;
            z = z2 ? 1 : 0;
            j21 = j23;
            j3 = j24;
            jAk15 = jRotateRight11;
            jArr = jArr3;
        }
    }

    public static final void M(boolean z, AtomicBoolean atomicBoolean, Handler handler, Runnable runnable, final Context context, UsbAccessory usbAccessory, xyc xycVar, boolean z2, final CarStartupServiceImpl carStartupServiceImpl) {
        ypf ypfVar = sgf.a;
        if (atomicBoolean.get()) {
            return;
        }
        handler.removeCallbacks(runnable);
        if (z) {
            sgf.c(context, usbAccessory, xycVar, z2);
            return;
        }
        UsbConnectionHelper usbConnectionHelper = new UsbConnectionHelper(new sge(context, new sgb()));
        ols.M(context, yxi.CAR_SETUP_START_CONNECT_TO_ACCESSORY);
        usbConnectionHelper.a(context, usbAccessory, true, z2, new sgj() { // from class: sgc
            @Override // defpackage.sgj
            public final void a(ParcelFileDescriptor parcelFileDescriptor) {
                ypf ypfVar2 = sgf.a;
                ypfVar2.f().ai(8899).y("SetupHelper got fd: %s", parcelFileDescriptor);
                Context context2 = context;
                if (parcelFileDescriptor == null) {
                    ypfVar2.h().ai(8900).u("Null file descriptor");
                    ols.M(context2, yxi.CAR_SETUP_NULL_ACCESSORY_FD);
                    return;
                }
                CarStartupServiceImpl carStartupServiceImpl2 = carStartupServiceImpl;
                ols.M(context2, yxi.CAR_SETUP_END_CONNECT_TO_ACCESSORY);
                HandlerThread handlerThread = new HandlerThread("usb-ctrl");
                handlerThread.start();
                pbx pbxVar = new pbx(context2, handlerThread.getLooper());
                pbxVar.e.add(new ajmd(carStartupServiceImpl2));
                pbxVar.d = false;
                Intent intent = new Intent();
                intent.putExtra("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR", parcelFileDescriptor);
                pbxVar.a(intent, new pbr(), new pbv());
            }
        });
    }

    public static String N(int i) {
        return i != -1 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? a.bp(i, "UNKNOWN:") : "GAIN_TR_EXC" : "GAIN_TR_MAY_DUCK" : "GAIN_TR" : "GAIN" : "LOSS";
    }

    public static void O(rzj rzjVar, oub oubVar) {
        rzjVar.f("MicrophoneSessionDiagnostics", new rfc(rzjVar, oubVar, 3));
    }

    public static String P(otz otzVar) {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        abnf abnfVar = otzVar.d;
        if (abnfVar == null) {
            abnfVar = abnf.a;
        }
        W("sum", abqs.e(abnfVar), sb);
        abnf abnfVar2 = otzVar.e;
        if (abnfVar2 == null) {
            abnfVar2 = abnf.a;
        }
        W("min", abqs.e(abnfVar2), sb);
        abnf abnfVar3 = otzVar.f;
        if (abnfVar3 == null) {
            abnfVar3 = abnf.a;
        }
        W("max", abqs.e(abnfVar3), sb);
        abnf abnfVar4 = otzVar.g;
        if (abnfVar4 == null) {
            abnfVar4 = abnf.a;
        }
        W("mean", abqs.e(abnfVar4), sb);
        abnf abnfVar5 = otzVar.h;
        if (abnfVar5 == null) {
            abnfVar5 = abnf.a;
        }
        W("variance", abqs.e(abnfVar5), sb);
        return T(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String Q(Enum r4) {
        return String.format(Locale.US, "%s (%d)", r4.name(), Integer.valueOf(((abnz) r4).a()));
    }

    public static String R(oua ouaVar) {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        V("sum", ouaVar.d, sb);
        V("min", ouaVar.e, sb);
        V("max", ouaVar.f, sb);
        U("mean", ouaVar.g, sb);
        U("variance", ouaVar.h, sb);
        return T(sb);
    }

    public static String S(abpt abptVar, abpt abptVar2) {
        String strF = abqu.f(abptVar);
        abqu.g(abptVar2);
        abqu.g(abptVar);
        long jAf = wox.af(abptVar.b, abptVar2.b);
        long j = abptVar.c - abptVar2.c;
        int i = (int) j;
        if (j == i) {
            return String.format("%s (%s from start)", strF, abqs.e(abqs.d(jAf, i)));
        }
        throw new ArithmeticException();
    }

    public static final String T(StringBuilder sb) {
        sb.append('}');
        String string = sb.toString();
        sb.deleteCharAt(sb.length() - 1);
        return string;
    }

    static final void U(String str, double d, StringBuilder sb) {
        am(sb);
        sb.append(str);
        sb.append(" = ");
        sb.append(String.format(Locale.US, "%.2f", Double.valueOf(d)));
    }

    public static final void V(String str, long j, StringBuilder sb) {
        am(sb);
        sb.append(str);
        sb.append(" = ");
        sb.append(j);
    }

    public static final void W(String str, Object obj, StringBuilder sb) {
        am(sb);
        sb.append(str);
        sb.append(" = ");
        sb.append(obj);
    }

    public static final void X(String str, boolean z, StringBuilder sb) {
        am(sb);
        sb.append(str);
        sb.append(" = ");
        sb.append(z);
    }

    public static final void Y(String str, boolean z, long j, StringBuilder sb) {
        if (z) {
            V(str, j, sb);
        }
    }

    public static final void Z(String str, boolean z, Object obj, StringBuilder sb) {
        if (z) {
            W(str, obj, sb);
        }
    }

    public static final void aa(String str, boolean z, boolean z2, StringBuilder sb) {
        if (z) {
            X(str, z2, sb);
        }
    }

    public static String ab(ots otsVar) {
        rzk rzkVarN = rzk.n();
        ac(rzkVarN, otsVar);
        return rzkVarN.toString();
    }

    public static void ac(rzj rzjVar, ots otsVar) {
        rzjVar.f("AudioStreamDiagnostics", new qqy(rzjVar, otsVar, 19, (char[]) null));
    }

    public static /* synthetic */ String ad(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "AUDIO_FORMAT_48000_MONO" : "AUDIO_FORMAT_16000_MONO" : "AUDIO_FORMAT_48000_STEREO" : "AUDIO_FORMAT_UNSPECIFIED";
    }

    public static void ae(Context context, String str, boolean z) throws PackageManager.NameNotFoundException {
        if (!str.equals("com.google.android.projection.bumblebee") && !str.equals("com.google.android.projection.gearhead")) {
            throw new IllegalArgumentException("Unexpected package name ".concat(String.valueOf(str)));
        }
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
        if (packageInfo.signatures.length != 1) {
            throw new SecurityException("Package has too many signatures (expected 1, found " + packageInfo.signatures.length + ")");
        }
        Signature signature = new Signature(Base64.decode("MIIDvTCCAqWgAwIBAgIJAMePnkuTQTAGMA0GCSqGSIb3DQEBBQUAMHUxCzAJBgNV\nBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBW\naWV3MRQwEgYDVQQKDAtHb29nbGUgSW5jLjEQMA4GA1UECwwHQW5kcm9pZDERMA8G\nA1UEAwwIZ2VhcmhlYWQwHhcNMTQwNTI3MjMwNTM0WhcNNDExMDEyMjMwNTM0WjB1\nMQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNTW91\nbnRhaW4gVmlldzEUMBIGA1UECgwLR29vZ2xlIEluYy4xEDAOBgNVBAsMB0FuZHJv\naWQxETAPBgNVBAMMCGdlYXJoZWFkMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIB\nCgKCAQEA050XDkNIsVRMX2wTvVplpCu4OtnyNK2v5B7PS+DggmH2yuZiwpTurdKD\nQ9R9UzxH9U4lsC+mIxXkiBYKIWNVgMtiTgxkEy7cgWvdYHgNYpFu8IxZKYDyXes+\n02pfvpu63MIBD/PnvVFipo1oUrbfetj+mroEpjnA71gUS0Ok+H6XWWsmb8xFHQVM\noZWEIzsUJ2nhm8EcnPkAPfNZAG++XLPROoRQCaswyYsd42JuYAP3CwZuhDcUbMWm\nk7rBi9BVQ8gmkrbwqo94A7qStLUp3NyCmlKSWHaZ05SspEPwsfctka0oXG5bhgT6\n67EMCzQ+YsFN1oJRL7Qq+mMQjFJs3wIDAQABo1AwTjAdBgNVHQ4EFgQUGvBfYNeu\n6JSJUnJZCiaBGsnXztswHwYDVR0jBBgwFoAUGvBfYNeu6JSJUnJZCiaBGsnXztsw\nDAYDVR0TBAUwAwEB/zANBgkqhkiG9w0BAQUFAAOCAQEAlGsDY0EPu3NBSH5k6iw/\nwJh9e3xMwS17ErKGlhyWogxJMzLjAN6g0aCPHxB40IQC+8qAl+RL7VQx6oxttf0m\n31yUGQPcNYbt2CxBTCAr885oLK5t2TAi5tQzhd6ZEYihWSUWUd/X8BQRouxboss9\nQbBA/iIx0OpDaxiAcq7Cb67TheXZDxGuQ8fmHYbLx84pEvm3DQOB/LIMkkpQSfEC\n1f+oP1zB3urPU/dSvED/LCgOdrpxZ5di7SwSyue+Vq/TZQy34tPygEzD2d8hFlh/\nyfhWkMizOeIXcayVAQdNn5zpBkuay1skGOjQQ5kTbDcDzigO2R2rqn6HCd9l5Z0W\nIQ==", 4));
        Signature signature2 = packageInfo.signatures[0];
        if (signature2.equals(signature)) {
            return;
        }
        if (z) {
            if (signature2.equals(new Signature(Base64.decode("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\ncQ91Xms=", 4))) || signature2.equals(new Signature(Base64.decode("MIIEqDCCA5CgAwIBAgIJANWFuGx90071MA0GCSqGSIb3DQEBBAUAMIGUMQswCQYD\nVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4g\nVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UE\nAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTAe\nFw0wODA0MTUyMzM2NTZaFw0zNTA5MDEyMzM2NTZaMIGUMQswCQYDVQQGEwJVUzET\nMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4G\nA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9p\nZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTCCASAwDQYJKoZI\nhvcNAQEBBQADggENADCCAQgCggEBANbOLggKv+IxTdGNs8/TGFy0PTP6DHThvbbR\n24kT9ixcOd9W+EaBPWW+wPPKQmsHxajtWjmQwWfna8mZuSeJS48LIgAZlKkpFeVy\nxW0qMBujb8X8ETrWy550NaFtI6t9+u7hZeTfHwqNvacKhp1RbE6dBRGWynwMVX8X\nW8N1+UjFaq6GCJukT4qmpN2afb8sCjUigq0GuMwYXrFVee74bQgLHWGJwPmvmLHC\n69EH6kWr22ijx4OKXlSIx2xT1AsSHee70w5iDBiK4aph27yH3TxkXy9V89TDdexA\ncKk/cVHYNnDBapcavl7y0RiQ4biu8ymM8Ga/nmzhRKya6G0cGw8CAQOjgfwwgfkw\nHQYDVR0OBBYEFI0cxb6VTEM8YYY6FbBMvAPyT+CyMIHJBgNVHSMEgcEwgb6AFI0c\nxb6VTEM8YYY6FbBMvAPyT+CyoYGapIGXMIGUMQswCQYDVQQGEwJVUzETMBEGA1UE\nCBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMH\nQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAG\nCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbYIJANWFuGx90071MAwGA1Ud\nEwQFMAMBAf8wDQYJKoZIhvcNAQEEBQADggEBABnTDPEF+3iSP0wNfdIjIz1AlnrP\nzgAIHVvXxunW7SBrDhEglQZBbKJEk5kT0mtKoOD1JMrSu1xuTKEBahWRbqHsXcla\nXjoBADb0kkjVEJu/Lh5hgYZnOjvlba8Ld7HCKePCVePoTJBdI4fvugnL8TsgK05a\nIskyY0hKI9L8KfqfGTl1lzOv2KoWD0KWwtAWPoGChZxmQ+nBli+gwYMzM1vAkP+a\nayLe0a1EQimlOalO762r0GXO0ks+UeXde2Z4e+8S/pf7pITEI/tP+MxJTALw9QUW\nEv9lKTk+jkbqxbsh8nfBUapfKqYn0eidpwq2AzVp3juYl7//fKnaPhJD9gs=", 4)))) {
                return;
            }
            if (Log.isLoggable("CAR.PKGVERIFIER", 3)) {
                Log.d("CAR.PKGVERIFIER", String.valueOf(str).concat(" not signed with valid release or debug cert."));
            }
        }
        throw new SecurityException(str + " is not signed by Google or is not allowed on this device type " + Build.TYPE + " Will not load code from it.");
    }

    public static void af(Context context, boolean z, boolean z2, rad radVar) {
        if (rrd.e("ImplStager", 3)) {
            rrd.a("ImplStager", null, "Staging impl");
        }
        new rac(context, z, z2, radVar).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01cd A[Catch: IOException -> 0x01f5, all -> 0x020b, TRY_ENTER, TryCatch #3 {IOException -> 0x01f5, blocks: (B:38:0x00bf, B:41:0x00e5, B:42:0x00ef, B:44:0x00fa, B:46:0x0102, B:47:0x0105, B:48:0x010c, B:65:0x015c, B:66:0x015f, B:68:0x0167, B:71:0x0177, B:74:0x017e, B:75:0x0189, B:76:0x018a, B:78:0x0196, B:81:0x01ba, B:82:0x01c5, B:87:0x01cd, B:88:0x01d0, B:90:0x01d2, B:91:0x01e2, B:93:0x01e4, B:94:0x01f4, B:98:0x01f8, B:99:0x01ff), top: B:112:0x00bf, outer: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void ag(java.io.File r10, android.content.Context r11, boolean r12, boolean r13, boolean r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqw.ag(java.io.File, android.content.Context, boolean, boolean, boolean):void");
    }

    public static void ah(erb erbVar, abgl abglVar, rjg rjgVar, pvq pvqVar) {
        qbz qbzVar = qbo.a;
        qbv qbvVar = new qbv("NetworkFetchEndToEndLatency".concat(String.valueOf(qbo.b(abglVar))), qbt.ae);
        qbu qbuVarA = qbo.a(abglVar);
        qaz qazVar = (qaz) rjgVar.a;
        ((Duration) qazVar.b).toMillis();
        ((Duration) qazVar.a).toMillis();
        ((qbg) erbVar.R(qbvVar)).getClass();
        int i = pvqVar.A;
    }

    public static void ai(erb erbVar, abgl abglVar, pvq pvqVar) {
        int i = pvqVar.A;
    }

    private static int aj(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    private static long ak(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    private static void al(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jAk = j + ak(bArr, i);
        long jAk2 = ak(bArr, i + 8);
        long jAk3 = ak(bArr, i + 16);
        long jAk4 = ak(bArr, i + 24);
        long j3 = jAk2 + jAk + jAk3;
        long jRotateRight = Long.rotateRight(j2 + jAk + jAk4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jAk4;
        jArr[1] = jRotateRight + jAk;
    }

    private static final void am(StringBuilder sb) {
        if (sb.length() > 1) {
            sb.append(", ");
        }
    }

    private static void an(File file) throws IOException {
        if (!file.exists() && !file.mkdir()) {
            throw new IOException("Failed to create dir ".concat(file.toString()));
        }
        if (!file.setExecutable(true, false)) {
            throw new IOException("Failed to make directory executable ".concat(file.toString()));
        }
        if (!file.getParentFile().setExecutable(true, false)) {
            throw new IOException("Failed to make parent directory executable ".concat(file.toString()));
        }
    }

    public static abad c() {
        abnp abnpVarN = abad.a.n();
        abnpVarN.t();
        abad abadVar = (abad) abnpVarN.b;
        abadVar.c = 1;
        abadVar.b = 1 | abadVar.b;
        return (abad) abnpVarN.q();
    }

    public static abad d() {
        abnp abnpVarN = abad.a.n();
        abnpVarN.t();
        abad abadVar = (abad) abnpVarN.b;
        abadVar.c = 6;
        abadVar.b |= 1;
        return (abad) abnpVarN.q();
    }

    public static abdl e(abdl abdlVar) {
        abnh abnhVar = abhi.a;
        abdlVar.j(abnhVar);
        abnl abnlVar = abdlVar.w;
        abnu abnuVar = abnhVar.d;
        if (!abnlVar.m(abnuVar)) {
            return abdlVar;
        }
        abdlVar.j(abnhVar);
        Object objJ = abdlVar.w.j(abnuVar);
        abnp abnpVarQ = ((abhh) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).K();
        abnpVarQ.t();
        abhh abhhVar = (abhh) abnpVarQ.b;
        abhhVar.c = null;
        abhhVar.b &= -129;
        abhh abhhVar2 = (abhh) abnpVarQ.q();
        abnr abnrVar = (abnr) abdlVar.K();
        abnrVar.bc(abnhVar, abhhVar2);
        return (abdl) abnrVar.q();
    }

    public static float f(float[] fArr, float f) {
        int i = 0;
        if (f <= fArr[0]) {
            return fArr[1];
        }
        int length = fArr.length;
        if (f >= fArr[length - 2]) {
            return fArr[length - 1];
        }
        while (true) {
            int length2 = fArr.length;
            if (i >= length2 - 2) {
                return fArr[length2 - 1];
            }
            float f2 = fArr[i];
            float f3 = fArr[i + 1];
            int i2 = i + 2;
            float f4 = fArr[i2];
            float f5 = fArr[i + 3];
            if (f >= f2 && f <= f4) {
                return f3 + ((f5 - f3) * ((f - f2) / (f4 - f2)));
            }
            i = i2;
        }
    }

    public static float[] g(int[] iArr, float f) {
        int length = iArr.length + 1;
        float[] fArr = new float[length + length];
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i + i;
            int i3 = i2 + 2;
            fArr[i3] = fArr[i2];
            int i4 = i2 + 1;
            int i5 = i2 + 3;
            fArr[i5] = fArr[i4];
            float f2 = iArr[i];
            fArr[i3] = fArr[i3] + ((i & 1) == 0 ? f2 : f2 * f);
            fArr[i5] = fArr[i5] + f2;
        }
        return fArr;
    }

    public static float h(int i, int i2, int i3, int i4) {
        if (i4 >= i) {
            return 1.0f;
        }
        return ((((float) Math.ceil((((((i - i4) + r3) / r3) * r3) + r4) / 4.0f)) * 4.0f) - i3) / i2;
    }

    public static final int i(float f, int i, int i2) {
        return Math.round(i + (i2 * f));
    }

    public static final int j(float f, int i, int i2) {
        return Math.round(i + (i2 * f));
    }

    public static final Rect k(String str, float f, Typeface typeface) {
        Rect rect = new Rect();
        if (woy.am(str)) {
            return rect;
        }
        Paint paint = new Paint();
        paint.setTextSize(f);
        paint.setTypeface(typeface);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect;
    }

    public static final ukx l(ukq ukqVar, pka pkaVar, yfq yfqVar, yfq yfqVar2, List list, abct abctVar, byte[] bArr, abfg abfgVar, List list2, abgl abglVar, yfq yfqVar3, abbm[] abbmVarArr, byte[] bArr2, int i, toz tozVar, yfy yfyVar) {
        yfq yfqVarO;
        wub.H(abglVar != null);
        List arrayList = list == null ? new ArrayList() : list;
        if (list2 == null) {
            int i2 = yfq.d;
            yfqVarO = yls.a;
        } else {
            yfqVarO = yfq.o(list2);
        }
        return new ukx(ukqVar, pkaVar, abglVar, yfqVar, yfqVar2, arrayList, abctVar, bArr, abfgVar, yfqVarO, yfqVar3, abbmVarArr == null ? new abbm[0] : abbmVarArr, bArr2, i, tozVar, yfyVar);
    }

    public static pjy m(tox toxVar, ukr ukrVar, ukp ukpVar, String str, String str2) {
        abnp abnpVarN = pjy.a.n();
        abnpVarN.t();
        pjy pjyVar = (pjy) abnpVarN.b;
        String str3 = toxVar.a;
        str3.getClass();
        pjyVar.b |= 1;
        pjyVar.c = str3;
        abnp abnpVarN2 = abls.a.n();
        abnpVarN2.t();
        abls ablsVar = (abls) abnpVarN2.b;
        ablsVar.b |= 2;
        ablsVar.d = ukpVar.b;
        abnpVarN2.t();
        abls ablsVar2 = (abls) abnpVarN2.b;
        ablsVar2.b |= 4;
        ablsVar2.e = ukpVar.c;
        abnpVarN2.t();
        abls ablsVar3 = (abls) abnpVarN2.b;
        ablsVar3.b |= 1;
        ablsVar3.c = ukpVar.a;
        abls ablsVar4 = (abls) abnpVarN2.q();
        abnpVarN.t();
        pjy pjyVar2 = (pjy) abnpVarN.b;
        ablsVar4.getClass();
        pjyVar2.f = ablsVar4;
        pjyVar2.b |= 16;
        if (!toxVar.d) {
            String str4 = toxVar.b;
            abnpVarN.t();
            pjy pjyVar3 = (pjy) abnpVarN.b;
            str4.getClass();
            pjyVar3.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            pjyVar3.i = str4;
        }
        tzy tzyVar = ukpVar.d;
        if (tzyVar != null) {
            String strF = tzyVar.b.f();
            abnpVarN.t();
            pjy pjyVar4 = (pjy) abnpVarN.b;
            pjyVar4.b |= 32;
            pjyVar4.g = strF;
        }
        String str5 = ukrVar.m;
        if (str5 != null) {
            abnpVarN.t();
            pjy pjyVar5 = (pjy) abnpVarN.b;
            pjyVar5.b |= 8;
            pjyVar5.e = str5;
        }
        String str6 = ukrVar.n;
        if (str6 != null) {
            abnpVarN.t();
            pjy pjyVar6 = (pjy) abnpVarN.b;
            pjyVar6.b |= 1024;
            pjyVar6.j = str6;
        }
        String str7 = ukrVar.o;
        if (str7 != null) {
            abnpVarN.t();
            pjy pjyVar7 = (pjy) abnpVarN.b;
            pjyVar7.b |= 2048;
            pjyVar7.k = str7;
        }
        abnpVarN.t();
        pjy pjyVar8 = (pjy) abnpVarN.b;
        str2.getClass();
        pjyVar8.b |= 2;
        pjyVar8.d = str2;
        abnpVarN.t();
        pjy pjyVar9 = (pjy) abnpVarN.b;
        str.getClass();
        pjyVar9.b |= 64;
        pjyVar9.h = str;
        return (pjy) abnpVarN.q();
    }

    public static boolean n(pka pkaVar, tmb tmbVar) {
        return (pkaVar.b & 32) != 0 && tmbVar.a() > pkaVar.h;
    }

    public static boolean o(int i) {
        return (i & 2) != 0;
    }

    public static boolean p(pka pkaVar, tmb tmbVar) {
        return (pkaVar.b & 64) != 0 && tmbVar.a() > pkaVar.i;
    }

    public static boolean q(int i, boolean z) {
        return !o(i);
    }

    public static xuh r(byte[] bArr, int i, int i2) throws abon {
        try {
            abmw abmwVarP = abmw.P(bArr, i, i2);
            while (!abmwVarP.F()) {
                int iE = abmwVarP.e();
                int iQ = abmwVarP.q();
                if (iQ == 82) {
                    return new xuh(iE + i, i + abmwVarP.e(), ((abmt) abmwVarP).l(), null);
                }
                abmwVarP.H(iQ);
            }
            return null;
        } catch (IOException e) {
            throw new abon(e);
        }
    }

    public static float s(int i) {
        return i / 8.0f;
    }

    public static float t(int i, int i2) {
        if (i2 == 0) {
            return 30.0f;
        }
        return i + s(i2);
    }

    public static float u(int i, int i2) {
        if (i2 == 0) {
            return 30.0f;
        }
        return i + s(i2);
    }

    public static float v(int i, int i2) {
        return i > 0 ? i2 == 0 ? i - 1 : i + s(i2) : s(i2);
    }

    public static float w(int i, int i2) {
        return i2 == 0 ? Math.max(0, i - 4) : i + s(i2);
    }

    public static boolean x(int i, int i2) {
        return (i & i2) != 0;
    }

    public static yfq y(abcv abcvVar) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        for (abcp abcpVar : abcvVar.w) {
            int iAr = wox.ar(abcpVar.b);
            if (iAr == 0) {
                iAr = 10;
            }
            int iAr2 = a.ar(abcpVar.c);
            if (iAr2 == 0) {
                iAr2 = 2;
            }
            yflVar.i(new ujg(iAr, iAr2));
        }
        return yflVar.g();
    }

    public static final boolean z(boolean z, uii uiiVar, List list) {
        return (!z || uiiVar == null || list == null) ? false : true;
    }

    public final synchronized void a() {
        throw null;
    }

    public final synchronized void b() {
        throw null;
    }

    public uqw() {
    }
}
