package com.carstream.tech.mirror;

import android.content.ComponentName;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.Surface;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.carstream.tech.core.license.NativeGuard;
import com.carstream.tech.mirror.MirrorServer;
import defpackage.ad;
import defpackage.d3;
import defpackage.d7;
import defpackage.f8;
import defpackage.m7;
import defpackage.n7;
import defpackage.o1;
import defpackage.o7;
import defpackage.p5;
import defpackage.r7;
import defpackage.y2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class MirrorServer {
    public static f8 A = null;
    public static boolean A0 = false;
    public static int B = 0;
    public static final ConcurrentHashMap B0;
    public static VirtualDisplay C = null;
    public static final String C0;
    public static VirtualDisplay D = null;
    public static volatile String D0 = null;
    public static f8 E = null;
    public static volatile boolean E0 = false;
    public static f8 F = null;
    public static volatile String F0 = null;
    public static VirtualDisplay G = null;
    public static final String G0;
    public static VirtualDisplay H = null;
    public static final AtomicBoolean H0;
    public static volatile int I = -1;
    public static volatile boolean I0 = false;
    public static volatile int J = -1;
    public static volatile long J0 = 0;
    public static final d7 K;
    public static volatile int K0 = 0;
    public static volatile int L = 0;
    public static volatile int L0 = 0;
    public static volatile long M = 0;
    public static volatile int M0 = 0;
    public static volatile long N = 0;
    public static volatile int N0 = 0;
    public static volatile int O = 0;
    public static volatile int O0 = 0;
    public static volatile int P = 0;
    public static volatile boolean P0 = false;
    public static volatile long Q = 0;
    public static VirtualDisplay Q0 = null;
    public static volatile int R = 0;
    public static f8 R0 = null;
    public static volatile int S = 0;
    public static volatile int S0 = 0;
    public static volatile int T = 0;
    public static Surface T0 = null;
    public static volatile int U = 0;
    public static final int[][] U0;
    public static volatile boolean V = false;
    public static volatile int V0 = 0;
    public static volatile int W = 0;
    public static volatile boolean W0 = false;
    public static volatile int X = 0;
    public static volatile boolean X0 = false;
    public static volatile int Y = 0;
    public static volatile long Y0 = 0;
    public static volatile int Z = 0;
    public static volatile long Z0 = 0;
    public static int a = 5299;
    public static volatile int a0 = 0;
    public static volatile OutputStream a1 = null;
    public static volatile int b = -1;
    public static volatile int b0 = 0;
    public static volatile Socket b1 = null;
    public static volatile MediaCodec c = null;
    public static volatile boolean c0 = false;
    public static int c1 = 0;
    public static volatile VirtualDisplay d = null;
    public static volatile boolean d0 = false;
    public static int d1 = 0;
    public static volatile Surface e = null;
    public static volatile boolean e0 = false;
    public static boolean e1 = false;
    public static volatile byte[] f = null;
    public static long f0 = 0;
    public static boolean f1 = false;
    public static volatile boolean g = false;
    public static final ConcurrentHashMap g0;
    public static boolean g1 = false;
    public static volatile String h = null;
    public static volatile boolean h0 = false;
    public static boolean h1 = false;
    public static volatile int i = -1;
    public static volatile boolean i0 = false;
    public static boolean i1 = false;
    public static volatile int j = -1;
    public static volatile boolean j0 = false;
    public static boolean j1 = false;
    public static volatile int k = -1;
    public static volatile boolean k0 = false;
    public static boolean k1 = false;
    public static volatile boolean l = false;
    public static final long l0;
    public static final Object l1;
    public static volatile boolean m = false;
    public static final String m0;
    public static final int[] m1;
    public static volatile long n = 0;
    public static final String n0;
    public static final float[] n1;
    public static int o = 0;
    public static volatile int o0 = 0;
    public static final float[] o1;
    public static int p = 0;
    public static final String p0;
    public static int p1 = 0;
    public static int q = 0;
    public static String q0 = null;
    public static int q1 = 0;
    public static int r = 0;
    public static final Object r0;
    public static int r1 = 0;
    public static int s = 8000000;
    public static long s0 = 0;
    public static boolean s1 = false;
    public static int t = 30;
    public static int t0 = 0;
    public static boolean t1 = false;
    public static volatile int u = -1;
    public static boolean u0 = false;
    public static boolean u1 = false;
    public static volatile int v = -1;
    public static int v0 = 0;
    public static boolean v1 = false;
    public static volatile int w = -1;
    public static boolean w0;
    public static Object w1;
    public static DisplayManager x;
    public static volatile long x0;
    public static Method x1;
    public static Context y;
    public static int y0;
    public static f8 z;
    public static int z0;

    static {
        d7 d7Var = new d7();
        d7Var.c = 2.0f;
        d7Var.i = -1;
        d7Var.j = -1;
        d7Var.k = -1;
        d7Var.n = 0;
        d7Var.q = -1;
        d7Var.r = 0;
        d7Var.t = -1;
        d7Var.u = 0L;
        d7Var.w = 0L;
        d7Var.x = -1;
        d7Var.y = -1;
        d7Var.z = -1;
        d7Var.A = 100;
        K = d7Var;
        L = -1;
        M = 0L;
        N = 0L;
        O = -1;
        P = -1;
        Q = 0L;
        R = 0;
        S = 0;
        T = 0;
        U = 0;
        V = false;
        W = -1;
        X = -1;
        Y = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        Z = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        a0 = 0;
        b0 = 0;
        c0 = false;
        d0 = false;
        e0 = false;
        f0 = 0L;
        g0 = new ConcurrentHashMap();
        h0 = false;
        i0 = false;
        j0 = true;
        k0 = false;
        l0 = System.currentTimeMillis();
        m0 = a().concat("/helper-trangthai.txt");
        n0 = a().concat("/helper-diag.txt");
        o0 = 0;
        p0 = a().concat("/co-man-xe.txt");
        q0 = null;
        r0 = new Object();
        s0 = 0L;
        t0 = 0;
        u0 = false;
        v0 = 0;
        w0 = false;
        x0 = 0L;
        y0 = 0;
        z0 = 0;
        A0 = false;
        B0 = new ConcurrentHashMap();
        C0 = a().concat("/helper-bocuc.txt");
        D0 = "\u0000";
        E0 = false;
        F0 = null;
        G0 = a().concat("/helper-restore.txt");
        H0 = new AtomicBoolean(false);
        I0 = false;
        J0 = 0L;
        P0 = false;
        S0 = -1;
        U0 = new int[][]{new int[]{0, 0}, new int[]{1, 0}, new int[]{2, 0}, new int[]{0, 1}, new int[]{1, 1}, new int[]{2, 1}};
        V0 = 0;
        W0 = false;
        X0 = false;
        Y0 = 0L;
        Z0 = System.currentTimeMillis();
        c1 = 0;
        d1 = 0;
        e1 = false;
        f1 = false;
        g1 = false;
        h1 = false;
        i1 = false;
        j1 = false;
        k1 = false;
        l1 = new Object();
        m1 = new int[10];
        n1 = new float[10];
        o1 = new float[10];
        p1 = 0;
        q1 = -1;
        r1 = 0;
        s1 = false;
        t1 = false;
        u1 = false;
        v1 = false;
    }

    public static boolean A(String str) {
        if (!str.isEmpty() && str.length() <= 128) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '.' || cCharAt == '_'))) {
                }
            }
            return true;
        }
        return false;
    }

    public static int B(int i2, byte[] bArr) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public static void C(VirtualDisplay virtualDisplay) {
        Class cls = Integer.TYPE;
        int i2 = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder();
        try {
            int displayId = virtualDisplay.getDisplay().getDisplayId();
            sb.append("man ");
            sb.append(displayId);
            sb.append(" sdk");
            sb.append(i2);
            sb.append((r & 16384) != 0 ? " ownfocus=1" : " ownfocus=0");
            Object objInvoke = Class.forName(y2.CLS_IWM_STUB.a()).getMethod(y2.R_ASINTERFACE.a(), IBinder.class).invoke(null, (IBinder) Class.forName(y2.CLS_SERVICEMGR.a()).getMethod(y2.R_GETSERVICE.a(), String.class).invoke(null, y2.SVC_WINDOW.a()));
            try {
                objInvoke.getClass().getMethod(y2.R_SETIMEPOLICY.a(), cls, cls).invoke(objInvoke, Integer.valueOf(displayId), 0);
                sb.append(" dat=OK");
            } catch (Throwable th) {
                sb.append(" dat=");
                sb.append(K(th));
            }
            try {
                objInvoke.getClass().getMethod(y2.R_SETSHOWIME.a(), cls, Boolean.TYPE).invoke(objInvoke, Integer.valueOf(displayId), Boolean.TRUE);
                sb.append(" cu=OK");
            } catch (Throwable th2) {
                sb.append(" cu=");
                sb.append(K(th2));
            }
            try {
                Object objInvoke2 = objInvoke.getClass().getMethod(y2.R_GETIMEPOLICY.a(), cls).invoke(objInvoke, Integer.valueOf(displayId));
                sb.append(" doclai=");
                sb.append(objInvoke2);
            } catch (Throwable th3) {
                sb.append(" doclai=");
                sb.append(K(th3));
            }
            try {
                String strW = w(y2.CMD_GETIME.a());
                if (strW != null) {
                    String strTrim = strW.trim();
                    int iIndexOf = strTrim.indexOf(47);
                    sb.append(" ime=");
                    if (iIndexOf > 0) {
                        strTrim = strTrim.substring(0, iIndexOf);
                    }
                    sb.append(strTrim);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th4) {
            sb.append(" LOI=");
            sb.append(K(th4));
        }
        m("ban phim: ".concat(String.valueOf(sb)));
        if (h0) {
            return;
        }
        h0 = true;
        Thread thread = new Thread(new o1(3), "cs-soi-ime");
        thread.setDaemon(true);
        thread.start();
    }

    public static void D(int i2, int i3, int i4) {
        int i5 = i4 & 255;
        int i6 = (i4 >>> 8) & 255;
        if (!e1) {
            e1 = true;
            m("cham: HELPER NHAN duoc (" + i2 + "," + i3 + " type=" + i5 + " ngon=" + i6 + ")");
        }
        if (i6 == 0) {
            boolean zJ = false;
            d7 d7Var = K;
            if (i5 == 0) {
                try {
                    zJ = d7Var.j(i2, i3, i5);
                } catch (Throwable th) {
                    ad.f("chrome cham loi: ", th);
                    d7Var.n = 0;
                }
                k1 = zJ;
                if (zJ) {
                    int i7 = c1 + 1;
                    c1 = i7;
                    if (i7 % 20 == 1) {
                        J("cham: khung dieu khien NUOT (" + i7 + " lan) tai " + i2 + "," + i3);
                    }
                    if (f1) {
                        return;
                    }
                    f1 = true;
                    m("cham: khung dieu khien NUOT (khong xuong app)");
                    return;
                }
            } else if (k1) {
                try {
                    d7Var.j(i2, i3, i5);
                } catch (Throwable th2) {
                    ad.f("chrome cham loi: ", th2);
                    d7Var.n = 0;
                }
                if (i5 == 1) {
                    k1 = false;
                    return;
                }
                return;
            }
        } else if (k1) {
            return;
        }
        int i8 = d1 + 1;
        d1 = i8;
        if (i8 % 20 == 1) {
            J("cham: xuong app (" + i8 + " lan) tai " + i2 + "," + i3);
        }
        if (!g1) {
            g1 = true;
            m("cham: xuong app");
        }
        E(i2, i3, i5, i6);
    }

    public static void E(int i2, int i3, int i4, int i5) {
        if (I0 && S0 > 0) {
            G(S0, i2, i3, i4, i5);
            return;
        }
        if (i()) {
            int iN = n();
            int i6 = (iN < 0 || i <= 0 || i2 < iN) ? 0 : 1;
            int iG0 = g0(i6);
            int i7 = (((iG0 < 0 || i3 < iG0 || T(i6 == 0 ? 2 : 3) <= 0) ? 0 : 1) * 2) + i6;
            int iT = T(i7);
            int[] iArrG = g(i7);
            int[] iArrV = V(i7);
            if (iT > 0 && iArrG != null && iArrV != null) {
                int iRound = Math.round(((i2 - iArrG[0]) * iArrV[2]) / iArrG[2]);
                int i8 = iArrV[2];
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > i8) {
                    iRound = i8;
                }
                int iRound2 = Math.round(((i3 - iArrG[1]) * iArrV[3]) / iArrG[3]);
                int i9 = iArrV[3];
                int i10 = iRound2 >= 0 ? iRound2 > i9 ? i9 : iRound2 : 0;
                L = iT;
                G(iT, iRound, i10, i4, i5);
                return;
            }
        }
        int i11 = b;
        if (j > 0 && i > 0 && i2 >= j) {
            i11 = i;
            i2 -= j;
        }
        L = i11;
        G(i11, i2, i3, i4, i5);
    }

    public static void F(MotionEvent motionEvent) throws IllegalAccessException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Class cls = Integer.TYPE;
        y2 y2Var = y2.R_INJECT;
        y2 y2Var2 = y2.R_GETINSTANCE;
        if (x1 == null) {
            try {
                Class<?> cls2 = Class.forName(y2.R_INPUTMGRG.a());
                w1 = cls2.getMethod(y2Var2.a(), null).invoke(null, null);
                x1 = cls2.getMethod(y2Var.a(), InputEvent.class, cls);
            } catch (Throwable unused) {
                Class<?> cls3 = Class.forName(y2.R_INPUTMGR.a());
                w1 = cls3.getMethod(y2Var2.a(), null).invoke(null, null);
                x1 = cls3.getMethod(y2Var.a(), InputEvent.class, cls);
            }
            x1.setAccessible(true);
        }
        x1.invoke(w1, motionEvent, 0);
    }

    public static void G(int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            synchronized (l1) {
                try {
                    boolean z2 = false;
                    if (i2 != q1 && p1 > 0) {
                        p1 = 0;
                    }
                    q1 = i2;
                    int i11 = 0;
                    while (true) {
                        i7 = p1;
                        if (i11 >= i7) {
                            i11 = -1;
                            break;
                        } else if (m1[i11] != i6) {
                            i11++;
                        }
                    }
                    if (i5 == 0) {
                        if (i11 >= 0) {
                            i7 = i11;
                        } else {
                            if (i7 >= 10) {
                                return;
                            }
                            p1 = i7 + 1;
                            m1[i7] = i6;
                        }
                        n1[i7] = i3;
                        o1[i7] = i4;
                        if (p1 == 1) {
                            Y0 = jUptimeMillis;
                            i11 = i7;
                            i9 = 0;
                        } else {
                            i8 = (i7 << 8) | 5;
                            i11 = i7;
                            i9 = i8;
                        }
                    } else if (i5 == 2) {
                        if (i11 < 0) {
                            return;
                        }
                        n1[i11] = i3;
                        o1[i11] = i4;
                        i9 = 2;
                    } else {
                        if (i11 < 0) {
                            return;
                        }
                        n1[i11] = i3;
                        o1[i11] = i4;
                        i8 = i7 == 1 ? 1 : (i11 << 8) | 6;
                        i9 = i8;
                    }
                    if (Y0 == 0) {
                        Y0 = jUptimeMillis;
                    }
                    int i12 = p1;
                    MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i12];
                    MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                        pointerProperties.id = m1[i13];
                        pointerProperties.toolType = 1;
                        pointerPropertiesArr[i13] = pointerProperties;
                        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                        pointerCoords.x = n1[i13];
                        pointerCoords.y = o1[i13];
                        pointerCoords.pressure = 1.0f;
                        pointerCoords.size = 1.0f;
                        pointerCoordsArr[i13] = pointerCoords;
                    }
                    if (i5 == 1) {
                        while (true) {
                            i10 = p1 - 1;
                            if (i11 >= i10) {
                                break;
                            }
                            int[] iArr = m1;
                            int i14 = i11 + 1;
                            iArr[i11] = iArr[i14];
                            float[] fArr = n1;
                            fArr[i11] = fArr[i14];
                            float[] fArr2 = o1;
                            fArr2[i11] = fArr2[i14];
                            i11 = i14;
                        }
                        p1 = i10;
                    }
                    if (i12 > 1 && !h1) {
                        h1 = true;
                        m("cham: " + i12 + "n");
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(Y0, jUptimeMillis, i9, i12, pointerPropertiesArr, pointerCoordsArr, 0, 0, 1.0f, 1.0f, 0, 0, InputDeviceCompat.SOURCE_TOUCHSCREEN, 0);
                    try {
                        MotionEvent.class.getMethod(y2.M_SETDISPLAYID.a(), Integer.TYPE).invoke(motionEventObtain, Integer.valueOf(i2));
                        z2 = true;
                    } catch (Throwable th) {
                        if (!v1) {
                            v1 = true;
                            J("!! dat man cham KHONG DUOC (" + String.valueOf(th) + ") - cham se di nham man mac dinh");
                            m("cham: DAT MAN HONG (" + th.getClass().getSimpleName() + ") - cham di nham man dien thoai");
                        }
                    }
                    if (z2 && !u1) {
                        u1 = true;
                        J("cham dat man " + i2);
                    }
                    if (!s1) {
                        s1 = true;
                        m("cham: nhan duoc, dat man " + (z2 ? "OK" : "KHONG DUOC"));
                    }
                    F(motionEventObtain);
                    if (!t1) {
                        t1 = true;
                        m("cham: tiem OK");
                    }
                    motionEventObtain.recycle();
                } finally {
                }
            }
        } catch (Throwable th2) {
            Throwable cause = th2;
            while (cause.getCause() != null && cause.getCause() != cause) {
                cause = cause.getCause();
            }
            int i15 = r1 + 1;
            r1 = i15;
            if (i15 <= 3) {
                m("cham: tiem LOI #" + i15 + " " + cause.getClass().getName() + (cause.getMessage() != null ? ad.g(" :: ", cause.getMessage()) : "") + (cause != th2 ? ad.d(" (boc trong ", th2.getClass().getSimpleName(), ")") : ""));
            }
            J("inject loi #" + r1 + ": " + String.valueOf(cause) + " (boc: " + String.valueOf(th2) + ")");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6 A[Catch: all -> 0x004d, TryCatch #3 {all -> 0x004d, blocks: (B:14:0x0042, B:19:0x0050, B:21:0x005d, B:24:0x0068, B:26:0x0084, B:28:0x008e, B:29:0x009b, B:30:0x009e, B:37:0x00b5, B:43:0x00ca, B:54:0x00ec, B:56:0x00f6, B:58:0x00fe, B:60:0x0106, B:64:0x010e, B:66:0x0121, B:69:0x0129, B:71:0x012d, B:72:0x0133, B:75:0x013c, B:77:0x0142, B:79:0x0146, B:80:0x014c, B:83:0x0153, B:85:0x0157, B:87:0x015d, B:89:0x0161, B:90:0x0167, B:91:0x016a, B:94:0x0173, B:96:0x0179, B:97:0x017e, B:98:0x0181), top: B:116:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121 A[Catch: all -> 0x004d, TryCatch #3 {all -> 0x004d, blocks: (B:14:0x0042, B:19:0x0050, B:21:0x005d, B:24:0x0068, B:26:0x0084, B:28:0x008e, B:29:0x009b, B:30:0x009e, B:37:0x00b5, B:43:0x00ca, B:54:0x00ec, B:56:0x00f6, B:58:0x00fe, B:60:0x0106, B:64:0x010e, B:66:0x0121, B:69:0x0129, B:71:0x012d, B:72:0x0133, B:75:0x013c, B:77:0x0142, B:79:0x0146, B:80:0x014c, B:83:0x0153, B:85:0x0157, B:87:0x015d, B:89:0x0161, B:90:0x0167, B:91:0x016a, B:94:0x0173, B:96:0x0179, B:97:0x017e, B:98:0x0181), top: B:116:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c A[Catch: all -> 0x004d, TryCatch #3 {all -> 0x004d, blocks: (B:14:0x0042, B:19:0x0050, B:21:0x005d, B:24:0x0068, B:26:0x0084, B:28:0x008e, B:29:0x009b, B:30:0x009e, B:37:0x00b5, B:43:0x00ca, B:54:0x00ec, B:56:0x00f6, B:58:0x00fe, B:60:0x0106, B:64:0x010e, B:66:0x0121, B:69:0x0129, B:71:0x012d, B:72:0x0133, B:75:0x013c, B:77:0x0142, B:79:0x0146, B:80:0x014c, B:83:0x0153, B:85:0x0157, B:87:0x015d, B:89:0x0161, B:90:0x0167, B:91:0x016a, B:94:0x0173, B:96:0x0179, B:97:0x017e, B:98:0x0181), top: B:116:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173 A[Catch: all -> 0x004d, TryCatch #3 {all -> 0x004d, blocks: (B:14:0x0042, B:19:0x0050, B:21:0x005d, B:24:0x0068, B:26:0x0084, B:28:0x008e, B:29:0x009b, B:30:0x009e, B:37:0x00b5, B:43:0x00ca, B:54:0x00ec, B:56:0x00f6, B:58:0x00fe, B:60:0x0106, B:64:0x010e, B:66:0x0121, B:69:0x0129, B:71:0x012d, B:72:0x0133, B:75:0x013c, B:77:0x0142, B:79:0x0146, B:80:0x014c, B:83:0x0153, B:85:0x0157, B:87:0x015d, B:89:0x0161, B:90:0x0167, B:91:0x016a, B:94:0x0173, B:96:0x0179, B:97:0x017e, B:98:0x0181), top: B:116:0x0040 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.mirror.MirrorServer.H():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0456 A[Catch: all -> 0x07b3, TRY_LEAVE, TryCatch #13 {all -> 0x07b3, blocks: (B:3:0x0004, B:4:0x0093, B:6:0x009b, B:8:0x009f, B:11:0x00a7, B:12:0x00ac, B:14:0x00b2, B:30:0x0120, B:32:0x0125, B:34:0x0131, B:36:0x0135, B:37:0x0138, B:39:0x013e, B:41:0x0142, B:43:0x014a, B:45:0x014e, B:47:0x0154, B:49:0x0158, B:53:0x015f, B:55:0x017d, B:56:0x0180, B:57:0x0182, B:59:0x018e, B:61:0x01c0, B:63:0x01c6, B:65:0x01cb, B:64:0x01c9, B:67:0x01d2, B:70:0x01dc, B:93:0x0279, B:165:0x0442, B:170:0x0456, B:178:0x046e, B:186:0x0482, B:194:0x0496, B:201:0x04a8, B:203:0x04b7, B:217:0x04f2, B:222:0x0501, B:225:0x0508, B:226:0x0559, B:213:0x04e7, B:214:0x04ea, B:215:0x04ed, B:216:0x04f0, B:227:0x056a, B:229:0x0594, B:231:0x05a0, B:233:0x05a6, B:234:0x05ad, B:236:0x05b1, B:237:0x0602, B:238:0x0605, B:242:0x0616, B:244:0x0621, B:248:0x0634, B:250:0x0638, B:252:0x063c, B:255:0x064b, B:257:0x069b, B:259:0x06a8, B:258:0x069f, B:260:0x06d4, B:270:0x070a, B:272:0x070e, B:284:0x073b, B:286:0x0749, B:287:0x074f, B:289:0x075b, B:293:0x0768, B:295:0x076c, B:299:0x0777, B:301:0x078b, B:298:0x0773, B:292:0x0764, B:302:0x07ac, B:279:0x0720, B:281:0x0726, B:275:0x0715, B:267:0x06f6, B:269:0x06fc, B:263:0x06e8, B:245:0x062a, B:228:0x0573, B:84:0x0204, B:86:0x0224, B:88:0x0229, B:90:0x0250, B:91:0x0258, B:94:0x027f, B:96:0x0283, B:109:0x02a7, B:111:0x02c0, B:112:0x02c8, B:113:0x02e4, B:115:0x02e8, B:117:0x02f0, B:119:0x02fe, B:121:0x0311, B:123:0x0315, B:124:0x031c, B:134:0x03a8, B:138:0x03b5, B:140:0x03bc, B:144:0x03c7, B:143:0x03c5, B:145:0x03cc, B:147:0x03d0, B:149:0x03d4, B:151:0x03e4, B:152:0x03f0, B:154:0x03f4, B:156:0x03f8, B:158:0x0406, B:159:0x0410, B:161:0x0416, B:163:0x041a, B:164:0x041c, B:137:0x03b3, B:125:0x0385, B:129:0x0395, B:133:0x03a3, B:132:0x03a1, B:128:0x0393, B:25:0x00fb, B:27:0x0115), top: B:346:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x046a  */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I(android.view.Surface r39) {
        /*
            Method dump skipped, instructions count: 1983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.mirror.MirrorServer.I(android.view.Surface):void");
    }

    public static void J(String str) {
        System.out.println("[BBMIRROR] " + str);
    }

    public static String K(Throwable th) {
        for (int i2 = 0; i2 < 3 && (th instanceof InvocationTargetException) && th.getCause() != null; i2++) {
            th = th.getCause();
        }
        String simpleName = th.getClass().getSimpleName();
        String message = th.getMessage();
        if (message == null || message.isEmpty()) {
            return simpleName;
        }
        String strReplace = message.replace(' ', '_');
        if (strReplace.length() > 70) {
            strReplace = strReplace.substring(0, 70);
        }
        return simpleName + ":" + strReplace;
    }

    public static void L() {
        if (E0) {
            try {
                String strE = e();
                if (strE.equals(D0)) {
                    return;
                }
                D0 = strE;
                FileOutputStream fileOutputStream = new FileOutputStream(C0, false);
                fileOutputStream.write(strE.getBytes("UTF-8"));
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static VirtualDisplay M(String str, int i2, int i3, int i4, Surface surface, int i5) {
        y2 y2Var = y2.CLS_VDCONFIG;
        try {
            Class<?> cls = Class.forName(y2Var.a());
            Class<?> cls2 = Class.forName(y2Var.a().concat("$Builder"));
            Class cls3 = Integer.TYPE;
            Object objNewInstance = cls2.getConstructor(String.class, cls3, cls3, cls3).newInstance(str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            cls2.getMethod(y2.R_SETSURFACE.a(), Surface.class).invoke(objNewInstance, surface);
            cls2.getMethod(y2.R_SETFLAGS.a(), cls3).invoke(objNewInstance, Integer.valueOf(i5));
            cls2.getMethod(y2.R_DGROUPNAME.a(), String.class).invoke(objNewInstance, str.concat("-group"));
            VirtualDisplay virtualDisplay = (VirtualDisplay) x.getClass().getMethod(y2.M_CREATEVD.a(), cls).invoke(x, cls2.getMethod(y2.R_BUILD.a(), null).invoke(objNewInstance, null));
            if (virtualDisplay != null) {
                J("VD '" + str + "' tao voi NHOM NGUON RIENG");
                m("man ao " + str + " OK id=" + virtualDisplay.getDisplay().getDisplayId());
                C(virtualDisplay);
                return virtualDisplay;
            }
        } catch (Throwable th) {
            J("setDisplayGroupName khong co (" + String.valueOf(th) + ")");
            try {
                Method[] methods = Class.forName(y2Var.a().concat("$Builder")).getMethods();
                for (Method method : methods) {
                    if (method.getName().startsWith("set")) {
                        J("   Builder." + method.getName());
                    }
                }
            } catch (Throwable unused) {
            }
        }
        try {
            VirtualDisplay virtualDisplayCreateVirtualDisplay = x.createVirtualDisplay(str, i2, i3, i4, surface, i5 | 32768);
            if (virtualDisplayCreateVirtualDisplay != null) {
                J("VD '" + str + "' tao voi co DEVICE_DISPLAY_GROUP (32768)");
                m("man ao " + str + " OK id=" + virtualDisplayCreateVirtualDisplay.getDisplay().getDisplayId());
                C(virtualDisplayCreateVirtualDisplay);
                return virtualDisplayCreateVirtualDisplay;
            }
        } catch (Throwable th2) {
            J("co DEVICE_DISPLAY_GROUP khong duoc (" + String.valueOf(th2) + ") -> dung cach cu");
        }
        try {
            VirtualDisplay virtualDisplayCreateVirtualDisplay2 = x.createVirtualDisplay(str, i2, i3, i4, surface, i5);
            m("man ao " + str + (virtualDisplayCreateVirtualDisplay2 != null ? " OK id=" + virtualDisplayCreateVirtualDisplay2.getDisplay().getDisplayId() : " NULL"));
            if (virtualDisplayCreateVirtualDisplay2 != null) {
                C(virtualDisplayCreateVirtualDisplay2);
            }
            return virtualDisplayCreateVirtualDisplay2;
        } catch (Throwable th3) {
            m("man ao " + str + ": LOI " + th3.getClass().getSimpleName());
            throw th3;
        }
    }

    public static boolean N(int i2, HashMap map) throws InterruptedException, IOException {
        int iT = T(i2);
        boolean z2 = false;
        if (iT <= 0) {
            return false;
        }
        String str = (String) map.get("p" + i2);
        if (str != null && !str.equals("-") && !str.startsWith("com.carstream.tech") && A(str)) {
            z2 = true;
        }
        v(y2.AM_START_DISPLAY.a() + iT + " --activity-multiple-task" + j() + (z2 ? ad.g(" --es csopen ", str) : "") + " -n com.carstream.tech/com.carstream.tech.launcher.CarLauncherActivity");
        return z2;
    }

    public static void O() {
        int i2 = S0;
        if (i2 <= 0) {
            return;
        }
        new Thread(new o7(i2, 8), "qs-start").start();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void P() {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.mirror.MirrorServer.P():void");
    }

    public static void Q(int i2) throws InterruptedException, IOException {
        v("wm" + y2.WM_IGNORE_ORIENT.a() + i2 + " true");
    }

    public static void R(String str) {
        if (k0) {
            return;
        }
        L();
        k0 = true;
        J("NGU DONG: ".concat(str));
        try {
            if (i0) {
                W(true);
                i0 = false;
            }
        } catch (Throwable unused) {
        }
        try {
            VirtualDisplay virtualDisplay = D;
            if (virtualDisplay != null) {
                virtualDisplay.release();
                D = null;
                i = -1;
            }
        } catch (Throwable unused2) {
        }
        try {
            VirtualDisplay virtualDisplay2 = Q0;
            if (virtualDisplay2 != null) {
                virtualDisplay2.release();
                Q0 = null;
                S0 = -1;
            }
        } catch (Throwable unused3) {
        }
        try {
            VirtualDisplay virtualDisplay3 = C;
            if (virtualDisplay3 != null) {
                virtualDisplay3.release();
                C = null;
            }
        } catch (Throwable unused4) {
        }
        try {
            VirtualDisplay virtualDisplay4 = G;
            if (virtualDisplay4 != null) {
                virtualDisplay4.release();
                G = null;
                I = -1;
            }
        } catch (Throwable unused5) {
        }
        try {
            VirtualDisplay virtualDisplay5 = H;
            if (virtualDisplay5 != null) {
                virtualDisplay5.release();
                H = null;
                J = -1;
            }
        } catch (Throwable unused6) {
        }
        W = -1;
        X = -1;
        Y = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        Z = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        a0 = 0;
        b0 = 0;
        d = null;
        e = null;
        j = -1;
        O = -1;
        k = -1;
        I0 = false;
        o0 = 0;
        J("da tha het display — nam cho app quay lai (khong ton pin)");
        z();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[Catch: all -> 0x000e, Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:20:0x0056, B:22:0x0063, B:24:0x006d, B:25:0x0075, B:28:0x007f, B:33:0x0092, B:23:0x0069), top: B:42:0x0056, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[Catch: all -> 0x000e, Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:20:0x0056, B:22:0x0063, B:24:0x006d, B:25:0x0075, B:28:0x007f, B:33:0x0092, B:23:0x0069), top: B:42:0x0056, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean S(java.lang.String r13) {
        /*
            java.lang.String r0 = ": da noi lai app"
            java.lang.String r1 = "chop noi-dut lan "
            java.lang.Object r2 = com.carstream.tech.mirror.MirrorServer.r0
            monitor-enter(r2)
            boolean r3 = com.carstream.tech.mirror.MirrorServer.j0     // Catch: java.lang.Throwable -> Le
            r4 = 1
            if (r3 == 0) goto L11
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            return r4
        Le:
            r13 = move-exception
            goto L95
        L11:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Le
            int r3 = com.carstream.tech.mirror.MirrorServer.t0     // Catch: java.lang.Throwable -> Le
            r7 = 3
            r8 = 0
            if (r3 < r7) goto L56
            int r3 = r3 + (-2)
            long r9 = (long) r3     // Catch: java.lang.Throwable -> Le
            r11 = 2000(0x7d0, double:9.88E-321)
            long r9 = r9 * r11
            r11 = 30000(0x7530, double:1.4822E-319)
            long r9 = java.lang.Math.min(r11, r9)     // Catch: java.lang.Throwable -> Le
            boolean r3 = com.carstream.tech.mirror.MirrorServer.u0     // Catch: java.lang.Throwable -> Le
            if (r3 != 0) goto L32
            com.carstream.tech.mirror.MirrorServer.u0 = r4     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "app CHOP noi-dut lien tuc — gian nhip noi lai (do pin)"
            m(r3)     // Catch: java.lang.Throwable -> Le
        L32:
            int r3 = com.carstream.tech.mirror.MirrorServer.t0     // Catch: java.lang.Throwable -> Le
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r7.<init>(r1)     // Catch: java.lang.Throwable -> Le
            r7.append(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = " -> cho "
            r7.append(r1)     // Catch: java.lang.Throwable -> Le
            r7.append(r9)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "ms"
            r7.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> Le
            J(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Thread.sleep(r9)     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L54
            goto L56
        L54:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            goto L94
        L56:
            java.net.Socket r1 = k(r8)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            long r9 = com.carstream.tech.mirror.MirrorServer.s0     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            long r5 = r5 - r9
            r9 = 3000(0xbb8, double:1.482E-320)
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 >= 0) goto L69
            int r3 = com.carstream.tech.mirror.MirrorServer.t0     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            int r3 = r3 + r4
            com.carstream.tech.mirror.MirrorServer.t0 = r3     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            goto L6d
        L69:
            com.carstream.tech.mirror.MirrorServer.t0 = r8     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            com.carstream.tech.mirror.MirrorServer.u0 = r8     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
        L6d:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            com.carstream.tech.mirror.MirrorServer.s0 = r5     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            java.lang.Class<com.carstream.tech.mirror.MirrorServer> r3 = com.carstream.tech.mirror.MirrorServer.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            com.carstream.tech.mirror.MirrorServer.b1 = r1     // Catch: java.lang.Throwable -> L90
            java.io.OutputStream r1 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L90
            com.carstream.tech.mirror.MirrorServer.a1 = r1     // Catch: java.lang.Throwable -> L90
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L90
            com.carstream.tech.mirror.MirrorServer.j0 = r4     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            java.lang.String r13 = r13.concat(r0)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            J(r13)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            o0()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            s()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            return r4
        L90:
            r13 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L90
            throw r13     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L93
        L93:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
        L94:
            return r8
        L95:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.mirror.MirrorServer.S(java.lang.String):boolean");
    }

    public static int T(int i2) {
        if (i2 == 0) {
            return b;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return I;
        }
        if (i2 != 3) {
            return -1;
        }
        return J;
    }

    public static int U() {
        return X(22);
    }

    public static int[] V(int i2) {
        int i3;
        int i4;
        int i5 = i2 & 1;
        int i6 = i2 >> 1;
        int iN = n();
        int i7 = -1;
        int i8 = i5 == 0 ? 0 : iN >= 0 ? iN : -1;
        if (i5 != 0 || iN < 0) {
            iN = o;
        }
        if (i8 < 0) {
            return null;
        }
        int iG0 = g0(i5);
        if (i6 == 0) {
            i7 = 0;
        } else if (iG0 >= 0) {
            i7 = iG0;
        }
        if (i6 != 0 || iG0 < 0) {
            iG0 = p;
        }
        if (i7 >= 0 && (i3 = iN - i8) >= 40 && (i4 = iG0 - i7) >= 40) {
            return new int[]{i8, i7, i3, i4};
        }
        return null;
    }

    public static void W(boolean z2) {
        long[] jArr;
        try {
            Class<?> cls = Class.forName(y2.CLS_SURFACECONTROL.a());
            try {
                jArr = (long[]) cls.getMethod(y2.R_PHYSIDS.a(), null).invoke(null, null);
            } catch (Throwable unused) {
            }
            IBinder iBinder = (jArr == null || jArr.length <= 0) ? null : (IBinder) cls.getMethod(y2.R_PHYSTOKEN.a(), Long.TYPE).invoke(null, Long.valueOf(jArr[0]));
            if (iBinder == null) {
                iBinder = (IBinder) cls.getMethod(y2.R_INTTOKEN.a(), null).invoke(null, null);
            }
            cls.getMethod(y2.R_SETPOWER.a(), IBinder.class, Integer.TYPE).invoke(null, iBinder, Integer.valueOf(z2 ? 2 : 0));
            J("tam nen man dien thoai -> ".concat(z2 ? "BAT" : "TAT"));
        } catch (Throwable th) {
            ad.f("panelPower loi: ", th);
        }
    }

    public static int X(int i2) {
        return Math.round(Math.max(1.0f, q / 160.0f) * i2);
    }

    public static String Y(String str) {
        int iIndexOf = str.indexOf(47);
        return iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
    }

    public static void Z(PowerManager powerManager, boolean z2) {
        y2 y2Var = y2.R_WAKEUP;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        try {
            if (!z2) {
                powerManager.getClass().getMethod(y2.R_USERACT.a(), cls2, cls, cls).invoke(powerManager, Long.valueOf(jUptimeMillis), 0, 0);
                return;
            }
            try {
                powerManager.getClass().getMethod(y2Var.a(), cls2, cls, String.class).invoke(powerManager, Long.valueOf(jUptimeMillis), 2, "mirror:carscreen");
            } catch (NoSuchMethodException unused) {
                powerManager.getClass().getMethod(y2Var.a(), cls2, String.class).invoke(powerManager, Long.valueOf(jUptimeMillis), "mirror:carscreen");
            }
        } catch (Throwable th) {
            int i2 = y0;
            y0 = i2 + 1;
            if (i2 < 3) {
                J("goi pm" + (z2 ? 1 : 0) + " loi: " + String.valueOf(th));
            }
        }
    }

    public static String a() {
        String str = System.getenv("CSEXT");
        return (str == null || str.length() <= 0) ? "/sdcard/Android/data/com.carstream.tech/files" : str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:0|2|(1:8)|9|(1:14)(1:13)|15|(1:17)(1:18)|19|(1:21)(1:22)|23|(1:25)(1:26)|(1:28)(1:29)|30|(1:32)(1:33)|34|(1:36)(1:37)|38|(1:40)|41|307|42|46|(1:48)(2:50|(1:52)(17:337|53|54|335|55|321|62|345|63|(1:65)|66|(4:360|68|(1:70)(1:73)|359)|80|(33:83|311|84|85|303|86|364|87|88|357|89|90|319|91|(4:93|309|94|95)(1:99)|100|305|101|(4:103|104|301|105)(1:109)|343|110|(1:112)|113|(1:115)(1:116)|117|(7:119|120|351|121|122|349|123)(1:128)|129|347|130|(1:132)|133|373|155)|371|156|(8:158|(1:160)(1:161)|162|(1:164)|165|(2:166|(1:379)(1:170))|171|(2:173|174)(9:175|(1:180)(1:179)|181|(1:183)|184|362|185|189|(6:190|(5:323|192|(1:194)(1:195)|196|197)(7:200|327|201|(5:203|(1:205)(1:206)|207|(1:209)(1:210)|(10:353|212|(3:214|(1:216)(1:217)|218)|219|313|220|221|199|382|285)(5:223|(8:225|(1:235)(2:232|(1:234))|236|325|88e|247|248|273)(1:275)|274|368|276))(1:278)|279|(4:281|(1:283)|284|381)(1:383)|285)|198|199|382|285)))(2:289|290)))|49|321|62|345|63|(0)|66|(0)|80|(33:83|311|84|85|303|86|364|87|88|357|89|90|319|91|(0)(0)|100|305|101|(0)(0)|343|110|(0)|113|(0)(0)|117|(0)(0)|129|347|130|(0)|133|373|155)|370|156|(0)(0)|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0404 A[Catch: all -> 0x0424, TRY_LEAVE, TryCatch #2 {all -> 0x0424, blocks: (B:101:0x03f8, B:103:0x0404), top: B:305:0x03f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0431 A[Catch: all -> 0x044b, TRY_LEAVE, TryCatch #21 {all -> 0x044b, blocks: (B:110:0x0429, B:112:0x0431), top: B:343:0x0429 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0451 A[Catch: all -> 0x03b2, TryCatch #9 {all -> 0x03b2, blocks: (B:91:0x037d, B:93:0x0394, B:95:0x03aa, B:100:0x03c0, B:113:0x044b, B:115:0x0451, B:117:0x046d, B:119:0x0471, B:99:0x03b9), top: B:319:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0471 A[Catch: all -> 0x03b2, TRY_LEAVE, TryCatch #9 {all -> 0x03b2, blocks: (B:91:0x037d, B:93:0x0394, B:95:0x03aa, B:100:0x03c0, B:113:0x044b, B:115:0x0451, B:117:0x046d, B:119:0x0471, B:99:0x03b9), top: B:319:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04cb A[Catch: all -> 0x04ce, TRY_LEAVE, TryCatch #23 {all -> 0x04ce, blocks: (B:130:0x04c1, B:132:0x04cb), top: B:347:0x04c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0541 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0544 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0984 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0245 A[Catch: all -> 0x024d, TRY_LEAVE, TryCatch #22 {all -> 0x024d, blocks: (B:63:0x0232, B:65:0x0245), top: B:345:0x0232 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0394 A[Catch: all -> 0x03b2, TRY_LEAVE, TryCatch #9 {all -> 0x03b2, blocks: (B:91:0x037d, B:93:0x0394, B:95:0x03aa, B:100:0x03c0, B:113:0x044b, B:115:0x0451, B:117:0x046d, B:119:0x0471, B:99:0x03b9), top: B:319:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b9 A[Catch: all -> 0x03b2, TryCatch #9 {all -> 0x03b2, blocks: (B:91:0x037d, B:93:0x0394, B:95:0x03aa, B:100:0x03c0, B:113:0x044b, B:115:0x0451, B:117:0x046d, B:119:0x0471, B:99:0x03b9), top: B:319:0x037d }] */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25, types: [int] */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r26v15, types: [android.media.MediaCrypto, android.view.Surface, byte[]] */
    /* JADX WARN: Type inference failed for: r2v67, types: [android.media.MediaCodec] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a0(java.lang.String[] r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 2471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.mirror.MirrorServer.a0(java.lang.String[]):void");
    }

    public static void b() {
        c(0);
        c(1);
    }

    public static void b0(VirtualDisplay virtualDisplay, f8 f8Var) {
        if (virtualDisplay == null || f8Var == null) {
            return;
        }
        try {
            virtualDisplay.setSurface(null);
            Thread.sleep(40L);
            virtualDisplay.setSurface(f8Var.b);
        } catch (Throwable th) {
            ad.f("gan lai surface loi: ", th);
        }
    }

    public static void c(int i2) {
        int i3;
        f8 f8Var = null;
        int i4 = -1;
        if (i2 == 0 && E != null && G == null && W < 0 && Y == Integer.MIN_VALUE && a0 == 0) {
            try {
                E.b();
            } catch (Throwable unused) {
            }
            E = null;
            I = -1;
            return;
        }
        if (i2 == 1 && F != null && H == null && X < 0 && Z == Integer.MIN_VALUE && b0 == 0) {
            try {
                F.b();
            } catch (Throwable unused2) {
            }
            F = null;
            J = -1;
            return;
        }
        int iN = n();
        if (i2 == 0) {
            i4 = 0;
        } else if (iN >= 0) {
            i4 = iN;
        }
        if (i2 != 0 || iN < 0) {
            iN = o;
        }
        int i5 = i2 == 0 ? a0 : b0;
        int i6 = i2 == 0 ? W : X;
        if (i4 < 0) {
            if (i6 >= 0 || i5 != 0) {
                m0(i2, false);
                return;
            }
            return;
        }
        int i7 = iN - i4;
        if (i5 != 0) {
            m0(i2, i5 == 2);
            return;
        }
        if (i7 <= 0) {
            return;
        }
        int i8 = i2 == 0 ? Y : Z;
        if (i8 == Integer.MIN_VALUE) {
            i8 = i6;
        }
        if (i8 == i6) {
            char c2 = i2 == 0 ? (char) 2 : (char) 3;
            if (c2 == 2) {
                f8Var = E;
            } else if (c2 == 3) {
                f8Var = F;
            }
            VirtualDisplay virtualDisplay = i2 == 0 ? G : H;
            if (i6 < 0 || f8Var == null) {
                return;
            }
            f8Var.c(i7, p - i6);
            if (virtualDisplay != null) {
                virtualDisplay.resize(i7, p - i6, q);
                return;
            }
            return;
        }
        if (i8 < 0) {
            m0(i2, false);
            return;
        }
        if (System.currentTimeMillis() - f0 < 90) {
            return;
        }
        f0 = System.currentTimeMillis();
        int iRound = Math.round(p * 0.25f);
        int iRound2 = Math.round(p * 0.8f);
        int i9 = i8 < iRound ? iRound : i8 > iRound2 ? iRound2 : i8;
        int i10 = p - i9;
        f8 f8Var2 = i2 == 0 ? z : A;
        VirtualDisplay virtualDisplay2 = i2 == 0 ? C : D;
        f8 f8Var3 = i2 == 0 ? E : F;
        VirtualDisplay virtualDisplay3 = i2 == 0 ? G : H;
        boolean z2 = i2 == 0 ? d0 : e0;
        if (virtualDisplay3 != null || !z2) {
            int i11 = i9;
            if (f8Var2 != null) {
                f8Var2.c(i7, i11);
                if (virtualDisplay2 != null) {
                    virtualDisplay2.resize(i7, i11, q);
                }
            }
            if (virtualDisplay3 == null) {
                if (f8Var3 == null) {
                    f8Var3 = new f8();
                }
                f8Var3.c(i7, i10);
                i3 = i11;
                VirtualDisplay virtualDisplayM = M(i2 == 0 ? "bbdhu-mirror-a2" : "bbdhu-mirror-b2", i7, i10, q, f8Var3.b, r);
                int displayId = virtualDisplayM.getDisplay().getDisplayId();
                new Thread(new o7(displayId, 7), "vdrow-setup").start();
                if (i2 == 0) {
                    E = f8Var3;
                    G = virtualDisplayM;
                    I = displayId;
                } else {
                    F = f8Var3;
                    H = virtualDisplayM;
                    J = displayId;
                }
                J("VD hang duoi cot " + i2 + " id=" + displayId + " (" + i7 + "x" + i10 + ")");
            } else {
                i3 = i11;
                f8Var3.c(i7, i10);
                virtualDisplay3.resize(i7, i10, q);
            }
            if (i2 == 0) {
                W = i3;
                Y = i3;
            } else {
                X = i3;
                Z = i3;
            }
            N = System.currentTimeMillis() + 260;
            return;
        }
        f8 f8Var4 = new f8();
        f8Var4.c(i7, i9);
        VirtualDisplay virtualDisplayM2 = M(i2 == 0 ? "bbdhu-mirror-a2" : "bbdhu-mirror-b2", i7, i9, q, f8Var4.b, r);
        int i12 = i9;
        int displayId2 = virtualDisplayM2.getDisplay().getDisplayId();
        new Thread(new o7(displayId2, 6), "vdtop-setup").start();
        if (f8Var2 != null) {
            f8Var2.c(i7, i10);
        }
        if (virtualDisplay2 != null) {
            virtualDisplay2.resize(i7, i10, q);
        }
        if (i2 == 0) {
            E = z;
            G = C;
            I = b;
            z = f8Var4;
            C = virtualDisplayM2;
            b = displayId2;
            d = C;
            e = z.b;
            W = i12;
            Y = i12;
            d0 = false;
        } else {
            F = A;
            H = D;
            J = b;
            A = f8Var4;
            D = virtualDisplayM2;
            i = displayId2;
            X = i12;
            Z = i12;
            e0 = false;
        }
        J("chia doc MOI-TREN cot " + i2 + ": launcher len tren id=" + displayId2 + ", app xuong duoi (" + i7 + "x" + i10 + ")");
        N = System.currentTimeMillis() + 260;
    }

    public static void c0(float f2) {
        if (f2 > 0.0f) {
            k = Math.max(160, Math.round(o * Math.max(0.25f, Math.min(0.8f, f2))));
        } else {
            t(i);
            if (J > 0) {
                t(J);
            }
            l = true;
        }
    }

    public static void d(int i2) throws InterruptedException, IOException {
        v(y2.AM_START_DISPLAY.a() + i2 + " --activity-multiple-task" + j() + " -n com.carstream.tech/com.carstream.tech.launcher.CarLauncherActivity");
    }

    public static void d0(int i2, float f2) {
        int i3 = p;
        if (i3 <= 0) {
            return;
        }
        if (f2 <= 0.0f || f2 >= 1.0f) {
            if (i2 == 0) {
                Y = -1;
                return;
            } else {
                Z = -1;
                return;
            }
        }
        int iRound = Math.round(i3 * f2);
        int iRound2 = Math.round(p * 0.25f);
        int iRound3 = Math.round(p * 0.8f);
        if (iRound < iRound2) {
            iRound = iRound2;
        } else if (iRound > iRound3) {
            iRound = iRound3;
        }
        if (i2 == 0) {
            Y = iRound;
            d0 = false;
        } else {
            Z = iRound;
            e0 = false;
        }
    }

    public static String e() {
        int iN = n();
        if (iN <= 0 && W < 0 && X < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("col=");
        sb.append(iN > 0 ? iN / o : -1.0f);
        sb.append("\nrowL=");
        sb.append(W >= 0 ? W / p : -1.0f);
        sb.append("\nrowR=");
        sb.append(X >= 0 ? X / p : -1.0f);
        sb.append('\n');
        for (int i2 = 0; i2 < 4; i2++) {
            int iT = T(i2);
            String str = iT > 0 ? (String) g0.get(Integer.valueOf(iT)) : null;
            sb.append('p');
            sb.append(i2);
            sb.append('=');
            sb.append(str == null ? "-" : Y(str));
            sb.append('\n');
        }
        return sb.toString();
    }

    public static void e0(int i2, float f2) {
        int i3 = p;
        if (i3 <= 0) {
            return;
        }
        int iRound = Math.round(i3 * f2);
        int iRound2 = Math.round(p * 0.25f);
        int iRound3 = Math.round(p * 0.8f);
        if (iRound < iRound2) {
            iRound = iRound2;
        } else if (iRound > iRound3) {
            iRound = iRound3;
        }
        if (i2 == 0) {
            Y = iRound;
            d0 = true;
        } else {
            Z = iRound;
            e0 = true;
        }
    }

    public static AudioRecord f(int i2) {
        try {
            AudioRecord.Builder bufferSizeInBytes = new AudioRecord.Builder().setAudioSource(8).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(48000).setChannelMask(12).build()).setBufferSizeInBytes(i2);
            r7 r7VarI0 = i0();
            if (r7VarI0 != null) {
                Method method = AudioRecord.Builder.class.getMethod(y2.R_SETCTX.a(), Context.class);
                method.setAccessible(true);
                method.invoke(bufferSizeInBytes, r7VarI0);
                J("AUDIO: dung Builder.setContext(shell)");
            }
            return bufferSizeInBytes.build();
        } catch (Throwable th) {
            J("AUDIO: Builder that bai (" + String.valueOf(th) + ") -> constructor thuong");
            return new AudioRecord(8, 48000, 12, 2, i2);
        }
    }

    public static void f0(int i2) {
        int i3 = i2 == 0 ? W : X;
        f8 f8Var = i2 == 0 ? z : A;
        VirtualDisplay virtualDisplay = i2 == 0 ? C : D;
        f8 f8Var2 = i2 == 0 ? E : F;
        VirtualDisplay virtualDisplay2 = i2 == 0 ? G : H;
        int i4 = i3 >= 0 ? i3 : p;
        if (f8Var != null) {
            f8Var.c(o, i4);
            if (virtualDisplay != null) {
                virtualDisplay.resize(o, i4, q);
            }
        }
        if (i3 < 0 || f8Var2 == null) {
            return;
        }
        f8Var2.c(o, p - i3);
        if (virtualDisplay2 != null) {
            virtualDisplay2.resize(o, p - i3, q);
        }
    }

    public static int[] g(int i2) {
        int[] iArrV;
        int i3;
        if (!i() || (iArrV = V(i2)) == null) {
            return null;
        }
        int iX = X(10);
        int iX2 = X(16);
        int i4 = iArrV[0];
        int i5 = iArrV[1];
        int i6 = iArrV[2] + i4;
        int i7 = iArrV[3] + i5;
        int i8 = i4 == 0 ? iX : (iX2 / 2) + i4;
        int i9 = o;
        int i10 = i6 == i9 ? i9 - iX : i6 - (iX2 / 2);
        int i11 = i5 == 0 ? iX : (iX2 / 2) + i5;
        int i12 = p;
        int i13 = i7 == i12 ? i12 - iX : i7 - (iX2 / 2);
        int i14 = i10 - i8;
        if (i14 < 30 || (i3 = i13 - i11) < 30) {
            return null;
        }
        return new int[]{i8, i11, i14, i3};
    }

    public static int g0(int i2) {
        return i2 == 0 ? W : X;
    }

    public static void h(int i2) throws InterruptedException, IOException {
        if (i2 <= 0) {
            return;
        }
        ComponentName componentNameQ0 = q0(i2);
        if (componentNameQ0 != null) {
            A0 = true;
            h0(i2, componentNameQ0.getPackageName() + "/" + componentNameQ0.getClassName());
            return;
        }
        if (A0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Integer numValueOf = Integer.valueOf(i2);
            ConcurrentHashMap concurrentHashMap = B0;
            Long l2 = (Long) concurrentHashMap.get(numValueOf);
            if (l2 == null || jCurrentTimeMillis - l2.longValue() >= 4000) {
                concurrentHashMap.put(Integer.valueOf(i2), Long.valueOf(jCurrentTimeMillis));
                J("o " + i2 + " TRONG (chi con cua so ghim / khong con gi) -> mo lai launcher");
                v(y2.AM_START_DISPLAY.a() + i2 + " --activity-multiple-task" + j() + " -n com.carstream.tech/com.carstream.tech.launcher.CarLauncherActivity");
                g0.remove(Integer.valueOf(i2));
            }
        }
    }

    public static void h0(int i2, String str) {
        ConcurrentHashMap concurrentHashMap = g0;
        String str2 = (String) concurrentHashMap.get(Integer.valueOf(i2));
        if (str == null || str.isEmpty() || str.startsWith("com.carstream.tech/")) {
            str = null;
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (str == null) {
            concurrentHashMap.remove(numValueOf);
        } else {
            concurrentHashMap.put(numValueOf, str);
        }
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        String str3 = i2 == b ? " (TRAI)" : i2 == i ? " (PHAI)" : "";
        if (str == null) {
            str = "danh sach app";
        }
        J("o " + i2 + str3 + " = " + str);
    }

    public static boolean i() {
        return n() >= 0 || W >= 0 || X >= 0;
    }

    public static r7 i0() {
        try {
            Class<?> cls = Class.forName(y2.CLS_ACTIVITYTHREAD.a());
            Method declaredMethod = cls.getDeclaredMethod(y2.M_CURATHREAD.a(), null);
            declaredMethod.setAccessible(true);
            return new r7((Context) cls.getMethod(y2.R_SYSCTX.a(), null).invoke(declaredMethod.invoke(null, null), null));
        } catch (Throwable th) {
            ad.f("AUDIO: shellCtx loi: ", th);
            return null;
        }
    }

    public static String j() {
        return " --ei csfw " + o + " --ei csfh " + p;
    }

    public static void j0() {
        try {
            File file = new File(m0);
            if (file.exists()) {
                byte[] bArr = new byte[256];
                FileInputStream fileInputStream = new FileInputStream(file);
                int i2 = fileInputStream.read(bArr);
                fileInputStream.close();
                if (i2 <= 0) {
                    return;
                }
                String[] strArrSplit = new String(bArr, 0, i2, "UTF-8").trim().split("\\s+");
                String str = strArrSplit.length >= 2 ? strArrSplit[1] : null;
                int i3 = -1;
                long j2 = -1;
                for (int i4 = 2; i4 < strArrSplit.length; i4++) {
                    if (strArrSplit[i4].startsWith("pid=")) {
                        i3 = Integer.parseInt(strArrSplit[i4].substring(4));
                    } else if (strArrSplit[i4].startsWith("mono=")) {
                        j2 = Long.parseLong(strArrSplit[i4].substring(5));
                    }
                }
                if (("CHIEU".equals(str) || "CHO".equals(str) || "NGU".equals(str)) && i3 > 0 && i3 != Process.myPid()) {
                    if (j2 < 0 || SystemClock.elapsedRealtime() >= j2) {
                        Thread thread = new Thread(new d3(i3, str), "cs-soi-chet");
                        thread.setDaemon(true);
                        thread.start();
                    } else {
                        m("chet bt: pid=" + i3 + " tt=" + str + " -> may da khoi dong lai (reboot)");
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Socket k(int i2) throws Exception {
        int i3 = 0;
        while (true) {
            try {
                Socket socket = new Socket();
                socket.setTcpNoDelay(true);
                socket.connect(new InetSocketAddress(y2.LOOPBACK.a(), a), 1000);
                return socket;
            } catch (Exception e2) {
                if (i2 >= 0 && i3 >= i2) {
                    throw e2;
                }
                if (i2 < 0) {
                    j0 = false;
                    if (i3 % 8 == 0) {
                        z();
                    }
                }
                Thread.sleep(i3 < 240 ? 250L : 1000L);
                i3++;
            }
        }
    }

    public static MediaCodec k0(int i2, int i3) throws IOException {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i2, i3);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", s);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", t);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 2);
        l(mediaFormatCreateVideoFormat);
        MediaCodec mediaCodecL0 = l0();
        if (mediaCodecL0.getName().startsWith("OMX.")) {
            g = false;
        } else {
            mediaFormatCreateVideoFormat.setInteger("profile", 1);
            mediaFormatCreateVideoFormat.setInteger("level", 1024);
            try {
                mediaFormatCreateVideoFormat.setInteger(y2.K_PREPEND.a(), 1);
            } catch (Throwable unused) {
            }
            g = true;
        }
        f = null;
        mediaCodecL0.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        T0 = mediaCodecL0.createInputSurface();
        mediaCodecL0.start();
        String name = mediaCodecL0.getName();
        try {
            ArrayList arrayListQ = q();
            if (arrayListQ.remove(name)) {
                x(arrayListQ);
            }
        } catch (Throwable unused2) {
        }
        return mediaCodecL0;
    }

    public static void l(MediaFormat mediaFormat) {
        try {
            mediaFormat.setLong(y2.K_REPEATFRAME.a(), 100000L);
        } catch (Throwable unused) {
        }
        try {
            mediaFormat.setInteger("priority", 0);
        } catch (Throwable unused2) {
        }
        try {
            mediaFormat.setInteger("latency", 1);
        } catch (Throwable unused3) {
        }
        try {
            mediaFormat.setInteger("color-range", 2);
        } catch (Throwable unused4) {
        }
    }

    public static MediaCodec l0() throws IOException {
        String str;
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
        String name = mediaCodecCreateEncoderByType.getName();
        ArrayList arrayListQ = q();
        if (arrayListQ.isEmpty()) {
            x(Collections.singletonList(name));
            m("encoder: dung mac dinh " + name + " (dang thu — so bao ve dat)");
            return mediaCodecCreateEncoderByType;
        }
        try {
            mediaCodecCreateEncoderByType.release();
        } catch (Throwable unused) {
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if ("video/avc".equalsIgnoreCase(supportedTypes[i3])) {
                            String name2 = mediaCodecInfo.getName();
                            if (sb.length() > 0) {
                                sb.append(',');
                            }
                            sb.append(name2);
                            if (name2.startsWith("c2.android.") || name2.startsWith("OMX.google.")) {
                                arrayList2.add(name2);
                            } else {
                                arrayList.add(name2);
                            }
                        } else {
                            i3++;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m("encoder: khong liet ke duoc danh sach (" + th.getClass().getSimpleName() + ")");
        }
        m("encoder: may co [" + String.valueOf(sb) + "] | da chet: " + String.valueOf(arrayListQ));
        ArrayList arrayList3 = new ArrayList();
        if ((!arrayList.contains(name) && !arrayList2.contains(name)) || arrayList.remove(name) || arrayList2.remove(name)) {
            arrayList3.add(name);
        }
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        int size = arrayList3.size();
        while (true) {
            if (i2 >= size) {
                str = null;
                break;
            }
            Object obj = arrayList3.get(i2);
            i2++;
            str = (String) obj;
            if (!arrayListQ.contains(str)) {
                break;
            }
        }
        if (str == null) {
            m("encoder: reset ds");
            try {
                new File(y2.F_ENCCHET.a()).delete();
            } catch (Throwable unused2) {
            }
            arrayListQ = new ArrayList();
        } else {
            name = str;
        }
        ArrayList arrayList4 = new ArrayList(arrayListQ);
        if (!arrayList4.contains(name)) {
            arrayList4.add(name);
        }
        x(arrayList4);
        m("encoder: chon " + name + (arrayList2.contains(name) ? " (PHAN MEM)" : " (phan cung)"));
        return MediaCodec.createByCodecName(name);
    }

    public static void m(String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(n0, true);
            fileOutputStream.write((System.currentTimeMillis() + " " + str + "\n").getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m0(int r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.mirror.MirrorServer.m0(int, boolean):void");
    }

    public static void main(String[] strArr) {
        try {
            new File(n0).delete();
        } catch (Throwable unused) {
        }
        try {
            m("khoi dong: sdk=" + Build.VERSION.SDK_INT + " " + Build.MANUFACTURER + " " + Build.MODEL + " thumuc=" + a());
        } catch (Throwable unused2) {
        }
        try {
            j0();
        } catch (Throwable unused3) {
        }
        Thread.setDefaultUncaughtExceptionHandler(new m7());
        try {
            String str = System.getenv("CSLIB");
            if (str != null) {
                String strConcat = str.concat("/libguard.so");
                boolean z2 = NativeGuard.a;
                synchronized (NativeGuard.class) {
                    if (!NativeGuard.a) {
                        try {
                            System.load(strConcat);
                            NativeGuard.a = true;
                        } catch (Throwable unused4) {
                            NativeGuard.a = false;
                        }
                    }
                }
            }
        } catch (Throwable unused5) {
        }
        try {
            String str2 = System.getenv("CSK");
            if (str2 == null || str2.length() != 64) {
                m("che key: KHONG (CSK " + (str2 == null ? "trong" : "dai " + str2.length()) + ")");
            } else {
                byte[] bArr = new byte[32];
                for (int i2 = 0; i2 < 32; i2++) {
                    int i3 = i2 * 2;
                    bArr[i2] = (byte) Integer.parseInt(str2.substring(i3, i3 + 2), 16);
                }
                NativeGuard.d(bArr);
                m("che key: co (" + str2.substring(0, 8) + "..)");
            }
        } catch (Throwable th) {
            m("che key: loi ".concat(String.valueOf(th)));
        }
        String str3 = System.getenv("CSLIB");
        String str4 = System.getenv("CSEXT");
        String[] strArr2 = {str3 != null ? str3.concat("/libguard.so") : null, str3 != null ? str3.concat("/csrun") : null, str4 != null ? str4.concat("/libguard.so") : null, str4 != null ? str4.concat("/csboot.bin") : null};
        int i4 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            String str5 = strArr2[i5];
            if (str5 != null) {
                try {
                    if (new File(str5).delete()) {
                        i4++;
                    }
                } catch (Throwable unused6) {
                }
            }
        }
        m("bv: don " + i4);
        try {
            int iB = NativeGuard.b();
            if (iB != 0) {
                m("bv: r" + iB);
            }
        } catch (Throwable unused7) {
        }
        try {
            a0(strArr);
        } catch (Throwable th2) {
            Throwable cause = th2;
            while (cause.getCause() != null && cause.getCause() != cause) {
                cause = cause.getCause();
            }
            String str6 = "";
            try {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    str6 = " @" + stackTrace[0].getMethodName() + ":" + stackTrace[0].getLineNumber();
                }
            } catch (Throwable unused8) {
            }
            m("CHET: " + cause.getClass().getName() + (cause.getMessage() != null ? ad.g(" :: ", cause.getMessage()) : "") + (cause != th2 ? ad.d(" (boc ", th2.getClass().getSimpleName(), ")") : "") + str6);
            ad.f("!! ", th2);
            th2.printStackTrace(System.out);
            Runtime.getRuntime().halt(1);
        }
    }

    public static int n() {
        return P >= 0 ? P : O > 0 ? O : j;
    }

    public static void n0() {
        try {
            VirtualDisplay virtualDisplay = G;
            if (virtualDisplay != null) {
                virtualDisplay.release();
            }
        } catch (Throwable unused) {
        }
        try {
            f8 f8Var = E;
            if (f8Var != null) {
                f8Var.b();
            }
        } catch (Throwable unused2) {
        }
        try {
            VirtualDisplay virtualDisplay2 = H;
            if (virtualDisplay2 != null) {
                virtualDisplay2.release();
            }
        } catch (Throwable unused3) {
        }
        try {
            f8 f8Var2 = F;
            if (f8Var2 != null) {
                f8Var2.b();
            }
        } catch (Throwable unused4) {
        }
        G = null;
        E = null;
        I = -1;
        H = null;
        F = null;
        J = -1;
        W = -1;
        X = -1;
        Y = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        Z = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        a0 = 0;
        b0 = 0;
        d0 = false;
        e0 = false;
    }

    public static void o(float f2) {
        c0(f2);
        if (o > 0 && f2 > 0.0f && f2 < 1.0f) {
            c0 = true;
            O = Math.round(o * f2);
        }
        new Thread(new n7(3), "split-open").start();
    }

    public static void o0() {
        if (k0) {
            J("APP QUAY LAI -> dung day bo chieu");
            n = System.currentTimeMillis() + 12000;
            try {
                z.c(o, p);
                VirtualDisplay virtualDisplayM = M("bbdhu-mirror", o, p, q, z.b, r);
                C = virtualDisplayM;
                b = virtualDisplayM.getDisplay().getDisplayId();
                d = C;
                e = z.b;
                new Thread(new o7(b, 0), "thuc-day").start();
                J("VD A id=" + b + " (dung day)");
                k0 = false;
                z();
                if (E0) {
                    new Thread(new n7(1), "khoi-phuc-thuc-day").start();
                }
            } catch (Throwable th) {
                ad.f("dung day loi: ", th);
            }
        }
    }

    public static String p(String str, String str2) {
        String strSubstring;
        int iIndexOf;
        int iIndexOf2;
        int iIndexOf3 = str.indexOf(str2);
        if (iIndexOf3 < 0 || (iIndexOf = (strSubstring = str.substring(iIndexOf3, Math.min(str.length(), iIndexOf3 + 300))).indexOf(" u")) < 0 || (iIndexOf2 = strSubstring.indexOf(32, iIndexOf + 1)) < 0) {
            return null;
        }
        String strSubstring2 = strSubstring.substring(iIndexOf2 + 1);
        int iIndexOf4 = strSubstring2.indexOf(32);
        if (iIndexOf4 < 0) {
            iIndexOf4 = strSubstring2.indexOf(125);
        }
        if (iIndexOf4 <= 0) {
            return null;
        }
        return strSubstring2.substring(0, iIndexOf4);
    }

    public static String p0(int i2) {
        String strA = y2.MK_DISPLAY.a();
        String strW = w(y2.DUMPSYS_ACT.a());
        int iIndexOf = strW.indexOf(strA + i2 + " ");
        if (iIndexOf < 0) {
            iIndexOf = strW.indexOf(strA + i2 + "\n");
        }
        if (iIndexOf < 0) {
            return null;
        }
        int length = strW.length();
        int i3 = iIndexOf + 1;
        int iIndexOf2 = strW.indexOf("\n".concat(strA), i3);
        int iIndexOf3 = strW.indexOf(y2.MK_ATSUP.a(), i3);
        if (iIndexOf2 > 0) {
            length = Math.min(length, iIndexOf2);
        }
        if (iIndexOf3 > 0) {
            length = Math.min(length, iIndexOf3);
        }
        String strSubstring = strW.substring(iIndexOf, length);
        String strP = p(strSubstring, y2.MK_TOPRES.a());
        if (strP == null) {
            strP = p(strSubstring, y2.MK_RESUMED.a());
        }
        if (strP == null) {
            strP = p(strSubstring, y2.MK_HIST2.a());
        }
        return strP == null ? p(strSubstring, y2.MK_HIST1.a()) : strP;
    }

    public static ArrayList q() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(y2.F_ENCCHET.a());
            if (file.exists()) {
                byte[] bArr = new byte[512];
                FileInputStream fileInputStream = new FileInputStream(file);
                int i2 = fileInputStream.read(bArr);
                fileInputStream.close();
                if (i2 > 0) {
                    String[] strArrSplit = new String(bArr, 0, i2, "UTF-8").trim().split("\\|", 2);
                    if (strArrSplit.length < 2 || Integer.parseInt(strArrSplit[0].trim()) != 3) {
                        file.delete();
                    } else {
                        for (String str : strArrSplit[1].split(",")) {
                            if (str.trim().length() > 0) {
                                arrayList.add(str.trim());
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public static ComponentName q0(int i2) {
        boolean z2;
        try {
            Object systemService = y.getSystemService("activity");
            List list = (List) systemService.getClass().getMethod(y2.R_RUNTASKS.a(), Integer.TYPE).invoke(systemService, 100);
            Class<?> cls = Class.forName(y2.R_TASKINFO.a());
            ComponentName componentName = null;
            for (Object obj : list) {
                if (cls.getField(y2.R_DISPLAYID.a()).getInt(obj) == i2 && ((Integer) cls.getMethod(y2.R_WINMODE.a(), null).invoke(obj, null)).intValue() != 2) {
                    ComponentName componentName2 = (ComponentName) cls.getField(y2.R_TOPACT.a()).get(obj);
                    try {
                        z2 = cls.getField(y2.R_ISVISIBLE.a()).getBoolean(obj);
                    } catch (Throwable unused) {
                        z2 = true;
                    }
                    if (z2) {
                        return componentName2;
                    }
                    if (componentName == null) {
                        componentName = componentName2;
                    }
                }
            }
            return componentName;
        } catch (Throwable th) {
            int i3 = z0;
            z0 = i3 + 1;
            if (i3 < 3) {
                ad.f("topOn loi: ", th);
            }
            return null;
        }
    }

    public static void r(int i2, int i3, int i4, p5 p5Var) {
        int i5;
        int iMax;
        String str;
        d7 d7Var = K;
        int i6 = o;
        int i7 = p;
        if (i4 > 0) {
            i5 = i4;
        } else {
            try {
                i5 = q;
            } catch (Throwable th) {
                J("!! doi co hong (" + String.valueOf(th) + ") -> giu co cu " + i6 + "x" + i7);
                o = i6;
                p = i7;
                d7Var.p(i6, i7, q);
                return;
            }
        }
        J("DOI CO MAN XE: " + i6 + "x" + i7 + " -> " + i2 + "x" + i3 + " @" + i5);
        if (W >= 0 || X >= 0) {
            n0();
        }
        boolean z2 = (j <= 0 || D == null || A == null) ? false : true;
        if (z2) {
            float f2 = i2;
            iMax = Math.max(Math.round(0.25f * f2), Math.min(Math.round(f2 * 0.8f), Math.round((j * f2) / i6)));
        } else {
            iMax = -1;
        }
        O = -1;
        c0 = false;
        P = -1;
        T = 0;
        U = 0;
        V = false;
        if (z2) {
            j = -1;
            k = iMax;
            M = 0L;
        } else {
            j = -1;
            k = -1;
            try {
                VirtualDisplay virtualDisplay = D;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                    D = null;
                    i = -1;
                }
            } catch (Throwable unused) {
            }
        }
        try {
            VirtualDisplay virtualDisplay2 = Q0;
            if (virtualDisplay2 != null) {
                virtualDisplay2.release();
                Q0 = null;
                S0 = -1;
            }
        } catch (Throwable unused2) {
        }
        I0 = false;
        P0 = false;
        o = i2;
        p = i3;
        if (i4 > 0) {
            q = i4;
        }
        d7Var.p(i2, i3, q);
        MediaCodec mediaCodec = c;
        MediaCodec mediaCodecK0 = k0(o, p);
        p5Var.a(T0);
        c = mediaCodecK0;
        try {
            mediaCodec.stop();
        } catch (Throwable unused3) {
        }
        try {
            mediaCodec.release();
        } catch (Throwable unused4) {
        }
        if (!z2) {
            f8 f8Var = z;
            if (f8Var != null) {
                f8Var.c(o, p);
            }
            VirtualDisplay virtualDisplay3 = C;
            if (virtualDisplay3 != null) {
                virtualDisplay3.resize(o, p, q);
                e = z.b;
            }
        }
        String name = mediaCodecK0.getName();
        int i8 = o;
        int i9 = p;
        if (z2) {
            str = " | giu chia doi, vach -> " + iMax;
        } else {
            str = "";
        }
        J("DOI CO XONG: bo ma hoa " + name + " o " + i8 + "x" + i9 + str + " | " + d7Var.l());
    }

    public static void s() {
        e1 = false;
        f1 = false;
        g1 = false;
        s1 = false;
        t1 = false;
        u1 = false;
        v1 = false;
        r1 = 0;
        c0 = false;
        O = -1;
        l = false;
        m = false;
        P0 = false;
        P = -1;
        Q = 0L;
        R = 0;
        S = 0;
        T = 0;
        U = 0;
        V = false;
        L = -1;
        N = 0L;
        M = 0L;
        w0 = false;
        if (j > 0 || i > 0 || S0 > 0 || I0 || !g0.isEmpty()) {
            new Thread(new n7(2), "don-phien").start();
        }
    }

    public static void t(int i2) {
        if (i2 <= 0) {
            return;
        }
        new Thread(new o7(i2, 5), "dong-app-man").start();
    }

    public static void u(final int i2, final int i3) {
        final int iT;
        if (i3 == 2) {
            iT = T(i2);
        } else {
            iT = T(i2 != 0 ? 3 : 2);
        }
        new Thread(new Runnable() { // from class: p7
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                int i4 = iT;
                int i5 = i2;
                int i6 = i3;
                ConcurrentHashMap concurrentHashMap = MirrorServer.g0;
                if (i4 > 0) {
                    try {
                        ComponentName componentNameQ0 = MirrorServer.q0(i4);
                        if (componentNameQ0 != null) {
                            str = componentNameQ0.getPackageName() + "/" + componentNameQ0.getClassName();
                        } else {
                            str = (String) concurrentHashMap.get(Integer.valueOf(i4));
                        }
                        concurrentHashMap.remove(Integer.valueOf(i4));
                        if (str != null && !MirrorServer.Y(str).equals("com.carstream.tech")) {
                            MirrorServer.v("am force-stop " + MirrorServer.Y(str));
                        }
                    } catch (Throwable th) {
                        ad.f("dong hang loi: ", th);
                    }
                }
                if (i5 == 0) {
                    MirrorServer.a0 = i6;
                } else {
                    MirrorServer.b0 = i6;
                }
            }
        }, "dong-hang").start();
    }

    public static void v(String str) throws InterruptedException, IOException {
        try {
            Process processExec = Runtime.getRuntime().exec(str.trim().split("\\s+"));
            processExec.waitFor();
            J("exec: " + str + " -> " + processExec.exitValue());
        } catch (Exception e2) {
            J("exec loi: " + str + " " + String.valueOf(e2));
        }
    }

    public static String w(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec(str.trim().split("\\s+"));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null || i2 >= 4000) {
                    break;
                }
                sb.append(line);
                sb.append('\n');
                i2++;
            }
            bufferedReader.close();
            processExec.waitFor();
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void x(List list) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(3);
            sb.append('|');
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (i2 > 0) {
                    sb.append(',');
                }
                sb.append((String) list.get(i2));
            }
            FileOutputStream fileOutputStream = new FileOutputStream(y2.F_ENCCHET.a(), false);
            fileOutputStream.write(sb.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (Throwable unused) {
        }
    }

    public static void y(int i2, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(y2.F_COCHET.a(), false);
            fileOutputStream.write((str + i2).getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (Throwable unused) {
        }
    }

    public static void z() {
        try {
            String str = k0 ? "NGU" : j0 ? "CHIEU" : "CHO";
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i2 = k0 ? 0 : o0;
            boolean z2 = i0;
            String str2 = jCurrentTimeMillis + " " + str + " fps=" + i2 + " nen=" + (z2 ? 1 : 0) + " mono=" + SystemClock.elapsedRealtime() + " batdau=" + l0 + " pid=" + Process.myPid() + "\n";
            String str3 = m0;
            File file = new File(str3 + ".tmp");
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            fileOutputStream.write(str2.getBytes("UTF-8"));
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            if (file.renameTo(new File(str3))) {
                return;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(str3, false);
            fileOutputStream2.write(str2.getBytes("UTF-8"));
            fileOutputStream2.close();
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
