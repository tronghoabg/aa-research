package Va;

import android.app.Activity;
import android.app.Application;
import android.view.KeyEvent;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Ga extends Ba {

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f13382i = {'U', 'S', '-', 'A', 'C', 'I', 'R', 'e', 'm', 'o', 't', 'D', 'B', 'c', 'r', 'y', 'p', 'd', ' ', 's', 'i', 'n', 'g', 'f', 'a', 'v', 'l', 'h', '/', 'E', 'V', 'W', 'X', 'Y', 'Z', '['};

    /* renamed from: j, reason: collision with root package name */
    public static int f13383j = 0;
    public static int k = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13384c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13385d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13386e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f13387f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13388g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13389h;

    public /* synthetic */ Ga() {
        this.f13384c = 5;
    }

    public static String d(int i5, String str) {
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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 3793542243185279252L);
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

    /* JADX WARN: Removed duplicated region for block: B:45:0x01c1 A[Catch: all -> 0x0207, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0207, blocks: (B:45:0x01c1, B:32:0x017c), top: B:83:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Ga.e(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g() {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Ga.g():void");
    }

    public static String h(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13382i;
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

    @Override // Va.Ba
    public final void c() {
        switch (this.f13384c) {
            case 0:
                int i5 = k + 65;
                f13383j = i5 % 128;
                int i10 = i5 % 2;
                InterfaceC1217ya interfaceC1217ya = (InterfaceC1217ya) this.f13388g;
                f((String) this.f13385d, (Pa) this.f13387f, (String) this.f13386e, interfaceC1217ya);
                if (i10 != 0) {
                    throw null;
                }
                return;
            case 1:
                V v2 = (V) this.f13389h;
                if (V.M(v2).get()) {
                    return;
                }
                String lowerCase = ((String) this.f13385d).toLowerCase();
                C1051la c1051laA = V.A(v2);
                if (c1051laA == null) {
                    return;
                }
                HashMap map = c1051laA.f14368a;
                C0924c0 c0924c0 = new C0924c0();
                c0924c0.f14061g = EnumC0898a0.f13942a;
                c0924c0.f14062h = EnumC0911b0.f14011a;
                c0924c0.f14055a = lowerCase;
                map.put(lowerCase, c0924c0);
                C1206y c1206y = new C1206y(1);
                c1206y.f14799e = this;
                c1206y.f14798d = lowerCase;
                Cb.e(c1206y);
                return;
            case 2:
                C1169v c1169v = new C1169v(10);
                c1169v.f14690d = this;
                Cb.f(c1169v, G.S().E());
                return;
            case 3:
                ((Lb) this.f13385d).w((JSONObject) this.f13386e, (View) this.f13387f, (Vb) this.f13388g, (KeyEvent.Callback) this.f13389h);
                return;
            case 4:
                g();
                return;
            default:
                JSONObject jSONObject = (JSONObject) this.f13385d;
                String strF = C0921ba.f(jSONObject);
                C0921ba c0921ba = (C0921ba) this.f13389h;
                Tb tb = (Tb) C0921ba.m(c0921ba).get(strF);
                C1013ib c1013ib = (C1013ib) this.f13386e;
                if (tb == null) {
                    tb = new Tb(c1013ib);
                    tb.f13730m = false;
                    tb.f13731n = false;
                    tb.f13732o = false;
                    tb.f13733p = false;
                    tb.M(jSONObject);
                    C0921ba.m(c0921ba).put(strF, tb);
                } else {
                    tb.f13615i = c1013ib;
                    tb.M(jSONObject);
                }
                tb.l((C1087o7) this.f13387f);
                tb.R((C1105q) this.f13388g);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (((Va.Aa) r2.f14374c).f13191a == 200) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.lang.String r10, Va.Pa r11, java.lang.String r12, Va.InterfaceC1217ya r13) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Ga.f(java.lang.String, Va.Pa, java.lang.String, Va.ya):void");
    }

    public void i(Pa pa2, InterfaceC1217ya interfaceC1217ya) {
        Ea eaA = Ha.a((Ha) this.f13389h).a();
        Fa fa2 = new Fa(0);
        fa2.f13348d = this;
        fa2.f13346b = pa2;
        fa2.f13347c = interfaceC1217ya;
        eaA.d(fa2);
        int i5 = f13383j + 65;
        k = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ Ga(V v2, Object obj, Object obj2, Object obj3, Ba ba2, int i5) {
        this.f13384c = i5;
        this.f13389h = v2;
        this.f13385d = obj;
        this.f13386e = obj2;
        this.f13387f = obj3;
        this.f13388g = ba2;
    }

    public Ga(Ha ha, String str, Pa pa2, String str2, InterfaceC1217ya interfaceC1217ya) {
        this.f13384c = 0;
        this.f13389h = ha;
        this.f13385d = str;
        this.f13387f = pa2;
        this.f13386e = str2;
        this.f13388g = interfaceC1217ya;
    }

    public Ga(Kb kb2, ISAdQualityConfig iSAdQualityConfig, String str, Application application, Activity activity) {
        this.f13384c = 4;
        this.f13389h = kb2;
        this.f13386e = iSAdQualityConfig;
        this.f13385d = str;
        this.f13387f = application;
        this.f13388g = activity;
    }

    public Ga(Lb lb2, JSONObject jSONObject, View view, Vb vb2, KeyEvent.Callback callback) {
        this.f13384c = 3;
        this.f13385d = lb2;
        this.f13386e = jSONObject;
        this.f13387f = view;
        this.f13388g = vb2;
        this.f13389h = callback;
    }
}
