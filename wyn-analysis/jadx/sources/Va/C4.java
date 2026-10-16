package Va;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetVersion;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class C4 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static int f13250R = 0;

    /* renamed from: S, reason: collision with root package name */
    public static int f13251S = 1;

    public static String C0(Reward reward) {
        int i5 = f13250R + 69;
        f13251S = i5 % 128;
        int i10 = i5 % 2;
        String str = reward.type;
        if (i10 == 0) {
            throw null;
        }
        int i11 = f13251S + 123;
        f13250R = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static String D0(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 13418)) ^ ((c11 >>> 5) + 44509)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 6811) ^ ((c12 + i11) ^ ((c12 << 4) + 6486))));
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

    public static String X(String str, int i5) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-3978801456991283804L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * (-3978801456991283804L)));
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

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(X("ﱭ䵌ﰊ\uf442ꯨᢍ彾ꭖꪘ\ue10f\uf5fbﳦ儩俜걓֔ﾸ", AndroidCharacter.getMirror('0') - '0').intern(), new B4());
        f13250R = (f13251S + 91) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        int i5 = f13251S + 47;
        f13250R = i5 % 128;
        try {
            try {
                return (String) (i5 % 2 != 0 ? MyTargetVersion.class.getDeclaredField(X("豰楾谦⩋臆㲟腑腹\udaa9씅⯝", (-1) >>> ExpandableListView.getPackedPositionChild(1L)).intern()) : MyTargetVersion.class.getDeclaredField(X("豰楾谦⩋臆㲟腑腹\udaa9씅⯝", (-1) - ExpandableListView.getPackedPositionChild(0L)).intern())).get(null);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            C1051la c1051la = (C1051la) C0999ha.j().f14264b;
            String strIntern = D0(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, "䞩\ue69eﶾ妡ਘᠼ殶ګ상ꏇ뎡Ὠ").intern();
            c1051la.getClass();
            return C1051la.n(MyTargetVersion.class, strIntern);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0260  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C4.w0(java.lang.String):java.lang.Class");
    }
}
