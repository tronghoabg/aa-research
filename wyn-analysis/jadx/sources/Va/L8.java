package Va;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class L8 extends I8 {
    public static String h(String str, int i5) {
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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ (-4347888209372508124L));
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

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        Object objC;
        C1139s8 c1139s8C = e().c(c1203x8, c1214y7);
        try {
            objC = g().c(c1203x8, c1214y7).c();
        } catch (Exception e7) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(h("ၡີⶐ䳢毚詫ꤓ졧\ue75dֳ⒏䎄拴臊ꀠ\udf0e︴ᵄ㮧媟秫飘럔혨\uf51cᑻ㌊冲炕濧躞괼찼\ueb17ੰ⥈䞻暘藿ꓞ쌲\ue25fĽ", (KeyEvent.getMaxKeyCode() >> 16) + 7907).intern());
            sb2.append(this);
            sb2.append(h("ဃ", TextUtils.indexOf((CharSequence) "", '0') + 63998).intern());
            new C1023j8(c1214y7, c1203x8, sb2.toString(), e7).d(c1214y7.f());
        }
        if (objC instanceof JSONObject) {
            return new C1139s8(((JSONObject) objC).opt((String) c1139s8C.c()));
        }
        if (objC instanceof JSONArray) {
            return new C1139s8(((JSONArray) objC).opt(c1139s8C.a().intValue()));
        }
        if (objC instanceof Map) {
            return new C1139s8(((Map) objC).get(c1139s8C.c()));
        }
        if (objC instanceof List) {
            return new C1139s8(((List) objC).get(c1139s8C.a().intValue()));
        }
        if (objC.getClass().isArray()) {
            return new C1139s8(((Object[]) objC)[c1139s8C.a().intValue()]);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(h("ၡີⶐ䳢毚詫ꤓ졧\ue75dֳ⒏䎄拴臊ꀠ\udf0e︴ᵄ㮧媟秫飘럔혨\uf51cᑻ㌊冲炕濧躞괼찼\ueb17ੰ⥈䞻暘藿ꓞ쌲\ue25fĽ", 7907 - View.MeasureSpec.getMode(0)).intern());
        sb3.append(this);
        sb3.append(h("ဃ\uaac3斾\u20c7ﬢ똌煣ు욫臁峲᜴퉘浨⡁\ue2b2뷔磒㏳칣褏䑫Ỻ\ud99e铲⾑\uea23ꔅ恻㭘\uf5b2낗䯫ث섊鱶坔ᇵ겅柭⋆ﴤ렅獏\u0df8", 47838 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        sb3.append(objC);
        new C1023j8(c1214y7, c1203x8, sb3.toString(), null).d(c1214y7.f());
        return new C1139s8(null);
    }
}
