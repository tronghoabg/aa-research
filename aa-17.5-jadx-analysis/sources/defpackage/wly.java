package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class wly implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public wly(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new TextInputLayout.SavedState(parcel, null) : new ExtendableSavedState(parcel, null) : new SideSheetBehavior.SavedState(parcel, (ClassLoader) null) : new CheckableImageButton.SavedState(parcel, null) : new MaterialButton.SavedState(parcel, null) : new AppBarLayout.BaseBehavior.SavedState(parcel, null) : new BottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? new TextInputLayout.SavedState[i] : new ExtendableSavedState[i] : new SideSheetBehavior.SavedState[i] : new CheckableImageButton.SavedState[i] : new MaterialButton.SavedState[i] : new AppBarLayout.BaseBehavior.SavedState[i] : new BottomSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i == 0) {
            return new BottomSheetBehavior.SavedState(parcel, classLoader);
        }
        if (i == 1) {
            return new AppBarLayout.BaseBehavior.SavedState(parcel, classLoader);
        }
        if (i == 2) {
            return new MaterialButton.SavedState(parcel, classLoader);
        }
        if (i == 3) {
            return new CheckableImageButton.SavedState(parcel, classLoader);
        }
        if (i != 4) {
            return i != 5 ? new TextInputLayout.SavedState(parcel, classLoader) : new ExtendableSavedState(parcel, classLoader);
        }
        return new SideSheetBehavior.SavedState(parcel, classLoader);
    }
}
