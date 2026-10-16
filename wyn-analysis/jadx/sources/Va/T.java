package Va;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class T extends Ba {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f13699l = {'C', 5133, 10410, 15688, 20973, 25993, 31288, 36545, 41826, 46911, 52149, 57432, 62713, 2205, 7481, 12748, 'I', 5132, 10413, 15698, 20961, 25995, 31264, 36551, 41834, 46875, 52154, 57425, 62648, 56191, 53071, 62462, 58900, 35512, 48833, 41334, 21969, 30764, 27714, 4325, 15111, 12194, 54214, 50807, 60046, 40205, 33277, '(', 5121, 10405, 15685, 20960, 25999, 31272, 36487, '(', 5124, 10401, 15698, 20971, 25986, 31273, 36554, 41785};

    /* renamed from: m, reason: collision with root package name */
    public static int f13700m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f13701n = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B7 f13702c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1127r9 f13703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f13704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ba f13706g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f13707h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z0 f13708i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f13709j;
    public final /* synthetic */ V k;

    public T(V v2, Z0 z02, B7 b72, AbstractC1127r9 abstractC1127r9, Ba ba2, Context context, String str, String str2, boolean z2) {
        this.k = v2;
        this.f13702c = b72;
        this.f13703d = abstractC1127r9;
        this.f13704e = str;
        this.f13705f = z2;
        this.f13706g = ba2;
        this.f13707h = str2;
        this.f13708i = z02;
        this.f13709j = context;
    }

    public static String d(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13699l[i5 + i11] ^ (i11 * (-8690789127003630494L))) ^ c10);
                        Ab.f13217t = i11 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // Va.Ba
    public final void c() {
        B7 b72;
        C1051la c1051laA;
        boolean z2;
        char cMyTid;
        int defaultSize;
        int longPressTimeout;
        V v2 = this.k;
        if (V.M(v2).get() || (b72 = this.f13702c) == null) {
            return;
        }
        f13701n = (f13700m + 99) % 128;
        int i5 = V.f13769p + 67;
        V.f13770q = i5 % 128;
        if (i5 % 2 == 0) {
            v2.i();
            throw null;
        }
        ArrayList arrayListI = v2.i();
        AbstractC1127r9 abstractC1127r9 = this.f13703d;
        if (arrayListI.contains(abstractC1127r9) || (c1051laA = V.A(v2)) == null) {
            return;
        }
        Da da2 = new Da(7);
        da2.f13291f = c1051laA;
        da2.f13289d = this.f13704e;
        da2.f13290e = b72;
        Cb.g(da2);
        boolean zB = b72.b();
        Ba ba2 = this.f13706g;
        if (!zB) {
            int i10 = f13701n + 31;
            f13700m = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            Cb.e(ba2);
        }
        int i11 = V.f13769p + 101;
        V.f13770q = i11 % 128;
        if (i11 % 2 == 0) {
            b72.d();
            throw null;
        }
        String strD = b72.d();
        if (strD == null || AbstractC1104pb.b(IronSourceAdQuality.getSDKVersion(), strD) >= 0) {
            int i12 = V.f13769p + 67;
            V.f13770q = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 21 / 0;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        V.f13770q = (V.f13769p + 49) % 128;
        if (!z2) {
            C1169v c1169v = new C1169v(2);
            c1169v.f14690d = this;
            Cb.g(c1169v);
            return;
        }
        String strIntern = d((-1) - ImageFormat.getBitsPerPixel(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, (char) View.MeasureSpec.getSize(0)).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 13, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern());
        String str = this.f13707h;
        sb2.append(str);
        sb2.append(d(29 - ExpandableListView.getPackedPositionType(0L), 18 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TextUtils.indexOf("", "", 0) + 56159)).intern());
        if (this.f13705f) {
            f13701n = (f13700m + 95) % 128;
            cMyTid = (char) TextUtils.getOffsetAfter("", 0);
            defaultSize = (ViewConfiguration.getJumpTapTimeout() >> 16) + 47;
            longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 8;
        } else {
            cMyTid = (char) (Process.myTid() >> 22);
            defaultSize = View.getDefaultSize(0, 0) + 55;
            longPressTimeout = 8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        }
        sb2.append(d(defaultSize, longPressTimeout, cMyTid).intern());
        AbstractC0897a.J(strIntern, sb2.toString());
        Z0 z02 = this.f13708i;
        HashMap mapA0 = z02.A0();
        z02.f13888K = mapA0;
        String strIntern2 = Z0.v0((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 21398), "麺麭閶婓", "ꕙ\udb2a嘜䙃뙪쇋韑ٶꌺ戈\udad0盎錌쁵ꇗฦ鼥", ExpandableListView.getPackedPositionGroup(0L) - 1231114850).intern();
        X0 x02 = new X0(0);
        x02.f13840b = z02;
        mapA0.put(strIntern2, x02);
        Map map = z02.f13888K;
        String strIntern3 = Z0.z0((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 81033394, (-16) - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (90 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (short) ('0' - AndroidCharacter.getMirror('0')), 1300890105 - (Process.myPid() >> 22)).intern();
        X0 x03 = new X0(1);
        x03.f13840b = z02;
        map.put(strIntern3, x03);
        Map map2 = z02.f13888K;
        String strIntern4 = Z0.z0((-81033395) - Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 27, (byte) ((-125) - View.getDefaultSize(0, 0)), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1300890122 - MotionEvent.axisFromString("")).intern();
        X0 x04 = new X0(2);
        x04.f13840b = z02;
        map2.put(strIntern4, x04);
        Z0.f13886P = (Z0.f13887Q + 81) % 128;
        if (b72.b()) {
            int i14 = (f13700m + 11) % 128;
            f13701n = i14;
            int i15 = i14 + 67;
            f13700m = i15 % 128;
            if (i15 % 2 != 0) {
                Cb.e(ba2);
                int i16 = 41 / 0;
            } else {
                Cb.e(ba2);
            }
        }
        if (Kb.u().C()) {
            return;
        }
        int i17 = V.f13769p + 13;
        V.f13770q = i17 % 128;
        int i18 = i17 % 2;
        v2.I(b72, str);
        if (i18 == 0) {
            int i19 = 25 / 0;
        }
        V.f13769p = (V.f13770q + 125) % 128;
        if (V.E(v2, b72.j())) {
            return;
        }
        int i20 = V.f13769p + 67;
        V.f13770q = i20 % 128;
        if (i20 % 2 != 0) {
            v2.i().add(abstractC1127r9);
        } else {
            v2.i();
            throw null;
        }
    }
}
