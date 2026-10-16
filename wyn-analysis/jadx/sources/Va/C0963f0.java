package Va;

import android.graphics.Color;
import android.os.Handler;
import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: Va.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0963f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f14146f = {2, -1, -15, 19, -4, -13, 15, 4, -21, 17, 2, 2, -1, -11, 0, 1, -5, 1, 20, -21, 17, 2, -8, 2, 13, 1, -10, 9, 18, -33, 6, 9, -17, 49};

    /* renamed from: g, reason: collision with root package name */
    public static int f14147g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f14148h = 1;

    /* renamed from: a, reason: collision with root package name */
    public Eb f14149a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f14150b;

    /* renamed from: c, reason: collision with root package name */
    public C1194x f14151c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f14152d;

    /* renamed from: e, reason: collision with root package name */
    public HashSet f14153e;

    public static String g(short s10, int i5, int i10, int i11, byte b5) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 9;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14146f[1541941282 + i11] + 9);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - (-1541941280)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 - 1847458106);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14146f;
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

    public static String i(String str, int i5) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 55266)) ^ ((c11 >>> 5) + 27790)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 41088) ^ ((c12 + i11) ^ ((c12 << 4) + 51239))));
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

    public final void a(JSONObject jSONObject) {
        int i5 = f14147g + 31;
        f14148h = i5 % 128;
        f(i("࠲㭉戭婦徥獇ࢉꗞ㣅䡂甒ꉿ\ue555\uf235", i5 % 2 == 0 ? 57 << (ViewConfiguration.getLongPressTimeout() % 118) : (ViewConfiguration.getLongPressTimeout() >> 16) + 13).intern(), jSONObject);
        int i10 = f14147g + 45;
        f14148h = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final void b(JSONObject jSONObject) {
        f14147g = (f14148h + 91) % 128;
        f(g((short) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1847458203 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 10, ((byte) KeyEvent.getModifierMetaStateMask()) - 1541941270, (byte) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), jSONObject);
        f14147g = (f14148h + 117) % 128;
    }

    public final void c(String str, JSONObject jSONObject) {
        Iterator it = new HashSet(this.f14152d).iterator();
        while (it.hasNext()) {
            int i5 = f14147g + 115;
            f14148h = i5 % 128;
            if (i5 % 2 == 0) {
                ((InterfaceC1167ua) it.next()).a(str, jSONObject);
                throw null;
            }
            JSONObject jSONObjectA = ((InterfaceC1167ua) it.next()).a(str, jSONObject);
            if (jSONObjectA != null) {
                Ab.g0(jSONObject, jSONObjectA);
                f14147g = (f14148h + 41) % 128;
            }
        }
    }

    public final void d(JSONObject jSONObject) {
        int i5 = (f14148h + 93) % 128;
        f14147g = i5;
        Eb eb2 = this.f14149a;
        if (eb2 != null) {
            int i10 = i5 + 101;
            f14148h = i10 % 128;
            if (i10 % 2 != 0) {
                eb2.adClosed(jSONObject.optString(AbstractC1141sa.f14606a), ISAdQualityAdType.fromInt(jSONObject.optInt(AbstractC1141sa.f14612d)));
            } else {
                eb2.adClosed(jSONObject.optString(AbstractC1141sa.f14606a), ISAdQualityAdType.fromInt(jSONObject.optInt(AbstractC1141sa.f14612d)));
                throw null;
            }
        }
    }

    public final void e(InterfaceC1167ua interfaceC1167ua) {
        f14148h = (f14147g + 37) % 128;
        this.f14152d.add(interfaceC1167ua);
        f14147g = (f14148h + 125) % 128;
    }

    public final void f(String str, JSONObject jSONObject) {
        Da da2 = new Da(9);
        da2.f13291f = this;
        da2.f13289d = str;
        da2.f13290e = jSONObject;
        this.f14150b.post(da2);
        f14147g = (f14148h + 121) % 128;
    }

    public final void h(JSONObject jSONObject) {
        int i5 = f14147g + 95;
        f14148h = i5 % 128;
        f(i("࠲㭉戭婦䓡恏㧂⪞⤍\ud8b0\ue555\uf235", i5 % 2 == 0 ? 16777227 >> Color.rgb(0, 0, 0) : Color.rgb(0, 0, 0) + 16777227).intern(), jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, org.json.JSONObject r25, boolean r26) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0963f0.j(java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, boolean):void");
    }
}
