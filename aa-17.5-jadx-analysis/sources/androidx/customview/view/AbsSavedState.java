package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.mh;

/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {
    public final Parcelable d;
    public static final AbsSavedState c = new AnonymousClass1();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new mh(4);

    /* renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 extends AbsSavedState {
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.d = parcelable == c ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.d = parcelable == null ? c : parcelable;
    }

    public AbsSavedState() {
        this.d = null;
    }
}
