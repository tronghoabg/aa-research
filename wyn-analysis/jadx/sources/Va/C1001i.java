package Va;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: Va.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1001i extends Mb {

    /* renamed from: p, reason: collision with root package name */
    public static final char[] f14271p = {'9', 'k', 'h', 'h', 'i', 'g', 'T', ']', 'k', 'R', '\\', 'n', 'g', '_', 16, 'C', 'j', 'k', 'n', 't', 'l', 'f', 'C', 'I', 'p', 'p', 'r', '[', '2', 'I', 's', 'j', 'f', 'g', '?', 132, 132, '`', 'Y', 155, 156, 23};

    /* renamed from: q, reason: collision with root package name */
    public static int f14272q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static int f14273r = 1;

    /* renamed from: h, reason: collision with root package name */
    public C0999ha f14275h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC0975g f14276i;

    /* renamed from: j, reason: collision with root package name */
    public final C0962f f14277j;

    /* renamed from: m, reason: collision with root package name */
    public Class f14279m;

    /* renamed from: n, reason: collision with root package name */
    public C0988h f14280n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f14281o;

    /* renamed from: g, reason: collision with root package name */
    public final WeakHashMap f14274g = new WeakHashMap();
    public final WeakHashMap k = new WeakHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final WeakHashMap f14278l = new WeakHashMap();

    public C1001i(JSONObject jSONObject, C0999ha c0999ha) {
        C0988h c0988h = new C0988h();
        c0988h.f14235l = new ArrayList();
        c0988h.f14236m = new ArrayList();
        c0988h.f14237n = new ArrayList();
        c0988h.f14238o = new ArrayList();
        this.f14280n = c0988h;
        this.f14281o = new ArrayList();
        z(jSONObject, c0999ha);
        ViewOnLayoutChangeListenerC0975g viewOnLayoutChangeListenerC0975g = new ViewOnLayoutChangeListenerC0975g();
        viewOnLayoutChangeListenerC0975g.f14186a = this;
        this.f14276i = viewOnLayoutChangeListenerC0975g;
        C0962f c0962f = new C0962f(0);
        c0962f.f14145b = this;
        this.f14277j = c0962f;
        Za.n().p(this.f14277j);
        int i5 = f14273r + 81;
        f14272q = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 92 / 0;
        }
    }

    public static /* synthetic */ Class A(C1001i c1001i) {
        int i5 = f14273r;
        f14272q = (i5 + 101) % 128;
        Class cls = c1001i.f14279m;
        int i10 = i5 + 111;
        f14272q = i10 % 128;
        if (i10 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    public static /* synthetic */ void B(C1001i c1001i, ArrayList arrayList) throws Throwable {
        int i5 = f14272q + 125;
        f14273r = i5 % 128;
        int i10 = i5 % 2;
        c1001i.y(arrayList);
        if (i10 == 0) {
            int i11 = 16 / 0;
        }
    }

    public static /* synthetic */ ViewOnLayoutChangeListenerC0975g C(C1001i c1001i) {
        int i5 = f14273r;
        f14272q = (i5 + 97) % 128;
        ViewOnLayoutChangeListenerC0975g viewOnLayoutChangeListenerC0975g = c1001i.f14276i;
        int i10 = i5 + 103;
        f14272q = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 92 / 0;
        }
        return viewOnLayoutChangeListenerC0975g;
    }

    public static void D(Activity activity, View view, Class cls, boolean z2, List list, List list2, ArrayList arrayList) {
        f14272q = (f14273r + 115) % 128;
        if (view == null) {
            Bb.c(activity, cls, -1, null, false, z2, list, list2, arrayList);
        } else {
            Bb.d(view, cls, null, false, z2, list, list2, arrayList);
            f14272q = (f14273r + 13) % 128;
        }
    }

    public static /* synthetic */ C0988h t(C1001i c1001i) {
        int i5 = f14272q;
        f14273r = (i5 + 119) % 128;
        C0988h c0988h = c1001i.f14280n;
        f14273r = (i5 + 41) % 128;
        return c0988h;
    }

    public static String u(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14271p, i5, cArr, 0, i10);
                if (bArr != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bArr[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                if (z2) {
                    char[] cArr4 = new char[i10];
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr4[i15] = cArr[(i10 - i15) - 1];
                        Ab.f13222y = i15 + 1;
                    }
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static /* synthetic */ ArrayList x(C1001i c1001i) {
        int i5 = f14272q + 83;
        int i10 = i5 % 128;
        f14273r = i10;
        int i11 = i5 % 2;
        ArrayList arrayList = c1001i.f14281o;
        if (i11 == 0) {
            throw null;
        }
        int i12 = i10 + 43;
        f14272q = i12 % 128;
        if (i12 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public final void E() {
        l(null);
        Za.n().m(this.f14277j);
        WeakHashMap weakHashMap = this.f14278l;
        HashSet hashSet = new HashSet(weakHashMap.keySet());
        weakHashMap.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).removeOnLayoutChangeListener(this.f14276i);
            f14272q = (f14273r + 113) % 128;
        }
        f14273r = (f14272q + 7) % 128;
    }

    public final void c(View view) {
        String str;
        try {
            if (this.f14279m == null) {
                C0988h c0988h = this.f14280n;
                int i5 = C0988h.f14223q + 79;
                C0988h.f14224r = i5 % 128;
                if (i5 % 2 == 0) {
                    str = c0988h.f14225a;
                    int i10 = 46 / 0;
                } else {
                    str = c0988h.f14225a;
                }
                this.f14279m = Class.forName(str);
            }
            Activity activityI = C0974fb.e().i();
            if (activityI == null) {
                int i11 = f14273r + 29;
                f14272q = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                return;
            }
            if (!C0988h.a(this.f14280n).isEmpty()) {
                f14272q = (f14273r + 79) % 128;
                Activity activityB = Bb.b(view);
                if (activityB != null) {
                    int i12 = f14273r + 105;
                    f14272q = i12 % 128;
                    if (i12 % 2 != 0) {
                        C0988h.a(this.f14280n).contains(activityB.getClass().getName());
                        throw null;
                    }
                    if (C0988h.a(this.f14280n).contains(activityB.getClass().getName())) {
                        return;
                    }
                }
            }
            Cb.e(new Da(this, activityI, view, 2));
        } catch (Throwable th) {
            String strIntern = u("\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", new int[]{0, 14, 0, 0}, true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(u("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", new int[]{14, 20, 0, 14}, true).intern());
            C0988h c0988h2 = this.f14280n;
            int i13 = C0988h.f14223q + 79;
            C0988h.f14224r = i13 % 128;
            int i14 = i13 % 2;
            String str2 = c0988h2.f14225a;
            if (i14 == 0) {
                int i15 = 46 / 0;
            }
            sb2.append(str2);
            sb2.append(u("\u0000\u0001\u0001", new int[]{34, 3, 94, 0}, true).intern());
            sb2.append(th.getLocalizedMessage());
            Ab.x(strIntern, sb2.toString());
            E();
        }
    }

    @Override // Va.Mb
    public final String q(Object obj) {
        int i5 = f14272q;
        int i10 = i5 + 93;
        f14273r = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = i5 + 57;
            f14273r = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            int i12 = 10 / 0;
            throw null;
        }
        int i13 = i5 + 57;
        f14273r = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 10 / 0;
        }
        int i15 = i5 + 81;
        f14273r = i15 % 128;
        if (i15 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x015a, code lost:
    
        if (r6 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017d, code lost:
    
        if (((Va.C1126r8) r6.f14263a).c(r9, r7, java.util.Collections.singletonList(r5)).e() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017f, code lost:
    
        r6 = Va.C1001i.f14273r + 57;
        Va.C1001i.f14272q = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0188, code lost:
    
        if ((r6 % 2) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018a, code lost:
    
        r6 = 53 / r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7 A[PHI: r9
  0x00d7: PHI (r9v18 java.util.List) = (r9v17 java.util.List), (r9v24 java.util.List) binds: [B:25:0x00d4, B:22:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.util.ArrayList r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1001i.y(java.util.ArrayList):void");
    }

    public final void z(JSONObject jSONObject, C0999ha c0999ha) {
        C0988h c0988h = new C0988h();
        c0988h.f14235l = new ArrayList();
        c0988h.f14236m = new ArrayList();
        c0988h.f14237n = new ArrayList();
        c0988h.f14238o = new ArrayList();
        String strOptString = jSONObject.optString(C0988h.e((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34666, "᱿鬑ኞ訶Ǘ륾ミ꾟✧\udeae噃췉䕻ﰜ管").intern());
        int i5 = C0988h.f14224r + 63;
        int i10 = i5 % 128;
        C0988h.f14223q = i10;
        if (i5 % 2 != 0) {
            c0988h.f14225a = strOptString;
            throw null;
        }
        c0988h.f14225a = strOptString;
        C0988h.f14224r = (i10 + 89) % 128;
        String strOptString2 = jSONObject.optString(C0988h.c((-653552269) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-679993552) - (ViewConfiguration.getTapTimeout() >> 16), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (short) Color.blue(0), AndroidCharacter.getMirror('0') - 128).intern());
        int i11 = C0988h.f14224r;
        c0988h.f14226b = strOptString2;
        int i12 = i11 + 75;
        C0988h.f14223q = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        String strOptString3 = jSONObject.optString(C0988h.c((-653552258) - ExpandableListView.getPackedPositionType(0L), KeyEvent.normalizeMetaState(0) - 679993543, (byte) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (Process.myTid() >> 22) - 83).intern());
        int i13 = C0988h.f14224r;
        int i14 = i13 + 57;
        C0988h.f14223q = i14 % 128;
        if (i14 % 2 != 0) {
            c0988h.f14227c = strOptString3;
            throw null;
        }
        c0988h.f14227c = strOptString3;
        int i15 = i13 + 121;
        C0988h.f14223q = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
        boolean zOptBoolean = jSONObject.optBoolean(C0988h.c(Color.blue(0) - 653552249, View.resolveSize(0, 0) - 679993532, (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) (Process.myTid() >> 22), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 77).intern());
        int i16 = C0988h.f14223q;
        c0988h.f14228d = zOptBoolean;
        C0988h.f14224r = (i16 + 29) % 128;
        jSONObject.optBoolean(C0988h.c((-653552234) - KeyEvent.getDeadChar(0, 0), (-679993533) - ImageFormat.getBitsPerPixel(0), (byte) (ViewConfiguration.getTapTimeout() >> 16), (short) (TextUtils.lastIndexOf("", '0', 0) + 1), (-76) - Process.getGidForName("")).intern());
        String strOptString4 = jSONObject.optString(C0988h.e(Color.red(0) + 1523, "ᱫᦟប\u0d97\u0ba0Ǆ㿊㗒㏾").intern());
        int i17 = C0988h.f14223q;
        c0988h.f14229e = strOptString4;
        int i18 = i17 + 29;
        C0988h.f14224r = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
        boolean zOptBoolean2 = jSONObject.optBoolean(C0988h.e((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49529, "ᱷ\udd14麢堔ᦎ\udb2a钾嘴ភ턻").intern());
        int i19 = (C0988h.f14223q + 33) % 128;
        C0988h.f14224r = i19;
        c0988h.f14230f = zOptBoolean2;
        int i20 = i19 + 63;
        C0988h.f14223q = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 5 / 0;
        }
        boolean zOptBoolean3 = jSONObject.optBoolean(C0988h.e((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 4397, "ᱸ൜㸶⿺壏䦬筵摋锒蛊랰ꂝ퉇쌡\uec0d຺ᷓ㾐").intern());
        int i22 = C0988h.f14224r + 39;
        C0988h.f14223q = i22 % 128;
        if (i22 % 2 != 0) {
            c0988h.f14231g = zOptBoolean3;
            throw null;
        }
        c0988h.f14231g = zOptBoolean3;
        boolean zOptBoolean4 = jSONObject.optBoolean(C0988h.e(View.MeasureSpec.getMode(0) + 7207, "ᱬ\\\u2433䠞泰邮뒝\ud979﵃").intern());
        int i23 = (C0988h.f14224r + 113) % 128;
        C0988h.f14223q = i23;
        c0988h.f14232h = zOptBoolean4;
        int i24 = i23 + 89;
        C0988h.f14224r = i24 % 128;
        if (i24 % 2 == 0) {
            throw null;
        }
        boolean zOptBoolean5 = jSONObject.optBoolean(C0988h.c(KeyEvent.normalizeMetaState(0) - 653552217, (-679993532) - View.MeasureSpec.getSize(0), (byte) Color.green(0), (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-81) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), true);
        int i25 = C0988h.f14223q + 1;
        C0988h.f14224r = i25 % 128;
        if (i25 % 2 == 0) {
            c0988h.f14233i = zOptBoolean5;
            int i26 = 29 / 0;
        } else {
            c0988h.f14233i = zOptBoolean5;
        }
        boolean zOptBoolean6 = jSONObject.optBoolean(C0988h.c(TextUtils.indexOf((CharSequence) "", '0', 0) - 653552204, (-679993532) - Gravity.getAbsoluteGravity(0, 0), (byte) Drawable.resolveOpacity(0, 0), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-83) - (Process.myPid() >> 22)).intern());
        int i27 = (C0988h.f14223q + 83) % 128;
        C0988h.f14224r = i27;
        c0988h.f14234j = zOptBoolean6;
        int i28 = i27 + 25;
        C0988h.f14223q = i28 % 128;
        if (i28 % 2 != 0) {
            throw null;
        }
        boolean zOptBoolean7 = jSONObject.optBoolean(C0988h.c((-653552196) - Color.green(0), View.resolveSize(0, 0) - 679993537, (byte) View.combineMeasuredStates(0, 0), (short) (ViewConfiguration.getEdgeSlop() >> 16), (-69) - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), true);
        int i29 = C0988h.f14223q + 119;
        C0988h.f14224r = i29 % 128;
        if (i29 % 2 == 0) {
            c0988h.k = zOptBoolean7;
            throw null;
        }
        c0988h.k = zOptBoolean7;
        ArrayList arrayListI = Ab.i(jSONObject.optJSONArray(C0988h.e(TextUtils.getCapsMode("", 0, 0) + 16657, "ᱨ嵦鹙\udf5a᠓夯騋").intern()));
        int i30 = C0988h.f14223q;
        int i31 = i30 + 29;
        C0988h.f14224r = i31 % 128;
        if (i31 % 2 == 0) {
            throw null;
        }
        if (arrayListI != null) {
            int i32 = i30 + 63;
            C0988h.f14224r = i32 % 128;
            if (i32 % 2 == 0) {
                c0988h.f14235l = arrayListI;
                throw null;
            }
            c0988h.f14235l = arrayListI;
        }
        ArrayList arrayListI2 = Ab.i(jSONObject.optJSONArray(C0988h.c((-653552174) - MotionEvent.axisFromString(""), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 679993553, (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (short) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), (KeyEvent.getMaxKeyCode() >> 16) - 75).intern()));
        int i33 = C0988h.f14224r + 101;
        int i34 = i33 % 128;
        C0988h.f14223q = i34;
        if (i33 % 2 != 0) {
            throw null;
        }
        if (arrayListI2 != null) {
            C0988h.f14224r = (i34 + 5) % 128;
            c0988h.f14236m = arrayListI2;
        }
        int i35 = i34 + 87;
        C0988h.f14224r = i35 % 128;
        if (i35 % 2 == 0) {
            throw null;
        }
        ArrayList arrayListI3 = Ab.i(jSONObject.optJSONArray(C0988h.e(24499 - (ViewConfiguration.getPressedStateDuration() >> 16), "ᱨ䏄ꌝͰ抡숵≃膲\ue1e1䄻ꂏÝ怟").intern()));
        if (arrayListI3 != null) {
            int i36 = C0988h.f14223q;
            c0988h.f14237n = arrayListI3;
            C0988h.f14224r = (i36 + 79) % 128;
        }
        int i37 = C0988h.f14224r + 81;
        C0988h.f14223q = i37 % 128;
        if (i37 % 2 != 0) {
            throw null;
        }
        ArrayList arrayListI4 = Ab.i(jSONObject.optJSONArray(C0988h.e(View.resolveSize(0, 0) + 30803, "ᱽ搡\uecd9璔ﴡ䗤춟嘏\udee9⚾꽅㟪뾊").intern()));
        int i38 = C0988h.f14224r;
        int i39 = i38 + 81;
        C0988h.f14223q = i39 % 128;
        if (i39 % 2 != 0) {
            throw null;
        }
        if (arrayListI4 != null) {
            c0988h.f14238o = arrayListI4;
        }
        C0988h.f14223q = (i38 + 109) % 128;
        this.f14280n = c0988h;
        this.f14275h = c0999ha;
        f14273r = (f14272q + 99) % 128;
    }
}
