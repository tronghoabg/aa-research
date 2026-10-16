package Va;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: Va.c9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0933c9 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f14067a = {-74, -1, 6, -11, 4, 11, 2, -21, 51, 37, -44, -6, -1};

    /* renamed from: b, reason: collision with root package name */
    public static int f14068b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f14069c = 1;

    public int a() {
        f14069c = (f14068b + 109) % 128;
        return 1;
    }

    public int b(C1203x8 c1203x8) {
        int i5 = f14068b + 83;
        f14069c = i5 % 128;
        if (i5 % 2 != 0) {
            return 1;
        }
        throw null;
    }

    public abstract C1139s8 c(C1203x8 c1203x8, C1214y7 c1214y7);

    public final C1139s8 d(C1203x8 c1203x8, C1214y7 c1214y7) {
        String message;
        f14069c = (f14068b + 85) % 128;
        try {
            c1203x8.i(this);
            C1139s8 c1139s8C = c(c1203x8, c1214y7);
            c1203x8.k(this);
            int i5 = f14069c + 25;
            f14068b = i5 % 128;
            if (i5 % 2 != 0) {
                int i10 = 47 / 0;
            }
            return c1139s8C;
        } catch (C1023j8 e7) {
            throw e7;
        } catch (Throwable th) {
            if (th.getMessage() == null) {
                short sKeyCodeFromString = (short) KeyEvent.keyCodeFromString("");
                int i11 = (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1));
                byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                int i12 = 438897108 - iLastIndexOf;
                byte fadingEdgeLength = (byte) (ViewConfiguration.getFadingEdgeLength() >> 16);
                synchronized (AbstractC1104pb.f14490J) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = modifierMetaStateMask == -1 ? 1 : 0;
                        if (i13 != 0) {
                            modifierMetaStateMask = (byte) (f14067a[(-1) - iLastIndexOf] + 87);
                        }
                        if (modifierMetaStateMask > 0) {
                            AbstractC1104pb.f14486F = ((i12 + modifierMetaStateMask) - 438897111) + i13;
                            AbstractC1104pb.f14487G = fadingEdgeLength;
                            char c10 = (char) (83 - i11);
                            AbstractC1104pb.f14488H = c10;
                            sb2.append(c10);
                            AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                            AbstractC1104pb.f14485E = 1;
                            while (AbstractC1104pb.f14485E < modifierMetaStateMask) {
                                byte[] bArr = f14067a;
                                int i14 = AbstractC1104pb.f14486F;
                                AbstractC1104pb.f14486F = i14 - 1;
                                char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + sKeyCodeFromString)) ^ AbstractC1104pb.f14487G));
                                AbstractC1104pb.f14488H = c11;
                                sb2.append(c11);
                                AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                                AbstractC1104pb.f14485E++;
                            }
                        }
                        message = sb2.toString().intern();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                message = th.getMessage();
            }
            throw new C1023j8(c1214y7, c1203x8, message, th);
        }
    }
}
