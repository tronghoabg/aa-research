package ad;

import android.content.Context;
import com.google.android.gms.ads.AdSize;

/* renamed from: ad.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1373s extends C1377w {

    /* renamed from: d, reason: collision with root package name */
    public final String f17610d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1373s(Context context, r rVar, String str, int i5) {
        AdSize adSizeK;
        if (str == null) {
            AdSize adSize = AdSize.f26288i;
            adSizeK = H6.f.k(context, i5, 0);
            adSizeK.f26296d = true;
        } else if (str.equals("portrait")) {
            AdSize adSize2 = AdSize.f26288i;
            adSizeK = H6.f.k(context, i5, 1);
            adSizeK.f26296d = true;
        } else {
            if (!str.equals("landscape")) {
                throw new IllegalArgumentException("Unexpected value for orientation: ".concat(str));
            }
            AdSize adSize3 = AdSize.f26288i;
            adSizeK = H6.f.k(context, i5, 2);
            adSizeK.f26296d = true;
        }
        super(adSizeK);
        this.f17610d = str;
    }
}
