package N7;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import s1.AbstractC3989b;

/* loaded from: classes4.dex */
public final class d extends AbstractC3989b {
    public static final Parcelable.Creator<d> CREATOR = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public final int f8582c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8583d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8584e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8585f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8586g;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8582c = parcel.readInt();
        this.f8583d = parcel.readInt();
        this.f8584e = parcel.readInt() == 1;
        this.f8585f = parcel.readInt() == 1;
        this.f8586g = parcel.readInt() == 1;
    }

    @Override // s1.AbstractC3989b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f8582c);
        parcel.writeInt(this.f8583d);
        parcel.writeInt(this.f8584e ? 1 : 0);
        parcel.writeInt(this.f8585f ? 1 : 0);
        parcel.writeInt(this.f8586g ? 1 : 0);
    }

    public d(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f8582c = bottomSheetBehavior.L;
        this.f8583d = bottomSheetBehavior.f26822e;
        this.f8584e = bottomSheetBehavior.f26816b;
        this.f8585f = bottomSheetBehavior.f26797I;
        this.f8586g = bottomSheetBehavior.f26798J;
    }
}
