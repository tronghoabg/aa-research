package n1;

import A7.AbstractC0279p0;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import f4.C2555b;

/* renamed from: n1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3573g extends View.BaseSavedState {
    public static final Parcelable.Creator<C3573g> CREATOR = new C2555b(16);

    /* renamed from: a, reason: collision with root package name */
    public int f40784a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return AbstractC0279p0.j(this.f40784a, "}", sb2);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f40784a);
    }
}
