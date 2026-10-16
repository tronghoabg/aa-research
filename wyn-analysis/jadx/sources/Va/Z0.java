package Va;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class Z0 extends AbstractC1104pb implements Q6 {

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f13885O = {85, 72, -65, -91, 92, -84, 91, 87, 85, -79, 93, 75, -67, 90, -83, 117, -119, 80, -125, -111, 118, -86, 76, -116, 125, -94, -30, 30, -18, -28, 9, -27, -10, 8, 94, -96, -30, 24, 26, -22, 76, -75, 24, -26, 27, 54, 62, 70, -75, 82, -71, -76, -30, 3, -14, -9, 123, 116, -117, -124, -53, 33, -120, -116, -61, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: P, reason: collision with root package name */
    public static int f13886P = 0;

    /* renamed from: Q, reason: collision with root package name */
    public static int f13887Q = 1;

    /* renamed from: K, reason: collision with root package name */
    public Map f13888K;
    public final String L;

    /* renamed from: M, reason: collision with root package name */
    public String f13889M;

    /* renamed from: N, reason: collision with root package name */
    public String f13890N;

    public Z0(String str) {
        this.L = str;
    }

    public static String v0(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 9674);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    public static String z0(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 35;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13885O[(-1300890105) + i11] + 35);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1300890107) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 81033498);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13885O;
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

    public abstract HashMap A0();

    public final void B0(H9 h92, Ra ra2, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, h92);
            C1214y7.s((C1214y7) ra2.f13665a, str, true, false, arrayList);
            C1214y7.C(new C1151t7(ra2, str, false, arrayList), false);
            C1214y7.C(new C1151t7(ra2, str, true, arrayList), true);
            f13886P = (f13887Q + 121) % 128;
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(v0((char) KeyEvent.getDeadChar(0, 0), "먫\u2072瞜돸", "훊㙰ᦈꎉ䴾\uf3f5㷧춪績", (-1675595078) - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
            sb2.append(this);
            AbstractC0897a.f(this.L, sb2.toString(), th);
        }
    }

    @Override // Va.Q6
    public final Object a(C1214y7 c1214y7, String str, ArrayList arrayList, Ra ra2, C1203x8 c1203x8) {
        f13887Q = (f13886P + 31) % 128;
        Y0 y02 = (Y0) this.f13888K.get(str);
        String str2 = this.L;
        try {
            if (y02 == null) {
                new C1036k8(c1214y7, c1203x8, str2, str).d(str2);
                return null;
            }
            f13887Q = (f13886P + 93) % 128;
            Object objA = y02.a(arrayList, ra2);
            f13886P = (f13887Q + 77) % 128;
            return objA;
        } catch (Exception e7) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z0((ViewConfiguration.getWindowTouchSlop() >> 8) - 81033429, (-13) - TextUtils.getOffsetBefore("", 0), (byte) (27 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (short) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1300890130).intern());
            sb2.append(str2);
            sb2.append(z0((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 81033466, (KeyEvent.getMaxKeyCode() >> 16) - 33, (byte) (Color.rgb(0, 0, 0) + 16777273), (short) (KeyEvent.getMaxKeyCode() >> 16), 1300890151 - Color.red(0)).intern());
            sb2.append(str);
            sb2.append(z0(View.MeasureSpec.getMode(0) - 81033459, ((Process.getThreadPriority(0) + 20) >> 6) - 34, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 127), (short) View.getDefaultSize(0, 0), 1300890152 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
            AbstractC0897a.f(str2, sb2.toString(), e7);
            return null;
        }
    }

    public boolean q0() {
        f13887Q = (f13886P + 77) % 128;
        return false;
    }

    public boolean r0() {
        int i5 = f13887Q;
        f13886P = (i5 + 17) % 128;
        int i10 = i5 + 3;
        f13886P = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final Class s0(String str) {
        f13887Q = (f13886P + 13) % 128;
        try {
            if (AbstractC0897a.p()) {
                return w0(str);
            }
            int i5 = f13887Q + 107;
            f13886P = i5 % 128;
            return i5 % 2 != 0 ? y0(str, true) : y0(str, false);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract String t0();

    public String u0() {
        int i5 = (f13886P + 89) % 128;
        f13887Q = i5;
        String str = this.f13889M;
        if (str == null) {
            return x0();
        }
        f13886P = (i5 + 41) % 128;
        return str;
    }

    public abstract Class w0(String str);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[Catch: all -> 0x001c, TryCatch #2 {all -> 0x001c, blocks: (B:3:0x0001, B:5:0x000e, B:18:0x004f, B:19:0x0055, B:25:0x0066, B:16:0x0026, B:11:0x001b, B:14:0x001e, B:21:0x0062, B:7:0x0016), top: B:34:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: all -> 0x001c, TryCatch #2 {all -> 0x001c, blocks: (B:3:0x0001, B:5:0x000e, B:18:0x004f, B:19:0x0055, B:25:0x0066, B:16:0x0026, B:11:0x001b, B:14:0x001e, B:21:0x0062, B:7:0x0016), top: B:34:0x0001, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String x0() {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = Va.Z0.f13886P     // Catch: java.lang.Throwable -> L1c
            int r0 = r0 + 1
            int r1 = r0 % 128
            Va.Z0.f13887Q = r1     // Catch: java.lang.Throwable -> L1c
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            if (r0 != 0) goto L1e
            java.lang.String r0 = r8.f13890N     // Catch: java.lang.Throwable -> L1c
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1c
            r3 = 58
            int r3 = r3 / r2
            if (r0 != 0) goto L4f
            goto L26
        L1a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0 = move-exception
            goto L69
        L1e:
            java.lang.String r0 = r8.f13890N     // Catch: java.lang.Throwable -> L1c
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L4f
        L26:
            java.lang.String r0 = r8.f13890N     // Catch: java.lang.Throwable -> L1c
            long r3 = android.widget.ExpandableListView.getPackedPositionForChild(r2, r2)     // Catch: java.lang.Throwable -> L1c
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = (-1) - r3
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "铑学멡軞"
            java.lang.String r5 = "ց뺌\ue5ed\udf6d䝤玲池"
            int r6 = android.view.ViewConfiguration.getPressedStateDuration()     // Catch: java.lang.Throwable -> L1c
            int r6 = r6 >> 16
            r7 = 1633379988(0x615b6694, float:2.5295178E20)
            int r7 = r7 - r6
            java.lang.String r3 = v0(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r3.intern()     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L55
        L4f:
            java.lang.String r0 = r8.t0()     // Catch: java.lang.Throwable -> L1c
            r8.f13890N = r0     // Catch: java.lang.Throwable -> L1c
        L55:
            java.lang.String r0 = r8.f13890N     // Catch: java.lang.Throwable -> L1c
            int r3 = Va.Z0.f13886P     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + 59
            int r4 = r3 % 128
            Va.Z0.f13887Q = r4     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 % r1
            if (r3 != 0) goto L67
            int r1 = r1 / r2
            monitor-exit(r8)
            return r0
        L65:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L1c
        L67:
            monitor-exit(r8)
            return r0
        L69:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Z0.x0():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class y0(java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Z0.y0(java.lang.String, boolean):java.lang.Class");
    }
}
