package q;

import android.os.Parcel;
import android.os.Parcelable;
import s1.AbstractC3989b;

/* loaded from: classes.dex */
public final class Y0 extends AbstractC3989b {
    public static final Parcelable.Creator<Y0> CREATOR = new N7.c(8);

    /* renamed from: c, reason: collision with root package name */
    public boolean f43727c;

    public Y0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f43727c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f43727c + "}";
    }

    @Override // s1.AbstractC3989b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeValue(Boolean.valueOf(this.f43727c));
    }
}
