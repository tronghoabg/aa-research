package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Va.j8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1023j8 extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    public static int f14306e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f14307f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final char[] f14308g = {379, 378, 372, 310, 361, 374, 367, 346, 365, 373, 375, 380, 381, 369, 333, 384, 363, 376};

    /* renamed from: h, reason: collision with root package name */
    public static int f14309h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f14310i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static int f14311j = 0;
    public static int k = 1;

    /* renamed from: a, reason: collision with root package name */
    public final String f14312a;

    /* renamed from: b, reason: collision with root package name */
    public final C1010i8 f14313b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f14314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14315d;

    public C1023j8(String str, String str2, String str3, int i5, String str4, C1191w8 c1191w8) {
        this.f14315d = 1;
        C1010i8 c1010i8 = new C1010i8(str, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C1010i8.d(8 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\uaafd枅絥껠砈ᣛ縏︌").intern());
        sb2.append(str.toLowerCase());
        sb2.append(C1010i8.d((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, "嬋堓").intern());
        sb2.append(str2);
        sb2.append(C1010i8.d((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, "\ue26e\ue2cf姁ḧ").intern());
        String string = sb2.toString();
        StringBuilder sbJ = N0.a.j(str);
        sbJ.append(C1010i8.d((-16777215) - Color.rgb(0, 0, 0), "襙矵").intern());
        sbJ.append(str2);
        c1010i8.a(new C1062m8(sbJ.toString(), str3, string, i5));
        this(str4, c1010i8, c1191w8);
    }

    public static String b(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 8777031841893598247L);
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    private String c() throws UnsupportedEncodingException {
        String str;
        f14309h = (f14310i + 1) % 128;
        int size = View.MeasureSpec.getSize(0) + 127;
        byte[] bytes = "\u0086\u008b\u008e\u008c\u0092\u0089\u0091\u0090\u008f\u0089\u008a\u008e\u008c\u0086\u008d\u0088\u0089\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14308g;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i5 = AbstractC0897a.f13938v;
                    if (i5 < AbstractC0897a.f13939w) {
                        cArr2[i5] = (char) (cArr[bytes[(r6 - 1) - i5] + size] - 264);
                        AbstractC0897a.f13938v = i5 + 1;
                    } else {
                        str = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String strIntern = str.intern();
        f14310i = (f14309h + 81) % 128;
        return strIntern;
    }

    public String a() {
        String str;
        switch (this.f14315d) {
            case 0:
                return c();
            default:
                f14311j = (k + 87) % 128;
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14431;
                char[] charArray = "ᗀ\u2d9e敡벀\uf4a3ఉ䟧齍흥\ueeb4♤秔놴줉ï塅逆ꮄ\ue37e㫛犯訌췰Օ崵".toCharArray();
                synchronized (AbstractC0897a.f13937u) {
                    try {
                        AbstractC0897a.f13936t = minimumFlingVelocity;
                        char[] cArr = new char[charArray.length];
                        AbstractC0897a.f13935s = 0;
                        while (true) {
                            int i5 = AbstractC0897a.f13935s;
                            if (i5 < charArray.length) {
                                cArr[i5] = (char) ((charArray[i5] ^ (AbstractC0897a.f13936t * i5)) ^ 7938959468981786035L);
                                AbstractC0897a.f13935s = i5 + 1;
                            } else {
                                str = new String(cArr);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String strIntern = str.intern();
                k = (f14311j + 101) % 128;
                return strIntern;
        }
    }

    public final void d(String str) {
        f14306e = (f14307f + 7) % 128;
        int i5 = AbstractC0897a.f13932p + 115;
        AbstractC0897a.f13931o = i5 % 128;
        int i10 = i5 % 2;
        AbstractC0897a.x(str, this.f14312a, null, this);
        if (i10 != 0) {
            throw null;
        }
        int i11 = AbstractC0897a.f13932p + 3;
        AbstractC0897a.f13931o = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        f14307f = (f14306e + 73) % 128;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a());
        String string = "";
        sb2.append(b(55008 - TextUtils.lastIndexOf("", '0', 0, 0), "䐝鋦").intern());
        sb2.append(this.f14312a);
        sb2.append('\n');
        sb2.append(this.f14313b);
        Throwable th = this.f14314c;
        if (th != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(b(51870 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "䐭軹텼ᮅ渠녓ﯭ칌Ⴍ寛긿\uf0b8").intern());
            sb3.append(Log.getStackTraceString(th));
            string = sb3.toString();
        } else {
            f14306e = (f14307f + 65) % 128;
        }
        sb2.append(string);
        return sb2.toString();
    }

    public C1023j8(String str, C1010i8 c1010i8, Throwable th) {
        this.f14312a = str;
        this.f14313b = c1010i8;
        this.f14314c = th;
    }

    public C1023j8(C1214y7 c1214y7, C1203x8 c1203x8, String str, Throwable th) {
        this.f14315d = 0;
        String strJ = c1214y7.u().j();
        String strB = c1214y7.h().b();
        C1010i8 c1010i8 = new C1010i8(strJ, strB);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C1010i8.b((byte) (ExpandableListView.getPackedPositionChild(0L) + 92), (ViewConfiguration.getTouchSlop() >> 8) + 8, "\u0001\u0002\u0003\u0000\u0005\u0006\u0006\n").intern());
        sb2.append(c1010i8.f14286b.toLowerCase());
        sb2.append(C1010i8.b((byte) (123 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1 - TextUtils.getOffsetBefore("", 0), "¨").intern());
        sb2.append(c1010i8.f14287c);
        sb2.append(C1010i8.b((byte) (105 - (ViewConfiguration.getEdgeSlop() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 4, "\u0004\u000b\u0001\u000b").intern());
        String string = sb2.toString();
        int i5 = C1010i8.f14283e + 63;
        C1010i8.f14284f = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 44 / 0;
        }
        if (c1203x8 != null) {
            ArrayList arrayList = new ArrayList();
            while (c1203x8 != null) {
                int i11 = C1203x8.f14771l;
                int i12 = i11 + 33;
                C1203x8.k = i12 % 128;
                if (i12 % 2 == 0) {
                    if (c1203x8.f14776e == null) {
                        break;
                    }
                    int i13 = i11 + 1;
                    C1203x8.k = i13 % 128;
                    if (i13 % 2 != 0) {
                        arrayList.add(c1203x8);
                        int i14 = 50 / 0;
                    } else {
                        arrayList.add(c1203x8);
                    }
                    c1203x8 = c1203x8.f14775d;
                } else {
                    throw null;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1203x8 c1203x82 = (C1203x8) it.next();
                StringBuilder sbJ = N0.a.j(strJ);
                sbJ.append(C1010i8.c((Process.myPid() >> 22) + 1, "䜸瞌").intern());
                sbJ.append(strB);
                String string2 = sbJ.toString();
                c1203x82.getClass();
                int i15 = C1203x8.f14771l + 19;
                C1203x8.k = i15 % 128;
                if (i15 % 2 == 0) {
                    C1126r8 c1126r8 = c1203x82.f14776e;
                    c1126r8.getClass();
                    C1126r8.f14551g = (C1126r8.f14550f + 25) % 128;
                    String str2 = c1126r8.f14552a;
                    C1203x8.k = (C1203x8.f14771l + 49) % 128;
                    int iB = c1203x82.b() + c1203x82.f14776e.a();
                    C1203x8.k = (C1203x8.f14771l + 71) % 128;
                    c1010i8.a(new C1062m8(string2, str2, string, iB));
                } else {
                    throw null;
                }
            }
        } else {
            StringBuilder sbJ2 = N0.a.j(strJ);
            sbJ2.append(C1010i8.c(ImageFormat.getBitsPerPixel(0) + 16, "ؗᯏ\uefe6䙊㏄\ue25e뫐彦癀嵣ﳸ볫掎\uf04b祭ⲽ").intern());
            c1010i8.a(new C1062m8(strJ, strB, sbJ2.toString(), 0));
        }
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        ArrayList arrayList2 = new ArrayList();
        String name = C1126r8.class.getName();
        for (int length = stackTrace.length - 1; length >= 0; length--) {
            StackTraceElement stackTraceElement = stackTrace[length];
            if (stackTraceElement.getClassName().equals(name)) {
                break;
            }
            arrayList2.add(0, stackTraceElement);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            StackTraceElement stackTraceElement2 = (StackTraceElement) it2.next();
            c1010i8.a(new C1062m8(stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), stackTraceElement2.getFileName(), stackTraceElement2.getLineNumber()));
        }
        this(str, c1010i8, th);
    }
}
