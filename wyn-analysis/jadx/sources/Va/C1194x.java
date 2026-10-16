package Va;

import A7.C0237b0;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1194x {

    /* renamed from: r, reason: collision with root package name */
    public static int f14741r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static int f14742s = 1;

    /* renamed from: a, reason: collision with root package name */
    public final A f14743a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14744b;

    /* renamed from: c, reason: collision with root package name */
    public final C1218z f14745c;

    /* renamed from: d, reason: collision with root package name */
    public final C0935cb f14746d;

    /* renamed from: e, reason: collision with root package name */
    public final C1066n f14747e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f14748f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14749g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14750h;
    public final Context k;

    /* renamed from: l, reason: collision with root package name */
    public final C1182w f14753l;

    /* renamed from: m, reason: collision with root package name */
    public final C1027k f14754m;

    /* renamed from: o, reason: collision with root package name */
    public C0237b0 f14756o;

    /* renamed from: p, reason: collision with root package name */
    public final String f14757p;

    /* renamed from: q, reason: collision with root package name */
    public final Ra f14758q;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f14751i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f14752j = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f14755n = Thread.getDefaultUncaughtExceptionHandler();

    public C1194x(Context context, H h10, A a5, boolean z2, String str, Ra ra2) {
        int i5;
        this.f14758q = ra2;
        C1130s c1130s = new C1130s();
        c1130s.f14565a = this;
        Thread.setDefaultUncaughtExceptionHandler(c1130s);
        this.f14743a = a5;
        this.k = context;
        Ra ra3 = new Ra(context, v("넁ᒋ늠Ӂ眾\uf0e2늠Ӂ䊾堒\u2e9a껔牛\uf637⬴\ueab9異䠵賒༳ᙖ쳗ԛ\ue04e杴偫", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25).intern(), B("\u000b\u000b\u000f\u000f\uffff\u0005\u0010\u0015\b�\n�\uffd0\uffc9\u0010\u0001\u000e\uffff\u0001\u000f\uffc9�\b\t", 3 - View.resolveSize(0, 0), 24 - TextUtils.getCapsMode("", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 151, true).intern());
        String strIntern = B("\u0003\u0014￣\ufff5￦\u0011\u0012\f", 5 - View.MeasureSpec.makeMeasureSpec(0, 0), 8 - View.MeasureSpec.makeMeasureSpec(0, 0), 149 - View.MeasureSpec.getSize(0), true).intern();
        String strIntern2 = B("\u0012\f\u0003\u0014\u0003ￌ", 5 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 5, 149 - View.resolveSizeAndState(0, 0, 0), true).intern();
        C0935cb c0935cb = new C0935cb();
        c0935cb.f14082b = strIntern2;
        c0935cb.f14081a = strIntern;
        c0935cb.f14083c = ra3;
        this.f14746d = c0935cb;
        f14742s = (f14741r + 85) % 128;
        String strM = ra3.m(B("\u0011ￋ\u0010\u0002\u0010\u0010￦\u0001\u0006\u000b", 8 - TextUtils.indexOf("", ""), 10 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getOffsetBefore("", 0) + 150, false).intern());
        if (TextUtils.isEmpty(strM)) {
            i5 = 1;
        } else {
            i5 = Integer.parseInt(strM) + 1;
            f14741r = (f14742s + 15) % 128;
        }
        ra3.r(B("\u0011ￋ\u0010\u0002\u0010\u0010￦\u0001\u0006\u000b", 8 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getTrimmedLength("") + 10, 151 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), false).intern(), String.valueOf(i5));
        String strA = A(ra3);
        C1066n c1066n = new C1066n(context, h10, G.S().F());
        c1066n.f14404h = i5;
        c1066n.f14405i = 0;
        c1066n.f14406j = 1;
        c1066n.f14403g = strA;
        HandlerThread handlerThread = new HandlerThread(C1066n.e(Process.getGidForName("") + 1, 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TextUtils.getOffsetAfter("", 0) + 18778)).intern());
        handlerThread.start();
        c1066n.k = new Handler(handlerThread.getLooper());
        this.f14747e = c1066n;
        C1218z c1218z = new C1218z(context);
        this.f14745c = c1218z;
        this.f14744b = false;
        HandlerThread handlerThread2 = new HandlerThread(v("砦㢢\ue6f5阿东ꢧ㥟튝妣ꤗ\ue55d숱䉵䄍", 14 - (Process.myPid() >> 22)).intern());
        handlerThread2.start();
        this.f14748f = new Handler(handlerThread2.getLooper());
        C1027k c1027k = new C1027k();
        c1027k.f14335a = null;
        c1027k.f14340f = i5;
        G gS = G.S();
        C1014j c1014j = new C1014j(0);
        c1014j.f14305b = c1027k;
        gS.Z(c1014j);
        this.f14754m = c1027k;
        this.f14749g = !z2;
        this.f14757p = str;
        n(true);
        C1182w c1182w = new C1182w();
        c1182w.f14717a = this;
        this.f14753l = c1182w;
        c1218z.a().d(this.f14753l);
        C1092p c1092p = new C1092p();
        c1092p.f14469a = this;
        this.f14756o = new C0237b0(c1092p);
        C0974fb c0974fbE = C0974fb.e();
        C1105q c1105q = new C1105q(0);
        c1105q.f14517b = this;
        c0974fbE.f(c1105q);
        G gS2 = G.S();
        C1014j c1014j2 = new C1014j(2);
        c1014j2.f14305b = this;
        gS2.Z(c1014j2);
        int i10 = f14741r + 79;
        f14742s = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 49 / 0;
        }
    }

    public static String A(Ra ra2) {
        String strM = ra2.m(v("蘌\udb48Ꝉ蹧颻囥﵈䑢㺠剻霹\ua7ccᵠ삎엻\u1cff", (ViewConfiguration.getTapTimeout() >> 16) + 16).intern());
        if (!TextUtils.isEmpty(strM)) {
            return strM;
        }
        f14742s = (f14741r + 49) % 128;
        String string = UUID.randomUUID().toString();
        ra2.r(v("蘌\udb48Ꝉ蹧颻囥﵈䑢㺠剻霹\ua7ccᵠ삎엻\u1cff", ((byte) KeyEvent.getModifierMetaStateMask()) + 17).intern(), string);
        f14741r = (f14742s + 21) % 128;
        return string;
    }

    public static String B(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i10];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i10) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i11);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - '3');
                    Ab.f13219v = i12 + 1;
                }
                if (i5 > 0) {
                    Ab.f13220w = i5;
                    char[] cArr2 = new char[i10];
                    System.arraycopy(cArr, 0, cArr2, 0, i10);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i10 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i10 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i10];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr3[i15] = cArr[(i10 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static /* synthetic */ void D(C1194x c1194x) {
        f14742s = (f14741r + 23) % 128;
        c1194x.n(false);
        int i5 = f14741r + 49;
        f14742s = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void f(C1194x c1194x) {
        f14741r = (f14742s + 117) % 128;
        c1194x.y(false);
        f14741r = (f14742s + 31) % 128;
    }

    public static /* synthetic */ void g(C1194x c1194x) {
        int i5 = f14741r + 89;
        f14742s = i5 % 128;
        int i10 = i5 % 2;
        c1194x.d();
        if (i10 == 0) {
            throw null;
        }
        f14741r = (f14742s + 41) % 128;
    }

    public static /* synthetic */ Ra o(C1194x c1194x) {
        int i5 = f14741r;
        f14742s = (i5 + 59) % 128;
        Ra ra2 = c1194x.f14758q;
        int i10 = i5 + 57;
        f14742s = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 64 / 0;
        }
        return ra2;
    }

    public static /* synthetic */ C1027k t(C1194x c1194x) {
        int i5 = f14742s;
        f14741r = (i5 + 57) % 128;
        C1027k c1027k = c1194x.f14754m;
        int i10 = i5 + 43;
        f14741r = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 5 / 0;
        }
        return c1027k;
    }

    public static String v(String str, int i5) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 11385)) ^ ((c11 >>> 5) + 19016)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 32646) ^ ((c12 + i11) ^ ((c12 << 4) + 60735))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final void C(int i5) {
        Handler handler = this.f14748f;
        handler.removeCallbacksAndMessages(null);
        C1156u c1156u = new C1156u(1);
        c1156u.f14659d = this;
        handler.postDelayed(c1156u, i5);
        f14741r = (f14742s + 109) % 128;
    }

    public final synchronized void E(Db db2) {
        f14741r = (f14742s + 97) % 128;
        this.f14752j.add(db2);
        f14742s = (f14741r + 7) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(org.json.JSONObject r12, Va.C1169v r13) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1194x.F(org.json.JSONObject, Va.v):void");
    }

    public final String a() {
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        String strIntern;
        if (G.S().P()) {
            D dC = c();
            dC.getClass();
            int i5 = D.f13267i + 47;
            D.f13268j = i5 % 128;
            if (i5 % 2 != 0 ? (jSONObjectOptJSONObject = dC.e().optJSONObject(D.y((Process.myTid() >> 22) + 127, "\u0091\u0082\u0090").intern())) == null : (jSONObjectOptJSONObject = dC.e().optJSONObject(D.y((Process.myTid() / 19) * 44, "\u0091\u0082\u0090").intern())) == null) {
                strOptString = D.u((char) TextUtils.getOffsetAfter("", 0), "牷좑尀䫜", "⚿ᓀ꛵嗝⃛듍煯\ue8a8\udf3e", View.MeasureSpec.getSize(0) + 13144434).intern();
            } else {
                D.f13267i = (D.f13268j + 37) % 128;
                strOptString = jSONObjectOptJSONObject.optString(D.y(127 - KeyEvent.keyCodeFromString(""), "\u0088").intern(), D.u((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), "牷좑尀䫜", "⚿ᓀ꛵嗝⃛듍煯\ue8a8\udf3e", 13144434 - View.MeasureSpec.getMode(0)).intern());
            }
            int i10 = f14741r + 113;
            f14742s = i10 % 128;
            if (i10 % 2 != 0) {
                return strOptString;
            }
            throw null;
        }
        f14742s = (f14741r + 63) % 128;
        D dC2 = c();
        dC2.getClass();
        D.f13268j = (D.f13267i + 17) % 128;
        JSONObject jSONObjectOptJSONObject2 = dC2.e().optJSONObject(D.y((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0091\u0082\u0090").intern());
        if (jSONObjectOptJSONObject2 != null) {
            strIntern = jSONObjectOptJSONObject2.optString(D.y(127 - Color.alpha(0), "\u0081").intern(), D.y(ExpandableListView.getPackedPositionType(0L) + 127, "\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern());
        } else {
            strIntern = D.y(127 - Color.alpha(0), "\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
            int i11 = D.f13268j + 115;
            D.f13267i = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }
        int i12 = f14742s + 5;
        f14741r = i12 % 128;
        if (i12 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    public final synchronized boolean b() {
        boolean z2;
        int i5 = f14741r;
        z2 = this.f14750h;
        f14742s = (i5 + 73) % 128;
        return z2;
    }

    public final synchronized D c() {
        int i5 = f14742s + 5;
        f14741r = i5 % 128;
        if (i5 % 2 != 0) {
            G.S().L();
            throw null;
        }
        return G.S().L();
    }

    public final synchronized void d() {
        try {
            if (e()) {
                C1066n c1066n = this.f14747e;
                c1066n.getClass();
                int i5 = (C1052lb.f14370e + 87) % 128;
                C1052lb.f14371f = i5;
                C1052lb.f14370e = (i5 + 87) % 128;
                if (!TextUtils.isEmpty(((H) c1066n.f14374c).c())) {
                    f14741r = (f14742s + 99) % 128;
                    if (!b()) {
                        y(true);
                        Ab.a(B("\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", TextUtils.indexOf("", "", 0, 0) + 9, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8, 156 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), false).intern(), v("\uddfa䧾쀌藇嬣₅\udeb7꩐嚦뀠鬅岰栐㒣ꙗ쐔㥟튝꯲꣭ă郭\ue6f5阿鍽孲", 25 - ExpandableListView.getPackedPositionType(0L)).intern());
                        C0935cb c0935cb = this.f14746d;
                        int iZ = c().z();
                        C1092p c1092p = new C1092p();
                        c1092p.f14469a = this;
                        c0935cb.getClass();
                        Ra.k().post(new La(c0935cb, iZ, c1092p));
                        C0935cb.k = (C0935cb.f14080l + 115) % 128;
                    }
                }
            }
            f14741r = (f14742s + 9) % 128;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean e() {
        int i5 = f14742s + 95;
        f14741r = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        return this.f14744b;
    }

    public final void h() {
        int i5 = f14742s + 77;
        f14741r = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (this.f14753l != null) {
            this.f14745c.a().i(this.f14753l);
        }
        this.f14756o.x();
        this.f14756o = null;
        f14741r = (f14742s + 115) % 128;
    }

    public final String i() {
        String strA = A(new Ra(this.k, v("넁ᒋ늠Ӂ眾\uf0e2늠Ӂ䊾堒\u2e9a껔牛\uf637⬴\ueab9異䠵賒༳ᙖ쳗ԛ\ue04e杴偫", (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 25).intern(), B("\u000b\u000b\u000f\u000f\uffff\u0005\u0010\u0015\b�\n�\uffd0\uffc9\u0010\u0001\u000e\uffff\u0001\u000f\uffc9�\b\t", 2 - ImageFormat.getBitsPerPixel(0), Drawable.resolveOpacity(0, 0) + 24, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 151, true).intern()));
        int i5 = f14742s + 31;
        f14741r = i5 % 128;
        if (i5 % 2 == 0) {
            return strA;
        }
        throw null;
    }

    public final void j() {
        C1156u c1156u = new C1156u(0);
        c1156u.f14659d = this;
        Cb.j(c1156u);
        int i5 = f14741r + 51;
        f14742s = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final synchronized void k(Gb gb) {
        f14742s = (f14741r + 69) % 128;
        this.f14751i.add(gb);
        int i5 = f14742s + 71;
        f14741r = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 76 / 0;
        }
    }

    public final void l(String str, JSONObject jSONObject, JSONObject jSONObject2, C1206y c1206y) {
        String strIntern = B("\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", TextUtils.indexOf("", "", 0) + 9, (ViewConfiguration.getFadingEdgeLength() >> 16) + 9, TextUtils.indexOf((CharSequence) "", '0', 0) + 156, false).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v("\uf092䀂楅㏁颻囥㝃ﭻఇ脶䯛魮쀌藇房ᰟዚ\udcdfﶶ器귽䠬", 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
        sb2.append(str);
        sb2.append(v("檸ᱴᜦ崳赏匟Ό쫵넁ᒋ\ud90a锬嬣₅嗩䨴ࢠ閆", View.MeasureSpec.makeMeasureSpec(0, 0) + 17).intern());
        Ab.y(strIntern, sb2.toString(), jSONObject);
        try {
            if (c().x().contains(str)) {
                String strIntern2 = B("\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8, 9 - TextUtils.indexOf("", "", 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 155, false).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(v("˒鯦闼툈䯛魮쀌藇嬣₅\udeb7꩐嚦뀠鬅岰闼툈릋盺䥾蟓唔쳙瓴\uf5d7ޕ妱ᆝ팊", 29 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
                sb3.append(str);
                sb3.append(v("옻\ude88Ό쫵綑⮋掔瘁蓳눁앞犣\u244b孓䯛魮鄡쓙ﳲᓹ믭荚", 21 - ExpandableListView.getPackedPositionGroup(0L)).intern());
                Ab.a(strIntern2, sb3.toString());
                int i5 = f14742s + 29;
                f14741r = i5 % 128;
                if (i5 % 2 != 0) {
                    int i10 = 77 / 0;
                    return;
                }
                return;
            }
            String strIntern3 = B("\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 9, ExpandableListView.getPackedPositionGroup(0L) + 9, 154 - ImageFormat.getBitsPerPixel(0), false).intern();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(v("\uf092䀂楅㏁颻囥㝃ﭻఇ脶䯛魮쀌藇房ᰟዚ\udcdfﶶ器檸ᱴᜦ崳赏匟ᇒ䲩\u2e60\u1fdc귽䠬", (ViewConfiguration.getJumpTapTimeout() >> 16) + 32).intern());
            sb4.append(str);
            Ab.a(strIntern3, sb4.toString());
            C1066n c1066n = this.f14747e;
            boolean zF = this.f14745c.a().f();
            C0999ha c0999ha = new C0999ha(this, c1206y);
            synchronized (c1066n) {
                c1066n.k.post(new C1053m(c1066n, str, jSONObject, jSONObject2, zF, c0999ha));
                C1066n.f14401m = (C1066n.f14402n + 101) % 128;
            }
        } catch (Exception e7) {
            Ab.p(B("\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", ((Process.getThreadPriority(0) + 20) >> 6) + 9, 9 - (KeyEvent.getMaxKeyCode() >> 16), 155 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), false).intern(), B("\u0013\uffc0\u000e\t\uffc0\u0012\u000f\u0012\u0012￥\u0014\u000e\u0005\u0016￥\u0004\u000e\u0005", 10 - (ViewConfiguration.getWindowTouchSlop() >> 8), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), Drawable.resolveOpacity(0, 0) + 147, true).intern(), e7, false, false, true);
        }
    }

    public final void m(JSONObject jSONObject) {
        ArrayList arrayList;
        if (Kb.u().t()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f14751i);
            }
            C1206y c1206y = new C1206y(8);
            c1206y.f14798d = arrayList;
            c1206y.f14799e = jSONObject;
            Cb.g(c1206y);
        }
    }

    public final synchronized void n(boolean z2) {
        int i5 = f14742s;
        f14741r = (i5 + 17) % 128;
        if (!z2) {
            C0935cb c0935cb = this.f14746d;
            r rVar = new r();
            rVar.f14548a = this;
            c0935cb.getClass();
            Ra.k().post(new C1206y(17, c0935cb, rVar));
            C0935cb.f14080l = (C0935cb.k + 25) % 128;
            return;
        }
        f14741r = (i5 + 15) % 128;
        C(0);
        int i10 = f14741r + 23;
        int i11 = i10 % 128;
        f14742s = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        f14741r = (i11 + 109) % 128;
    }

    public final synchronized void p() {
        try {
            int i5 = f14742s + 15;
            f14741r = i5 % 128;
            if (i5 % 2 != 0) {
                this.f14744b = true;
                n(false);
            } else {
                this.f14744b = true;
                n(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void q(ArrayList arrayList, C1092p c1092p) throws JSONException {
        String strIntern;
        String str;
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        f14742s = (f14741r + 89) % 128;
        while (it.hasNext()) {
            f14741r = (f14742s + 65) % 128;
            C1040l c1040l = (C1040l) it.next();
            JSONObject jSONObjectJ = c1040l.j();
            if (!jSONObjectJ.has(v("ﯞ\u1289杴偫", (ViewConfiguration.getPressedStateDuration() >> 16) + 3).intern())) {
                int i5 = f14741r + 125;
                f14742s = i5 % 128;
                if (i5 % 2 == 0) {
                    try {
                        strIntern = v("ﯞ\u1289杴偫", KeyEvent.keyCodeFromString("") * 2).intern();
                        str = AbstractC1141sa.f14615f;
                    } catch (JSONException unused) {
                    }
                } else {
                    strIntern = v("ﯞ\u1289杴偫", 3 - KeyEvent.keyCodeFromString("")).intern();
                    str = AbstractC1141sa.f14615f;
                }
                jSONObjectJ.put(strIntern, jSONObjectJ.optLong(str));
            }
            if (this.f14754m.c(jSONObjectJ)) {
                this.f14746d.t(c1040l.d(), null);
                f14741r = (f14742s + 45) % 128;
            }
            jSONArray.put(jSONObjectJ);
        }
        boolean zF = this.f14745c.a().f();
        S3.i iVar = new S3.i(this, jSONArray, arrayList, c1092p);
        C1066n c1066n = this.f14747e;
        c1066n.k.post(new Ub(c1066n, zF, jSONArray, iVar));
        C1066n.f14402n = (C1066n.f14401m + 113) % 128;
    }

    public final boolean r(C1040l c1040l) {
        boolean zV;
        int i5 = f14742s + 123;
        f14741r = i5 % 128;
        int i10 = i5 % 2;
        String str = this.f14757p;
        if (i10 != 0) {
            zV = G.S().V(c1040l.i(), str);
            int i11 = 93 / 0;
        } else {
            zV = G.S().V(c1040l.i(), str);
        }
        int i12 = f14742s + 5;
        f14741r = i12 % 128;
        if (i12 % 2 == 0) {
            return zV;
        }
        throw null;
    }

    public final void s() {
        C1156u c1156u = new C1156u(2);
        c1156u.f14659d = this;
        Cb.j(c1156u);
        f14741r = (f14742s + 95) % 128;
    }

    public final synchronized void u() {
        try {
            int i5 = f14741r + 43;
            f14742s = i5 % 128;
            if (i5 % 2 == 0) {
                this.f14744b = true;
                if (this.f14748f != null) {
                    this.f14748f.removeCallbacksAndMessages(null);
                    f14742s = (f14741r + 125) % 128;
                }
            } else {
                this.f14744b = false;
                if (this.f14748f != null) {
                    this.f14748f.removeCallbacksAndMessages(null);
                    f14742s = (f14741r + 125) % 128;
                }
            }
            this.f14745c.h();
            h();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void w() {
        f14742s = (f14741r + 31) % 128;
        try {
            this.f14749g = true;
            j();
            synchronized (this) {
                try {
                    Handler handler = this.f14748f;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    n(true);
                } catch (Throwable th) {
                    throw th;
                }
            }
            f14741r = (f14742s + 9) % 128;
        } catch (Exception e7) {
            Ab.a0(B("\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", 9 - View.combineMeasuredStates(0, 0), 8 - ImageFormat.getBitsPerPixel(0), 155 - View.MeasureSpec.makeMeasureSpec(0, 0), false).intern(), B("\u0011\uffbf\b\r\uffbf\u000e\r￠\u000f\u000f\ufff3\u000e￡\u0000\u0002\n\u0006\u0011\u000e\u0014\r\u0003￤\u0011\u0011\u000e", 22 - Color.green(0), (ViewConfiguration.getTouchSlop() >> 8) + 26, 148 - View.resolveSizeAndState(0, 0, 0), false).intern(), e7, false);
        }
    }

    public final void x(String str, JSONObject jSONObject) {
        int i5 = (f14742s + 115) % 128;
        f14741r = i5;
        int i10 = i5 + 63;
        f14742s = i10 % 128;
        int i11 = i10 % 2;
        l(str, jSONObject, null, null);
        if (i11 == 0) {
            int i12 = 63 / 0;
        }
        int i13 = f14742s;
        int i14 = i13 + 33;
        f14741r = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        int i15 = i13 + 19;
        f14741r = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public final synchronized void y(boolean z2) {
        int i5 = f14741r;
        this.f14750h = z2;
        f14742s = (i5 + 33) % 128;
    }

    public final boolean z(int i5) {
        if (i5 < c().z()) {
            return false;
        }
        int i10 = f14742s + 19;
        f14741r = i10 % 128;
        if (i10 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
