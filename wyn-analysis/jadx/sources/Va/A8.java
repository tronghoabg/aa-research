package Va;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class A8 extends AbstractC1215y8 {

    /* renamed from: e, reason: collision with root package name */
    public static int f13185e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f13186f = 1;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f13187d = new HashMap();

    public A8(HashMap map) {
        for (String str : map.keySet()) {
            this.f13187d.put(AbstractC1152t8.a(str), map.get(str));
        }
    }

    public static String e(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-2603100958732371142L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * (-2603100958732371142L)));
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

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        HashMap map = this.f13187d;
        Iterator it = map.keySet().iterator();
        while (!(!it.hasNext())) {
            f13185e = (f13186f + 21) % 128;
            String str = (String) it.next();
            C1139s8 c1139s8C = ((AbstractC1215y8) map.get(str)).c(c1203x8, c1214y7);
            try {
                jSONObject.put(str, c1139s8C.c());
                f13186f = (f13185e + 23) % 128;
            } catch (JSONException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e(KeyEvent.normalizeMetaState(0), "㒱㓴凒檚眏צĉ됧\ud82b秐戦⫔\ued15䒬儤㼷\uf26e倀㱏찲蝾뽦⬽턟鑘詼ក\ue674맡").intern());
                sb2.append(c1139s8C.c());
                sb2.append(e((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, "⨪⨊㳦\u07baབ远祍㸀웢ᒯᩴꃯ\uf3da").intern());
                sb2.append(str);
                new C1023j8(c1214y7, c1203x8, sb2.toString(), null).d(c1214y7.f());
            }
        }
        return new C1139s8(jSONObject);
    }

    public final boolean equals(Object obj) {
        int i5 = f13186f;
        int i10 = i5 + 121;
        int i11 = i10 % 128;
        f13185e = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            f13186f = (i11 + 65) % 128;
            return true;
        }
        if (obj == null) {
            return false;
        }
        f13185e = (i5 + 99) % 128;
        if (A8.class != obj.getClass()) {
            return false;
        }
        HashMap map = this.f13187d;
        HashMap map2 = ((A8) obj).f13187d;
        return map != null ? map.equals(map2) : map2 == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r1 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r1 = r1 + 99;
        Va.A8.f13185e = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 47;
        Va.A8.f13185e = r1 % 128;
        r1 = r1 % 2;
        r0 = r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r1 == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = Va.A8.f13185e
            int r0 = r0 + 33
            int r1 = r0 % 128
            Va.A8.f13186f = r1
            int r0 = r0 % 2
            java.util.HashMap r2 = r4.f13187d
            r3 = 0
            if (r0 != 0) goto L15
            r0 = 12
            int r0 = r0 / r3
            if (r2 == 0) goto L29
            goto L17
        L15:
            if (r2 == 0) goto L29
        L17:
            int r1 = r1 + 47
            int r0 = r1 % 128
            Va.A8.f13185e = r0
            int r1 = r1 % 2
            int r0 = r2.hashCode()
            if (r1 == 0) goto L28
            r1 = 89
            int r1 = r1 / r3
        L28:
            return r0
        L29:
            int r1 = r1 + 99
            int r0 = r1 % 128
            Va.A8.f13185e = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L34
            return r3
        L34:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.A8.hashCode():int");
    }

    public final String toString() {
        HashMap map = this.f13187d;
        if (map.isEmpty()) {
            f13186f = (f13185e + 113) % 128;
            return e(ViewConfiguration.getDoubleTapTimeout() >> 16, "튌틷ﴋ왌︬\ud99f").intern();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e(View.resolveSizeAndState(0, 0, 0), "\ueeaf\ueed4襤숾\u0cffࣽ").intern());
        Iterator it = map.keySet().iterator();
        f13185e = (f13186f + 1) % 128;
        boolean z2 = true;
        while (it.hasNext()) {
            int i5 = f13185e + 59;
            f13186f = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            String str = (String) it.next();
            if (!z2) {
                sb2.append(e(Process.myPid() >> 22, "혯혃這ꬃᶾ༙").intern());
            }
            sb2.append(e(View.MeasureSpec.getSize(0), "ᛲᛐ䞱ꑟ嫼").intern());
            sb2.append(str);
            sb2.append(e(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "㗩㗋珒䣒\ue689郝닜").intern());
            sb2.append(map.get(str));
            z2 = false;
        }
        sb2.append(e((-1) - TextUtils.indexOf((CharSequence) "", '0', 0), "䲵䲕\ue01f\udb58\u0b3b˃").intern());
        return sb2.toString();
    }
}
