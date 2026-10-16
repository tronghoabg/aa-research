package Va;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1169v extends Ba {

    /* renamed from: g, reason: collision with root package name */
    public static int f14685g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f14686h = 1;

    /* renamed from: j, reason: collision with root package name */
    public static int f14688j = 0;
    public static int k = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14689c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f14690d;

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f14683e = {'A', 30477, 61095, 26181, 56821, 21659, 52283, 17366, 47979, 'E', 30481, 61108, 26182, 56830, 21711, 52283, 17371, 47928, 12808, 43451, 8495, 39104, 4162, 34588, 65192, 30302, 60903, 25804, 56441, 21459, 52081, 17089, 47498, 12581, 43227, 8290, 38676, 3744, 34398, 65013, 29843};

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f14684f = {'C', 'o', 'n', 'e', 'c', 't', 'r', 'M', 'a', 'g', ' ', 's', 'u', 'f', 'l', 'y', 'i', 'z', 'd', 'E', 'v', 'j', 'A', 'Q', 'S', 'D', 'K', 'w', 'h', 'I', '.', 'F', 'G', 'H', 'J', 'L'};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f14687i = {-1062878114, -96155628, -979946817, -1863371391, 361597796, 1409414449, -1846634432, -1338069574, -1996832396, -338645461, -686005585, 1228166387, 133588651, -2106968390, 1575203545, -1220551231, -2060771456, 793528245};

    public /* synthetic */ C1169v(int i5) {
        this.f14689c = i5;
    }

    public static String d(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14684f;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 6;
                            int i13 = c10 % 6;
                            int i14 = c11 / 6;
                            int i15 = c11 % 6;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 5) % 6) * 6) + i13];
                                cArr2[i11] = cArr[(((i14 + 5) % 6) * 6) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 6) + ((i13 + 5) % 6)];
                                cArr2[i11] = cArr[(i14 * 6) + ((i15 + 5) % 6)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 6) + i15];
                                cArr2[i11] = cArr[(i14 * 6) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String e(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14687i.clone();
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

    public static String f(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i5];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i5) {
                        cArr[i11] = (char) ((f14683e[i10 + i11] ^ (i11 * 6268091576278218595L)) ^ c10);
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

    public static String g(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-2838240577808161197L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * (-2838240577808161197L)));
                        AbstractC1104pb.f14483C = i10 + 1;
                    } else {
                        str2 = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    private final void h() {
        C0963f0 c0963f0 = (C0963f0) ((C1206y) this.f14690d).f14799e;
        int i5 = C0963f0.f14148h;
        int i10 = i5 + 39;
        C0963f0.f14147g = i10 % 128;
        int i11 = i10 % 2;
        C1194x c1194x = c0963f0.f14151c;
        if (i11 != 0) {
            throw null;
        }
        C0963f0.f14147g = (i5 + 21) % 128;
        synchronized (c1194x) {
            try {
                Handler handler = c1194x.f14748f;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                c1194x.n(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void i() {
        Jb jb2 = (Jb) this.f14690d;
        if (jb2.f13459a) {
            V vJ = Kb.j(jb2.f13464f);
            Context context = ((Jb) this.f14690d).f13460b;
            C1169v c1169v = new C1169v(this, 22);
            synchronized (vJ) {
                V.f13770q = (V.f13769p + 113) % 128;
                if (vJ.f13771a.get()) {
                    V.f13769p = (V.f13770q + 39) % 128;
                    return;
                }
                if (vJ.f13772b) {
                    C1169v c1169v2 = new C1169v(13);
                    c1169v2.f14690d = c1169v;
                    Cb.g(c1169v2);
                    V.f13769p = (V.f13770q + 113) % 128;
                    return;
                }
                String strIntern = V.B(Drawable.resolveOpacity(0, 0) + 60337, "荭棹吟䁊ⶉᤵգ\uf28f\udedd쩆랂ꏼ").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(V.B(TextUtils.getCapsMode("", 0, 0) + 53299, "茁匲⍧\uf398쏍鏾戳㉤ʙ틊ꋿ焰䅥ᆖ\ue1c6놸聮倠⃔\uf0b6삿靶朼㟚ށퟷꙃ瘩䛩\u169e\ue6b7땭蔥嗋▓\uf5f5").intern());
                sb2.append(IronSourceAdQuality.getSDKVersion());
                sb2.append(V.l("\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001", new int[]{0, 15, 0, 0}).intern());
                Ab.Y(strIntern, sb2.toString());
                Da da2 = new Da(vJ, c1169v, context, 4);
                if (vJ.a()) {
                    vJ.P(context, da2);
                } else {
                    int i5 = V.f13770q + 91;
                    V.f13769p = i5 % 128;
                    if (i5 % 2 != 0) {
                        C0985g9 c0985g9 = new C0985g9(6);
                        int i10 = Y.f13866e + 103;
                        Y.f13865d = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                        vJ.D(context, c0985g9, Y.f(), da2);
                        throw null;
                    }
                    C0985g9 c0985g92 = new C0985g9(6);
                    int i11 = Y.f13866e + 103;
                    Y.f13865d = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                    vJ.D(context, c0985g92, Y.f(), da2);
                }
                vJ.f13772b = true;
            }
        }
    }

    private final void j() {
        String str;
        Ra raB = Kb.b(((Jb) ((C1169v) this.f14690d).f14690d).f13464f);
        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 14;
        int longPressTimeout = 205 - (ViewConfiguration.getLongPressTimeout() >> 16);
        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 13;
        char[] charArray = "\b�\u0003ￊ\u0002\u0005\u000e\u000f\u0010\uffef\u0001\u0001\n\u0002".toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[offsetAfter];
                Ab.f13219v = 0;
                while (true) {
                    int i5 = Ab.f13219v;
                    if (i5 >= offsetAfter) {
                        break;
                    }
                    char c10 = (char) (charArray[i5] + longPressTimeout);
                    cArr[i5] = c10;
                    cArr[i5] = (char) (c10 - 'i');
                    Ab.f13219v = i5 + 1;
                }
                if (absoluteGravity > 0) {
                    Ab.f13220w = absoluteGravity;
                    char[] cArr2 = new char[offsetAfter];
                    System.arraycopy(cArr, 0, cArr2, 0, offsetAfter);
                    int i10 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, offsetAfter - i10, i10);
                    int i11 = Ab.f13220w;
                    System.arraycopy(cArr2, i11, cArr, 0, offsetAfter - i11);
                }
                str = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strIntern = str.intern();
        Ra ra2 = new Ra(this);
        raB.getClass();
        Ra.k().post(new Da(raB, strIntern, ra2, 20));
        int i12 = Ra.f13660c + 67;
        Ra.f13661d = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.Ba
    public void a(Throwable th) throws JSONException {
        switch (this.f14689c) {
            case 1:
                O o7 = (O) this.f14690d;
                V v2 = (V) o7.f13562g;
                B7 b72 = (B7) o7.f13559d;
                try {
                    ((JSONObject) V.h(v2).get(b72.j())).put(d((byte) (KeyEvent.normalizeMetaState(0) + 81), 4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u000e\u0004\u0011\u0004").intern(), false);
                    f14686h = (f14685g + 95) % 128;
                } catch (JSONException e7) {
                    Ab.R(d((byte) (TextUtils.getTrimmedLength("") + 83), View.MeasureSpec.getMode(0) + 16, "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t").intern(), d((byte) ((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 19), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, "\u0012\u0007\u0007\u0000\u0007\u000b\t\u0005\u0087\u0087\u000e\u0004\n\u000b\u000e\u0004\u0011\u0004\u000b\u0004\u0004\u0007\u0005\u0002\u0081\u0081\u0004\u0005\u0000\u0002\u0007\u000b\u0015\u0002\u0007\u0006\r\u0004\u0004\b\u0017\t\u0002\u0003").intern(), e7);
                }
                C1051la c1051laA = V.A(v2);
                if (c1051laA != null) {
                    Cb.g(new Da(c1051laA, (String) o7.f13560e, EnumC0911b0.f14014d, 6));
                    f14686h = (f14685g + 5) % 128;
                }
                String strIntern = d((byte) (Color.alpha(0) + 83), 16 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d((byte) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 114), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19, "\u0012\u0007\u0007\u0000\u0007\u000b\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\f\u0011\u0003\b\u0092").intern());
                sb2.append(b72.o());
                sb2.append(d((byte) ((Process.myPid() >> 22) + 58), 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007").intern());
                Ab.p(strIntern, sb2.toString(), th, true, true, true);
                String strIntern2 = d((byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 98), 11 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0017\u0013\u0012\u0011\u000e\u0014\u0011\u0004\f\u001b\u001a\u001b").intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(d((byte) (57 - (ViewConfiguration.getPressedStateDuration() >> 16)), 53 - TextUtils.indexOf("", ""), "\u0014\u0004\t\u0004««\u0000\u0007\u0007\u0004\u009c\u009c\u0012\f\t\u0000\u0016\u0006\u001c\u001d\u0011\u000f\u0004\t\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\f\u0011\u0003\b\u000b\u001c\u001c\u0012\u0013\u0012\u000e\u0006\u000f\u0011\u0003\u0011\u0006\u001c\u001a\u001bY").intern());
                sb3.append(b72.o());
                sb3.append(d((byte) (77 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007{").intern());
                Ab.k(strIntern2, sb3.toString());
                break;
            default:
                super.a(th);
                break;
        }
    }

    @Override // Va.Ba
    public final void c() throws JSONException, ClassNotFoundException {
        boolean z2;
        String str;
        int i5 = 1;
        int i10 = 8;
        String strC = null;
        int i11 = 6;
        char c10 = 2;
        switch (this.f14689c) {
            case 0:
                C0999ha c0999ha = (C0999ha) this.f14690d;
                C1194x.D((C1194x) c0999ha.f14264b);
                C1206y c1206y = (C1206y) c0999ha.f14263a;
                if (c1206y != null) {
                    try {
                        c1206y.c();
                        return;
                    } catch (Exception e7) {
                        Ab.p(f(Gravity.getAbsoluteGravity(0, 0) + 9, (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) View.resolveSizeAndState(0, 0, 0)).intern(), f((Process.myPid() >> 22) + 32, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 8, (char) (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), e7, false, false, true);
                        return;
                    }
                }
                return;
            case 1:
                int i12 = f14685g + 39;
                f14686h = i12 % 128;
                int i13 = i12 % 2;
                O o7 = (O) this.f14690d;
                if (i13 == 0) {
                    ((B7) o7.f13559d).i();
                    V.A((V) o7.f13562g);
                    throw null;
                }
                ((B7) o7.f13559d).i();
                C1051la c1051laA = V.A((V) o7.f13562g);
                if (c1051laA != null) {
                    Cb.g(new Da(c1051laA, (String) o7.f13560e, EnumC0898a0.f13945d, i10));
                }
                String strIntern = d((byte) (83 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((B7) o7.f13559d).o());
                sb2.append(d((byte) (Color.red(0) + 74), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 35, "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007\u000b\u0006\u0010\u0000\u0005\u0004½½\u000e\r¶¶\u0010\t\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\u000f\u0005®").intern());
                Ab.a(strIntern, sb2.toString());
                f14685g = (f14686h + 59) % 128;
                return;
            case 2:
                T t10 = (T) this.f14690d;
                V v2 = t10.k;
                HashMap mapM = V.m(v2);
                B7 b72 = t10.f13702c;
                if (mapM.containsKey(b72.j())) {
                    return;
                }
                int i14 = k + 107;
                f14688j = i14 % 128;
                if (i14 % 2 != 0) {
                    V.A(v2);
                    throw null;
                }
                C1051la c1051laA2 = V.A(v2);
                if (c1051laA2 == null) {
                    int i15 = f14688j + 123;
                    k = i15 % 128;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                Cb.g(new Da(c1051laA2, b72.j(), EnumC0911b0.f14012b, i11));
                JSONObject jSONObjectH = V.H(b72);
                try {
                    jSONObjectH.put(e(3 - View.resolveSizeAndState(0, 0, 0), new int[]{1533161806, 1665486804}).intern(), false);
                } catch (JSONException unused) {
                }
                V.h(v2).put(b72.j(), jSONObjectH);
                String strJ = b72.j();
                HashMap map = c1051laA2.f14368a;
                C0924c0 c0924c0 = map != null ? (C0924c0) map.get(strJ) : null;
                if (c0924c0 != null) {
                    int i16 = C0924c0.k + 109;
                    C0924c0.f14054l = i16 % 128;
                    if (i16 % 2 == 0) {
                        c0924c0.c(c0924c0.f14062h);
                        throw null;
                    }
                    strC = c0924c0.c(c0924c0.f14062h);
                    int i17 = C0924c0.k + 29;
                    C0924c0.f14054l = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i18 = 6 / 0;
                    }
                }
                String str2 = strC;
                V.m(v2).put(b72.j(), str2);
                if (b72.b()) {
                    ISAdQualityInitListener iSAdQualityInitListenerL = v2.L();
                    ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(b72.o());
                    sb3.append(e(View.resolveSizeAndState(0, 0, 0) + 13, new int[]{1987470961, 416836929, 504386406, -1665254015, -836126619, -1593379859, -814310993, -124558823}).intern());
                    sb3.append(b72.h());
                    sb3.append(e(29 - (ViewConfiguration.getEdgeSlop() >> 16), new int[]{155422545, -951080553, -1213862073, 1300878889, 797235886, 1983465650, -780508520, 1675149943, 1987470961, 416836929, 504386406, -1665254015, -836126619, -1593379859, -814310993, -124558823}).intern());
                    sb3.append(b72.d());
                    sb3.append(e(TextUtils.indexOf((CharSequence) "", '0', 0) + 10, new int[]{-513825844, -1756913284, 1689083623, -534713635, -305680078, -359377100}).intern());
                    ((Hb) iSAdQualityInitListenerL).adQualitySdkInitFailed(iSAdQualityInitError, sb3.toString());
                }
                Ab.p(e(16 - Gravity.getAbsoluteGravity(0, 0), new int[]{1417784286, 880069630, 1224740807, -921078062, -495133024, -1476577129, -732707976, -2015526773}).intern(), str2, null, true, true, false);
                return;
            case 3:
                Kb kb2 = (Kb) ((Db) this.f14690d).f13292a.f13389h;
                int i19 = Kb.f13490x + 27;
                Kb.f13489w = i19 % 128;
                if (i19 % 2 != 0) {
                    kb2.s(false);
                    return;
                } else {
                    kb2.s(true);
                    return;
                }
            case 4:
                C1218z c1218z = (C1218z) ((C1105q) this.f14690d).f14517b;
                int i20 = C1218z.f14823e + 55;
                int i21 = i20 % 128;
                C1218z.f14822d = i21;
                if (i20 % 2 != 0) {
                    z2 = c1218z.f14829a;
                    int i22 = 84 / 0;
                } else {
                    z2 = c1218z.f14829a;
                }
                int i23 = (i21 + 39) % 128;
                C1218z.f14823e = i23;
                if (z2) {
                    int i24 = (i23 + 37) % 128;
                    C1218z.f14822d = i24;
                    V v10 = (V) c1218z.f14830b;
                    C1218z.f14823e = (i24 + 115) % 128;
                    char gidForName = (char) ((-1) - Process.getGidForName(""));
                    int i25 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1;
                    char[] charArray = "황䁍␅状闇\uec88㢯蒪泇퍷迫弽♌\ue2a6甽硞ᢱ\uda5bನ늑⛧ᦇ揢墲".toCharArray();
                    char[] charArray2 = "ᥬ봂鯤ᾇ".toCharArray();
                    char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
                    synchronized (AbstractC0897a.f13934r) {
                        try {
                            char[] cArr = (char[]) charArray2.clone();
                            char[] cArr2 = (char[]) charArray3.clone();
                            cArr[0] = (char) (gidForName ^ cArr[0]);
                            cArr2[2] = (char) (cArr2[2] + ((char) i25));
                            int length = charArray.length;
                            char[] cArr3 = new char[length];
                            AbstractC0897a.f13933q = 0;
                            while (true) {
                                int i26 = AbstractC0897a.f13933q;
                                if (i26 < length) {
                                    int i27 = (i26 + 3) % 4;
                                    int i28 = cArr[i26 % 4] * 32718;
                                    char c11 = cArr2[(i26 + 2) % 4];
                                    char c12 = (char) ((i28 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                                    char c13 = c10;
                                    cArr2[i27] = (char) (((cArr[i27] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                                    cArr[i27] = c12;
                                    int i29 = i5;
                                    cArr3[i26] = (char) ((0 ^ (charArray[i26] ^ c12)) ^ 50077);
                                    AbstractC0897a.f13933q = i26 + i29;
                                    i5 = i29;
                                    length = length;
                                    c10 = c13;
                                } else {
                                    str = new String(cArr3);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    String strIntern2 = str.intern();
                    v10.getClass();
                    v10.y(strIntern2, new ArrayList());
                    V.f13769p = (V.f13770q + 13) % 128;
                    C1218z c1218z2 = (C1218z) ((C1105q) this.f14690d).f14517b;
                    int i30 = C1218z.f14822d + 11;
                    C1218z.f14823e = i30 % 128;
                    int i31 = i30 % 2;
                    c1218z2.f14829a = false;
                    if (i31 == 0) {
                        int i32 = 6 / 0;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                C0935cb c0935cb = (C0935cb) this.f14690d;
                ((G) c0935cb.f14083c).i0((Context) c0935cb.f14081a, (H) c0935cb.f14082b, false);
                return;
            case 6:
                ((C1169v) ((C1169v) this.f14690d).f14690d).run();
                return;
            case 7:
                ((C1169v) ((Da) this.f14690d).f13289d).run();
                return;
            case 8:
                V.j(((L) this.f14690d).f13510d);
                return;
            case 9:
                Da da2 = (Da) this.f14690d;
                if (V.g((V) da2.f13291f)) {
                    V.j((V) da2.f13291f);
                    return;
                }
                return;
            case 10:
                Ga ga2 = (Ga) this.f14690d;
                V v11 = (V) ga2.f13389h;
                ArrayList arrayList = (ArrayList) ga2.f13386e;
                ArrayList arrayList2 = (ArrayList) ga2.f13387f;
                Da da3 = (Da) ga2.f13388g;
                V.f13770q = (V.f13769p + 45) % 128;
                v11.J((Context) ga2.f13385d, arrayList, arrayList2, da3);
                V.f13770q = (V.f13769p + 47) % 128;
                return;
            case 11:
                N n10 = ((M) this.f14690d).f13522d;
                V.O(n10.f13546i, n10.f13541d, n10.f13544g, n10.f13545h);
                return;
            case 12:
                C1169v c1169v = new C1169v(i11);
                c1169v.f14690d = this;
                Cb.c(c1169v);
                return;
            case 13:
                ((C1169v) this.f14690d).run();
                return;
            case 14:
                HashMap map2 = ((C1051la) this.f14690d).f14368a;
                if (map2 != null) {
                    map2.clear();
                    return;
                }
                return;
            case 15:
                h();
                return;
            case 16:
                Cb.e((AbstractC1205xa) this.f14690d);
                return;
            case 17:
                ((La) this.f14690d).f13519d.h(new ArrayList());
                return;
            case 18:
                ((Ta) this.f14690d).f13724d.a();
                return;
            case 19:
                Xa.k(((Va) ((C1169v) this.f14690d).f14690d).f13798d);
                return;
            case 20:
                C0974fb.e().f((C1105q) ((Va) this.f14690d).f13798d.f13861f);
                C1169v c1169v2 = new C1169v(19);
                c1169v2.f14690d = this;
                Cb.j(c1169v2);
                return;
            case 21:
                AbstractC1117qb.g((Activity) this.f14690d);
                return;
            case 22:
                j();
                return;
            case 23:
                i();
                return;
            case 24:
                Kb kb3 = (Kb) this.f14690d;
                int i33 = Kb.f13489w + 37;
                Kb.f13490x = i33 % 128;
                if (i33 % 2 == 0) {
                    CopyOnWriteArraySet copyOnWriteArraySet = kb3.f13506q;
                    throw null;
                }
                Iterator it = kb3.f13506q.iterator();
                while (it.hasNext()) {
                    ISAdQualityInitListener iSAdQualityInitListener = (ISAdQualityInitListener) it.next();
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitSuccess();
                    }
                }
                int i34 = Kb.f13489w + 37;
                Kb.f13490x = i34 % 128;
                if (i34 % 2 == 0) {
                    throw null;
                }
                kb3.f13506q.clear();
                return;
            case 25:
                Tb.O(((Qb) this.f14690d).f13643e).getClass();
                return;
            case 26:
                Tb tb = (Tb) ((C1169v) this.f14690d).f14690d;
                tb.getClass();
                Tb.f13727s = (Tb.f13728t + 103) % 128;
                C0974fb.e().f(tb);
                Tb.f13728t = (Tb.f13727s + 121) % 128;
                return;
            case 27:
                Tb tb2 = (Tb) this.f14690d;
                try {
                    Class<?> cls = Class.forName(Sb.a(Tb.F(tb2)));
                    int i35 = Tb.f13727s;
                    int i36 = i35 + 51;
                    Tb.f13728t = i36 % 128;
                    if (i36 % 2 == 0) {
                        tb2.f13729l = cls;
                        throw null;
                    }
                    tb2.f13729l = cls;
                    int i37 = i35 + 63;
                    Tb.f13728t = i37 % 128;
                    if (i37 % 2 == 0) {
                        throw null;
                    }
                    C1169v c1169v3 = new C1169v(26);
                    c1169v3.f14690d = this;
                    Cb.g(c1169v3);
                    return;
                } catch (ClassNotFoundException e10) {
                    String strIntern3 = g(-((byte) KeyEvent.getModifierMetaStateMask()), "詌歔訍䵤殜❎\uf416蚆፶풢踚\uf82a뢕㏛ᓪ処䇆餇獺쪮\uef0e").intern();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(g((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "퐺℅푿ܤ\ue887ꑓ᪦栰䴄麺ങᚊ\ue6d1禚韜뽙ᾷ퍜\uf06a\u245b녾ꫩ奱싪⨰֯ꏋ殧䎁鼾ಆခ\ue50e").intern());
                    sb4.append(Sb.a(Tb.F(tb2)));
                    sb4.append(g(1 - Drawable.resolveOpacity(0, 0), "\ue524ლ\ue51e㚩⬾噫").intern());
                    sb4.append(e10.getLocalizedMessage());
                    Ab.x(strIntern3, sb4.toString());
                    return;
                }
            case 28:
                Tb.O(((Qb) this.f14690d).f13643e).getClass();
                return;
            default:
                Qb qb = (Qb) this.f14690d;
                ((C1105q) Tb.O(qb.f13643e)).onActivityResumed(qb.f13642d);
                return;
        }
    }

    public /* synthetic */ C1169v(Object obj, int i5) {
        this.f14689c = i5;
        this.f14690d = obj;
    }
}
