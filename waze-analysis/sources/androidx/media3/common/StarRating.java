package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class StarRating extends Rating {
    private static final String FIELD_MAX_STARS = Util.intToStringMaxRadix(1);
    private static final String FIELD_STAR_RATING = Util.intToStringMaxRadix(2);
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    private final int maxStars;
    private final float starRating;

    public StarRating(int i2, float f2) {
        an.m(i2 > 0, "maxStars must be a positive integer");
        an.m(f2 >= 0.0f && f2 <= ((float) i2), "starRating is out of range [0, maxStars]");
        this.maxStars = i2;
        this.starRating = f2;
    }

    public static StarRating fromBundle(Bundle bundle) {
        an.l(bundle.getInt(FIELD_RATING_TYPE, -1) == 2);
        int i2 = bundle.getInt(FIELD_MAX_STARS, 5);
        float f2 = bundle.getFloat(FIELD_STAR_RATING, -1.0f);
        return f2 == -1.0f ? new StarRating(i2) : new StarRating(i2, f2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.maxStars == starRating.maxStars && this.starRating == starRating.starRating;
    }

    public int getMaxStars() {
        return this.maxStars;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.maxStars), Float.valueOf(this.starRating));
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.starRating != -1.0f;
    }

    @Override // androidx.media3.common.Rating
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_RATING_TYPE, 2);
        bundle.putInt(FIELD_MAX_STARS, this.maxStars);
        bundle.putFloat(FIELD_STAR_RATING, this.starRating);
        return bundle;
    }

    public StarRating(int i2) {
        an.m(i2 > 0, "maxStars must be a positive integer");
        this.maxStars = i2;
        this.starRating = -1.0f;
    }
}
