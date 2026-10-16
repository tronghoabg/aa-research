package Va;

import android.media.AudioTrack;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes4.dex */
public final class C9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f13257c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f13258d = 1;

    public static String f(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-8542819029722126113L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * (-8542819029722126113L)));
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        int i5 = f13258d + 1;
        f13257c = i5 % 128;
        int i10 = i5 % 2;
        String strIntern = f((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "い뢆敼긤〴逬㒠퓗鍙璩逯끋盙").intern();
        int i11 = f13257c + 115;
        f13258d = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C1098p5 c1098p5 = new C1098p5(a());
        int i5 = f13257c + 81;
        f13258d = i5 % 128;
        if (i5 % 2 != 0) {
            return c1098p5;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        int i5 = f13257c + 35;
        f13258d = i5 % 128;
        return (i5 % 2 == 0 ? f(1 % View.MeasureSpec.getMode(0), "檵噈䮉앂櫛绲ᩃ뿱즹驦뻑\udb35Ⱜ㧫퍖ҡ肤䔵矗ꀺ\ue731\ue0e2鐉춼宽౨좍椃븤ꯍ浆誣") : f(View.MeasureSpec.getMode(0) + 1, "檵噈䮉앂櫛绲ᩃ뿱즹驦뻑\udb35Ⱜ㧫퍖ҡ肤䔵矗ꀺ\ue731\ue0e2鐉춼宽౨좍椃븤ꯍ浆誣")).intern();
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = (f13258d + 111) % 128;
        f13257c = i5;
        f13258d = (i5 + 99) % 128;
        return HyBid.class;
    }
}
