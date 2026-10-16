package Va;

import android.graphics.ImageFormat;
import android.widget.ExpandableListView;
import com.mintegral.msdk.MIntegralSDK;

/* renamed from: Va.y9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1216y9 extends AbstractC1127r9 {
    public static String f(int i5, String str) {
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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 2221895149448900824L);
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        return f(1656 - ExpandableListView.getPackedPositionChild(0L), "낵뛈뱄ꏇ\ua959郢陼鷶荼").intern();
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        return new Z3(a());
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        return f(ImageFormat.getBitsPerPixel(0) + 3000, "낻묀\ua7db鏓鹩訢\uf6fc\ue2ad\ued05\ud9d0얌つ㰠⢽ᒷἒௌ瞔戨渀嫝䚵넖뷌ꦗ鑵耯賹\uf88f\ue327\uefe1").intern();
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        return MIntegralSDK.class;
    }
}
