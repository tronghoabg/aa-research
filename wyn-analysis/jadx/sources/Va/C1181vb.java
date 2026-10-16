package Va;

import E5.C0441b;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: Va.vb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1181vb implements InvocationHandler {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f14712c = {-37, -41, -55, -13, -80, -43, -35, -47, -10, 24, 81, 99, 80, 107, 84, -87, 3, 97, 103, 89, 103, 72, -128, 73, 95, -99, 23, 86, 88, 85, 100, 97, -91, 10, 95, 89, 92, -119, 0, -30, 39, 17, 35, 11, 27, 36, 23, 102, -43, 20, 22, 19, 34, 31, 99, -56, 29, 23, 26, 71, -93, -102, -86, 46, 77, 95, 76, 103, 80, -91, -4, -27, 1, 49, -94, -17, -10, -27, 3, -18, -28, -23, -8, -11, 57, -87, -23, -11, -27, -16, -1, -18, 55, -98, -13, -19, -16, 29, -22, -28, -31, -40, -30, -19, 0, -63, -31, -45, -11, -47, -27, -18, -32, 3, -78, -15, -32, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: d, reason: collision with root package name */
    public static int f14713d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14714e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14715a;

    /* renamed from: b, reason: collision with root package name */
    public final C0441b f14716b;

    public C1181vb(Object obj, C0441b c0441b) {
        this.f14715a = obj;
        this.f14716b = c0441b;
    }

    public static boolean a(Method method) {
        String name = method.getName();
        if (name.hashCode() == 1622498214) {
            short s10 = (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31);
            if (name.equals(c((-636854766) - TextUtils.getOffsetBefore("", 0), (-94) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) TextUtils.getTrimmedLength(""), s10, 1697386661 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                f14713d = (f14714e + 121) % 128;
                return true;
            }
        }
        int i5 = f14714e + 27;
        f14713d = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static String c(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 115;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14712c[(-1697386562) + i11] + 115);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1697386564) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 636854869);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14712c;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public final Object b(Method method) {
        int i5 = f14713d + 61;
        f14714e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (method != null) {
            String name = method.getName();
            if (name.hashCode() == 1622498214) {
                short sIndexOf = (short) (29 - TextUtils.indexOf((CharSequence) "", '0', 0));
                if (name.equals(c((-636854766) - TextUtils.indexOf("", ""), (-96) - TextUtils.lastIndexOf("", '0', 0), (byte) (ViewConfiguration.getTapTimeout() >> 16), sIndexOf, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1697386661).intern())) {
                    int i10 = (f14714e + 7) % 128;
                    f14713d = i10;
                    int i11 = i10 + 63;
                    f14714e = i11 % 128;
                    if (i11 % 2 != 0) {
                        return this.f14715a;
                    }
                    throw null;
                }
            }
        }
        int i12 = f14713d + 27;
        f14714e = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        return b(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r3 = c((-636854789) - (android.graphics.PointF.length(com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.graphics.PointF.length(com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (-105) - (android.media.AudioTrack.getMinVolume() > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.media.AudioTrack.getMinVolume() == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) (android.text.AndroidCharacter.getMirror('0') - '0'), (short) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 44), 1697386562 - (android.util.TypedValue.complexToFloat(0) > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.util.TypedValue.complexToFloat(0) == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern();
        r4 = new java.lang.StringBuilder();
        r4.append(c((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 636854801, (-84) - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), (byte) android.view.KeyEvent.keyCodeFromString(""), (short) ((android.os.Process.myTid() >> 22) - 92), 1697386571 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
        r4.append(r24.getName());
        Va.Ab.a0(r3, r4.toString(), r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b5, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b9, code lost:
    
        r22.f14716b.s(r23, r24, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bc, code lost:
    
        r18 = -636854801;
        r19 = 1697386562;
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c9, code lost:
    
        r18 = -636854801;
        r19 = 1697386562;
        r20 = 0;
        r6 = c((-636854789) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (-106) - android.text.TextUtils.lastIndexOf("", '0'), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", '0', 0)), (short) (44 - android.view.KeyEvent.keyCodeFromString("")), 1697386562 - android.view.View.combineMeasuredStates(0, 0)).intern();
        r7 = new java.lang.StringBuilder();
        r7.append(c((-636854801) - android.widget.ExpandableListView.getPackedPositionChild(0), (-92) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (byte) (1 - (android.media.AudioTrack.getMaxVolume() > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.media.AudioTrack.getMaxVolume() == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (short) (android.text.TextUtils.indexOf("", "") - 26), 1697386599 - android.text.TextUtils.lastIndexOf("", '0', 0)).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x012e, code lost:
    
        if (r4 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0130, code lost:
    
        r8 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0135, code lost:
    
        r8 = c(android.graphics.Color.red(0) - 636854759, android.graphics.Color.red(0) - 111, (byte) android.text.TextUtils.indexOf("", ""), (short) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 93), android.view.View.combineMeasuredStates(0, 0) + 1697386622).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0161, code lost:
    
        r7.append(r8);
        r7.append(c(android.widget.ExpandableListView.getPackedPositionGroup(0) - 636854837, (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) - 108, (byte) android.text.TextUtils.getTrimmedLength(""), (short) ((-16777304) - android.graphics.Color.rgb(0, 0, 0)), (android.util.TypedValue.complexToFraction(0, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.util.TypedValue.complexToFraction(0, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1697386625).intern());
        r7.append(r24.getName());
        Va.Ab.a0(r6, r7.toString(), r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a5, code lost:
    
        if (r4 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ab, code lost:
    
        return r24.invoke(r4, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b6, code lost:
    
        if (java.lang.Object.class.equals(r24.getDeclaringClass()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01b8, code lost:
    
        r0 = Va.C1181vb.f14713d + 29;
        Va.C1181vb.f14714e = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c2, code lost:
    
        if ((r0 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01c4, code lost:
    
        r0 = 71 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01c7, code lost:
    
        if (r25 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ca, code lost:
    
        if (r25 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01cc, code lost:
    
        r0 = new java.util.ArrayList();
        r4 = r25.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d5, code lost:
    
        r7 = r25[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01df, code lost:
    
        if (java.lang.reflect.Proxy.isProxyClass(r7.getClass()) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01e1, code lost:
    
        r0.add(java.lang.reflect.Proxy.getInvocationHandler(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e8, code lost:
    
        Va.C1181vb.f14714e = (Va.C1181vb.f14713d + 111) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f3, code lost:
    
        r0.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01f6, code lost:
    
        Va.C1181vb.f14713d = (Va.C1181vb.f14714e + 71) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fe, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0201, code lost:
    
        r0 = r0.toArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0206, code lost:
    
        Va.Ab.a0(c(android.text.TextUtils.lastIndexOf("", '0', 0) - 636854788, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 105, (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > r20 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == r20 ? 0 : -1)) - 1), (short) (44 - (android.os.Process.myTid() >> 22)), r19 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), c(r18 - android.text.TextUtils.lastIndexOf("", '0', 0), (-87) - android.view.MotionEvent.axisFromString(""), (byte) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1))), (short) (android.graphics.Color.alpha(0) + 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1697386632).intern(), r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026f, code lost:
    
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0274, code lost:
    
        return r24.invoke(r22, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0275, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        if (a(r24) != true) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (a(r24) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r23, java.lang.reflect.Method r24, java.lang.Object[] r25) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1181vb.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
