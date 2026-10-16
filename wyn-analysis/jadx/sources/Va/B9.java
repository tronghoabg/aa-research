package Va;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import tv.superawesome.sdk.publisher.AwesomeAds;

/* loaded from: classes4.dex */
public final class B9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f13240c = {15, 35, -36, -8, -2, -4, 14, -18, 54, 19, -68, 13, -3, -11, 10, -3, 10, -19, 5, 66, -61, 7, -15, 69, -55, -8, -2, -4, 14, -18, 22, -17, 13, -11, -5, 2, 69, -72, 2, -8, -2, -4, 14, -18, 22, -17, 13, -11, -5, 2, 0, 0};

    /* renamed from: d, reason: collision with root package name */
    public static int f13241d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f13242e = 1;

    public static String f(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 4;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13240c[(-119025058) + i11] + 4);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 119025060) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 506182778);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13240c;
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        f13242e = (f13241d + 29) % 128;
        String strIntern = f((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 506182662, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, (byte) TextUtils.indexOf("", "", 0), (short) (TextUtils.lastIndexOf("", '0') + 1), 119025097 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern();
        int i5 = f13241d + 81;
        f13242e = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C1112q6 c1112q6 = new C1112q6(a());
        f13242e = (f13241d + 115) % 128;
        return c1112q6;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        f13242e = (f13241d + 53) % 128;
        String strIntern = f((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 506182662, 36 - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) ('0' - AndroidCharacter.getMirror('0')), (short) KeyEvent.normalizeMetaState(0), 119025059 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern();
        int i5 = f13242e + 109;
        f13241d = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = (f13242e + 23) % 128;
        f13241d = i5;
        int i10 = i5 + 117;
        f13242e = i10 % 128;
        if (i10 % 2 != 0) {
            return AwesomeAds.class;
        }
        throw null;
    }
}
