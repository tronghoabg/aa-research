package q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import f4.C2555b;

/* loaded from: classes.dex */
public final class K extends View.BaseSavedState {
    public static final Parcelable.Creator<K> CREATOR = new C2555b(17);

    /* renamed from: a, reason: collision with root package name */
    public boolean f43665a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeByte(this.f43665a ? (byte) 1 : (byte) 0);
    }
}
