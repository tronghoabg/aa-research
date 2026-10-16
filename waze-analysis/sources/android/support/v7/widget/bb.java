package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bb extends View.BaseSavedState {
    public static final Parcelable.Creator<bb> CREATOR = new df(1);

    /* renamed from: a, reason: collision with root package name */
    boolean f1112a;

    bb(Parcel parcel) {
        super(parcel);
        this.f1112a = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f1112a ? (byte) 1 : (byte) 0);
    }
}
