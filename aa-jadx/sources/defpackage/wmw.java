package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wmw implements android.os.Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public wmw(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int i = this.a;
        if (i == 0) {
            return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(parcel, (java.lang.ClassLoader) null);
        }
        if (i == 1) {
            return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState(parcel, null);
        }
        if (i == 2) {
            return new com.google.android.material.button.MaterialButton.SavedState(parcel, null);
        }
        if (i == 3) {
            return new com.google.android.material.internal.CheckableImageButton.SavedState(parcel, null);
        }
        if (i != 4) {
            return i != 5 ? new com.google.android.material.textfield.TextInputLayout.SavedState(parcel, null) : new com.google.android.material.stateful.ExtendableSavedState(parcel, null);
        }
        return new com.google.android.material.sidesheet.SideSheetBehavior.SavedState(parcel, (java.lang.ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState[i];
        }
        if (i2 == 1) {
            return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState[i];
        }
        if (i2 == 2) {
            return new com.google.android.material.button.MaterialButton.SavedState[i];
        }
        if (i2 == 3) {
            return new com.google.android.material.internal.CheckableImageButton.SavedState[i];
        }
        if (i2 != 4) {
            return i2 != 5 ? new com.google.android.material.textfield.TextInputLayout.SavedState[i] : new com.google.android.material.stateful.ExtendableSavedState[i];
        }
        return new com.google.android.material.sidesheet.SideSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        int i = this.a;
        if (i == 0) {
            return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(parcel, classLoader);
        }
        if (i == 1) {
            return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState(parcel, classLoader);
        }
        if (i == 2) {
            return new com.google.android.material.button.MaterialButton.SavedState(parcel, classLoader);
        }
        if (i == 3) {
            return new com.google.android.material.internal.CheckableImageButton.SavedState(parcel, classLoader);
        }
        if (i != 4) {
            return i != 5 ? new com.google.android.material.textfield.TextInputLayout.SavedState(parcel, classLoader) : new com.google.android.material.stateful.ExtendableSavedState(parcel, classLoader);
        }
        return new com.google.android.material.sidesheet.SideSheetBehavior.SavedState(parcel, classLoader);
    }
}
