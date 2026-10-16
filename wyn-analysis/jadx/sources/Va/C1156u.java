package Va;

import android.graphics.Color;
import android.os.Process;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* renamed from: Va.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1156u extends Ba {

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f14655e = {216, 212, 195, 215, 201, 210, 200};

    /* renamed from: f, reason: collision with root package name */
    public static int f14656f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f14657g = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14658c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ C1194x f14659d;

    public /* synthetic */ C1156u(int i5) {
        this.f14658c = i5;
    }

    public static String b(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-8717769940922722460L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * (-8717769940922722460L)));
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

    public static String d(int i5) throws UnsupportedEncodingException {
        String str;
        byte[] bytes = "\u0087\u0086\u0085\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14655e;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r5 - 1) - i10] + i5] - 'd');
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String e(int i5) {
        String str;
        char[] charArray = "\ue74d쮆뻸愧呠݁\ueb90\udecf脲琊❎மﻹ".toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ (-3574256835476527303L));
                        AbstractC0897a.f13935s = i10 + 1;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [Va.x] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    @Override // Va.Ba
    public final void c() {
        switch (this.f14658c) {
            case 0:
                C1194x c1194x = this.f14659d;
                C1194x.o(c1194x).d(d((ViewConfiguration.getPressedStateDuration() >> 16) + 127).intern());
                c1194x.x(d(126 - Process.getGidForName("")).intern(), new JSONObject());
                break;
            case 1:
                int i5 = f14656f + 7;
                f14657g = i5 % 128;
                int i10 = i5 % 2;
                C1194x c1194x2 = this.f14659d;
                try {
                    if (i10 == 0) {
                        C1194x.g(c1194x2);
                        int i11 = 8 / 0;
                    } else {
                        C1194x.g(c1194x2);
                    }
                    int i12 = f14657g + 115;
                    c1194x2 = i12 % 128;
                    f14656f = c1194x2;
                    if (i12 % 2 != 0) {
                        int i13 = 21 / 0;
                        break;
                    }
                } catch (Throwable th) {
                    Ab.B(b(Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, "ᰔ\ud977᱕휎볪칽獵着䇽귷嬿ἵꝇ").intern(), b(Process.myPid() >> 22, "ᚕ眍ᛐ耼䄭怛꺆ݮ䭷ϙగ\ue2f4귛ꗭ榽䀏โ䜹육ᾇ悰難╀ﴲ앥鱟苖墾➘㿩\ue077㛀順턱㷡").intern(), th);
                    C1194x.f(c1194x2);
                    return;
                }
                break;
            default:
                C1194x c1194x3 = this.f14659d;
                C1194x.o(c1194x3).d(e(MotionEvent.axisFromString("") + 11472).intern());
                c1194x3.x(e(11471 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new JSONObject());
                break;
        }
    }
}
