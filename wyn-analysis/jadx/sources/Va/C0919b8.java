package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: Va.b8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0919b8 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f14022l = {-422912509, -1290888684, 1458034471, -35608610, 1456982448, -1211883451, -2047688405, -35421485, 1665232274, 114797535, -765780059, 1544186063, 1926685076, -1268380982, -987056562, 370104852, 299298522, -600893503};

    /* renamed from: m, reason: collision with root package name */
    public static int f14023m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f14024n = 1;

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f14025a;

    /* renamed from: b, reason: collision with root package name */
    public C1203x8 f14026b;

    /* renamed from: c, reason: collision with root package name */
    public String f14027c;

    /* renamed from: d, reason: collision with root package name */
    public String f14028d;

    /* renamed from: e, reason: collision with root package name */
    public String f14029e;

    /* renamed from: f, reason: collision with root package name */
    public String f14030f;

    /* renamed from: g, reason: collision with root package name */
    public String f14031g;

    /* renamed from: h, reason: collision with root package name */
    public String f14032h;

    /* renamed from: i, reason: collision with root package name */
    public Xa f14033i;

    /* renamed from: j, reason: collision with root package name */
    public C1203x8 f14034j;
    public HashMap k;

    public static String d(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(9193046620942889821L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * 9193046620942889821L));
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

    public static String f(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14022l.clone();
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

    public static /* synthetic */ String g(C0919b8 c0919b8) {
        int i5 = (f14023m + 117) % 128;
        f14024n = i5;
        String str = c0919b8.f14027c;
        f14023m = (i5 + 107) % 128;
        return str;
    }

    public final Xa a() {
        f14024n = (f14023m + 125) % 128;
        if (this.f14033i == null) {
            JSONObject jSONObjectOptJSONObject = this.f14025a.optJSONObject(d(-MotionEvent.axisFromString(""), "蚐蛧䰩䫤媺뼑갼胻䮍貝ﺽﵻᰋ").intern());
            Xa xa2 = new Xa(2);
            if (jSONObjectOptJSONObject != null) {
                xa2.f13858c = jSONObjectOptJSONObject.optString(Xa.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), "魦\uec32ࠁᙽ", "\uea05錥贶쏸\udeed⊘\ue81a", 32256667 - Color.argb(0, 0, 0, 0)).intern());
                xa2.f13859d = jSONObjectOptJSONObject.optString(Xa.b((char) (14421 - TextUtils.indexOf("", "")), "ﯡ堏嗗㴸", "\ue4d9寁蓊颇\u1680䁾", ImageFormat.getBitsPerPixel(0) + 1).intern());
                xa2.f13860e = jSONObjectOptJSONObject.optString(Xa.b((char) (43112 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), "梨\uefb9树ꎨ", "㧩묏䔕㡃梜", ExpandableListView.getPackedPositionChild(0L) + 300923386).intern());
                xa2.f13861f = jSONObjectOptJSONObject.optString(Xa.b((char) Color.argb(0, 0, 0, 0), "\uf4af萤〈蜶", "颯稣\ue1e0ᦢڞ顜㏶", Color.alpha(0) + 696526068).intern());
                xa2.f13857b = jSONObjectOptJSONObject.optBoolean(Xa.b((char) Color.alpha(0), "놰쒳횫仙", "栖募騨ퟗఈ핰㪶ㄩ\ue2e0汇", Color.red(0)).intern());
            }
            this.f14033i = xa2;
        }
        Xa xa3 = this.f14033i;
        int i5 = f14024n + 71;
        f14023m = i5 % 128;
        if (i5 % 2 == 0) {
            return xa3;
        }
        throw null;
    }

    public final C1203x8 b() {
        f14023m = (f14024n + 41) % 128;
        if (this.f14034j == null) {
            JSONObject jSONObject = this.f14025a;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(d(KeyEvent.normalizeMetaState(0) + 1, "湇渤帨窑\ue3ca괚鱅㦮ꍇ麊").intern());
            yb ybVar = new yb();
            ybVar.f14820a = this;
            C1203x8 c1203x8 = new C1203x8(Ab.M(jSONObjectOptJSONObject, ybVar), this.f14026b, true);
            this.f14034j = c1203x8;
            c1203x8.g(Ab.d0(jSONObject.optJSONArray(d(-TextUtils.lastIndexOf("", '0'), "쥋줦蛬ੋ똼痔\uec9c汉њ䙏븖").intern()), new x4.d(27)));
            f14024n = (f14023m + 39) % 128;
        }
        return this.f14034j;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap c() {
        /*
            r4 = this;
            int r0 = Va.C0919b8.f14024n
            int r0 = r0 + 71
            int r0 = r0 % 128
            Va.C0919b8.f14023m = r0
            r0 = 0
            int r1 = android.graphics.Color.red(r0)
            int r1 = 1 - r1
            java.lang.String r2 = "プセᩉꜢ\uddbf\ue97d䇫ߜﷆ\udaf6፩穆ꩌ"
            java.lang.String r1 = d(r1, r2)
            java.lang.String r1 = r1.intern()
            int r2 = Va.C0919b8.f14023m
            int r2 = r2 + 39
            int r3 = r2 % 128
            Va.C0919b8.f14024n = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L2b
            java.util.HashMap r2 = r4.k
            int r0 = r0 / r0
            if (r2 != 0) goto L4a
            goto L2f
        L2b:
            java.util.HashMap r0 = r4.k
            if (r0 != 0) goto L4a
        L2f:
            org.json.JSONObject r0 = r4.f14025a
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            Va.Ra r1 = new Va.Ra
            r1.<init>()
            r1.f13665a = r4
            java.util.HashMap r0 = Va.Ab.M(r0, r1)
            r4.k = r0
            int r0 = Va.C0919b8.f14023m
            int r0 = r0 + 27
            int r0 = r0 % 128
            Va.C0919b8.f14024n = r0
        L4a:
            java.util.HashMap r0 = r4.k
            int r1 = Va.C0919b8.f14023m
            int r1 = r1 + 37
            int r1 = r1 % 128
            Va.C0919b8.f14024n = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0919b8.c():java.util.HashMap");
    }

    public final String e() {
        int i5 = f14023m;
        int i10 = i5 + 21;
        f14024n = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        f14024n = (i5 + 113) % 128;
        return this.f14029e;
    }

    public final void h(JSONObject jSONObject) {
        int i5 = f14023m + 81;
        f14024n = i5 % 128;
        if (i5 % 2 == 0) {
            jSONObject.keys();
            throw null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f14026b.d(jSONObject.opt(next), next);
            f14024n = (f14023m + 29) % 128;
        }
    }
}
