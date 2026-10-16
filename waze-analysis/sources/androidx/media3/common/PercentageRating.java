package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PercentageRating extends Rating {
    private static final String FIELD_PERCENT = Util.intToStringMaxRadix(1);
    private static final int TYPE = 1;
    private final float percent;

    public PercentageRating(float f2) {
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 100.0f) {
            z = true;
        }
        an.m(z, "percent must be in the range of [0, 100]");
        this.percent = f2;
    }

    public static PercentageRating fromBundle(Bundle bundle) {
        an.l(bundle.getInt(FIELD_RATING_TYPE, -1) == 1);
        float f2 = bundle.getFloat(FIELD_PERCENT, -1.0f);
        return f2 == -1.0f ? new PercentageRating() : new PercentageRating(f2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof PercentageRating) && this.percent == ((PercentageRating) obj).percent;
    }

    public float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.percent));
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.percent != -1.0f;
    }

    @Override // androidx.media3.common.Rating
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_RATING_TYPE, 1);
        bundle.putFloat(FIELD_PERCENT, this.percent);
        return bundle;
    }

    public PercentageRating() {
        this.percent = -1.0f;
    }
}
