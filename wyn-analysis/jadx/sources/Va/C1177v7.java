package Va;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: Va.v7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1177v7 extends AbstractC0961eb {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f14699c = {-1464529252, -1991758515, -108898556, -862817907, 720120140, 1737959883, -625719624, -1369811249, -1345522564, -767445090, -984640719, 518967860, -1176892880, -1327515013, 1724880594, 1869230132, -406527142, -545372878};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f14700d = {-102, -112, -126, -92, -115, -124, -64, 91, -106, -100, -124, -98, -122, -94, -77, 100, -112, -102, -51, -61, -50, -49, -55, -17, -88, -45, -39, -63, -37, -61, -33, -16, -95, -51, -92, -21, 13, -25, 27, -24, -4, -17, 7, -25, -5, -1, 31, -34, -23, 15, 8, -44, -1, 5, -19, 7, -17, 11, 28, -51, -7, -100, 124, 105, -121, 122, 123, 126, -117, -98, 72, -126, -120, 112, -118, 114, -114, -97, 80, 124};

    /* renamed from: e, reason: collision with root package name */
    public static int f14701e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f14702f = 1;

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ ArrayList f14703a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ C1214y7 f14704b;

    public static String a(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14699c.clone();
                AbstractC0897a.k = 0;
                while (true) {
                    int i10 = AbstractC0897a.k;
                    if (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        char c10 = (char) (i11 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i11;
                        cArr[1] = c11;
                        int i12 = iArr[i10 + 1];
                        char c12 = (char) (i12 >> 16);
                        cArr[2] = c12;
                        char c13 = (char) i12;
                        cArr[3] = c13;
                        AbstractC0897a.f13928l = (c10 << 16) + c11;
                        AbstractC0897a.f13929m = (c12 << 16) + c13;
                        AbstractC0897a.o(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = AbstractC0897a.f13928l ^ iArr2[i13];
                            AbstractC0897a.f13928l = i14;
                            int iG = AbstractC0897a.G(i14) ^ AbstractC0897a.f13929m;
                            int i15 = AbstractC0897a.f13928l;
                            AbstractC0897a.f13928l = iG;
                            AbstractC0897a.f13929m = i15;
                        }
                        int i16 = AbstractC0897a.f13928l;
                        int i17 = AbstractC0897a.f13929m;
                        AbstractC0897a.f13928l = i17;
                        AbstractC0897a.f13929m = i16;
                        int i18 = i16 ^ iArr2[16];
                        AbstractC0897a.f13929m = i18;
                        int i19 = iArr2[17] ^ i17;
                        AbstractC0897a.f13928l = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        AbstractC0897a.o(iArr2);
                        int i20 = AbstractC0897a.k;
                        int i21 = i20 << 1;
                        cArr2[i21] = cArr[0];
                        cArr2[i21 + 1] = cArr[1];
                        cArr2[i21 + 2] = cArr[2];
                        cArr2[i21 + 3] = cArr[3];
                        AbstractC0897a.k = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String h(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 119;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14700d[371307163 + i11] + 119);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - (-371307161)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 - 1719238902);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14700d;
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

    @Override // Va.AbstractC0961eb, Va.InterfaceC0948db
    public final void b(Activity activity) {
        int i5 = f14702f + 87;
        f14701e = i5 % 128;
        int[] iArr = {1960114259, -1226481532, -1848672339, 1593490767, 2117993583, -1731552012, -1521214036, 1822768489, 103618756, -786815120, 765089994, 1511309865, 1380921788, 99866880};
        e(activity, (i5 % 2 != 0 ? a(16 << ((byte) KeyEvent.getModifierMetaStateMask()), iArr) : a(24 - ((byte) KeyEvent.getModifierMetaStateMask()), iArr)).intern());
        int i10 = f14701e + 15;
        f14702f = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 93 / 0;
        }
    }

    public final void c(String str, Activity activity, Bundle bundle) {
        List listAsList;
        int i5 = f14702f + 87;
        f14701e = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = new Object[3];
            objArr[1] = activity;
            objArr[1] = bundle;
            listAsList = Arrays.asList(objArr);
        } else {
            listAsList = Arrays.asList(activity, bundle);
        }
        g(str, listAsList);
    }

    @Override // Va.AbstractC0961eb, Va.InterfaceC0948db
    public final void d(Activity activity) {
        f14701e = (f14702f + 51) % 128;
        e(activity, a(20 - Process.getGidForName(""), new int[]{1960114259, -1226481532, -301429666, 893821826, -78672336, 435823595, 282731844, 933568375, 765089994, 1511309865, 1380921788, 99866880}).intern());
        int i5 = f14701e + 9;
        f14702f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void e(Activity activity, String str) {
        int i5 = f14702f + 93;
        f14701e = i5 % 128;
        int i10 = i5 % 2;
        g(str, Collections.singletonList(activity));
        if (i10 != 0) {
            int i11 = 34 / 0;
        }
        f14701e = (f14702f + 57) % 128;
    }

    public final void f(String str, List list, boolean z2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17, new int[]{953042354, -1035908492, 1893934803, -1877540370, -415828309, 1847990477, -1195565543, -826211510, -732595061, 254136680}).intern());
        sb2.append(str);
        C1214y7.s(this.f14704b, sb2.toString(), z2, false, list);
        f14702f = (f14701e + 5) % 128;
    }

    public final void g(String str, List list) {
        f(str, list, true);
        Da da2 = new Da(11);
        da2.f13291f = this;
        da2.f13289d = str;
        da2.f13290e = list;
        Cb.j(da2);
        int i5 = f14701e + 65;
        f14702f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (C1214y7.k(activity, this.f14703a)) {
            f14702f = (f14701e + 33) % 128;
            short jumpTapTimeout = (short) (111 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            c(h((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1719239013, (-121) - Process.getGidForName(""), (byte) (ViewConfiguration.getTapTimeout() >> 16), jumpTapTimeout, (-371307163) - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), activity, bundle);
        }
        int i5 = f14701e + 57;
        f14702f = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 37 / 0;
        }
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f14702f = (f14701e + 21) % 128;
        if (C1214y7.k(activity, this.f14703a)) {
            f14702f = (f14701e + 119) % 128;
            e(activity, h(TextUtils.indexOf("", "", 0) + 1719239013, KeyEvent.keyCodeFromString("") - 120, (byte) (KeyEvent.getMaxKeyCode() >> 16), (short) ((-125) - Color.alpha(0)), (-371307102) - Color.alpha(0)).intern());
        }
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i5 = f14702f + 7;
        f14701e = i5 % 128;
        int i10 = i5 % 2;
        ArrayList arrayList = this.f14703a;
        if (i10 != 0) {
            boolean zK = C1214y7.k(activity, arrayList);
            int i11 = 13 / 0;
            if (!zK) {
                return;
            }
        } else if (!C1214y7.k(activity, arrayList)) {
            return;
        }
        e(activity, a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, new int[]{-96374055, 995172381, -1871642279, -457594463, -688436218, -341945488, -1490489288, 1000080799}).intern());
        f14701e = (f14702f + 85) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResumed(android.app.Activity r3) {
        /*
            r2 = this;
            int r0 = Va.C1177v7.f14702f
            int r0 = r0 + 41
            int r1 = r0 % 128
            Va.C1177v7.f14701e = r1
            int r0 = r0 % 2
            java.util.ArrayList r1 = r2.f14703a
            if (r0 == 0) goto L19
            boolean r0 = Va.C1214y7.k(r3, r1)
            r1 = 53
            int r1 = r1 / 0
            if (r0 == 0) goto L39
            goto L1f
        L19:
            boolean r0 = Va.C1214y7.k(r3, r1)
            if (r0 == 0) goto L39
        L1f:
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x0042: FILL_ARRAY_DATA , data: [-96374055, 995172381, -1871642279, -457594463, -555573853, -678377075, -1369178605, -1300114783, 1380921788, 99866880} // fill-array
            int r1 = android.view.KeyEvent.getMaxKeyCode()
            int r1 = r1 >> 16
            int r1 = r1 + 17
            java.lang.String r0 = a(r1, r0)
            java.lang.String r0 = r0.intern()
            r2.e(r3, r0)
        L39:
            int r3 = Va.C1177v7.f14702f
            int r3 = r3 + 67
            int r3 = r3 % 128
            Va.C1177v7.f14701e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1177v7.onActivityResumed(android.app.Activity):void");
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (C1214y7.k(activity, this.f14703a)) {
            f14701e = (f14702f + 1) % 128;
            short tapTimeout = (short) ((ViewConfiguration.getTapTimeout() >> 16) + 6);
            c(h(1719239014 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-120) - Color.blue(0), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), tapTimeout, (-371307129) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), activity, bundle);
        }
        f14701e = (f14702f + 109) % 128;
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i5 = f14702f + 69;
        f14701e = i5 % 128;
        int i10 = i5 % 2;
        ArrayList arrayList = this.f14703a;
        if (i10 != 0) {
            C1214y7.k(activity, arrayList);
            throw null;
        }
        if (C1214y7.k(activity, arrayList)) {
            f14701e = (f14702f + 75) % 128;
            e(activity, a(TextUtils.getCapsMode("", 0, 0) + 17, new int[]{-96374055, 995172381, -1871642279, -457594463, -1672854210, -556973351, -1689115758, -440059602, 1380921788, 99866880}).intern());
        }
        int i11 = f14701e + 83;
        f14702f = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 65 / 0;
        }
    }

    @Override // Va.AbstractC0961eb, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i5 = f14702f + 51;
        f14701e = i5 % 128;
        int i10 = i5 % 2;
        ArrayList arrayList = this.f14703a;
        if (i10 != 0) {
            boolean zK = C1214y7.k(activity, arrayList);
            int i11 = 5 / 0;
            if (!zK) {
                return;
            }
        } else if (!C1214y7.k(activity, arrayList)) {
            return;
        }
        e(activity, h(1719239013 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (-16777336) - Color.rgb(0, 0, 0), (byte) View.MeasureSpec.getMode(0), (short) (50 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 371307147).intern());
        f14701e = (f14702f + 21) % 128;
    }
}
