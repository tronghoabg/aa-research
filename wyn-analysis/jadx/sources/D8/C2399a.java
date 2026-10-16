package d8;

import N7.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import s1.AbstractC3989b;

/* renamed from: d8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2399a extends AbstractC3989b {
    public static final Parcelable.Creator<C2399a> CREATOR = new c(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f34182c;

    public C2399a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f34182c = parcel.readInt();
    }

    @Override // s1.AbstractC3989b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f34182c);
    }

    public C2399a(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f34182c = sideSheetBehavior.f26995h;
    }
}
