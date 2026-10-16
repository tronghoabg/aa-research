package ad;

import com.google.android.gms.ads.AdSize;

/* renamed from: ad.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1377w {

    /* renamed from: a, reason: collision with root package name */
    public final AdSize f17613a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17614b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17615c;

    public C1377w(AdSize adSize) {
        this.f17613a = adSize;
        this.f17614b = adSize.f26293a;
        this.f17615c = adSize.f26294b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1377w)) {
            return false;
        }
        C1377w c1377w = (C1377w) obj;
        return this.f17614b == c1377w.f17614b && this.f17615c == c1377w.f17615c;
    }

    public final int hashCode() {
        return (this.f17614b * 31) + this.f17615c;
    }
}
