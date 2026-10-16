package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class gj extends AbsSavedState {
    public static final Parcelable.Creator<gj> CREATOR = new gi(0);

    /* renamed from: a, reason: collision with root package name */
    int f1557a;

    /* renamed from: b, reason: collision with root package name */
    boolean f1558b;

    public gj(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1557a = parcel.readInt();
        this.f1558b = parcel.readInt() != 0;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f1557a);
        parcel.writeInt(this.f1558b ? 1 : 0);
    }

    public gj(Parcelable parcelable) {
        super(parcelable);
    }
}
