package ad;

import android.content.Context;
import com.google.android.gms.ads.AdSize;

/* renamed from: ad.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1375u extends C1377w {

    /* renamed from: d, reason: collision with root package name */
    public final Integer f17611d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f17612e;

    public C1375u(r rVar, Context context, int i5, Integer num, Integer num2) {
        AdSize adSizeD;
        if (num == null) {
            adSizeD = num2 != null ? AdSize.d(i5, num2.intValue()) : AdSize.b(context, i5);
        } else if (num.intValue() == 0) {
            AdSize adSize = AdSize.f26288i;
            int iP = H6.f.p(context, 1);
            adSizeD = new AdSize(i5, 0);
            if (iP == -1) {
                adSizeD = AdSize.f26292n;
            } else {
                adSizeD.f26298f = iP;
                adSizeD.f26297e = true;
            }
        } else {
            AdSize adSize2 = AdSize.f26288i;
            int iP2 = H6.f.p(context, 2);
            adSizeD = new AdSize(i5, 0);
            if (iP2 == -1) {
                adSizeD = AdSize.f26292n;
            } else {
                adSizeD.f26298f = iP2;
                adSizeD.f26297e = true;
            }
        }
        super(adSizeD);
        this.f17611d = num;
        this.f17612e = num2;
    }
}
