package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new m(3);

    /* renamed from: a, reason: collision with root package name */
    private final int f475a;

    /* renamed from: b, reason: collision with root package name */
    private final float f476b;

    /* renamed from: c, reason: collision with root package name */
    private Object f477c;

    p(int i2, float f2) {
        this.f475a = i2;
        this.f476b = f2;
    }

    public static p a(Object obj) {
        float f2;
        p pVar = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        pVar = new p(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        pVar = new p(1, true != rating.hasHeart() ? 0.0f : 1.0f);
                        break;
                    case 2:
                        pVar = new p(2, true != rating.isThumbUp() ? 0.0f : 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float starRating = rating.getStarRating();
                        if (ratingStyle == 3) {
                            f2 = 3.0f;
                        } else if (ratingStyle == 4) {
                            f2 = 4.0f;
                        } else if (ratingStyle != 5) {
                            Log.e("Rating", "Invalid rating style (" + ratingStyle + ") for a star rating");
                            break;
                        } else {
                            f2 = 5.0f;
                        }
                        if (starRating >= 0.0f && starRating <= f2) {
                            pVar = new p(ratingStyle, starRating);
                            break;
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        }
                        break;
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= 0.0f && percentRating <= 100.0f) {
                            pVar = new p(6, percentRating);
                            break;
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        }
                        break;
                }
            }
            pVar.f477c = obj;
        }
        return pVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f475a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f475a);
        sb.append(" rating=");
        float f2 = this.f476b;
        sb.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f475a);
        parcel.writeFloat(this.f476b);
    }
}
