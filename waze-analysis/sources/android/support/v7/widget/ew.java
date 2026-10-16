package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ew extends AbsSavedState {
    public static final Parcelable.Creator<ew> CREATOR = new gi(1);

    /* renamed from: a, reason: collision with root package name */
    Parcelable f1437a;

    ew(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1437a = parcel.readParcelable(classLoader == null ? en.class.getClassLoader() : classLoader);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f1437a, 0);
    }

    ew(Parcelable parcelable) {
        super(parcelable);
    }
}
