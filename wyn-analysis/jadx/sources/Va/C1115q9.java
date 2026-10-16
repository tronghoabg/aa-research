package Va;

import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;

/* renamed from: Va.q9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1115q9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f14537c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14538d = 1;

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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 2757544375072309387L);
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
        int i5 = f14537c + 125;
        f14538d = i5 % 128;
        return b(i5 % 2 == 0 ? 39359 >> ExpandableListView.getPackedPositionType(0L) : ExpandableListView.getPackedPositionType(0L) + 39359, "샢奚\uf39bීꘅ쁑媒\uf4c6ചꝊ솘").intern();
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        K3 k32 = new K3(a());
        int i5 = f14538d + 3;
        f14537c = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 82 / 0;
        }
        return k32;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        int i5 = f14537c + 113;
        f14538d = i5 % 128;
        String strIntern = b(i5 % 2 == 0 ? (KeyEvent.getMaxKeyCode() << 34) * 32553 : (KeyEvent.getMaxKeyCode() >> 16) + 16139, "샨\uffef뻰綄㳁\ufbc5몫禣㢡\uf7c6뚌疜㑡\uf361뉣煏じ\uef44긤洬ⰲ\ueb42ꨊ椒⧨\ue8b6\ua7f0曚○\ue4d1ꎳ抰↊\ue08c鿓幃ᵩ\udc72魌婔ᥒ\ud82b霱嘻ᔙ퐁錰只ዖ퇱郃俛໐충貫").intern();
        f14538d = (f14537c + 61) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f14537c;
        f14538d = (i5 + 119) % 128;
        f14538d = (i5 + 9) % 128;
        return InneractiveAdManager.class;
    }
}
